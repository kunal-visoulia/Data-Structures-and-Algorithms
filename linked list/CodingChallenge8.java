import java.util.*;

public class CodingChallenge8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("ge", "contribute", "geeks", "ide", "geek", "geekiest", "practice"));
    
        System.out.println(list);
        ArrayList<String> out_list = new ArrayList<>();

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        String search = "gee";
        int n = search.length();
        // System.out.println(n);
        int len = list.size();
        int flag = 0;
        // System.out.println(len);

        // System.out.println("gee".compareTo("ge"));
        // while (flag == 0) {
        //     if (search.compareTo(list.get((int) Math.ceil(len / 2)).substring(0,Math.min(3, list.get((int) Math.ceil(len / 2)).length()))) == 0)
        //         {System.out.println(list.get((int) Math.ceil(len / 2)));
        //         }
        //         }
    }
}