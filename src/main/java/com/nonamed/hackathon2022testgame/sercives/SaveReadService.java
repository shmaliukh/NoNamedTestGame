package com.nonamed.hackathon2022testgame.sercives;

import com.nonamed.hackathon2022testgame.GameWorldHandler;

import java.io.*;

public class SaveReadService {

    public static final String TMP_SAVE_SER = "/tmp/save.ser";

    public static void save(GameWorldHandler gameWorldHandler) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(TMP_SAVE_SER);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(gameWorldHandler);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static GameWorldHandler read() {
        GameWorldHandler read = null;
        try {
            FileInputStream fileIn = new FileInputStream("TMP_SAVE_SER");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            read = (GameWorldHandler) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception exception) {
            exception.printStackTrace();
            return new GameWorldHandler();
        }
        return read;
    }


}
