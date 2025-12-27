class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
         Arrays.sort(satisfaction);
         int sum=  0; int res = 0; int k = 1;
        for(int i = n-1; i>=0; i--){
          if(sum + satisfaction[i]>0){
            sum += satisfaction[i];
              res +=  sum;
          }else{
            break;
          }

        }
        return res;
    }
}