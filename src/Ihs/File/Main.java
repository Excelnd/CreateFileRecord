package Ihs.File;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {

        CreateFile createFile = new CreateFile();

        createFile.openFile();
        createFile.addRecords();
        createFile.closeFile();

    }
}
