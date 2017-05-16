/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL22#clSetProgramReleaseCallback SetProgramReleaseCallback} method. */
public abstract class CLProgramReleaseCallback extends Callback implements CLProgramReleaseCallbackI {

    /** Creates a {@code CLProgramReleaseCallback} instance from the specified function pointer. */
    public static CLProgramReleaseCallback create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        CLProgramReleaseCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLProgramReleaseCallback
            ? (CLProgramReleaseCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code CLProgramReleaseCallback} instance that delegates to the specified {@code CLProgramReleaseCallbackI} instance. */
    public static CLProgramReleaseCallback create(CLProgramReleaseCallbackI instance) {
        return instance instanceof CLProgramReleaseCallback
            ? (CLProgramReleaseCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLProgramReleaseCallback() {
        super(SIGNATURE);
    }

    private CLProgramReleaseCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLProgramReleaseCallback {

        private final CLProgramReleaseCallbackI delegate;

        Container(long functionPointer, CLProgramReleaseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long program, long user_data) {
            delegate.invoke(program, user_data);
        }

    }

}