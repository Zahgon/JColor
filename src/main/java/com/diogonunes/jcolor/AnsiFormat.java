package com.diogonunes.jcolor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Abstracts an Array of {@link Attribute}s.
 * Use it if you find this more readable than Attribute[].
 */
public class AnsiFormat {

    // Starts with capacity=2 because that's how many attributes are used on average
    private final ArrayList<Attribute> _attributes = new ArrayList<>(2);

    /**
     * Creates a new format that bundles the given attributes.
     *
     * @param attributes All ANSI attributes to format a text.
     */
    public AnsiFormat(Attribute... attributes) {
        _attributes.addAll(Arrays.asList(attributes));
    }

    /**
     * Wraps the given text with the ANSI code defined by this format.
     *
     * @param text String to format.
     * @return The formatted string, ready to be printed.
     */
    public String format(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@return the attributes of this format as an array}
     */
    protected Attribute[] toArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
