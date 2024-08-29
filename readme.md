# String and StringBuilder Lab

In this lab, you’ll replace items in a string, including implementing an encryption algorithm. You’ll gain experience with the String and StringBuilder class. String objects are immutable, meaning you can’t change characters within them as you can change an item in a list. If you want to change a String, you have to build a new String character-by-character with concatenation (+). StringBuilder objects are mutable, so you can change a character with “setCharAt”. StringBuilder is helpful for building strings.

Consider the following code:

```java
import java.util.Scanner;
public class StringPlay {

    public static void main (String args[]) {

        System.out.println("enter a string:");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuilder sb=new StringBuilder(s);
        // replace all occurrences of 'x' with 'y'
        for (int i=0;i<sb.length();i++) {
            char ch = sb.charAt(i);
            if (ch=='x') {
                sb.setCharAt(i,'y');
            }
        }
        System.out.println(sb);
    }
}
```

The code replaces all occurrences of 'x' in a String with 'y'. Create a new Intellij project with the code above as the Java class, then code the following:

1. Add code in the main that replaces all occurrences of ‘x’ with ‘y’, but doesn’t use StringBuilder— you’ll need to create a new String and add each item to it as you loop, then reset the original string to the new String.

2. Add code in main to "encrypt" the string by shifting all the letters in the string to the next letter. So 'a' should become 'b', 'b' should become 'c', and so on, and same for uppercase. The letter 'z' should become 'a' and 'Z' should become 'A'.

Hint: you can get the ASCII number for a char by casting, e.g.,

int x = (int) ch;

and you can recast a char to an int with:

ch = (char) x;

3. After you get (2) to work, modify the code to shift by 5 letters instead of 1.

## Analyzing the Code

1. For the “replace x with y code”, is the StringBuilder or String version more efficient? Explain your answer.


from [notion site](https://davidwolber.notion.site/String-and-StringBuilder-Lab-95e60ab7a0d741ac9e6736936f427314)