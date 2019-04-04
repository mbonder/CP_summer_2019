import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) throws IOException { //throws FileNotFoundException {
        String path = "C:\\Users\\maksb\\Desktop\\Export.csv";     //String path = "myfile.txt";
        File file = new File(path);

        String cwd = System.getProperty("user.dir");

        String temp = System.getenv("TEMP");
        System.out.println(temp);
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(cwd);

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.next();
            String[] cells = line.split(",");
            System.out.println(cells[1]);
            System.out.println(line);
        }

        System.out.println(file.length());

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println(file.list());

        try {
            int[] arr = new int[2];
            arr[3] = 4;


        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());

            //nie ma tego pliku który sprawdzamy tutaj, nie wiem gdzie go dać bo nie uwazałem xd

        }

        //Exceptions - ?
    }
}