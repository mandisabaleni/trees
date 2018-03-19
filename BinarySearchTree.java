// Mands Binary Search Tree
//  March 2017

public class BinarySearchTree<dataType extends Comparable<? super dataType>> extends BinaryTree<dataType>
{  int opCount=0;

   public void insert ( dataType d, dataType d2 )
   {
      if (root == null)
         root = new BinaryTreeNode<dataType> (d, d2, null, null);
      else
         insert (d, d2, root);
   }
   public void insert ( dataType d, dataType d2, BinaryTreeNode<dataType> node )
   {
      if (d.compareTo (node.data) <= 0)
      {
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
   {  opCount++;
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   public BinaryTreeNode<dataType> find ( dataType d, BinaryTreeNode<dataType> node )
   {  opCount++;
      if (d.compareTo (node.data) == 0) 
         {return node;}
      
      else if (d.compareTo (node.data) < 0)
      {   opCount++;
         return (node.left == null) ? null : find (d, node.left);
      }      
	else
         {   opCount++;
             return (node.right == null) ? null : find (d, node.right);
	 }
   }
  
  public int getCount ()
  {
	return opCount;
  }
   
   
}
