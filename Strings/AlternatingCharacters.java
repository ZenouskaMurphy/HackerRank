/*COMPLETED
You are given a string containing characters A and B only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions
*/

package Strings;

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int deletions = 0;
        char [] array = s.toCharArray();
        
        for(int i=0; i<array.length-1; i++){
            if(array[i] == array[i +1]){
                deletions++;
            }
        }
        return deletions;
    }   
}
