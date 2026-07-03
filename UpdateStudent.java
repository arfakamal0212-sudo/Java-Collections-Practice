import java.util.*;
public class UpdateStudent
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
        sc.nextLine();
        if(map.containsKey(roll))
        {
            System.out.println("Enter New Name: ");
            String name=sc.nextLine();
            map.put(roll,name);
            System.out.println("Student Details Updated Successfully");
        }
        else
        {
            System.out.println("Student not Found");
        }
        for(int key:map.keySet())
        {
            System.out.println(key+ "->"+map.get(key));
        }
    }
}