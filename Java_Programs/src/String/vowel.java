package String;

public class vowel {
    public static void main(String[] args) {
        String vol = "hello Hello HELLO heLLo";
        char[] ch = vol.toCharArray();
        for (char c : ch) {
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
                    || c == 'u') {
                continue;
            }
            System.out.print(c);
        }
        //  System.out.print("\033[H\033[2J");
    }
}