import java.util.Arrays;

public class Main {
    // public static Griffindor[] griffindors;
    public static void main(String[] args) {
        Griffindor[] griffindors = new Griffindor[3];
        griffindors[0] = new Griffindor("Гарри Потер", "Гриффиндор", 58, 76, 80, 85, 75);
        griffindors[1] = new Griffindor("Гермиона Грейнджер", "Гриффиндор", 44, 45, 55, 60, 65);
        griffindors[2] = new Griffindor("Рон Уизли", "Гриффиндор", 49, 48, 40, 51, 55);
        for (int i = 0; i < griffindors.length; i++) {
            System.out.println(griffindors[i]);
        }
        Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = new Hufflepuff("Захария Смит", "Пуффендуй", 35, 30, 44, 47, 45);
        hufflepuffs[1] = new Hufflepuff("Седрик Дигори", "Пуффендуй", 60, 58,56, 58, 65);
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 30, 27, 29, 31, 34);
        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.println(hufflepuffs[i]);
        }
        Slytherin[] slytherins = new Slytherin[3];
        slytherins[0] = new Slytherin("Драко Малфой", "Слизерин", 45, 55, 56,67,35);
        slytherins[1] = new Slytherin("Грэхэм Монтегю", "Слизерин", 15,23,25,19,18);
        slytherins[2] = new Slytherin("Грегори гойл", "Слизерин", 12,20,21,19,15);
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i]);
        }
        Ravenclaw[] ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = new Ravenclaw("Чжоу Чанг", "Когтевран", 23,25,23, 34, 44);
        ravenclaws[1] = new Ravenclaw("Падма Патил", "Когтевран", 30,30, 26, 22, 40);
        ravenclaws[2] = new Ravenclaw("Маркус Белби", "Когтевран", 13, 21, 22,19,18);
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i]);
        }
        Griffindor.bestGriffindors(); {
            Griffindor griffindorOne = griffindors[1];
            Griffindor griffindorTwo = griffindors[2];
        }
    }
        private static void bestGriffindors() {}

}