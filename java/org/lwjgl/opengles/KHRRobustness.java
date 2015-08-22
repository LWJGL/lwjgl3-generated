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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/KHR/robustness.txt">KHR_robustness</a> extension.
 * 
 * <p>Several recent trends in how OpenGL ES integrates into modern computer systems have created new requirements for robustness and security for GL
 * rendering contexts.</p>
 * 
 * <p>Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
 * detection. GL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such hardware
 * faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software failures can
 * be due to device changes or driver failures.</p>
 * 
 * <p>GL queries that return (write) some number of bytes to a buffer indicated by a pointer parameter introduce risk of buffer overflows that might be
 * exploitable by malware. To address this, queries with return value sizes that are not expressed directly by the parameters to the query itself are
 * given additional API functions with an additional parameter that specifies the number of bytes in the buffer and never writing bytes beyond that limit.
 * This is particularly useful for multi-threaded usage of GL contexts in a "share group" where one context can change objects in ways that can cause
 * buffer overflows for another context's GL queries.</p>
 * 
 * <p>The original ARB_vertex_buffer_object extension includes an issue that explicitly states program termination is allowed when out-of-bounds vertex
 * buffer object fetches occur. Modern graphics hardware is capable of well-defined behavior in the case of out-of- bounds vertex buffer object fetches.
 * Older hardware may require extra checks to enforce well-defined (and termination free) behavior, but this expense is warranted when processing
 * potentially untrusted content.</p>
 * 
 * <p>The intent of this extension is to address some specific robustness goals:
 * <ul>
 * <li>For all existing GL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an explicit
 * additional parameter of the query.</li>
 * <li>Provide a mechanism for a GL application to learn about graphics resets that affect the context. When a graphics reset occurs, the GL context
 * becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an inexpensive query.</li>
 * <li>Define behavior of OpenGL calls made after a graphics reset.</li>
 * <li>Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
 * instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
 * reads of uniforms or parameters from buffers.</li>
 * </ul></p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class KHRRobustness {

	/** Returned by {@link #glGetGraphicsResetStatusKHR GetGraphicsResetStatusKHR}. */
	public static final int
		GL_GUILTY_CONTEXT_RESET_KHR   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET_KHR = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET_KHR  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_CONTEXT_ROBUST_ACCESS_KHR       = 0x90F3,
		GL_RESET_NOTIFICATION_STRATEGY_KHR = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY_KHR RESET_NOTIFICATION_STRATEGY_KHR}. */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET_KHR = 0x8252,
		GL_NO_RESET_NOTIFICATION_KHR = 0x8261;

	/** Returned by {@link GLES20#glGetError GetError}. */
	public static final int GL_CONTEXT_LOST_KHR = 0x507;

	/** Function address. */
	@JavadocExclude
	public final long
		GetGraphicsResetStatusKHR,
		ReadnPixelsKHR,
		GetnUniformfvKHR,
		GetnUniformivKHR,
		GetnUniformuivKHR;

	@JavadocExclude
	public KHRRobustness(FunctionProvider provider) {
		GetGraphicsResetStatusKHR = provider.getFunctionAddress("glGetGraphicsResetStatusKHR");
		ReadnPixelsKHR = provider.getFunctionAddress("glReadnPixelsKHR");
		GetnUniformfvKHR = provider.getFunctionAddress("glGetnUniformfvKHR");
		GetnUniformivKHR = provider.getFunctionAddress("glGetnUniformivKHR");
		GetnUniformuivKHR = provider.getFunctionAddress("glGetnUniformuivKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRRobustness} instance for the current context. */
	public static KHRRobustness getInstance() {
		return checkFunctionality(GLES.getCapabilities().__KHRRobustness);
	}

	static KHRRobustness create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_KHR_robustness") ) return null;

		KHRRobustness funcs = new KHRRobustness(provider);
		boolean supported = checkFunctions(
			funcs.GetGraphicsResetStatusKHR, funcs.ReadnPixelsKHR, funcs.GetnUniformfvKHR, funcs.GetnUniformivKHR, funcs.GetnUniformuivKHR
		);

		return GLES.checkExtension("GL_KHR_robustness", funcs, supported);
	}

	// --- [ glGetGraphicsResetStatusKHR ] ---

	/**
	 * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
	 * <ul>
	 * <li>{@link GLES20#GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
	 * <li>{@link #GL_GUILTY_CONTEXT_RESET_KHR GUILTY_CONTEXT_RESET_KHR} indicates that a reset has been detected that is attributable to the current GL context.</li>
	 * <li>{@link #GL_INNOCENT_CONTEXT_RESET_KHR INNOCENT_CONTEXT_RESET_KHR} indicates a reset has been detected that is not attributable to the current GL context.</li>
	 * <li>{@link #GL_UNKNOWN_CONTEXT_RESET_KHR UNKNOWN_CONTEXT_RESET_KHR} indicates a detected graphics reset whose cause is unknown.</li>
	 * </ul>
	 * If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
	 * status is repeatedly returned, the context may be in the process of resetting.
	 * 
	 * <p>Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
	 * {@link #GL_RESET_NOTIFICATION_STRATEGY_KHR RESET_NOTIFICATION_STRATEGY_KHR}.</p>
	 * 
	 * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION_KHR NO_RESET_NOTIFICATION_KHR}, then the implementation will never deliver notification of reset events, and
	 * GetGraphicsResetStatus will always return NO_ERROR.</p>
	 * 
	 * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET_KHR LOSE_CONTEXT_ON_RESET_KHR}, a graphics reset will result in a lost context and require creating a new context as described
	 * above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.</p>
	 * 
	 * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
	 * 
	 * <p>After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
	 * {@link #GL_CONTEXT_LOST_KHR CONTEXT_LOST_KHR} error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
	 * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:
	 * <ul>
	 * <li>{@link GLES20#glGetError GetError} and {@link #glGetGraphicsResetStatusKHR GetGraphicsResetStatusKHR} behave normally following a graphics reset, so that the application can determine a reset has
	 * occurred, and when it is safe to destroy and recreate the context.</li>
	 * <li>Any commands which might cause a polling application to block indefinitely will generate a {@link #GL_CONTEXT_LOST_KHR CONTEXT_LOST_KHR} error, but will also return a value
	 * indicating completion to the application.</li>
	 * </ul></p>
	 */
	public static int glGetGraphicsResetStatusKHR() {
		long __functionAddress = getInstance().GetGraphicsResetStatusKHR;
		return callI(__functionAddress);
	}

	// --- [ glReadnPixelsKHR ] ---

	/** Unsafe version of {@link #glReadnPixelsKHR ReadnPixelsKHR} */
	@JavadocExclude
	public static void nglReadnPixelsKHR(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		long __functionAddress = getInstance().ReadnPixelsKHR;
		callIIIIIIIPV(__functionAddress, x, y, width, height, format, type, bufSize, pixels);
	}

	/**
	 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format
	 * @param type    the pixel type
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixelsKHR(int x, int y, int width, int height, int format, int type, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pixels, bufSize);
		nglReadnPixelsKHR(x, y, width, height, format, type, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
	public static void glReadnPixelsKHR(int x, int y, int width, int height, int format, int type, int bufSize, long pixelsOffset) {
		nglReadnPixelsKHR(x, y, width, height, format, type, bufSize, pixelsOffset);
	}

	/** Alternative version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
	public static void glReadnPixelsKHR(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
	}

	/** ShortBuffer version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
	public static void glReadnPixelsKHR(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
	public static void glReadnPixelsKHR(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
	public static void glReadnPixelsKHR(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	// --- [ glGetnUniformfvKHR ] ---

	/** Unsafe version of {@link #glGetnUniformfvKHR GetnUniformfvKHR} */
	@JavadocExclude
	public static void nglGetnUniformfvKHR(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformfvKHR;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformfvKHR(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformfvKHR(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformfvKHR GetnUniformfvKHR} */
	public static void glGetnUniformfvKHR(int program, int location, FloatBuffer params) {
		nglGetnUniformfvKHR(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformfvKHR GetnUniformfvKHR} */
	public static float glGetnUniformfKHR(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetnUniformfvKHR(program, location, 1, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetnUniformivKHR ] ---

	/** Unsafe version of {@link #glGetnUniformivKHR GetnUniformivKHR} */
	@JavadocExclude
	public static void nglGetnUniformivKHR(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformivKHR;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Integer version of {@link #glGetnUniformfvKHR GetnUniformfvKHR}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformivKHR(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformivKHR(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformivKHR GetnUniformivKHR} */
	public static void glGetnUniformivKHR(int program, int location, FloatBuffer params) {
		nglGetnUniformivKHR(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformivKHR GetnUniformivKHR} */
	public static float glGetnUniformiKHR(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetnUniformivKHR(program, location, 1, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetnUniformuivKHR ] ---

	/** Unsafe version of {@link #glGetnUniformuivKHR GetnUniformuivKHR} */
	@JavadocExclude
	public static void nglGetnUniformuivKHR(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformuivKHR;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Unsigned version of {@link #glGetnUniformivKHR GetnUniformivKHR}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformuivKHR(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformuivKHR(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformuivKHR GetnUniformuivKHR} */
	public static void glGetnUniformuivKHR(int program, int location, FloatBuffer params) {
		nglGetnUniformuivKHR(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformuivKHR GetnUniformuivKHR} */
	public static float glGetnUniformuiKHR(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetnUniformuivKHR(program, location, 1, __buffer.address(params));
		return __buffer.floatValue(params);
	}

}