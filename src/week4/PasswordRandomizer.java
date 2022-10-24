package week4;
import java.util.Random;

public class PasswordRandomizer {
    private int upperBound;
    private String characters;
    private Random random;
    private String password;

    public PasswordRandomizer(int length) {
        this.upperBound = length;
        this.characters = "abcdefghijklmnopqrstuvwxyz";
        this.password = "";
        random = new Random();
    }

    public String createPassword() {
        int i = 0;
        password = "";

        while (i < this.upperBound) {
            password += characters.charAt(random.nextInt(26));
            i++;
        }
        return password;
    }
}
