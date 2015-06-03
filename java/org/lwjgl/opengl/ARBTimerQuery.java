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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/timer_query.txt">ARB_timer_query</a> extension.
 * 
 * <p>Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
 * identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
 * to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
 * idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
 * guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
 * results. {@link GL11#glFinish Finish} can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
 * affect application performance.</p>
 * 
 * <p>This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
 * stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to be
 * polled asynchronously by the application.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBTimerQuery {

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int GL_TIME_ELAPSED = 0x88BF;

	/**
	 * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
	 * GetInteger64v, GetFloatv, and GetDoublev.
	 */
	public static final int GL_TIMESTAMP = 0x8E28;

	/** Function address. */
	@JavadocExclude
	public final long
		QueryCounter,
		GetQueryObjecti64v,
		GetQueryObjectui64v;

	@JavadocExclude
	public ARBTimerQuery(FunctionProvider provider) {
		QueryCounter = provider.getFunctionAddress("glQueryCounter");
		GetQueryObjecti64v = provider.getFunctionAddress("glGetQueryObjecti64v");
		GetQueryObjectui64v = provider.getFunctionAddress("glGetQueryObjectui64v");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTimerQuery} instance for the current context. */
	public static ARBTimerQuery getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTimerQuery);
	}

	static ARBTimerQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_timer_query") ) return null;

		ARBTimerQuery funcs = new ARBTimerQuery(provider);

		boolean supported = checkFunctions(
			funcs.QueryCounter, funcs.GetQueryObjecti64v, funcs.GetQueryObjectui64v
		);

		return GL.checkExtension("GL_ARB_timer_query", funcs, supported);
	}

	// --- [ glQueryCounter ] ---

	/**
	 * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
	 *
	 * @param id     the name of a query object into which to record the GL time
	 * @param target the counter to query. Must be:<br>{@link #GL_TIMESTAMP TIMESTAMP}
	 */
	public static void glQueryCounter(int id, int target) {
		long __functionAddress = getInstance().QueryCounter;
		GL33.nglQueryCounter(id, target, __functionAddress);
	}

	// --- [ glGetQueryObjecti64v ] ---

	/** Unsafe version of {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	@JavadocExclude
	public static void nglGetQueryObjecti64v(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjecti64v;
		GL33.nglGetQueryObjecti64v(id, pname, params, __functionAddress);
	}

	/**
	 * Returns the 64bit integer value of query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}, {@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjecti64v(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjecti64v(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	public static void glGetQueryObjecti64v(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjecti64v(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	public static long glGetQueryObjecti64(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjecti64v(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetQueryObjectui64v ] ---

	/** Unsafe version of {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	@JavadocExclude
	public static void nglGetQueryObjectui64v(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectui64v;
		GL33.nglGetQueryObjectui64v(id, pname, params, __functionAddress);
	}

	/**
	 * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter
	 * @param params the requested data
	 */
	public static void glGetQueryObjectui64v(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjectui64v(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	public static void glGetQueryObjectui64v(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectui64v(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	public static long glGetQueryObjectui64(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjectui64v(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

}