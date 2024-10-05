public class Ravenclaw extends Hogwarts{
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String faculty, int transgression, int magicPower, int wisdom, int wit, int creativity){
       super(name, faculty, transgression, magicPower);
       this.wisdom = wisdom;
       this.wit = wit;
       this.creativity = creativity;
    }
    public int getWisdom(){
       return wisdom;
    }
    public int getWit(){
        return wit;
    }
    public int getCreativity(){
        return creativity;
    }
    public void setWisdom(int wisdom){
        this.wisdom = wisdom;
    }
    public void setWit(int wit){
        this.wit = wit;
    }
    public void setCreativity(int creativity){
        this.creativity = creativity;
    }
    @Override
    public String toString(){
        super.toString();
        return getName() + " " + getFaculty() + " расстояние трансгрессии " + getTransgression() + " сила магии " + getMagicPower() + " мудрость " + getWisdom() + " остроумие " + getWit() + " творчество " + getCreativity();
    }
}

