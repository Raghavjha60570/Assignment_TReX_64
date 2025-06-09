import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Distinct2Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            
            if (N < 2) {
                System.out.println(-1);
                continue;
            }
            
            int minLength = Integer.MAX_VALUE;
            boolean found = false;
            
            for (int i = 0; i < N; i++) {
                Set<Integer> distinct = new HashSet<>();
                for (int j = i; j < N; j++) {
                    distinct.add(A[j]);
                    if (distinct.size() == 2) {
                        int currentLength = j - i + 1;
                        if (currentLength < minLength) {
                            minLength = currentLength;
                        }
                        found = true;
                        break;
                    } else if (distinct.size() > 2) {
                        break;
                    }
                }
            }
            
            if (found) {
                System.out.println(minLength);
            } else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}
