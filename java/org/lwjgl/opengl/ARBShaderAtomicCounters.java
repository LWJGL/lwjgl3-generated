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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/shader_atomic_counters.txt">ARB_shader_atomic_counters</a> extension.
 * 
 * <p>This extension provides a set of atomic counters.</p>
 * 
 * <p>This extension provides GLSL built-in functions to query and increment/decrement these atomic counters.</p>
 * 
 * <p>This enables a shader to write to unique offsets (append to a buffer object) or read from unique offsets (consume from a buffer object).</p>
 * 
 * <p>Opaque handles to atomic counters are declared at global scope and are qualified with the uniform qualifier.</p>
 * 
 * <p>Unlike other user-defined uniforms declared at global scope, they take NO storage from the default partition, they have NO location, and they may NOT be
 * set with the Uniform* commands. Atomic counters may also NOT be grouped into uniform blocks.</p>
 * 
 * <p>Active atomic counters can be discovered by the commands {@link GL31#glGetUniformIndices GetUniformIndices}, {@link GL31#glGetActiveUniformName GetActiveUniformName}, {@link GL20#glGetActiveUniform GetActiveUniform} and
 * {@link GL31#glGetActiveUniformsiv GetActiveUniformsiv}.</p>
 * 
 * <p>Like samplers, the opaque handles of the atomic counters and are ONLY used in some GLSL built-in functions.</p>
 * 
 * <p>The atomic counters pointed to by the opaque handles are bound to buffer binding points and buffer offsets through the layout qualifiers in the shading
 * language, or they are implicitly assigned by the compiler.</p>
 * 
 * <p>Through the OpenGL API, buffer objects may be bound to these binding points with {@link GL30#glBindBufferBase BindBufferBase} or {@link GL30#glBindBufferRange BindBufferRange}.</p>
 * 
 * <p>The contents of the atomic counters are stored in the buffer objects. The contents of atomic counters may be set and queried with buffer object
 * manipulation functions (e.g. BufferData, BufferSubData, MapBuffer or MapBufferRange).</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBShaderAtomicCounters {

	/** Accepted by the {@code target} parameter of BindBufferBase and BindBufferRange. */
	public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;

	/**
	 * Accepted by the {@code pname} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, GetInteger64i_v, GetBooleanv, GetIntegerv,
	 * GetInteger64v, GetFloatv, GetDoublev, and GetActiveAtomicCounterBufferiv.
	 */
	public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;

	/** Accepted by the {@code pname} parameter of GetIntegeri_64v. */
	public static final int
		GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2,
		GL_ATOMIC_COUNTER_BUFFER_SIZE  = 0x92C3;

	/** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv. */
	public static final int
		GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE                            = 0x92C4,
		GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS               = 0x92C5,
		GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES        = 0x92C6,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER          = 0x92C7,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x92C8,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER        = 0x92CA,
		GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER        = 0x92CB;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
		GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS    = 0x92CD,
		GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE,
		GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS        = 0x92CF,
		GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
		GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
		GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
		GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS           = 0x92D3,
		GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS        = 0x92D4,
		GL_MAX_GEOMETRY_ATOMIC_COUNTERS               = 0x92D5,
		GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
		GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
		GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
		GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;

	/** Accepted by the {@code pname} parameter of GetActiveUniformsiv. */
	public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;

	/** Returned in {@code params} by GetActiveUniform and GetActiveUniformsiv. */
	public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;

	/** Function address. */
	@JavadocExclude
	public final long GetActiveAtomicCounterBufferiv;

	@JavadocExclude
	public ARBShaderAtomicCounters(FunctionProvider provider) {
		GetActiveAtomicCounterBufferiv = provider.getFunctionAddress("glGetActiveAtomicCounterBufferiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBShaderAtomicCounters} instance for the current context. */
	public static ARBShaderAtomicCounters getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBShaderAtomicCounters);
	}

	static ARBShaderAtomicCounters create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_shader_atomic_counters") ) return null;

		ARBShaderAtomicCounters funcs = new ARBShaderAtomicCounters(provider);

		boolean supported = checkFunctions(
			funcs.GetActiveAtomicCounterBufferiv
		);

		return GL.checkExtension("GL_ARB_shader_atomic_counters", funcs, supported);
	}

	// --- [ glGetActiveAtomicCounterBufferiv ] ---

	/** Unsafe version of {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	@JavadocExclude
	public static void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
		long __functionAddress = getInstance().GetActiveAtomicCounterBufferiv;
		invokeIIIPV(__functionAddress, program, bufferIndex, pname, params);
	}

	/**
	 * Obtains information about the set of active atomic counter buffers for a program.
	 *
	 * @param program     the name of a program object for which the command {@link GL20#glLinkProgram LinkProgram} has been issued in the past
	 * @param bufferIndex the index of an active atomic counter buffer
	 * @param pname       the parameter to query. One of:<br>{@link #GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}, {@link #GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}, {@link #GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}, {@link #GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}
	 * @param params      a buffer in which to place the returned value
	 */
	public static void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	public static void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
	public static int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}