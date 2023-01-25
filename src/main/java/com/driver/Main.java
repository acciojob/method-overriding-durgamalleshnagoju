package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        String a = obj.meth();
        System.out.println(a);
    }
    class A{
        public A() {
        }


        public String meth(){
            return "Invoking method from class A";
        }
    }

    class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}
