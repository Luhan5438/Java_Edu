package edu.luhan.jul25.Demo454;

public class customException {
    public static void main(String[] args) {
        int age = 180;

        if (!(age > 20 && age <120)) {
            throw new AgeException("CHECK YOUR AGE");
        }
    }

    public static class AgeException extends RuntimeException{
        public AgeException(String message){
            super(message);
        }
    }
}


