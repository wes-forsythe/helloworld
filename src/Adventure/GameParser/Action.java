/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Action {
    private String subject;
    private String action;
    private String dobject;
    private String iobject;
    
    public Action() {
        
    }
    
    public String Subject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String Action() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    public String DObject() {
        return dobject;
    }
    
    public void setDObject(String dobject) {
        this.dobject = dobject;
    }
    
    public String IObject() {
        return iobject;
    }
    
    public void setIObject(String iobject) {
        this.iobject = iobject;
    }
    
    @Override
    public String toString() {
        return "ACTION(SUB("+subject+"),ACT("+action+"),dOBJ("+dobject+"),iOBJ("+iobject+"))";
    }
}