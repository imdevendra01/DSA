public class reverse_two_pointer {

    public static void main (String[]args){
   //Two pointer reverse ......
    
int [] arr={7,3,4,6,2,1,9,07,6,5,8};
int n=arr.length;
Reverse(arr,0,n-1);
for(int i:arr){
    System.out.println(i);   
}}
public static void Reverse(int[]arr,int i,int j){
while (i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}
}   
}
// }
// for(int i=0;i<n/2;i++)
// {
// int temp=arr[i];
// arr[i]=arr[n-i-1];
// arr[n-i-1]=temp;
// }   
// for(int i:arr){
//     System.out.println(i);
// } }
// }
