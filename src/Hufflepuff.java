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
    public static void studentComparisonHufflepuff(Hufflepuff comparison1, Hufflepuff comparison2){
        int student1 = comparison1.getIndustriousness() + comparison1.getLoyalty() + comparison1.getHonesty();
        int student2 = comparison2.getIndustriousness() + comparison2.getLoyalty() + comparison2.getHonesty();
        if(student1 > student2) {
            System.out.println(comparison1.getName() + " лучший ученик Пуффендуя, чем " + comparison2.getName());
        } else if(student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Пуффендуя, чем " + comparison1.getName());
        }

    }
}
