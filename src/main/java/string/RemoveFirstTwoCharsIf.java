package string;

public class RemoveFirstTwoCharsIf {

    public static String removeFirstTwoCharsIfCharAt(String string){

        StringBuilder sb = new StringBuilder();
        boolean removeFirst = false;
        boolean removeSecond = false;

        if(string.charAt(0)  != 'H'){
            removeFirst = true;
        }
        if(string.charAt(1)  != 'e'){
            removeSecond = true;
        }


        for (int i = 0 ; i < string.length(); i++){

            if(removeFirst && i == 0){
                i++;
            }
            if(removeSecond && i == 1){
                i++;
            }

            sb.append(string.charAt(i));
        }

        return sb.toString();

    }
    public static String removeFirstTwoCharsIfStringBuilder(String string){

       StringBuilder sb = new  StringBuilder(string);
        if(string.charAt(1) != 'e'){
            sb.delete(1,2);
        }
       if(string.charAt(0)  != 'H'){
           sb.delete(0,1);
       }

       return sb.toString();
    }



    public static void main(String[] args) {

        System.out.println("deletefirst2(\"String test\") -> " + removeFirstTwoCharsIfCharAt("String Test"));
        System.out.println("deletefirst2(\"String test\") -> " + removeFirstTwoCharsIfStringBuilder("String Test"));
        System.out.println("deletefirst2(\"Hello World!\") -> " + removeFirstTwoCharsIfCharAt("Hello World!"));
        System.out.println("deletefirst2(\"Hello World!\") -> " + removeFirstTwoCharsIfStringBuilder("Hello World!"));

    }

}
