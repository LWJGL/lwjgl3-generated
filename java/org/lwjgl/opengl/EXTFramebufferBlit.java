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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_blit.txt">EXT_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies EXT_framebuffer_object by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows
 * copying directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some
 * data conversion where allowed.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class EXTFramebufferBlit {

	/**
	 * Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
	 * and GetFramebufferAttachmentParameterivEXT.
	 */
	public static final int
		GL_READ_FRAMEBUFFER_EXT = 0x8CA8,
		GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;

	/** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6,
		GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;

	/** Function address. */
	@JavadocExclude
	public final long BlitFramebufferEXT;

	@JavadocExclude
	public EXTFramebufferBlit(FunctionProvider provider) {
		BlitFramebufferEXT = provider.getFunctionAddress("glBlitFramebufferEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTFramebufferBlit} instance for the current context. */
	public static EXTFramebufferBlit getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTFramebufferBlit);
	}

	static EXTFramebufferBlit create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_framebuffer_blit") ) return null;

		EXTFramebufferBlit funcs = new EXTFramebufferBlit(provider);

		boolean supported = checkFunctions(
			funcs.BlitFramebufferEXT
		);

		return GL.checkExtension("GL_EXT_framebuffer_blit", funcs, supported);
	}

	// --- [ glBlitFramebufferEXT ] ---

	/** JNI method for {@link #glBlitFramebufferEXT BlitFramebufferEXT} */
	@JavadocExclude
	public static native void nglBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter, long __functionAddress);

	/**
	 * 
	 *
	 * @param srcX0  
	 * @param srcY0  
	 * @param srcX1  
	 * @param srcY1  
	 * @param dstX0  
	 * @param dstY0  
	 * @param dstX1  
	 * @param dstY1  
	 * @param mask   
	 * @param filter 
	 */
	public static void glBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitFramebufferEXT;
		nglBlitFramebufferEXT(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
	}

}