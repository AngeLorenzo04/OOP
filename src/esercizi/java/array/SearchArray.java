package array;

import java.util.Arrays;
import java.util.Objects;

public class SearchArray {

    public static boolean containsBruteForce(String[] strings, String searched){

        for(String w : strings){
            if(Objects.equals(w, searched)){
                return  true;
            }
        }

        return false;

    }
    public static boolean containsBinary(String[] strings, String searched){

        String[] copy = Arrays.copyOf(strings, strings.length);
        Arrays.sort(copy);

        return Arrays.binarySearch(copy,searched) >= 0;

    }


    public static void main(String[] args) {

            String[] arr1 = new String[]{"car","boat","bike","plane"};

            System.out.println("containsBruteForce([\"car\", \"boat\", \"bike\", \"plane\"], \"bike\") → "+ containsBruteForce(arr1,"bike"));
            System.out.println("containsBruteForce([\"car\", \"boat\", \"bike\", \"plane\"], \"helicopter\") "+ containsBruteForce(arr1,"helicopter"));
            System.out.println("containsBinary([\"car\", \"boat\", \"bike\", \"plane\"], \"bike\") → "+ containsBinary(arr1,"bike"));
            System.out.println("containsBinary([\"car\", \"boat\", \"bike\", \"plane\"], \"helicopter\") →"+ containsBinary(arr1,"helicopter"));

    }
}
