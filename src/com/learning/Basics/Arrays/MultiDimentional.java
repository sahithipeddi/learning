package com.learning.Basics.Arrays;

public class MultiDimentional {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        int[][] grid = {
                {1,2,3,4},
                    {22,33,44},
        {111,222,333,444}
        };

        System.out.println("row 2 coulumn 3 value is: "+grid[1][2]);

        String[][] stringArray = new String[2][4];

        stringArray[0][1] = "Hi";

        System.out.println(stringArray[0][1]);
        System.out.println("GRid lentgh"+grid.length);
        System.out.println("GRid lentgh"+grid[1].length);


        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length;j++){

                System.out.print(grid[i][j] +"\t");
            }
            System.out.println();
        }


        String[][] words = new String[2][];

        words[0] = new String[2];

        words[0][1] = "Hello this is String";

        System.out.println(words[0][1]);


        String token = null;

        String undefined = null;

        if(token == null){ System.out.println("Same");}


    }
}
