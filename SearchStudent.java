import java.util.*;
public class SearchStudent
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Arfa");
        map.put(2,"Aaqila");
        map.put(3,"Subuhana");
        System.out.println("Enter Roll No: ");
        int roll=sc.nextInt();
        if(map.containsKey(roll))
        {
            System.out.println("Student Name: "+map.get(roll));
        }
        else
        {
            System.out.println("Student not Found");
        }
    }
}