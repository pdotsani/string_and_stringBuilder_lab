import java.util.Scanner;
public class StringPlay {

    public static void main (String args[]) {

        System.out.println("enter a string:");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
//        StringBuilder sb= new StringBuilder(s);
        // replace all occurrences of 'x' with 'y'
//        for (int i=0;i<sb.length();i++) {
//            char ch = sb.charAt(i);
//            if (ch=='x') {
//                sb.setCharAt(i,'y');
//            }
//        }
//        System.out.println(sb);
        String tmp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'x') {
                tmp = tmp + 'y';
            } else {
                tmp = tmp + c;
            }
        }
        System.out.println(tmp);

        String tmp2 = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int t = (int)(c + 1);
            if (c == 'z') {
                t = 'a';
            } else if(c == 'Z') {
                t = 'A';
            }
            tmp2 += (char)(t);
        }

        System.out.println(tmp2);

        String tmp3 = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
//            int t = (int)(c + 1);
//            if (c == 'z') {
//                t = 'a';
//            } else if(c == 'Z') {
//                t = 'A';
//            }
            int t = 'a' + ((int)(c - 'a') + 5) % 26;
            tmp3 += (char)(t);
        }

        System.out.println(tmp3);
    }
}