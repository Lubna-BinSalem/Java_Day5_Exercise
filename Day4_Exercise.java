package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Day4_Exercise {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Ïnput the first number:");
        int num1= input.nextInt();

        System.out.println("input your second number:");
        int num2=input.nextInt();

        System.out.println("Enter the operation:");
        String op=input.next();
        //System.out.println(op.equals('+'));

        if(op.charAt(0)==('+')){
            System.out.println(num1+num2);
        }else if(op.charAt(0)==('-')) {
            System.out.println(num1 - num2);
        }else if(op.charAt(0)==('*')) {
            System.out.println(num1 * num2);
        }else if(op.charAt(0)==('/')) {
            System.out.println(num1/num2);
        }else if(op.charAt(0)==('%')) {
            System.out.println(num1%num2);
        }else {
            System.out.println("Wrong operation");
        }

        System.out.println("please enter either  0 for scissors, 1 for rock and 2 for paper");
        int action= input.nextInt();

        int move=(int) ((Math.random() * (3 - 1)) + 1);

        if (move == 0) {
            System.out.println("The computer picked Scissors");
        }else if(move ==1) {
            System.out.println("The computer picked Rock");
        }else if(move == 2) {
            System.out.println("The computer picked Paper");
        }

        if (move==0&&action==2){
            System.out.println("You Lose");
        }else if(move==2&&action==0) {
            System.out.println("You Win");
        }else if(move==1&&action==0){
            System.out.println("You Lose");
        }else if(move==0&&action==1) {
            System.out.println("You Win");
        }else if(move==2&&action==1) {
            System.out.println("You Lose");
        }else if(move==1&&action==2) {
            System.out.println("You Win");
        }else if(action<0||action>2){
            System.out.println("You entered a wrong number");
        }else{
            System.out.println("It's a draw");
        }

        
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);




        //end main
    }

}
