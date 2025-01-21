package stack;

public class stackuse {
    public static void main(String args[]){

    stackusingarray stack=new stackusingarray();
    int arr[]={5,6,7,8,1};
    for(int i=0;i<arr.length;i++)
    {
        stack.push(arr[i]);
    }
    while(!stack.isEmpty()){
        System.out.println(stack.pop());
    }
}
}

    

