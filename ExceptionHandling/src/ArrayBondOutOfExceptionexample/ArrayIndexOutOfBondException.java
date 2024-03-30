
package ArrayBondOutOfExceptionexample;

public class ArrayIndexOutOfBondException {
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
           //beyond the length of array
        //it is not checked during compile time it check during run time
         a[10] =90;
    }
}