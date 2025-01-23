package trees;
import java.util.*;

public class treeNode<T> {

    T data;
    ArrayList<treeNode<T>> children;

    public treeNode(T data){
        this.data=data;
        this.children=new ArrayList<>();
    }
    
    
}
