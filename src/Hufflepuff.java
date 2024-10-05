public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String faculty, int transgression, int magicPower, int industriousness, int loyalty, int honesty){
        super(name, faculty, transgression, magicPower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriousness(){
        return industriousness;
    }
    public int getLoyalty(){
        return loyalty;
    }
    public int getHonesty(){
        return honesty;
    }
    public void setIndustriousness(int industriousness){
        this.industriousness = industriousness;
    }
    public void setLoyalty(int loyalty){
        this.loyalty = loyalty;
    }
    public void setHonesty(int honesty){
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        super.toString();
        return getName() + " " + getFaculty() + " расстояние трансгрессии " + getTransgression() + " сила магии " + getMagicPower() + " трудолюбие " + getIndustriousness() + " верность " + getLoyalty() + " чесность " + getHonesty();
    }
    public int summPower1(){
        return industriousness + loyalty + honesty;
    }
}
