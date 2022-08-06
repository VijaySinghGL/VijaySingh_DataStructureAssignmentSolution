package driver;


	import service.Transform;
	import service.Transform.Node;

	public class main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Transform tree = new Transform();
			tree.m_root = new Node(60);
			tree.m_root.left = new Node(40);
			tree.m_root.right = new Node(80);
			tree.m_root.left.left = new Node(20);
			tree.m_root.right.left= new Node(75);
			
			tree.convertTree(tree.m_root);
			tree.traverseRightSkewed(tree.GetHeadNode());

		}

	}
	