package week7;

import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

    public int amountOfWords() {
        return this.translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationsList = new ArrayList<>();
        for (String key : this.translations.keySet()) {
            translationsList.add(key + " = " + this.translations.get(key));
        }
        return translationsList;
    }
}


