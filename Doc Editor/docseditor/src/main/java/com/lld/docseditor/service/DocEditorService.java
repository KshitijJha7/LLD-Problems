package com.lld.docseditor.service;
import com.lld.docseditor.models.*;
import com.lld.docseditor.models.docElements.*;

public class DocEditorService {
    private Document doc;
    
    public void createDocument(String name){
        this.doc = new Document(name);
    }    

    public void addText(String text){
        DocumentElement textElement = new TextElement(text);
        doc.addElement(textElement);
    }

    public void addIndentedText(String text, int indentLevel){
        DocumentElement indentedTextElement = new IndentedTextElement(text, indentLevel);
        doc.addElement(indentedTextElement);
    }

    public void addImage(String imagePath){
        DocumentElement imageElement = new ImageElement(imagePath);
        doc.addElement(imageElement);
    }

    public void setDocument(Document document){
        this.doc = document;
    }
    public Document getDocument(){
        return this.doc;
    }
}
