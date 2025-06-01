package edu.luhan.may25.demo.Demo0425Enum;

public class Enum01 {
    public static void main(String[] args) {

        System.out.println(Season.AUTUMN.toString());
    }

    static class Season{
        //for enum, we have to set the constructor to private
        //enum is good for data that will not change and read only purpose
        //remove the set method for read only

        private final String name;
        private final String desc;


        private Season(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        //create the enum

        public static final Season SPRING = new Season("spring","warm");
        public static final Season SUMMER = new Season("summer","hot");
        public static final Season AUTUMN = new Season("autumn","cool");
        public static final Season WINTER = new Season("winter","cold");
    }
}
