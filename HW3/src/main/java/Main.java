import hw3.working_with_exceptions.ChekInputHuman;
import hw3.working_with_exceptions.Human;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        ChekInputHuman human = new ChekInputHuman();
        human.checkDate();
        human.checkPhone();
        human.checkGender();
        Human h = new Human(human.surname, human.name, human.patronymic, human.birthday, human.phone, human.gender);

        FileWriter writer = new FileWriter(h.surname + ".txt", true);
//        writer.write(h.toString());
        writer.append(h.toString()).append("\n");
        writer.flush();

        System.out.println(h);

    }
}


//  ванов ван ваныч 11.11.1111 435468 m