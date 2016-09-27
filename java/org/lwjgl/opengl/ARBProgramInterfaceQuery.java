/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/program_interface_query.txt">ARB_program_interface_query</a> extension.
 * 
 * <p>This extension provides a single unified set of query commands that can be used by applications to determine properties of various interfaces and
 * resources used by program objects to communicate with application code, fixed-function OpenGL pipeline stages, and other programs. In unextended OpenGL
 * 4.2, there is a separate set of query commands for each different type of interface or resource used by the program. These different sets of queries are
 * structured nearly identically, but the queries for some interfaces have limited capability (e.g., there is no ability to enumerate fragment shader
 * outputs).</p>
 * 
 * <p>With the single set of query commands provided by this extension, a consistent set of queries is available for all interfaces, and a new interface can
 * be added without having to introduce a completely new set of query commands. These queries are intended to provide a superset of the capabilities
 * provided by similar queries in OpenGL 4.2, and should allow for the deprecation of the existing queries.</p>
 * 
 * <p>This extension defines two terms: interfaces and active resources. Each interface of a program object provides a way for the program to communicate with
 * application code, fixed-function OpenGL pipeline stages, and other programs. Examples of interfaces for a program object include inputs (receiving
 * values from vertex attributes or outputs of other programs), outputs (sending values to other programs or per-fragment operations), uniforms (receiving
 * values from API calls), uniform blocks (receiving values from bound buffer objects), subroutines and subroutine uniforms (receiving API calls to
 * indicate functions to call during program execution), and atomic counter buffers (holding values to be manipulated by atomic counter shader functions).
 * Each interface of a program has a set of active resources used by the program. For example, the resources of a program's input interface includes all
 * active input variables used by the first stage of the program. The resources of a program's uniform block interface consists of the set of uniform
 * blocks with at least one member used by any shader in the program.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBProgramInterfaceQuery {

	/**
	 * Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
	 * GetProgramResourceLocation, and GetProgramResourceLocationIndex.
	 */
	public static final int
		GL_UNIFORM                            = 0x92E1,
		GL_UNIFORM_BLOCK                      = 0x92E2,
		GL_PROGRAM_INPUT                      = 0x92E3,
		GL_PROGRAM_OUTPUT                     = 0x92E4,
		GL_BUFFER_VARIABLE                    = 0x92E5,
		GL_SHADER_STORAGE_BLOCK               = 0x92E6,
		GL_VERTEX_SUBROUTINE                  = 0x92E8,
		GL_TESS_CONTROL_SUBROUTINE            = 0x92E9,
		GL_TESS_EVALUATION_SUBROUTINE         = 0x92EA,
		GL_GEOMETRY_SUBROUTINE                = 0x92EB,
		GL_FRAGMENT_SUBROUTINE                = 0x92EC,
		GL_COMPUTE_SUBROUTINE                 = 0x92ED,
		GL_VERTEX_SUBROUTINE_UNIFORM          = 0x92EE,
		GL_TESS_CONTROL_SUBROUTINE_UNIFORM    = 0x92EF,
		GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0,
		GL_GEOMETRY_SUBROUTINE_UNIFORM        = 0x92F1,
		GL_FRAGMENT_SUBROUTINE_UNIFORM        = 0x92F2,
		GL_COMPUTE_SUBROUTINE_UNIFORM         = 0x92F3,
		GL_TRANSFORM_FEEDBACK_VARYING         = 0x92F4;

	/** Accepted by the {@code pname} parameter of GetProgramInterfaceiv. */
	public static final int
		GL_ACTIVE_RESOURCES               = 0x92F5,
		GL_MAX_NAME_LENGTH                = 0x92F6,
		GL_MAX_NUM_ACTIVE_VARIABLES       = 0x92F7,
		GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;

	/** Accepted in the {@code props} array of GetProgramResourceiv. */
	public static final int
		GL_NAME_LENGTH                          = 0x92F9,
		GL_TYPE                                 = 0x92FA,
		GL_ARRAY_SIZE                           = 0x92FB,
		GL_OFFSET                               = 0x92FC,
		GL_BLOCK_INDEX                          = 0x92FD,
		GL_ARRAY_STRIDE                         = 0x92FE,
		GL_MATRIX_STRIDE                        = 0x92FF,
		GL_IS_ROW_MAJOR                         = 0x9300,
		GL_ATOMIC_COUNTER_BUFFER_INDEX          = 0x9301,
		GL_BUFFER_BINDING                       = 0x9302,
		GL_BUFFER_DATA_SIZE                     = 0x9303,
		GL_NUM_ACTIVE_VARIABLES                 = 0x9304,
		GL_ACTIVE_VARIABLES                     = 0x9305,
		GL_REFERENCED_BY_VERTEX_SHADER          = 0x9306,
		GL_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x9307,
		GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308,
		GL_REFERENCED_BY_GEOMETRY_SHADER        = 0x9309,
		GL_REFERENCED_BY_FRAGMENT_SHADER        = 0x930A,
		GL_REFERENCED_BY_COMPUTE_SHADER         = 0x930B,
		GL_TOP_LEVEL_ARRAY_SIZE                 = 0x930C,
		GL_TOP_LEVEL_ARRAY_STRIDE               = 0x930D,
		GL_LOCATION                             = 0x930E,
		GL_LOCATION_INDEX                       = 0x930F,
		GL_IS_PER_PATCH                         = 0x92E7;

	protected ARBProgramInterfaceQuery() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetProgramInterfaceiv, caps.glGetProgramResourceIndex, caps.glGetProgramResourceName, caps.glGetProgramResourceiv, 
			caps.glGetProgramResourceLocation, caps.glGetProgramResourceLocationIndex
		);
	}

	// --- [ glGetProgramInterfaceiv ] ---

	/**
	 * Queries a property of an interface in a program.
	 *
	 * @param program          the name of a program object whose interface to query
	 * @param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link #GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link #GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link #GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>
	 * @param params           a variable to retrieve the value of {@code pname} for the program interface
	 */
	public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramInterfaceiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, programInterface, pname, params);
	}

	/**
	 * Queries a property of an interface in a program.
	 *
	 * @param program          the name of a program object whose interface to query
	 * @param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link #GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link #GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link #GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>
	 * @param params           a variable to retrieve the value of {@code pname} for the program interface
	 */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/**
	 * Queries a property of an interface in a program.
	 *
	 * @param program          the name of a program object whose interface to query
	 * @param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link #GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link #GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link #GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>
	 */
	public static int glGetProgramInterfacei(int program, int programInterface, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceIndex ] ---

	/**
	 * Queries the index of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param name             the name of the resource to query the index of
	 */
	public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, programInterface, name);
	}

	/**
	 * Queries the index of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param name             the name of the resource to query the index of
	 */
	public static int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
	}

	/**
	 * Queries the index of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param name             the name of the resource to query the index of
	 */
	public static int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nglGetProgramResourceIndex(program, programInterface, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceName ] ---

	/**
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param index            the index of the resource within {@code programInterface} of {@code program}
	 * @param bufSize          the size of the character array whose address is given by {@code name}
	 * @param length           a variable which will receive the length of the resource name
	 * @param name             a character array into which will be written the name of the resource
	 */
	public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, programInterface, index, bufSize, length, name);
	}

	/**
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param index            the index of the resource within {@code programInterface} of {@code program}
	 * @param length           a variable which will receive the length of the resource name
	 * @param name             a character array into which will be written the name of the resource
	 */
	public static void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
		if ( CHECKS )
			checkBufferSafe(length, 1);
		nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/**
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param index            the index of the resource within {@code programInterface} of {@code program}
	 * @param bufSize          the size of the character array whose address is given by {@code name}
	 */
	public static String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetProgramResourceName(program, programInterface, index, bufSize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param index            the index of the resource within {@code programInterface} of {@code program}
	 */
	public static String glGetProgramResourceName(int program, int programInterface, int index) {
		int bufSize = glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetProgramResourceName(program, programInterface, index, bufSize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceiv ] ---

	/**
	 * Retrieves values for multiple properties of a single active resource within a program object.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param index            the active resource index
	 * @param propCount        the number of properties in {@code props}
	 * @param props            an array that will receive the active resource properties
	 * @param bufSize          the size of the integer array whose address is given by {@code params}
	 * @param length           a variable which will receive the number of values returned
	 * @param params           an array that will receive the property values
	 */
	public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, program, programInterface, index, propCount, props, bufSize, length, params);
	}

	/**
	 * Retrieves values for multiple properties of a single active resource within a program object.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<br><table><tr><td>{@link #GL_UNIFORM UNIFORM}</td><td>{@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link #GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
	 * @param index            the active resource index
	 * @param props            an array that will receive the active resource properties
	 * @param length           a variable which will receive the number of values returned
	 * @param params           an array that will receive the property values
	 */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
		if ( CHECKS )
			checkBufferSafe(length, 1);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	// --- [ glGetProgramResourceLocation ] ---

	/**
	 * Queries the location of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
	 * @param name             the name of the resource to query the location of
	 */
	public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceLocation;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, programInterface, name);
	}

	/**
	 * Queries the location of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
	}

	/**
	 * Queries the location of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetProgramResourceLocation(program, programInterface, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceLocationIndex ] ---

	/**
	 * Queries the fragment color index of a named variable within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
	 * @param name             the name of the resource to query the location of
	 */
	public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceLocationIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, programInterface, name);
	}

	/**
	 * Queries the fragment color index of a named variable within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(name));
	}

	/**
	 * Queries the fragment color index of a named variable within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramInterfaceiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, programInterface, pname, params);
	}

	/** Array version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static void glGetProgramResourceName(int program, int programInterface, int index, int[] length, ByteBuffer name) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBufferSafe(length, 1);
		}
		callPPV(__functionAddress, program, programInterface, index, name.remaining(), length, memAddress(name));
	}

	/** Array version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, int[] length, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramResourceiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBufferSafe(length, 1);
		}
		callPPPV(__functionAddress, program, programInterface, index, props.length, props, params.length, length, params);
	}

}