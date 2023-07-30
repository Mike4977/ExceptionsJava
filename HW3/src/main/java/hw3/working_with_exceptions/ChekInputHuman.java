package hw3.working_with_exceptions;

import hw3.working_with_exceptions.exception.InputDateException;
import hw3.working_with_exceptions.exception.InputGenderException;
import hw3.working_with_exceptions.exception.InputPhoneException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ChekInputHuman {
    InputHuman inputHuman = new InputHuman();
    public String surname;
    public String name;
    public String patronymic;
    public String birthday;
    public String gender;
    public String phone;

    public ChekInputHuman() {
        String[] arrHuman = inputHuman.human.split(" ");
        surname = arrHuman[0];
        name = arrHuman[1];
        patronymic = arrHuman[2];
        birthday = arrHuman[3];
        phone = arrHuman[4];
        gender = arrHuman[5];
//        System.out.println(Arrays.toString(arrHuman));
    }

    public boolean checkDate() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(birthday, formatter);
            return true;
        }catch (Exception e) {
            throw new InputDateException();
        }
    }
    public boolean checkPhone(){
        try{
            Integer.parseInt(phone);
            return true;
        }catch (Exception e){
            throw new InputPhoneException();
        }
    }
    public boolean checkGender() {
        if (gender.equals("m") || gender.equals("f")) {
            return true;
        } else {
            throw new InputGenderException();
        }
    }
    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", surname, name, patronymic, birthday, phone, gender);
    }
}
