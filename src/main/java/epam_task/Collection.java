package epam_task;
import java.util.ArrayList;
import java.util.Scanner;


class list
{
    ArrayList<Integer> a=new ArrayList<Integer>();
    int get(int position)
    {
        return a.get(position);
    }
    void add(int element)
    {
        a.add(element);
    }
    void removelast()
    {
        a.remove(a.get(a.size()-1));
    }

    int position(int element)
    {
        return a.indexOf(element);
    }
    void remove(int position)
    {
        a.remove(a.get(position));
    }

    void print()
    {
        System.out.print(a);
        System.out.println();
    }
}
public class Collection
{
    public static void main(String args[])
    {
        list b=new list();
        Scanner s=new Scanner(System.in);
        int ch;
        while (s.hasNext())
        {
            ch=s.nextInt();
            if(ch==1)
            {
                b.add(s.nextInt());
            }
            else if(ch==2)
            {
                System.out.println("Element is:"+b.get(s.nextInt()));
            }
            else if(ch==3)
            {
                System.out.println("Position is:"+b.position(s.nextInt()));
            }
            else if(ch==4)
            {
                b.remove(s.nextInt());
            }
            else if(ch==5)
            {
                b.removelast();
            }
            else
            {
                b.print();
            }
        }
    }
}