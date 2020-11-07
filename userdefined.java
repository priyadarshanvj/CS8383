import java.util.*;
class amt extends Exception
{
int c;
amt(String msg)
{
this.c=c;
}
public int toint()
{
c=a/b;
return c;
}
}
public class userdefined
{
public static void main(String[] args)
{
    int a=1,b=0;
try
{
if(b<0)
{
throw new amt("Invalid ");
}
System.out.println("Working");
}
catch(amt e)
{
System.out.println(e);
}
}
}