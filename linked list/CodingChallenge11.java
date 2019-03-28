import java.util.*;

public class CodingChallenge11{
    public static void main(String[] args){
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        
        Set<ArrayList<Integer>> triplets = new HashSet<ArrayList<Integer>>(10);
        
        //WRONG APPROACH: EVERY ELEMENT MATTERS
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++)
        // System.out.print(" "+arr[i]);

        // int[] temp = new int[arr.length];
        // // temp[0] = 5;
        // // System.out.println(arr2.length); //6

        // int j=0;//number of unique elemnets
        // //keep the current elment only if !=next element
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]!=arr[i+1])
        //         temp[j++]=arr[i];
        // }

        // //keep the last element 
        // temp[j++]=arr[arr.length-1];
        // System.out.println("\n");

        // System.out.print(j);
        // for(int i=0;i<j;i++){
        //     arr[i]=temp[i];
        // }
        // System.out.println("\n");
        // for(int i=0;i<j;i++)
        // System.out.print(" "+temp[i]);

        // // System.out.println("\n");
        // // for(int i=0;i<arr.length;i++) //j is now the actual array length
        // // System.out.print(" "+arr[i]);
        // System.out.println("\n");
        // for(int i=0;i<j;i++)
        // System.out.print(" "+arr[i]);
        // System.out.println("\n");

        //Naive Approach
        int j=arr.length;
        for(int i=0;i<j-2;i++){
            for(int k=i+1;k<j-1;k++){
                for(int l=k+1;l<j;l++){
                    int d=arr[i]+arr[k]+arr[l];
                    //  System.out.println("Triplets are: "+arr[i]+","+arr[k]+","+arr[l]+"and sum is: "+d);

                    if(d==0){
                        System.out.println("Triplets are: "+arr[i]+","+arr[k]+","+arr[l]);
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[k]);
                    temp.add(arr[l]);
                    Collections.sort(temp);//uniqueness in triplets
                    triplets.add(temp);
                    }
                }
            }
        }
        System.out.print(triplets);
    }
}