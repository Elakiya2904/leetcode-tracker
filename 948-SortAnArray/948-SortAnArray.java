// Last updated: 7/8/2026, 3:56:47 PM
class Solution {
    public static void merger(int arr[],int start,int mid,int end){
        int ls=mid-start+1;
        int rs=end-mid;

        int la[]=new int[ls];
        int ra[]=new int[rs];
        
        for(int i=0;i<ls;i++){
            la[i]=arr[i+start];
        }
        for(int j=0;j<rs;j++){
            ra[j]=arr[mid+1+j];
        }

        int i,j,k;
        i=j=0;k=start;
        while(i<ls&&j<rs){
            if(la[i]<ra[j]){
                arr[k++]=la[i++];
            }
            else{
                arr[k++]=ra[j++];
            }
        }
        while(i<ls){
            arr[k++]=la[i++];
        }
        while(j<rs){
            arr[k++]=ra[j++];
        }

    }
    public static void mergeSort(int arr[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merger(arr,start,mid,end);
        }

    }
    
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}
 