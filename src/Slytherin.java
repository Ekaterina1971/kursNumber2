public class Slytherin extends Hogwarts {
    private int determination;
    private int ambition;
    private int resourcefulness;

    public Slytherin(String name, String faculty, int transgression, int magicPower, int determination, int ambition, int resourcefulness) {
        super(name, faculty, transgression, magicPower);
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    @Override
    public String toString() {
        super.toString();
        return getName() + " " + getFaculty() + " расстояние трансгрессии " + getTransgression() + " сила магии " + getMagicPower() + " решительность " + getDetermination() + " амбициозность " + getAmbition() + " находчивость " + getResourcefulness();
    }
    public static void studentComparisonSlytherin(Slytherin comparison1, Slytherin comparison2){
        int student1 = comparison1.getDetermination() + comparison1.getAmbition() + comparison1.getResourcefulness();
        int student2 = comparison2.getDetermination() + comparison2.getAmbition() + comparison2.getResourcefulness();
        if(student1 > student2) {
            System.out.println(comparison1.getName() + " лучший ученик Слизерина, чем " + comparison2.getName());
        } else if(student1 < student2){
            System.out.println(comparison2.getName() + " лучший ученик Слизерина, чем " + comparison1.getName());
        }
    }
}
