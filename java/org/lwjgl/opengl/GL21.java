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

/** The core OpenGL 2.1 functionality. */
public final class GL21 {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_FLOAT_MAT2x3 = 0x8B65,
		GL_FLOAT_MAT2x4 = 0x8B66,
		GL_FLOAT_MAT3x2 = 0x8B67,
		GL_FLOAT_MAT3x4 = 0x8B68,
		GL_FLOAT_MAT4x2 = 0x8B69,
		GL_FLOAT_MAT4x3 = 0x8B6A;

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
	 * GetBufferPointerv.
	 */
	public static final int
		GL_PIXEL_PACK_BUFFER   = 0x88EB,
		GL_PIXEL_UNPACK_BUFFER = 0x88EC;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_PIXEL_PACK_BUFFER_BINDING   = 0x88ED,
		GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;

	/** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D. */
	public static final int
		GL_SRGB                        = 0x8C40,
		GL_SRGB8                       = 0x8C41,
		GL_SRGB_ALPHA                  = 0x8C42,
		GL_SRGB8_ALPHA8                = 0x8C43,
		GL_SLUMINANCE_ALPHA            = 0x8C44,
		GL_SLUMINANCE8_ALPHA8          = 0x8C45,
		GL_SLUMINANCE                  = 0x8C46,
		GL_SLUMINANCE8                 = 0x8C47,
		GL_COMPRESSED_SRGB             = 0x8C48,
		GL_COMPRESSED_SRGB_ALPHA       = 0x8C49,
		GL_COMPRESSED_SLUMINANCE       = 0x8C4A,
		GL_COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;

	private GL21() {}

	// --- [ glUniformMatrix2x3fv ] ---

	/** JNI method for {@link #glUniformMatrix2x3f(int, int, boolean, ByteBuffer) glUniformMatrix2x3f} */
	public static native void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix2x3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix2x3f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 2);
		}
		nglUniformMatrix2x3fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix2x3f(int, int, boolean, ByteBuffer) glUniformMatrix2x3f} */
	public static void glUniformMatrix2x3(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix3x2fv ] ---

	/** JNI method for {@link #glUniformMatrix3x2f(int, int, boolean, ByteBuffer) glUniformMatrix3x2f} */
	public static native void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix3x2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix3x2f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 6) << 2);
		}
		nglUniformMatrix3x2fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix3x2f(int, int, boolean, ByteBuffer) glUniformMatrix3x2f} */
	public static void glUniformMatrix3x2(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix2x4fv ] ---

	/** JNI method for {@link #glUniformMatrix2x4f(int, int, boolean, ByteBuffer) glUniformMatrix2x4f} */
	public static native void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix2x4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix2x4f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 2);
		}
		nglUniformMatrix2x4fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix2x4f(int, int, boolean, ByteBuffer) glUniformMatrix2x4f} */
	public static void glUniformMatrix2x4(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix2x4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix4x2fv ] ---

	/** JNI method for {@link #glUniformMatrix4x2f(int, int, boolean, ByteBuffer) glUniformMatrix4x2f} */
	public static native void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix4x2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix4x2f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count << 3) << 2);
		}
		nglUniformMatrix4x2fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix4x2f(int, int, boolean, ByteBuffer) glUniformMatrix4x2f} */
	public static void glUniformMatrix4x2(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix3x4fv ] ---

	/** JNI method for {@link #glUniformMatrix3x4f(int, int, boolean, ByteBuffer) glUniformMatrix3x4f} */
	public static native void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix3x4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix3x4f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 2);
		}
		nglUniformMatrix3x4fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix3x4f(int, int, boolean, ByteBuffer) glUniformMatrix3x4f} */
	public static void glUniformMatrix3x4(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix3x4fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ glUniformMatrix4x3fv ] ---

	/** JNI method for {@link #glUniformMatrix4x3f(int, int, boolean, ByteBuffer) glUniformMatrix4x3f} */
	public static native void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformMatrix4x3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix4x3f(int location, int count, boolean transpose, ByteBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, (count * 12) << 2);
		}
		nglUniformMatrix4x3fv(location, count, transpose, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glUniformMatrix4x3f(int, int, boolean, ByteBuffer) glUniformMatrix4x3f} */
	public static void glUniformMatrix4x3(int location, boolean transpose, FloatBuffer value) {
		long __functionAddress = getInstance().glUniformMatrix4x3fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__GL21;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL21") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glUniformMatrix2x3fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix3x2fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix2x4fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix4x2fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix3x4fv) &&
			GL.isFunctionSupported(funcs.glUniformMatrix4x3fv);

		return GL.checkExtension("OpenGL21", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL21}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			glUniformMatrix2x3fv,
			glUniformMatrix3x2fv,
			glUniformMatrix2x4fv,
			glUniformMatrix4x2fv,
			glUniformMatrix3x4fv,
			glUniformMatrix4x3fv;

		public Functions(FunctionProvider provider) {
			glUniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
			glUniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
			glUniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
			glUniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
			glUniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
			glUniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
		}

	}

}