import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Lire le contenu du fichier hi.txt ...");
        String s = readFileMethod("./hi.txt");
        System.out.println(s);
    }


    public static String readFileMethod(String filename){
        String content = null;
        File file = new File(filename); // For example, foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return content;
    }
}