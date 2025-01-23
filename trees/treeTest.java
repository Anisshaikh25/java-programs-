package trees;

public class treeTest {

    public static void printTree(treeNode<Integer> root){
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++)
        {
            treeNode<Integer> child=root.children.get(i);
            printTree(child);
        }
    }

    public static void main(String[] args) {
        treeNode<Integer> root=new treeNode<Integer>(4);
        treeNode<Integer> node1=new treeNode<Integer>(2);
        treeNode<Integer> node2=new treeNode<Integer>(3);
        treeNode<Integer> node3=new treeNode<Integer>(1);
        treeNode<Integer> node4=new treeNode<Integer>(5);
        treeNode<Integer> node5=new treeNode<Integer>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        printTree(root);
        
    }
    
}
