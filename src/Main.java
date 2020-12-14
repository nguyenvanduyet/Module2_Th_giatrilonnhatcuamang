import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("nhập giá trị của mảng:");
            arr[i]=sc.nextInt();
            i++;
        }
        int max=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("giá trị lớn nhất của mảng là :"+max);

    }
}
