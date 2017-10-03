/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class RMTFree extends Callback implements RMTFreeI {

    /** Creates a {@code RMTFree} instance from the specified function pointer. */
    public static RMTFree create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        RMTFreeI instance = Callback.get(functionPointer);
        return instance instanceof RMTFree
            ? (RMTFree)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code RMTFree} instance that delegates to the specified {@code RMTFreeI} instance. */
    public static RMTFree create(RMTFreeI instance) {
        return instance instanceof RMTFree
            ? (RMTFree)instance
            : new Container(instance.address(), instance);
    }

    protected RMTFree() {
        super(SIGNATURE);
    }

    private RMTFree(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTFree {

        private final RMTFreeI delegate;

        Container(long functionPointer, RMTFreeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long mm_context, long ptr) {
            return delegate.invoke(mm_context, ptr);
        }

    }

}