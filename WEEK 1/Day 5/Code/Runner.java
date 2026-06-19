public class Runner {
    // static int myMethod(int x){
    //     return x + 2;
    // }

    // static int doubleGame(int x){
    //     return x * 2;
    // }

    static String welcomeMessage(String name){
        return "Welcome to Java" + name;
    }

    static int plusMethod(int x , int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    static int sum(int k){
        if(k > 0){
            return k + sum(k-1);
        } else {
            return 0;
        }
    }

    static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
    
    public static void main(String[] args){
        // System.out.println(myMethod(10));
        // for(int i =1; i <=5; i++){
        //     System.out.println("Double of " + i + doubleGame(i));        }
        // String result = welcomeMessage("Hotmangasi");
        // System.out.println(result);

        // System.out.println(welcomeMessage("Hotmangasi"));

        // int result = plusMethod(2, 3);
        // double doubleResult = plusMethod(2.3d, 4.56d);

        // System.out.println(result);
        // System.out.println(doubleResult);

        // Program rekursi untuk menambahkan semua angka dari 1 sampai 10

        int result = sum(50,10);
        System.out.println(result);

}
}
