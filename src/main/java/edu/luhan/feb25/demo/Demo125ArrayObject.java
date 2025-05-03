package edu.luhan.feb25.demo;

/*用数组来存储对象
* 创建person class
* 然后再实例化三个对象 用数组存储
* */

public class Demo125ArrayObject {

    public static void main(String[] args) {
        Demo125Person[] array = new Demo125Person[3];

        Demo125Person one = new Demo125Person("lulu",33);
        Demo125Person two = new Demo125Person("xixi",33);
        Demo125Person three = new Demo125Person("tuotuo",4);

        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
