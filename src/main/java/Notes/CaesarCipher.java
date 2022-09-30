package Notes;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder str = new StringBuilder();
        char[] chars = s.toCharArray();

        for (char el : chars) {
            int i = el + k;
            if (Character.isAlphabetic(el)) {
                if (Character.isUpperCase(el) && i > 90) {
                    str.append((char) (i - 26));
                } else if (Character.isLowerCase(el) && i > 122) {
                    str.append((char) (i - 26));
                } else {
                    str.append((char) (i));
                }
            } else {
                str.append(el);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
        System.out.println(caesarCipher("Ciphering.", 26));
        System.out.println(caesarCipher("www.abc.xy", 87));
    }
}
