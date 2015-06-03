/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/texture_storage.txt">ARB_texture_storage</a> extension.
 * 
 * <p>The texture image specification commands in OpenGL allow each level to be separately specified with different sizes, formats, types and so on, and only
 * imposes consistency checks at draw time. This adds overhead for implementations.</p>
 * 
 * <p>This extension provides a mechanism for specifying the entire structure of a texture in a single call, allowing certain consistency checks and memory
 * allocations to be done up front. Once specified, the format and dimensions of the image array become immutable, to simplify completeness checks in the
 * implementation.</p>
 * 
 * <p>When using this extension, it is no longer possible to supply texture data using TexImage*. Instead, data can be uploaded using TexSubImage*, or
 * produced by other means (such as render-to-texture, mipmap generation, or rendering to a sibling EGLImage).</p>
 * 
 * <p>This extension has complicated interactions with other extensions. The goal of most of these interactions is to ensure that a texture is always mipmap
 * complete (and cube complete for cubemap textures).</p>
 * 
 * <p>Requires {@link GL12 OpenGL 1.2}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBTextureStorage {

	/** Accepted by the {@code value} parameter of GetTexParameter{if}v. */
	public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

	/** Function address. */
	@JavadocExclude
	public final long
		TexStorage1D,
		TexStorage2D,
		TexStorage3D,
		TextureStorage1DEXT,
		TextureStorage2DEXT,
		TextureStorage3DEXT;

	@JavadocExclude
	public ARBTextureStorage(FunctionProvider provider) {
		TexStorage1D = provider.getFunctionAddress("glTexStorage1D");
		TexStorage2D = provider.getFunctionAddress("glTexStorage2D");
		TexStorage3D = provider.getFunctionAddress("glTexStorage3D");
		TextureStorage1DEXT = provider.getFunctionAddress("glTextureStorage1DEXT");
		TextureStorage2DEXT = provider.getFunctionAddress("glTextureStorage2DEXT");
		TextureStorage3DEXT = provider.getFunctionAddress("glTextureStorage3DEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTextureStorage} instance for the current context. */
	public static ARBTextureStorage getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTextureStorage);
	}

	static ARBTextureStorage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_texture_storage") ) return null;

		ARBTextureStorage funcs = new ARBTextureStorage(provider);

		boolean supported = checkFunctions(
			funcs.TexStorage1D, funcs.TexStorage2D, funcs.TexStorage3D, ext.contains("GL_EXT_direct_state_access") ? funcs.TextureStorage1DEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.TextureStorage2DEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.TextureStorage3DEXT : -1L
		);

		return GL.checkExtension("GL_ARB_texture_storage", funcs, supported);
	}

	// --- [ glTexStorage1D ] ---

	/**
	 * Simultaneously specifies storage for all levels of a one-dimensional texture.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 */
	public static void glTexStorage1D(int target, int levels, int internalformat, int width) {
		long __functionAddress = getInstance().TexStorage1D;
		GL42.nglTexStorage1D(target, levels, internalformat, width, __functionAddress);
	}

	// --- [ glTexStorage2D ] ---

	/**
	 * Simultaneously specifies storage for all levels of a two-dimensional or one-dimensional array texture.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 */
	public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
		long __functionAddress = getInstance().TexStorage2D;
		GL42.nglTexStorage2D(target, levels, internalformat, width, height, __functionAddress);
	}

	// --- [ glTexStorage3D ] ---

	/**
	 * Simultaneously specifies storage for all levels of a three-dimensional, two-dimensional array or cube-map array texture.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 * @param depth          the depth of the texture, in texels
	 */
	public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
		long __functionAddress = getInstance().TexStorage3D;
		GL42.nglTexStorage3D(target, levels, internalformat, width, height, depth, __functionAddress);
	}

	// --- [ glTextureStorage1DEXT ] ---

	/** JNI method for {@link #glTextureStorage1DEXT TextureStorage1DEXT} */
	@JavadocExclude
	public static native void nglTextureStorage1DEXT(int texture, int target, int levels, int internalformat, int width, long __functionAddress);

	/**
	 * DSA version of {@link #glTexStorage1D TexStorage1D}.
	 *
	 * @param texture        the texture object to update
	 * @param target         the target of the operation. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 */
	public static void glTextureStorage1DEXT(int texture, int target, int levels, int internalformat, int width) {
		long __functionAddress = getInstance().TextureStorage1DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureStorage1DEXT(texture, target, levels, internalformat, width, __functionAddress);
	}

	// --- [ glTextureStorage2DEXT ] ---

	/** JNI method for {@link #glTextureStorage2DEXT TextureStorage2DEXT} */
	@JavadocExclude
	public static native void nglTextureStorage2DEXT(int texture, int target, int levels, int internalformat, int width, int height, long __functionAddress);

	/**
	 * DSA version of {@link #glTexStorage2D TexStorage2D}.
	 *
	 * @param texture        the texture object to update
	 * @param target         the target of the operation. One of:<br>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 */
	public static void glTextureStorage2DEXT(int texture, int target, int levels, int internalformat, int width, int height) {
		long __functionAddress = getInstance().TextureStorage2DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureStorage2DEXT(texture, target, levels, internalformat, width, height, __functionAddress);
	}

	// --- [ glTextureStorage3DEXT ] ---

	/** JNI method for {@link #glTextureStorage3DEXT TextureStorage3DEXT} */
	@JavadocExclude
	public static native void nglTextureStorage3DEXT(int texture, int target, int levels, int internalformat, int width, int height, int depth, long __functionAddress);

	/**
	 * DSA version of {@link #glTexStorage3D TexStorage3D}.
	 *
	 * @param texture        the texture object to update
	 * @param target         the target of the operation. One of:<br>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 * @param depth          the depth of the texture, in texels
	 */
	public static void glTextureStorage3DEXT(int texture, int target, int levels, int internalformat, int width, int height, int depth) {
		long __functionAddress = getInstance().TextureStorage3DEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTextureStorage3DEXT(texture, target, levels, internalformat, width, height, depth, __functionAddress);
	}

}