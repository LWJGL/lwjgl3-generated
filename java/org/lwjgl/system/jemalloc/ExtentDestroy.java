/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ExtentHooks} struct. */
public abstract class ExtentDestroy extends Callback implements ExtentDestroyI {

    /** Creates a {@code ExtentDestroy} instance from the specified function pointer. */
    public static ExtentDestroy create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ExtentDestroyI instance = Callback.get(functionPointer);
        return instance instanceof ExtentDestroy
            ? (ExtentDestroy)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ExtentDestroy} instance that delegates to the specified {@code ExtentDestroyI} instance. */
    public static ExtentDestroy create(ExtentDestroyI instance) {
        return instance instanceof ExtentDestroy
            ? (ExtentDestroy)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentDestroy() {
        super(SIGNATURE);
    }

    private ExtentDestroy(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentDestroy {

        private final ExtentDestroyI delegate;

        Container(long functionPointer, ExtentDestroyI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, committed, arena_ind);
        }

    }

}