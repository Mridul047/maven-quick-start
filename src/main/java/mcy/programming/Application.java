package mcy.programming;

public class Application {

    public Application() {
        System.out.println("Inside Application");
    }

    public int getStringLen(String input) {
        int stringLen = 0;

        if (input.length() > 0) {
            stringLen = input.length();
        } else
            return stringLen;

        return stringLen;
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
    }
}