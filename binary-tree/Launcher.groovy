import static groovy.test.GroovyAssert.shouldFail

class Launcher {
	
	static void main(String[] args){
		TreeNode root = new TreeNodeImpl()
		assert root.isRoot()

		TreeNode leftChild = new TreeNodeImpl()
		leftChild.setParent(root)
		assert !leftChild.isRoot()
		assert root.getChildren().size() == 1

		TreeNode rightChild = new TreeNodeImpl()
		rightChild.setParent(root)
		assert !rightChild.isRoot()
		assert root.getChildren().size() == 2

		TreeNode otherChild = new TreeNodeImpl()
		shouldFail(RuntimeException){
			otherChild.setParent(root)
		}
	}

}