package JDK.DZ2.src.server;


import JDK.DZ2.src.server.client.ClientGUI;
import JDK.DZ2.src.server.server.Server;
import JDK.DZ2.src.server.server.ServerGUI;
import JDK.DZ2.src.server.server.repository.Repository;

public class Main {
    public static void main(String[] args) {

        //Создаем объект класса Repository
        Repository repository = new Repository();

        //Создаем объект класса Server
        Server server = new Server(repository);

        ServerGUI serverGUI = new ServerGUI(server);

        //К серверу подключаются клиенты через ClientGUI
        new ClientGUI(serverGUI);
        new ClientGUI(serverGUI);
    }
}
