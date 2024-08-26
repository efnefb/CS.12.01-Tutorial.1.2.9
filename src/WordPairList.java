import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words){
        allPairs = new ArrayList<>();

        for (int i=0; i<words.length; i++){
            for (int j=i+1; j<words.length; j++){
                WordPair wordPair = new WordPair(words[i], words[j]);
                allPairs.add(wordPair);
            }
        }
    }

    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }

    public int numMatches(){
        int counter = 0;
        for (WordPair wordPair: this.allPairs){
            if (wordPair.getFirst().equals(wordPair.getSecond())){
                counter++;
            }
        }
        return counter;
    }
}
