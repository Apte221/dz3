import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine(); //Тут я зчитую пароль
        try {
            validation(password); //Тут я прикликаю наш валідатор
            System.out.println("password is correct");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage()); //Вразі якщо пароль некоректний я вивожу це
        }
    }
    public static void validation(String password) throws Exception {
        if (password.length() <= 8) {//Тут я перевіряю чи пароль не закороткий 
            throw new Exception("password is too short");
        }
        else if (password.matches("\\d+")) {//Тут я перевіряю наявність великої букви 
            throw new Exception("paswwor must contain letters");
        }
        else if (!password.matches(".*[A-Z].*")) {//Тут я перевіряю наявність букв в цілому
            throw new Exception("paswwor must contain a large letter ");
        }
    }
//    тепер це точно не гпт 

}

