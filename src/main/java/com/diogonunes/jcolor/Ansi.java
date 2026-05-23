package com.diogonunes.jcolor;

/**
 * Provides a fluent API to generate
 * <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI escape sequences</a>
 * by specifying {@link Attribute}s of your format.
 */
public class Ansi {

    /** Default constructor. Ansi is a static-utility class and is not meant to be instantiated. */
    public Ansi() {
    }

    private static final char ESC = 27; // Escape character used to start an ANSI code
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
        StringBuilder builder = new StringBuilder();

        builder.append(PREFIX);
        for (Object option : attributes) {
            String code = option.toString();
            if (code.equals(""))
                continue;
            builder.append(code);
            builder.append(SEPARATOR);
        }
        builder.append(POSTFIX);

        // because code must not end with SEPARATOR
        return builder.toString().replace(SEPARATOR + POSTFIX, POSTFIX);
    }

    /**
     * Generates the ANSI code that applies the attributes contained in the given format.
     *
     * @param attributes Object containing format attributes.
     * @return The ANSI code that describes all those attributes together.
     */
    public static String generateCode(AnsiFormat attributes) {
        return generateCode(attributes.toArray());
    }

    /**
     * Generates the ANSI code for a terminal command.
     *
     * @param command ANSI command to apply to terminal.
     * @return The ANSI code that describes that command.
     */
    public static String generateCode(Command command) {
        return PREFIX + command;
    }

    /**
     * Applies a terminal command (e.g. clear screen).
     *
     * @param command Ansi command to apply to terminal.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(Command command) {
        return generateCode(command);
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
        StringBuilder output = new StringBuilder();

        /*
         * Every formatted line should:
         * 1) start with a code that sets the format
         * 2) end with a code that resets the format
         * This prevents "spilling" the format to other independent prints, which
         * is noticeable when the background is colored.
         */

        output.append(ansiCode);
        // Each line needs to end the current format (RESET) and start it on the next line.
        // This avoids spilling, ie. a long line without text but formatted background
        String enclosedFormatting = text.replace(NEWLINE, RESET + NEWLINE + ansiCode);
        output.append(enclosedFormatting);
        output.append(RESET);
        return output.toString();
    }

    /**
     * Wraps the text with the ANSI code that applies the given attributes.
     *
     * @param text       String to format.
     * @param attributes ANSI attributes to format a text.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(String text, Attribute... attributes) {
        String ansiCode = generateCode(attributes);
        return colorize(text, ansiCode);
    }

    /**
     * Wraps the text with the ANSI code defined by the given format.
     *
     * @param text       String to format.
     * @param attributes Object containing format attributes.
     * @return The formatted string, ready to be printed.
     */
    public static String colorize(String text, AnsiFormat attributes) {
        return colorize(text, attributes.toArray());
    }

    /**
     * Easter egg. Just an alias of method "colorize".
     *
     * @param text       String to format.
     * @param attributes ANSI attributes to format a text.
     * @return The formatted string, ready to be printed.
     */
    public static String makeItFabulous(String text, Attribute... attributes) {
        return colorize(text, attributes);
    }

}
