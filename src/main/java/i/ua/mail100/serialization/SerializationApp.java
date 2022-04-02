package i.ua.mail100.serialization;

import i.ua.mail100.serialization.models.DiplomacyInfo;
import i.ua.mail100.serialization.models.ResourcesInfo;
import i.ua.mail100.serialization.models.SavedGame;
import i.ua.mail100.serialization.models.TerritoriesInfo;

import java.io.*;

public class SerializationApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций, у Португалии 10 провинций, у Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, у Португалии 80 золота, у Франции 90 золота");
        DiplomacyInfo diplomacyInfo =  new DiplomacyInfo("Франция воюет с Португалией, Испания заняла позицию нейтралитета");


        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\daniloap\\Downloads\\save_game.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(savedGame);

        objectOutputStream.close();

    }
}