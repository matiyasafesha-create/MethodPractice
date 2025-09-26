package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
      evenandpositive();
    }
public static String evenandpositive (){
        int number =  5 ;
        int ispositive = 5 ;
        if (number % 2 == 0){
        System.out.println("Print is even"+ number);
        } else {
        System.out.println("print is odd  "+ number);
    }
        if(ispositive > 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return (number + " " +ispositive);

}
}
