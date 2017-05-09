class TreeNodeImpl implements TreeNode {
  TreeNode parent
  def children = []

  Boolean isRoot(){
    parent == null
  }

  Boolean isLeaf(){
    false
  }

  List<TreeNode> getChildren(){
    children
  }

  void addChild(TreeNode node){
    if(children.size() > 1){
      throw new RuntimeException()
    }
    children.add(node)
  }

  void setParent(TreeNode node){
    this.parent = node
    parent.addChild(this)
  }
}