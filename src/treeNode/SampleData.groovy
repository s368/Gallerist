package treeNode;

class SampleData {
	
		public static TreeNode<String> getSet1() {
			TreeNode<String> root = new TreeNode<String>("root");
one:			{
				TreeNode<String> node0 = root.addChild("node0");
				TreeNode<String> node1 = root.addChild("node1");
				TreeNode<String> node2 = root.addChild("node2");
two:				{
					TreeNode<String> node20 = node2.addChild(null);
					TreeNode<String> node21 = node2.addChild("node21");
three:					{
						TreeNode<String> node210 = node21.addChild("node210");
						TreeNode<String> node211 = node21.addChild("node211");
					}
				}
				TreeNode<String> node3 = root.addChild("node3");
four:				{
					TreeNode<String> node30 = node3.addChild("node30");
				}
			}
	
			return root;
		}
	
		public static TreeNode<String> getSetSOF() {
			TreeNode<String> root = new TreeNode<String>("root");
one:			{
				TreeNode<String> node0 = root.addChild("node0");
				TreeNode<String> node1 = root.addChild("node1");
				TreeNode<String> node2 = root.addChild("node2");
two:				{
					TreeNode<String> node20 = node2.addChild(null);
					TreeNode<String> node21 = node2.addChild("node21");
three:					{
						TreeNode<String> node210 = node20.addChild("node210");
					}
				}
			}
	
			return root;
		}
		
		public static void main(String [] args)
		{
			getSet1();
			println("Hello World!"); // Display the string.
		}
	}