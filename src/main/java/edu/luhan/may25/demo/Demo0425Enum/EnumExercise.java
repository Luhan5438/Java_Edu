package edu.luhan.may25.demo.Demo0425Enum;

//define the one week from Mon to Sat
//use value to print out the string

public class EnumExercise {
    public static void main(String[] args) {
        week[] values = week.values();
        for (week w:values){
            System.out.println(w);
        }

    }

    enum week{
        MONDAY("MONDAY"),
        TUESDAY("TUESDAY"),
        WEDNESDAY("WEDNESDAY"),
        THURSDAY("THURSDAY"),
        FRIDAY("FRIDAY");

        private String name;

        //constructor
        week(String name) {
            this.name = name;
        }

        //getter

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name ;
        }
    }
}
