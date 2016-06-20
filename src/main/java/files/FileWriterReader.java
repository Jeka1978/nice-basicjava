package files;

import java.io.*;

/**
 * Created by Jeka on 20/06/2016.
 */
public class FileWriterReader {


    public Object readObjectFromFile(String path) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        return ois.readObject();
    }

    public void saveObject(String path, Object object) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(object);
    }

    public void writeTextToFile(String fileName, String text)  {
        File file = new File(fileName);
        if (file.exists()) {
            try(FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {

                dataOutputStream.writeUTF(text);
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("File not found");
        }
    }
}
