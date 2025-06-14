package by.epam.numbers;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
            while (true) {
                String line = main.menu();
                main.select(line);
                if (line.equals("0")) {
                    main.out();
                    break;
                }
            }
    }
    public  String menu(){
        return " ";
    }

    public void select(String line) {


    }

    public void out() {


    }
}