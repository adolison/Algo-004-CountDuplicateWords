package hbcu.stay.ready.algor;

import java.util.*;

public class Solution {

    public String countUniqueWords(String input) {
        String view = "";


        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        String[] parts = input.split("\\.\\s|\\s|!");


        for(String words : parts) {
            if(!hMap.containsKey(words)) {
                hMap.put(words, 1);
            }
            else {
                int currentValue = hMap.get(words);
                currentValue++;
                hMap.put(words, currentValue);
            }
        }

        view += String.format("The %d unique words are:\n", hMap.size());
        int size = 0;
        for (String w : hMap.keySet()) {
            size++;
            int value = hMap.get(w);
            if (size < hMap.size()) {
                view += String.format("%s (Seen %d)\n", w, value);
            }
            else {
                view += String.format("%s (Seen %d)", w, value);
            }
        }
        /*Integer tmp = hMap.;
        map.put(a, map.get(b));
        map.put(b, tmp);*/

        hMap.remove("it");

        return view;
    }
}