/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

import java.util.ArrayList;

/**
 *
 * @author jonahzukosky
 */
public class InputtedDocument {
    
    private ArrayList<Element> elements;
    
    public InputtedDocument() {
        
        elements = new ArrayList<Element>();
        
    }
    public ArrayList<Element> getElements() {
        return elements;
    }
    
    public void addElement(Element element) {
        elements.add(element);
    }
    
    
    
    
}
