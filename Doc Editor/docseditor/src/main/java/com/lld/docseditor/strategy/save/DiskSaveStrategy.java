package com.lld.docseditor.strategy.save;
import com.lld.docseditor.models.Document;
import java.io.FileWriter;
public class DiskSaveStrategy implements SaveStrategy {
    public void save(String content) {
        try {
            FileWriter writer = new FileWriter("document.txt");
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Document saved to disk.");
    }
}
