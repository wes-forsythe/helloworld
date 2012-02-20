/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Noun extends Word {
    
    private String pronoun;
    private String article;
    private String description;
    
    public Noun(String word) {
        super(word);
    }
    
    public Noun(String article, String word) {
        this(word);
        this.article = article;        
    }
    
    public String Name() {
        return this.get();
    }
    
    public String ArticleName() {
        return this.article+" "+this.get();
    }
    
    public String Description() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setArticle(String article) {
        this.article = article;
    }
    
    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    @Override
    public String toString() {
        return "NOUN("+super.toString()+")";
    }
}