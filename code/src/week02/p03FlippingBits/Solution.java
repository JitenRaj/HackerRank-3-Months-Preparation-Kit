package week02.problem03;

import java.io.*;
// import java.math.BigInteger;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        int num = (int)~n;

        String str = Integer.toBinaryString(num);

        return Long.parseLong(str,2);
    }

//
//     public static long flippingBits(long n) {
//     // Write your code here
//         BigInteger x = new BigInteger("4294967295");
//
//         BigInteger y = new BigInteger(String.valueOf(n));
//
//         BigInteger z = x.subtract(y);
//
//         String ans = z.toString();
//
//         return Long.parseLong(ans);
//     }
//

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

