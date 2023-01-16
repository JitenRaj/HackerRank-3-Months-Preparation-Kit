package week02.p08MarsExploration;

import java.io.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int numOfSOS = s.length() / 3 ;
        String SOS = "SOS";
        int countOfChanges =  0;

        for( int i=0; i < numOfSOS; i++){
            for( int j=0; j < 3; j++) {
                int k = i*3 + j;
                if(SOS.charAt(j) != s.charAt(k)){
                    countOfChanges++;
                }
            }
        }

        return countOfChanges;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

