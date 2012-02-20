/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.io.*;
import java.util.*;
/**
 *
 * @author jeffj
 */
public class Scanner {
    private PrintStream out;
    private BufferedReader in;
    private String prompt = "> ";
    private String buff;

    public Scanner() {
        this.out = new PrintStream(System.out);
        this.in  = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void setOutput(OutputStream out) {
        this.out = new PrintStream(out);
    }
    
    public void setInput(InputStream in) {
        this.in = new BufferedReader(new InputStreamReader(in));
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    
    public String getBuffer() {
        return buff.toString();
    }
    
    public ArrayList<Token> scan() throws IOException {
        /*
         * @TODO allow possessives to be a part of the input
         * @TODO multi-word recognition, e.g., "pick up", "put down", should be greedy - FIX
         */
        Dictionary dict = Dictionary.INSTANCE;
        String[] words;
        Word def;
        ArrayList<Token> tokens = new ArrayList<Token>();
        
        if (prompt != null)
            out.printf(prompt);
        buff = in.readLine();
        
        // eliminate punctuation, normalize, and divide
        words = buff.replace(",.!","").toLowerCase().split("\\s+");
        
        // check all words and form dictionary entries (multi-words, e.g., "pick up")
        for(int i=0; i<words.length; ++i) {
            if ((def = dict.lookup(words[i])) != null)
                tokens.add(new Token(words[i], def.get(), def.getClass().getSimpleName()));
            else if (i+1<words.length && (def = dict.lookup(words[i], words[i+1])) != null) {
                tokens.add(new Token(words[i]+" "+words[i+1], def.get(), def.getClass().getSimpleName()));
                ++i;
            } else
                tokens.add(new Token(words[i], "", "UNKNOWN"));
        }
        
        return tokens;
    }
}