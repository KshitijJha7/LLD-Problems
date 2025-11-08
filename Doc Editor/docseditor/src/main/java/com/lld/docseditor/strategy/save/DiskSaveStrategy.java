package com.lld.docseditor.strategy.save;
import java.io.FileWriter;
public class DiskSaveStrategy implements SaveStrategy {
    public void save(String content,String path) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Document saved to disk.");
    }
}
