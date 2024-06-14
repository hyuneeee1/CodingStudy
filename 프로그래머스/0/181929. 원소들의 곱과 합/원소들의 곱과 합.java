class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1; //0으로 초기화하면 무슨 수를 곱해도 0이 되므로 1로 초기화해줌.
        
        for(int i = 0 ; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
            
            answer = mul < sum * sum ? 1 : 0;
        }
        return answer;
    }
}