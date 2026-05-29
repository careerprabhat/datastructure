package a_Basic;

/**
 * Problem: Assign Cookies
 * You have two arrays: one representing the greed factor of each child and another representing the size of each cookie.
 * Your goal is to maximize the number of children that can be satisfied with the cookies you have.
 * A child is satisfied if they receive a cookie that is greater than or equal to their greed factor.
 * Example:
 * Input: children = [1, 2, 3], cookies = [1, 1]
 * Output: 1
 * Explanation: You can assign the first cookie to the first child, satisfying one child.
 * The second cookie cannot satisfy the second or third child, so the total number of satisfied children is 1.
 * Approach:
 * 1. Sort both the children and cookies arrays.
 * 2. Use two pointers to iterate through both arrays. One pointer will track the children and the other will track the cookies.
 * 3. If the current cookie can satisfy the current child, move both pointers to the next child and the next cookie. If the cookie cannot satisfy the child, move only the cookie pointer to the next cookie.
 * 4. Keep track of the number of satisfied children and return that count at the end.
 */
public class B_AssignCookiesProblem {
    public static void main(String[] args) {
        // use greedy approach
        int[] children = {1, 2, 3};
        int[] cookies = {1, 1};
        // Sort both arrays
        java.util.Arrays.sort(children);
        java.util.Arrays.sort(cookies);
        int childIndex = 0;
        int cookieIndex = 0;
        int satisfiedChildren = 0;

        while (childIndex < children.length && cookieIndex < cookies.length) {
            if (cookies[cookieIndex] >= children[childIndex]) {
                satisfiedChildren++;
                childIndex++;
            }
            cookieIndex++;
        }

        System.out.println("Number of satisfied children: " + satisfiedChildren);
    }
}
