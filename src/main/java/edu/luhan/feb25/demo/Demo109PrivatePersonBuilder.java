package edu.luhan.feb25.demo;

//private 定义参数
//配套getter setter
//使得外部调用时 进行逻辑判断 不可以从类当中直接定义

public class Demo109PrivatePersonBuilder {

    String name;
    private int age;

    private boolean male;

    public void Name (){
        System.out.println(name);
    }


    public void setAge(int ageParam){
        if ( ageParam > 0 && ageParam < 100){
            age = ageParam;
            System.out.println("Age check pass");
            System.out.println("The age is "+age);
        }else {
            System.out.println("Age check not pass");
        }
    }

    public int getAge() {
        return age;
    }

    //boolean的private的getter setter
    //boolean的setter是is***

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }
}
