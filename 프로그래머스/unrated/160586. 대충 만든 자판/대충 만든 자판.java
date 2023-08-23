import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        
        Map <Character,Integer> map = new HashMap<>();
        Map <Integer,String> map2 = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++)
        {
            for(int j = 0; j < keymap[i].length(); j++){
                map.put(keymap[i].charAt(j),j);
            }
        }
        
        
        for(int i = 0; i < keymap.length; i++)
        {
            for(int j = 0; j < keymap[i].length(); j++){
                if(map.get(keymap[i].charAt(j))>j){
                    map.put(keymap[i].charAt(j),j);
                }
            }
        }
        map.forEach((key,value)->{
           System.out.println(key+" "+value); 
        });
        for(int i = 0; i < targets.length;i++){
            answer[i]=0;
            for(int j = 0; j < targets[i].length();j++){
                if(map.get(targets[i].charAt(j))!=null){
                    answer[i]+=map.get(targets[i].charAt(j))+1;
                }else{
                    answer[i]=-1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
