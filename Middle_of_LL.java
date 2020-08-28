package algorithms.LinkedList;

// Fast and Slow pointer approach
public class Middle_of_LL{
	
	public static void main(String[] args){
		
		Node root=null;
		
		root = new Node(1);
		root.right = new Node(2);
		root.right.right = new Node(3);
		root.right.right.right = new Node(4);
		root.right.right.right.right = new Node(5);
		
		findMiddle(root);
	}

	private static void findMiddle(Node root){
		
		if( root == null )
		{
			System.out.println("Empty Linked List");
			return;			
		}
		
		Node fast,slow;
		fast = slow = root;
		
		while( fast != null || fast.right != null ) {
			if( fast != null && fast.right != null && fast.right.right !=null ) {
				slow = slow.right;
				fast = fast.right.right;				
			}				
			else
				break;
		}
		System.out.println("Middle node is => "+slow.data);
	}
}
