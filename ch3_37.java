import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch3_37 {

    public static void main(String[] args) throws IOException {
        System.out.println("輸入英文字母:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();

        String upperCaseStr = inputStr.toUpperCase();
        String lowerCaseStr = inputStr.toLowerCase();

        System.out.println("換成大寫為 " + upperCaseStr);
        System.out.println("換成小寫為 " + lowerCaseStr);
    }
}