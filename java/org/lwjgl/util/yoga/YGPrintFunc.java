/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGPrintFunc extends Callback implements YGPrintFuncI {

    /** Creates a {@code YGPrintFunc} instance from the specified function pointer. */
    public static YGPrintFunc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        YGPrintFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGPrintFunc
            ? (YGPrintFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code YGPrintFunc} instance that delegates to the specified {@code YGPrintFuncI} instance. */
    public static YGPrintFunc create(YGPrintFuncI instance) {
        return instance instanceof YGPrintFunc
            ? (YGPrintFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGPrintFunc() {
        super(SIGNATURE);
    }

    private YGPrintFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGPrintFunc {

        private final YGPrintFuncI delegate;

        Container(long functionPointer, YGPrintFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long node) {
            delegate.invoke(node);
        }

    }

}