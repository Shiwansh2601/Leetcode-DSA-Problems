class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String key=strs[i];
            char[] arr=key.toCharArray();
            Arrays.sort(arr);
            String res=new String(arr);

            map.putIfAbsent(res,new ArrayList<>());

            map.get(res).add(key);
        }
        List<List<String>>output=new ArrayList<>();
        for(String str:map.keySet())
        {
               output.add(map.get(str));
        }

        return output;
    }
}