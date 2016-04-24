/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_storage_multisample_2d_array.txt">OES_texture_storage_multisample_2d_array</a> extension.
 * 
 * <p>This extension provides support for a new type of immutable texture, two-dimensional multisample array textures. It depends on functionality introduced
 * in OpenGL ES 3.1 to support two-dimensional multisample (non-array) textures.</p>
 */
public class OESTextureStorageMultisample2DArray {

	/**
	 * Accepted by the {@code target} parameter of BindTexture, TexStorage3DMultisampleOES, GetInternalformativ, TexParameter{if}*, GetTexParameter{if}v and
	 * GetTexLevelParameter{if}v. Also, the texture object indicated by the {@code texture} argument to FramebufferTextureLayer can be
	 * TEXTURE_2D_MULTISAMPLE_ARRAY_OES.
	 */
	public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY_OES = 0x9102;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES = 0x9105;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_2D_MULTISAMPLE_ARRAY_OES              = 0x910B,
		GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES          = 0x910C,
		GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = 0x910D;

	protected OESTextureStorageMultisample2DArray() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glTexStorage3DMultisampleOES
		);
	}

	// --- [ glTexStorage3DMultisampleOES ] ---

	public static void glTexStorage3DMultisampleOES(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		long __functionAddress = GLES.getCapabilities().glTexStorage3DMultisampleOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, samples, internalformat, width, height, depth, fixedsamplelocations);
	}

}