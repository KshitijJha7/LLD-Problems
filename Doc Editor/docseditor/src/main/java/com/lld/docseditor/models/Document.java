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

    public String render(){
        StringBuilder sb = new StringBuilder();
        for(DocumentElement element : elements){
            sb.append(element.render());
            sb.append("\n");
        }
        return sb.toString();
    }

    public ArrayList<DocumentElement> getElements(){
        return elements;
    }

}
