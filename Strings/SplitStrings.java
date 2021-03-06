/* COMPLETED
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/

package Strings;

import java.util.*;

public class SplitStrings{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String [] split = s.split(("[ !,?._'@]+"));
        int count = 0;
        
        for(int i=0; i<split.length; i++){
            count++;
        }
        System.out.println(count);
        
        for(int i=0; i<split.length; i++){
            System.out.println(split[i]);
        }
        
        scan.close();
    }
}
