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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/ANGLE/ANGLE_framebuffer_blit.txt">ANGLE_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies framebuffer objects by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows copying
 * directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some data
 * conversion where allowed.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class ANGLEFramebufferBlit {

	/**
	 * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferTexture3DOES,
	 * FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.
	 */
	public static final int
		GL_READ_FRAMEBUFFER_ANGLE = 0x8CA8,
		GL_DRAW_FRAMEBUFFER_ANGLE = 0x8CA9;

	/** Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv. */
	public static final int
		GL_DRAW_FRAMEBUFFER_BINDING_ANGLE = 0x8CA6,
		GL_READ_FRAMEBUFFER_BINDING_ANGLE = 0x8CAA;

	/** Function address. */
	@JavadocExclude
	public final long BlitFramebufferANGLE;

	@JavadocExclude
	public ANGLEFramebufferBlit(FunctionProvider provider) {
		BlitFramebufferANGLE = provider.getFunctionAddress("glBlitFramebufferANGLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ANGLEFramebufferBlit} instance for the current context. */
	public static ANGLEFramebufferBlit getInstance() {
		return checkFunctionality(GLES.getCapabilities().__ANGLEFramebufferBlit);
	}

	static ANGLEFramebufferBlit create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ANGLE_framebuffer_blit") ) return null;

		ANGLEFramebufferBlit funcs = new ANGLEFramebufferBlit(provider);
		boolean supported = checkFunctions(
			funcs.BlitFramebufferANGLE
		);

		return GLES.checkExtension("GL_ANGLE_framebuffer_blit", funcs, supported);
	}

	// --- [ glBlitFramebufferANGLE ] ---

	public static void glBlitFramebufferANGLE(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitFramebufferANGLE;
		callIIIIIIIIIIV(__functionAddress, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

}