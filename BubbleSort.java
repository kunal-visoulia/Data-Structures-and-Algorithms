public class BubbleSort{
    public static void sort(int[] arr){
        int n=arr.length;
        Boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false) break;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,1,8,6,3,5,0};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        sort(arr);
        System.out.println(" ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
    }
}