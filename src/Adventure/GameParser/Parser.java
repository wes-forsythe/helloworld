/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
/**
 *
 * @author jeffj
 */
public class Parser {
    private InputStream in = System.in;
    private PrintStream out = System.out;
    private Scanner scanner;
    
    public Parser() {
        this.scanner = new Scanner();
    }
    
    public void setInput(InputStream in) {
        this.in = in;
    }
    
    public void setOutput(PrintStream out) {
        this.out = out;
    }
    
    /*
     * @TODO allow ambiguous grammars, i.e., multiple rule matches
     */
    public Action parse() throws IOException {
        Action parse = new Action();
        ArrayList<Token> words;
        
        scanner.setInput(in);
        scanner.setOutput(out);
        
        words = scanner.scan();
        for (int i=0; i<words.size(); ++i) 
            System.out.printf("lexeme->%s, value->%s, token->%s\n", 
                words.get(i).lexeme(), words.get(i).value(), words.get(i).type());
        parse.setAction(words.get(0).value());
        
        return parse;
    }
}
