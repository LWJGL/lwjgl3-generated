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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/shader_subroutine.txt">ARB_shader_subroutine</a> extension.
 * 
 * <p>This extension adds support to shaders for "indirect subroutine calls", where a single shader can include many subroutines and dynamically select
 * through the API which subroutine is called from each call site. Switching subroutines dynamically in this fashion can avoid the cost of recompiling and
 * managing multiple shaders, while still retaining most of the performance of specialized shaders.</p>
 * 
 * <p>Requires {@link ARBGPUShader5 ARB_gpu_shader5}. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public final class ARBShaderSubroutine {

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

	/** Function address. */
	@JavadocExclude
	public final long
		GetSubroutineUniformLocation,
		GetSubroutineIndex,
		GetActiveSubroutineUniformiv,
		GetActiveSubroutineUniformName,
		GetActiveSubroutineName,
		UniformSubroutinesuiv,
		GetUniformSubroutineuiv,
		GetProgramStageiv;

	@JavadocExclude
	public ARBShaderSubroutine(FunctionProvider provider) {
		GetSubroutineUniformLocation = provider.getFunctionAddress("glGetSubroutineUniformLocation");
		GetSubroutineIndex = provider.getFunctionAddress("glGetSubroutineIndex");
		GetActiveSubroutineUniformiv = provider.getFunctionAddress("glGetActiveSubroutineUniformiv");
		GetActiveSubroutineUniformName = provider.getFunctionAddress("glGetActiveSubroutineUniformName");
		GetActiveSubroutineName = provider.getFunctionAddress("glGetActiveSubroutineName");
		UniformSubroutinesuiv = provider.getFunctionAddress("glUniformSubroutinesuiv");
		GetUniformSubroutineuiv = provider.getFunctionAddress("glGetUniformSubroutineuiv");
		GetProgramStageiv = provider.getFunctionAddress("glGetProgramStageiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBShaderSubroutine} instance for the current context. */
	public static ARBShaderSubroutine getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBShaderSubroutine);
	}

	static ARBShaderSubroutine create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_shader_subroutine") ) return null;

		ARBShaderSubroutine funcs = new ARBShaderSubroutine(provider);

		boolean supported = checkFunctions(
			funcs.GetSubroutineUniformLocation, funcs.GetSubroutineIndex, funcs.GetActiveSubroutineUniformiv, funcs.GetActiveSubroutineUniformName, 
			funcs.GetActiveSubroutineName, funcs.UniformSubroutinesuiv, funcs.GetUniformSubroutineuiv, funcs.GetProgramStageiv
		);

		return GL.checkExtension("GL_ARB_shader_subroutine", funcs, supported);
	}

	// --- [ glGetSubroutineUniformLocation ] ---

	/** Unsafe version of {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
	@JavadocExclude
	public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
		long __functionAddress = getInstance().GetSubroutineUniformLocation;
		return GL40.nglGetSubroutineUniformLocation(program, shadertype, name, __functionAddress);
	}

	/**
	 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param name       the name of the subroutine uniform whose index to query.
	 */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetSubroutineUniformLocation(program, shadertype, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
	public static int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetSubroutineUniformLocation(program, shadertype, __buffer.address(nameEncoded));
	}

	// --- [ glGetSubroutineIndex ] ---

	/** Unsafe version of {@link #glGetSubroutineIndex GetSubroutineIndex} */
	@JavadocExclude
	public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
		long __functionAddress = getInstance().GetSubroutineIndex;
		return GL40.nglGetSubroutineIndex(program, shadertype, name, __functionAddress);
	}

	/**
	 * Retrieves the index of a subroutine function of a given shader stage within a program.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param name       the name of the subroutine function whose index to query
	 */
	public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetSubroutineIndex(program, shadertype, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetSubroutineIndex GetSubroutineIndex} */
	public static int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetSubroutineIndex(program, shadertype, __buffer.address(nameEncoded));
	}

	// --- [ glGetActiveSubroutineUniformiv ] ---

	/** Unsafe version of {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	@JavadocExclude
	public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
		long __functionAddress = getInstance().GetActiveSubroutineUniformiv;
		GL40.nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values, __functionAddress);
	}

	/**
	 * Queries a property of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param pname      the parameter of the shader subroutine uniform to query. One of:<br>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}, {@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}, {@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}, {@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}
	 * @param values     the address of a buffer into which the queried value or values will be placed
	 */
	public static void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
	}

	/** Alternative version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	public static void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
	}

	/** Single return value version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
	public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, __buffer.address(values));
		return __buffer.intValue(values);
	}

	// --- [ glGetActiveSubroutineUniformName ] ---

	/** Unsafe version of {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	@JavadocExclude
	public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
		long __functionAddress = getInstance().GetActiveSubroutineUniformName;
		GL40.nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name, __functionAddress);
	}

	/**
	 * Queries the name of an active shader subroutine uniform.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     the address of a variable into which is written the number of characters copied into {@code name}
	 * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
	 */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
	public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
		int bufsize = glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetActiveSubroutineName ] ---

	/** Unsafe version of {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	@JavadocExclude
	public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
		long __functionAddress = getInstance().GetActiveSubroutineName;
		GL40.nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name, __functionAddress);
	}

	/**
	 * Queries the name of an active shader subroutine.
	 *
	 * @param program    the name of the program containing the subroutine
	 * @param shadertype the shader stage from which to query the subroutine name. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param index      the index of the shader subroutine uniform
	 * @param bufsize    the size of the buffer whose address is given in {@code name}
	 * @param length     a variable which is to receive the length of the shader subroutine uniform name
	 * @param name       an array into which the name of the shader subroutine uniform will be written
	 */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufsize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
	public static String glGetActiveSubroutineName(int program, int shadertype, int index) {
		int bufsize = glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufsize);
		nglGetActiveSubroutineName(program, shadertype, index, bufsize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glUniformSubroutinesuiv ] ---

	/** Unsafe version of {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	@JavadocExclude
	public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
		long __functionAddress = getInstance().UniformSubroutinesuiv;
		GL40.nglUniformSubroutinesuiv(shadertype, count, indices, __functionAddress);
	}

	/**
	 * Loads active subroutine uniforms.
	 *
	 * @param shadertype the shader stage to update. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param count      the number of uniform indices stored in {@code indices}
	 * @param indices    an array holding the indices to load into the shader subroutine variables
	 */
	public static void glUniformSubroutinesuiv(int shadertype, int count, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << 2);
		nglUniformSubroutinesuiv(shadertype, count, memAddress(indices));
	}

	/** Alternative version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	public static void glUniformSubroutinesuiv(int shadertype, IntBuffer indices) {
		nglUniformSubroutinesuiv(shadertype, indices.remaining(), memAddress(indices));
	}

	/** Single value version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
	public static void glUniformSubroutinesui(int shadertype, int index) {
		APIBuffer __buffer = apiBuffer();
		int indices = __buffer.intParam(index);
		nglUniformSubroutinesuiv(shadertype, 1, __buffer.address(indices));
	}

	// --- [ glGetUniformSubroutineuiv ] ---

	/** Unsafe version of {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	@JavadocExclude
	public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
		long __functionAddress = getInstance().GetUniformSubroutineuiv;
		GL40.nglGetUniformSubroutineuiv(shadertype, location, params, __functionAddress);
	}

	/**
	 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
	 *
	 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param location   the location of the subroutine uniform
	 * @param params     a variable to receive the value or values of the subroutine uniform
	 */
	public static void glGetUniformSubroutineuiv(int shadertype, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	public static void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
	public static int glGetUniformSubroutineui(int shadertype, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformSubroutineuiv(shadertype, location, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramStageiv ] ---

	/** Unsafe version of {@link #glGetProgramStageiv GetProgramStageiv} */
	@JavadocExclude
	public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
		long __functionAddress = getInstance().GetProgramStageiv;
		GL40.nglGetProgramStageiv(program, shadertype, pname, values, __functionAddress);
	}

	/**
	 * Retrieves properties of a program object corresponding to a specified shader stage.
	 *
	 * @param program    the name of the program containing shader stage
	 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}, {@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}, {@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}, {@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}
	 * @param pname      the parameter of the shader to query. One of:<br>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}, {@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}, {@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}
	 * @param values     a variable into which the queried value or values will be placed
	 */
	public static void glGetProgramStageiv(int program, int shadertype, int pname, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
	}

	/** Alternative version of: {@link #glGetProgramStageiv GetProgramStageiv} */
	public static void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
	}

	/** Single return value version of: {@link #glGetProgramStageiv GetProgramStageiv} */
	public static int glGetProgramStagei(int program, int shadertype, int pname) {
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetProgramStageiv(program, shadertype, pname, __buffer.address(values));
		return __buffer.intValue(values);
	}

}