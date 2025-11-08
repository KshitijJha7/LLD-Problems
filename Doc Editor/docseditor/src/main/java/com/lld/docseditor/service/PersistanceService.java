package com.lld.docseditor.service;

import com.lld.docseditor.models.Document;
import com.lld.docseditor.strategy.codec.*;
import com.lld.docseditor.strategy.save.*;
import com.lld.docseditor.strategy.load.*;

public class PersistanceService {
    
    private LoadStrategy loadStrategy;
    private SaveStrategy saveStrategy;
    private CodecStrategy codecStrategy;

    public PersistanceService(LoadStrategy loadStrategy, SaveStrategy saveStrategy, CodecStrategy codecStrategy){
        this.loadStrategy = loadStrategy;
        this.saveStrategy = saveStrategy;
        this.codecStrategy = codecStrategy;
    }
    public void saveDocument(DocEditorService editorService){
        Document doc = editorService.getDocument();
        String data = codecStrategy.serialize(doc);
        saveStrategy.save(data);
    }
    public void loadDocument(DocEditorService editorService, String path){
        // extract name from path
        String name = path.substring(path.lastIndexOf("/") + 1);
        String data = loadStrategy.load(path);
        Document doc = codecStrategy.deSerialize(data, name);
        editorService.setDocument(doc);
    }
}
