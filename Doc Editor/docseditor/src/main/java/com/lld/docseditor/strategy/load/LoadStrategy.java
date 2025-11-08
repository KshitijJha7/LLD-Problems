package com.lld.docseditor.strategy.load;

import com.lld.docseditor.models.Document;

public interface LoadStrategy {
    public String load(String path);
}
