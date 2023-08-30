import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map <Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
            map.put(nums[i],1);
        
        answer = map.size()>=nums.length/2 ? nums.length/2 : map.size();     
        return answer;
    }
}
