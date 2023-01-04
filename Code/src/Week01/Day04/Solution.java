package Week01.Day04;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int leastPointsRecord = 0, mostPointsRecord = 0;

        int leastPoints = scores.get(0), mostPoints = scores.get(0);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i < scores.size(); i++) {
            if(scores.get(i) < leastPoints){
                leastPointsRecord++;
                leastPoints = scores.get(i);
            }


            else if( scores.get(i) > mostPoints ) {
                mostPointsRecord++ ;
                mostPoints = scores.get(i);
            }

        }

        list.add(mostPointsRecord);
        list.add(leastPointsRecord);

        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

