package edu.luhan.mar25.demo.Demo170;

import java.util.ArrayList;

public class GroupOwner extends User{

    public GroupOwner(){

    }

    public GroupOwner(String userName, int curr_credit) {
        super(userName, curr_credit);
    }

    //send pack
    //tell if current credit<total sent
    //calculate the amount
    //put amount for each person
    //store the amount in the array

    public ArrayList<Integer> send (int total,int count){
        ArrayList<Integer> redList = new ArrayList<>();

        //before the pack
        int remains = super.getCurr_credit();

        //tell if current credit > total, then it is ok to send the pack
        if (remains < total) {
            System.out.println("Your remaining is less than redpack needs");
            return redList;
        }
        //cal the amount for each pack
        int avg = total/count;
        int mod = total%count;

        //put th2 money into array
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        // if it has mod, put the rest into the last one
        int last_pack;
        last_pack = mod+avg;
        redList.add(last_pack);

        //cal how much credit left for owner after pack
        remains=super.getCurr_credit()-total;
        System.out.println("You have "+ remains + "left");
        super.setCurr_credit(remains);

        //return the list
        return redList;
    }


}
