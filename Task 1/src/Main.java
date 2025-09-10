import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tВведите количество ингридиентов");
        System.out.println("Жабьи глаза:");
        int toadEyes = in.nextInt();
        System.out.println("Слёзы вурдалака:");
        int ghoulTears = in.nextInt();
        System.out.println("Кости ворона:");
        int ravenBones = in.nextInt();
        System.out.println("Пельмени:");
        int dumplings = in.nextInt();
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир
        System.out.println("Список дочступных элексиров:");
        if (toadEyes >= 3 && ravenBones >= 1) {
            System.out.println("Эликсир зоркости");
        }if (ravenBones >= 2 && dumplings >= 4) {
                System.out.println("Эликсир стойкости");
        }if (ghoulTears >= 7 && dumplings >= 1 && toadEyes >= 2) {
            System.out.println("Эликсир скрытности");
        }if (ghoulTears >= 5 && dumplings >= 10 && toadEyes >= 4 && ravenBones >= 3){
            System.out.println("Запретный эликсир");
        }
    }
}
