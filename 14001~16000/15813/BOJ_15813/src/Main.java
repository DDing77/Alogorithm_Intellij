import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int N;
    private String input;
    private int res;

    private void solution() throws IOException {

        N = Integer.parseInt(br.readLine());
        input = br.readLine();

        for (int i = 0; i < N; i++) {
            char ch = input.charAt(i);
            res += (ch - 'A') + 1;
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.solution();
    }
}
