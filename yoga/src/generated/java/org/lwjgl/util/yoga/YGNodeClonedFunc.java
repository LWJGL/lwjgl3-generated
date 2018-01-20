/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGNodeClonedFunc extends Callback implements YGNodeClonedFuncI {

    /**
     * Creates a {@code YGNodeClonedFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGNodeClonedFunc}
     */
    public static YGNodeClonedFunc create(long functionPointer) {
        YGNodeClonedFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGNodeClonedFunc
            ? (YGNodeClonedFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGNodeClonedFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGNodeClonedFunc} instance that delegates to the specified {@code YGNodeClonedFuncI} instance. */
    public static YGNodeClonedFunc create(YGNodeClonedFuncI instance) {
        return instance instanceof YGNodeClonedFunc
            ? (YGNodeClonedFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGNodeClonedFunc() {
        super(SIGNATURE);
    }

    private YGNodeClonedFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGNodeClonedFunc {

        private final YGNodeClonedFuncI delegate;

        Container(long functionPointer, YGNodeClonedFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long oldNode, long newNode, long parent, int childIndex) {
            delegate.invoke(oldNode, newNode, parent, childIndex);
        }

    }

}