//平衡二叉树
public class test110 {
    //DFS
    //提前阻断法
    public boolean isBalanced(TreeNode root) {
        //-1 即为存在层数相差大于1
        return depth(root) != -1;
    }

    public int depth(TreeNode root) {
        //当前节点不存在其层数为0
        if (root == null) return 0;
        //获取左节点的层数
        int left = depth(root.left);
        //如果层数为-1直接截断
        if(left==-1) return -1;
        //获取右节点的层数
        int right = depth(root.right);
        //如果层数为-1直接截断
        if(right==-1) return -1;
        //如果左右节点层数相差大于1 直接返回-1 否则返回真实层数
        return Math.abs(left - right) < 2 ? Math.max(left,right) + 1 : -1;
    }
}
