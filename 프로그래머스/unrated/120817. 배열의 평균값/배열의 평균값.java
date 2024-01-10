class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int result = 0; // 배열을 다 더할 변수 초기화
        
        for(int i = 0;  i < numbers.length; i++) {
            result += numbers[i]; //배열에 담긴 숫자들을 다 더해서 result 변수에 담기
        }
        
        answer = (double) result / numbers.length; //result에 배열에 들어있는 수만큼 나눠서 double로 형변환
        return answer;
    }
}