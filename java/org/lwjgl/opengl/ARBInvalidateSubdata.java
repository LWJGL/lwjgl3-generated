/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/invalidate_subdata.txt">ARB_invalidate_subdata</a> extension.
 * 
 * <p>This extension adds a mechanism for an application to tell the GL that the previous contents of a subregion of an image or a range of a buffer may be
 * invalidated.</p>
 * 
 * <p>GL implementations often include several memory spaces, each with distinct performance characteristics, and the implementations transparently move
 * allocations between memory spaces. With this extension, an application can tell the GL that the contents of a texture or buffer are no longer needed,
 * and the implementation can avoid transferring the data unnecessarily.</p>
 * 
 * <p>Examples of when this may be useful include:
 * <ol>
 * <li>invalidating a multisample texture after resolving it into a non-multisample texture.</li>
 * <li>invalidating depth/stencil buffers after using them to generate a color buffer.</li>
 * <li>invalidating a subregion of a framebuffer rather than clearing it before rendering to it, when the whole subregion will be overwritten.</li>
 * <li>invalidating dynamically generated data (e.g. textures written by FBO rendering or CopyTexSubImage, buffers written by transform feedback, etc.)
 * after it is no longer needed but before the end of the frame.</li>
 * </ol>
 * It is expected that the situations in which the GL will take advantage of this knowledge and achieve increased performance as a result of its use will
 * be implementation-dependent. The first three examples may show benefit on tiled renderers where some data won't need to be copied into or out of on-chip
 * memory. The fourth example may show a benefit in multi-GPU systems where some data won't need to be copied between GPUs.</p>
 * 
 * <p>This extension is a superset of the <a href="http://www.opengl.org/registry/specs/EXT/discard_framebuffer.txt">EXT_discard_framebuffer</a> extension with the following additions:
 * <ul>
 * <li>The parameters to InvalidateFramebufferEXT are extended for MRT support and Desktop-GL-only buffer enums.</li>
 * <li>New functions to invalidate a region of a texture image or buffer object data store.</li>
 * </ul>
 * Requires {@link GL20 OpenGL 2.0}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBInvalidateSubdata {

	/** Function address. */
	@JavadocExclude
	public final long
		InvalidateTexSubImage,
		InvalidateTexImage,
		InvalidateBufferSubData,
		InvalidateBufferData,
		InvalidateFramebuffer,
		InvalidateSubFramebuffer;

	@JavadocExclude
	public ARBInvalidateSubdata(FunctionProvider provider) {
		InvalidateTexSubImage = provider.getFunctionAddress("glInvalidateTexSubImage");
		InvalidateTexImage = provider.getFunctionAddress("glInvalidateTexImage");
		InvalidateBufferSubData = provider.getFunctionAddress("glInvalidateBufferSubData");
		InvalidateBufferData = provider.getFunctionAddress("glInvalidateBufferData");
		InvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
		InvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBInvalidateSubdata} instance for the current context. */
	public static ARBInvalidateSubdata getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBInvalidateSubdata);
	}

	static ARBInvalidateSubdata create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_invalidate_subdata") ) return null;

		ARBInvalidateSubdata funcs = new ARBInvalidateSubdata(provider);

		boolean supported = checkFunctions(
			funcs.InvalidateTexSubImage, funcs.InvalidateTexImage, funcs.InvalidateBufferSubData, funcs.InvalidateBufferData, funcs.InvalidateFramebuffer, 
			funcs.InvalidateSubFramebuffer
		);

		return GL.checkExtension("GL_ARB_invalidate_subdata", funcs, supported);
	}

	// --- [ glInvalidateTexSubImage ] ---

	/**
	 * Invalidates a region of a texture image.
	 *
	 * @param texture the name of a texture object a subregion of which to invalidate
	 * @param level   the level of detail of the texture object within which the region resides
	 * @param xoffset the X offset of the region to be invalidated
	 * @param yoffset the Y offset of the region to be invalidated
	 * @param zoffset the Z offset of the region to be invalidated
	 * @param width   the width of the region to be invalidated
	 * @param height  the height of the region to be invalidated
	 * @param depth   the depth of the region to be invalidated
	 */
	public static void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
		long __functionAddress = getInstance().InvalidateTexSubImage;
		GL43.nglInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, __functionAddress);
	}

	// --- [ glInvalidateTexImage ] ---

	/**
	 * Invalidates the entirety of a texture image.
	 *
	 * @param texture the name of a texture object to invalidate
	 * @param level   the level of detail of the texture object to invalidate
	 */
	public static void glInvalidateTexImage(int texture, int level) {
		long __functionAddress = getInstance().InvalidateTexImage;
		GL43.nglInvalidateTexImage(texture, level, __functionAddress);
	}

	// --- [ glInvalidateBufferSubData ] ---

	/**
	 * Invalidates a region of a buffer object's data store.
	 *
	 * @param buffer the name of a buffer object, a subrange of whose data store to invalidate
	 * @param offset the offset within the buffer's data store of the start of the range to be invalidated
	 * @param length the length of the range within the buffer's data store to be invalidated
	 */
	public static void glInvalidateBufferSubData(int buffer, long offset, long length) {
		long __functionAddress = getInstance().InvalidateBufferSubData;
		GL43.nglInvalidateBufferSubData(buffer, offset, length, __functionAddress);
	}

	// --- [ glInvalidateBufferData ] ---

	/**
	 * Invalidates the content of a buffer object's data store.
	 *
	 * @param buffer the name of a buffer object whose data store to invalidate
	 */
	public static void glInvalidateBufferData(int buffer) {
		long __functionAddress = getInstance().InvalidateBufferData;
		GL43.nglInvalidateBufferData(buffer, __functionAddress);
	}

	// --- [ glInvalidateFramebuffer ] ---

	/** Unsafe version of {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
		long __functionAddress = getInstance().InvalidateFramebuffer;
		GL43.nglInvalidateFramebuffer(target, numAttachments, attachments, __functionAddress);
	}

	/**
	 * Invalidate the content some or all of a framebuffer object's attachments.
	 *
	 * @param target         the target to which the framebuffer is attached. One of:<br>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    the address of an array identifying the attachments to be invalidated
	 */
	public static void glInvalidateFramebuffer(int target, int numAttachments, ByteBuffer attachments) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglInvalidateFramebuffer(target, numAttachments, memAddress(attachments));
	}

	/** Alternative version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	public static void glInvalidateFramebuffer(int target, IntBuffer attachments) {
		nglInvalidateFramebuffer(target, attachments.remaining(), memAddress(attachments));
	}

	/** Single value version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer} */
	public static void glInvalidateFramebuffer(int target, int attachment) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglInvalidateFramebuffer(target, 1, __buffer.address(attachments));
	}

	// --- [ glInvalidateSubFramebuffer ] ---

	/** Unsafe version of {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	@JavadocExclude
	public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = getInstance().InvalidateSubFramebuffer;
		GL43.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height, __functionAddress);
	}

	/**
	 * Invalidates the content of a region of some or all of a framebuffer object's attachments.
	 *
	 * @param target         the target to which the framebuffer is attached. One of:<br>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    an array identifying the attachments to be invalidated
	 * @param x              the X offset of the region to be invalidated
	 * @param y              the Y offset of the region to be invalidated
	 * @param width          the width of the region to be invalidated
	 * @param height         the height of the region to be invalidated
	 */
	public static void glInvalidateSubFramebuffer(int target, int numAttachments, ByteBuffer attachments, int x, int y, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglInvalidateSubFramebuffer(target, numAttachments, memAddress(attachments), x, y, width, height);
	}

	/** Alternative version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	public static void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
		nglInvalidateSubFramebuffer(target, attachments.remaining(), memAddress(attachments), x, y, width, height);
	}

	/** Single value version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer} */
	public static void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglInvalidateSubFramebuffer(target, 1, __buffer.address(attachments), x, y, width, height);
	}

}