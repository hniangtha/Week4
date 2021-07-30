import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

    public static int nextLargest(int[]array,int Number) {

        int nextLargestNumber= -1;

        for (int i : array) {

            nextLargestNumber = Integer.MAX_VALUE;

            if (i > Number) {
                nextLargestNumber = i;

                break;
            }
        }
        return nextLargestNumber;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int size = scan.nextInt();

        int [] array = new int[size];

        int [] sortedArray = new int[size];


        System.out.println("Enter array elements: ");

        for(int i=0;i<size;i++) {

            array[i] = scan.nextInt();

            sortedArray[i] = array[i];
        }

        Arrays.sort(sortedArray);

        System.out.println("Output");

        for(int j=0;j<size;j++) {

            int nextLargestNumber = nextLargest(sortedArray, array[j]);

            if(nextLargestNumber!=-1) {

                System.out.println(array[j]+": "+nextLargestNumber);

            } else {

                System.out.println(array[j]);

            }

        }

    }


}



