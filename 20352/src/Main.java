import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static double area;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        area = Double.parseDouble(br.readLine());

        System.out.println(Math.sqrt(area / Math.PI) * 2 * Math.PI);
    }
}