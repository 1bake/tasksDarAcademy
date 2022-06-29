package bit.bakdaulet;

public class SumOddLengthSubarrays {

    public static int  sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    if((i+j)%2==0)
                        sum=sum+arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
