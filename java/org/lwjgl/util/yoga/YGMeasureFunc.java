/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static java.lang.Float.*;

public abstract class YGMeasureFunc extends Callback implements YGMeasureFuncI {

    /** Creates a {@code YGMeasureFunc} instance from the specified function pointer. */
    public static YGMeasureFunc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        YGMeasureFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGMeasureFunc
            ? (YGMeasureFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code YGMeasureFunc} instance that delegates to the specified {@code YGMeasureFuncI} instance. */
    public static YGMeasureFunc create(YGMeasureFuncI instance) {
        return instance instanceof YGMeasureFunc
            ? (YGMeasureFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGMeasureFunc() {
        super(SIGNATURE);
    }

    private YGMeasureFunc(long functionPointer) {
        super(functionPointer);
    }

    public static long toLong(YGSize size) {
        return floatToRawIntBits(size.width()) | ((long)floatToRawIntBits(size.height()) << 32);
    }

    private static final class Container extends YGMeasureFunc {

        private final YGMeasureFuncI delegate;

        Container(long functionPointer, YGMeasureFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long node, float width, int widthMode, float height, int heightMode) {
            return delegate.invoke(node, width, widthMode, height, heightMode);
        }

    }

}