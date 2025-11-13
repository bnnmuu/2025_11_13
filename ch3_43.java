import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch3_43 {

    public static void main(String[] args) throws IOException {
        System.out.println("輸入兩個整數:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int maxAnswer = Math.max(num1, num2);

        System.out.println(num1 + " 與 " + num2 + " 中較大的是 " + maxAnswer);
    }
}