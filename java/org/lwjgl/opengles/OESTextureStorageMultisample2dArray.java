/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_storage_multisample_2d_array.txt">OES_texture_storage_multisample_2d_array</a> extension.
 * 
 * <p>This extension provides support for a new type of immutable texture, two-dimensional multisample array textures. It depends on functionality introduced
 * in OpenGL ES 3.1 to support two-dimensional multisample (non-array) textures.</p>
 */
public final class OESTextureStorageMultisample2dArray {

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

	/** Function address. */
	@JavadocExclude
	public final long TexStorage3DMultisampleOES;

	@JavadocExclude
	public OESTextureStorageMultisample2dArray(FunctionProvider provider) {
		TexStorage3DMultisampleOES = provider.getFunctionAddress("glTexStorage3DMultisampleOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESTextureStorageMultisample2dArray} instance for the current context. */
	public static OESTextureStorageMultisample2dArray getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESTextureStorageMultisample2dArray);
	}

	static OESTextureStorageMultisample2dArray create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_texture_storage_multisample_2d_array") ) return null;

		OESTextureStorageMultisample2dArray funcs = new OESTextureStorageMultisample2dArray(provider);
		boolean supported = checkFunctions(
			funcs.TexStorage3DMultisampleOES
		);

		return GLES.checkExtension("GL_OES_texture_storage_multisample_2d_array", funcs, supported);
	}

	// --- [ glTexStorage3DMultisampleOES ] ---

	public static void glTexStorage3DMultisampleOES(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().TexStorage3DMultisampleOES;
		callIIIIIIZV(__functionAddress, target, samples, internalformat, width, height, depth, fixedsamplelocations);
	}

}