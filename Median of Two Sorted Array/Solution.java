class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int index = 0;
        double output = 0;
        
        int[] murgedArray = new int[m+n];
        
        for(int i = 0; i < m+n; i++) {
            if(i < m)
                murgedArray[i] = nums1[i];
            else {
                murgedArray[i] = nums2[i-m];
            }
        }
        
        
        for(int i = 0; i < m+n-1; i++) {
            for(int j = i+1; j < m+n; j++) {
                if(murgedArray[i] > murgedArray[j]) {
                    int temp = murgedArray[i];
                    murgedArray[i] = murgedArray[j];
                    murgedArray[j] = temp;
                }
            }
        }
    
        
        
        if((m+n) % 2 == 0) {
            index = (m+n)/2;
            output = (murgedArray[index-1] + murgedArray[index]);
            output = output/2;
        }
        else {
            index = (m+n)/2;
            output = murgedArray[index];
        }       
        
    return output; 
    }
}
