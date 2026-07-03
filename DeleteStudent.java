import java.util.*;
public class DeleteStudent
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Arfa");
        map.put(2,"Aaqila");
        map.put(3,"Subuhana");
        System.out.println("Enter Roll No: ");
        int roll=sc.nextInt();
        if(map.containsKey(roll))
        {
            map.remove(roll);
            System.out.println("Student Details Removed Successfully");
        }
        else
        {
            System.out.println("Student Not Found");
        }
        for(int key:map.keySet())
        {
            System.out.println(key+ "->"+map.get(key));
        }
    }
}