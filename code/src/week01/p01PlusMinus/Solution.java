package week01.p01PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int totalValues = arr.size();

        int positiveValues=0 , negativeValues=0 , zeros=0 ;

        for(int i=0; i < totalValues; i++){
            if( arr.get(i) > 0)
                positiveValues++ ;
            else if ( arr.get(i) < 0 )
                negativeValues++ ;
            else
                zeros++;
        }

        double posValuesRatio = (double)positiveValues/totalValues;

        double negValuesRatio = (double)negativeValues/totalValues;

        double zerosValuesRatio = (double) zeros/totalValues;

        System.out.println(
                String.format("%.6f", posValuesRatio) + "\n" +
                        String.format("%.6f", negValuesRatio) + "\n" +
                        String.format("%.6f", zerosValuesRatio)
        );

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

