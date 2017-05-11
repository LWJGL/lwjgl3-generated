/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGFree extends Callback implements YGFreeI {

    /** Creates a {@code YGFree} instance from the specified function pointer. */
    public static YGFree create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        YGFreeI instance = Callback.get(functionPointer);
        return instance instanceof YGFree
            ? (YGFree)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code YGFree} instance that delegates to the specified {@code YGFreeI} instance. */
    public static YGFree create(YGFreeI instance) {
        return instance instanceof YGFree
            ? (YGFree)instance
            : new Container(instance.address(), instance);
    }

    protected YGFree() {
        super(SIGNATURE);
    }

    private YGFree(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGFree {

        private final YGFreeI delegate;

        Container(long functionPointer, YGFreeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long ptr) {
            return delegate.invoke(ptr);
        }

    }

}