package com.lld.docseditor;
import com.lld.docseditor.service.DocEditorService;
import com.lld.docseditor.service.PersistanceService;
import com.lld.docseditor.strategy.codec.*;
import com.lld.docseditor.strategy.load.*;
import com.lld.docseditor.strategy.save.*;

public class Main {
    public static void main(String[] args) {
        DocEditorService editorService = new DocEditorService();
        editorService.createDocument("MyDocument.txt");
        PersistanceService persistanceService = new PersistanceService(new DiskLoadStrategy(),new DiskSaveStrategy(), new DiskCodecStrategy());
        // add elements to document
        editorService.addText("Hello, World!");
        editorService.addIndentedText("This is an indented text.", 2);
        editorService.addImage("/path/to/image.png");
        // save document
        persistanceService.saveDocument(editorService);
        // load edit and save again
        persistanceService.loadDocument(editorService, "MyDocument.txt");   
        editorService.addText("Additional text after loading.");
        persistanceService.saveDocument(editorService);
        
    }
}