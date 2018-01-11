/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGDirtiedFunc extends Callback implements YGDirtiedFuncI {

    /** Creates a {@code YGDirtiedFunc} instance from the specified function pointer. */
    public static YGDirtiedFunc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        YGDirtiedFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGDirtiedFunc
            ? (YGDirtiedFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code YGDirtiedFunc} instance that delegates to the specified {@code YGDirtiedFuncI} instance. */
    public static YGDirtiedFunc create(YGDirtiedFuncI instance) {
        return instance instanceof YGDirtiedFunc
            ? (YGDirtiedFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGDirtiedFunc() {
        super(SIGNATURE);
    }

    private YGDirtiedFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGDirtiedFunc {

        private final YGDirtiedFuncI delegate;

        Container(long functionPointer, YGDirtiedFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long node) {
            delegate.invoke(node);
        }

    }

}