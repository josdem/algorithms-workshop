interface TreeNode {
  Boolean isRoot()
  Boolean isLeaf()
  List<TreeNode> getChildren()
  void setParent(TreeNode node)
  void addChild(TreeNode node)
}