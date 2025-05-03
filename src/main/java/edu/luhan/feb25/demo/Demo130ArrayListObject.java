package edu.luhan.feb25.demo;

import java.util.ArrayList;

/*
自定义4个学生对象 添加到集合并且遍历
 */
public class Demo130ArrayListObject {

    public static void main(String[] args) {
        //create the arraylist for student object
        ArrayList<Demo130Student> listStudent = new ArrayList<>();

        Demo130Student one = new Demo130Student("horse",33);
        Demo130Student two= new Demo130Student("deer",33);
        Demo130Student three = new Demo130Student("cat",35);
        listStudent.add(one);
        listStudent.add(two);
        listStudent.add(three);

        //遍历变量
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i).getName());

        }

    }

}
