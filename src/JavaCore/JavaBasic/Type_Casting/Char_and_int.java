package JavaCore.JavaBasic.Type_Casting;

public class Char_and_int {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // char to int (implicit)
        char newChar = (char) (ascii + 1); // int to char (explicit)

        System.out.println("Char: " + ch);
        System.out.println("ASCII value: " + ascii);
        System.out.println("Next char: " + newChar);
    }
}
