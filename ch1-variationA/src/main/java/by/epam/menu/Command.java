package by.epam.menu;

public enum Command {
    COMMAND1, COMMAND2, COMMAND3, COMMAND4, COMMAND5, COMMAND6, COMMAND7, NULL;

    public static Command from(String line) {
        switch (line.toUpperCase()) {
            case "1":
                return COMMAND1;
            case "2":
                return COMMAND2;
            case "3":
                return COMMAND3;
            case "4":
                return COMMAND4;
            case "5":
                return COMMAND5;
            case "6":
                return COMMAND6;
            case "7":
                return COMMAND7;
            default:
                return NULL;
        }
    }
}
