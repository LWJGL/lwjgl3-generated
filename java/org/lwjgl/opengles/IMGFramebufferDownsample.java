/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/IMG/IMG_framebuffer_downsample.txt">IMG_framebuffer_downsample</a> extension.
 * 
 * <p>This extension introduces the ability to attach color buffers to a framebuffer that are at a lower resolution than the framebuffer itself, with the GPU
 * automatically downsampling the color attachment to fit.</p>
 * 
 * <p>This can be useful for various post-process rendering techniques where it is desirable to generate downsampled images in an efficient manner, or for a
 * lower resolution post-process technique.</p>
 * 
 * <p>This extension exposes at least a 2 x 2 downscale. Other downsampling modes may be exposed on the system and this can be queried.</p>
 */
public class IMGFramebufferDownsample {

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_AND_DOWNSAMPLE_IMG = 0x913C;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetInteger64v, and GetInternalFormativ. */
	public static final int GL_NUM_DOWNSAMPLE_SCALES_IMG = 0x913D;

	/** Accepted by the {@code target} parameter of GetIntegerv, GetInteger64v, GetIntegeri_v, GetInteger64i_v and GetInternalFormativ. */
	public static final int GL_DOWNSAMPLE_SCALES_IMG = 0x913E;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SCALE_IMG = 0x913F;

	/** Function address. */
	@JavadocExclude
	public final long
		FramebufferTexture2DDownsampleIMG,
		FramebufferTextureLayerDownsampleIMG;

	@JavadocExclude
	protected IMGFramebufferDownsample() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public IMGFramebufferDownsample(FunctionProvider provider) {
		FramebufferTexture2DDownsampleIMG = provider.getFunctionAddress("glFramebufferTexture2DDownsampleIMG");
		FramebufferTextureLayerDownsampleIMG = provider.getFunctionAddress("glFramebufferTextureLayerDownsampleIMG");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link IMGFramebufferDownsample} instance of the current context. */
	public static IMGFramebufferDownsample getInstance() {
		return getInstance(GLES.getCapabilities());
	}

	/** Returns the {@link IMGFramebufferDownsample} instance of the specified {@link GLESCapabilities}. */
	public static IMGFramebufferDownsample getInstance(GLESCapabilities caps) {
		return checkFunctionality(caps.__IMGFramebufferDownsample);
	}

	static IMGFramebufferDownsample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_IMG_framebuffer_downsample") ) return null;

		IMGFramebufferDownsample funcs = new IMGFramebufferDownsample(provider);
		boolean supported = checkFunctions(
			funcs.FramebufferTexture2DDownsampleIMG, funcs.FramebufferTextureLayerDownsampleIMG
		);

		return GLES.checkExtension("GL_IMG_framebuffer_downsample", funcs, supported);
	}

	// --- [ glFramebufferTexture2DDownsampleIMG ] ---

	public static void glFramebufferTexture2DDownsampleIMG(int target, int attachment, int textarget, int texture, int level, int xscale, int yscale) {
		long __functionAddress = getInstance().FramebufferTexture2DDownsampleIMG;
		callIIIIIIIV(__functionAddress, target, attachment, textarget, texture, level, xscale, yscale);
	}

	// --- [ glFramebufferTextureLayerDownsampleIMG ] ---

	public static void glFramebufferTextureLayerDownsampleIMG(int target, int attachment, int texture, int level, int layer, int xscale, int yscale) {
		long __functionAddress = getInstance().FramebufferTextureLayerDownsampleIMG;
		callIIIIIIIV(__functionAddress, target, attachment, texture, level, layer, xscale, yscale);
	}

}