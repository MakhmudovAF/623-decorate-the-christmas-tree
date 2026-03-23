import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(reader.readLine());
        int countBalls = 0;

        for (int i = 1; i <= k; i++) {
            countBalls += (int) Math.pow(2, i - 1);
        }

        writer.write(String.valueOf(countBalls));

        reader.close();
        writer.close();
    }
}