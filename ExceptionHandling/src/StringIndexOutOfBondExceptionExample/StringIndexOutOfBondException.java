package StringIndexOutOfBondExceptionExample;

public class StringIndexOutOfBondException {
    public static void main(String args[])
    {
        String str ="hello";
        //we are printing postion number 1:e
        //we are printing postion number 12:we doest have string so String exception
        //it is not checked during compile time it will compile at runtime


        System.out.println(str.charAt(1));
        System.out.println(str.charAt(12));
        System.out.println("i am here");
    }
}