public class Sort012 {
    static void sort(int arr[]){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int j=0;
        while(count0>0){
            arr[j++]=0;
            count0--;
        }
        while (count1>0) {
            arr[j++]=1;
            count1--;
        }
        while (count2>0) {
            arr[j++]=2;
            count2--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,1,0,2,1,2,0,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
