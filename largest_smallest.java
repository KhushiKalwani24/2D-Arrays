package Arrays_2D;
import java.util.*;
public class largest_smallest {
    public static void searchlargest(int matrix[][]){
        int largest =matrix[0][0];
        int smallest=matrix[0][0];
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
                if (matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        for(int i=0 ;i<n;i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0 ;i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        searchlargest(matrix);

    }
}

