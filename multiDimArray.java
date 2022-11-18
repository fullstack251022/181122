public class Main {
    public static void main(String[] args) {


//        System.out.println(myMultiArray[0].length);
//        System.out.println(myMultiArray[1].length);
//        System.out.println(myMultiArray[2].length);
//        System.out.println(myMultiArray[3].length);
        //index: 0,1,2
        //length: 4

//        int [] innerArray = myMultiArray[0];
//        System.out.println(innerArray[1]); //8

//        System.out.println(myMultiArray[0][1]); //8
//        System.out.println(myMultiArray[1][0]); //100
//        System.out.println(myMultiArray[2][1]); //error

//        System.out.println(myMultiArray.length);

//        int [][] myMultiArray = {{5,8,10},{100,200},{5},{4,10,13,15,20}};
//
//        for (int i = 0; i < myMultiArray.length; i++) {
//            for (int j = 0; j < myMultiArray[i].length; j++) {
//                System.out.println(myMultiArray[i][j]);
//            }
//        }


//        // i meyazeg shurot
//        // j meyazeg emdato
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //targil:
        //Create matrix 3x3, with numbers {{1,2,3},{4,5,6},{6,7,8}} ;
        //print all the numbers using the loop
        //mini etgar: print them as they are in the matrix

        int[][] myMatrix = {{1, 2, 3}, {4, 5, 6},{6, 7, 8}, {8,8,8}};

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                System.out.print(myMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
