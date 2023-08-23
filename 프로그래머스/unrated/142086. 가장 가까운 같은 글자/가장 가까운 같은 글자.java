import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
         
        Map<Integer,Character> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            map.put(i,s.charAt(i));
        }
        map.forEach((v,i)->{
            for(int j = v-1; j >=0; j--){
                if(i == s.charAt(j)){
                    answer[v]=v-j;
                    break;
                }
                
            }
            System.out.println();
            if(answer[v]==0)answer[v]=-1;
            
        });
    
        
        
        return answer;
    }
}