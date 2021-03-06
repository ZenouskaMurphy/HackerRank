/* COMPLETED
Given a string s and two indices start and end, print a substring consisting of all characters in the inclusive range from start to end-1.
You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Sample Input
Helloworld
3 7

Sample Output
lowo
*/

package Strings;

import java.util.*;

public class Substring{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String substring = S.substring(start,end);
        System.out.println(substring);
    }
}
