class Main{
    public static void main(String[]args){
        String firstName = "Annalis";
        String lastName = "Kirwa";

        // concat using the + operator
        String fullName = firstName + " " + lastName;

        // concat using the concat() method
        String fullName = firstName.concat(" ").concat(lastName);
    }
}