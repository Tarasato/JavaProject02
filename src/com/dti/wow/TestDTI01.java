package com.dti.wow;

public class TestDTI01 {
    public static void met1() {
        System.out.println("Hi...");
        //met2(); don't do this.
    }
    
    public static void main(String[] args){
        System.out.println("Hoo...");
        met1();
        met1();
        met2();

    }
    
    public static void met2() {
        System.out.println("Hey...");
        met1();
    }
}
