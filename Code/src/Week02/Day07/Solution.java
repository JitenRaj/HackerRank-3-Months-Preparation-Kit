package Week02.Day07;

import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        int len =s.length();

        s = s.toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for(int i=0; i < len; i++){
            set.add(s.charAt(i));
        }

        if(set.size() < 27){
            return "not pangram";
        }
        else {
            return "pangram";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
