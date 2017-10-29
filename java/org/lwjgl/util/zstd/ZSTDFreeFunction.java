/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class ZSTDFreeFunction extends Callback implements ZSTDFreeFunctionI {

    /** Creates a {@code ZSTDFreeFunction} instance from the specified function pointer. */
    public static ZSTDFreeFunction create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ZSTDFreeFunctionI instance = Callback.get(functionPointer);
        return instance instanceof ZSTDFreeFunction
            ? (ZSTDFreeFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ZSTDFreeFunction} instance that delegates to the specified {@code ZSTDFreeFunctionI} instance. */
    public static ZSTDFreeFunction create(ZSTDFreeFunctionI instance) {
        return instance instanceof ZSTDFreeFunction
            ? (ZSTDFreeFunction)instance
            : new Container(instance.address(), instance);
    }

    protected ZSTDFreeFunction() {
        super(SIGNATURE);
    }

    private ZSTDFreeFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ZSTDFreeFunction {

        private final ZSTDFreeFunctionI delegate;

        Container(long functionPointer, ZSTDFreeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long opaque, long address) {
            return delegate.invoke(opaque, address);
        }

    }

}