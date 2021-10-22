package lesson9;

public final class FinalClasses {
    private int someInt;

    public int multiplyBuSomeInt(int anotherInt){
        return anotherInt * someInt;
    }
}
//cannot extend final classes!
// class ExtendedFinalClasses extends FinalClasses{}