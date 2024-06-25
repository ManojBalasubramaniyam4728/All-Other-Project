package Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_String_in_a_word {
    public static void main(String[] args) {

        String[] a = { "dhanush" };
        String b = a[0];
        Set<Character> charSet = new LinkedHashSet<>();

        for (int i = 0; i < b.length(); i++) {
            charSet.add(b.charAt(i));
        }

        for (char ch : charSet) {
            System.out.print(ch);
        }
    }
}
