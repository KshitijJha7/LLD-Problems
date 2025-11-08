package com.lld.docseditor.models;
import java.util.ArrayList;

import com.lld.docseditor.models.docElements.DocumentElement;

public class Document {
    private ArrayList<DocumentElement> elements=new ArrayList<>(); 
    String name;
    public Document(String name){
        this.name=name;
    }
    public void addElement(DocumentElement element){
        elements.add(element);
    }

    public String getName(){
        return name;
    }
    
    public ArrayList<DocumentElement> getElements(){
        return elements;
    }

}
