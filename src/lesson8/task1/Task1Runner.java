package lesson8.task1;

public class Task1Runner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.printParent();
        child.printChild();
        child.printParent();

    }
}
