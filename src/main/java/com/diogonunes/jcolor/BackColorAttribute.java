package com.diogonunes.jcolor;

class BackColorAttribute extends ColorAttribute {

    /**
     * {@inheritDoc}
     */
    BackColorAttribute(int colorNumber) {
        super(colorNumber);
    }

    /**
     * {@inheritDoc}
     */
    BackColorAttribute(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    protected String getColorAnsiPrefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
