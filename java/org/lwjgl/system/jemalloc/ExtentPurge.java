/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ExtentHooks} struct. */
public abstract class ExtentPurge extends Callback implements ExtentPurgeI {

    /** Creates a {@code ExtentPurge} instance from the specified function pointer. */
    public static ExtentPurge create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ExtentPurgeI instance = Callback.get(functionPointer);
        return instance instanceof ExtentPurge
            ? (ExtentPurge)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code ExtentPurge} instance that delegates to the specified {@code ExtentPurgeI} instance. */
    public static ExtentPurge create(ExtentPurgeI instance) {
        return instance instanceof ExtentPurge
            ? (ExtentPurge)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentPurge() {
        super(SIGNATURE);
    }

    private ExtentPurge(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentPurge {

        private final ExtentPurgeI delegate;

        Container(long functionPointer, ExtentPurgeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, long offset, long length, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, offset, length, arena_ind);
        }

    }

}