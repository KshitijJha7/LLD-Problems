package com.lld.docseditor.strategy.save;

import com.lld.docseditor.models.Document;

public interface SaveStrategy {
    public void save(String content);   
}
