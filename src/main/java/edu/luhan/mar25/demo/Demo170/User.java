package edu.luhan.mar25.demo.Demo170;

public abstract class User {

    private String userName;
    private int curr_credit;

    public static void show(String userName, int curr_credit){
        System.out.println("The user is "+ userName+" and credit now are "+curr_credit);
    }

    public User() {
    }

    public User(String userName, int curr_credit) {
        this.userName = userName;
        this.curr_credit = curr_credit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCurr_credit() {
        return curr_credit;
    }

    public void setCurr_credit(int curr_credit) {
        this.curr_credit = curr_credit;
    }
}
