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

/**
 * The core OpenGL 2.1 functionality. OpenGL 2.1 implementations must support at least revision 1.20 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/pixel_buffer_object.txt">ARB_pixel_buffer_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_sRGB.txt">EXT_texture_sRGB</a></li>
 * </ul></p>
 */
public final class GL21 {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;

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

	/** Function address. */
	@JavadocExclude
	public final long
		UniformMatrix2x3fv,
		UniformMatrix3x2fv,
		UniformMatrix2x4fv,
		UniformMatrix4x2fv,
		UniformMatrix3x4fv,
		UniformMatrix4x3fv;

	@JavadocExclude
	public GL21(FunctionProvider provider) {
		UniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
		UniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
		UniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
		UniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
		UniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
		UniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL21} instance for the current context. */
	public static GL21 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL21);
	}

	static GL21 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL21") ) return null;

		GL21 funcs = new GL21(provider);

		boolean supported = checkFunctions(
			funcs.UniformMatrix2x3fv, funcs.UniformMatrix3x2fv, funcs.UniformMatrix2x4fv, funcs.UniformMatrix4x2fv, funcs.UniformMatrix3x4fv, 
			funcs.UniformMatrix4x3fv
		);

		return GL.checkExtension("OpenGL21", funcs, supported);
	}

	// --- [ glUniformMatrix2x3fv ] ---

	/** JNI method for {@link #glUniformMatrix2x3fv UniformMatrix2x3fv} */
	@JavadocExclude
	public static native void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix2x3fv UniformMatrix2x3fv} */
	@JavadocExclude
	public static void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x3fv;
		nglUniformMatrix2x3fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix2x3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglUniformMatrix2x3fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv} */
	public static void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2fv ] ---

	/** JNI method for {@link #glUniformMatrix3x2fv UniformMatrix3x2fv} */
	@JavadocExclude
	public static native void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix3x2fv UniformMatrix3x2fv} */
	@JavadocExclude
	public static void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x2fv;
		nglUniformMatrix3x2fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix3x2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglUniformMatrix3x2fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv} */
	public static void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4fv ] ---

	/** JNI method for {@link #glUniformMatrix2x4fv UniformMatrix2x4fv} */
	@JavadocExclude
	public static native void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix2x4fv UniformMatrix2x4fv} */
	@JavadocExclude
	public static void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x4fv;
		nglUniformMatrix2x4fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix2x4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglUniformMatrix2x4fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv} */
	public static void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2fv ] ---

	/** JNI method for {@link #glUniformMatrix4x2fv UniformMatrix4x2fv} */
	@JavadocExclude
	public static native void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix4x2fv UniformMatrix4x2fv} */
	@JavadocExclude
	public static void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x2fv;
		nglUniformMatrix4x2fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix4x2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglUniformMatrix4x2fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv} */
	public static void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4fv ] ---

	/** JNI method for {@link #glUniformMatrix3x4fv UniformMatrix3x4fv} */
	@JavadocExclude
	public static native void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix3x4fv UniformMatrix3x4fv} */
	@JavadocExclude
	public static void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x4fv;
		nglUniformMatrix3x4fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix3x4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglUniformMatrix3x4fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv} */
	public static void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3fv ] ---

	/** JNI method for {@link #glUniformMatrix4x3fv UniformMatrix4x3fv} */
	@JavadocExclude
	public static native void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformMatrix4x3fv UniformMatrix4x3fv} */
	@JavadocExclude
	public static void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x3fv;
		nglUniformMatrix4x3fv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformMatrix4x3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglUniformMatrix4x3fv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv} */
	public static void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value));
	}

}