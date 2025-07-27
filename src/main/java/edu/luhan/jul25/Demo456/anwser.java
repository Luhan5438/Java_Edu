package edu.luhan.jul25.Demo456;

public class anwser {

    public static void main(String[] args) {

        if (args.length!=2){
            throw new ArrayIndexOutOfBoundsException("arguments are not correct");
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            //
            double result = cal(num1,num2);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e){
            System.out.println("calculation error");
        }

    }

    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
