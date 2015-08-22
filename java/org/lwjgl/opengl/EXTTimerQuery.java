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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/timer_query.txt">EXT_timer_query</a> extension.
 * 
 * <p>Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
 * identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
 * to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
 * idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
 * guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
 * results. glFinish() can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
 * affect application performance.</p>
 * 
 * <p>This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
 * stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to
 * be polled asynchronously by the application.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}.</p>
 */
public final class EXTTimerQuery {

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

	/** Function address. */
	@JavadocExclude
	public final long
		GetQueryObjecti64vEXT,
		GetQueryObjectui64vEXT;

	@JavadocExclude
	public EXTTimerQuery(FunctionProvider provider) {
		GetQueryObjecti64vEXT = provider.getFunctionAddress("glGetQueryObjecti64vEXT");
		GetQueryObjectui64vEXT = provider.getFunctionAddress("glGetQueryObjectui64vEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTTimerQuery} instance for the current context. */
	public static EXTTimerQuery getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTTimerQuery);
	}

	static EXTTimerQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_timer_query") ) return null;

		EXTTimerQuery funcs = new EXTTimerQuery(provider);

		boolean supported = checkFunctions(
			funcs.GetQueryObjecti64vEXT, funcs.GetQueryObjectui64vEXT
		);

		return GL.checkExtension("GL_EXT_timer_query", funcs, supported);
	}

	// --- [ glGetQueryObjecti64vEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	@JavadocExclude
	public static void nglGetQueryObjecti64vEXT(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjecti64vEXT;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjecti64vEXT(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	public static void glGetQueryObjecti64vEXT(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	public static long glGetQueryObjecti64EXT(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjecti64vEXT(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetQueryObjectui64vEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	@JavadocExclude
	public static void nglGetQueryObjectui64vEXT(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectui64vEXT;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectui64vEXT(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	public static void glGetQueryObjectui64vEXT(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	public static long glGetQueryObjectui64EXT(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjectui64vEXT(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

}