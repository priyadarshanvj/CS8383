import java.io.*;
import java.util.*;
class ArrStack implements interface1
{
    int size;
    int[] st;
    private int top;
    private int items_count;
    
    public ArrStack(int Max) {
        size=Max;
        st=new int[size];
        top=-1;
    }
    public void push(int item) {
        try{
            st[++top]=item;
        }
        catch(Exception e){
            System.out.println("\n Stack Full!Can not insert element");
        }
        
    }   
}
public int pop()
{
    int item;
    try{
        item=st[top];
        top--;
        return item;
    }
    catch(Exception e)
    {
        System.out.println("\n Stack Empty!Can not pop element");
        return -1;
    }
}
public void display()
{
    System.out.println("\n Stack contains:");
    for(int i=top;i>=0;i--)
    {
        if(top==-1)
        System.out.println("Stack is empty");
        else if(size==top)
        System.out.println("Stack is full");
        else
        System.out.println(""+st[i]);
    }
}
}
class StackDemo
{
    public static void main(String[] args) {
        ArrStack obj=new ArrStack(10);
        System.out.println("\n----------------------------");
        System.out.println("\n\tStack using Array");
        System.out.println("\n----------------------------");
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
    }
}