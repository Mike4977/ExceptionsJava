package hw3.working_with_exceptions;

import hw3.working_with_exceptions.exception.DataSizeException;

import java.util.Arrays;
import java.util.Scanner;

public class InputHuman {
    String human;
    Scanner sc = new Scanner(System.in);

    public InputHuman() throws RuntimeException{

        System.out.println("Введите через пробел фамилию, имя, отчество, дату рождения, телефон и пол \n");
        human = sc.nextLine();
        String[] arrHuman = human.split(" ");
        if (arrHuman.length < 6) {
            throw new DataSizeException("Не хватает данных");
        }
        if (arrHuman.length > 6) {
            throw new DataSizeException((" Ввели лишние данные"));
        }
    }
}
