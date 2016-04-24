/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_shader_pixel_local_storage2.txt">EXT_shader_pixel_local_storage2</a> extension.
 * 
 * <p>This extension builds on {@link EXTShaderPixelLocalStorage EXT_shader_pixel_local_storage} by lifting the restriction that pixel local storage is not supported when rendering to
 * multiple draw buffers.</p>
 * 
 * <p>Moreover, pixel local storage values are no longer lost when writing to user-defined fragment outputs, and, correspondingly, framebuffer pixel values
 * do not always become undefined when the shader writes to pixel local storage.</p>
 * 
 * <p>This extension adds the following capabilities:</p>
 * 
 * <ul>
 * <li>support for pixel local storage in combination with multiple user-defined fragment outputs</li>
 * <li>support for clearing pixel local storage variables</li>
 * <li>support for multi-word pixel local storage variables</li>
 * </ul>
 */
public class EXTShaderPixelLocalStorage2 {

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, or GetFloatv. */
	public static final int
		GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_FAST_SIZE_EXT = 0x9650,
		GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_SIZE_EXT      = 0x9651;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_INSUFFICIENT_SHADER_COMBINED_LOCAL_STORAGE_EXT = 0x9652;

	protected EXTShaderPixelLocalStorage2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glFramebufferPixelLocalStorageSizeEXT, caps.glGetFramebufferPixelLocalStorageSizeEXT, caps.glClearPixelLocalStorageuiEXT
		);
	}

	// --- [ glFramebufferPixelLocalStorageSizeEXT ] ---

	public static void glFramebufferPixelLocalStorageSizeEXT(int target, int size) {
		long __functionAddress = GLES.getCapabilities().glFramebufferPixelLocalStorageSizeEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, size);
	}

	// --- [ glGetFramebufferPixelLocalStorageSizeEXT ] ---

	public static int glGetFramebufferPixelLocalStorageSizeEXT(int target) {
		long __functionAddress = GLES.getCapabilities().glGetFramebufferPixelLocalStorageSizeEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress, target);
	}

	// --- [ glClearPixelLocalStorageuiEXT ] ---

	public static void nglClearPixelLocalStorageuiEXT(int offset, int n, long values) {
		long __functionAddress = GLES.getCapabilities().glClearPixelLocalStorageuiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, offset, n, values);
	}

	public static void glClearPixelLocalStorageuiEXT(int offset, IntBuffer values) {
		nglClearPixelLocalStorageuiEXT(offset, values.remaining(), memAddress(values));
	}

	/** Array version of: {@link #glClearPixelLocalStorageuiEXT ClearPixelLocalStorageuiEXT} */
	public static void glClearPixelLocalStorageuiEXT(int offset, int[] values) {
		long __functionAddress = GLES.getCapabilities().glClearPixelLocalStorageuiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, offset, values.length, values);
	}

}