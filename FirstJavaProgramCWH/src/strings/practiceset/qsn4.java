package strings.practiceset;

public class qsn4 {
    /*
    Write a JAVA program to detect double and triple spaces in a string.
     */
    public static void main(String[] args) {
        String detect = "Se  ema n  a";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));
    }
}
