import java.util.*;
public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        System.out.println("Enter No.of.Elements: ");
        int n=sc.nextInt();
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++)
        {
            set.add(sc.nextInt());
        }
        System.out.println("After Removing Duplicates: ");
        for(int num:set)
        {
            System.out.println(num);
        }
    }
}