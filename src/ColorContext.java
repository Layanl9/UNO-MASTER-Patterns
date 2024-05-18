
public class ColorContext {
    private ColorStrategy colorStrategy;

    public void setColorStrategy(ColorStrategy colorStrategy) {
        this.colorStrategy = colorStrategy;
    }

    public String getColorCodeString() {
        if (colorStrategy != null) {
            return colorStrategy.getColorCodeString();
        }
        return "";
    }
}