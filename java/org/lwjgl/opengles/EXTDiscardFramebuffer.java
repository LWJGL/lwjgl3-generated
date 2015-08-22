/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_discard_framebuffer.txt">EXT_discard_framebuffer</a> extension.
 * 
 * <p>This extension provides a new command, DiscardFramebufferEXT, which causes the contents of the named framebuffer attachable images to become undefined.
 * The contents of the specified buffers are undefined until a subsequent operation modifies the content, and only the modified region is guaranteed to
 * hold valid content. Effective usage of this command may provide an implementation with new optimization opportunities.</p>
 * 
 * <p>Some OpenGL ES implementations cache framebuffer images in a small pool of fast memory. Before rendering, these implementations must load the existing
 * contents of one or more of the logical buffers (color, depth, stencil, etc.) into this memory. After rendering, some or all of these buffers are
 * likewise stored back to external memory so their contents can be used again in the future. In many applications, some or all of the logical buffers are
 * cleared at the start of rendering. If so, the effort to load or store those buffers is wasted.</p>
 * 
 * <p>Even without this extension, if a frame of rendering begins with a full- screen Clear, an OpenGL ES implementation may optimize away the loading of
 * framebuffer contents prior to rendering the frame. With this extension, an application can use DiscardFramebufferEXT to signal that framebuffer
 * contents will no longer be needed. In this case an OpenGL ES implementation may also optimize away the storing back of framebuffer contents after
 * rendering the frame.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}</p>
 */
public final class EXTDiscardFramebuffer {

	/** Accepted in the {@code attachments} parameter of DiscardFramebufferEXT when the default framebuffer is bound to {@code target}. */
	public static final int
		GL_COLOR_EXT   = 0x1800,
		GL_DEPTH_EXT   = 0x1801,
		GL_STENCIL_EXT = 0x1802;

	/** Function address. */
	@JavadocExclude
	public final long DiscardFramebufferEXT;

	@JavadocExclude
	public EXTDiscardFramebuffer(FunctionProvider provider) {
		DiscardFramebufferEXT = provider.getFunctionAddress("glDiscardFramebufferEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDiscardFramebuffer} instance for the current context. */
	public static EXTDiscardFramebuffer getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTDiscardFramebuffer);
	}

	static EXTDiscardFramebuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_discard_framebuffer") ) return null;

		EXTDiscardFramebuffer funcs = new EXTDiscardFramebuffer(provider);
		boolean supported = checkFunctions(
			funcs.DiscardFramebufferEXT
		);

		return GLES.checkExtension("GL_EXT_discard_framebuffer", funcs, supported);
	}

	// --- [ glDiscardFramebufferEXT ] ---

	/** Unsafe version of {@link #glDiscardFramebufferEXT DiscardFramebufferEXT} */
	@JavadocExclude
	public static void nglDiscardFramebufferEXT(int target, int numAttachments, long attachments) {
		long __functionAddress = getInstance().DiscardFramebufferEXT;
		callIIPV(__functionAddress, target, numAttachments, attachments);
	}

	public static void glDiscardFramebufferEXT(int target, int numAttachments, ByteBuffer attachments) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglDiscardFramebufferEXT(target, numAttachments, memAddress(attachments));
	}

	/** Alternative version of: {@link #glDiscardFramebufferEXT DiscardFramebufferEXT} */
	public static void glDiscardFramebufferEXT(int target, IntBuffer attachments) {
		nglDiscardFramebufferEXT(target, attachments.remaining(), memAddress(attachments));
	}

	/** Single value version of: {@link #glDiscardFramebufferEXT DiscardFramebufferEXT} */
	public static void glDiscardFramebufferEXT(int target, int attachment) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglDiscardFramebufferEXT(target, 1, __buffer.address(attachments));
	}

}