/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class AIFileWriteProc extends Callback implements AIFileWriteProcI {

    /** Creates a {@code AIFileWriteProc} instance from the specified function pointer. */
    public static AIFileWriteProc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        AIFileWriteProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileWriteProc
            ? (AIFileWriteProc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code AIFileWriteProc} instance that delegates to the specified {@code AIFileWriteProcI} instance. */
    public static AIFileWriteProc create(AIFileWriteProcI instance) {
        return instance instanceof AIFileWriteProc
            ? (AIFileWriteProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileWriteProc() {
        super(SIGNATURE);
    }

    private AIFileWriteProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileWriteProc {

        private final AIFileWriteProcI delegate;

        Container(long functionPointer, AIFileWriteProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pFile, long pBuffer, long memB, long count) {
            return delegate.invoke(pFile, pBuffer, memB, count);
        }

    }

}