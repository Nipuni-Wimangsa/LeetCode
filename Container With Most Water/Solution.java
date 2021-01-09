class Solution {
    public int maxArea(int[] height) {
        int pointer1 = 0;
        int pointer2 = height.length-1;
        
        int area = 0;
        int tempArea;
        
        int index = 0;
        
        while(index != -1) {
            if(height[pointer1] <= height[pointer2]) {
                tempArea = height[pointer1] * (pointer2 - pointer1);
                index = findIndex(height, pointer1 + 1, pointer2-1, height[pointer1]); //pointing to the next index
                pointer1 = index;
            }
            else {
                tempArea = height[pointer2] * (pointer2 - pointer1);
                index = findIndex(height, pointer1 + 1, pointer2-1, height[pointer2]);
                pointer2 = index;
            }  
        
            if(area < tempArea)
                area = tempArea;
        }
        
        
       return area;        
    }
    
    private int findIndex(int[] heights, int from, int to, int height) {
        for(int i = from; i <= to; i++) {
            if(heights[i] > height) {
                return i;
            }
        }
        
        return -1;
    }
}
