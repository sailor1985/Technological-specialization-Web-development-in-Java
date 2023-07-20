package Intermediate_certification_programmer.DZ2.Task1;
public class Main {
    public static void main(String[] args) {
        String filename = "notes.txt";
        FormattedString formattedString = new FormattedString();
        String noteToFile = formattedString.formattedString();// получили отформатированную строку для дозаписи в файл

        WriteInFile writeInFile = new WriteInFile();
        writeInFile.writeInFile(filename, noteToFile);//Записали в файл, введенную строку
    }
}
