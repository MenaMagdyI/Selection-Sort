
package selection.sort;

import javax.naming.ldap.UnsolicitedNotification;

/**
 *
 * @author Mina
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        
        for (int lastUnSortedIndex = arr.length-1; lastUnSortedIndex>0; lastUnSortedIndex--){
            int largest = 0;
            for (int i=1;i<=lastUnSortedIndex;i++){
                if(arr[i]>arr[largest]){
                    largest = i;
                }
                
            }
            swap(arr, largest, lastUnSortedIndex);
        }
        
        
        
        
        
        
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
            
        }
    }
    
    public static void swap (int[] arr, int i, int j){
        if (i == j )
            return;
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
