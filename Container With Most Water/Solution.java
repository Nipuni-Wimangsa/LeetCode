class Solution {
    public int maxArea(int[] height) {
        int pointer1 = 0;
        int pointer2 = height.length-1;
        int area = 0;
     
        while (pointer1 < pointer2) {
            if(height[pointer1] < height[pointer2]) {
                area = Math.max(area, height[pointer1] * (pointer2 - pointer1));
                pointer1++;
            }
            else {
                area = Math.max(area, height[pointer2] * (pointer2 - pointer1));
                pointer2--;
            }
        }
        
       return area;        
    }
}
