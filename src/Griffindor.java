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
        return getName() + " " + getFaculty() + " расстоние трансгрессии " + getTransgression() + " сила магии " + getMagicPower() + " благородство " + nobility + " честь " + honor + " храбрость " + bravery;
    }
    public int summPower(){
        return nobility + honor + bravery;
    }
    public void bestGriffindors(Griffindor griffindorOne, Griffindor griffindorTwo){
        if(griffindorOne.summPower() > griffindorTwo.summPower()) {
            System.out.println(griffindorOne + " лучший Гриффиндорец, чем " + griffindorTwo);
        } else if(griffindorOne.summPower() < griffindorTwo.summPower()){
                System.out.println(griffindorTwo + " лучший Гриффиндорец, чем " + griffindorOne);
            } else { System.out.println(griffindorOne + " и " + griffindorTwo + " : студенты равны");


        }
    }

}
