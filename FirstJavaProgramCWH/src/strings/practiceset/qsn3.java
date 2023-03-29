package strings.practiceset;

public class qsn3 {
    /*
    Write a JAVA program to fill in a letter template which looks like below:
    letter = "Dear <|name|>, Thanks a lot"
    Replace <|name\> with a string (some name).
     */
    public static void main(String[] args) {
        String letter = "\"Dear <|name|>, Thanks a lot.\"";
        letter = letter.replace("<|name|>","Seemana");
        System.out.println(letter);
    }
}

