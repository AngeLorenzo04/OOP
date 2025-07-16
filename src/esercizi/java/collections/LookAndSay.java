package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LookAndSay {

    public static List<Long> lookAndSay(long n){

        if(n < 1L){
            return new ArrayList<>();
        }

        List<Long> sequenza = new ArrayList<>();

        sequenza.add(1L);

        for(int i = 1; i < n ; i++){

            String prev = sequenza.get(i-1).toString();
            StringBuilder next = new StringBuilder();
            int count = 1;
            for( int j = 1; j < prev.length(); j++){
                if(prev.charAt(j) == prev.charAt(j - 1)){
                    count++;
                }else{
                    next.append(count).append(prev.charAt(j-1));
                    count = 1;
                }
            }
            next.append(count).append(prev.charAt(prev.length() - 1));
            sequenza.add(Long.parseLong(next.toString()));
        }

        return sequenza;
    }

}
