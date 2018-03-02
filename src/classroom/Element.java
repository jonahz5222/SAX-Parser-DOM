/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

import java.util.ArrayList;
import org.xml.sax.Attributes;

/**
 *
 * @author dale
 */
public class Element {
    
    private String name;
    private String content;
    private Attributes attributes;
    private ArrayList<Element> childElements;
    
    public Element() {
        childElements = new ArrayList<Element>();
    }
    
    
    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public ArrayList<Element> getChildElements() {
        return childElements;
    }
    
    public void addChildElement(Element child) {
        childElements.add(child);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
    
    
    
    
    
    
    
    
    
}
