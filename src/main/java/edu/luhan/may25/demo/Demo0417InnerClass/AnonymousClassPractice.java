package edu.luhan.may25.demo.Demo0417InnerClass;

//测试手机的闹钟功能，通过匿名内部类作为参数，打印懒猪起床了
//传入另一个匿名内部类，打印上课了

public class AnonymousClassPractice {

    public static void main(String[] args) {
        CellPhone p = new CellPhone();
        p.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("get up from bad");
            }
        });

        p.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("go to school");
            }
        });
    }

    interface Bell{
        void ring();
    }

    static class CellPhone{
        public void alarmclock(Bell bell){
           bell.ring();

        }
    }

}
