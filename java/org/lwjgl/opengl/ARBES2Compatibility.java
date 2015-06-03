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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/ES2_compatibility.txt">ARB_ES2_compatibility</a> extension.
 * 
 * <p>This extension adds support for features of OpenGL ES 2.0 that are missing from OpenGL 3.x. Enabling these features will ease the process of porting
 * applications from OpenGL ES 2.0 to OpenGL.</p>
 * 
 * <p>Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public final class ARBES2Compatibility {

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_SHADER_COMPILER                  = 0x8DFA,
		GL_SHADER_BINARY_FORMATS            = 0x8DF8,
		GL_NUM_SHADER_BINARY_FORMATS        = 0x8DF9,
		GL_MAX_VERTEX_UNIFORM_VECTORS       = 0x8DFB,
		GL_MAX_VARYING_VECTORS              = 0x8DFC,
		GL_MAX_FRAGMENT_UNIFORM_VECTORS     = 0x8DFD,
		GL_IMPLEMENTATION_COLOR_READ_TYPE   = 0x8B9A,
		GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

	/** Accepted by the {@code type} parameter of VertexAttribPointer. */
	public static final int GL_FIXED = 0x140C;

	/** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat. */
	public static final int
		GL_LOW_FLOAT    = 0x8DF0,
		GL_MEDIUM_FLOAT = 0x8DF1,
		GL_HIGH_FLOAT   = 0x8DF2,
		GL_LOW_INT      = 0x8DF3,
		GL_MEDIUM_INT   = 0x8DF4,
		GL_HIGH_INT     = 0x8DF5;

	/** Accepted by the {@code format} parameter of most commands taking sized internal formats. */
	public static final int GL_RGB565 = 0x8D62;

	/** Function address. */
	@JavadocExclude
	public final long
		ReleaseShaderCompiler,
		ShaderBinary,
		GetShaderPrecisionFormat,
		DepthRangef,
		ClearDepthf;

	@JavadocExclude
	public ARBES2Compatibility(FunctionProvider provider) {
		ReleaseShaderCompiler = provider.getFunctionAddress("glReleaseShaderCompiler");
		ShaderBinary = provider.getFunctionAddress("glShaderBinary");
		GetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
		DepthRangef = provider.getFunctionAddress("glDepthRangef");
		ClearDepthf = provider.getFunctionAddress("glClearDepthf");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBES2Compatibility} instance for the current context. */
	public static ARBES2Compatibility getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBES2Compatibility);
	}

	static ARBES2Compatibility create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_ES2_compatibility") ) return null;

		ARBES2Compatibility funcs = new ARBES2Compatibility(provider);

		boolean supported = checkFunctions(
			funcs.ReleaseShaderCompiler, funcs.ShaderBinary, funcs.GetShaderPrecisionFormat, funcs.DepthRangef, funcs.ClearDepthf
		);

		return GL.checkExtension("GL_ARB_ES2_compatibility", funcs, supported);
	}

	// --- [ glReleaseShaderCompiler ] ---

	/** Releases resources allocated by the shader compiler. This is a hint from the application, and does not prevent later use of the shader compiler. */
	public static void glReleaseShaderCompiler() {
		long __functionAddress = getInstance().ReleaseShaderCompiler;
		GL41.nglReleaseShaderCompiler(__functionAddress);
	}

	// --- [ glShaderBinary ] ---

	/** Unsafe version of {@link #glShaderBinary ShaderBinary} */
	@JavadocExclude
	public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
		long __functionAddress = getInstance().ShaderBinary;
		GL41.nglShaderBinary(count, shaders, binaryformat, binary, length, __functionAddress);
	}

	/**
	 * Loads pre-compiled shader binaries.
	 *
	 * @param count        the number of shader object handles contained in {@code shaders}
	 * @param shaders      an array of shader handles into which to load pre-compiled shader binaries
	 * @param binaryformat the format of the shader binaries contained in {@code binary}
	 * @param binary       an array of bytes containing pre-compiled binary shader code
	 * @param length       the length of the array whose address is given in binary
	 */
	public static void glShaderBinary(int count, ByteBuffer shaders, int binaryformat, ByteBuffer binary, int length) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(shaders, count << 2);
			checkBuffer(binary, length);
		}
		nglShaderBinary(count, memAddress(shaders), binaryformat, memAddress(binary), length);
	}

	/** Alternative version of: {@link #glShaderBinary ShaderBinary} */
	public static void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
		nglShaderBinary(shaders.remaining(), memAddress(shaders), binaryformat, memAddress(binary), binary.remaining());
	}

	// --- [ glGetShaderPrecisionFormat ] ---

	/** Unsafe version of {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
	@JavadocExclude
	public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
		long __functionAddress = getInstance().GetShaderPrecisionFormat;
		GL41.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision, __functionAddress);
	}

	/**
	 * Retrieves the range and precision for numeric formats supported by the shader compiler.
	 *
	 * @param shadertype    the type of shader whose precision to query. One of:<br>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}, {@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}
	 * @param precisiontype the numeric format whose precision and range to query
	 * @param range         the address of array of two integers into which encodings of the implementation's numeric range are returned
	 * @param precision     the address of an integer into which the numeric precision of the implementation is written
	 */
	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, ByteBuffer range, ByteBuffer precision) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(range, 2 << 2);
			checkBuffer(precision, 1 << 2);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
	}

	/** Alternative version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
	public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(range, 2);
			checkBuffer(precision, 1);
		}
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
	}

	/** Single return value version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
	public static int glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(range, 2);
		APIBuffer __buffer = apiBuffer();
		int precision = __buffer.intParam();
		nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), __buffer.address(precision));
		return __buffer.intValue(precision);
	}

	// --- [ glDepthRangef ] ---

	/**
	 * Specifies mapping of depth values from normalized device coordinates to window coordinates
	 *
	 * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.0f.
	 * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.0f.
	 */
	public static void glDepthRangef(float zNear, float zFar) {
		long __functionAddress = getInstance().DepthRangef;
		GL41.nglDepthRangef(zNear, zFar, __functionAddress);
	}

	// --- [ glClearDepthf ] ---

	/**
	 * Specifies the clear value for the depth buffer
	 *
	 * @param depth the depth value used when the depth buffer is cleared. The initial value is 1.0f.
	 */
	public static void glClearDepthf(float depth) {
		long __functionAddress = getInstance().ClearDepthf;
		GL41.nglClearDepthf(depth, __functionAddress);
	}

}