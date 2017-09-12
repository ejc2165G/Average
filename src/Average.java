/**
 *@author Eduardo Caceres
 *Date 9/11/17
 * Demostrate how to use delimiters, and make an average from another file
 * Email ejc2165@email.vccs.edu
 */

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Average {

    public static void main(String[]args) throws Exception{
        int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,sum,ave; // variables

        File file = new File("number"); // file
        Scanner input = new Scanner(file, StandardCharsets.UTF_8.name());

        input.useDelimiter(Pattern.compile(",")); // delimit with coma
        /*
        number from the other file
         */
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        num6 = input.nextInt();
        num7 = input.nextInt();
        num8 = input.nextInt();
        num9 = input.nextInt();
        num10 = input.nextInt();
        sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10; // sumation
        ave = sum / 10; // average

        System.out.print("The Average of \"" + num1 + "\" ");
        System.out.print("\"" + num2 + "\" ");
        System.out.print("\"" + num3 + "\" ");
        System.out.print("\"" + num4 + "\" ");
        System.out.print("\"" + num5 + "\" ");
        System.out.print("\"" + num6 + "\" ");
        System.out.print("\"" + num7 + "\" ");
        System.out.print("\"" + num8 + "\" ");
        System.out.print("\"" + num9 + "\" ");
        System.out.print("\"" + num10 + "\" ");

        System.out.print("is = " + ave); // result
        input.close(); //closing
    }
}
