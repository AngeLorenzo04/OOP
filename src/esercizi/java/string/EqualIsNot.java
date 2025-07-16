package string;

public class EqualIsNot {

    public static boolean equalIsNot(String string){

            StringBuilder sb = new StringBuilder(string);

            int conuntis = 0;
            int countnot = 0;

            for(int i = 0; i < string.length() - 2; i++){

                if(sb.substring(i,i+2).equals("is")){
                    conuntis++;
                }
                if(sb.substring(i,i+3).equals("not")){
                    countnot++;
                }

            }


        return conuntis == countnot;


    }


    public static void main(String[] args) {

        System.out.println("equalIsNot(\"is not\") → " + Boolean.toString(equalIsNot("is not")));
        System.out.println("equalIsNot(\"This is not\") → " + Boolean.toString(equalIsNot("This is not")));
        System.out.println("equalIsNot(\"This is notnot\") → " + Boolean.toString(equalIsNot("This is notnot")));
        System.out.println("equalIsNot(\"noisxxnotyynotxis\") → " + Boolean.toString(equalIsNot("noisxxnotyynotxisi")));

    }

}
