import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class ch2_47 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請依序輸入5個人的分數:");
        Integer[] scores = new Integer[5];
        for (int i = 0; i < scores.length; i++) {
            String inputStr = reader.readLine();
            scores[i] = Integer.parseInt(inputStr);
        }

        Arrays.sort(scores, Collections.reverseOrder());
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第 " + (i + 1) + " 名得 " + scores[i] + " 分");
        }
    }
}