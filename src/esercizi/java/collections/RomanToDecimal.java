package collections;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    private static Map<Character,Integer> inizializeRomanMap(){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return map;
    }

    public static int romanToDecimal(String s){

        Map<Character,Integer> converter = inizializeRomanMap();
        int result = 0;
        for(int i = 0; i < s.length(); i++){

            if((i < s.length() - 1) && converter.get(s.charAt(i)) < converter.get(s.charAt(i+1))){

                result -= converter.get(s.charAt(i));

            }else {
                result += converter.get(s.charAt(i));
            }
        }
        return result;

    }

}
