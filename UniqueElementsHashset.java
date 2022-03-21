import java.util.*;
class UniqueElementsHashset
{
public static void main(String[] args)
{
int arrayWithDuplicates[]={10,3,4,5,3,9,22,3,1,5,6};
int len=arrayWithDuplicates.length;
HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<len;i++){
if(!hs.contains(arrayWithDuplicates[i]))
{
hs.add(arrayWithDuplicates[i]);

}
}
System.out.println(hs);
}
