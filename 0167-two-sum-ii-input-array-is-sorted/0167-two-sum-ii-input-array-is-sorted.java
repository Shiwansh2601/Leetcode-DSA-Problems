class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int num[] = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<numbers.length;i++)
    {
        int comp = target - numbers[i];
        if(map.containsKey(comp))
        {
            num[1]=i+1;
            num[0]=map.get(comp)+1;
            return num;
        }
        else
        {
            map.put(numbers[i],i);
        }
    }
     
     return num;
    }
}