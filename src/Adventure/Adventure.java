/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure;

import java.io.*;
import Adventure.GameBuild.World;

import Adventure.GameEngine.*;

/**
 *
 * @author jeffj
 * 
 * @TODO extend the streams to include an output T class for enabling transcripts
 */
public class Adventure {

    public static final InputStream in = System.in;
    public static final PrintStream out = System.out;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        out.printf("%s\n", World.title);
        out.printf("%s\n", World.copyright);
        out.printf("Version %s / Release %s\n", World.version, World.release);
        out.printf("Serial %s\n\n", World.IFID);

        Engine e = Engine.INSTANCE;
        
        e.setInput(in);
        e.setOutput(out);
        
        e.Play();
        
    }
}