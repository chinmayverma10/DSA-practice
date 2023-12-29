import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Array_2D {
    public static boolean search(int arr[][],int key){
        int n = arr.length , m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(key == arr[i][j]){
                    System.out.println("Element found at "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found ");
        return false;
    }
    public static int Largest(int arr[][]) {
        int n = arr.length , m = arr[0].length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ans<arr[i][j]){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
    public static int Smallest(int arr[][]) {
        int n = arr.length , m = arr[0].length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ans>arr[i][j]){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][3];
        int n = matrix.length , m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a = sc.nextInt();
                matrix[i][j] = a;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 0);
        int max = Largest(matrix);
        int min = Smallest(matrix);
        System.out.println("Largest Element is : "+max);
        System.out.println("Smallest Element is : "+min);
    }
}
