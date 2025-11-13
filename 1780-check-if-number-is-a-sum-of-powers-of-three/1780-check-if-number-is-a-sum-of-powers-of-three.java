class Solution {
    public boolean checkPowersOfThree(int n) {
        ArrayList<Integer>arr=new ArrayList<>();

        while(n>0)
        {
            arr.add(n%3);
            n/=3;
        }

        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==2)
            return false;
        }

        return true;
    }
}