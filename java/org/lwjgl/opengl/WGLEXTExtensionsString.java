/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_extensions_string.txt">WGL_EXT_extensions_string</a> extension. */
public class WGLEXTExtensionsString {

    protected WGLEXTExtensionsString() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(WGLCapabilities caps) {
        return checkFunctions(
            caps.wglGetExtensionsStringEXT
        );
    }

    // --- [ wglGetExtensionsStringEXT ] ---

    /** Unsafe version of: {@link #wglGetExtensionsStringEXT GetExtensionsStringEXT} */
    public static long nwglGetExtensionsStringEXT() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetExtensionsStringEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    /**
     * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be {@code NULL} terminated and
     * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
     * empty string is returned.
     */
    @NativeType("const char *")
    public static String wglGetExtensionsStringEXT() {
        long __result = nwglGetExtensionsStringEXT();
        return memASCII(__result);
    }

}