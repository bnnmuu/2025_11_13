import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_16 {

    public static void main(String[] args) throws IOException {
        System.out.println("請輸入 a 或 b:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        char firstChar = inputStr.charAt(0);

        switch (firstChar) {
            case 'a':
                System.out.println("輸入的是 a");
                break;
            case 'b':
                System.out.println("輸入的是 b");
                break;
            default:
                System.out.println("請輸入 a 或 b");
                break;
        }
    }
}