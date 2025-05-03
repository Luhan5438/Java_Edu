package edu.luhan.feb25.demo;

/*
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
 */

/*思路
写一个for循环 区间为-10。8到5。9
但是循环的开始 为int 所以-10。8可以转换为int
count计数
 */

public class Demo151Math {
    public static void main(String[] args) {
        int count=0;
        double min = -10.8;
        double max = 5.9;

        for (int i = (int) min; i < max; i++) {
              int abs = Math.abs(i);
              if (abs > 6 || abs < 2.1){
                  System.out.println(i);
                  count++;
              }
        }

        System.out.println(count);

    }
}
