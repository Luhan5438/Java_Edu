package edu.luhan.oct25;

import java.util.*;

public class demo557 {
    public static void main(String[] args) {

        //use generic for hashset

        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student("tom",22));
        set.add(new Student("jack",32));
        set.add(new Student("jerry",42));

        for (Student o : set){
            System.out.println("the hashset result is " + o);
        }


        //use generic for hashmap
        HashMap<String,Student> map = new HashMap<String,Student>();

        map.put("tom", new Student("tom",22));
        map.put("jack", new Student("jack",32));
        map.put("jerry", new Student("jerry",42));

        Set<Map.Entry<String,Student>> hm_set = map.entrySet();

        //use for
        for (Map.Entry m : hm_set){
            System.out.println("from hashmap the result is " + m);
        }

        //use iterator
        Iterator<Map.Entry<String,Student>> i = hm_set.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Student> next =  i.next();
            System.out.println("from iterator "+ next.getKey() + next.getValue());

        }


    }

    static class Student{

        public String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

}
