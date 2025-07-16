package string;

import java.util.Arrays;

public class DuplicateChars {

    public static char[] duplicateChars(String input){

        StringBuilder ricorrenti = new StringBuilder();
        StringBuilder visti = new StringBuilder();

        for(int i = 0; i < input.length(); i++){

            String tmp = String.valueOf(input.charAt(i));

            if(!visti.toString().contains(tmp)){
                visti.append(tmp);
            }else if(!ricorrenti.toString().contains(tmp)){
                ricorrenti.append(tmp);
            }
        }

        char[] out = ricorrenti.toString().toCharArray();
        Arrays.sort(out);

        return out;

    }

    public static void main(String[] args) {

        System.out.println("duplicateChars(\"whistleblower\") → " + Arrays.toString(duplicateChars("whistleblower")));
        System.out.println("duplicateChars(\"ss\") → " + Arrays.toString(duplicateChars("ss")));
        System.out.println("duplicateChars(\"\") → " + Arrays.toString(duplicateChars("")));

    }

}
