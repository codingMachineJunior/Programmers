import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap <String,Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i],i);
        }
    
        for(String calling : callings){
            int idx = map.get(calling);
            if(idx>0){
                String  temp = players[idx-1];
                players[idx-1]=players[idx];
                players[idx] = temp;
                
                map.put(players[idx-1],idx-1);
                map.put(players[idx],idx);
            }
        }
        return players;
    }
}
