package leetcodeTest;

/*
给出一个完全二叉树，求出该树的节点个数。

说明：

完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。

示例:

输入:
    1
   / \
  2   3
 / \  /
4  5 6

输出: 6

 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root==null){
            return 0;
        }
        int h=0;
        TreeNode node=root;
        while (node.left != null) {
            h++;
            node = node.left;
        }


        int upper=(1<<h)-1;
        int start=0;
        int end=upper;
        while(start +1<end){
            int mid=start+(end-start)/2;
            if (hasNode(root,mid,h)){
                start=mid;
            }else {
                end=mid;
            }
        }
        if (hasNode(root,end,h)){
            return upper+end+1;
        }else {
            return upper+start+1;
        }
    }
    public boolean hasNode(TreeNode root,int idx,int h){
        TreeNode node=root;
        int start=0;
        int end=(1<<h)-1;
        for (int i=0;i<h;i++){
            int mid=start+(end-start)/2;
            if (mid>=idx){
                node=node.left;
                end=mid;
            }else {
                node=node.right;
                start=mid;
            }
        }
        return node!=null;
    }
}
