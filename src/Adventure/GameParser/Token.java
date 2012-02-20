/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Token {
    private String lexeme;
    private String value;
    private String type;
    
    public Token(String lexeme, String value, String type) {
        this.lexeme = lexeme;
        this.value = value;
        this.type = type;
    }
    
    public String lexeme() {
        return this.lexeme;
    }
    
    public String value() {
        return this.value;
    }
    
    public String type() {
        return this.type;
    }
    
}
