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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/matrix_palette.txt">ARB_matrix_palette</a> extension.
 * 
 * <p>This extension extends the abilities of {@link ARBVertexBlend} to include a palette of modelview matrices. The n vertex units use a palette of m modelview
 * matrices. (Where n and m are constrained to implementation defined maxima.) Each vertex has a set of n indices into the palette, and a corresponding set
 * of n weights. Matrix indices can be changed for each vertex (between {@link GL11#glBegin Begin} and {@link GL11#glEnd End}).</p>
 * 
 * <p>When this extension is utilized, the enabled units transform each vertex by the modelview matrices specified by the vertices' respective indices. These
 * results are subsequently scaled by the weights of the respective units and then summed to create the eyespace vertex.</p>
 * 
 * <p>A similar procedure is followed for normals. Normals, however, are transformed by the inverse transpose of the modelview matrix.</p>
 */
public final class ARBMatrixPalette {

	/**
	 * Accepted by the {@code pname} parameters of GetFloatv, GetDoublev, and IsEnabled, by the {@code mode} parameter of MatrixMode, and by the {@code cap}
	 * parameters of Enable and Disable.
	 */
	public static final int GL_MATRIX_PALETTE_ARB = 0x8840;

	/** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841,
		GL_MAX_PALETTE_MATRICES_ARB           = 0x8842,
		GL_CURRENT_PALETTE_MATRIX_ARB         = 0x8843;

	/** Accepted by the {@code cap} parameters of EnableClientState and DisableClientState and by the {@code pname} parameter of IsEnabled. */
	public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;

	/** Accepted by the {@code pname} parameter of GetFloatv. */
	public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int
		GL_MATRIX_INDEX_ARRAY_SIZE_ARB   = 0x8846,
		GL_MATRIX_INDEX_ARRAY_TYPE_ARB   = 0x8847,
		GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;

	/** Function address. */
	@JavadocExclude
	public final long
		CurrentPaletteMatrixARB,
		MatrixIndexuivARB,
		MatrixIndexubvARB,
		MatrixIndexusvARB,
		MatrixIndexPointerARB;

	@JavadocExclude
	public ARBMatrixPalette(FunctionProvider provider) {
		CurrentPaletteMatrixARB = provider.getFunctionAddress("glCurrentPaletteMatrixARB");
		MatrixIndexuivARB = provider.getFunctionAddress("glMatrixIndexuivARB");
		MatrixIndexubvARB = provider.getFunctionAddress("glMatrixIndexubvARB");
		MatrixIndexusvARB = provider.getFunctionAddress("glMatrixIndexusvARB");
		MatrixIndexPointerARB = provider.getFunctionAddress("glMatrixIndexPointerARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBMatrixPalette} instance for the current context. */
	public static ARBMatrixPalette getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBMatrixPalette);
	}

	static ARBMatrixPalette create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_matrix_palette") ) return null;

		ARBMatrixPalette funcs = new ARBMatrixPalette(provider);

		boolean supported = checkFunctions(
			funcs.CurrentPaletteMatrixARB, funcs.MatrixIndexuivARB, funcs.MatrixIndexubvARB, funcs.MatrixIndexusvARB, funcs.MatrixIndexPointerARB
		);

		return GL.checkExtension("GL_ARB_matrix_palette", funcs, supported);
	}

	// --- [ glCurrentPaletteMatrixARB ] ---

	/** JNI method for {@link #glCurrentPaletteMatrixARB CurrentPaletteMatrixARB} */
	@JavadocExclude
	public static native void nglCurrentPaletteMatrixARB(int index, long __functionAddress);

	/**
	 * Defines which of the palette's matrices is affected by subsequent matrix operations when the current matrix mode is {@link #GL_MATRIX_PALETTE_ARB MATRIX_PALETTE_ARB},
	 *
	 * @param index the current matrix index. Must be a value between 0 and {@link #GL_MAX_PALETTE_MATRICES_ARB MAX_PALETTE_MATRICES_ARB}.
	 */
	public static void glCurrentPaletteMatrixARB(int index) {
		long __functionAddress = getInstance().CurrentPaletteMatrixARB;
		nglCurrentPaletteMatrixARB(index, __functionAddress);
	}

	// --- [ glMatrixIndexuivARB ] ---

	/** JNI method for {@link #glMatrixIndexuivARB MatrixIndexuivARB} */
	@JavadocExclude
	public static native void nglMatrixIndexuivARB(int size, long indices, long __functionAddress);

	/** Unsafe version of {@link #glMatrixIndexuivARB MatrixIndexuivARB} */
	@JavadocExclude
	public static void nglMatrixIndexuivARB(int size, long indices) {
		long __functionAddress = getInstance().MatrixIndexuivARB;
		nglMatrixIndexuivARB(size, indices, __functionAddress);
	}

	/**
	 * Sets the current matrix indices.
	 *
	 * @param size    the number of index values to set. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param indices the matrix index values
	 */
	public static void glMatrixIndexuivARB(int size, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, size << 2);
		nglMatrixIndexuivARB(size, memAddress(indices));
	}

	/** Alternative version of: {@link #glMatrixIndexuivARB MatrixIndexuivARB} */
	public static void glMatrixIndexuivARB(IntBuffer indices) {
		nglMatrixIndexuivARB(indices.remaining(), memAddress(indices));
	}

	// --- [ glMatrixIndexubvARB ] ---

	/** JNI method for {@link #glMatrixIndexubvARB MatrixIndexubvARB} */
	@JavadocExclude
	public static native void nglMatrixIndexubvARB(int size, long indices, long __functionAddress);

	/** Unsafe version of {@link #glMatrixIndexubvARB MatrixIndexubvARB} */
	@JavadocExclude
	public static void nglMatrixIndexubvARB(int size, long indices) {
		long __functionAddress = getInstance().MatrixIndexubvARB;
		nglMatrixIndexubvARB(size, indices, __functionAddress);
	}

	/**
	 * Byte version of {@link #glMatrixIndexuivARB MatrixIndexuivARB}.
	 *
	 * @param size    the number of index values to set. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param indices the matrix index values
	 */
	public static void glMatrixIndexubvARB(int size, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, size);
		nglMatrixIndexubvARB(size, memAddress(indices));
	}

	/** Alternative version of: {@link #glMatrixIndexubvARB MatrixIndexubvARB} */
	public static void glMatrixIndexubvARB(ByteBuffer indices) {
		nglMatrixIndexubvARB(indices.remaining(), memAddress(indices));
	}

	// --- [ glMatrixIndexusvARB ] ---

	/** JNI method for {@link #glMatrixIndexusvARB MatrixIndexusvARB} */
	@JavadocExclude
	public static native void nglMatrixIndexusvARB(int size, long indices, long __functionAddress);

	/** Unsafe version of {@link #glMatrixIndexusvARB MatrixIndexusvARB} */
	@JavadocExclude
	public static void nglMatrixIndexusvARB(int size, long indices) {
		long __functionAddress = getInstance().MatrixIndexusvARB;
		nglMatrixIndexusvARB(size, indices, __functionAddress);
	}

	/**
	 * Short version of {@link #glMatrixIndexuivARB MatrixIndexuivARB}.
	 *
	 * @param size    the number of index values to set. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param indices the matrix index values
	 */
	public static void glMatrixIndexusvARB(int size, ByteBuffer indices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, size << 1);
		nglMatrixIndexusvARB(size, memAddress(indices));
	}

	/** Alternative version of: {@link #glMatrixIndexusvARB MatrixIndexusvARB} */
	public static void glMatrixIndexusvARB(ShortBuffer indices) {
		nglMatrixIndexusvARB(indices.remaining(), memAddress(indices));
	}

	// --- [ glMatrixIndexPointerARB ] ---

	/** JNI method for {@link #glMatrixIndexPointerARB MatrixIndexPointerARB} */
	@JavadocExclude
	public static native void nglMatrixIndexPointerARB(int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glMatrixIndexPointerARB MatrixIndexPointerARB} */
	@JavadocExclude
	public static void nglMatrixIndexPointerARB(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().MatrixIndexPointerARB;
		nglMatrixIndexPointerARB(size, type, stride, pointer, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param size    the number of index values per vertex that are stored in the array. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param type    the data type of the values stored in the array. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the matrix index data
	 */
	public static void glMatrixIndexPointerARB(int size, int type, int stride, ByteBuffer pointer) {
		nglMatrixIndexPointerARB(size, type, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glMatrixIndexPointerARB MatrixIndexPointerARB} */
	public static void glMatrixIndexPointerARB(int size, int stride, ByteBuffer pointer) {
		nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_BYTE, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glMatrixIndexPointerARB MatrixIndexPointerARB} */
	public static void glMatrixIndexPointerARB(int size, int stride, ShortBuffer pointer) {
		nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_SHORT, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_INT version of: {@link #glMatrixIndexPointerARB MatrixIndexPointerARB} */
	public static void glMatrixIndexPointerARB(int size, int stride, IntBuffer pointer) {
		nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_INT, stride, memAddress(pointer));
	}

}