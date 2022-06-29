package bit.bakdaulet;

public class ShuffledString {
    public static  String shuffledString(String s, int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i =0; i < numbers.length; ++i)
            stringBuilder.setCharAt(numbers[i],s.charAt(i));
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String s="codeLeet";
        int [] arr = {4,5,6,7,0,1,2,3};
        String result= shuffledString(s,arr);
        System.out.println(result);
    }
}
