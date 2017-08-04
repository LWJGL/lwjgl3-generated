/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ExtentHooks} struct. */
public abstract class ExtentSplit extends Callback implements ExtentSplitI {

    /** Creates a {@code ExtentSplit} instance from the specified function pointer. */
    public static ExtentSplit create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ExtentSplitI instance = Callback.get(functionPointer);
        return instance instanceof ExtentSplit
            ? (ExtentSplit)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ExtentSplit} instance that delegates to the specified {@code ExtentSplitI} instance. */
    public static ExtentSplit create(ExtentSplitI instance) {
        return instance instanceof ExtentSplit
            ? (ExtentSplit)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentSplit() {
        super(SIGNATURE);
    }

    private ExtentSplit(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentSplit {

        private final ExtentSplitI delegate;

        Container(long functionPointer, ExtentSplitI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, long size_a, long size_b, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, size_a, size_b, committed, arena_ind);
        }

    }

}