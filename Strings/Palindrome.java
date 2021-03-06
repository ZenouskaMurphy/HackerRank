/* COMPLETED
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise.

Sample Input
madam

Sample Output
Yes
*/

package Strings;

import java.util.*;

public class Palindrome{

    public static void main(String[] args) {
        //two pointers
        //one at start and one at end
        //iterate up and down with both pointers
        //while start is less than end
        //if start and end are not the same, return yes
        //else return no
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();        
  
        int start = 0;
        int end = A.length()-1;
        while (start < end){
            if(A.charAt(start) != A.charAt(end)){
                System.out.println("no");
            }
            start++;
            end--;
        }
        System.out.println("yes");
    }
}
