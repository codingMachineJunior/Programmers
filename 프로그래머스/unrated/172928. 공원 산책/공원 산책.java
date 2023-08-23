import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[] r = new char[routes.length];
        int[] rt = new int[routes.length];
        char[][] parks = new char[park.length][park[0].length()];
        
        int x=0, y=0;
        
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                parks[i][j] = park[i].charAt(j);
                if(parks[i][j]=='S'){
                    y = i;
                    x = j;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            int temp=x;
            int v = (routes[i].charAt(2))-'0';
            int t = 0;
            if(routes[i].charAt(0)=='E'){    
                if(x + v<parks[y].length){
                    for(int j = 1; j <= v; j++){
                        x++;
                        if(parks[y][x]=='X'){
                            x-=j;
                            break;
                        }
                    }
                }  
            }
            if(routes[i].charAt(0)=='W'){    
                if(x - v >= 0){
                    for(int j = 1; j <= v; j++){
                        x--;
                        if(parks[y][x]=='X'){
                            x+=j;
                            break;
                        }
                    }
                }  
            }
            if(routes[i].charAt(0)=='S'){    
                if(y + v<park.length){
                    for(int j = 1; j <= v; j++){
                        y++;
                        if(parks[y][x]=='X'){
                            y-=j;
                            break;
                        }
                    }
                }  
            }
            if(routes[i].charAt(0)=='N'){    
                if(y - v>=0){
                    for(int j = 1; j <= v; j++){
                        y--;
                        if(parks[y][x]=='X'){
                            y+=j;
                            break;
                        }
                    }
                }  
            }
        }
        answer[0]=y;
        answer[1]=x;
        return answer;
    }
}