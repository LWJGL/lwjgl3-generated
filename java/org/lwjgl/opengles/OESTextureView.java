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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_view.txt">OES_texture_view</a> extension.
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
 * <p>Requires {@link GLES31 GLES E.S}.</p>
 */
public final class OESTextureView {

	/** Accepted by the {@code pname} parameters of GetTexParameterfv and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_VIEW_MIN_LEVEL_OES  = 0x82DB,
		GL_TEXTURE_VIEW_NUM_LEVELS_OES = 0x82DC,
		GL_TEXTURE_VIEW_MIN_LAYER_OES  = 0x82DD,
		GL_TEXTURE_VIEW_NUM_LAYERS_OES = 0x82DE,
		GL_TEXTURE_IMMUTABLE_LEVELS    = 0x82DF;

	/** Function address. */
	@JavadocExclude
	public final long TextureViewOES;

	@JavadocExclude
	public OESTextureView(FunctionProvider provider) {
		TextureViewOES = provider.getFunctionAddress("glTextureViewOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESTextureView} instance for the current context. */
	public static OESTextureView getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESTextureView);
	}

	static OESTextureView create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_texture_view") ) return null;

		OESTextureView funcs = new OESTextureView(provider);
		boolean supported = checkFunctions(
			funcs.TextureViewOES
		);

		return GLES.checkExtension("GL_OES_texture_view", funcs, supported);
	}

	// --- [ glTextureViewOES ] ---

	public static void glTextureViewOES(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
		long __functionAddress = getInstance().TextureViewOES;
		callIIIIIIIIV(__functionAddress, texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
	}

}