class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> childSet = new HashSet<>();

        for (int[] d : descriptions) {

            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];

            
            map.putIfAbsent(parent, new TreeNode(parent));

           
            map.putIfAbsent(child, new TreeNode(child));

            TreeNode parentNode = map.get(parent);
            TreeNode childNode = map.get(child);

           
            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

           
            childSet.add(child);
        }

       
        for (int[] d : descriptions) {
            int parent = d[0];

            if (!childSet.contains(parent)) {
                return map.get(parent);
            }
        }

        return null;
    }
}