package collections;

import java.util.Map;

public class ValuesKeys {

    public static boolean valuesKeys(Map<String, String> map){

        for(String value : map.values()){
            for(String key : map.keySet()){
                if(value.equals(key)){
                    return true;
                }
            }
        }
        return false;

    }

}
