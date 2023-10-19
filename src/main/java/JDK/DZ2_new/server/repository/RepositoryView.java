package JDK.DZ2_new.server.repository;

public interface RepositoryView {
    void saveInLog(String text);
    String readLog();
}
