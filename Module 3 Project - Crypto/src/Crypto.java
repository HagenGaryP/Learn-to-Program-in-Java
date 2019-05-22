public class Crypto {
    public static void main(String[]args) {
        String result = normalizeText("This is some \"really\" great. (Text)!?");
        System.out.println(encryptString(result, 2, 4));

    }
    // Part 1 - Normalize Text

    // a = a.replaceAll("\\s",""); In the context of a regex, \s will remove anything
    // that is a space character (including space, tab characters etc).

    // "[^a-zA-z ]" matches the chars NOT in range from a to z and A to Z, and replaces
    // them with an empty string, which removes everything else but alpha chars.


    public static String normalizeText(String text) {
        String normalize = text.replaceAll("[^a-zA-z ]", "")
                .replaceAll("\\s+", "").toUpperCase();
        return normalize;
    }
    // Part 2 - Caesar Cipher

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String caesarify(String text, int key) {
        String result = "";
        String shift = shiftAlphabet(key);

        int index;

        for (int i = 0; i < text.length(); i++) {
            result += shift.charAt((int) text.charAt(i)- 65);
        }
        return result;
    }

    // Part 3 - Codegroups

    public static String groupify(String text, int len) {
        String result = "";
        for (int i = 0; i < text.length(); i += len) {
            if (i + len < text.length()) {
                result += text.substring(i, i + len);
                result += " ";
            } else {
                String rest = text.substring(i);
                result += rest;
                for (int j = 0; j < len - rest.length(); j++) {
                    result += 'x';
                }
            }
        }
        return result;
    }

    // Part 4 - Putting it all together

    public static String encryptString(String text, int shift, int group) {
        String result= groupify(caesarify(normalizeText(text), shift), group);
        return result;
    }

}
