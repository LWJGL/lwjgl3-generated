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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/robustness.txt">ARB_robustness</a> extension.
 * 
 * <p>Several recent trends in how OpenGL integrates into modern computer systems have created new requirements for robustness and security for OpenGL
 * rendering contexts.</p>
 * 
 * <p>Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
 * detection. OpenGL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such
 * hardware faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software
 * failures can be due to device changes or driver failures.</p>
 * 
 * <p>Demands for increased software robustness and concerns about malware exploiting buffer overflows have lead API designers to provide additional "safe"
 * APIs that bound the amount of data returned by an API query. For example, the safer "snprintf" or "_snprintf" routines are prefered over "sprintf".</p>
 * 
 * <p>The OpenGL API has many such robustness perils. OpenGL queries return (write) some number of bytes to a buffer indicated by a pointer parameter. The
 * exact number of bytes written by existing OpenGL queries is not expressed directly by any specific parameter; instead the number of bytes returned is a
 * complex function of one or more query arguments, sometimes context state such as pixel store modes or the active texture selector, and the current state
 * of an object (such as a texture level's number of total texels). By the standards of modern API design, such queries are not "safe". Making these
 * queries safer involves introducing a new query API with an additional parameter that specifies the number of bytes in the buffer and never writing bytes
 * beyond that limit.</p>
 * 
 * <p>Multi-threaded use of OpenGL contexts in a "share group" allow sharing of objects such as textures and programs. Such sharing in conjunction with
 * concurrent OpenGL commands stream execution by two or more contexts introduces hazards whereby one context can change objects in ways that can cause
 * buffer overflows for another context's OpenGL queries.</p>
 * 
 * <p>The original {@link ARBVertexBufferObject ARB_vertex_buffer_object} extension includes an issue that explicitly states program termination is allowed when out-of-bounds
 * vertex buffer object fetches occur. Modern GPUs capable of DirectX 10 enforce the well-defined behavior of always returning zero values for indices or
 * non-fixed components in this case. Older GPUs may require extra checks to enforce well-defined (and termination free) behavior, but this expense is
 * warranted when processing potentially untrusted content.</p>
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
 * 
 * <p>In one anticipated usage model, WebGL contexts may make use of these robust features to grant greater stability when using untrusted code. WebGL
 * contexts cannot call OpenGL commands directly but rather must route all OpenGL API calls through the web browser. It is then the web browser that
 * configures the context, using the commands in this extension, to enforce safe behavior. In this scenario, the WebGL content cannot specify or change the
 * use of this extension's features itself; the web browser enforces this policy.</p>
 * 
 * <p>There are other well-known robustness issues with the OpenGL API which this extension does not address. For example, selector-based OpenGL commands are
 * a well-known source of programming errors. Code to manipulate texture state may assume the active texture selector is set appropriately when an
 * intervening function call obscures a change to the active texture state resulting in incorrectly updated or queried state. The
 * <a href="http://www.opengl.org/registry/specs/EXT/direct_state_access.txt">EXT_direct_state_access</a> extension introduces selector-free OpenGL commands and queries to address that particular issue so this
 * extension does not.</p>
 * 
 * <p>The intent of this extension is NOT to deprecate any existing API and thereby introduce compatibility issues and coding burdens on existing code, but
 * rather to provide new APIs to ensure a level of robustness commensurate with the expectations of modern applications of OpenGL.</p>
 */
public final class ARBRobustness {

	/** Returned by GetGraphicsResetStatusARB. */
	public static final int
		GL_NO_ERROR                   = 0x0,
		GL_GUILTY_CONTEXT_RESET_ARB   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET_ARB  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is RESET_NOTIFICATION_STRATEGY_ARB. */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252,
		GL_NO_RESET_NOTIFICATION_ARB = 0x8261;

	/** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
	public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x4;

	/** Function address. */
	@JavadocExclude
	public final long
		GetGraphicsResetStatusARB,
		GetnMapdvARB,
		GetnMapfvARB,
		GetnMapivARB,
		GetnPixelMapfvARB,
		GetnPixelMapuivARB,
		GetnPixelMapusvARB,
		GetnPolygonStippleARB,
		GetnTexImageARB,
		ReadnPixelsARB,
		GetnColorTableARB,
		GetnConvolutionFilterARB,
		GetnSeparableFilterARB,
		GetnHistogramARB,
		GetnMinmaxARB,
		GetnCompressedTexImageARB,
		GetnUniformfvARB,
		GetnUniformivARB,
		GetnUniformuivARB,
		GetnUniformdvARB;

	@JavadocExclude
	public ARBRobustness(FunctionProvider provider) {
		GetGraphicsResetStatusARB = provider.getFunctionAddress("glGetGraphicsResetStatusARB");
		GetnMapdvARB = provider.getFunctionAddress("glGetnMapdvARB");
		GetnMapfvARB = provider.getFunctionAddress("glGetnMapfvARB");
		GetnMapivARB = provider.getFunctionAddress("glGetnMapivARB");
		GetnPixelMapfvARB = provider.getFunctionAddress("glGetnPixelMapfvARB");
		GetnPixelMapuivARB = provider.getFunctionAddress("glGetnPixelMapuivARB");
		GetnPixelMapusvARB = provider.getFunctionAddress("glGetnPixelMapusvARB");
		GetnPolygonStippleARB = provider.getFunctionAddress("glGetnPolygonStippleARB");
		GetnTexImageARB = provider.getFunctionAddress("glGetnTexImageARB");
		ReadnPixelsARB = provider.getFunctionAddress("glReadnPixelsARB");
		GetnColorTableARB = provider.getFunctionAddress("glGetnColorTableARB");
		GetnConvolutionFilterARB = provider.getFunctionAddress("glGetnConvolutionFilterARB");
		GetnSeparableFilterARB = provider.getFunctionAddress("glGetnSeparableFilterARB");
		GetnHistogramARB = provider.getFunctionAddress("glGetnHistogramARB");
		GetnMinmaxARB = provider.getFunctionAddress("glGetnMinmaxARB");
		GetnCompressedTexImageARB = provider.getFunctionAddress("glGetnCompressedTexImageARB");
		GetnUniformfvARB = provider.getFunctionAddress("glGetnUniformfvARB");
		GetnUniformivARB = provider.getFunctionAddress("glGetnUniformivARB");
		GetnUniformuivARB = provider.getFunctionAddress("glGetnUniformuivARB");
		GetnUniformdvARB = provider.getFunctionAddress("glGetnUniformdvARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBRobustness} instance for the current context. */
	public static ARBRobustness getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBRobustness);
	}

	static ARBRobustness create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_robustness") ) return null;

		ARBRobustness funcs = new ARBRobustness(provider);

		boolean supported = checkFunctions(
			funcs.GetGraphicsResetStatusARB, provider.getFunctionAddress("glGetMapdv") != NULL ? funcs.GetnMapdvARB : -1L, 
			provider.getFunctionAddress("glGetMapfv") != NULL ? funcs.GetnMapfvARB : -1L, 
			provider.getFunctionAddress("glGetMapiv") != NULL ? funcs.GetnMapivARB : -1L, 
			provider.getFunctionAddress("glGetPixelMapfv") != NULL ? funcs.GetnPixelMapfvARB : -1L, 
			provider.getFunctionAddress("glGetPixelMapuiv") != NULL ? funcs.GetnPixelMapuivARB : -1L, 
			provider.getFunctionAddress("glGetPixelMapusv") != NULL ? funcs.GetnPixelMapusvARB : -1L, 
			provider.getFunctionAddress("glGetPolygonStipple") != NULL ? funcs.GetnPolygonStippleARB : -1L, 
			provider.getFunctionAddress("glGetTexImage") != NULL ? funcs.GetnTexImageARB : -1L, funcs.ReadnPixelsARB, 
			ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetColorTable") != NULL ? funcs.GetnColorTableARB : -1L, 
			ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetConvolutionFilter") != NULL ? funcs.GetnConvolutionFilterARB : -1L, 
			ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetSeparableFilter") != NULL ? funcs.GetnSeparableFilterARB : -1L, 
			ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetHistogram") != NULL ? funcs.GetnHistogramARB : -1L, 
			ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetMinmax") != NULL ? funcs.GetnMinmaxARB : -1L, 
			ext.contains("OpenGL13") ? funcs.GetnCompressedTexImageARB : -1L, ext.contains("OpenGL20") ? funcs.GetnUniformfvARB : -1L, 
			ext.contains("OpenGL20") ? funcs.GetnUniformivARB : -1L, ext.contains("OpenGL30") ? funcs.GetnUniformuivARB : -1L, 
			ext.contains("OpenGL40") ? funcs.GetnUniformdvARB : -1L
		);

		return GL.checkExtension("GL_ARB_robustness", funcs, supported);
	}

	// --- [ glGetGraphicsResetStatusARB ] ---

	/** JNI method for {@link #glGetGraphicsResetStatusARB GetGraphicsResetStatusARB} */
	@JavadocExclude
	public static native int nglGetGraphicsResetStatusARB(long __functionAddress);

	/**
	 * The symbolic constant returned indicates if the GL context has been in a reset state at any point since the last call to {@code GetGraphicsResetStatusARB}.
	 * {@link #GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call. {@link #GL_GUILTY_CONTEXT_RESET_ARB GUILTY_CONTEXT_RESET_ARB} indicates that a reset has been
	 * detected that is attributable to the current GL context. {@link #GL_INNOCENT_CONTEXT_RESET_ARB INNOCENT_CONTEXT_RESET_ARB} indicates a reset has been detected that is not attributable to the
	 * current GL context. {@link #GL_UNKNOWN_CONTEXT_RESET_ARB UNKNOWN_CONTEXT_RESET_ARB} indicates a detected graphics reset whose cause is unknown.
	 * 
	 * <p>If a reset status other than {@link #GL_NO_ERROR NO_ERROR} is returned and subsequent calls return {@link #GL_NO_ERROR NO_ERROR}, the context reset was encountered and completed. If a reset
	 * status is repeatedly returned, the context may be in the process of resetting.</p>
	 * 
	 * <p>Reset notification behavior is determined at context creation time, and may be queried by calling {@link GL11#glGetIntegerv GetIntegerv} with the symbolic constant
	 * {@link #GL_RESET_NOTIFICATION_STRATEGY_ARB RESET_NOTIFICATION_STRATEGY_ARB}.</p>
	 * 
	 * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION_ARB NO_RESET_NOTIFICATION_ARB}, then the implementation will never deliver notification of reset events, and
	 * {@code GetGraphicsResetStatusARB} will always return {@link #GL_NO_ERROR NO_ERROR}.</p>
	 * 
	 * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET_ARB LOSE_CONTEXT_ON_RESET_ARB}, a graphics reset will result in the loss of all context state, requiring the recreation of all associated
	 * objects. In this case {@code GetGraphicsResetStatusARB}. may return any of the values described above.</p>
	 * 
	 * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
	 */
	public static int glGetGraphicsResetStatusARB() {
		long __functionAddress = getInstance().GetGraphicsResetStatusARB;
		return nglGetGraphicsResetStatusARB(__functionAddress);
	}

	// --- [ glGetnMapdvARB ] ---

	/** JNI method for {@link #glGetnMapdvARB GetnMapdvARB} */
	@JavadocExclude
	public static native void nglGetnMapdvARB(int target, int query, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetnMapdvARB GetnMapdvARB} */
	@JavadocExclude
	public static void nglGetnMapdvARB(int target, int query, int bufSize, long data) {
		long __functionAddress = getInstance().GetnMapdvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnMapdvARB(target, query, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetMapdv GetMapdv}
	 *
	 * @param target  the evaluator map
	 * @param query   the information to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glGetnMapdvARB(int target, int query, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize << 3);
		nglGetnMapdvARB(target, query, bufSize, memAddress(data));
	}

	/** Alternative version of: {@link #glGetnMapdvARB GetnMapdvARB} */
	public static void glGetnMapdvARB(int target, int query, DoubleBuffer data) {
		nglGetnMapdvARB(target, query, data.remaining(), memAddress(data));
	}

	/** Single return value version of: {@link #glGetnMapdvARB GetnMapdvARB} */
	public static double glGetnMapdARB(int target, int query) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.doubleParam();
		nglGetnMapdvARB(target, query, 1, __buffer.address(data));
		return __buffer.doubleValue(data);
	}

	// --- [ glGetnMapfvARB ] ---

	/** JNI method for {@link #glGetnMapfvARB GetnMapfvARB} */
	@JavadocExclude
	public static native void nglGetnMapfvARB(int target, int query, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetnMapfvARB GetnMapfvARB} */
	@JavadocExclude
	public static void nglGetnMapfvARB(int target, int query, int bufSize, long data) {
		long __functionAddress = getInstance().GetnMapfvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnMapfvARB(target, query, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetMapfv GetMapfv}
	 *
	 * @param target  the evaluator map
	 * @param query   the information to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glGetnMapfvARB(int target, int query, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize << 2);
		nglGetnMapfvARB(target, query, bufSize, memAddress(data));
	}

	/** Alternative version of: {@link #glGetnMapfvARB GetnMapfvARB} */
	public static void glGetnMapfvARB(int target, int query, FloatBuffer data) {
		nglGetnMapfvARB(target, query, data.remaining(), memAddress(data));
	}

	/** Single return value version of: {@link #glGetnMapfvARB GetnMapfvARB} */
	public static float glGetnMapfARB(int target, int query) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetnMapfvARB(target, query, 1, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetnMapivARB ] ---

	/** JNI method for {@link #glGetnMapivARB GetnMapivARB} */
	@JavadocExclude
	public static native void nglGetnMapivARB(int target, int query, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetnMapivARB GetnMapivARB} */
	@JavadocExclude
	public static void nglGetnMapivARB(int target, int query, int bufSize, long data) {
		long __functionAddress = getInstance().GetnMapivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnMapivARB(target, query, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetMapiv GetMapiv}
	 *
	 * @param target  the evaluator target. One of:<br>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}, {@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}, {@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}, {@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}, {@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}, {@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}, {@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}, {@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}, {@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}, {@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}, {@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}, {@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}, {@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}, {@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}, {@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}, {@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}
	 * @param query   the information to query. One of:<br>{@link GL11#GL_ORDER ORDER}, {@link GL11#GL_COEFF COEFF}, {@link GL11#GL_DOMAIN DOMAIN}
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glGetnMapivARB(int target, int query, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize << 2);
		nglGetnMapivARB(target, query, bufSize, memAddress(data));
	}

	/** Alternative version of: {@link #glGetnMapivARB GetnMapivARB} */
	public static void glGetnMapivARB(int target, int query, IntBuffer data) {
		nglGetnMapivARB(target, query, data.remaining(), memAddress(data));
	}

	/** Single return value version of: {@link #glGetnMapivARB GetnMapivARB} */
	public static int glGetnMapiARB(int target, int query) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetnMapivARB(target, query, 1, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glGetnPixelMapfvARB ] ---

	/** JNI method for {@link #glGetnPixelMapfvARB GetnPixelMapfvARB} */
	@JavadocExclude
	public static native void nglGetnPixelMapfvARB(int map, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetnPixelMapfvARB GetnPixelMapfvARB} */
	@JavadocExclude
	public static void nglGetnPixelMapfvARB(int map, int bufSize, long data) {
		long __functionAddress = getInstance().GetnPixelMapfvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnPixelMapfvARB(map, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetPixelMapfv GetPixelMapfv}
	 *
	 * @param map     the pixel map parameter to query. One of:<br>{@link GL11#GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}, {@link GL11#GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}, {@link GL11#GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}, {@link GL11#GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}, {@link GL11#GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}, {@link GL11#GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}, {@link GL11#GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}, {@link GL11#GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}, {@link GL11#GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}, {@link GL11#GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glGetnPixelMapfvARB(int map, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize << 2);
		nglGetnPixelMapfvARB(map, bufSize, memAddress(data));
	}

	/** Alternative version of: {@link #glGetnPixelMapfvARB GetnPixelMapfvARB} */
	public static void glGetnPixelMapfvARB(int map, FloatBuffer data) {
		nglGetnPixelMapfvARB(map, data.remaining(), memAddress(data));
	}

	// --- [ glGetnPixelMapuivARB ] ---

	/** JNI method for {@link #glGetnPixelMapuivARB GetnPixelMapuivARB} */
	@JavadocExclude
	public static native void nglGetnPixelMapuivARB(int map, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetnPixelMapuivARB GetnPixelMapuivARB} */
	@JavadocExclude
	public static void nglGetnPixelMapuivARB(int map, int bufSize, long data) {
		long __functionAddress = getInstance().GetnPixelMapuivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnPixelMapuivARB(map, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetPixelMapuiv GetPixelMapuiv}
	 *
	 * @param map     the pixel map parameter to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glGetnPixelMapuivARB(int map, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize << 2);
		nglGetnPixelMapuivARB(map, bufSize, memAddress(data));
	}

	/** Alternative version of: {@link #glGetnPixelMapuivARB GetnPixelMapuivARB} */
	public static void glGetnPixelMapuivARB(int map, IntBuffer data) {
		nglGetnPixelMapuivARB(map, data.remaining(), memAddress(data));
	}

	// --- [ glGetnPixelMapusvARB ] ---

	/** JNI method for {@link #glGetnPixelMapusvARB GetnPixelMapusvARB} */
	@JavadocExclude
	public static native void nglGetnPixelMapusvARB(int map, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetnPixelMapusvARB GetnPixelMapusvARB} */
	@JavadocExclude
	public static void nglGetnPixelMapusvARB(int map, int bufSize, long data) {
		long __functionAddress = getInstance().GetnPixelMapusvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnPixelMapusvARB(map, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetPixelMapusv GetPixelMapusv}
	 *
	 * @param map     the pixel map parameter to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glGetnPixelMapusvARB(int map, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, bufSize << 1);
		nglGetnPixelMapusvARB(map, bufSize, memAddress(data));
	}

	/** Alternative version of: {@link #glGetnPixelMapusvARB GetnPixelMapusvARB} */
	public static void glGetnPixelMapusvARB(int map, ShortBuffer data) {
		nglGetnPixelMapusvARB(map, data.remaining(), memAddress(data));
	}

	// --- [ glGetnPolygonStippleARB ] ---

	/** JNI method for {@link #glGetnPolygonStippleARB GetnPolygonStippleARB} */
	@JavadocExclude
	public static native void nglGetnPolygonStippleARB(int bufSize, long pattern, long __functionAddress);

	/** Unsafe version of {@link #glGetnPolygonStippleARB GetnPolygonStippleARB} */
	@JavadocExclude
	public static void nglGetnPolygonStippleARB(int bufSize, long pattern) {
		long __functionAddress = getInstance().GetnPolygonStippleARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnPolygonStippleARB(bufSize, pattern, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
	 *
	 * @param bufSize the maximum number of bytes to write into {@code pattern}
	 * @param pattern a buffer in which to place the returned pattern
	 */
	public static void glGetnPolygonStippleARB(int bufSize, ByteBuffer pattern) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pattern, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnPolygonStippleARB(bufSize, memAddress(pattern));
	}

	/** Buffer object offset version of: {@link #glGetnPolygonStippleARB GetnPolygonStippleARB} */
	public static void glGetnPolygonStippleARB(int bufSize, long patternOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnPolygonStippleARB(bufSize, patternOffset);
	}

	/** Alternative version of: {@link #glGetnPolygonStippleARB GetnPolygonStippleARB} */
	public static void glGetnPolygonStippleARB(ByteBuffer pattern) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnPolygonStippleARB(pattern.remaining(), memAddress(pattern));
	}

	// --- [ glGetnTexImageARB ] ---

	/** JNI method for {@link #glGetnTexImageARB GetnTexImageARB} */
	@JavadocExclude
	public static native void nglGetnTexImageARB(int tex, int level, int format, int type, int bufSize, long img, long __functionAddress);

	/** Unsafe version of {@link #glGetnTexImageARB GetnTexImageARB} */
	@JavadocExclude
	public static void nglGetnTexImageARB(int tex, int level, int format, int type, int bufSize, long img) {
		long __functionAddress = getInstance().GetnTexImageARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnTexImageARB(tex, level, format, type, bufSize, img, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glGetTexImage GetTexImage}
	 *
	 * @param tex     the texture (or texture face) to be obtained. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the maximum number of bytes to write into {@code img}
	 * @param img     a buffer in which to place the returned data
	 */
	public static void glGetnTexImageARB(int tex, int level, int format, int type, int bufSize, ByteBuffer img) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(img, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnTexImageARB(tex, level, format, type, bufSize, memAddress(img));
	}

	/** Buffer object offset version of: {@link #glGetnTexImageARB GetnTexImageARB} */
	public static void glGetnTexImageARB(int tex, int level, int format, int type, int bufSize, long imgOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnTexImageARB(tex, level, format, type, bufSize, imgOffset);
	}

	/** ShortBuffer version of: {@link #glGetnTexImageARB GetnTexImageARB} */
	public static void glGetnTexImageARB(int tex, int level, int format, int type, ShortBuffer img) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImageARB(tex, level, format, type, img.remaining() << 1, memAddress(img));
	}

	/** IntBuffer version of: {@link #glGetnTexImageARB GetnTexImageARB} */
	public static void glGetnTexImageARB(int tex, int level, int format, int type, IntBuffer img) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, memAddress(img));
	}

	/** FloatBuffer version of: {@link #glGetnTexImageARB GetnTexImageARB} */
	public static void glGetnTexImageARB(int tex, int level, int format, int type, FloatBuffer img) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, memAddress(img));
	}

	/** DoubleBuffer version of: {@link #glGetnTexImageARB GetnTexImageARB} */
	public static void glGetnTexImageARB(int tex, int level, int format, int type, DoubleBuffer img) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImageARB(tex, level, format, type, img.remaining() << 3, memAddress(img));
	}

	// --- [ glReadnPixelsARB ] ---

	/** JNI method for {@link #glReadnPixelsARB ReadnPixelsARB} */
	@JavadocExclude
	public static native void nglReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glReadnPixelsARB ReadnPixelsARB} */
	@JavadocExclude
	public static void nglReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, long data) {
		long __functionAddress = getInstance().ReadnPixelsARB;
		nglReadnPixelsARB(x, y, width, height, format, type, bufSize, data, __functionAddress);
	}

	/**
	 * Robust version of {@link GL11#glReadPixels ReadPixels}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglReadnPixelsARB(x, y, width, height, format, type, bufSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
	public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadnPixelsARB(x, y, width, height, format, type, bufSize, dataOffset);
	}

	/** ShortBuffer version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
	public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, ShortBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
	public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
	public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
	}

	// --- [ glGetnColorTableARB ] ---

	/** JNI method for {@link #glGetnColorTableARB GetnColorTableARB} */
	@JavadocExclude
	public static native void nglGetnColorTableARB(int target, int format, int type, int bufSize, long table, long __functionAddress);

	/** Unsafe version of {@link #glGetnColorTableARB GetnColorTableARB} */
	@JavadocExclude
	public static void nglGetnColorTableARB(int target, int format, int type, int bufSize, long table) {
		long __functionAddress = getInstance().GetnColorTableARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnColorTableARB(target, format, type, bufSize, table, __functionAddress);
	}

	/**
	 * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
	 *
	 * @param target  the color table target. One of:<br>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}, {@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param format  the color data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type    the color data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param bufSize the maximum number of bytes to write into {@code table}
	 * @param table   a buffer in which to place the returned data
	 */
	public static void glGetnColorTableARB(int target, int format, int type, int bufSize, ByteBuffer table) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(table, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnColorTableARB(target, format, type, bufSize, memAddress(table));
	}

	/** Buffer object offset version of: {@link #glGetnColorTableARB GetnColorTableARB} */
	public static void glGetnColorTableARB(int target, int format, int type, int bufSize, long tableOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnColorTableARB(target, format, type, bufSize, tableOffset);
	}

	/** ShortBuffer version of: {@link #glGetnColorTableARB GetnColorTableARB} */
	public static void glGetnColorTableARB(int target, int format, int type, ShortBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTableARB(target, format, type, table.remaining() << 1, memAddress(table));
	}

	/** IntBuffer version of: {@link #glGetnColorTableARB GetnColorTableARB} */
	public static void glGetnColorTableARB(int target, int format, int type, IntBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTableARB(target, format, type, table.remaining() << 2, memAddress(table));
	}

	/** FloatBuffer version of: {@link #glGetnColorTableARB GetnColorTableARB} */
	public static void glGetnColorTableARB(int target, int format, int type, FloatBuffer table) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTableARB(target, format, type, table.remaining() << 2, memAddress(table));
	}

	// --- [ glGetnConvolutionFilterARB ] ---

	/** JNI method for {@link #glGetnConvolutionFilterARB GetnConvolutionFilterARB} */
	@JavadocExclude
	public static native void nglGetnConvolutionFilterARB(int target, int format, int type, int bufSize, long image, long __functionAddress);

	/** Unsafe version of {@link #glGetnConvolutionFilterARB GetnConvolutionFilterARB} */
	@JavadocExclude
	public static void nglGetnConvolutionFilterARB(int target, int format, int type, int bufSize, long image) {
		long __functionAddress = getInstance().GetnConvolutionFilterARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnConvolutionFilterARB(target, format, type, bufSize, image, __functionAddress);
	}

	/**
	 * Robust version of {@link ARBImaging#glGetConvolutionFilter GetConvolutionFilter}
	 *
	 * @param target  the convolution target. One of:<br>{@link ARBImaging#GL_CONVOLUTION_1D CONVOLUTION_1D}, {@link ARBImaging#GL_CONVOLUTION_2D CONVOLUTION_2D}
	 * @param format  the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type    the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param bufSize the maximum number of bytes to write into {@code image}
	 * @param image   a buffer in which to place the returned data
	 */
	public static void glGetnConvolutionFilterARB(int target, int format, int type, int bufSize, ByteBuffer image) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnConvolutionFilterARB(target, format, type, bufSize, memAddress(image));
	}

	/** Buffer object offset version of: {@link #glGetnConvolutionFilterARB GetnConvolutionFilterARB} */
	public static void glGetnConvolutionFilterARB(int target, int format, int type, int bufSize, long imageOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnConvolutionFilterARB(target, format, type, bufSize, imageOffset);
	}

	/** Alternative version of: {@link #glGetnConvolutionFilterARB GetnConvolutionFilterARB} */
	public static void glGetnConvolutionFilterARB(int target, int format, int type, ByteBuffer image) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnConvolutionFilterARB(target, format, type, image.remaining(), memAddress(image));
	}

	// --- [ glGetnSeparableFilterARB ] ---

	/** JNI method for {@link #glGetnSeparableFilterARB GetnSeparableFilterARB} */
	@JavadocExclude
	public static native void nglGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span, long __functionAddress);

	/** Unsafe version of {@link #glGetnSeparableFilterARB GetnSeparableFilterARB} */
	@JavadocExclude
	public static void nglGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span) {
		long __functionAddress = getInstance().GetnSeparableFilterARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnSeparableFilterARB(target, format, type, rowBufSize, row, columnBufSize, column, span, __functionAddress);
	}

	/**
	 * Robust version of {@link ARBImaging#glGetSeparableFilter GetSeparableFilter}
	 *
	 * @param target        the filter target. Must be:<br>{@link ARBImaging#GL_SEPARABLE_2D SEPARABLE_2D}
	 * @param format        the filter data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type          the filter data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param rowBufSize    the maximum number of bytes to write into {@code row}
	 * @param row           a buffer in which to return the filter row
	 * @param columnBufSize the maximum number of bytes to write into {@code column}
	 * @param column        a buffer in which to return the filter column
	 * @param span          
	 */
	public static void glGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, ByteBuffer row, int columnBufSize, ByteBuffer column, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(row, rowBufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
			checkBuffer(column, columnBufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnSeparableFilterARB(target, format, type, rowBufSize, memAddress(row), columnBufSize, memAddress(column), memAddressSafe(span));
	}

	/** Buffer object offset version of: {@link #glGetnSeparableFilterARB GetnSeparableFilterARB} */
	public static void glGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, long rowOffset, int columnBufSize, ByteBuffer column, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnSeparableFilterARB(target, format, type, rowBufSize, rowOffset, columnBufSize, memAddress(column), memAddressSafe(span));
	}

	/** Buffer object offset version of: {@link #glGetnSeparableFilterARB GetnSeparableFilterARB} */
	public static void glGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, ByteBuffer row, int columnBufSize, long columnOffset, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnSeparableFilterARB(target, format, type, rowBufSize, memAddress(row), columnBufSize, columnOffset, memAddressSafe(span));
	}

	/** Alternative version of: {@link #glGetnSeparableFilterARB GetnSeparableFilterARB} */
	public static void glGetnSeparableFilterARB(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnSeparableFilterARB(target, format, type, row.remaining(), memAddress(row), column.remaining(), memAddress(column), memAddressSafe(span));
	}

	// --- [ glGetnHistogramARB ] ---

	/** JNI method for {@link #glGetnHistogramARB GetnHistogramARB} */
	@JavadocExclude
	public static native void nglGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, long values, long __functionAddress);

	/** Unsafe version of {@link #glGetnHistogramARB GetnHistogramARB} */
	@JavadocExclude
	public static void nglGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, long values) {
		long __functionAddress = getInstance().GetnHistogramARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnHistogramARB(target, reset, format, type, bufSize, values, __functionAddress);
	}

	/**
	 * Robust version of {@link ARBImaging#glGetHistogram GetHistogram}
	 *
	 * @param target  the histogram target. Must be:<br>{@link ARBImaging#GL_HISTOGRAM HISTOGRAM}
	 * @param reset   if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format  the pixel data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type    the pixel data types. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param bufSize the maximum number of bytes to write into {@code values}
	 * @param values  a buffer in which to place the returned data
	 */
	public static void glGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnHistogramARB(target, reset, format, type, bufSize, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glGetnHistogramARB GetnHistogramARB} */
	public static void glGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnHistogramARB(target, reset, format, type, bufSize, valuesOffset);
	}

	/** Alternative version of: {@link #glGetnHistogramARB GetnHistogramARB} */
	public static void glGetnHistogramARB(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnHistogramARB(target, reset, format, type, values.remaining(), memAddress(values));
	}

	// --- [ glGetnMinmaxARB ] ---

	/** JNI method for {@link #glGetnMinmaxARB GetnMinmaxARB} */
	@JavadocExclude
	public static native void nglGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, long values, long __functionAddress);

	/** Unsafe version of {@link #glGetnMinmaxARB GetnMinmaxARB} */
	@JavadocExclude
	public static void nglGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, long values) {
		long __functionAddress = getInstance().GetnMinmaxARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnMinmaxARB(target, reset, format, type, bufSize, values, __functionAddress);
	}

	/**
	 * Robust version of {@link ARBImaging#glGetMinmax GetMinmax}
	 *
	 * @param target  the minmax target. Must be:<br>{@link ARBImaging#GL_MINMAX MINMAX}
	 * @param reset   If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *                representable value. All values are reset, whether returned or not.
	 * @param format  the pixel data format. One of:<br>{@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}
	 * @param type    the pixel data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param bufSize the maximum number of bytes to write into {@code values}
	 * @param values  a buffer in which to place the returned data
	 */
	public static void glGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnMinmaxARB(target, reset, format, type, bufSize, memAddress(values));
	}

	/** Buffer object offset version of: {@link #glGetnMinmaxARB GetnMinmaxARB} */
	public static void glGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, long valuesOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnMinmaxARB(target, reset, format, type, bufSize, valuesOffset);
	}

	/** Alternative version of: {@link #glGetnMinmaxARB GetnMinmaxARB} */
	public static void glGetnMinmaxARB(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnMinmaxARB(target, reset, format, type, values.remaining(), memAddress(values));
	}

	// --- [ glGetnCompressedTexImageARB ] ---

	/** JNI method for {@link #glGetnCompressedTexImageARB GetnCompressedTexImageARB} */
	@JavadocExclude
	public static native void nglGetnCompressedTexImageARB(int target, int level, int bufSize, long img, long __functionAddress);

	/** Unsafe version of {@link #glGetnCompressedTexImageARB GetnCompressedTexImageARB} */
	@JavadocExclude
	public static void nglGetnCompressedTexImageARB(int target, int level, int bufSize, long img) {
		long __functionAddress = getInstance().GetnCompressedTexImageARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnCompressedTexImageARB(target, level, bufSize, img, __functionAddress);
	}

	/**
	 * Robust version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}
	 *
	 * @param target  the target texture. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param bufSize the maximum number of bytes to write into {@code img}
	 * @param img     a buffer in which to place the returned data
	 */
	public static void glGetnCompressedTexImageARB(int target, int level, int bufSize, ByteBuffer img) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(img, bufSize);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnCompressedTexImageARB(target, level, bufSize, memAddress(img));
	}

	/** Buffer object offset version of: {@link #glGetnCompressedTexImageARB GetnCompressedTexImageARB} */
	public static void glGetnCompressedTexImageARB(int target, int level, int bufSize, long imgOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnCompressedTexImageARB(target, level, bufSize, imgOffset);
	}

	/** Alternative version of: {@link #glGetnCompressedTexImageARB GetnCompressedTexImageARB} */
	public static void glGetnCompressedTexImageARB(int target, int level, ByteBuffer img) {
		if ( LWJGLUtil.CHECKS ) {
			if ( LWJGLUtil.DEBUG )
				checkBuffer(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnCompressedTexImageARB(target, level, img.remaining(), memAddress(img));
	}

	// --- [ glGetnUniformfvARB ] ---

	/** JNI method for {@link #glGetnUniformfvARB GetnUniformfvARB} */
	@JavadocExclude
	public static native void nglGetnUniformfvARB(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformfvARB GetnUniformfvARB} */
	@JavadocExclude
	public static void nglGetnUniformfvARB(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformfvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnUniformfvARB(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Robust version of {@link GL20#glGetUniformfv GetUniformfv}
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of bytes to write into {@code params}
	 * @param params   a buffer in which to place the returned data
	 */
	public static void glGetnUniformfvARB(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformfvARB(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformfvARB GetnUniformfvARB} */
	public static void glGetnUniformfvARB(int program, int location, FloatBuffer params) {
		nglGetnUniformfvARB(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformfvARB GetnUniformfvARB} */
	public static float glGetnUniformfARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetnUniformfvARB(program, location, 1, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetnUniformivARB ] ---

	/** JNI method for {@link #glGetnUniformivARB GetnUniformivARB} */
	@JavadocExclude
	public static native void nglGetnUniformivARB(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformivARB GetnUniformivARB} */
	@JavadocExclude
	public static void nglGetnUniformivARB(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnUniformivARB(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Robust version of {@link GL20#glGetUniformiv GetUniformiv}
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of bytes to write into {@code params}
	 * @param params   a buffer in which to place the returned data
	 */
	public static void glGetnUniformivARB(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformivARB(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformivARB GetnUniformivARB} */
	public static void glGetnUniformivARB(int program, int location, IntBuffer params) {
		nglGetnUniformivARB(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformivARB GetnUniformivARB} */
	public static int glGetnUniformiARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetnUniformivARB(program, location, 1, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetnUniformuivARB ] ---

	/** JNI method for {@link #glGetnUniformuivARB GetnUniformuivARB} */
	@JavadocExclude
	public static native void nglGetnUniformuivARB(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformuivARB GetnUniformuivARB} */
	@JavadocExclude
	public static void nglGetnUniformuivARB(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformuivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnUniformuivARB(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Robust version of {@link GL30#glGetUniformuiv GetUniformuiv}
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of bytes to write into {@code params}
	 * @param params   a buffer in which to place the returned data
	 */
	public static void glGetnUniformuivARB(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformuivARB(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformuivARB GetnUniformuivARB} */
	public static void glGetnUniformuivARB(int program, int location, IntBuffer params) {
		nglGetnUniformuivARB(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformuivARB GetnUniformuivARB} */
	public static int glGetnUniformuiARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetnUniformuivARB(program, location, 1, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetnUniformdvARB ] ---

	/** JNI method for {@link #glGetnUniformdvARB GetnUniformdvARB} */
	@JavadocExclude
	public static native void nglGetnUniformdvARB(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformdvARB GetnUniformdvARB} */
	@JavadocExclude
	public static void nglGetnUniformdvARB(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformdvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetnUniformdvARB(program, location, bufSize, params, __functionAddress);
	}

	/**
	 * Robust version of {@link GL40#glGetUniformdv GetUniformdv}
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of bytes to write into {@code params}
	 * @param params   a buffer in which to place the returned data
	 */
	public static void glGetnUniformdvARB(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 3);
		nglGetnUniformdvARB(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformdvARB GetnUniformdvARB} */
	public static void glGetnUniformdvARB(int program, int location, DoubleBuffer params) {
		nglGetnUniformdvARB(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformdvARB GetnUniformdvARB} */
	public static double glGetnUniformdARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetnUniformdvARB(program, location, 1, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

}