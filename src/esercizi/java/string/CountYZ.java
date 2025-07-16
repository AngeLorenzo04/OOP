package string;

public class CountYZ {

    public static int countYZ(String string){

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < string.length(); i++){

            sb.append(string.charAt(i));

            if(string.charAt(i) == ' ' || i == string.length() - 1){

                if(sb.toString().endsWith("z") ||  sb.toString().endsWith("y")){
                    count++;
                }
                
            }
            


        }

        if(sb.toString().endsWith("z") ||  sb.toString().endsWith("y")){
            count++;
        }

        return count;

    }

    public static void main(String[] args) {

        System.out.println("countYZ(\"fez day\") -> " + Integer.toString(countYZ("fez day")));
        System.out.println("countYZ(\"day fez\") -> " + Integer.toString(countYZ("day fez")));
        System.out.println("countYZ(\"day fyyyz\") -> " + Integer.toString(countYZ("day fyyyz")));

    }

}

