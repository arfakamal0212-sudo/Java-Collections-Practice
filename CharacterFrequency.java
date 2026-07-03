import java.util.*;
public class CharacterFrequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer>map=new HashMap<>();
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println("Character Frequency: ");
        for(char key:map.keySet())
        {
            System.out.println(key+ "="+map.get(key));
        }
    }
}