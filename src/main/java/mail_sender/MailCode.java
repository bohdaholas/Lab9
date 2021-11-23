package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        String text = "";
        File file = new File("src/main/resources/"+ filename);

        try{
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            text = sc.next();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        return text;
    }
}
