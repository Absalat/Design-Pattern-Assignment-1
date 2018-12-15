/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading.java;

/**
 *
 * @author Absis Dawit
 */
public class OverloadTest {

    void sum (int a, int b) 
    {
        System.out.println ("The sum of integer: "+(a+b));
    }
    void sum (double a, double b) 
    {
        System.out.println ("The sum of double: "+(a+b));
    }
    void sum (int a, double b) 
    {
        System.out.println ("The sum of int and double: "+(a+b));
    }
    void sum (String a, String b) 
    {
        System.out.println ("The sum of String: "+(a+b));
    }
    public static void main(String args[]) 
    {
        OverloadTest over = new OverloadTest();
        over.sum(20,35);
        over.sum(21.3,18.7);
        over.sum(17, 24.6);
        over.sum("TutorialRide", " Info");
    }
}