/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_elements_base_vertex.txt">EXT_draw_elements_base_vertex</a> extension.
 * 
 * <p>This extension provides a method to specify a "base vertex offset" value which is effectively added to every vertex index that is transferred through
 * {@link GLES20#glDrawElements DrawElements}.</p>
 * 
 * <p>This mechanism can be used to decouple a set of indices from the actual vertex array that it is referencing. This is useful if an application stores
 * multiple indexed models in a single vertex array. The same index array can be used to draw the model no matter where it ends up in a larger vertex array
 * simply by changing the base vertex value. Without this functionality, it would be necessary to rebind all the vertex attributes every time geometry is
 * switched and this can have larger performance penalty.</p>
 * 
 * <p>For example consider the (very contrived and simple) example of drawing two triangles to form a quad. In the typical example you have the following
 * setup:</p>
 * 
 * <pre><code>    vertices         indices
   ----------        -----
0 | (-1,  1) |    0 |  0  |
1 | (-1, -1) |    1 |  1  |
2 | ( 1, -1) |    2 |  2  |
3 | ( 1,  1) |    3 |  3  |
   ----------     4 |  0  |
                  5 |  2  |
                     -----</code></pre>
 * 
 * <p>which is normally rendered with the call</p>
 * 
 * <pre><code>DrawElements(TRIANGLES, 6, UNSIGNED_BYTE, &indices).</code></pre>
 * 
 * <p>Now consider the case where the vertices you want to draw are not at the start of a vertex array but are instead located at offset 100 into a larger
 * array:</p>
 * 
 * <pre><code>     vertices2         indices2
     ----------        -----
        ....        0 | 100 |
100 | (-1,  1) |    1 | 101 |
101 | (-1, -1) |    2 | 102 |
102 | ( 1, -1) |    3 | 103 |
103 | ( 1,  1) |    4 | 100 |
        ....        5 | 102 |
     ----------        -----</code></pre>
 * 
 * <p>The typical choices for rendering this are to rebind your vertex attributes with an additional offset of 100*stride, or to create an new array of
 * indices (as indices2 in the example). However both rebinding vertex attributes and rebuilding index arrays can be quite costly activities.</p>
 * 
 * <p>With the new drawing commands introduced by this extension you can instead draw using vertices2 and the new draw call:</p>
 * 
 * <pre><code>DrawElementsBaseVertexEXT(TRIANGLES, 6, UNSIGNED_BYTE, &indices, 100)</code></pre>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTDrawElementsBaseVertex {

	protected EXTDrawElementsBaseVertex() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glDrawElementsBaseVertexEXT, ext.contains("GLES30") ? caps.glDrawRangeElementsBaseVertexEXT : -1L, 
			ext.contains("GLES30") ? caps.glDrawElementsInstancedBaseVertexEXT : -1L, 
			ext.contains("GL_EXT_multi_draw_arrays") ? caps.glMultiDrawElementsBaseVertexEXT : -1L
		);
	}

	// --- [ glDrawElementsBaseVertexEXT ] ---

	public static void nglDrawElementsBaseVertexEXT(int mode, int count, int type, long indices, int basevertex) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsBaseVertexEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, basevertex);
	}

	public static void glDrawElementsBaseVertexEXT(int mode, int count, int type, long indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsBaseVertexEXT(mode, count, type, indices, basevertex);
	}

	public static void glDrawElementsBaseVertexEXT(int mode, int type, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertexEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	public static void glDrawElementsBaseVertexEXT(int mode, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertexEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	public static void glDrawElementsBaseVertexEXT(int mode, ShortBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertexEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	public static void glDrawElementsBaseVertexEXT(int mode, IntBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertexEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawRangeElementsBaseVertexEXT ] ---

	public static void nglDrawRangeElementsBaseVertexEXT(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		long __functionAddress = GLES.getCapabilities().glDrawRangeElementsBaseVertexEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, start, end, count, type, indices, basevertex);
	}

	public static void glDrawRangeElementsBaseVertexEXT(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawRangeElementsBaseVertexEXT(mode, start, end, count, type, indices, basevertex);
	}

	public static void glDrawRangeElementsBaseVertexEXT(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertexEXT(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	public static void glDrawRangeElementsBaseVertexEXT(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertexEXT(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	public static void glDrawRangeElementsBaseVertexEXT(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertexEXT(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	public static void glDrawRangeElementsBaseVertexEXT(int mode, int start, int end, IntBuffer indices, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertexEXT(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawElementsInstancedBaseVertexEXT ] ---

	public static void nglDrawElementsInstancedBaseVertexEXT(int mode, int count, int type, long indices, int instancecount, int basevertex) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstancedBaseVertexEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertexEXT(int mode, int count, int type, long indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertexEXT(mode, count, type, indices, instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertexEXT(int mode, int type, ByteBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertexEXT(int mode, ByteBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertexEXT(int mode, ShortBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex);
	}

	public static void glDrawElementsInstancedBaseVertexEXT(int mode, IntBuffer indices, int instancecount, int basevertex) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex);
	}

	// --- [ glMultiDrawElementsBaseVertexEXT ] ---

	public static void nglMultiDrawElementsBaseVertexEXT(int mode, long count, int type, long indices, int primcount, long basevertex) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsBaseVertexEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, mode, count, type, indices, primcount, basevertex);
	}

	public static void glMultiDrawElementsBaseVertexEXT(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
		if ( CHECKS ) {
			checkBuffer(indices, count.remaining());
			checkBuffer(basevertex, count.remaining());
		}
		nglMultiDrawElementsBaseVertexEXT(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
	}

	/** Array version of: {@link #glMultiDrawElementsBaseVertexEXT MultiDrawElementsBaseVertexEXT} */
	public static void glMultiDrawElementsBaseVertexEXT(int mode, int[] count, int type, PointerBuffer indices, int[] basevertex) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsBaseVertexEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count.length);
			checkBuffer(basevertex, count.length);
		}
		callPPPV(__functionAddress, mode, count, type, memAddress(indices), count.length, basevertex);
	}

}