package Week01.Day05;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            String inputString = input.nextLine();
            System.out.println(formatCamelCase(inputString));
        }

        input.close();
    }

    private static String formatCamelCase(String input) {

        String ans = "";


        if(input.startsWith("S")) {

            if(input.substring(2).startsWith("M")) {

                String[] words = input.substring(4, input.length()-2)
                        .split("(?=[A-Z])");
                ans = String.join(" ", words).toLowerCase();
            }

            else if(input.substring(2).startsWith("V")) {

                String[] words = input.substring(4)
                        .split("(?=[A-Z])");
                ans = String.join(" ", words).toLowerCase();

            }

            else {

                String[] words = input.substring(4)
                        .split("(?=[A-Z])");
                ans = String.join(" ", words).toLowerCase();

            }

        }

        else {
            String[] words = input.substring(4).split(" ");

            String camelCase = "";

            for (int i = 0; i < words.length; i++) {
                if (i > 0) {
                    camelCase += capitalize(words[i]);
                } else {
                    camelCase += words[i];
                }
            }

            if(input.substring(2).startsWith("M")) {

                ans += camelCase + "()";

            } else if(input.substring(2).startsWith("C")) {

                ans += capitalize(camelCase);

            } else {
                ans += camelCase;
            }
        }

        return ans;
    }

    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

}
