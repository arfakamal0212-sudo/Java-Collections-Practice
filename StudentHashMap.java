import java.util.*;
public class StudentHashMap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("Enter no.of Students: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Roll No: ");
            int roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name=sc.nextLine();
            map.put(roll,name);
        }
        System.out.println("Student Details: ");
        for(int key:map.keySet())
        {
            System.out.println(key+ "->"+map.get(key));
        }
    }
}