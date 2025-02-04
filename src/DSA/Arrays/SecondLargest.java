public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { -1, 4, 3, 10, 1 };
        int largestItems = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestItems) {
                largestItems = arr[i];
            }
        }
        System.out.println("Largest item is: " + largestItems);

        int secondLargest = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondLargest && arr[j] != largestItems) {
                secondLargest = arr[j];
            }
        }
        System.out.println("Second Largest is: " + secondLargest);
    }

}
