package Intermediate_certification_programmer.DZ2.Task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public String currentDate() {
        // Получить текущую дату
        Date date = new Date();
        // Задать формат даты
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(date);
    }
}

