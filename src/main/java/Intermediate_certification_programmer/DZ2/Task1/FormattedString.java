package Intermediate_certification_programmer.DZ2.Task1;

public class FormattedString {
    public String formattedString () {
        CurrentDate currentDate = new CurrentDate();
        String strDate = currentDate.currentDate();//текущая дата в необходимом формате

        Note note = new Note();
        String note1 = note.correctedNote();//введенная заметка

        // Форматировать строку для дозаписи в файл
        return strDate + " -> " + note1;
    }
}
