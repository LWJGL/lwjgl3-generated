/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class AILogStreamCallback extends Callback implements AILogStreamCallbackI {

    /** Creates a {@code AILogStreamCallback} instance from the specified function pointer. */
    public static AILogStreamCallback create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        AILogStreamCallbackI instance = Callback.get(functionPointer);
        return instance instanceof AILogStreamCallback
            ? (AILogStreamCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code AILogStreamCallback} instance that delegates to the specified {@code AILogStreamCallbackI} instance. */
    public static AILogStreamCallback create(AILogStreamCallbackI instance) {
        return instance instanceof AILogStreamCallback
            ? (AILogStreamCallback)instance
            : new Container(instance.address(), instance);
    }

    protected AILogStreamCallback() {
        super(SIGNATURE);
    }

    private AILogStreamCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AILogStreamCallback {

        private final AILogStreamCallbackI delegate;

        Container(long functionPointer, AILogStreamCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long message, long user) {
            delegate.invoke(message, user);
        }

    }

}