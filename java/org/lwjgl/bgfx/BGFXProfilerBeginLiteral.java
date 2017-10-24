/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Profiler region begin with string literal name. */
public abstract class BGFXProfilerBeginLiteral extends Callback implements BGFXProfilerBeginLiteralI {

    /** Creates a {@code BGFXProfilerBeginLiteral} instance from the specified function pointer. */
    public static BGFXProfilerBeginLiteral create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        BGFXProfilerBeginLiteralI instance = Callback.get(functionPointer);
        return instance instanceof BGFXProfilerBeginLiteral
            ? (BGFXProfilerBeginLiteral)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code BGFXProfilerBeginLiteral} instance that delegates to the specified {@code BGFXProfilerBeginLiteralI} instance. */
    public static BGFXProfilerBeginLiteral create(BGFXProfilerBeginLiteralI instance) {
        return instance instanceof BGFXProfilerBeginLiteral
            ? (BGFXProfilerBeginLiteral)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXProfilerBeginLiteral() {
        super(SIGNATURE);
    }

    private BGFXProfilerBeginLiteral(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXProfilerBeginLiteral {

        private final BGFXProfilerBeginLiteralI delegate;

        Container(long functionPointer, BGFXProfilerBeginLiteralI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _name, int _abgr, long _filePath, short _line) {
            delegate.invoke(_this, _name, _abgr, _filePath, _line);
        }

    }

}