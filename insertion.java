public class insertion {
    public static void main(String[] args) {
        
int [] arr={7,1,2,6,5,4};
for(int i=0;i<arr.length;i++){
    int x=arr[i] ,j=i-1;
    for(;j>=0 && arr[j]>=x;j--){
arr[j+1]=arr[j];
    }
arr[j+1]=x;


//System.out.println(arr[i]);
}
for(int x:arr){
    System.out.println(x);
}

    }
    
}
