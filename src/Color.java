



/**
 * an {@code enum} of card colors. 
 * 0: black, 1: red, 2: yellow, 3: green, 4: blue
 * 
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.2.0
 */
public class Color {
    public static final Color BLACK = new Color("\033[0;30m");
    public static final Color RED = new Color("\033[0;91m");
    public static final Color YELLOW = new Color("\033[0;93m");
    public static final Color GREEN = new Color("\033[0;92m");
    public static final Color BLUE = new Color("\033[0;96m");
    public static final Color WHITE = new Color("\033[0;97m");

    public static final Color BLACK_B = new Color("\033[40m");
    public static final Color BLACK_BRIGHT_B = new Color("\033[100m");
    public static final Color RED_B = new Color("\033[101m");
    public static final Color YELLOW_B = new Color("\033[103m");
    public static final Color GREEN_B = new Color("\033[102m");
    public static final Color BLUE_B = new Color("\033[106m");
    public static final Color WHITE_B = new Color("\033[107m");

    public static final Color RESET = new Color("\033[92;40m");

    private String colorCodeString;

    private Color(String colorCodeString) {
        this.colorCodeString = colorCodeString;
    }

    public static String getColorCodeString(Color color) {
        return color.colorCodeString;
    }

    public static Color getBackgroundColor(Color textColor) {
        if (textColor == RED) {
            return RED_B;
        } else if (textColor == YELLOW) {
            return YELLOW_B;
        } else if (textColor == GREEN) {
            return GREEN_B;
        } else if (textColor == BLUE) {
            return BLUE_B;
        } else if (textColor == WHITE) {
            return WHITE_B;
        } else if (textColor == BLACK) {
            return BLACK_BRIGHT_B;
        } else {
            return BLACK_B;
        }
    }
}