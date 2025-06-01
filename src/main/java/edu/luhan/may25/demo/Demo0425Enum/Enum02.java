package edu.luhan.may25.demo.Demo0425Enum;

import jdk.swing.interop.SwingInterOpUtils;

public class Enum02 {

    public static void main(String[] args) {
        System.out.println(class02.SPRING);
    }

    // the list has to be the first line of enum class


    enum class02{
        SPRING("SPRING","WARM"),
        SUMMER("SUMMER","HOT")
        ;


        private String name;
        private String desc;

        class02(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        @Override
        public String toString() {
            return "class02{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
        }
    }
}
