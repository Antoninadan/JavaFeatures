package i.ua.mail100.serialization;

import i.ua.mail100.serialization.models.SavedGame;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\daniloap\\Downloads\\save_game.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedGame savedGame = (SavedGame) objectInputStream.readObject();

        System.out.println(savedGame);

        objectInputStream.close();
    }
}
