/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Prints a debug message.
 * 
 * <p>Not thread safe and it can be called from any thread.</p>
 */
@FunctionalInterface
@NativeType("trace_vargs")
public interface BGFXTraceVarArgsCallbackI extends CallbackI.V {

    String SIGNATURE = "(ppspp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgShort(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Will be called when a debug message is produced.
     *
     * @param _this     the callback interface
     * @param _filePath file path where debug message was generated
     * @param _line     line where debug message was generated
     * @param _format   {@code printf} style format
     * @param _argList  variable arguments list initialized with {@code va_start}
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("char *") long _filePath, @NativeType("uint16_t") short _line, @NativeType("char *") long _format, @NativeType("va_list *") long _argList);

}