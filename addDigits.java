public class addDigits {
    public static void main(String[] args) {
        int num = 0; // Define num as 0
        System.out.println(addDigits(num)); // Call addDigits method
    }

    public static int addDigits(int num) {
        return (num % 9 == 0) ? (num == 0 ? 0 : 9) : num % 9;
    }
    
}
