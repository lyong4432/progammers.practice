class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = 0, y = 0;
        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i)== 'p') p++;
            else if(s.charAt(i) == 'y') y++;
        }
        
        if (p != y) answer = false; 
        

        return answer;
    }
}
