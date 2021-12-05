import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Words {
    public static StringBuilder getLine(String... words){
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length == 1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordList = new ArrayList<>();

        wordList.addAll(Arrays.asList(words));
        while (wordList.remove("")){
            wordList.remove("");
        }
        while (coincide(wordList)){
            Collections.shuffle(wordList);
        }
        for (String word : wordList){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }
    public static boolean coincide(ArrayList<String> wordList){
        for (int i = 0; i < wordList.size()-1;i++){
            String firstWord = wordList.get(i).toLowerCase();
            String secondWord = wordList.get(i+1).toLowerCase();
            if (firstWord.charAt(firstWord.length()-1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
