package Easy.SqrtX;

public class SqrtClass {
    public static int mySqrt(int x) {
        double n = 1;
        for (; ; ) {
            double nx = (n + x / n) / 2;
            if (Math.abs(n - nx) < 1e-10) break; //точность
            n = nx;
        }
        return (int) n;
    }
}
