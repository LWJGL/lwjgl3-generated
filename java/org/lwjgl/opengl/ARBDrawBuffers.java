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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/draw_buffers.txt">ARB_draw_buffers</a> extension.
 * 
 * <p>This extension extends {@link ARBFragmentProgram ARB_fragment_program} and {@link ARBFragmentShader ARB_fragment_shader} to allow multiple output colors, and provides a mechanism for
 * directing those outputs to multiple color buffers.</p>
 * 
 * <p>Requires {@link GL13 OpenGL 1.3}. Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public final class ARBDrawBuffers {

	/** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_DRAW_BUFFERS_ARB = 0x8824,
		GL_DRAW_BUFFER0_ARB     = 0x8825,
		GL_DRAW_BUFFER1_ARB     = 0x8826,
		GL_DRAW_BUFFER2_ARB     = 0x8827,
		GL_DRAW_BUFFER3_ARB     = 0x8828,
		GL_DRAW_BUFFER4_ARB     = 0x8829,
		GL_DRAW_BUFFER5_ARB     = 0x882A,
		GL_DRAW_BUFFER6_ARB     = 0x882B,
		GL_DRAW_BUFFER7_ARB     = 0x882C,
		GL_DRAW_BUFFER8_ARB     = 0x882D,
		GL_DRAW_BUFFER9_ARB     = 0x882E,
		GL_DRAW_BUFFER10_ARB    = 0x882F,
		GL_DRAW_BUFFER11_ARB    = 0x8830,
		GL_DRAW_BUFFER12_ARB    = 0x8831,
		GL_DRAW_BUFFER13_ARB    = 0x8832,
		GL_DRAW_BUFFER14_ARB    = 0x8833,
		GL_DRAW_BUFFER15_ARB    = 0x8834;

	/** Function address. */
	@JavadocExclude
	public final long DrawBuffersARB;

	@JavadocExclude
	public ARBDrawBuffers(FunctionProvider provider) {
		DrawBuffersARB = provider.getFunctionAddress("glDrawBuffersARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBDrawBuffers} instance for the current context. */
	public static ARBDrawBuffers getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBDrawBuffers);
	}

	static ARBDrawBuffers create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_draw_buffers") ) return null;

		ARBDrawBuffers funcs = new ARBDrawBuffers(provider);

		boolean supported = checkFunctions(
			funcs.DrawBuffersARB
		);

		return GL.checkExtension("GL_ARB_draw_buffers", funcs, supported);
	}

	// --- [ glDrawBuffersARB ] ---

	/** JNI method for {@link #glDrawBuffersARB DrawBuffersARB} */
	@JavadocExclude
	public static native void nglDrawBuffersARB(int n, long bufs, long __functionAddress);

	/** Unsafe version of {@link #glDrawBuffersARB DrawBuffersARB} */
	@JavadocExclude
	public static void nglDrawBuffersARB(int n, long bufs) {
		long __functionAddress = getInstance().DrawBuffersARB;
		nglDrawBuffersARB(n, bufs, __functionAddress);
	}

	/**
	 * Defines the draw buffers to which all output colors are written.
	 *
	 * @param n    the number of buffers in {@code bufs}
	 * @param bufs a buffer of symbolic constants specifying the buffer to which each output color is written. One of:<br>{@link GL11#GL_NONE NONE}, {@link GL11#GL_FRONT_LEFT FRONT_LEFT}, {@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}, {@link GL11#GL_BACK_LEFT BACK_LEFT}, {@link GL11#GL_BACK_RIGHT BACK_RIGHT}, {@link GL11#GL_AUX0 AUX0}, {@link GL11#GL_AUX1 AUX1}, {@link GL11#GL_AUX2 AUX2}, {@link GL11#GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glDrawBuffersARB(int n, ByteBuffer bufs) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufs, n << 2);
		nglDrawBuffersARB(n, memAddress(bufs));
	}

	/** Alternative version of: {@link #glDrawBuffersARB DrawBuffersARB} */
	public static void glDrawBuffersARB(IntBuffer bufs) {
		nglDrawBuffersARB(bufs.remaining(), memAddress(bufs));
	}

}