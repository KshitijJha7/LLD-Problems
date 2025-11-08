package com.lld.docseditor.models.docElements;

public class IndentedTextElement implements DocumentElement{
    String text;
    int indentLevel;

    public IndentedTextElement(String text, int indentLevel) {
        this.text = text;
        this.indentLevel = indentLevel;
    }

    @Override
    public String render() {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < indentLevel; i++) {
            indent.append("\t"); 
        }
        return indent.toString() + text;
    }
    
}
