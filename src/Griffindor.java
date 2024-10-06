public class Griffindor extends Hogwarts{
    public int nobility;
    public int honor;
    public int bravery;

    public Griffindor(String name, String faculty, int transgression, int magicPower, int nobility, int honor, int bravery){
        super(name, faculty, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility(){
        return nobility;
    }
    public int getHonor(){
        return honor;
    }
    public int getBravery(){
        return bravery;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public void setHonor(int honor){
        this.honor = honor;
    }
    public void setBravery(int bravery){
        this.bravery = bravery;
    }
    @Override
    public String toString(){
        super.toString();
        return getName() + " " + getFaculty() + " расстояние трансгрессии " + getTransgression() + " сила магии " + getMagicPower() + " благородство " + nobility + " честь " + honor + " храбрость " + bravery;
    }

    public static void studentComparisonGriffindor(Griffindor comparison1, Griffindor comparison2){
        int student1 = comparison1.getNobility() + comparison1.getHonor() + comparison1.getBravery();
        int student2 = comparison2.getNobility() + comparison2.getHonor() + comparison2.getBravery();
        if (student1 > student2) {
            System.out.println(comparison1.getName() + " лучший ученик Гриффиндора, чем " + comparison2.getName());
        } else if(student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Гриффиндора, чем " + comparison1.getName());
        }

    }

}


