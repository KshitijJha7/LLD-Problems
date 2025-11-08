package com.lld.docseditor.models.docElements;

public class ImageElement implements DocumentElement{
    String imagePath;
    public ImageElement(String imagePath){
        this.imagePath = imagePath;
    }

    public String render(){
        return "<img src='" + imagePath + "' />";
    }

}
