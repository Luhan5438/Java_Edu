package edu.luhan.feb25.demo;

//在刚刚创建的学生草图上 建立一个具体的人物
//很像玩游戏的时候 捏人

public class Demo100UseStudent {
    //导包-不需要 在同一个package里面
    public static void main(String[] args) {

        //以下一定要写在main里面-为什么，跟static有关 后续有解释
        //创建object lu - 从草图变成一个具体可用的例子
        Demo100Student lu = new Demo100Student();

        //赋值
        lu.name = "alice";
        lu.age = 100;

        //方法调用
        System.out.println(lu.name+lu.age);
        lu.eat();
        lu.sleep();
        lu.study();
    }


}
