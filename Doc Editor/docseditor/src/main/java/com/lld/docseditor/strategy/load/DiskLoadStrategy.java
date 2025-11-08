package com.lld.docseditor.strategy.load;
import java.io.FileReader;
public class DiskLoadStrategy implements LoadStrategy {
    @Override
    public String load(String path) {
        System.out.println("Loading document from disk at path: " + path);
        String filesContents="";
        try{
            FileReader reader = new FileReader(path);
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
            filesContents = content.toString();
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return filesContents;
    }
}
