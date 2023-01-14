package week02.problem01;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY 'a' as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int lonelyInt = -1;
        int size = a.size();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < size; i++){
            map.put(a.get(i),0);
        }

        for(int i=0; i < size; i++){
            map.put(a.get(i), map.get(a.get(i))+1);
        }

        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {

            if( mapElement.getValue() != 2 ){
                lonelyInt = mapElement.getKey();
            }
        }

        return lonelyInt;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}