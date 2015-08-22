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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/IMG/IMG_multisampled_render_to_texture.txt">IMG_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension introduces functionality to perform multisampled rendering to a color renderable texture, without requiring an explicit resolve of
 * multisample data.</p>
 * 
 * <p>Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
 * high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
 * out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
 * most cases.</p>
 * 
 * <p>The extension provides a new command, FramebufferTexture2DMultisampleIMG, which attaches a texture level to a framebuffer and enables multisampled
 * rendering to that texture level.</p>
 * 
 * <p>When the texture level is used as a source or destination for any operation other than drawing to it, an implicit resolve of multisampled color data is
 * performed. After such a resolve, the multisampled color data is discarded.</p>
 * 
 * <p>In order to allow the use of multisampled depth and stencil buffers when performing multisampled rendering to a texture, the extension also adds the
 * command RenderbufferStorageMultisampleIMG.</p>
 */
public final class IMGMultisampledRenderToTexture {

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
	public static final int GL_RENDERBUFFER_SAMPLES_IMG = 0x9133;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG = 0x9134;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_MAX_SAMPLES_IMG = 0x9135;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int GL_TEXTURE_SAMPLES_IMG = 0x9136;

	/** Function address. */
	@JavadocExclude
	public final long
		RenderbufferStorageMultisampleIMG,
		FramebufferTexture2DMultisampleIMG;

	@JavadocExclude
	public IMGMultisampledRenderToTexture(FunctionProvider provider) {
		RenderbufferStorageMultisampleIMG = provider.getFunctionAddress("glRenderbufferStorageMultisampleIMG");
		FramebufferTexture2DMultisampleIMG = provider.getFunctionAddress("glFramebufferTexture2DMultisampleIMG");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link IMGMultisampledRenderToTexture} instance for the current context. */
	public static IMGMultisampledRenderToTexture getInstance() {
		return checkFunctionality(GLES.getCapabilities().__IMGMultisampledRenderToTexture);
	}

	static IMGMultisampledRenderToTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_IMG_multisampled_render_to_texture") ) return null;

		IMGMultisampledRenderToTexture funcs = new IMGMultisampledRenderToTexture(provider);
		boolean supported = checkFunctions(
			funcs.RenderbufferStorageMultisampleIMG, funcs.FramebufferTexture2DMultisampleIMG
		);

		return GLES.checkExtension("GL_IMG_multisampled_render_to_texture", funcs, supported);
	}

	// --- [ glRenderbufferStorageMultisampleIMG ] ---

	public static void glRenderbufferStorageMultisampleIMG(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisampleIMG;
		callIIIIIV(__functionAddress, target, samples, internalformat, width, height);
	}

	// --- [ glFramebufferTexture2DMultisampleIMG ] ---

	public static void glFramebufferTexture2DMultisampleIMG(int target, int attachment, int textarget, int texture, int level, int samples) {
		long __functionAddress = getInstance().FramebufferTexture2DMultisampleIMG;
		callIIIIIIV(__functionAddress, target, attachment, textarget, texture, level, samples);
	}

}