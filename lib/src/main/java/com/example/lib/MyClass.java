package com.example.lib;

public class MyClass {
    public static void main(String[] avg){
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if(letter>='A' && letter<='Z'){
            letter+=32;
            System.out.println((char)(letter-32)+"=>"+letter);
        }
        else if(letter>='a' && letter<='z'){
            letter-=32;
            System.out.println((char)(letter+32)+"=>"+letter);
        }
    }
}
