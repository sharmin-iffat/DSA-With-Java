package String;

public class solve {
    public static boolean containsUppercase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsUppercase("hello World")); // prints: true
        System.out.println(containsUppercase("hello world")); // prints: false
    }

}
