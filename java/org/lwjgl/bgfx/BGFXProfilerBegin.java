/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Profiler region begin. */
public abstract class BGFXProfilerBegin extends Callback implements BGFXProfilerBeginI {

    /** Creates a {@code BGFXProfilerBegin} instance from the specified function pointer. */
    public static BGFXProfilerBegin create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        BGFXProfilerBeginI instance = Callback.get(functionPointer);
        return instance instanceof BGFXProfilerBegin
            ? (BGFXProfilerBegin)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code BGFXProfilerBegin} instance that delegates to the specified {@code BGFXProfilerBeginI} instance. */
    public static BGFXProfilerBegin create(BGFXProfilerBeginI instance) {
        return instance instanceof BGFXProfilerBegin
            ? (BGFXProfilerBegin)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXProfilerBegin() {
        super(SIGNATURE);
    }

    private BGFXProfilerBegin(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXProfilerBegin {

        private final BGFXProfilerBeginI delegate;

        Container(long functionPointer, BGFXProfilerBeginI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _name, int _abgr, long _filePath, short _line) {
            delegate.invoke(_this, _name, _abgr, _filePath, _line);
        }

    }

}