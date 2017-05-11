/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class AIFileTellProc extends Callback implements AIFileTellProcI {

    /** Creates a {@code AIFileTellProc} instance from the specified function pointer. */
    public static AIFileTellProc create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        AIFileTellProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileTellProc
            ? (AIFileTellProc)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code AIFileTellProc} instance that delegates to the specified {@code AIFileTellProcI} instance. */
    public static AIFileTellProc create(AIFileTellProcI instance) {
        return instance instanceof AIFileTellProc
            ? (AIFileTellProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileTellProc() {
        super(SIGNATURE);
    }

    private AIFileTellProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileTellProc {

        private final AIFileTellProcI delegate;

        Container(long functionPointer, AIFileTellProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pFile) {
            return delegate.invoke(pFile);
        }

    }

}