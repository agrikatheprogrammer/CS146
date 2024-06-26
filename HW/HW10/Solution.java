public class Solution {
public static List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null)
                return null;
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> qe = new LinkedList<>();
            qe.add(root);
            int count = 1;
            List<Integer> toadd = new ArrayList<>();
            while (!qe.isEmpty()) {
                toadd.add(qe.peek().val);
                        //add left first (l-r)
                if (qe.peek().left != null)
                    qe.add(qe.peek().left);
                        //add right if not null
                if (qe.peek().right != null)
                    qe.add(qe.peek().right);      
                qe.remove();
                count--;
            if (count == 0) {
                result.add(toadd);
                toadd = new ArrayList<>();
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
