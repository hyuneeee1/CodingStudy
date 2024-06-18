import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkArray = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(stkArray.size() == 0 || stkArray.get(stkArray.size()-1) < arr[i]){
                stkArray.add(arr[i]);
            } else {
                int last = stkArray.get(stkArray.size() - 1);
                while (!stkArray.isEmpty() && last >= arr[i]) {
                    stkArray.remove(stkArray.size() - 1);
                    if (!stkArray.isEmpty()) {
                        last = stkArray.get(stkArray.size() - 1);
                    }
                }
                stkArray.add(arr[i]);
            }
        }
        
        int[] stk = new int[stkArray.size()];
        for(int i = 0; i < stkArray.size(); i++){
            stk[i] = stkArray.get(i);      
        }
        
        return stk;
    }
}