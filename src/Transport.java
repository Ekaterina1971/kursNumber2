public abstract class Transport implements ServisTransport{
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public Transport() {}


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
@Override
    public String toString(){
        return "Модель " + getModelName() + ", количество колес " + getWheelsCount();
    }
    public static void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void check(){}
}
