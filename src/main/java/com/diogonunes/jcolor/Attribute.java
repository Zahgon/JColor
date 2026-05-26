package com.diogonunes.jcolor;

/**
 * Abstracts ANSI codes with intuitive names. It maps a description (e.g. RED_TEXT) with a code (e.g. 31).
 * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#Escape_sequences">Wikipedia, for a list of all codes available</a>
 * @see <a href="https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences/33206814#33206814">StackOverflow, for a list of codes with examples</a>
 */
public abstract class Attribute {

    /**
     * Default constructor for subclasses.
     */
    protected Attribute() {
    }

    /**
     * {@return the Attribute's ANSI escape code}
     */
    @Override
    public abstract String toString();

    // Effects
    /**
     * {@return An Attribute that applies no formatting}
     */
    public static Attribute NONE() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that clears any format, restoring the terminal's default}
     */
    public static Attribute CLEAR() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that makes text bold}
     */
    public static Attribute BOLD() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that makes text bold (alias of {@link #BOLD()})}
     */
    public static Attribute SATURATED() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that dims the text}
     */
    public static Attribute DIM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that dims the text (alias of {@link #DIM()})}
     */
    public static Attribute DESATURATED() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that makes text italic}
     */
    public static Attribute ITALIC() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that underlines the text}
     */
    public static Attribute UNDERLINE() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that makes the text blink slowly}
     */
    public static Attribute SLOW_BLINK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that makes the text blink rapidly}
     */
    public static Attribute RAPID_BLINK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that swaps foreground and background colors}
     */
    public static Attribute REVERSE() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that hides the text (same color as background)}
     */
    public static Attribute HIDDEN() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that strikes through the text}
     */
    public static Attribute STRIKETHROUGH() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that draws a frame around the text}
     */
    public static Attribute FRAMED() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that encircles the text}
     */
    public static Attribute ENCIRCLED() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that draws a line above the text}
     */
    public static Attribute OVERLINED() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Colors (foreground)
    /**
     * {@return An Attribute that paints the text black}
     */
    public static Attribute BLACK_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text red}
     */
    public static Attribute RED_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text green}
     */
    public static Attribute GREEN_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text yellow}
     */
    public static Attribute YELLOW_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text blue}
     */
    public static Attribute BLUE_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text magenta}
     */
    public static Attribute MAGENTA_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text cyan}
     */
    public static Attribute CYAN_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text white}
     */
    public static Attribute WHITE_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Colors (background)
    /**
     * {@return An Attribute that paints the background black}
     */
    public static Attribute BLACK_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background red}
     */
    public static Attribute RED_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background green}
     */
    public static Attribute GREEN_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background yellow}
     */
    public static Attribute YELLOW_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background blue}
     */
    public static Attribute BLUE_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background magenta}
     */
    public static Attribute MAGENTA_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background cyan}
     */
    public static Attribute CYAN_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background white}
     */
    public static Attribute WHITE_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Bright colors (foreground)
    /**
     * {@return An Attribute that paints the text bright black}
     */
    public static Attribute BRIGHT_BLACK_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright red}
     */
    public static Attribute BRIGHT_RED_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright green}
     */
    public static Attribute BRIGHT_GREEN_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright yellow}
     */
    public static Attribute BRIGHT_YELLOW_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright blue}
     */
    public static Attribute BRIGHT_BLUE_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright magenta}
     */
    public static Attribute BRIGHT_MAGENTA_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright cyan}
     */
    public static Attribute BRIGHT_CYAN_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the text bright white}
     */
    public static Attribute BRIGHT_WHITE_TEXT() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Bright colors (background)
    /**
     * {@return An Attribute that paints the background bright black}
     */
    public static Attribute BRIGHT_BLACK_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright red}
     */
    public static Attribute BRIGHT_RED_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright green}
     */
    public static Attribute BRIGHT_GREEN_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright yellow}
     */
    public static Attribute BRIGHT_YELLOW_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright blue}
     */
    public static Attribute BRIGHT_BLUE_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright magenta}
     */
    public static Attribute BRIGHT_MAGENTA_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright cyan}
     */
    public static Attribute BRIGHT_CYAN_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return An Attribute that paints the background bright white}
     */
    public static Attribute BRIGHT_WHITE_BACK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Complex colors
    /**
     * Paints the text using an 8-bit color from the 256-color palette.
     *
     * @param colorNumber A number (0-255) that represents an 8-bit color.
     * @return An Attribute that represents a foreground with an 8-bit color.
     */
    public static Attribute TEXT_COLOR(int colorNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
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
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Paints the background using an 8-bit color from the 256-color palette.
     *
     * @param colorNumber A number (0-255) that represents an 8-bit color.
     * @return An Attribute that represents a background with an 8-bit color.
     */
    public static Attribute BACK_COLOR(int colorNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
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
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
