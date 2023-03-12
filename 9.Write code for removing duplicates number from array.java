public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6};
        int[] uniqueArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArr[index++] = arr[i];
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}
