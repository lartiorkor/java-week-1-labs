public class Task_2 {
    public static void printNameDetails(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is" + fullName + ".");
        System.out.println("There are " + firstName.length() + " letters in my first name and " + lastName.length() + " letters in my last name.");
    }
    public static void main(String[] args) {
        printNameDetails("Jane", "Doe");
    }

}
