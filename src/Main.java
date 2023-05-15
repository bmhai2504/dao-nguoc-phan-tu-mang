import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize;
        int[] arr;

        do {
            System.out.printf("Nhap vao so phan tu cua mang: ");
            arrSize = input.nextInt();
            if(arrSize > 20){
                System.out.println("So luong phan tu <= 20");
            }
        }while (arrSize > 20);

        arr = new int[arrSize];
        inputValueArr(arr, arrSize);

        swapValue(arr);

        printArr(arr);

    }

    public static void inputValueArr(int[] arr, int arrSize){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arrSize; i++){
            System.out.printf("Nhap gia tri vi arr[%d]: ", i);
            arr[i] = input.nextInt();
        }
    }

    public static void swapValue(int[] arr){
        for(int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--){
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printArr(int[] arr){
        System.out.printf("arr = [");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("]");
    }
}