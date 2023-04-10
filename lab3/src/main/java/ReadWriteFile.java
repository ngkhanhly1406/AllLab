import java.io.*;

public class ReadWriteFile {

    public void readData() {
        try {
            File file = new File("test.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeData(String str) {
        try {
            File file = new File("test.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.write("\n"); // Add a new line after the string
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadWriteFile d = new ReadWriteFile();
        d.readData();
        d.writeData("hom nay hoc java.io");
    }
}