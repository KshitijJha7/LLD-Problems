package com.lld.docseditor.strategy.codec;

import com.lld.docseditor.models.Document;

public interface CodecStrategy {
    public Document deSerialize(String data,String name); 
    public String serialize(Document document);
}
