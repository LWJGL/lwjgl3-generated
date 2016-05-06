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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/uniform_buffer_object.txt">ARB_uniform_buffer_object</a> extension.
 * 
 * <p>This extension introduces the concept of a group of GLSL uniforms known as a "uniform block", and the API mechanisms to store "uniform blocks" in GL
 * buffer objects.</p>
 * 
 * <p>The extension also defines both a standard cross-platform layout in memory for uniform block data, as well as mechanisms to allow the GL to optimize the
 * data layout in an implementation-defined manner.</p>
 * 
 * <p>Prior to this extension, the existing interface for modification of uniform values allowed modification of large numbers of values using glUniform*
 * calls, but only for a single uniform name (or a uniform array) at a time. However, updating uniforms in this manner may not map well to heterogenous
 * uniform data structures defined for a GL application and in these cases, the application is forced to either:</p>
 * 
 * <ol type=A>
 * <li>restructure their uniform data definitions into arrays or</li>
 * <li>make an excessive number of calls through the GL interface to one of the Uniform* variants.</li>
 * </ol>
 * 
 * <p>These solutions have their disadvantages. Solution A imposes considerable development overhead on the application developer. Solution B may impose
 * considerable run-time overhead on the application if the number of uniforms modified in a given frame of rendering is sufficiently large.</p>
 * 
 * <p>This extension provides a better alternative to either (A) or (B) by allowing buffer object backing for the storage associated with all uniforms of a
 * given GLSL program.</p>
 * 
 * <p>Storing uniform blocks in buffer objects enables several key use cases:</p>
 * 
 * <ul>
 * <li>sharing of uniform data storage between program objects and between program stages</li>
 * <li>rapid swapping of sets of previously defined uniforms by storing sets of uniform data on the GL server</li>
 * <li>rapid updates of uniform data from both the client and the server</li>
 * </ul>
 * 
 * <p>The data storage for a uniform block can be declared to use one of three layouts in memory: packed, shared, or std140.</p>
 * 
 * <ul>
 * <li>"packed" uniform blocks have an implementation-dependent data layout for efficiency, and unused uniforms may be eliminated by the compiler to save
 * space.</li>
 * <li>"shared" uniform blocks, the default layout, have an implementation-dependent data layout for efficiency, but the layout will be uniquely determined
 * by the structure of the block, allowing data storage to be shared across programs.</li>
 * <li>"std140" uniform blocks have a standard cross-platform cross-vendor layout (see below). Unused uniforms will not be eliminated.</li>
 * </ul>
 * 
 * <p>Any uniforms not declared in a named uniform block are said to be part of the "default uniform block".</p>
 * 
 * <p>While uniforms in the default uniform block are updated with glUniform* entry points and can have static initializers, uniforms in named uniform blocks
 * are not. Instead, uniform block data is updated using the routines that update buffer objects and can not use static initializers.</p>
 * 
 * <p>Rules and Concepts Guiding this Specification:</p>
 * 
 * <p>For reference, a uniform has a "uniform index" (subsequently referred to as "u_index) and also a "uniform location" to efficiently identify it in the
 * uniform data store of the implementation. We subsequently refer to this uniform data store of the implementation as the "uniform database".</p>
 * 
 * <p>A "uniform block" only has a "uniform block index" used for queries and connecting the "uniform block" to a buffer object. A "uniform block" has no
 * "location" because "uniform blocks" are not updated directly. The buffer object APIs are used instead.</p>
 * 
 * <p>Properties of Uniforms and uniform blocks:</p>
 * 
 * <ol type=a>
 * <li>A uniform is "active" if it exists in the database and has a valid u_index.</li>
 * <li>A "uniform block" is "active" if it exists in the database and has a valid ub_index.</li>
 * <li>Uniforms and "uniform blocks" can be inactive because they don't exist in the source, or because they have been removed by dead code elimination.</li>
 * <li>An inactive uniform has u_index == {@link #GL_INVALID_INDEX INVALID_INDEX}.</li>
 * <li>An inactive uniform block has ub_index == {@link #GL_INVALID_INDEX INVALID_INDEX}.</li>
 * <li>A u_index or ub_index of {@link #GL_INVALID_INDEX INVALID_INDEX} generates the {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error if given as a function argument.</li>
 * <li>The default uniform block, which is not assigned any ub_index, uses a private, internal data storage, and does not have any buffer object associated
 * with it.</li>
 * <li>An active uniform that is a member of the default uniform block has location >= 0 and it has offset == stride == -1.</li>
 * <li>An active uniform that is a member of a named uniform block has location == -1.</li>
 * <li>A uniform location of -1 is silently ignored if given as a function argument.</li>
 * <li>Uniform block declarations may not be nested</li>
 * </ol>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects} and {@link GL15 OpenGL 1.5} or {@link ARBVertexBufferObject ARB_vertex_buffer_object}. Promoted to core in {@link GL31 OpenGL 3.1}.</p>
 */
public class ARBUniformBufferObject {

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int GL_UNIFORM_BUFFER = 0x8A11;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v. */
	public static final int
		GL_UNIFORM_BUFFER_START = 0x8A29,
		GL_UNIFORM_BUFFER_SIZE  = 0x8A2A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_UNIFORM_BLOCKS                = 0x8A2B,
		GL_MAX_GEOMETRY_UNIFORM_BLOCKS              = 0x8A2C,
		GL_MAX_FRAGMENT_UNIFORM_BLOCKS              = 0x8A2D,
		GL_MAX_COMBINED_UNIFORM_BLOCKS              = 0x8A2E,
		GL_MAX_UNIFORM_BUFFER_BINDINGS              = 0x8A2F,
		GL_MAX_UNIFORM_BLOCK_SIZE                   = 0x8A30,
		GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS   = 0x8A31,
		GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32,
		GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33,
		GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT          = 0x8A34;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35,
		GL_ACTIVE_UNIFORM_BLOCKS                = 0x8A36;

	/** Accepted by the {@code pname} parameter of GetActiveUniformsiv. */
	public static final int
		GL_UNIFORM_TYPE          = 0x8A37,
		GL_UNIFORM_SIZE          = 0x8A38,
		GL_UNIFORM_NAME_LENGTH   = 0x8A39,
		GL_UNIFORM_BLOCK_INDEX   = 0x8A3A,
		GL_UNIFORM_OFFSET        = 0x8A3B,
		GL_UNIFORM_ARRAY_STRIDE  = 0x8A3C,
		GL_UNIFORM_MATRIX_STRIDE = 0x8A3D,
		GL_UNIFORM_IS_ROW_MAJOR  = 0x8A3E;

	/** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
	public static final int
		GL_UNIFORM_BLOCK_BINDING                       = 0x8A3F,
		GL_UNIFORM_BLOCK_DATA_SIZE                     = 0x8A40,
		GL_UNIFORM_BLOCK_NAME_LENGTH                   = 0x8A41,
		GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS               = 0x8A42,
		GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES        = 0x8A43,
		GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER   = 0x8A44,
		GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45,
		GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;

	/** Returned by GetActiveUniformsiv and GetUniformBlockIndex. */
	public static final int GL_INVALID_INDEX = 0xFFFFFFFF;

	protected ARBUniformBufferObject() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetUniformIndices, caps.glGetActiveUniformsiv, caps.glGetActiveUniformName, caps.glGetUniformBlockIndex, caps.glGetActiveUniformBlockiv, 
			caps.glGetActiveUniformBlockName, caps.glBindBufferRange, caps.glBindBufferBase, caps.glGetIntegeri_v, caps.glUniformBlockBinding
		);
	}

	// --- [ glGetUniformIndices ] ---

	/**
	 * Retrieves the indices of a number of uniforms within a program object
	 *
	 * @param program        the name of a program containing uniforms whose indices to query
	 * @param uniformCount   the number of uniforms whose indices to query
	 * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
	 * @param uniformIndices an array that will receive the indices of the uniforms
	 */
	public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
		long __functionAddress = GL.getCapabilities().glGetUniformIndices;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformCount, uniformNames, uniformIndices);
	}

	/**
	 * Retrieves the indices of a number of uniforms within a program object
	 *
	 * @param program        the name of a program containing uniforms whose indices to query
	 * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
	 * @param uniformIndices an array that will receive the indices of the uniforms
	 */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
		if ( CHECKS )
			checkBuffer(uniformIndices, uniformNames.remaining());
		nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
	}

	/**
	 * Retrieves the indices of a number of uniforms within a program object
	 *
	 * @param program        the name of a program containing uniforms whose indices to query
	 * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
	 * @param uniformIndices an array that will receive the indices of the uniforms
	 */
	public static void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
		if ( CHECKS )
			checkBuffer(uniformIndices, uniformNames.length);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long uniformNamesAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, uniformNames);
			nglGetUniformIndices(program, uniformNames.length, uniformNamesAddress, memAddress(uniformIndices));
			org.lwjgl.system.APIUtil.apiArrayFree(uniformNamesAddress, uniformNames.length);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Retrieves the indices of a number of uniforms within a program object
	 *
	 * @param program the name of a program containing uniforms whose indices to query
	 */
	public static int glGetUniformIndices(int program, CharSequence uniformName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long uniformNamesAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, uniformName);
			IntBuffer uniformIndices = stack.callocInt(1);
			nglGetUniformIndices(program, 1, uniformNamesAddress, memAddress(uniformIndices));
			org.lwjgl.system.APIUtil.apiArrayFree(uniformNamesAddress, 1);
			return uniformIndices.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniformsiv ] ---

	/**
	 * Returns information about several active uniform variables for the specified program object.
	 *
	 * @param program        the program object to be queried
	 * @param uniformCount   the number of elements in the array of indices {@code uniformIndices} and the number of parameters written to {@code params} upon successful return
	 * @param uniformIndices an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}
	 * @param pname          the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
	 * @param params         an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}
	 */
	public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformsiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformCount, uniformIndices, pname, params);
	}

	/**
	 * Returns information about several active uniform variables for the specified program object.
	 *
	 * @param program        the program object to be queried
	 * @param uniformIndices an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}
	 * @param pname          the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
	 * @param params         an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}
	 */
	public static void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, uniformIndices.remaining());
		nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
	}

	/**
	 * Returns information about several active uniform variables for the specified program object.
	 *
	 * @param program the program object to be queried
	 * @param pname   the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
	 */
	public static int glGetActiveUniformsi(int program, int uniformIndex, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			IntBuffer uniformIndices = stack.ints(uniformIndex);
			nglGetActiveUniformsiv(program, 1, memAddress(uniformIndices), pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniformName ] ---

	/**
	 * Queries the name of an active uniform.
	 *
	 * @param program      the program containing the active uniform index {@code uniformIndex}
	 * @param uniformIndex the index of the active uniform whose name to query
	 * @param bufSize      the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
	 * @param length       the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}
	 * @param uniformName  the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}
	 */
	public static void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformIndex, bufSize, length, uniformName);
	}

	/**
	 * Queries the name of an active uniform.
	 *
	 * @param program      the program containing the active uniform index {@code uniformIndex}
	 * @param uniformIndex the index of the active uniform whose name to query
	 * @param length       the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}
	 * @param uniformName  the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}
	 */
	public static void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), memAddressSafe(length), memAddress(uniformName));
	}

	/**
	 * Queries the name of an active uniform.
	 *
	 * @param program      the program containing the active uniform index {@code uniformIndex}
	 * @param uniformIndex the index of the active uniform whose name to query
	 * @param bufSize      the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
	 */
	public static String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer uniformName = stack.malloc(bufSize);
			nglGetActiveUniformName(program, uniformIndex, bufSize, memAddress(length), memAddress(uniformName));
			return memASCII(uniformName, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Queries the name of an active uniform.
	 *
	 * @param program      the program containing the active uniform index {@code uniformIndex}
	 * @param uniformIndex the index of the active uniform whose name to query
	 */
	public static String glGetActiveUniformName(int program, int uniformIndex) {
		int bufSize = glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer uniformName = stack.malloc(bufSize);
			nglGetActiveUniformName(program, uniformIndex, bufSize, memAddress(length), memAddress(uniformName));
			return memASCII(uniformName, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformBlockIndex ] ---

	/**
	 * Retrieves the index of a named uniform block.
	 *
	 * @param program          the name of a program containing the uniform block
	 * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
	 */
	public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
		long __functionAddress = GL.getCapabilities().glGetUniformBlockIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, uniformBlockName);
	}

	/**
	 * Retrieves the index of a named uniform block.
	 *
	 * @param program          the name of a program containing the uniform block
	 * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
	 */
	public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
		if ( CHECKS )
			checkNT1(uniformBlockName);
		return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
	}

	/**
	 * Retrieves the index of a named uniform block.
	 *
	 * @param program          the name of a program containing the uniform block
	 * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
	 */
	public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer uniformBlockNameEncoded = stack.ASCII(uniformBlockName);
			return nglGetUniformBlockIndex(program, memAddress(uniformBlockNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniformBlockiv ] ---

	/**
	 * Queries information about an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param pname             the name of the parameter to query. One of:<br><table><tr><td>{@link #GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link #GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
	 * @param params            the address of a variable to receive the result of the query
	 */
	public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformBlockiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, uniformBlockIndex, pname, params);
	}

	/**
	 * Queries information about an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param pname             the name of the parameter to query. One of:<br><table><tr><td>{@link #GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link #GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
	 * @param params            the address of a variable to receive the result of the query
	 */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	/**
	 * Queries information about an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param pname             the name of the parameter to query. One of:<br><table><tr><td>{@link #GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link #GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link #GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
	 */
	public static int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveUniformBlockName ] ---

	/**
	 * Retrieves the name of an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param bufSize           the size of the buffer addressed by {@code uniformBlockName}
	 * @param length            the address of a variable to receive the number of characters that were written to {@code uniformBlockName}
	 * @param uniformBlockName  an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}
	 */
	public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformBlockName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, uniformBlockIndex, bufSize, length, uniformBlockName);
	}

	/**
	 * Retrieves the name of an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param length            the address of a variable to receive the number of characters that were written to {@code uniformBlockName}
	 * @param uniformBlockName  an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}
	 */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
	}

	/**
	 * Retrieves the name of an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param bufSize           the size of the buffer addressed by {@code uniformBlockName}
	 */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer uniformBlockName = stack.malloc(bufSize);
			nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddress(length), memAddress(uniformBlockName));
			return memASCII(uniformBlockName, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Retrieves the name of an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		int bufSize = glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer uniformBlockName = stack.malloc(bufSize);
			nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddress(length), memAddress(uniformBlockName));
			return memASCII(uniformBlockName, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindBufferRange ] ---

	/**
	 * Binds a range within a buffer object to an indexed buffer target.
	 *
	 * @param target the target of the bind operation. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>
	 * @param index  the index of the binding point within the array specified by {@code target}
	 * @param buffer a buffer object to bind to the specified binding point
	 * @param offset the starting offset in basic machine units into the buffer object {@code buffer}
	 * @param size   the amount of data in machine units that can be read from the buffer object while used as an indexed target
	 */
	public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glBindBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferBase ] ---

	/**
	 * Binds a buffer object to an indexed buffer target.
	 *
	 * @param target the target of the bind operation. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>
	 * @param index  the index of the binding point within the array specified by {@code target}
	 * @param buffer a buffer object to bind to the specified binding point
	 */
	public static void glBindBufferBase(int target, int index, int buffer) {
		long __functionAddress = GL.getCapabilities().glBindBufferBase;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, buffer);
	}

	// --- [ glGetIntegeri_v ] ---

	/**
	 * Queries the integer value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void nglGetIntegeri_v(int target, int index, long data) {
		long __functionAddress = GL.getCapabilities().glGetIntegeri_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, data);
	}

	/**
	 * Queries the integer value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetIntegeri_v(int target, int index, IntBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetIntegeri_v(target, index, memAddress(data));
	}

	/**
	 * Queries the integer value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 */
	public static int glGetIntegeri(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetIntegeri_v(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniformBlockBinding ] ---

	/**
	 * Assigns a binding point to an active uniform block.
	 *
	 * @param program             the name of a program object containing the active uniform block whose binding to assign
	 * @param uniformBlockIndex   the index of the active uniform block within {@code program} whose binding to assign
	 * @param uniformBlockBinding the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}
	 */
	public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
		long __functionAddress = GL.getCapabilities().glUniformBlockBinding;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, uniformBlockIndex, uniformBlockBinding);
	}

	/** Array version of: {@link #glGetUniformIndices GetUniformIndices} */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
		long __functionAddress = GL.getCapabilities().glGetUniformIndices;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformIndices, uniformNames.remaining());
		}
		callPPV(__functionAddress, program, uniformNames.remaining(), memAddress(uniformNames), uniformIndices);
	}

	/** Array version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	public static void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformsiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, uniformIndices.length);
		}
		callPPV(__functionAddress, program, uniformIndices.length, uniformIndices, pname, params);
	}

	/** Array version of: {@link #glGetActiveUniformName GetActiveUniformName} */
	public static void glGetActiveUniformName(int program, int uniformIndex, int[] length, ByteBuffer uniformName) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, uniformIndex, uniformName.remaining(), length, memAddress(uniformName));
	}

	/** Array version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformBlockiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, uniformBlockIndex, pname, params);
	}

	/** Array version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName) {
		long __functionAddress = GL.getCapabilities().glGetActiveUniformBlockName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, uniformBlockIndex, uniformBlockName.remaining(), length, memAddress(uniformBlockName));
	}

	/** Array version of: {@link #glGetIntegeri_v GetIntegeri_v} */
	public static void glGetIntegeri_v(int target, int index, int[] data) {
		long __functionAddress = GL.getCapabilities().glGetIntegeri_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

}