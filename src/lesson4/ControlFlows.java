package lesson4;

public class ControlFlows {
    //branching

    public static void main(String[] args) {
        int myAge = 31;

        //simple if statement
        if(myAge > 64){
            System.out.println("retirement time");
        } else if (myAge < 7){
            System.out.println("kindergarten time");
        } else {
            System.out.println("work time");
        }
        //switch
        switch (myAge){
            case 5:
                System.out.println("5 years");
                break;
            case 31:
                System.out.println("31 years");
                break;
            default:
                System.out.println("other age");
        }
        //for each loop
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Anna";
        students[2] = "Ilze";
        students[3] = "Elza";

        for (String studentName:
             students) {
            System.out.println(studentName);
        }

        //while loop
        int i = 0;
        while (i<20){
            System.out.println("loop running " + i);
            i++;
        }

        //do while loop runns at least once
        do{
            System.out.println("do while executed once");
        }while (i<0);

        //infinite loop with break
        //we will stop the loop when break condition is > 10
        int breakCondition = 0;
        do{
            if(breakCondition > 10){
                break;
            }
            breakCondition++;
            System.out.println("breakcondition is " + breakCondition);
        }while(true);
        System.out.println("out of infinite loop");

    }
}
