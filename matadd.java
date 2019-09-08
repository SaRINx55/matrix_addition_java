package myPackage;

import java.util.*;
public class matrix_add {
    public static void main(String[] args) {
        int row=0, column=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of rows and columns");
        row=s.nextInt();
        column=s.nextInt();

        int [][] a= new int [row][column];
        int [][] b=  new int [row][column];
        int [][] result= new int [row][column];

        System.out.println("enter elements of the first matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter elements of the second matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                b[i][j]=s.nextInt();
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                result[i][j]=a[i][j]+b[i][j];

            }
        }

        //output
        System.out.println("resultant matrix is");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println(result[i][j]);

            }
        }

    }
}
