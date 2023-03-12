import java.io.*;
import java.util.HashMap;

public class Dictionary {
  public  HashMap<String,Words> map = new HashMap<>();


  public void loadRecords() throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("słownik.txt"));
      for(String line = br.readLine();line!=null;line= br.readLine()){
          String []parsedLine = line.split(",");
          String wordName = parsedLine[0];
          String meaning = parsedLine[1];
          Words words = new Words(wordName,meaning);
          this.map.put(wordName,words);
      }
      br.close();
  }
  public String findWord(String word){
      for(String i : map.keySet()){
          if(i.equals(word)){
              Words newWord = map.get(i);
              return newWord.getMeaning();
          }
      }
      return "brak słowa w słowniku";
  }

}
