/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/shader_subroutine.txt">ARB_shader_subroutine</a> extension.
 * 
 * <p>This extension adds support to shaders for "indirect subroutine calls", where a single shader can include many subroutines and dynamically select
 * through the API which subroutine is called from each call site. Switching subroutines dynamically in this fashion can avoid the cost of recompiling and
 * managing multiple shaders, while still retaining most of the performance of specialized shaders.</p>
 * 
 * <p>Requires {@link ARBGPUShader5 ARB_gpu_shader5}. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBShaderSubroutine {

	/** Accepted by the {@code pname} parameter of GetProgramStageiv. */
	public static final int
		GL_ACTIVE_SUBROUTINES                   = 0x8DE5,
		GL_ACTIVE_SUBROUTINE_UNIFORMS           = 0x8DE6,
		GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS  = 0x8E47,
		GL_ACTIVE_SUBROUTINE_MAX_LENGTH         = 0x8E48,
		GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
	public static final int
		GL_MAX_SUBROUTINES                  = 0x8DE7,
		GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;

	/** Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv. */
	public static final int
		GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A,
		GL_COMPATIBLE_SUBROUTINES     = 0x8E4B;

	protected ARBShaderSubroutine() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetSubroutineUniformLocation, caps.glGetSubroutineIndex, caps.glGetActiveSubroutineUniformiv, caps.glGetActiveSubroutineUniformName, 
			caps.glGetActiveSubroutineName, caps.glUniformSubroutinesuiv, caps.glGetUniformSubroutineuiv, caps.glGetProgramStageiv
		);
	}

	// --- [ glGetSubroutineUniformLocation ] ---

	/**
	 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param name       the name of the subroutine uniform whose index to query.
	 */
	public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
		long __functionAddress = GL.getCapabilities().glGetSubroutineUniformLocation;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, shadertype, name);
	}

	/**
	 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param name       the name of the subroutine uniform whose index to query.
	 */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetSubroutineUniformLocation(program, shadertype, memAddress(name));
	}

	/**
	 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param name       the name of the subroutine uniform whose index to query.
	 */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetSubroutineUniformLocation(program, shadertype, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSubroutineIndex ] ---

	/**
	 * Retrieves the index of a subroutine function of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param name       the name of the subroutine function whose index to query
	 */
	public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
		long __functionAddress = GL.getCapabilities().glGetSubroutineIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, shadertype, name);
	}

	/**
	 * Retrieves the index of a subroutine function of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param name       the name of the subroutine function whose index to query
	 */
	public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetSubroutineIndex(program, shadertype, memAddress(name));
	}

	/**
	 * Retrieves the index of a subroutine function of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param name       the name of the subroutine function whose index to query
	 */
	public static int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetSubroutineIndex(program, shadertype, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveSubroutineUniformiv ] ---

	/**
	 * Queries a property of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
	 * @param values     the address of a buffer into which the queried value or values will be placed
	 */
	public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
		long __functionAddress = GL.getCapabilities().glGetActiveSubroutineUniformiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, shadertype, index, pname, values);
	}

	/**
	 * Queries a property of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
	 * @param values     the address of a buffer into which the queried value or values will be placed
	 */
	public static void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
	}

	/**
	 * Queries a property of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
	 */
	public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveSubroutineUniformName ] ---

	/**
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     the address of a variable into which is written the number of characters copied into {@code name}
	 * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
	 */
	public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
		long __functionAddress = GL.getCapabilities().glGetActiveSubroutineUniformName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, shadertype, index, bufsize, length, name);
	}

	/**
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param length     the address of a variable into which is written the number of characters copied into {@code name}
	 * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
	 */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/**
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufsize);
			nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
		int bufsize = glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufsize);
			nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveSubroutineName ] ---

	/**
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     a variable which is to receive the length of the shader subroutine uniform name
	 * @param name       an array into which the name of the shader subroutine uniform will be written
	 */
	public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
		long __functionAddress = GL.getCapabilities().glGetActiveSubroutineName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, shadertype, index, bufsize, length, name);
	}

	/**
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param length     a variable which is to receive the length of the shader subroutine uniform name
	 * @param name       an array into which the name of the shader subroutine uniform will be written
	 */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/**
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufsize);
			nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param index      the index of the shader subroutine uniform
	 */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index) {
		int bufsize = glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufsize);
			nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniformSubroutinesuiv ] ---

	/**
	 * Loads active subroutine uniforms.
	 *
	 * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param count      the number of uniform indices stored in {@code indices}
	 * @param indices    an array holding the indices to load into the shader subroutine variables
	 */
	public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
		long __functionAddress = GL.getCapabilities().glUniformSubroutinesuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, shadertype, count, indices);
	}

	/**
	 * Loads active subroutine uniforms.
	 *
	 * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param indices    an array holding the indices to load into the shader subroutine variables
	 */
	public static void glUniformSubroutinesuiv(int shadertype, IntBuffer indices) {
		nglUniformSubroutinesuiv(shadertype, indices.remaining(), memAddress(indices));
	}

	/**
	 * Loads active subroutine uniforms.
	 *
	 * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 */
	public static void glUniformSubroutinesui(int shadertype, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer indices = stack.ints(index);
			nglUniformSubroutinesuiv(shadertype, 1, memAddress(indices));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformSubroutineuiv ] ---

	/**
	 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
	 *
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param location   the location of the subroutine uniform
	 * @param params     a variable to receive the value or values of the subroutine uniform
	 */
	public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformSubroutineuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, shadertype, location, params);
	}

	/**
	 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
	 *
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param location   the location of the subroutine uniform
	 * @param params     a variable to receive the value or values of the subroutine uniform
	 */
	public static void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
	}

	/**
	 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
	 *
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param location   the location of the subroutine uniform
	 */
	public static int glGetUniformSubroutineui(int shadertype, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramStageiv ] ---

	/**
	 * Retrieves properties of a program object corresponding to a specified shader stage.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
	 * @param values     a variable into which the queried value or values will be placed
	 */
	public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
		long __functionAddress = GL.getCapabilities().glGetProgramStageiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, shadertype, pname, values);
	}

	/**
	 * Retrieves properties of a program object corresponding to a specified shader stage.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
	 * @param values     a variable into which the queried value or values will be placed
	 */
	public static void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
	}

	/**
	 * Retrieves properties of a program object corresponding to a specified shader stage.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
	 * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
	 */
	public static int glGetProgramStagei(int program, int shadertype, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	public static void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, int[] values) {
		long __functionAddress = GL.getCapabilities().glGetActiveSubroutineUniformiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		callPV(__functionAddress, program, shadertype, index, pname, values);
	}

	/** Array version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int[] length, ByteBuffer name) {
		long __functionAddress = GL.getCapabilities().glGetActiveSubroutineUniformName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, shadertype, index, name.remaining(), length, memAddress(name));
	}

	/** Array version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, int[] length, ByteBuffer name) {
		long __functionAddress = GL.getCapabilities().glGetActiveSubroutineName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, shadertype, index, name.remaining(), length, memAddress(name));
	}

	/** Array version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	public static void glUniformSubroutinesuiv(int shadertype, int[] indices) {
		long __functionAddress = GL.getCapabilities().glUniformSubroutinesuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, shadertype, indices.length, indices);
	}

	/** Array version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	public static void glGetUniformSubroutineuiv(int shadertype, int location, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetUniformSubroutineuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, shadertype, location, params);
	}

	/** Array version of: {@link #glGetProgramStageiv GetProgramStageiv} */
	public static void glGetProgramStageiv(int program, int shadertype, int pname, int[] values) {
		long __functionAddress = GL.getCapabilities().glGetProgramStageiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		callPV(__functionAddress, program, shadertype, pname, values);
	}

}