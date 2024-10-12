public class Car extends Transport{
    public String modelName;
    public int wheelsCount;

    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public Car() {}

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

    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем модель " + car.modelName + " количество колес " + car.wheelsCount);
            car.updateTyre();
            car.checkEngine();
        } else {
            System.out.println(" Это не средство передвижения");
        }


    }
}
