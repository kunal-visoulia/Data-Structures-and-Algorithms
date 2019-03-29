import java.util.*;


public class CodingChallenge8 {
    static int GetLeftPostion(ArrayList<String> list,int l,int r,String search){
        int m; 
  
        while( r - l > 1 ) 
        { 
            System.out.println("r= "+r+" l= "+l+" r-l= "+(r-l));
            m = l + (r - l)/2; 
      System.out.println("m= "+m);
            // if( A[m] >= key )
            if (search.compareTo(list.get(m).substring(0,Math.min(search.length(), list.get(m).length()))) <= 0)
 
                r = m; 
            else
                l = m; 
        } 
      
        return r; 
    }

    static int GetRightPostion(ArrayList<String> list,int l,int r,String search){
        int m;
        while( r - l > 1 ) 
    { 
        System.out.println("r= "+r+" l= "+l+" r-l= "+(r-l));
        m = l + (r - l)/2; 
  System.out.println("m= "+m);  
        // if( list.get(m) <= search )
        if (search.compareTo(list.get(m).substring(0,Math.min(search.length(), list.get(m).length()))) >= 0)
 
            l = m; 
        else
            r = m; 
    } 
  
    return l;  
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("ge", "contribute", "geeks", "ide", "geek", "geekiest", "practice"));
                // ArrayList<String> list = new ArrayList<>(
                //     Arrays.asList("ge", "contribute", "ges", "ide", "ge", "gest", "practice"));
        System.out.println(list);
        ArrayList<String> out_list = new ArrayList<>();

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        String search = "gee";
        int n = search.length();
        // System.out.println(n);
        
        // System.out.println(len);

        // System.out.println("gee".compareTo("ge"));
        // System.out.println("gee".compareTo("geee"));

        int left_index=GetLeftPostion(list,-1,list.size()-1,search);
        int right_index = GetRightPostion(list, 0, list.size(), search);
// System.out.printf("%d %d",left_index,right_index);

        // while (l<=r) {
            // if (search.compareTo(list.get((int) Math.ceil(len / 2)).substring(0,Math.min(3, list.get((int) Math.ceil(len / 2)).length()))) == 0)
        //         {System.out.println(list.get((int) Math.ceil(len / 2)));
        //         }
        if((search.compareTo(list.get(left_index).substring(0,Math.min(search.length(), list.get(left_index).length()))) != 0) &&
        (search.compareTo(list.get(right_index).substring(0,Math.min(search.length(), list.get(right_index).length()))) != 0) ){
            System.out.println("No element exists");
        }
        else{
        for(int i=left_index;i<=right_index;i++)
System.out.println(list.get(i));
        }
                }
    }
