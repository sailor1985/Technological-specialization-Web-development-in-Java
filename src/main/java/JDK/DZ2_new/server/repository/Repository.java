package JDK.DZ2_new.server.repository;

import java.io.FileReader;
import java.io.FileWriter;

public class Repository implements RepositoryView {

    public static final String LOG_PATH = "C:\\Users\\Клен-М\\IdeaProjects\\TechnologySpecializationJava\\src\\main\\java\\JDK\\DZ2\\src\\server\\server\\log.txt";

    public void saveInLog(String text){
        try (FileWriter writer = new FileWriter(LOG_PATH, true)){
            writer.write(text);
            writer.write("\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String readLog(){
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(LOG_PATH)){
            int c;
            while ((c = reader.read()) != -1){
                stringBuilder.append((char) c);
            }
            stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length());
            return stringBuilder.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
