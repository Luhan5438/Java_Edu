package edu.luhan.feb25.demo;


//java的封装
//找出数组当中的最大值


public class Demo108Encap {
    public static void main(String[] args) {
        int[] arrayTest = {10,20,30,250,70,100};
        int findMax= getMax(arrayTest);
        System.out.println(findMax);

    }

    //写一个方法专门遍历数组的值
    //找出最大
    //冒泡法？

    public static int getMax(int[] arrayParam){
        //默认第一个为最大
        int maxNum = arrayParam[0];

        for (int i = 1; i < arrayParam.length; i++) {
            System.out.println("Scan the "+ i + "th number");
            if ( arrayParam[i] > maxNum) {
                maxNum = arrayParam[i];
            }
        };
        return maxNum;
    }
}
