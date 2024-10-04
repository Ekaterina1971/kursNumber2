import java.util.Arrays;

public class Main {
   // public static Griffindor[] griffindors;
    public static void main(String[] args) {
        Griffindor[] griffindors = new Griffindor[3];
        griffindors[0] = new Griffindor("Гарри Потер","Гриффиндор",58,76,95,90,80);
        griffindors[1] = new Griffindor("Гермиона Грейнджер", "Гриффиндор", 44, 45, 55, 60, 65);
        griffindors[2] = new Griffindor("Рон Уизли", "Гриффиндор", 49, 48, 40, 51,55);
         for(int i =0; i < griffindors.length; i++){
         System.out.println(griffindors[i]);
         }
         bestGriffindors();

        }

    private static void bestGriffindors() {
    }

}
