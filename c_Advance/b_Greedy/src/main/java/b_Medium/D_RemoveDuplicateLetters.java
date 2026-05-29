package b_Medium;

public class D_RemoveDuplicateLetters {
    public static void main(String[] args) {
        //Greedy approach
        String s = "cbacdcbc";
        String result = removeDuplicateLetters(s);
        System.out.println("Result after removing duplicate letters: " + result);


    }

    public static String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] visited = new boolean[26];
        char[] chars = s.toCharArray();

        // Record the last index of each character
        for (int i = 0; i < chars.length; i++) {
            lastIndex[chars[i] - 'a'] = i;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int currentCharIndex = chars[i] - 'a';

            if (visited[currentCharIndex]) continue;

            while (result.length() > 0 && chars[i] < result.charAt(result.length() - 1)
                    && lastIndex[result.charAt(result.length() - 1) - 'a'] > i) {
                visited[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }

            result.append(chars[i]);
            visited[currentCharIndex] = true;
        }

        return result.toString();
    }
}
