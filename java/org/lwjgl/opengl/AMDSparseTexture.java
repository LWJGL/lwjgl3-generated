/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/sparse_texture.txt">AMD_sparse_texture</a> extension.
 * 
 * <p>Recent advances in application complexity and a desire for higher resolutions have pushed texture sizes up considerably. Often, the amount of physical
 * memory available to a graphics processor is a limiting factor in the performance of texture-heavy applications. Once the available physical memory is
 * exhausted, paging may occur bringing performance down considerably - or worse, the application may fail. Nevertheless, the amount of address space
 * available to the graphics processor has increased to the point where many gigabytes - or even terabytes of address space may be usable even though that
 * amount of physical memory is not present.</p>
 * 
 * <p>This extension allows the separation of the graphics processor's address space (reservation) from the requirement that all textures must be physically
 * backed (commitment). This exposes a limited form of virtualization for textures. Use cases include sparse (or partially resident) textures, texture
 * paging, on-demand and delayed loading of texture assets and application controlled level of detail.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBFragmentShader ARB_fragment_shader}.</p>
 */
public final class AMDSparseTexture {

	/** Accepted by the {@code flags} parameter to TexStorageSparseAMD and TextureStorageSparseAMD. */
	public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x1;

	/** Accepted by the {@code pname} parameter to GetInternalformativ. */
	public static final int
		GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195,
		GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196,
		GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;

	/** Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetDoublev, GetInteger64v, and GetBooleanv. */
	public static final int
		GL_MAX_SPARSE_TEXTURE_SIZE_AMD     = 0x9198,
		GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD  = 0x9199,
		GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;

	/** Accepted by the {@code pname} parameter of GetTexParameter{if}v. */
	public static final int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;

	/** Accepted by the {@code pname} parameter of TexParameter{if}{v} and GetTexParameter{if}v. */
	public static final int GL_MIN_LOD_WARNING_AMD = 0x919C;

	/** Function address. */
	@JavadocExclude
	public final long
		TexStorageSparseAMD,
		TextureStorageSparseAMD;

	@JavadocExclude
	public AMDSparseTexture(FunctionProvider provider) {
		TexStorageSparseAMD = provider.getFunctionAddress("glTexStorageSparseAMD");
		TextureStorageSparseAMD = provider.getFunctionAddress("glTextureStorageSparseAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDSparseTexture} instance for the current context. */
	public static AMDSparseTexture getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDSparseTexture);
	}

	static AMDSparseTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_sparse_texture") ) return null;

		AMDSparseTexture funcs = new AMDSparseTexture(provider);

		boolean supported = checkFunctions(
			funcs.TexStorageSparseAMD, funcs.TextureStorageSparseAMD
		);

		return GL.checkExtension("GL_AMD_sparse_texture", funcs, supported);
	}

	// --- [ glTexStorageSparseAMD ] ---

	public static void glTexStorageSparseAMD(int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
		long __functionAddress = getInstance().TexStorageSparseAMD;
		callIIIIIIIV(__functionAddress, target, internalFormat, width, height, depth, layers, flags);
	}

	// --- [ glTextureStorageSparseAMD ] ---

	public static void glTextureStorageSparseAMD(int texture, int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
		long __functionAddress = getInstance().TextureStorageSparseAMD;
		callIIIIIIIIV(__functionAddress, texture, target, internalFormat, width, height, depth, layers, flags);
	}

}