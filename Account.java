package com.company;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        this.balance=this.balance+amount;
        return getBalance();
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int debit(int amount){
        if(amount<=this.balance){
            this.balance=this.balance-amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount<=this.balance){
            debit(amount);
            another.setBalance(another.getBalance()+amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id="+this.getID()+",name="+this.getName()+",balance="+this.getBalance()+"]";
    }
}
