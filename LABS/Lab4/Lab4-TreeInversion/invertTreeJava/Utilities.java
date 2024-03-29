import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Utilities {
    Queue<TreeNode> qe = new LinkedList<TreeNode>();

    public void printTree(TreeNode root)
    {

        if(root == null) return;

        qe.add(root);
        int count = qe.size();

        while(count!=0)
        {
            System.out.print(qe.peek().val);
            System.out.print("  ");
            if(qe.peek().left!=null) qe.add(qe.peek().left);
            if(qe.peek().right!=null) qe.add(qe.peek().right);
            qe.remove(); count = count -1;
            if(count == 0 )
            {
                System.out.println("  ");
                count = qe.size();
            }
        }
    }
}
