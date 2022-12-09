package StringBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SB {
    public static void main(String[] args) throws IOException {
        // declare

        // new StringBuilder() -> "" StringBuilder
        // StringBuilder sb = new StringBuilder();

        // new StringBuilder("Ritik") -> converts given string to StringBuilder
        // StringBuilder sb2 = new StringBuilder("Ritik");

        // new StringBuilder(20) -> default capacity for SB
        // StringBuilder sb3 = new StringBuilder(20);

        StringBuilder sb = new StringBuilder("I like programming and coffee");
        System.out.println(sb);

        sb.insert(18, ", gaming");
        System.out.println(sb);

        sb.replace(2, 6, "love");
        System.out.println(sb);

        System.out.println(sb.charAt(20));

        sb.delete(7, 20);
        System.out.println(sb);

        System.out.println(sb.length());

        sb.setCharAt(2, 'L');
        System.out.println(sb);

        sb.append(" and teaching");
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.insert(3, 'o');
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);


        // tell weather a string is Palindrome?
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String palinString = br.readLine();

        StringBuilder sbPalin = new StringBuilder(palinString);
        sbPalin.reverse();

        String tempString = sbPalin.toString();

        if (tempString.equals(palinString) == true) {
            System.out.println("Yes Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
