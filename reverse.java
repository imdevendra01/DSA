public class reverse{
    public static void main (String[]args){
   //Single pointer reverse ......
    
int [] arr={7,3,4,6,2,1,9};
int n=7;
for(int i=0;i<n/2;i++)
{
int temp=arr[i];
arr[i]=arr[n-i-1];
arr[n-i-1]=temp;
}   
for(int i:arr){
    System.out.println(i);
} }
}