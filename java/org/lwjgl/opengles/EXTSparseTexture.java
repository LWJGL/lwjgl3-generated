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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_sparse_texture.txt">EXT_sparse_texture</a> extension.
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
 * <p>Requires {@link GLES31 GLES E.S}.</p>
 */
public final class EXTSparseTexture {

	/**
	 * Accepted by the {@code pname} parameter to TexParameter{if}{v}, GetTexParameter{if}v, TexParameterI{u}ivOES, GetTexParameterI{u}ivOES
	 * TexParameterI{u}ivEXT, and GetTexParameterI{u}ivEXT.
	 */
	public static final int
		GL_TEXTURE_SPARSE_EXT          = 0x91A6,
		GL_VIRTUAL_PAGE_SIZE_INDEX_EXT = 0x91A7;

	/** Accepted by the {@code pname} parameter of GetTexParameter{if}v, GetTexParameterIi{u}vOES, and GetTexParameterIi{u}vEXT. */
	public static final int GL_NUM_SPARSE_LEVELS_EXT = 0x91AA;

	/** Accepted by the {@code pname} parameter to GetInternalformativ. */
	public static final int
		GL_NUM_VIRTUAL_PAGE_SIZES_EXT = 0x91A8,
		GL_VIRTUAL_PAGE_SIZE_X_EXT    = 0x9195,
		GL_VIRTUAL_PAGE_SIZE_Y_EXT    = 0x9196,
		GL_VIRTUAL_PAGE_SIZE_Z_EXT    = 0x9197;

	/** Accepted by the {@code target} parameter to GetInternalformativ. */
	public static final int
		GL_TEXTURE_2D                 = 0xDE1,
		GL_TEXTURE_2D_ARRAY           = 0x8C1A,
		GL_TEXTURE_CUBE_MAP           = 0x8513,
		GL_TEXTURE_CUBE_MAP_ARRAY_OES = 0x9009,
		GL_TEXTURE_3D                 = 0x806F;

	/** Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetInteger64v, and GetBooleanv. */
	public static final int
		GL_MAX_SPARSE_TEXTURE_SIZE_EXT                = 0x9198,
		GL_MAX_SPARSE_3D_TEXTURE_SIZE_EXT             = 0x9199,
		GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_EXT        = 0x919A,
		GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_EXT = 0x91A9;

	/** Function address. */
	@JavadocExclude
	public final long TexPageCommitmentARB;

	@JavadocExclude
	public EXTSparseTexture(FunctionProvider provider) {
		TexPageCommitmentARB = provider.getFunctionAddress("glTexPageCommitmentARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTSparseTexture} instance for the current context. */
	public static EXTSparseTexture getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTSparseTexture);
	}

	static EXTSparseTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_sparse_texture") ) return null;

		EXTSparseTexture funcs = new EXTSparseTexture(provider);
		boolean supported = checkFunctions(
			funcs.TexPageCommitmentARB
		);

		return GLES.checkExtension("GL_EXT_sparse_texture", funcs, supported);
	}

	// --- [ glTexPageCommitmentARB ] ---

	public static void glTexPageCommitmentARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, boolean commit) {
		long __functionAddress = getInstance().TexPageCommitmentARB;
		callIIIIIIIIZV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, commit);
	}

}