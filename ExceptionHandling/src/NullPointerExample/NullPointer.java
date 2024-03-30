
package NullPointerExample;

import java.util.Scanner;

public class NullPointer {
    public static void main(String args[]) {
        String str = null;
        String s1 = "abc";

        //i m calling object as nullobject(that is know as unchecked Exception)
        str.concat(s1);

    }
}