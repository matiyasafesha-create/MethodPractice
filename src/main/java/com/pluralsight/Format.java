package com.pluralsight;

public class Format {
    public static void main(String[] args) {
       formatname();
        System.out.println(formatname());

    }
    public static String formatname (){
        String firstname = "bob";
        String lastname =  "smith";
        return (firstname + " " + lastname);
    }
}
