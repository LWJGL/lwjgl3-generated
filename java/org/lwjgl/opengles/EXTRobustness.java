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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_robustness.txt">EXT_robustness</a> extension.
 * 
 * <p>Several recent trends in how OpenGL integrates into modern computer systems have created new requirements for robustness and security for OpenGL
 * rendering contexts.</p>
 * 
 * <p>Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
 * detection. OpenGL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such
 * hardware faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software
 * failures can be due to device changes or driver failures.</p>
 * 
 * <p>OpenGL queries that that return (write) some number of bytes to a buffer indicated by a pointer parameter introduce risk of buffer overflows that might
 * be exploitable by malware. To address this, queries with return value sizes that are not expressed directly by the parameters to the query itself are
 * given additional API functions with an additional parameter that specifies the number of bytes in the buffer and never writing bytes beyond that limit.
 * This is particularly useful for multi-threaded usage of OpenGL contexts in a "share group" where one context can change objects in ways that can cause
 * buffer overflows for another context's OpenGL queries.</p>
 * 
 * <p>The original ARB_vertex_buffer_object extension includes an issue that explicitly states program termination is allowed when out-of-bounds vertex
 * buffer object fetches occur. Modern graphics hardware is capable well-defined behavior in the case of out-of- bounds vertex buffer object fetches.
 * Older hardware may require extra checks to enforce well-defined (and termination free) behavior, but this expense is warranted when processing
 * potentially untrusted content.</p>
 * 
 * <p>The intent of this extension is to address some specific robustness goals:
 * <ul>
 * <li>For all existing OpenGL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an
 * explicit additional parameter of the query.</li>
 * <li>Provide a mechanism for an OpenGL application to learn about graphics resets that affect the context. When a graphics reset occurs, the OpenGL
 * context becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an
 * inexpensive query.</li>
 * <li>Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
 * instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
 * reads of uniforms or parameters from buffers.</li>
 * </ul></p>
 */
public final class EXTRobustness {

	/** Returned by GetGraphicsResetStatusEXT. */
	public static final int
		GL_GUILTY_CONTEXT_RESET_EXT   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET_EXT = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET_EXT  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_CONTEXT_ROBUST_ACCESS_EXT       = 0x90F3,
		GL_RESET_NOTIFICATION_STRATEGY_EXT = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is RESET_NOTIFICATION_STRATEGY_EXT . */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET_EXT = 0x8252,
		GL_NO_RESET_NOTIFICATION_EXT = 0x8261;

	/** Function address. */
	@JavadocExclude
	public final long
		GetGraphicsResetStatusEXT,
		ReadnPixelsEXT,
		GetnUniformfvEXT,
		GetnUniformivEXT;

	@JavadocExclude
	public EXTRobustness(FunctionProvider provider) {
		GetGraphicsResetStatusEXT = provider.getFunctionAddress("glGetGraphicsResetStatusEXT");
		ReadnPixelsEXT = provider.getFunctionAddress("glReadnPixelsEXT");
		GetnUniformfvEXT = provider.getFunctionAddress("glGetnUniformfvEXT");
		GetnUniformivEXT = provider.getFunctionAddress("glGetnUniformivEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTRobustness} instance for the current context. */
	public static EXTRobustness getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTRobustness);
	}

	static EXTRobustness create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_robustness") ) return null;

		EXTRobustness funcs = new EXTRobustness(provider);
		boolean supported = checkFunctions(
			funcs.GetGraphicsResetStatusEXT, funcs.ReadnPixelsEXT, funcs.GetnUniformfvEXT, funcs.GetnUniformivEXT
		);

		return GLES.checkExtension("GL_EXT_robustness", funcs, supported);
	}

	// --- [ glGetGraphicsResetStatusEXT ] ---

	public static int glGetGraphicsResetStatusEXT() {
		long __functionAddress = getInstance().GetGraphicsResetStatusEXT;
		return callI(__functionAddress);
	}

	// --- [ glReadnPixelsEXT ] ---

	/** Unsafe version of {@link #glReadnPixelsEXT ReadnPixelsEXT} */
	@JavadocExclude
	public static void nglReadnPixelsEXT(int x, int y, int width, int height, int format, int type, int bufSize, long data) {
		long __functionAddress = getInstance().ReadnPixelsEXT;
		callIIIIIIIPV(__functionAddress, x, y, width, height, format, type, bufSize, data);
	}

	public static void glReadnPixelsEXT(int x, int y, int width, int height, int format, int type, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize);
		nglReadnPixelsEXT(x, y, width, height, format, type, bufSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
	public static void glReadnPixelsEXT(int x, int y, int width, int height, int format, int type, int bufSize, long dataOffset) {
		nglReadnPixelsEXT(x, y, width, height, format, type, bufSize, dataOffset);
	}

	/** Alternative version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
	public static void glReadnPixelsEXT(int x, int y, int width, int height, int format, int type, ByteBuffer data) {
		nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
	public static void glReadnPixelsEXT(int x, int y, int width, int height, int format, int type, ShortBuffer data) {
		nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
	public static void glReadnPixelsEXT(int x, int y, int width, int height, int format, int type, IntBuffer data) {
		nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
	public static void glReadnPixelsEXT(int x, int y, int width, int height, int format, int type, FloatBuffer data) {
		nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
	}

	// --- [ glGetnUniformfvEXT ] ---

	/** Unsafe version of {@link #glGetnUniformfvEXT GetnUniformfvEXT} */
	@JavadocExclude
	public static void nglGetnUniformfvEXT(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformfvEXT;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	public static void glGetnUniformfvEXT(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformfvEXT(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformfvEXT GetnUniformfvEXT} */
	public static void glGetnUniformfvEXT(int program, int location, FloatBuffer params) {
		nglGetnUniformfvEXT(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformfvEXT GetnUniformfvEXT} */
	public static float glGetnUniformfEXT(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetnUniformfvEXT(program, location, 1, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetnUniformivEXT ] ---

	/** Unsafe version of {@link #glGetnUniformivEXT GetnUniformivEXT} */
	@JavadocExclude
	public static void nglGetnUniformivEXT(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformivEXT;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	public static void glGetnUniformivEXT(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformivEXT(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformivEXT GetnUniformivEXT} */
	public static void glGetnUniformivEXT(int program, int location, IntBuffer params) {
		nglGetnUniformivEXT(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformivEXT GetnUniformivEXT} */
	public static int glGetnUniformiEXT(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetnUniformivEXT(program, location, 1, __buffer.address(params));
		return __buffer.intValue(params);
	}

}