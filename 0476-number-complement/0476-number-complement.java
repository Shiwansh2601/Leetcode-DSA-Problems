class Solution {
    public int findComplement(int num) {
        double p=Math.log(num)/Math.log(2);
        int pt=(int)p;
        int mask=(1<<(pt+1))-1;

        return num^mask;


    }
}