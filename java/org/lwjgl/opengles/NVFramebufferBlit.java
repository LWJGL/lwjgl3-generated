/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_framebuffer_blit.txt">NV_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies OpenGL ES 2.0 by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows copying
 * directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some data
 * conversion where allowed.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class NVFramebufferBlit {

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

	protected NVFramebufferBlit() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glBlitFramebufferNV
		);
	}

	// --- [ glBlitFramebufferNV ] ---

	public static void glBlitFramebufferNV(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = GLES.getCapabilities().glBlitFramebufferNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

}