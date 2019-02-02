import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Datoteka {
    private Locale locale;
    private Scanner inputStream;
    private FileInputStream inputFile;

    public Datoteka() throws FileNotFoundException {
        this.locale=new Locale("hr","HR");
        this.inputFile=new FileInputStream("properties.config");
        this.inputStream=new Scanner(inputFile,"UTF-8").useLocale(locale);
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Scanner getInputStream() {
        return inputStream;
    }

    public void setInputStream(Scanner inputStream) {
        this.inputStream = inputStream;
    }

    public FileInputStream getInputFile() {
        return inputFile;
    }

    public void setInputFile(FileInputStream inputFile) {
        this.inputFile = inputFile;
    }
    public void printFile(){
        while (this.inputStream.hasNextLine()){
            String vrijednost1=inputStream.nextLine();
            System.out.println(vrijednost1);
        }
        this.inputStream.close();
    }
}
