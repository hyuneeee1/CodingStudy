class Solution {
    public int solution(int a, int b) {
       
        String ab = String.valueOf(a) + String.valueOf(b);
        int ba = 2 * a * b ;
        
        if(Integer.parseInt(ab) >= ba) {
            return Integer.parseInt(ab);
        }else {
            return ba;
        }
    }
}