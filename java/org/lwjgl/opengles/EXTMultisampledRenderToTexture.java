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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_multisampled_render_to_texture.txt">EXT_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension introduces functionality to perform multisampled rendering to a color renderable texture, without requiring an explicit resolve of
 * multisample data.</p>
 * 
 * <p>Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
 * high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
 * out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
 * most cases.</p>
 * 
 * <p>The extension provides a new command, FramebufferTexture2DMultisampleEXT, which attaches a texture level to a framebuffer and enables multisampled
 * rendering to that texture level.</p>
 * 
 * <p>When the texture level is flushed or used as a source or destination for any operation other than drawing to it, an implicit resolve of multisampled
 * color data may be performed. After such a resolve, the multisampled color data is discarded.</p>
 * 
 * <p>In order to allow the use of multisampled depth and stencil buffers when performing multisampled rendering to a texture, the extension also adds the
 * command RenderbufferStorageMultisampleEXT.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class EXTMultisampledRenderToTexture {

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
	public static final int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_MAX_SAMPLES_EXT = 0x8D57;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SAMPLES_EXT = 0x8D6C;

	/** Function address. */
	@JavadocExclude
	public final long
		RenderbufferStorageMultisampleEXT,
		FramebufferTexture2DMultisampleEXT;

	@JavadocExclude
	public EXTMultisampledRenderToTexture(FunctionProvider provider) {
		RenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glRenderbufferStorageMultisampleEXT");
		FramebufferTexture2DMultisampleEXT = provider.getFunctionAddress("glFramebufferTexture2DMultisampleEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTMultisampledRenderToTexture} instance for the current context. */
	public static EXTMultisampledRenderToTexture getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTMultisampledRenderToTexture);
	}

	static EXTMultisampledRenderToTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_multisampled_render_to_texture") ) return null;

		EXTMultisampledRenderToTexture funcs = new EXTMultisampledRenderToTexture(provider);
		boolean supported = checkFunctions(
			funcs.RenderbufferStorageMultisampleEXT, funcs.FramebufferTexture2DMultisampleEXT
		);

		return GLES.checkExtension("GL_EXT_multisampled_render_to_texture", funcs, supported);
	}

	// --- [ glRenderbufferStorageMultisampleEXT ] ---

	public static void glRenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisampleEXT;
		callIIIIIV(__functionAddress, target, samples, internalformat, width, height);
	}

	// --- [ glFramebufferTexture2DMultisampleEXT ] ---

	public static void glFramebufferTexture2DMultisampleEXT(int target, int attachment, int textarget, int texture, int level, int samples) {
		long __functionAddress = getInstance().FramebufferTexture2DMultisampleEXT;
		callIIIIIIV(__functionAddress, target, attachment, textarget, texture, level, samples);
	}

}