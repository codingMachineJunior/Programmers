class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minRow = 51, maxRow=-1;
        int minCol = 51, maxCol=-1;
        
        for(int i = 0; i <wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    minRow = Math.min(minRow,i);
                    maxRow = Math.max(maxRow,i);
                    minCol = Math.min(minCol,j);
                    maxCol = Math.max(maxCol,j);
                }
            }
        }
        answer[0]=minRow;
        answer[1]=minCol;
        answer[2]=maxRow+1;
        answer[3]=maxCol+1;
        return answer;
    }
}