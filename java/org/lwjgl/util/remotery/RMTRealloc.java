/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class RMTRealloc extends Callback implements RMTReallocI {

    /** Creates a {@code RMTRealloc} instance from the specified function pointer. */
    public static RMTRealloc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        RMTReallocI instance = Callback.get(functionPointer);
        return instance instanceof RMTRealloc
            ? (RMTRealloc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code RMTRealloc} instance that delegates to the specified {@code RMTReallocI} instance. */
    public static RMTRealloc create(RMTReallocI instance) {
        return instance instanceof RMTRealloc
            ? (RMTRealloc)instance
            : new Container(instance.address(), instance);
    }

    protected RMTRealloc() {
        super(SIGNATURE);
    }

    private RMTRealloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTRealloc {

        private final RMTReallocI delegate;

        Container(long functionPointer, RMTReallocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long mm_context, long ptr, int size) {
            return delegate.invoke(mm_context, ptr, size);
        }

    }

}