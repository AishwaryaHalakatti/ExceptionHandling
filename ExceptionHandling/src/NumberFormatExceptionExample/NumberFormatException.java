
package NumberFormatExceptionExample;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String args[])
    {
        String str = null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        str = scanner.next();
        scanner.close();

        int a=Integer.parseInt(str);
        System.out.println("a =" +a);
    }
}