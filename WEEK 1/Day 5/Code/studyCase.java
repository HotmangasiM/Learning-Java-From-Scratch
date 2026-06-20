public class studyCase{
        int modelYear;
        String modelName;

        public studyCase(int year, String name){
            modelYear = year;
            modelName= name;
        }
    
    public static void main(String[] args){
        studyCase stdObj = new studyCase(1969, "Honda");
        System.out.println(stdObj.modelYear + " " + stdObj.modelName);
    }

}

