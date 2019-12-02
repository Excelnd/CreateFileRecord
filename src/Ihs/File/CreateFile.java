package Ihs.File;

import java.util.Formatter;

public class CreateFile {
    private Formatter ct;

    public void openFile() {
        try {
            ct = new Formatter("checkererer.txt");
        } catch (Exception e) {
            System.out.println("You got an error");
        }
    }

    public void addRecords() {
        ct.format("%s %s %s", "100 ", "ihs ", "c");
    }

    public void closeFile() {
        ct.close();
    }
}
