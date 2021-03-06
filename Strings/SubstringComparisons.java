/* NOT COMPLETED
Given a string s, and an integer k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0
welcometojava
3

Sample Output 0
ava
wel
*/


package Strings;

public class SubstringComparisons {
    //split string into substrings of k chars , add to string array
    //sort out string array
    //assign first element to smallest
    //assign last element to largest

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String [] array = new String[s.length()-k]; 


        for(int i=0; i<s.length()-k; i++){
           array[i] = s.substring(i,i+k);
           System.out.println(array[i]);
        }
        
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i].compareTo(array[j])>0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    smallest = array[0];
                    largest = array[array.length-1];
                }
            }
        }
        return smallest + "\n" + largest;
    }
}



