
package com.ExceptionOverloadingExample;

import java.io.IOException;
public class MethodOverloading {

        void method(Exception e){
            System.out.println(e+" caught in Exception method");
        }
        void method(ArithmeticException ae){
            System.out.println(ae+" caught in ArithmeticException method");
        }

        public static void main(String[] args) {
            MethodOverloading obj=new MethodOverloading();
            obj.method(new ArithmeticException());
            obj.method(new IOException());
        }
    }
