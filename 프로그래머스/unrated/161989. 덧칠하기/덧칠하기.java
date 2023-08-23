class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] place = new int[n+1];
        
        for(int j =1 ; j<= n;j++)place[j]=1;
        for(int j=0;j<section.length;j++){
            place[section[j]]=0;
        }

        for(int i = section[0]; i <=n; i++){
            if(place[i] == 0){
                for(int j = i; j < i+m; j++){
                    place[j]=1;
                    if(j>=n)break;
                }
                answer++;
            }
        }
              
        return answer;
    }
}