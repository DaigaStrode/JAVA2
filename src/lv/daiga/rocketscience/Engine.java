package lv.daiga.rocketscience;

public class Engine {

    private String name;
    private String fuelType;
    private int engineSize;
    private double fuelConsumptions;

    public Engine() {}

    public Engine(String name, String fuelType, int engineSize, double fuelConsumptions) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.fuelConsumptions = fuelConsumptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public double getFuelConsumptions() {
        return fuelConsumptions;
    }

    public void setFuelConsumptions(double fuelConsumptions) {
        this.fuelConsumptions = fuelConsumptions;
    }
}
