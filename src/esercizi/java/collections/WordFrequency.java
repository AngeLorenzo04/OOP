package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {


    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
    public static Map<String, Integer> wordFrequency(String filename) throws IOException {

        Map<String,Integer> dizionario = new HashMap<>();
        List<String> lines = getLines(filename);
        for(String line : lines){
            List<String> words = lineToWords(line);
            for(String word : words){
                if( dizionario.containsKey(word) ){
                    dizionario.put(word,dizionario.get(word) + 1);
                }else {
                    dizionario.put(word, 1);
                }
            }
        }
        return dizionario;
    }
}
