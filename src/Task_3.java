public class Task_3 {
    public static void main(String[] args) {
        int age = 50;
        if(age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        String message = switch (age) {
            case 12 -> "You are a child.";
            case 19 -> "You are a teenager.";
            case 59 -> "You are an adult.";
            case 60 -> "You are a senior citizen.";
            default -> "Invalid age.";
        };
        System.out.println(message);

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        for(int x = 0; x <= 4; x++){
            for(int y = 0; y <= 4; y++){
                System.out.println("o");
            }
        }

        int j = 10;
        while(j > 0){
            System.out.println(j);
            j--;
        }
    }
}
