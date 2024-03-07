import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//1.
//Wczytywanie danych



        try {
            FileReader fr = new FileReader("C:\\Users\\l0852\\Downloads\\slowa.txt");
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> linie=new ArrayList<>(1000);
            String line=br.readLine();
            while(line!=null){
                linie.add(line);
                line= br.readLine();
                System.out.println(line);
            }
            System.out.println("Size "+linie.size());
            br.close();

        }catch (FileNotFoundException exc){
            System.out.println("Nie znaleziono pliku");
        }catch(IOException exc){
            System.out.println("Plik jest uzywany przez inny proces");
        }


    }

    private static ArrayList<String> WczytajDane(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> linie=new ArrayList<>(1000);
            String line=br.readLine();
            while(line!=null){
                linie.add(line);
                line= br.readLine();
            }
            br.close();
            return linie;
        }catch (FileNotFoundException exc){
            System.out.println("Nie znaleziono pliku");
        }catch(IOException exc){
            System.out.println("Plik jest uzywany przez inny proces");
        }
        return null;
    }
}