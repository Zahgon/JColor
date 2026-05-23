package com.diogonunes.jcolor;

/**
 * Abstracts ANSI codes with intuitive names. It maps a description (e.g. RED_TEXT) with a code (e.g. 31).
 * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#Escape_sequences">Wikipedia, for a list of all codes available</a>
 * @see <a href="https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences/33206814#33206814">StackOverflow, for a list of codes with examples</a>
 */
public abstract class Attribute {

    /** Default constructor for subclasses. */
    protected Attribute() {
    }

    /** {@return the Attribute's ANSI escape code} */
    @Override
    public abstract String toString();

    // Effects

    /** {@return An Attribute that applies no formatting} */
    public static Attribute NONE() {
        return new SimpleAttribute("");
    }

    /** {@return An Attribute that clears any format, restoring the terminal's default} */
    public static Attribute CLEAR() {
        return new SimpleAttribute("0");
    }

    /** {@return An Attribute that makes text bold} */
    public static Attribute BOLD() {
        return new SimpleAttribute("1");
    }

    /** {@return An Attribute that makes text bold (alias of {@link #BOLD()})} */
    public static Attribute SATURATED() {
        return new SimpleAttribute("1");
    }

    /** {@return An Attribute that dims the text} */
    public static Attribute DIM() {
        return new SimpleAttribute("2");
    }

    /** {@return An Attribute that dims the text (alias of {@link #DIM()})} */
    public static Attribute DESATURATED() {
        return new SimpleAttribute("2");
    }

    /** {@return An Attribute that makes text italic} */
    public static Attribute ITALIC() {
        return new SimpleAttribute("3");
    }

    /** {@return An Attribute that underlines the text} */
    public static Attribute UNDERLINE() {
        return new SimpleAttribute("4");
    }

    /** {@return An Attribute that makes the text blink slowly} */
    public static Attribute SLOW_BLINK() {
        return new SimpleAttribute("5");
    }

    /** {@return An Attribute that makes the text blink rapidly} */
    public static Attribute RAPID_BLINK() {
        return new SimpleAttribute("6");
    }

    /** {@return An Attribute that swaps foreground and background colors} */
    public static Attribute REVERSE() {
        return new SimpleAttribute("7");
    }

    /** {@return An Attribute that hides the text (same color as background)} */
    public static Attribute HIDDEN() {
        return new SimpleAttribute("8");
    }

    /** {@return An Attribute that strikes through the text} */
    public static Attribute STRIKETHROUGH() {
        return new SimpleAttribute("9");
    }

    /** {@return An Attribute that draws a frame around the text} */
    public static Attribute FRAMED() {
        return new SimpleAttribute("51");
    }

    /** {@return An Attribute that encircles the text} */
    public static Attribute ENCIRCLED() {
        return new SimpleAttribute("52");
    }

    /** {@return An Attribute that draws a line above the text} */
    public static Attribute OVERLINED() {
        return new SimpleAttribute("53");
    }

    // Colors (foreground)

    /** {@return An Attribute that paints the text black} */
    public static Attribute BLACK_TEXT() {
        return new SimpleAttribute("30");
    }

    /** {@return An Attribute that paints the text red} */
    public static Attribute RED_TEXT() {
        return new SimpleAttribute("31");
    }

    /** {@return An Attribute that paints the text green} */
    public static Attribute GREEN_TEXT() {
        return new SimpleAttribute("32");
    }

    /** {@return An Attribute that paints the text yellow} */
    public static Attribute YELLOW_TEXT() {
        return new SimpleAttribute("33");
    }

    /** {@return An Attribute that paints the text blue} */
    public static Attribute BLUE_TEXT() {
        return new SimpleAttribute("34");
    }

    /** {@return An Attribute that paints the text magenta} */
    public static Attribute MAGENTA_TEXT() {
        return new SimpleAttribute("35");
    }

    /** {@return An Attribute that paints the text cyan} */
    public static Attribute CYAN_TEXT() {
        return new SimpleAttribute("36");
    }

    /** {@return An Attribute that paints the text white} */
    public static Attribute WHITE_TEXT() {
        return new SimpleAttribute("37");
    }

    // Colors (background)

    /** {@return An Attribute that paints the background black} */
    public static Attribute BLACK_BACK() {
        return new SimpleAttribute("40");
    }

    /** {@return An Attribute that paints the background red} */
    public static Attribute RED_BACK() {
        return new SimpleAttribute("41");
    }

    /** {@return An Attribute that paints the background green} */
    public static Attribute GREEN_BACK() {
        return new SimpleAttribute("42");
    }

    /** {@return An Attribute that paints the background yellow} */
    public static Attribute YELLOW_BACK() {
        return new SimpleAttribute("43");
    }

