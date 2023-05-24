package codetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일",1);
        intMap.put("이",2);
        intMap.put("삼",3);
        intMap.put("삼",4);
        intMap.put("삼",5);

        for(String value : intMap.keySet()){
            System.out.println(value);
        }
        for(Integer value : intMap.values()){
            System.out.println(value);
        }
    }
}
