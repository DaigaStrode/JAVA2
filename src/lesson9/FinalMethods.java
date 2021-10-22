package lesson9;

public class FinalMethods {

    final int CONSTANT_PI = 3;
    private int someVar;

    //initialize final empty variable(constant) only inside constructor(all constructors (can be different values) if there are more),
    // but cannot reinitialize it later
    final int CONSTANT_NOINIT;

    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    public FinalMethods(int someVar) {
        CONSTANT_NOINIT = 7;
        this.someVar = someVar;
    }

    public final void printHello(){
        System.out.println("Hello!");
    }
}

class ExtendedFinalMethods extends FinalMethods {

    //cannot override final methods
//    @Override
//    public void printHello(){
//        System.out.println("Bye!");
//    }
}
