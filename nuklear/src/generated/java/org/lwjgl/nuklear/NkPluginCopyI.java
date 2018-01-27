/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link NkClipboard} struct.
 * 
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void (*) (
 *     nk_handle handle,
 *     const char *text,
 *     int len
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("nk_plugin_copy")
public interface NkPluginCopyI extends CallbackI.V {

    String SIGNATURE = "(ppi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    void invoke(@NativeType("nk_handle") long handle, @NativeType("const char *") long text, int len);

}