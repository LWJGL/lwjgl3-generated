/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ExtentHooks} struct. */
public abstract class ExtentDecommit extends Callback implements ExtentDecommitI {

    /** Creates a {@code ExtentDecommit} instance from the specified function pointer. */
    public static ExtentDecommit create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ExtentDecommitI instance = Callback.get(functionPointer);
        return instance instanceof ExtentDecommit
            ? (ExtentDecommit)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ExtentDecommit} instance that delegates to the specified {@code ExtentDecommitI} instance. */
    public static ExtentDecommit create(ExtentDecommitI instance) {
        return instance instanceof ExtentDecommit
            ? (ExtentDecommit)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentDecommit() {
        super(SIGNATURE);
    }

    private ExtentDecommit(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentDecommit {

        private final ExtentDecommitI delegate;

        Container(long functionPointer, ExtentDecommitI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, long offset, long length, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, offset, length, arena_ind);
        }

    }

}