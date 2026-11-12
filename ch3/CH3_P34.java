import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CH3_P34 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println("您輸入的數字是：" + Integer.parseInt(line.trim()));
    }
}
