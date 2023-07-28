import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        EnterFloatNumber();
    }

    public static void EnterFloatNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите дробное число \n");
//        Float num = scanner.nextFloat();
        if(!scanner.hasNextFloat()){
            System.err.println("Ввели не дробное число! Попробуйте еще раз");
//        }else {
//            Float num = scanner.nextFloat();
//            System.out.println(num);
        }
    }
}
