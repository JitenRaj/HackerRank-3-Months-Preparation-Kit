package week01.p05CamelCase4;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

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

            String[] words;

            if(input.substring(2).startsWith("M")) {
                words = input.substring(4, input.length() - 2)
                        .split("(?=[A-Z])");
            }

            else {
                words = input.substring(4)
                        .split("(?=[A-Z])");
            }

            ans = String.join(" ", words).toLowerCase();
        }

        else {
            String[] words = input.substring(4).split(" ");

            StringBuilder camelCase = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                if (i > 0) {
                    camelCase.append(capitalize(words[i]));
                } else {
                    camelCase.append(words[i]);
                }
            }

            if(input.substring(2).startsWith("M")) {

                ans += camelCase + "()";

            } else if(input.substring(2).startsWith("C")) {

                ans += capitalize(camelCase.toString());

            } else {
                ans += camelCase;
            }
        }

        return ans;
    }

    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase()
                + s.substring(1);
    }

}