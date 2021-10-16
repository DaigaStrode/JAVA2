package lesson7;

public class Wrapperclasses {


    public static void main(String[] args) {
        //wrapper classes are containing methods to use upon primitive types
        int simpleInt = 5;
        Integer.toString(simpleInt);
    }

    private int findMinimum(int a, int b){
        return Integer.min(a, b);
    }

}
