/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ExtentHooks} struct. */
public abstract class ExtentDalloc extends Callback implements ExtentDallocI {

    /** Creates a {@code ExtentDalloc} instance from the specified function pointer. */
    public static ExtentDalloc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ExtentDallocI instance = Callback.get(functionPointer);
        return instance instanceof ExtentDalloc
            ? (ExtentDalloc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ExtentDalloc} instance that delegates to the specified {@code ExtentDallocI} instance. */
    public static ExtentDalloc create(ExtentDallocI instance) {
        return instance instanceof ExtentDalloc
            ? (ExtentDalloc)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentDalloc() {
        super(SIGNATURE);
    }

    private ExtentDalloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentDalloc {

        private final ExtentDallocI delegate;

        Container(long functionPointer, ExtentDallocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, committed, arena_ind);
        }

    }

}