import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_21 {

    public static void main(String[] args) throws IOException {
        System.out.println("請問要選擇哪一條路?");
        System.out.println("請輸入整數:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int routeSelection = Integer.parseInt(inputStr);

        char routeAnswer;
        routeAnswer = (routeSelection == 1) ? 'A' : 'B';

        System.out.println("選擇了 " + routeAnswer + " 路");
    }
}