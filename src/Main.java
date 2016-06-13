import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Андрей on 13.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> phoneBook = new ArrayList<>();
        System.out.println("Главное меню");
        System.out.println("1 - Ввести контакт");
        System.out.println("2 - Вывести все контакты");
        System.out.println("3 - Выйти из программы");
        Scanner book = new Scanner(System.in);
        int menu = book.nextInt();

        if (menu == 1){
            Scanner dannie = new Scanner(System.in);
            System.out.println("Введите имя пользователя:");
            String name = dannie.nextLine();
            System.out.println("Введите его телефон:");
            String phone = dannie.nextLine();
            System.out.println("Введите его email:");
            String email = dannie.nextLine();
            phoneBook.add(name + " " + phone + " " + email);
            }

        if (menu == 2){
           for(int i = 0; i < phoneBook.size(); i++){
               System.out.println(phoneBook.get(i));
           }
        }
        if (menu==3){
            System.out.println("До новых встреч!");
        }
        else{
            while (menu>3){
                System.out.println("Введите пользователя");
                menu = book.nextInt();
            }
        }


    }
}
