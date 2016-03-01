/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_buffers.txt">EXT_draw_buffers</a> extension.
 * 
 * <p>This extension increases the number of available framebuffer object color attachment points, extends OpenGL ES 2.0 to allow multiple output colors, and
 * provides a mechanism for directing those outputs to multiple color buffers.</p>
 * 
 * <p>This extension is similar to the combination of the GL_NV_draw_buffers and GL_NV_fbo_color_attachments extensions, but imposes certain restrictions
 * informed by the OpenGL ES 3.0 API.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTDrawBuffers {

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF;

	/** Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv. */
	public static final int
		GL_MAX_DRAW_BUFFERS_EXT = 0x8824,
		GL_DRAW_BUFFER0_EXT     = 0x8825,
		GL_DRAW_BUFFER1_EXT     = 0x8826,
		GL_DRAW_BUFFER2_EXT     = 0x8827,
		GL_DRAW_BUFFER3_EXT     = 0x8828,
		GL_DRAW_BUFFER4_EXT     = 0x8829,
		GL_DRAW_BUFFER5_EXT     = 0x882A,
		GL_DRAW_BUFFER6_EXT     = 0x882B,
		GL_DRAW_BUFFER7_EXT     = 0x882C,
		GL_DRAW_BUFFER8_EXT     = 0x882D,
		GL_DRAW_BUFFER9_EXT     = 0x882E,
		GL_DRAW_BUFFER10_EXT    = 0x882F,
		GL_DRAW_BUFFER11_EXT    = 0x8830,
		GL_DRAW_BUFFER12_EXT    = 0x8831,
		GL_DRAW_BUFFER13_EXT    = 0x8832,
		GL_DRAW_BUFFER14_EXT    = 0x8833,
		GL_DRAW_BUFFER15_EXT    = 0x8834;

	/**
	 * Accepted by the {@code attachment} parameter of FramebufferRenderbuffer, FramebufferTexture2D and GetFramebufferAttachmentParameteriv, and by the
	 * {@code bufs} parameter of DrawBuffersEXT.
	 */
	public static final int
		GL_COLOR_ATTACHMENT0_EXT  = 0x8CE0,
		GL_COLOR_ATTACHMENT1_EXT  = 0x8CE1,
		GL_COLOR_ATTACHMENT2_EXT  = 0x8CE2,
		GL_COLOR_ATTACHMENT3_EXT  = 0x8CE3,
		GL_COLOR_ATTACHMENT4_EXT  = 0x8CE4,
		GL_COLOR_ATTACHMENT5_EXT  = 0x8CE5,
		GL_COLOR_ATTACHMENT6_EXT  = 0x8CE6,
		GL_COLOR_ATTACHMENT7_EXT  = 0x8CE7,
		GL_COLOR_ATTACHMENT8_EXT  = 0x8CE8,
		GL_COLOR_ATTACHMENT9_EXT  = 0x8CE9,
		GL_COLOR_ATTACHMENT10_EXT = 0x8CEA,
		GL_COLOR_ATTACHMENT11_EXT = 0x8CEB,
		GL_COLOR_ATTACHMENT12_EXT = 0x8CEC,
		GL_COLOR_ATTACHMENT13_EXT = 0x8CED,
		GL_COLOR_ATTACHMENT14_EXT = 0x8CEE,
		GL_COLOR_ATTACHMENT15_EXT = 0x8CEF;

	/** Function address. */
	public final long DrawBuffersEXT;

	protected EXTDrawBuffers() {
		throw new UnsupportedOperationException();
	}

	public EXTDrawBuffers(FunctionProvider provider) {
		DrawBuffersEXT = provider.getFunctionAddress("glDrawBuffersEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDrawBuffers} instance of the current context. */
	public static EXTDrawBuffers getInstance() {
		return getInstance(GLES.getCapabilities());
	}

	/** Returns the {@link EXTDrawBuffers} instance of the specified {@link GLESCapabilities}. */
	public static EXTDrawBuffers getInstance(GLESCapabilities caps) {
		return checkFunctionality(caps.__EXTDrawBuffers);
	}

	static EXTDrawBuffers create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_draw_buffers") ) return null;

		EXTDrawBuffers funcs = new EXTDrawBuffers(provider);
		boolean supported = checkFunctions(
			funcs.DrawBuffersEXT
		);

		return GLES.checkExtension("GL_EXT_draw_buffers", funcs, supported);
	}

	// --- [ glDrawBuffersEXT ] ---

	/** Unsafe version of {@link #glDrawBuffersEXT DrawBuffersEXT} */
	public static void nglDrawBuffersEXT(int n, long bufs) {
		long __functionAddress = getInstance().DrawBuffersEXT;
		callIPV(__functionAddress, n, bufs);
	}

	public static void glDrawBuffersEXT(int n, ByteBuffer bufs) {
		if ( CHECKS )
			checkBuffer(bufs, n << 2);
		nglDrawBuffersEXT(n, memAddress(bufs));
	}

	/** Alternative version of: {@link #glDrawBuffersEXT DrawBuffersEXT} */
	public static void glDrawBuffersEXT(IntBuffer bufs) {
		nglDrawBuffersEXT(bufs.remaining(), memAddress(bufs));
	}

	/** Single value version of: {@link #glDrawBuffersEXT DrawBuffersEXT} */
	public static void glDrawBuffersEXT(int buf) {
		APIBuffer __buffer = apiBuffer();
		int bufs = __buffer.intParam(buf);
		nglDrawBuffersEXT(1, __buffer.address(bufs));
	}

}