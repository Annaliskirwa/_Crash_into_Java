class Patient{
    String name;
    int age;
    float height;
}

public class PatientInfo{
    public static void main(String[]args){
        Patient X = new Patient();
        X.name = "Someone";
        X.age = 12;
        X.height = 153;

        System.out.println("The patients details are:" + X.name + X.age + X.height);
    }
}