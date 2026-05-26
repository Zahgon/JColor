package com.diogonunes.jcolor;

/**
 * Abstracts ANSI codes with intuitive names. It maps a command (e.g. CLEAR_SCREEN) with a code.
 */
public class Command {

    private final String _code;

    /**
     * Constructor. Maps a command to an Ansi code.
     *
     * @param code Ansi code that represents the command.
     */
    Command(String code) {
        _code = code;
    }

    /**
     * {@return A Command that clears the terminal's text, equivalent to the command-line `clear`}
     */
    public static Command CLEAR_SCREEN() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
