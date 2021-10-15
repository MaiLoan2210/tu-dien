import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        Dictionary dic = new Dictionary();
        DictionaryManagement man = new DictionaryManagement();
        man.insertFromFile(dic);
        man.insertFromCommandline(dic);
        man.dictionaryExportToFile(dic);

    }


}