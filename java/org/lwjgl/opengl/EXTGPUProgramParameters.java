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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/gpu_program_parameters.txt">EXT_gpu_program_parameters</a> extension.
 * 
 * <p>This extension provides a new set of procedures to load multiple consecutive program environment parameters more efficiently, via a single GL call
 * instead of multiple calls. This will reduce the amount of CPU overhead involved in loading parameters.</p>
 * 
 * <p>With the existing ARB_vertex_program and ARB_fragment_program APIs, program parameters must be loaded one at a time, via separate calls. While the
 * NV_vertex_program extension provides a set of similar functions that can be used to load program environment parameters (which are equivalent to
 * "program parameters" in NV_vertex_program), no such function exists for program local parameters.</p>
 */
public final class EXTGPUProgramParameters {

	/** Function address. */
	@JavadocExclude
	public final long
		ProgramEnvParameters4fvEXT,
		ProgramLocalParameters4fvEXT;

	@JavadocExclude
	public EXTGPUProgramParameters(FunctionProvider provider) {
		ProgramEnvParameters4fvEXT = provider.getFunctionAddress("glProgramEnvParameters4fvEXT");
		ProgramLocalParameters4fvEXT = provider.getFunctionAddress("glProgramLocalParameters4fvEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTGPUProgramParameters} instance for the current context. */
	public static EXTGPUProgramParameters getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTGPUProgramParameters);
	}

	static EXTGPUProgramParameters create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_gpu_program_parameters") ) return null;

		EXTGPUProgramParameters funcs = new EXTGPUProgramParameters(provider);

		boolean supported = checkFunctions(
			funcs.ProgramEnvParameters4fvEXT, funcs.ProgramLocalParameters4fvEXT
		);

		return GL.checkExtension("GL_EXT_gpu_program_parameters", funcs, supported);
	}

	// --- [ glProgramEnvParameters4fvEXT ] ---

	/** Unsafe version of {@link #glProgramEnvParameters4fvEXT ProgramEnvParameters4fvEXT} */
	@JavadocExclude
	public static void nglProgramEnvParameters4fvEXT(int target, int index, int count, long params) {
		long __functionAddress = getInstance().ProgramEnvParameters4fvEXT;
		callIIIPV(__functionAddress, target, index, count, params);
	}

	public static void glProgramEnvParameters4fvEXT(int target, int index, int count, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, (count << 2) << 2);
		nglProgramEnvParameters4fvEXT(target, index, count, memAddress(params));
	}

	/** Alternative version of: {@link #glProgramEnvParameters4fvEXT ProgramEnvParameters4fvEXT} */
	public static void glProgramEnvParameters4fvEXT(int target, int index, FloatBuffer params) {
		nglProgramEnvParameters4fvEXT(target, index, params.remaining() >> 2, memAddress(params));
	}

	// --- [ glProgramLocalParameters4fvEXT ] ---

	/** Unsafe version of {@link #glProgramLocalParameters4fvEXT ProgramLocalParameters4fvEXT} */
	@JavadocExclude
	public static void nglProgramLocalParameters4fvEXT(int target, int index, int count, long params) {
		long __functionAddress = getInstance().ProgramLocalParameters4fvEXT;
		callIIIPV(__functionAddress, target, index, count, params);
	}

	public static void glProgramLocalParameters4fvEXT(int target, int index, int count, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, (count << 2) << 2);
		nglProgramLocalParameters4fvEXT(target, index, count, memAddress(params));
	}

	/** Alternative version of: {@link #glProgramLocalParameters4fvEXT ProgramLocalParameters4fvEXT} */
	public static void glProgramLocalParameters4fvEXT(int target, int index, FloatBuffer params) {
		nglProgramLocalParameters4fvEXT(target, index, params.remaining() >> 2, memAddress(params));
	}

}