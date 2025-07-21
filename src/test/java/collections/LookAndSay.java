package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LookAndSay {

    public static List<Long> lookAndSay(long n){

        List<Long> out = new ArrayList<>();
        if(n <= 0) return out;
        out.add(1L);
        if(n == 1) return out;
       for(int i = 1; i < n ; i++){


            String previus  = out.get(i-1).toString();
            StringBuilder next = new StringBuilder();
            int cont = 1;
            for (int j = 1; j < previus.length(); j++){
                if(previus.charAt(j) == previus.charAt(j - 1)){
                    cont++;
                }else{
                    next.append(cont).append(previus.charAt(j-1));
                    cont = 1;
                }
            }
            next.append(cont).append(previus.charAt(previus.length() - 1));
            out.add(Long.parseLong(next.toString()));

       }

        return out;
    }

}
