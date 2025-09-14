package edu.luhan.sep25;

import java.util.HashSet;
import java.util.Objects;

public class demo525 {
    public static void main(String[] args) {

        employee a = new employee("marry",15);
        employee b = new employee("tom",25);
        employee c = new employee("marry",15);

        HashSet set = new HashSet<>();

        set.add(a);
        set.add(b);
        set.add(c);

        System.out.println("hashset is " + set);


    }

    static class employee {
        private String name;
        private int age;

        public employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public employee() {
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

        @Override
        public String toString() {
            return "employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof employee)) return false;
            employee employee = (employee) o;
            return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }
    }
}
