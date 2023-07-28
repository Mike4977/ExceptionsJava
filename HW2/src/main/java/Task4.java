import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        EnterString();
    }

    public static void EnterString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку \n");
        String str = scanner.nextLine();

        if (str.equals("")) {
            throw new RuntimeException("Пустую строку вводить нельзя");
        } else {
            System.out.println(str);
        }
    }
}
