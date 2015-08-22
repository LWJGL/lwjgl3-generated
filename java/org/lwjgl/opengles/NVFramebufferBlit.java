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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_framebuffer_blit.txt">NV_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies OpenGL ES 2.0 by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows copying
 * directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some data
 * conversion where allowed.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class NVFramebufferBlit {

	/**
	 * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferRenderbuffer, and
	 * GetFramebufferAttachmentParameteriv.
	 */
	public static final int
		GL_READ_FRAMEBUFFER_NV = 0x8CA8,
		GL_DRAW_FRAMEBUFFER_NV = 0x8CA9;

	/** Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv. */
	public static final int
		GL_DRAW_FRAMEBUFFER_BINDING_NV = 0x8CA6,
		GL_READ_FRAMEBUFFER_BINDING_NV = 0x8CAA;

	/** Function address. */
	@JavadocExclude
	public final long BlitFramebufferNV;

	@JavadocExclude
	public NVFramebufferBlit(FunctionProvider provider) {
		BlitFramebufferNV = provider.getFunctionAddress("glBlitFramebufferNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVFramebufferBlit} instance for the current context. */
	public static NVFramebufferBlit getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVFramebufferBlit);
	}

	static NVFramebufferBlit create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_framebuffer_blit") ) return null;

		NVFramebufferBlit funcs = new NVFramebufferBlit(provider);
		boolean supported = checkFunctions(
			funcs.BlitFramebufferNV
		);

		return GLES.checkExtension("GL_NV_framebuffer_blit", funcs, supported);
	}

	// --- [ glBlitFramebufferNV ] ---

	public static void glBlitFramebufferNV(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitFramebufferNV;
		callIIIIIIIIIIV(__functionAddress, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

}