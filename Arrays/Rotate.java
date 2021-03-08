package Arrays;

public class Rotate{
    static int[] rotLeft(int[] a, int d) {
        for(int i=0; i<d; i++){
            int first = a[0];
            int j;
            for(j=0; j<a.length-1; j++){
                a[j] = a[j+1];
            }
            a[j]=first;
        }
        return a;
    }

    static int[] rotRight(int[] a, int d) {
        for(int i=0; i<d; i++){
            int last = a[a.length-1];
            int j;
            for(j=a.length-1; j>=0 ; j--){
                a[j] = a[j-1];
            }
            a[0]=last;
        }
        return a;
    }
}
