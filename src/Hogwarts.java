public abstract class Hogwarts {
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

  public Hogwarts(int transgression, int magicPower) {
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
    return name + " факультет" + faculty + ", расстояние трансгрессии " + transgression + ", сила магии " + magicPower;
  }
  public int fullMagic(){
    return magicPower + transgression;
  }

}

