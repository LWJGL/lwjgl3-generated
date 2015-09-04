/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/parallel_shader_compile.txt">ARB_parallel_shader_compile</a> extension.
 * 
 * <p>Compiling GLSL into implementation-specific code can be a time consuming process, so a GL implementation may wish to perform the compilation in a
 * separate CPU thread. This extension provides a mechanism for the application to provide a hint to limit the number of threads it wants to be used to
 * compile shaders, as well as a query to determine if the compilation process is complete.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public final class ARBParallelShaderCompile {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;

	/** Accepted as part of the {@code pname} parameter to GetShaderiv() and accepted as part of the {@code pname} parameter to GetProgramiv(). */
	public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;

	/** Function address. */
	@JavadocExclude
	public final long MaxShaderCompilerThreadsARB;

	@JavadocExclude
	public ARBParallelShaderCompile(FunctionProvider provider) {
		MaxShaderCompilerThreadsARB = provider.getFunctionAddress("glMaxShaderCompilerThreadsARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBParallelShaderCompile} instance for the current context. */
	public static ARBParallelShaderCompile getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBParallelShaderCompile);
	}

	static ARBParallelShaderCompile create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_parallel_shader_compile") ) return null;

		ARBParallelShaderCompile funcs = new ARBParallelShaderCompile(provider);

		boolean supported = checkFunctions(
			funcs.MaxShaderCompilerThreadsARB
		);

		return GL.checkExtension("GL_ARB_parallel_shader_compile", funcs, supported);
	}

	// --- [ glMaxShaderCompilerThreadsARB ] ---

	/**
	 * Application may use the following to hint to the driver the maximum number background threads it would like to be used in the process of compiling
	 * shaders or linking programs.
	 * 
	 * <p>An implementation may combine the maximum compiler thread request from multiple contexts in a share group in an implementation-specific way.</p>
	 * 
	 * <p>An application can query the current MaxShaderCompilerThreads() {@code count} by calling {@link GL11#glGetIntegerv GetIntegerv} with {@code pname} set to
	 * {@link #GL_MAX_SHADER_COMPILER_THREADS MAX_SHADER_COMPILER_THREADS}.</p>
	 *
	 * @param count the number of background threads. A {@code count} of zero specifies a request for no parallel compiling or linking and a {@code count} of
	 *              {@code 0xFFFFFFFF} requests an implementation-specific maximum.
	 */
	public static void glMaxShaderCompilerThreadsARB(int count) {
		long __functionAddress = getInstance().MaxShaderCompilerThreadsARB;
		callIV(__functionAddress, count);
	}

}