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
public final class ARBProgramInterfaceQuery {

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

	/** Function address. */
	@JavadocExclude
	public final long
		GetProgramInterfaceiv,
		GetProgramResourceIndex,
		GetProgramResourceName,
		GetProgramResourceiv,
		GetProgramResourceLocation,
		GetProgramResourceLocationIndex;

	@JavadocExclude
	public ARBProgramInterfaceQuery(FunctionProvider provider) {
		GetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
		GetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
		GetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
		GetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
		GetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
		GetProgramResourceLocationIndex = provider.getFunctionAddress("glGetProgramResourceLocationIndex");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBProgramInterfaceQuery} instance for the current context. */
	public static ARBProgramInterfaceQuery getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBProgramInterfaceQuery);
	}

	static ARBProgramInterfaceQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_program_interface_query") ) return null;

		ARBProgramInterfaceQuery funcs = new ARBProgramInterfaceQuery(provider);

		boolean supported = checkFunctions(
			funcs.GetProgramInterfaceiv, funcs.GetProgramResourceIndex, funcs.GetProgramResourceName, funcs.GetProgramResourceiv, 
			funcs.GetProgramResourceLocation, funcs.GetProgramResourceLocationIndex
		);

		return GL.checkExtension("GL_ARB_program_interface_query", funcs, supported);
	}

	// --- [ glGetProgramInterfaceiv ] ---

	/** Unsafe version of {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	@JavadocExclude
	public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
		long __functionAddress = getInstance().GetProgramInterfaceiv;
		GL43.nglGetProgramInterfaceiv(program, programInterface, pname, params, __functionAddress);
	}

	/**
	 * Queries a property of an interface in a program.
	 *
	 * @param program          the name of a program object whose interface to query
	 * @param programInterface a token identifying the interface within {@code program} to query. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br>{@link #GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}, {@link #GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}, {@link #GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}, {@link #GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}
	 * @param params           a variable to retrieve the value of {@code pname} for the program interface
	 */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static int glGetProgramInterfacei(int program, int programInterface, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramInterfaceiv(program, programInterface, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramResourceIndex ] ---

	/** Unsafe version of {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	@JavadocExclude
	public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceIndex;
		return GL43.nglGetProgramResourceIndex(program, programInterface, name, __functionAddress);
	}

	/**
	 * Queries the index of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param name             the name of the resource to query the index of
	 */
	public static int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	public static int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nglGetProgramResourceIndex(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glGetProgramResourceName ] ---

	/** Unsafe version of {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
		long __functionAddress = getInstance().GetProgramResourceName;
		GL43.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name, __functionAddress);
	}

	/**
	 * Queries the name of an indexed resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param index            the index of the resource within {@code programInterface} of {@code program}
	 * @param bufSize          the size of the character array whose address is given by {@code name}
	 * @param length           a variable which will receive the length of the resource name
	 * @param name             a character array into which will be written the name of the resource
	 */
	public static void glGetProgramResourceName(int program, int programInterface, int index, int bufSize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceName(program, programInterface, index, bufSize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index) {
		int bufSize = glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetProgramResourceiv ] ---

	/** Unsafe version of {@link #glGetProgramResourceiv GetProgramResourceiv} */
	@JavadocExclude
	public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = getInstance().GetProgramResourceiv;
		GL43.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
	}

	/**
	 * Retrieves values for multiple properties of a single active resource within a program object.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<br>{@link #GL_UNIFORM UNIFORM}, {@link #GL_UNIFORM_BLOCK UNIFORM_BLOCK}, {@link #GL_PROGRAM_INPUT PROGRAM_INPUT}, {@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}, {@link #GL_BUFFER_VARIABLE BUFFER_VARIABLE}, {@link #GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}, {@link #GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}, {@link #GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}, {@link #GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}, {@link #GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}, {@link #GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}, {@link #GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}, {@link #GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}, {@link #GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}, {@link #GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}, {@link #GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}, {@link #GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}, {@link #GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}, {@link #GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}
	 * @param index            the active resource index
	 * @param propCount        the number of properties in {@code props}
	 * @param props            an array that will receive the active resource properties
	 * @param bufSize          the size of the integer array whose address is given by {@code params}
	 * @param length           a variable which will receive the number of values returned
	 * @param params           an array that will receive the property values
	 */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, int propCount, ByteBuffer props, int bufSize, ByteBuffer length, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(props, propCount << 2);
			checkBuffer(params, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceiv(program, programInterface, index, propCount, memAddress(props), bufSize, memAddressSafe(length), memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	/** Buffer return version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static IntBuffer glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int params = __buffer.bufferParam(bufSize << 2);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), bufSize, __buffer.address(length), __buffer.address(params));
		return memIntBuffer(__buffer.address(params), __buffer.intValue(length));
	}

	// --- [ glGetProgramResourceLocation ] ---

	/** Unsafe version of {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocation;
		return GL43.nglGetProgramResourceLocation(program, programInterface, name, __functionAddress);
	}

	/**
	 * Queries the location of a named resource within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	public static int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceLocation(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glGetProgramResourceLocationIndex ] ---

	/** Unsafe version of {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	@JavadocExclude
	public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocationIndex;
		return GL43.nglGetProgramResourceLocationIndex(program, programInterface, name, __functionAddress);
	}

	/**
	 * Queries the fragment color index of a named variable within a program.
	 *
	 * @param program          the name of a program object whose resources to query
	 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br>{@link #GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}
	 * @param name             the name of the resource to query the location of
	 */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
	public static int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceLocationIndex(program, programInterface, __buffer.address(nameEncoded));
	}

}