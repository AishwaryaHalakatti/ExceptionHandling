
package ArithmeticExceptionExample;
import java.util.Scanner;

public class ArithmeticException {

    public static void main(String[] args) {
       int a,b;
       int quotient;

       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter 2 integer :");
       a = scanner.nextInt();
       b = scanner.nextInt();
       scanner.close();

       quotient =a/b;
        System.out.println("quotient " + quotient);
    }
}
