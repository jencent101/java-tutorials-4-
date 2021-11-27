
package rangeclass;

public class RangeClass {
    int[] makeRange (int lower, int upper) {
        int arr[] = new int[ (upper - lower) + 1];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lower++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int theArray[];
        RangeClass theRange = new RangeClass();
        
        theArray = theRange.makeRange(1,10);
        System.out.println("The array: [");
        for (int i = 0; i < theArray.length; i++) {
            System.out.println(theArray[i] + " ");
        }
        System.out.println("]");
    }
    
}
