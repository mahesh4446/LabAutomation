package oct;

public class Lab4t {
    public static void main(String[] args) {
        int a=100;
        int b=10;
        int c=120;
        String result=(a>b&&a>c) ? "a": (b>a) ? "b": "c";
        System.out.println(result);
    }
}
