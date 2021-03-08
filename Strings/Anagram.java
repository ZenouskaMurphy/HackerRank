/* COMPLETED
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Sample Input 0
anagram
margana

Sample Output 0
Anagrams
*/

package Strings;

import java.util.*;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        //check length of both strings 
        //if lengths != return false

        //create int array
        //iterate upwards through string a and increment counts for each char
        //iterate backwards through string b and decrement count for each char incremented prev

        //if there is anagram, count should = 0
        //else .. not anagram 

        if(a.length() != b.length()){
            return false;
        }
        
        int [] count = new int [256];
        
        a = a.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        b = b.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        for(int i=0; i<a.length(); i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        
        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
       return true;
    }
}
    
