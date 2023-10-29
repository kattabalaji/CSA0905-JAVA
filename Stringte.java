import java.util.regex.*;

public class Stringte {
    public static void main(String[] args) {
        String text = "I Am a Java Programmer.";
        String pattern = "p(?!r)";
        
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);
        
        if (matcher.find()) {
            System.out.println("The string contains 'p'.");
        } else {
            System.out.println("The string does not contain 'p' or 'p' is.");
        }
    }
}
