package lesson4;

public class Scopes {
    static final int SOME_CONSTANT = 314;

    public static void main(String[] args){
        int someNumber = SOME_CONSTANT;

        //to pass the value as an argument to a method

        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);
    }

    static int scopeVisible (int someNumber){
        boolean visibleInsideMethod = true;

        return someNumber * 2;
    }

    static int multiplyByFive(int number){
        int five = SOME_CONSTANT;

        return number * five;
    }
}
