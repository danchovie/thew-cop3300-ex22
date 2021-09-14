/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int a, b, c, largest=0;
        System.out.print("Enter the first number: ");
        a = newScanner.nextInt();
        System.out.print("Enter the second number: ");
        b = newScanner.nextInt();
        System.out.print("Enter the third number: ");
        c = newScanner.nextInt();
        if(a==b||b==c||c==a){
            System.out.print("Some numbers are the same.");
            return;
        }
        if(a>b){
            if(a>c){
                largest=a;
            }
            else{
                largest=c;
            }
        }
        else if(b>a){
            if(b>c){
                largest=b;
            }
            else{
                largest=c;
            }
        }
        System.out.printf("The largest number is %d.", largest);
    }
}
