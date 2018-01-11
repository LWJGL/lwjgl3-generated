/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Called when video capture begins. */
@FunctionalInterface
@NativeType("capture_begin")
public interface BGFXCaptureBeginCallbackI extends CallbackI.V {

    String SIGNATURE = "(piiiiB)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgBool(args)
        );
    }

    /**
     * Will be called when video capture begins.
     *
     * @param _this   the callback interface
     * @param _width  image width
     * @param _height image height
     * @param _pitch  number of bytes to skip to next line
     * @param _format texture format
     * @param _yflip  if true image origin is bottom left
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint32_t") int _width, @NativeType("uint32_t") int _height, @NativeType("uint32_t") int _pitch, @NativeType("bgfx_texture_format_t") int _format, @NativeType("bool") boolean _yflip);

}