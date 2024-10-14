public class Car extends Transport {
    public String modelName;
    public int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount1) {
        this.wheelsCount = wheelsCount;
    }

    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем модель " + this.modelName + " количество колес " + this.wheelsCount);
            this.updateTyre();
            this.checkEngine();
        }  else{
            System.out.println(" Это не средство передвижения");
        }
    }
}


