import java.util.*;
public class StudentArrayList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> student=new ArrayList<>();
        System.out.println("Enter no.of Students: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Name: ");
            student.add(sc.nextLine());
        }
        System.out.println("Student List: ");
        for(String name:student)
        {
            System.out.println(name);
        }
        
    }
}