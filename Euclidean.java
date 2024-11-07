public class Euclidean {
    public static void main(String[] args) {
        int a=10;
        int b=35;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }}

