/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/external_objects_win32.txt">EXT_semaphore_win32</a> extension.
 * 
 * <p>Building upon the OpenGL memory object and semaphore framework defined in <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/external_objects.txt">EXT_external_objects</a>, this extension enables an
 * OpenGL application to import a memory object or semaphore from a Win32 NT handle or a KMT share handle.</p>
 */
public class EXTSemaphoreWin32 {

    /**
     * Accepted by the {@code handleType} parameter of {@link EXTMemoryObjectWin32#glImportMemoryWin32HandleEXT ImportMemoryWin32HandleEXT}, {@link EXTMemoryObjectWin32#glImportMemoryWin32NameEXT ImportMemoryWin32NameEXT}, {@link #glImportSemaphoreWin32HandleEXT ImportSemaphoreWin32HandleEXT}, and
     * {@link #glImportSemaphoreWin32NameEXT ImportSemaphoreWin32NameEXT}.
     */
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;

    /** Accepted by the {@code handleType} parameter of {@link EXTMemoryObjectWin32#glImportMemoryWin32HandleEXT ImportMemoryWin32HandleEXT} and {@link #glImportSemaphoreWin32HandleEXT ImportSemaphoreWin32HandleEXT}. */
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;

    /**
     * Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, GetBooleani_v, GetIntegeri_v, GetFloati_v,
     * GetDoublei_v, and GetInteger64i_v.
     */
    public static final int
        GL_DEVICE_LUID_EXT      = 0x9599,
        GL_DEVICE_NODE_MASK_EXT = 0x959A;

    /** Constant values. */
    public static final int GL_LUID_SIZE_EXT = 8;

    /** Accepted by the {@code handleType} parameter of {@link #glImportSemaphoreWin32HandleEXT ImportSemaphoreWin32HandleEXT}. */
    public static final int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 0x9594;

    /** Accepted by the {@code pname} parameter of {@link EXTSemaphore#glSemaphoreParameterui64vEXT SemaphoreParameterui64vEXT} and {@link EXTSemaphore#glGetSemaphoreParameterui64vEXT GetSemaphoreParameterui64vEXT}. */
    public static final int GL_D3D12_FENCE_VALUE_EXT = 0x9595;

    static { GL.initialize(); }

    protected EXTSemaphoreWin32() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glImportSemaphoreWin32HandleEXT, caps.glImportSemaphoreWin32NameEXT
        );
    }

    // --- [ glImportSemaphoreWin32HandleEXT ] ---

    public static native void nglImportSemaphoreWin32HandleEXT(int semaphore, int handleType, long handle);

    public static void glImportSemaphoreWin32HandleEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        nglImportSemaphoreWin32HandleEXT(semaphore, handleType, handle);
    }

    // --- [ glImportSemaphoreWin32NameEXT ] ---

    public static native void nglImportSemaphoreWin32NameEXT(int semaphore, int handleType, long name);

    public static void glImportSemaphoreWin32NameEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("const void *") long name) {
        if (CHECKS) {
            check(name);
        }
        nglImportSemaphoreWin32NameEXT(semaphore, handleType, name);
    }

}