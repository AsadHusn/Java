import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

class Test{
    public static void main(String args[]){
        File file = new File("asad.txt");
        try{
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Asad\n");
            writer.write("123\n");
            writer.close();
            
            char[] name = new char[20];
            FileReader reader = new FileReader(file);
            reader.read(name);
            reader.close();
            // System.out.println(name);

            String str;
            Scanner scanner = new Scanner(file);
            str = scanner.nextLine();
            System.out.println(str);
            String str2 = scanner.nextLine();
            System.out.println(str2);
            scanner.close();
            scanner = new Scanner(System.in);

        }catch(Exception e){
            System.out.println("eror");
        }
    }
}