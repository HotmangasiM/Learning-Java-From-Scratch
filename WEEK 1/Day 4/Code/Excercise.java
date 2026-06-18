public class Excercise {
    public static void main(String[] args){
        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // average calculations
        // float avg, sum= 0;

        // int length = ages.length;

        // for(int age: ages){
        //     sum += age;
        // }
    
        // avg = sum / length;

        // System.out.println("This is the average: "+ avg);

        // find the lowest ages
        // int length = ages.length;

        // // int lowestAge = ages[0];
        // int highestAge = ages[0];

        // for (int age: ages){
        //     if(highestAge < age){
        //         highestAge = age;
        //     }
        // }

        // System.out.println("This is the lowest age: "+ highestAge);

        // int[] numbers = {45, 12, 98, 33, 27};

        // int max = numbers[0];
        // int min = numbers[0];

        // for(int n: numbers){
        //     if(max < n){
        //         max = n;
        //     }
        //     if(min > n){
        //         min = n;
        //     }
        // }

        // System.out.println("This is the max number: "+ max);
        // System.out.println("This is the lowest number: "+ min);

        // Multidimensional Array

        int[][] myNumbers = {{1, 4, 2}, {3, 6, 8}};

        // // System.out.println(myNumbers[0][2]);

        // System.out.println("Rows: "+ myNumbers.length);
        // System.out.println("Cols i a row 0: "+ myNumbers[0].length);
        // System.out.println("Cols i a row 1: "+ myNumbers[1].length);

        for(int[] row: myNumbers){
            for(int num : row){
                System.out.println(num);
            }
        }
    }
}
