package ReadingFromFiles;

import java.io.*;

/**
 * Created by starigopula on 3/4/2018.
 */
public class FromFile {

    public static void readFromFile(String location){
        try{
            File f = new File(location);
            if(f.exists() && !f.isDirectory()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(location)));
                while (bufferedReader.readLine() != null) {
                    System.out.println(bufferedReader.readLine());
                }
                bufferedReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String location){
        try {
            File f = new File(location);
            if(f.exists() && !f.isDirectory()){
                FileWriter fileWriter = new FileWriter(location,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String s = "Hello";
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        String fileLocation = "C:\\Users\\starigopula\\Desktop\\HTTPS.txt";
        writeToFile(fileLocation);
        readFromFile(fileLocation);
    }
}
