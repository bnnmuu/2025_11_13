import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch3_34 {

    public static void main(String[] args) throws IOException {
        System.out.println("輸入一個整數:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int number = Integer.parseInt(inputStr);

        System.out.println("您輸入了 " + number);
    }
}