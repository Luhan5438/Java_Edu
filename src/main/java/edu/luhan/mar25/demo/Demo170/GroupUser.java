package edu.luhan.mar25.demo.Demo170;

import java.util.ArrayList;
import java.util.Random;

public class GroupUser extends User{
    public GroupUser() {
    }

    public GroupUser(String userName, int curr_credit) {
        super(userName, curr_credit);
    }

    //input as arraylist
    //take the number from the arraylist
    //add it back to current credit
    //remove the number from the arraylist
    //no return

    public void receive(ArrayList<Integer> List){

        //before the pack
        System.out.println("The current credit are "+ super.getCurr_credit());

        //get the pack and save it back to account
        int remains;
        int pack_id = new Random().nextInt(List.size());
        remains = super.getCurr_credit() + List.get(pack_id);
        super.setCurr_credit(remains);

        //remove that pack from array
        List.remove(pack_id);
    }
}
