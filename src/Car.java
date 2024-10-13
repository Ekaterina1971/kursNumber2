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

    public void check() {
        if (wheelsCount != 0 & wheelsCount == 4) {
            System.out.println("Обслуживаем модель " + getModelName() + " количество колес " + getWheelsCount());
        } else
            if (wheelsCount == 0) {
                System.out.println(" Это не средство передвижения");
            }
        }
    }
