package hbcu.stay.ready.algor;

import java.util.Iterator;
import java.util.TreeSet;

public class Solution {

    public String countUniqueWords(String input){

        //String response = "";
        TreeSet<String> tree=new TreeSet<String>();
        String[] parts = input.split("\\.| |s|!");

        for(int i =0;i<parts.length;i++){
            tree.add(parts[i]);
            System.out.println(parts[i]);
            //response += tree;

        }
        String response = ("The "+ tree.size()+" unique words are: ");

        return response + tree;
    }
}
