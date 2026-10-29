package classs13.arrays2d;

public class Code1st {
    public static void main(String[] args) {
        //decalaration
        int[][] arr;
        //allocation
        arr=new int[3][4];
        //init
        int[][]brr={
                {1,2},
                {3,4,7,6},
                {5,6,7,9,3,5},
                {7}
        };
//        System.out.println(brr[2][0]);
//        int rowLenght=brr.length;
//        //int colLenght= brr[0].length;
//        for(int row=0; row<=rowLenght-1; row++){
//            //jaise hi mai kisi new row me aaya
//            //same point pe mai us row ka column lenght find out kar liya
//            //current roe -> brr[row]
//            //isme kitni column hai -> brr[row].lenght
//            int colLenght=brr[row].length;
//            for(int col=0; col<=colLenght-1; col++){
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }
        for(int rowIndex=0; rowIndex<= brr.length-1; rowIndex++){
            for(int colIndex=0; colIndex<=brr[rowIndex].length-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

    }
}
