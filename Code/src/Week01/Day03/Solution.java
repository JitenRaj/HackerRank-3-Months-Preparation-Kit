package Week01.Day03;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int stringLength = s.length();

        if(s.endsWith("AM")){

            if(s.startsWith("12"))
                return s.replace("12","00").
                        substring(0, stringLength-2);

            else
                return s.substring(0, stringLength -2);

        }

        else {

            if(s.startsWith("12"))
                return s.substring(0, stringLength -2);


            else {
                String str = s.substring(0, 2);
                int num = Integer.valueOf(str);
                num += 12;
                str = String.valueOf(num);

                return s.replace(s.substring(0, 2), str)
                        .substring(0, stringLength -2);
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

