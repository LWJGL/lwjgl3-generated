/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_draw_elements_base_vertex.txt">OES_draw_elements_base_vertex</a> extension.
 * 
 * <p>This extension provides a method to specify a "base vertex offset" value which is effectively added to every vertex index that is transferred through
 * DrawElements.</p>
 * 
 * <p>This mechanism can be used to decouple a set of indices from the actual vertex array that it is referencing. This is useful if an application stores
 * multiple indexed models in a single vertex array. The same index array can be used to draw the model no matter where it ends up in a larger vertex
 * array simply by changing the base vertex value. Without this functionality, it would be necessary to rebind all the vertex attributes every time
 * geometry is switched and this can have larger performance penalty.</p>
 * 
 * <p>For example consider the (very contrived and simple) example of drawing two triangles to form a quad. In the typical example you have the following
 * setup:
 * <pre><code style="font-family: monospace">
 *          vertices                indices
 *          ----------                -----
 *       0 | (-1,  1) |            0 |  0  |
 *       1 | (-1, -1) |            1 |  1  |
 *       2 | ( 1, -1) |            2 |  2  |
 *       3 | ( 1,  1) |            3 |  3  |
 *          ----------             4 |  0  |
 *                                 5 |  2  |
 *                                    -----</code></pre>
 * which is normally rendered with the call
 * <pre><code style="font-family: monospace">
 * 		DrawElements(TRIANGLES, 6, UNSIGNED_BYTE, &indices).</code></pre>
 * Now consider the case where the vertices you want to draw are not at the start of a vertex array but are instead located at offset 100 into a larger
 * array:
 * <pre><code style="font-family: monospace">
 *            vertices2             indices2
 *            ----------             -----
 *               ....             0 | 100 |
 *       100 | (-1,  1) |         1 | 101 |
 *       101 | (-1, -1) |         2 | 102 |
 *       102 | ( 1, -1) |         3 | 103 |
 *       103 | ( 1,  1) |         4 | 100 |
 *               ....             5 | 102 |
 *            ----------             -----</code></pre>
 * The typical choices for rendering this are to rebind your vertex attributes with an additional offset of 100*stride, or to create an new array of
 * indices (as indices2 in the example). However both rebinding vertex attributes and rebuilding index arrays can be quite costly activities.</p>
 * 
 * <p>With the new drawing commands introduced by this extension you can instead draw using vertices2 and the new draw call:
 * <pre><code style="font-family: monospace">
 * 		DrawElementsBaseVertexOES(TRIANGLES, 6, UNSIGNED_BYTE, &indices, 100)</code></pre>
 * Requires {@link GLES20 GLES E.S}.</p>
 */
public final class OESDrawElementsBaseVertex {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawElementsBaseVertexOES,
		DrawRangeElementsBaseVertexOES,
		DrawElementsInstancedBaseVertexOES,
		MultiDrawElementsBaseVertexOES;

	@JavadocExclude
	public OESDrawElementsBaseVertex(FunctionProvider provider) {
		DrawElementsBaseVertexOES = provider.getFunctionAddress("glDrawElementsBaseVertexOES");
		DrawRangeElementsBaseVertexOES = provider.getFunctionAddress("glDrawRangeElementsBaseVertexOES");
		DrawElementsInstancedBaseVertexOES = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexOES");
		MultiDrawElementsBaseVertexOES = provider.getFunctionAddress("glMultiDrawElementsBaseVertexOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESDrawElementsBaseVertex} instance for the current context. */
	public static OESDrawElementsBaseVertex getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESDrawElementsBaseVertex);
	}

	static OESDrawElementsBaseVertex create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_draw_elements_base_vertex") ) return null;

		OESDrawElementsBaseVertex funcs = new OESDrawElementsBaseVertex(provider);
		boolean supported = checkFunctions(
			funcs.DrawElementsBaseVertexOES, ext.contains("GLES30") ? funcs.DrawRangeElementsBaseVertexOES : -1L, 
			ext.contains("GLES30") ? funcs.DrawElementsInstancedBaseVertexOES : -1L, 
			ext.contains("EXT_multi_draw_arrays") ? funcs.MultiDrawElementsBaseVertexOES : -1L
		);

