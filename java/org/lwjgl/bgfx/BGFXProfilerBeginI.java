/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Profiler region begin. */
@FunctionalInterface
@NativeType("profiler_begin")
public interface BGFXProfilerBeginI extends CallbackI.V {

    String SIGNATURE = "(ppips)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgShort(args)
        );
    }

    /**
     * Will be called when a profiler region begins.
     * 
     * <p>Not thread safe and it can be called from any thread.</p>
     *
     * @param _this     the callback interface
     * @param _name     region name, contains dynamic string
     * @param _abgr     color of profiler region
     * @param _filePath file path where {@code profilerBegin} was called
     * @param _line     line where {@code profilerBegin} was called
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("const char *") long _name, @NativeType("uint32_t") int _abgr, @NativeType("const char *") long _filePath, @NativeType("uint16_t") short _line);

}