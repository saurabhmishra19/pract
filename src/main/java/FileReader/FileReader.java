package FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class FileReader implements Callable {
    private String path;

    FileReader(String path) {
        this.path = path;
    }

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Saurabh_Mishra\\Documents\\logs\\AutomatedFunctionalTester_20180312_131730.log";
        FileReader rdr = new FileReader(path);
        rdr.readFile();
    }

    public String readFile() throws IOException {
        File logFile = new File(path);
        if (logFile.exists() && logFile.isFile()) {
            Stream<String> str = Files.lines(Paths.get(path), Charset.defaultCharset());
            str.forEachOrdered(System.out::print);
        }
        return "";
    }

    public String call() throws IOException {
        return readFile();
    }
}
