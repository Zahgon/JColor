package com.diogonunes.jcolor;

class TextColorAttribute extends ColorAttribute {

    /**
     * {@inheritDoc}
     */
    TextColorAttribute(int colorNumber) {
        super(colorNumber);
    }

    /**
     * {@inheritDoc}
     */
    TextColorAttribute(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    protected String getColorAnsiPrefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
