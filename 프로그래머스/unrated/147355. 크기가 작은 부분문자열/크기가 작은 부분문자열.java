
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        
        sb.append(t);
        for(int i = 0; i <=t.length()-p.length();i++){
            if(Long.parseLong(sb.substring(i,i+p.length()))<=Long.parseLong(p))answer++;
        }
        
        return answer;
    }
}