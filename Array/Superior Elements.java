import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
    
        ArrayList<Integer>al=new ArrayList<Integer>();
        int n=a.length;
        int maxi=a[n-1];
        al.add(maxi);
        for(int i=n-2;i>=0;i--){
            if(a[i]>maxi){
                maxi=a[i];
                al.add(a[i]);
            }
        }
        Collections.sort(al);
        return al;
        }
}
