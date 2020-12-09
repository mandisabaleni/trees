// Mands Binary Search Tree
//  March 2017

public class BinarySearchTree<dataType extends Comparable<? super dataType>> extends BinaryTree<dataType>
{  int insertCount=0;
   int searchCount=0;

   public void insert ( dataType d, dataType d2 )
   {
      if (root == null)
         root = new BinaryTreeNode<dataType> (d, d2, null, null);
      else
         insert (d, d2, root);
   }
   public void insert ( dataType d, dataType d2, BinaryTreeNode<dataType> node )
   {  insertCount++;
      if (d.compareTo (node.data) <= 0)
      {	// insertCount++;	
         if (node.left == null)
            node.left = new BinaryTreeNode<dataType> (d, d2, null, null);
         else
            insert (d, d2, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode<dataType> (d, d2, null, null);
         else
            insert (d, d2, node.right);
      }
   }
   
   public BinaryTreeNode<dataType> find ( dataType d )
   {  //opCount++;
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   public BinaryTreeNode<dataType> find ( dataType d, BinaryTreeNode<dataType> node )
   {  searchCount++;
      if (d.compareTo (node.data) == 0) 
         {return node;}
      searchCount++;
      if (d.compareTo (node.data) < 0)
      {   searchCount++;
         return (node.left == null) ? null : find (d, node.left);
      }      
	else
         {   searchCount++;
             return (node.right == null) ? null : find (d, node.right);
	 }
   }
  
  public int insertCount ()
  {
	return insertCount;
  }
   
   
}
