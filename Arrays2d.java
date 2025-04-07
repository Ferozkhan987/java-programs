import java.util.Scanner;

imoport java.util.*;
public class Arrays2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] numbers = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x= sc.nextInt();
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.println(numbers[i][j]);
            }
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(x=numbers[i][j]){
                    System.out.println("printing rows"+i + "cols"+j );
                }
                else{
                    System.out.println("number is not found");
                }
            }
        }
    }
    
}
