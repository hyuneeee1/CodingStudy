
class Solution {
    public int solution(int n) {
        
    String a = Integer.toString(n);
        
        int answer = 0;
        		
        for (int i = 0; i < a.length(); i++ ) {
        	
        	answer += Integer.parseInt(a.substring(i, i+1));
            
        }
        
           return answer;
    }
}