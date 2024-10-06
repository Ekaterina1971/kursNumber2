public class Hogwarts {
  private String name;
  private String faculty;
  private int transgression;
  private int magicPower;

  public Hogwarts(String name, String faculty, int transgression, int magicPower) {
    this.name = name;
    this.faculty = faculty;
    this.transgression = transgression;
    this.magicPower = magicPower;
  }
    public String getName(){
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFaculty(){
    return faculty;
  }
  public String setFaculty(){
    return faculty;
  }
  public int getTransgression() {
    return transgression;
  }
  public int getMagicPower(){
    return magicPower;
  }
  @Override
  public String toString(){
    return "Студент Хогвартса:" + name + " факультет" + faculty + ", расстояние трансгрессии " + transgression + ", сила магии " + magicPower;
  }
  public static void powerOfMagic(Hogwarts student1, Hogwarts student2){
    int comparison1 = student1.getMagicPower() + student1.getTransgression();
    int comparison2 = student2.getMagicPower() + student2.getTransgression();
    if (comparison1 > comparison2) {
      System.out.println(" Студент Хогвартса " + student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
    } else if(comparison1 < comparison2){
      System.out.println(" Студент Хогвартса " + student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
    }
  }


}

