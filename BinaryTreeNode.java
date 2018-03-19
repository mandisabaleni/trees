// Mands Binary Tree
// 26 March 2017


public class BinaryTreeNode<dataType>
{
   dataType data;
   dataType data2;
   int height;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   
   public BinaryTreeNode ( dataType d, dataType d2, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      data2 = d2;
      left = l;
      right = r;
      height = 0;
   }
   
public String toString(){
         return data + "" + data2;
}

   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
}
