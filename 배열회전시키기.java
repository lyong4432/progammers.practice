class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
       if (direction.equals("right")) 
        {
            for (int i = 0 ; i < numbers.length ; i++)
                answer[i+1==numbers.length?i+1-numbers.length:i+1] = numbers[i];
        } else {
            for (int i = 0 ; i < numbers.length ; i++)
                answer[i-1<0?i-1+numbers.length:i-1] = numbers[i];
        }
        
        return answer;
    }
}
