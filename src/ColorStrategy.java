
interface ColorStrategy {
    String getColorCodeString();
}

/**
 * Concrete strategy for the black color.
 */
class BlackColorStrategy implements ColorStrategy {
    @Override
    public String getColorCodeString() {
        return "\033[0;30m";
    }
}

/**
 * Concrete strategy for the red color.
 */
class RedColorStrategy implements ColorStrategy {
    @Override
    public String getColorCodeString() {
        return "\033[0;91m";
    }
}

/**
 * Concrete strategy for the yellow color.
 */
class YellowColorStrategy implements ColorStrategy {
    @Override
    public String getColorCodeString() {
        return "\033[0;93m";
    }
}

/**
 * Concrete strategy for the green color.
 */
class GreenColorStrategy implements ColorStrategy {
    @Override
    public String getColorCodeString() {
        return "\033[0;92m";
    }
}

/**
 * Concrete strategy for the blue color.
 */
class BlueColorStrategy implements ColorStrategy {
    @Override
    public String getColorCodeString() {
        return "\033[0;96m";
    }
}

/**
 * Concrete strategy for the white color.
 */
class WhiteColorStrategy implements ColorStrategy {
    @Override
    public String getColorCodeString() {
        return "\033[0;97m";
    }
}