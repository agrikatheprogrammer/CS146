class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isValidBST(self, root):
        def helper(node, lower=float('-inf'), upper=float('inf')):
            if node is None:
                return True

            val = node.val
            if val <= lower or val >= upper:
                return False

            if not helper(node.right, val, upper):
                return False
            if not helper(node.left, lower, val):
                return False

            return True

        return helper(root)


a = TreeNode(10, TreeNode(7), TreeNode(11))  # create left subtree
b = TreeNode(22, TreeNode(21), TreeNode(27))  # create right subtree
root = TreeNode(20, a, b)
helper = Solution()
print(helper.isValidBST(root))
