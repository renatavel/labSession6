public class Main {
    private static int Factorial(int n){
        int result;
        if(n<=1){
            return 1;
        }
        result=Factorial(n-1)*n;
        return result;
    }
    public static void main(String[] args) {
        int result=Factorial(6);
        System.out.print(result);
    }
}