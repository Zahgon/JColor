package com.diogonunes.jcolor;

/**
 * Provides a fluent API to generate
 * <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI escape sequences</a>
 * by specifying {@link Attribute}s of your format.
 */
public class Ansi {

    /**
     * Default constructor. Ansi is a static-utility class and is not meant to be instantiated.
     */
    public Ansi() {
    }

    // Escape character used to start an ANSI code
    private static final char ESC = 27;

    private static final String NEWLINE = System.getProperty("line.separator");

    /**
     * Every Ansi escape code begins with this PREFIX.
     */
    public static final String PREFIX = ESC + "[";

    /**
     * Two options must be separated by this SEPARATOR.
     */
    public static final String SEPARATOR = ";";

    /**
     * Every Ansi escape code must end with this POSTFIX.
     */
    public static final String POSTFIX = "m";

    /**
     * Shorthand for the Ansi code that resets to the terminal's default format.
     */
    public static final String RESET = PREFIX + Attribute.CLEAR() + POSTFIX;

    /**
     * Generates the ANSI code that applies the given attributes.
     *
     * @param attributes ANSI attributes to format a text.
     * @return The ANSI code that describes all those attributes together.
     */
    public static String generateCode(Attribute... attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates the ANSI code that applies the attributes contained in the given format.
     *
     * @param attributes Object containing format attributes.
     * @return The ANSI code that describes all those attributes together.
     */
    public static String generateCode(AnsiFormat attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates the ANSI code for a terminal command.
     *
     * @param command ANSI command to apply to terminal.
     * @return The ANSI code that describes that command.
     */
    public static String generateCode(Command command) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies a terminal command (e.g. clear screen).
     *
     * @param command Ansi command to apply to terminal.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(Command command) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps each line of the text with the given raw ANSI code and a trailing reset,
     * so the format does not spill into subsequent prints.
     *
     * @param text     String to format.
     * @param ansiCode Ansi code to format each message's lines.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(String text, String ansiCode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps the text with the ANSI code that applies the given attributes.
     *
     * @param text       String to format.
     * @param attributes ANSI attributes to format a text.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(String text, Attribute... attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps the text with the ANSI code defined by the given format.
     *
     * @param text       String to format.
     * @param attributes Object containing format attributes.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(String text, AnsiFormat attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Easter egg. Just an alias of method "colorize".
     *
     * @param text       String to format.
     * @param attributes ANSI attributes to format a text.
     * @return The formatted string, ready to be printed.
     */
    public static String makeItFabulous(String text, Attribute... attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
