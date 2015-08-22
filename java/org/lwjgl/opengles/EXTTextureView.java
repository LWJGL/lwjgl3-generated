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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_texture_view.txt">EXT_texture_view</a> extension.
 * 
 * <p>This extension allows a texture's data store to be "viewed" in multiple ways, either reinterpreting the data format/type as a different format/ type
 * with the same element size, or by clamping the mipmap level range or array slice range.</p>
 * 
 * <p>The goals of this extension are to avoid having these alternate views become shared mutable containers of shared mutable objects, and to add the views
 * to the API in a minimally invasive way.</p>
 * 
 * <p>No new object types are added. Conceptually, a texture object is split into the following parts:
 * <ul>
 * <li>A data store holding texel data.</li>
 * <li>State describing which portions of the data store to use, and how to interpret the data elements.</li>
 * <li>An embedded sampler object.</li>
 * <li>Various other texture parameters.</li>
 * </ul>
 * With this extension, multiple textures can share a data store and have different state describing which portions of the data store to use and how to
 * interpret the data elements. The data store is refcounted and not destroyed until the last texture sharing it is deleted.</p>
 * 
 * <p>This extension leverages the concept of an "immutable texture". Views can only be created of textures created with TexStorage*.</p>
 * 
 * <p>Requires {@link GLES30 GLES E.S}.</p>
 */
public final class EXTTextureView {

	/** Accepted by the {@code pname} parameters of GetTexParameterfv and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_VIEW_MIN_LEVEL_EXT  = 0x82DB,
		GL_TEXTURE_VIEW_NUM_LEVELS_EXT = 0x82DC,
		GL_TEXTURE_VIEW_MIN_LAYER_EXT  = 0x82DD,
		GL_TEXTURE_VIEW_NUM_LAYERS_EXT = 0x82DE,
		GL_TEXTURE_IMMUTABLE_LEVELS    = 0x82DF;

	/** Function address. */
	@JavadocExclude
	public final long TextureViewEXT;

	@JavadocExclude
	public EXTTextureView(FunctionProvider provider) {
		TextureViewEXT = provider.getFunctionAddress("glTextureViewEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTTextureView} instance for the current context. */
	public static EXTTextureView getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTTextureView);
	}

	static EXTTextureView create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_texture_view") ) return null;

		EXTTextureView funcs = new EXTTextureView(provider);
		boolean supported = checkFunctions(
			funcs.TextureViewEXT
		);

		return GLES.checkExtension("GL_EXT_texture_view", funcs, supported);
	}

	// --- [ glTextureViewEXT ] ---

	public static void glTextureViewEXT(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
		long __functionAddress = getInstance().TextureViewEXT;
		callIIIIIIIIV(__functionAddress, texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
	}

}