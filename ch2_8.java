import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_8 {

    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int number = Integer.parseInt(inputStr);

        if (number == 1)
            System.out.println("選擇的是 1");

        System.out.println("結束處理");
    }
}