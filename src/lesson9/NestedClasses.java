package lesson9;

public class NestedClasses {
    public static class InnerClass{
        public String printInnerClass(){
            System.out.println("This is inner class");
            return "Something";
        }
    }

    public String printFromNestedClass(){
        InnerClass inner = new InnerClass();
        return inner.printInnerClass();
    }
}

class Application {
    public static void main(String[] args) {
        NestedClasses.InnerClass inner = new NestedClasses.InnerClass();
        System.out.println(inner.printInnerClass());

    }
}