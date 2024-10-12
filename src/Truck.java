public class Truck extends Transport{
    public String modelName;
    public int wheelsCount;

    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public Truck() {}

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount(){
        return wheelsCount;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public void setWheelsCount(int wheelsCount1){
        this.wheelsCount = wheelsCount;
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем модель " + truck.modelName + " количество колес " + truck.wheelsCount);
            truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();
        } else { System.out.println("Это не средство пердвижения");
        }
    }
}
