/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ExtentHooks} struct. */
public abstract class ExtentAlloc extends Callback implements ExtentAllocI {

    /** Creates a {@code ExtentAlloc} instance from the specified function pointer. */
    public static ExtentAlloc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ExtentAllocI instance = Callback.get(functionPointer);
        return instance instanceof ExtentAlloc
            ? (ExtentAlloc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ExtentAlloc} instance that delegates to the specified {@code ExtentAllocI} instance. */
    public static ExtentAlloc create(ExtentAllocI instance) {
        return instance instanceof ExtentAlloc
            ? (ExtentAlloc)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentAlloc() {
        super(SIGNATURE);
    }

    private ExtentAlloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentAlloc {

        private final ExtentAllocI delegate;

        Container(long functionPointer, ExtentAllocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long extent_hooks, long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
            return delegate.invoke(extent_hooks, new_addr, size, alignment, zero, commit, arena_ind);
        }

    }

}