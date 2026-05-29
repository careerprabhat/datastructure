package com.ds;

import java.util.*;
import java.util.stream.Collectors;

public class D_WordCount {
    public static void main(String[] args) {
        String stringVal = "This is Prabhat, Prabhat task is to count repeating word. Prabhat " +
                "should print max word. Also prabhat should count display words which has more than " +
                "one occurrences.";
        String[] strArray= stringVal.split("[\\s \\, \\.]+");
        Arrays.stream(strArray)
                .forEach(System.out::println);
        Map<String, Integer> mapCounter = storeMapCounter(strArray);
        mapCounter
                .entrySet()
                .forEach(keyset->System.out.println("Word="+keyset.getKey() + "\t Count="+keyset.getValue()));

        Map<String,Integer> newHashMap=mapCounter.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue,newValue)-> oldValue,
                        LinkedHashMap::new));
        System.out.println("================");
        newHashMap
                .entrySet()
                .forEach(keyset->System.out.println("Word="+keyset.getKey() + "\t Count="+keyset.getValue()));
    }

    private static Map<String, Integer> storeMapCounter(String[] strArray) {
        Map<String,Integer> map = new TreeMap<>();
        for(String word:strArray) {

            map.put(word.toLowerCase(), (map.getOrDefault(word.toLowerCase(),0)+1));
        }
        return map;
    }
}
