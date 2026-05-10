package com.ds;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,2,2,3,3,3, 4,};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int p=2;
        for(int i = 0; i<arr.length;i++) {
            if(map.get(arr[i])!=null) {
                map.put(arr[i], map.get(arr[i])+1);
            } else
                map.put(arr[i],1);
        }
        map.forEach((k,v)->System.out.println(k +" "+ v));
        List ls = map.entrySet()
                .stream()
                .filter(k-> k.getValue()>=p)
                .collect(Collectors.toList());

        System.out.println("--------");
        ls.forEach(System.out::println);



    }
}
