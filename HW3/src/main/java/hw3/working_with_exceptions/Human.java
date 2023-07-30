package hw3.working_with_exceptions;

public class Human {
    public String surname;
    public String name;
    public String patronymic;
    public String birthday;
    public String phone;
    public String gender;

    public Human(String surname, String name, String patronymic, String birthday, String phone, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", surname, name, patronymic, birthday, phone, gender);
    }
}
