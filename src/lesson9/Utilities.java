package lesson9;

public class Utilities {

    public static class Delete{
        public static void delete(String fileName){
            System.out.println("deleted");
        }
    }

    public static class Create{
        public static void create(String fileName){
            System.out.println("created");
        }
    }
}

class Applic{
    public static void main(String[] args) {
        Utilities.Create.create("");
        Math.random();
    }
}