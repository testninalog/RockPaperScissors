package com.endava.day9;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    
    public Integer strCount(String s, char z) {
//        int count = 0;
        Map<String, Integer> map = new HashMap();

        for (char c : s.toCharArray()) {

            String cr = String.valueOf(c);
            if (map.containsKey(cr)) {
                int acc = map.get(cr);
                map.put(cr, acc + 1);
            } else {
                map.put(cr, 1);
            }

//            if(c == z){
//               // count++;
//            }

        }
        System.out.println(map);
        return map.get(String.valueOf(z));
    }
}