    /** {@return An Attribute that paints the background blue} */
    public static Attribute BLUE_BACK() {
        return new SimpleAttribute("44");
    }

    /** {@return An Attribute that paints the background magenta} */
    public static Attribute MAGENTA_BACK() {
        return new SimpleAttribute("45");
    }

    /** {@return An Attribute that paints the background cyan} */
    public static Attribute CYAN_BACK() {
        return new SimpleAttribute("46");
    }

    /** {@return An Attribute that paints the background white} */
    public static Attribute WHITE_BACK() {
        return new SimpleAttribute("47");
    }

    // Bright colors (foreground)

    /** {@return An Attribute that paints the text bright black} */
    public static Attribute BRIGHT_BLACK_TEXT() {
        return new SimpleAttribute("90");
    }

    /** {@return An Attribute that paints the text bright red} */
    public static Attribute BRIGHT_RED_TEXT() {
        return new SimpleAttribute("91");
    }

    /** {@return An Attribute that paints the text bright green} */
    public static Attribute BRIGHT_GREEN_TEXT() {
        return new SimpleAttribute("92");
    }

    /** {@return An Attribute that paints the text bright yellow} */
    public static Attribute BRIGHT_YELLOW_TEXT() {
        return new SimpleAttribute("93");
    }

    /** {@return An Attribute that paints the text bright blue} */
    public static Attribute BRIGHT_BLUE_TEXT() {
        return new SimpleAttribute("94");
    }

    /** {@return An Attribute that paints the text bright magenta} */
    public static Attribute BRIGHT_MAGENTA_TEXT() {
        return new SimpleAttribute("95");
    }

    /** {@return An Attribute that paints the text bright cyan} */
    public static Attribute BRIGHT_CYAN_TEXT() {
        return new SimpleAttribute("96");
    }

    /** {@return An Attribute that paints the text bright white} */
    public static Attribute BRIGHT_WHITE_TEXT() {
        return new SimpleAttribute("97");
    }

    // Bright colors (background)

    /** {@return An Attribute that paints the background bright black} */
    public static Attribute BRIGHT_BLACK_BACK() {
        return new SimpleAttribute("100");
    }

    /** {@return An Attribute that paints the background bright red} */
    public static Attribute BRIGHT_RED_BACK() {
        return new SimpleAttribute("101");
    }

    /** {@return An Attribute that paints the background bright green} */
    public static Attribute BRIGHT_GREEN_BACK() {
        return new SimpleAttribute("102");
    }

    /** {@return An Attribute that paints the background bright yellow} */
    public static Attribute BRIGHT_YELLOW_BACK() {
        return new SimpleAttribute("103");
    }

    /** {@return An Attribute that paints the background bright blue} */
    public static Attribute BRIGHT_BLUE_BACK() {
        return new SimpleAttribute("104");
    }

    /** {@return An Attribute that paints the background bright magenta} */
    public static Attribute BRIGHT_MAGENTA_BACK() {
        return new SimpleAttribute("105");
    }

    /** {@return An Attribute that paints the background bright cyan} */
    public static Attribute BRIGHT_CYAN_BACK() {
        return new SimpleAttribute("106");
    }

    /** {@return An Attribute that paints the background bright white} */
    public static Attribute BRIGHT_WHITE_BACK() {
        return new SimpleAttribute("107");
    }

    // Complex colors

    /**
     * Paints the text using an 8-bit color from the 256-color palette.
     *
     * @param colorNumber A number (0-255) that represents an 8-bit color.
     * @return An Attribute that represents a foreground with an 8-bit color.
     */
    public static Attribute TEXT_COLOR(int colorNumber) {
        return new TextColorAttribute(colorNumber);
    }

    /**
     * Paints the text using a 24-bit true color (RGB).
     *
     * @param r A number (0-255) that represents the red component.
     * @param g A number (0-255) that represents the green component.
     * @param b A number (0-255) that represents the blue component.
     * @return An Attribute that represents a foreground with a true color.
     */
    public static Attribute TEXT_COLOR(int r, int g, int b) {
        return new TextColorAttribute(r, g, b);
    }

    /**
     * Paints the background using an 8-bit color from the 256-color palette.
     *
     * @param colorNumber A number (0-255) that represents an 8-bit color.
     * @return An Attribute that represents a background with an 8-bit color.
     */
    public static Attribute BACK_COLOR(int colorNumber) {
        return new BackColorAttribute(colorNumber);
    }

    /**
     * Paints the background using a 24-bit true color (RGB).
     *
     * @param r A number (0-255) that represents the red component.
     * @param g A number (0-255) that represents the green component.
     * @param b A number (0-255) that represents the blue component.
     * @return An Attribute that represents a background with a true color.
     */
    public static Attribute BACK_COLOR(int r, int g, int b) {
        return new BackColorAttribute(r, g, b);
    }
}

