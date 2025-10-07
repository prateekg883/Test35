// Q13. The Sorcerer's Spell - Reverse string using recursion
// Q13. The Sorcerer's Spell - Reverse string recursively
public class SorcerersSpell {
    public static String rev(String s) {
        if (s.length() <= 1) return s;
        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Output: " + rev(input));
    }
}