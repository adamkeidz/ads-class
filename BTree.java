class Node
{
	public int data;
	public Node leftLeaf;
	public Node rightLeaf;
}

public class BTree
{
	private Node root;
	public BTree()
	{
			root = null;
	}
	public Node find(int key)
	{
		Node current = root;
		while(current.data !=key)
		{
		 	if(key<current.data)
		 		current=current.leftLeaf;
		 	else
		 		current=current.rightLeaf;
		 	if(current == null)
			 		return null;
		} 	
			return current;
	}
		
	public void insert (int value)
	{
		Node newNode = new Node();
		newNode.data = value;
		if(root==null)
			root=newNode;
		else 
		{
			Node current =root;
			Node parent;
			while(true)
			{
				parent=current;
				if(value<current.data)
				{
					current=current.leftLeaf;
					if(current==null)
					{
						parent.leftLeaf=newNode;
						return;
					}
				}
				else
				{
					current = current.rightLeaf;
					if(current==null)
					{
						parent.rightLeaf=newNode;
						return;
					}
				}
			}
		}
	}
	public void inOrder(Node localRoot)
	{
		if(localRoot != null)
		{
			inOrder(localRoot.leftLeaf);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.rightLeaf);
		}
				
	}
	public void preOrder(Node localRoot)
	{
	
	}
	
    public void postOrder(Node localRoot)
    {
	}
	
	public static void main(String[] arg)
	{
		BTree BST = new BTree();
		System.out.print("BST Implementation");
		BST.insert(100);
		BST.insert(20);
		BST.insert(200);
		BST.insert(10);
		BST.insert(30);
		BST.insert(150);
		BST.insert(300);
		Node temp=BST.find(20);
		if(temp==null)
			System.out.println("Not Found");
		else
			System.out.println(temp.data);
		System.out.println("Tree in inOrder fashion: ");
		BST.inOrder(BST.root);
		
	}
}