		return GLES.checkExtension("GL_OES_draw_elements_base_vertex", funcs, supported);
	}

	// --- [ glDrawElementsBaseVertexOES ] ---

	/** Unsafe version of {@link #glDrawElementsBaseVertexOES DrawElementsBaseVertexOES} */
	@JavadocExclude
	public static void nglDrawElementsBaseVertexOES(int mode, int count, int type, long indices, int basevertex) {
		long __functionAddress = getInstance().DrawElementsBaseVertexOES;
		callIIIPIV(__functionAddress, mode, count, type, indices, basevertex);
	}

	public static void glDrawElementsBaseVertexOES(int mode, int count, int type, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsBaseVertexOES(mode, count, type, memAddress(indices), basevertex);
	}

	/** Buffer object offset version of: {@link #glDrawElementsBaseVertexOES DrawElementsBaseVertexOES} */
	public static void glDrawElementsBaseVertexOES(int mode, int count, int type, long indicesOffset, int basevertex) {
		nglDrawElementsBaseVertexOES(mode, count, type, indicesOffset, basevertex);
	}

	/** Alternative version of: {@link #glDrawElementsBaseVertexOES DrawElementsBaseVertexOES} */
	public static void glDrawElementsBaseVertexOES(int mode, int type, ByteBuffer indices, int basevertex) {
		nglDrawElementsBaseVertexOES(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsBaseVertexOES DrawElementsBaseVertexOES} */
	public static void glDrawElementsBaseVertexOES(int mode, ByteBuffer indices, int basevertex) {
		nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsBaseVertexOES DrawElementsBaseVertexOES} */
	public static void glDrawElementsBaseVertexOES(int mode, ShortBuffer indices, int basevertex) {
		nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsBaseVertexOES DrawElementsBaseVertexOES} */
	public static void glDrawElementsBaseVertexOES(int mode, IntBuffer indices, int basevertex) {
		nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawRangeElementsBaseVertexOES ] ---

	/** Unsafe version of {@link #glDrawRangeElementsBaseVertexOES DrawRangeElementsBaseVertexOES} */
	@JavadocExclude
	public static void nglDrawRangeElementsBaseVertexOES(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		long __functionAddress = getInstance().DrawRangeElementsBaseVertexOES;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIPIV(__functionAddress, mode, start, end, count, type, indices, basevertex);
	}

	public static void glDrawRangeElementsBaseVertexOES(int mode, int start, int end, int count, int type, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawRangeElementsBaseVertexOES(mode, start, end, count, type, memAddress(indices), basevertex);
	}

	/** Buffer object offset version of: {@link #glDrawRangeElementsBaseVertexOES DrawRangeElementsBaseVertexOES} */
	public static void glDrawRangeElementsBaseVertexOES(int mode, int start, int end, int count, int type, long indicesOffset, int basevertex) {
		nglDrawRangeElementsBaseVertexOES(mode, start, end, count, type, indicesOffset, basevertex);
	}

	/** Alternative version of: {@link #glDrawRangeElementsBaseVertexOES DrawRangeElementsBaseVertexOES} */
	public static void glDrawRangeElementsBaseVertexOES(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawRangeElementsBaseVertexOES DrawRangeElementsBaseVertexOES} */
	public static void glDrawRangeElementsBaseVertexOES(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawRangeElementsBaseVertexOES DrawRangeElementsBaseVertexOES} */
	public static void glDrawRangeElementsBaseVertexOES(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawRangeElementsBaseVertexOES DrawRangeElementsBaseVertexOES} */
	public static void glDrawRangeElementsBaseVertexOES(int mode, int start, int end, IntBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawElementsInstancedBaseVertexOES ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedBaseVertexOES DrawElementsInstancedBaseVertexOES} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseVertexOES(int mode, int count, int type, long indices, int instancecount, int basevertex) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseVertexOES;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPIIV(__functionAddress, mode, count, type, indices, instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertexOES(int mode, int count, int type, ByteBuffer indices, int instancecount, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstancedBaseVertexOES(mode, count, type, memAddress(indices), instancecount, basevertex);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseVertexOES DrawElementsInstancedBaseVertexOES} */
	public static void glDrawElementsInstancedBaseVertexOES(int mode, int count, int type, long indicesOffset, int instancecount, int basevertex) {
		nglDrawElementsInstancedBaseVertexOES(mode, count, type, indicesOffset, instancecount, basevertex);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseVertexOES DrawElementsInstancedBaseVertexOES} */
	public static void glDrawElementsInstancedBaseVertexOES(int mode, int type, ByteBuffer indices, int instancecount, int basevertex) {
		nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseVertexOES DrawElementsInstancedBaseVertexOES} */
	public static void glDrawElementsInstancedBaseVertexOES(int mode, ByteBuffer indices, int instancecount, int basevertex) {
		nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseVertexOES DrawElementsInstancedBaseVertexOES} */
	public static void glDrawElementsInstancedBaseVertexOES(int mode, ShortBuffer indices, int instancecount, int basevertex) {
		nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseVertexOES DrawElementsInstancedBaseVertexOES} */
	public static void glDrawElementsInstancedBaseVertexOES(int mode, IntBuffer indices, int instancecount, int basevertex) {
		nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex);
	}

	// --- [ glMultiDrawElementsBaseVertexOES ] ---

	/** Unsafe version of {@link #glMultiDrawElementsBaseVertexOES MultiDrawElementsBaseVertexOES} */
	@JavadocExclude
	public static void nglMultiDrawElementsBaseVertexOES(int mode, long count, int type, long indices, int primcount, long basevertex) {
		long __functionAddress = getInstance().MultiDrawElementsBaseVertexOES;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPIPIPV(__functionAddress, mode, count, type, indices, primcount, basevertex);
	}

	public static void glMultiDrawElementsBaseVertexOES(int mode, ByteBuffer count, int type, ByteBuffer indices, int primcount, ByteBuffer basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(count, primcount << 2);
			checkBuffer(indices, primcount << POINTER_SHIFT);
			checkBuffer(basevertex, primcount << 2);
		}
		nglMultiDrawElementsBaseVertexOES(mode, memAddress(count), type, memAddress(indices), primcount, memAddress(basevertex));
	}

	/** Alternative version of: {@link #glMultiDrawElementsBaseVertexOES MultiDrawElementsBaseVertexOES} */
	public static void glMultiDrawElementsBaseVertexOES(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count.remaining());
			checkBuffer(basevertex, count.remaining());
		}
		nglMultiDrawElementsBaseVertexOES(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
	}

}