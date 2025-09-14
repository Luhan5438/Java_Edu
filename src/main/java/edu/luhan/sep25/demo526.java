package edu.luhan.sep25;

import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class demo526 {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet<>();

        hashSet.add(new employee("marry",25,new myDate(Year.of(1991),Month.APRIL,new Date(25))));
        hashSet.add(new employee("john",26,new myDate(Year.of(1990),Month.APRIL,new Date(25))));
        hashSet.add(new employee("marry",27,new myDate(Year.of(1991),Month.APRIL,new Date(25))));

        System.out.println("hashset is " + hashSet);


    }

    static class employee {
        private String name;
        private int age;
        myDate birthday;

        public employee(String name, int age, myDate birthday) {
            this.name = name;
            this.age = age;
            this.birthday = birthday;
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

        public myDate getBirthday() {
            return birthday;
        }

        public void setBirthday(myDate birthday) {
            this.birthday = birthday;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof employee)) return false;
            employee employee = (employee) o;
            return Objects.equals(getName(), employee.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName());
        }

        @Override
        public String toString() {
            return "employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", birthday=" + birthday +
                    '}';
        }
    }

    static class myDate{
        private Year y;
        private Month m;
        private Date d;

        public myDate(Year y, Month m, Date d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        public Year getY() {
            return y;
        }

        public void setY(Year y) {
            this.y = y;
        }

        public Month getM() {
            return m;
        }

        public void setM(Month m) {
            this.m = m;
        }

        public Date getD() {
            return d;
        }

        public void setD(Date d) {
            this.d = d;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof myDate)) return false;
            myDate myDate = (myDate) o;
            return Objects.equals(getY(), myDate.getY()) && getM() == myDate.getM() && Objects.equals(getD(), myDate.getD());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getY(), getM(), getD());
        }

        @Override
        public String toString() {
            return "myDate{" +
                    "y=" + y +
                    ", m=" + m +
                    ", d=" + d +
                    '}';
        }
    }
}
