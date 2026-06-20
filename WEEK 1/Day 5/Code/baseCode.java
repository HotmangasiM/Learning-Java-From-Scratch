public class baseCode {
    public void fullThrottle(){
        System.out.println("The car is going as fast as i can");
    }

    public void speed(int speed){
        System.out.println("max speed is: "+ speed);
    }

    public static void main(String[] args){
        baseCode myObj = new baseCode();
        myObj.fullThrottle();
        myObj.speed(100);
    }
}
