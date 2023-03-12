import jdk.jfr.StackTrace;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TestClass {

    public HashMap<String,Words> map = new HashMap<>();

    @Test
    public void should_load_information_from_file_toMap() throws IOException {
        Assert.assertEquals(map.size(),0);
        Dictionary dictionary = new Dictionary();
        BufferedReader br = new BufferedReader(new FileReader("słownik.txt"));
        for(String line = br.readLine();line!=null;line= br.readLine()){
            String []parsedLine = line.split(",");
            String wordName = parsedLine[0];
            String meaning = parsedLine[1];
            Words words = new Words(wordName,meaning);
            this.map.put(wordName,words);
        }
        br.close();
        Assert.assertEquals(map.size(),10);
    }



    @Test
    public void should_find_word_in_map() throws IOException {
        Dictionary dictionary = new Dictionary();
        dictionary. loadRecords();
        String word = dictionary.findWord("parlare");
        Assert.assertEquals(word,"mówić");

    }

}
