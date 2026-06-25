public class Runner {
    class OuterClass{
        int x = 10;
            static class InnerClass{
                int y = 5;
            }
    }

    public static void main(String[] args){
        // OuterClass ou = new OuterClass();

        OuterClass.InnerClass in = OuterClass.new InnerClass();

    }                                                                                                                                                                                                               
}
