package edu.luhan.sep25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo549 {

    public static void main(String[] args) {
        HashMap m = new HashMap<>();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith",2900);

        m.put("jack",2600);

        //给每个人加100
        Set s = m.keySet();
        for(Object obj: s) {
            m.put(obj, (Integer)m.get(obj)+100);
        }


        //遍历
        Set set = m.entrySet();
        for (Object o : set){
            Map.Entry e = (Map.Entry) o;
            System.out.println("遍历的结果是 "+ e.getKey() + e.getValue());

        }



    }
}
