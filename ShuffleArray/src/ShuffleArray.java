    public class ShuffleArray {
        public static void main(String[] args) {
            // Example input
            int[] nums = {2, 5, 1, 3, 4, 7};
            int n = nums.length / 2; // Determine the value of n
     
            // Step 1: Create a new array to store the rearranged elements
            int[] rearranged = new int[nums.length];
     
            // Step 2: Rearrange the array in the form [x1, y1, x2, y2, ..., xn, yn]
            for (int i = 0; i < n; i++) {
                rearranged[2 * i] = 0;// COMPLETE THIS PART
                rearranged[2 * i + 1] =0; // COMPLETE THIS PART
            }
     
            // Step 3: Print the rearranged array
            System.out.print("Rearranged array: ");
            for (int i : rearranged) {
                System.out.print(i + " ");
            }
        }
    }


