//Write your code here
import java.util.*;
import java.lang.*;

public class TruthInTheMiddle{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];
        int countForT = 0;
        int TRowIndex = 0;
        int TColumnIndex = 0;
        int middleRow = (n-1)/2;
        int middleColumn = n-1;

        int columnMove = 0;
        int rowMove = 0;

        for(int i1 =0; i1<n; i1++){
            array[i1] = scanner.nextLine();
            for(int i2 = 0; i2 < array[i1].length(); i2++){
                if(array[i1].charAt(i2) == 'T'){
                    countForT++;
                    TColumnIndex = i2;
                    TRowIndex = i1;
                }
            }
        }
        
        if(n<=1 || n%2 != 1){
            System.out.println("Invalid size of the matrix");
        }else if(countForT>1 || countForT == 0){
            System.out.println("Error! Exactly one truth please");
        }else{
            if(TRowIndex < middleRow && TColumnIndex > middleColumn){
                columnMove = (TColumnIndex-middleColumn)/2;
                rowMove = middleRow - TRowIndex;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex < middleRow && TColumnIndex < middleColumn){
                columnMove = (middleColumn-TColumnIndex)/2;
                rowMove = middleRow - TRowIndex;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex > middleRow && TColumnIndex > middleColumn){
                columnMove = (TColumnIndex-middleColumn)/2;
                rowMove = TRowIndex - middleRow;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex > middleRow && TColumnIndex < middleColumn){
                columnMove = (middleColumn-TColumnIndex)/2;
                rowMove = TRowIndex - middleRow;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex == middleRow && TColumnIndex > middleColumn){
                columnMove = (TColumnIndex-middleColumn)/2;
                rowMove = 0;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex == middleRow && TColumnIndex < middleColumn){
                columnMove = (middleColumn-TColumnIndex)/2;
                rowMove = 0;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex > middleRow && TColumnIndex == middleColumn){
                columnMove = 0;
                rowMove = TRowIndex - middleRow;
                System.out.println(columnMove+rowMove);
            }else if(TRowIndex < middleRow && TColumnIndex == middleColumn){
                columnMove = 0;
                rowMove = middleRow - TRowIndex;
                System.out.println(columnMove+rowMove);
            }else{
                System.out.println(0);
            }
        }
    }
}

//line-by-line
//no need to move T, just calculating how far it is from the center
// n-1 / 2 + 1
//array[i]=scanner.next();
