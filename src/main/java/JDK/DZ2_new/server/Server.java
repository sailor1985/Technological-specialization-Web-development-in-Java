package JDK.DZ2.src.server.server;

import JDK.DZ2.src.server.client.Client;
import JDK.DZ2.src.server.server.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private final Repository repository;
    private final ServerView serverView;
    List<Client> clientList;
    private boolean work;

    public Server(Repository repository) {
        this.repository = repository;
        serverView = new ServerGUI(this);
        clientList = new ArrayList<>();
    }

    public void connect() {
        if (work) {
            printText("Сервер уже был запущен");
        } else {
            work = true;
            printText("Сервер запущен!");
        }
    }

    public void disconnect() {
        if (!work){
            printText("Сервер уже был остановлен");
        } else {
            work = false;
            for (Client client: clientList){
                disconnectUser(client);
            }
            //TODO поправить удаление
            printText("Сервер остановлен!");
        }
    }

    public boolean connectUser(Client client){
        if (!work){
            return false;
        }
        clientList.add(client);
        return true;
    }

    public void disconnectUser(Client client){
        clientList.remove(client);
        if (client != null){
            client.disconnect();
        }
    }

    public String getHistory() {
        return repository.readLog();
    }

    public void sendMessage(String text){
        if (!work){
            return;
        }
        printText(text);
        answerAll(text);
        printText(text);
    }

    private void answerAll(String text){
        for (Client client: clientList){
            client.serverAnswer(text);
        }
    }

    //Мы посылаем во view какой-то текст
    private void printText(String text){
        serverView.showMessage(text);
    }

}
