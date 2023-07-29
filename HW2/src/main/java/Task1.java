import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        inputNum();
    }
    public static void inputNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите дробное число \n");
        try{
            System.out.println(Float.parseFloat(scanner.next()));
//            System.out.println(scanner.next());
        }catch (RuntimeException e){
            inputNum();
        }
    }
}
