public class Tree{

  Tree left ;
  Tree right ;
  int val ;

  Tree(int value, Tree leftC, Tree rightC){
    this.left = leftC;
    this.right = rightC;
    this.val = value;
  }

  void preTraverser(){
    if(this!=null)
      System.out.print(this.val + " ");

    if(this.left!=null)
      this.left.preTraverser() ;

    if(this.right!=null)
      this.right.preTraverser() ;
    }

  public static void main(String args[])
  {

    // creating the Tree
    Tree tree4 = new Tree(4, null, null) ;
    Tree tree5 = new Tree(5, null, null) ;
    Tree tree6 = new Tree(6, null, null) ;
    Tree tree2 = new Tree(2, tree4, null) ;
    Tree tree3 = new Tree(3, tree5, tree6) ;
    Tree tree1 = new Tree(1, tree2, tree3) ;

    tree1.preTraverser() ;

  }



}
