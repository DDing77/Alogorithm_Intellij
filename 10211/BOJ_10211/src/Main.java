import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int T, N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            dp = new int[N + 1];

            int max = Integer.MIN_VALUE;
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                dp[i] = Integer.parseInt(st.nextToken());
                dp[i] = Math.max(dp[i], dp[i - 1] + dp[i]);
                max = Math.max(max, dp[i]);
            }
            sb.append(max).append('\n');
        }
        System.out.print(sb);
    }
}
