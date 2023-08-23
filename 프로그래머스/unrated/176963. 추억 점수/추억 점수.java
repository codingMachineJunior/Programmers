import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer =new int[photo.length];
        
        HashMap<String,Integer> map = new HashMap<>();
    
        
        for(int i = 0; i < name.length;i++){
            map.put(name[i],yearning[i]);
        }
        int i = 0;
        for(String[] ph : photo){
            for(String p : ph){
                if(map.get(p)!=null){
                    answer[i]+=map.get(p);
                }
            }   
            i++;
        }
        return answer;
    }
}