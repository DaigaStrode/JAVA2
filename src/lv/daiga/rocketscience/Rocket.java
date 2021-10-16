package lv.daiga.rocketscience;

/**
 * Rocket class for building rocketships
 */
public class Rocket {

    private String name;
    private String colour;
    private int weight;
    private int height;
    private Engine engine;
    private static int rocketCounter;
    public String id;

    public Rocket() {
        addRocket();
    }

    /**
     * Argument constructor
     * @param name
     * @param colour
     * @param weight
     * @param height
     * @param engine
     */
    public Rocket(String name, String colour, int weight, int height, Engine engine) {
        System.out.println("Original: " + this.name);
        System.out.println("Original: " + name);
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        addRocket();
    }

    public void printRocketData(){
        System.out.println("Rocket{" +
                " " + this.name + ", " +
                " " + this.colour + ", " +
                " " + this.height + ", " +
                " " + this.weight + ", " +
                "}");
    }

    @Override
    protected void finalize(){
        System.out.println("The rocket" + this.name + " has been destroyed");
    }

    static int countRockets(){
        return rocketCounter;
    }

    static void addRocket(){
        rocketCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
