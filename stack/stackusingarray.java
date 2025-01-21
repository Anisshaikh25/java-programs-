package stack;

public class stackusingarray {
    public int data[];
    public int topindex;

    public stackusingarray(int size)
    {
       data=new int[size];
       topindex=-1;
    }

    public stackusingarray(){
        data=new int[10];
        topindex=-1;
    }

    public int size(){
        return topindex+1;
    }

    public boolean isEmpty(){
        if(topindex==-1)
        {
            return true;
        }
        return false;
    }

    public void push(int elem) {
        if(topindex==data.length-1){
            // Exception e=new Exception();
            // throw e;
            System.out.println("stack full");
        }
        topindex++;
        data[topindex]=elem;
    }

    public int top() {
        if(topindex==-1){
           // throw new Exception;
           System.out.println("false");
        }
        return data[topindex];
    }

    public int pop() {
        if(topindex==-1){
            System.out.println("stack empty");
        }
        int temp=data[topindex];
        topindex--;
        return temp;

    }
    
}
