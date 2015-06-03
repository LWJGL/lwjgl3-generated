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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/KHR/robustness.txt">KHR_robustness</a> extension.
 * 
 * <p>The intent of this extension is to address some specific robustness goals:
 * <ul>
 * <li>For all existing GL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an explicit
 * additional parameter of the query.</li>
 * <li>Provide a mechanism for a GL application to learn about graphics resets that affect the context.  When a graphics reset occurs, the GL context
 * becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an inexpensive
 * query.</li>
 * <li>Define behavior of OpenGL calls made after a graphics reset.</li>
 * <li>Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
 * instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
 * reads of uniforms or parameters from buffers.</li>
 * </ul></p>
 */
public final class KHRRobustness {

	/** Returned by {@link #glGetGraphicsResetStatus GetGraphicsResetStatus}. */
	public static final int
		GL_NO_ERROR               = 0x0,
		GL_GUILTY_CONTEXT_RESET   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_CONTEXT_ROBUST_ACCESS       = 0x90F3,
		GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}. */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET = 0x8252,
		GL_NO_RESET_NOTIFICATION = 0x8261;

	/** Returned by {@link GL11#glGetError GetError}. */
	public static final int GL_CONTEXT_LOST = 0x507;

	/** Function address. */
	@JavadocExclude
	public final long
		GetGraphicsResetStatus,
		ReadnPixels,
		GetnUniformfv,
		GetnUniformiv,
		GetnUniformuiv;

	@JavadocExclude
	public KHRRobustness(FunctionProvider provider) {
		GetGraphicsResetStatus = provider.getFunctionAddress("glGetGraphicsResetStatus");
		ReadnPixels = provider.getFunctionAddress("glReadnPixels");
		GetnUniformfv = provider.getFunctionAddress("glGetnUniformfv");
		GetnUniformiv = provider.getFunctionAddress("glGetnUniformiv");
		GetnUniformuiv = provider.getFunctionAddress("glGetnUniformuiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRRobustness} instance for the current context. */
	public static KHRRobustness getInstance() {
		return checkFunctionality(GL.getCapabilities().__KHRRobustness);
	}

	static KHRRobustness create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_KHR_robustness") ) return null;

		KHRRobustness funcs = new KHRRobustness(provider);

		boolean supported = checkFunctions(
			funcs.GetGraphicsResetStatus, funcs.ReadnPixels, funcs.GetnUniformfv, funcs.GetnUniformiv, funcs.GetnUniformuiv
		);

		return GL.checkExtension("GL_KHR_robustness", funcs, supported);
	}

	// --- [ glGetGraphicsResetStatus ] ---

	/**
	 * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
	 * <ul>
	 * <li>{@link #GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
	 * <li>{@link #GL_GUILTY_CONTEXT_RESET GUILTY_CONTEXT_RESET} indicates that a reset has been detected that is attributable to the current GL context.</li>
	 * <li>{@link #GL_INNOCENT_CONTEXT_RESET INNOCENT_CONTEXT_RESET} indicates a reset has been detected that is not attributable to the current GL context.</li>
	 * <li>{@link #GL_UNKNOWN_CONTEXT_RESET UNKNOWN_CONTEXT_RESET} indicates a detected graphics reset whose cause is unknown.</li>
	 * </ul>
	 * If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
	 * status is repeatedly returned, the context may be in the process of resetting.
	 * 
	 * <p>Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
	 * {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}.</p>
	 * 
	 * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION}, then the implementation will never deliver notification of reset events, and
	 * GetGraphicsResetStatus will always return NO_ERROR.</p>
	 * 
	 * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, a graphics reset will result in a lost context and require creating a new context as described
	 * above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.</p>
	 * 
	 * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
	 * 
	 * <p>After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
	 * {@link #GL_CONTEXT_LOST CONTEXT_LOST} error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
	 * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:
	 * <ul>
	 * <li>{@link GL11#glGetError GetError} and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
	 * occurred, and when it is safe to destroy and recreate the context.</li>
	 * <li>Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
	 * indicating completion to the application.</li>
	 * </ul></p>
	 */
	public static int glGetGraphicsResetStatus() {
		long __functionAddress = getInstance().GetGraphicsResetStatus;
		return GL45.nglGetGraphicsResetStatus(__functionAddress);
	}

	// --- [ glReadnPixels ] ---

	/** Unsafe version of {@link #glReadnPixels ReadnPixels} */
	@JavadocExclude
	public static void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		long __functionAddress = getInstance().ReadnPixels;
		GL45.nglReadnPixels(x, y, width, height, format, type, bufSize, pixels, __functionAddress);
	}

	/**
	 * Behaves identically to {@link GL11#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglReadnPixels(x, y, width, height, format, type, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadnPixels(x, y, width, height, format, type, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	// --- [ glGetnUniformfv ] ---

	/** Unsafe version of {@link #glGetnUniformfv GetnUniformfv} */
	@JavadocExclude
	public static void nglGetnUniformfv(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformfv;
		GL45.nglGetnUniformfv(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformfv(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformfv(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformfv GetnUniformfv} */
	public static void glGetnUniformfv(int program, int location, FloatBuffer params) {
		nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
	}

	// --- [ glGetnUniformiv ] ---

	/** Unsafe version of {@link #glGetnUniformiv GetnUniformiv} */
	@JavadocExclude
	public static void nglGetnUniformiv(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformiv;
		GL45.nglGetnUniformiv(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformiv(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformiv(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformiv GetnUniformiv} */
	public static void glGetnUniformiv(int program, int location, FloatBuffer params) {
		nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
	}

	// --- [ glGetnUniformuiv ] ---

	/** Unsafe version of {@link #glGetnUniformuiv GetnUniformuiv} */
	@JavadocExclude
	public static void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformuiv;
		GL45.nglGetnUniformuiv(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformuiv(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformuiv(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformuiv GetnUniformuiv} */
	public static void glGetnUniformuiv(int program, int location, FloatBuffer params) {
		nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
	}

}