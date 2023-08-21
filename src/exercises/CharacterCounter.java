package exercises;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        String input = "caracteres";
        countCharacters(input);
    }

    public static void countCharacters(String input) {
       final Map<Character,Integer> charactersMap = new HashMap<>();

        for (int i = 0; i < input.length() ; i++) {
            charactersMap.put(input.charAt(i), (charactersMap.containsKey(input.charAt(i))?  charactersMap.get(input.charAt(i)) + 1 : 1));
        }

        System.out.println(charactersMap);
    }
}