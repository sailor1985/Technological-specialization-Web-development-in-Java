package JDK.DZ2.src.server.server.repository;

public interface RepositoryView {
    void saveInLog(String text);
    String readLog();
}
