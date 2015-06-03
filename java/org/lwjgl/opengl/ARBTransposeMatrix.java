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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/transpose_matrix.txt">ARB_transpose_matrix</a> extension.
 * 
 * <p>New functions and tokens are added allowing application matrices stored in row major order rather than column major order to be transferred to the
 * OpenGL implementation. This allows an application to use standard C-language 2-dimensional arrays ({@code m[row][col]}) and have the array indices match the
 * expected matrix row and column indexes. These arrays are referred to as transpose matrices since they are the transpose of the standard matrices passed
 * to OpenGL.</p>
 * 
 * <p>This extension adds an interface for transfering data to and from the OpenGL pipeline, it does not change any OpenGL processing or imply any changes in
 * state representation.</p>
 * 
 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public final class ARBTransposeMatrix {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_TRANSPOSE_MODELVIEW_MATRIX_ARB  = 0x84E3,
		GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4,
		GL_TRANSPOSE_TEXTURE_MATRIX_ARB    = 0x84E5,
		GL_TRANSPOSE_COLOR_MATRIX_ARB      = 0x84E6;

	/** Function address. */
	@JavadocExclude
	public final long
		LoadTransposeMatrixfARB,
		LoadTransposeMatrixdARB,
		MultTransposeMatrixfARB,
		MultTransposeMatrixdARB;

	@JavadocExclude
	public ARBTransposeMatrix(FunctionProvider provider) {
		LoadTransposeMatrixfARB = provider.getFunctionAddress("glLoadTransposeMatrixfARB");
		LoadTransposeMatrixdARB = provider.getFunctionAddress("glLoadTransposeMatrixdARB");
		MultTransposeMatrixfARB = provider.getFunctionAddress("glMultTransposeMatrixfARB");
		MultTransposeMatrixdARB = provider.getFunctionAddress("glMultTransposeMatrixdARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTransposeMatrix} instance for the current context. */
	public static ARBTransposeMatrix getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTransposeMatrix);
	}

	static ARBTransposeMatrix create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_transpose_matrix") ) return null;

		ARBTransposeMatrix funcs = new ARBTransposeMatrix(provider);

		boolean supported = checkFunctions(
			funcs.LoadTransposeMatrixfARB, funcs.LoadTransposeMatrixdARB, funcs.MultTransposeMatrixfARB, funcs.MultTransposeMatrixdARB
		);

		return GL.checkExtension("GL_ARB_transpose_matrix", funcs, supported);
	}

	// --- [ glLoadTransposeMatrixfARB ] ---

	/** JNI method for {@link #glLoadTransposeMatrixfARB LoadTransposeMatrixfARB} */
	@JavadocExclude
	public static native void nglLoadTransposeMatrixfARB(long m, long __functionAddress);

	/** Unsafe version of {@link #glLoadTransposeMatrixfARB LoadTransposeMatrixfARB} */
	@JavadocExclude
	public static void nglLoadTransposeMatrixfARB(long m) {
		long __functionAddress = getInstance().LoadTransposeMatrixfARB;
		nglLoadTransposeMatrixfARB(m, __functionAddress);
	}

	/**
	 * Sets the current matrix to a 4 &times; 4 matrix in row-major order.
	 * 
	 * <p>The matrix is stored as 16 consecutive values, i.e. as:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr><td>a1</td><td>a2</td><td>a3</td><td>a4</td></tr>
	 * <tr><td>a5</td><td>a6</td><td>a7</td><td>a8</td></tr>
	 * <tr><td>a9</td><td>a10</td><td>a11</td><td>a12</td></tr>
	 * <tr><td>a13</td><td>a14</td><td>a15</td><td>a16</td></tr>
	 * </table></p>
	 *
	 * @param m the matrix data
	 */
	public static void glLoadTransposeMatrixfARB(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglLoadTransposeMatrixfARB(memAddress(m));
	}

	/** Alternative version of: {@link #glLoadTransposeMatrixfARB LoadTransposeMatrixfARB} */
	public static void glLoadTransposeMatrixfARB(FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglLoadTransposeMatrixfARB(memAddress(m));
	}

	// --- [ glLoadTransposeMatrixdARB ] ---

	/** JNI method for {@link #glLoadTransposeMatrixdARB LoadTransposeMatrixdARB} */
	@JavadocExclude
	public static native void nglLoadTransposeMatrixdARB(long m, long __functionAddress);

	/** Unsafe version of {@link #glLoadTransposeMatrixdARB LoadTransposeMatrixdARB} */
	@JavadocExclude
	public static void nglLoadTransposeMatrixdARB(long m) {
		long __functionAddress = getInstance().LoadTransposeMatrixdARB;
		nglLoadTransposeMatrixdARB(m, __functionAddress);
	}

	/**
	 * Double version of {@link #glLoadTransposeMatrixfARB LoadTransposeMatrixfARB}.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadTransposeMatrixdARB(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglLoadTransposeMatrixdARB(memAddress(m));
	}

	/** Alternative version of: {@link #glLoadTransposeMatrixdARB LoadTransposeMatrixdARB} */
	public static void glLoadTransposeMatrixdARB(DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglLoadTransposeMatrixdARB(memAddress(m));
	}

	// --- [ glMultTransposeMatrixfARB ] ---

	/** JNI method for {@link #glMultTransposeMatrixfARB MultTransposeMatrixfARB} */
	@JavadocExclude
	public static native void nglMultTransposeMatrixfARB(long m, long __functionAddress);

	/** Unsafe version of {@link #glMultTransposeMatrixfARB MultTransposeMatrixfARB} */
	@JavadocExclude
	public static void nglMultTransposeMatrixfARB(long m) {
		long __functionAddress = getInstance().MultTransposeMatrixfARB;
		nglMultTransposeMatrixfARB(m, __functionAddress);
	}

	/**
	 * Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See {@link #glLoadTransposeMatrixfARB LoadTransposeMatrixfARB} for details.
	 *
	 * @param m the matrix data
	 */
	public static void glMultTransposeMatrixfARB(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 2);
		nglMultTransposeMatrixfARB(memAddress(m));
	}

	/** Alternative version of: {@link #glMultTransposeMatrixfARB MultTransposeMatrixfARB} */
	public static void glMultTransposeMatrixfARB(FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMultTransposeMatrixfARB(memAddress(m));
	}

	// --- [ glMultTransposeMatrixdARB ] ---

	/** JNI method for {@link #glMultTransposeMatrixdARB MultTransposeMatrixdARB} */
	@JavadocExclude
	public static native void nglMultTransposeMatrixdARB(long m, long __functionAddress);

	/** Unsafe version of {@link #glMultTransposeMatrixdARB MultTransposeMatrixdARB} */
	@JavadocExclude
	public static void nglMultTransposeMatrixdARB(long m) {
		long __functionAddress = getInstance().MultTransposeMatrixdARB;
		nglMultTransposeMatrixdARB(m, __functionAddress);
	}

	/**
	 * Double version of {@link #glMultTransposeMatrixfARB MultTransposeMatrixfARB}.
	 *
	 * @param m the matrix data
	 */
	public static void glMultTransposeMatrixdARB(ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16 << 3);
		nglMultTransposeMatrixdARB(memAddress(m));
	}

	/** Alternative version of: {@link #glMultTransposeMatrixdARB MultTransposeMatrixdARB} */
	public static void glMultTransposeMatrixdARB(DoubleBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 16);
		nglMultTransposeMatrixdARB(memAddress(m));
	}

}