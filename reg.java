package laba4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class reg {
    public static void main(String[] args) {
        String str = "16 + 8";
        String [] numbers = str.split("\\+|-|\\*|/");

        int[] numbers1 = new int[numbers.length];

        for(int i = 0; i < numbers.length; i ++) {
            try {
                numbers1[i] = Integer.parseInt(numbers[i].trim());
            }catch (NumberFormatException nfe) {};
        }
        int sum = 0;
        double sum1 = 1;
        Pattern pat1 = Pattern.compile("\\+");
        Matcher mat1 = pat1.matcher(str);

        Pattern pat2 = Pattern.compile("\\-");
        Matcher mat2 = pat2.matcher(str);

        Pattern pat3 = Pattern.compile("\\*");
        Matcher mat3 = pat3.matcher(str);

        Pattern pat4 = Pattern.compile("\\/");
        Matcher mat4 = pat4.matcher(str);

        if(mat1.find()) {
            for(int i = 0; i < numbers1.length; i ++) {
                sum = sum + numbers1[i];
            }
            System.out.println(sum);
        }
        else if(mat2.find()) {
            for(int i = 0; i < numbers1.length; i ++) {
                sum = numbers1[i] - sum;
            }
            System.out.println(-sum);
        }
        else if(mat3.find()) {
            for(int i = 0; i < numbers1.length; i ++) {
                sum1 = numbers1[i] * sum1;
            }
            System.out.println(sum1);
        }
        else if(mat4.find()) {
            for (int i = 0; i < numbers1.length; i++) {
                sum1 = numbers1[i] / sum1;
            }
            System.out.println(sum1);
        }

    }
}
