/* COMPLETED
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example:
n = 7
ar = [1,2,1,2,1,3,2]


There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
*/


package Warm_Up;

public class SalesByMatch {
    static int sockMerchant(int n, int[] ar) {
        // create counter
        int [] count = new int[256]; 
        int pair = 0;
         
        for(int i=0; i<ar.length; i++){
            //count instances of each number in array
            count[ar[i]]++;
            //if count is divisable by 2, aka even numbers, this means there are a pair of socks in array
            if (count[ar[i]] % 2 == 0){
                pair++;
            }
        }
        return pair;
    }
}
