package com.lld.docseditor.strategy.codec;

import com.lld.docseditor.models.Document;
import com.lld.docseditor.models.docElements.*;

public class DiskCodecStrategy implements CodecStrategy {
    @Override
    public String serialize(Document document) {
        String result="";
        for(DocumentElement element : document.getElements()){
            result+=element.render()+"\n";
        }
        return result;
    }

    @Override
    public Document deSerialize(String data,String name) {
        Document doc  = new Document(name);
        String[] lines = data.split("\n");
        for(String line : lines){
            if(line.startsWith("<img src='") && line.endsWith("' />")){
                String imagePath = line.substring(10, line.length() - 4);
                ImageElement imgElement = new ImageElement(imagePath);
                doc.addElement(imgElement);
                continue;
            } else if(line.startsWith("\t")){
                // count number of tabs and create IndentedTextElement
                int indentLevel = 0;
                while(line.startsWith("\t")){
                    indentLevel++;
                    line = line.substring(1);
                }
                IndentedTextElement indentedTextElement = new IndentedTextElement(line, indentLevel);
                doc.addElement(indentedTextElement);
            }else{
                TextElement textElement = new TextElement(line);
                doc.addElement(textElement);
            }
        }
        return doc;
    }
    
}
