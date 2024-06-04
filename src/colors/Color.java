package colors;

public enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK;

    public int getColorCode(String color){
        return Color.valueOf(color).hashCode();
    }

    public void printColorAndCode(){
        for (Color color : Color.values()){
            System.out.println(color.name() +  " " + getColorCode(color.name()));
        }
    }
}
