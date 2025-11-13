import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch3_40 {

    public static void main(String[] args) throws IOException {
        System.out.println("輸入字串:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();

        System.out.println("輸入要新增的字串:");
        String str2 = reader.readLine();

        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.append(str2);

        System.out.println("在 「" + str1 + "」 後新增 「" + str2 + "」 的話，就會變成 「" + stringBuffer + "」");
    }
}