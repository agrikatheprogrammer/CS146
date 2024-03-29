public class Solution {
public static List<List<Integer>> levelOrder(TreeNode root) {
            if (root==null)
                return null;
            List<List<Integer>> result= new ArrayList<>();
            Queue<TreeNode> qe=new LinkedList<>();
            qe.add(root);
            int count=1;
            List<Integer> toadd=new ArrayList<>();
            while (count!=0) {
                if (qe.peek()!=null) {
                    toadd.add(qe.peek().val);
                    if (qe.peek().right != null)
                        qe.add(qe.peek().right);
                    if (qe.peek().left != null)
                        qe.add(qe.peek().left);
                    qe.remove();
                    count--;
                }
                if(count == 0 )
                {
                    result.add(toadd);
                    toadd=new ArrayList<>();
                    count = qe.size();
                }
            }
            return result;
        }
}


class TreeNode {

     int val;

     TreeNode left;

     TreeNode right;

     TreeNode() {}

     TreeNode(int val) { this.val = val; }

     TreeNode(int val, TreeNode left, TreeNode right) {

         this.val = val;

         this.left = left;

         this.right = right;

     }

  }
