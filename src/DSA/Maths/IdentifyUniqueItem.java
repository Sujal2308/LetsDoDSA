package DSA.Maths;

public class IdentifyUniqueItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4,3};
        System.out.println(uniqueItem(arr));
    }
    static int uniqueItem(int[] arr){
        int unique = 0;
        for(int i : arr){
            unique ^= i;
        }
        return unique;
    }
}
