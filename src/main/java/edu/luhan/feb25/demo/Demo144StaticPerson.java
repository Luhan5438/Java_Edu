package edu.luhan.feb25.demo;

//static的意思更像是 无法外界干涉 静态
//static也不成为consttructor的参数

public class Demo144StaticPerson {

    private String name;
    private int age;


    private int id;
    private static int idCounter=0;
    //用static修饰 则所有对象可从属一个值
    static String room;

    //param constructor
    public Demo144StaticPerson(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idCounter++;
    }

    //none construtor

    public Demo144StaticPerson() {
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Demo144StaticPerson.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
