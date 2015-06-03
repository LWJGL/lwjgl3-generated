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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/draw_elements_base_vertex.txt">ARB_draw_elements_base_vertex</a> extension.
 * 
 * <p>This extension provides a method to specify a "base vertex offset" value which is effectively added to every vertex index that is transferred through
 * {@link GL11#glDrawElements DrawElements}.</p>
 * 
 * <p>This mechanism can be used to decouple a set of indices from the actual vertex array that it is referencing. This is useful if an application stores
 * multiple indexed models in a single vertex array. The same index array can be used to draw the model no matter where it ends up in a larger vertex array
 * simply by changing the base vertex value. Without this functionality, it would be necessary to rebind all the vertex attributes every time geometry is
 * switched and this can have larger performance penalty.</p>
 * 
 * <p>For example consider the (very contrived and simple) example of drawing two triangles to form a quad. In the typical example you have the following
 * setup:
 * <pre><code style="font-family: monospace">
 *     vertices         indices
 *    ----------        -----
 * 0 | (-1,  1) |    0 |  0  |
 * 1 | (-1, -1) |    1 |  1  |
 * 2 | ( 1, -1) |    2 |  2  |
 * 3 | ( 1,  1) |    3 |  3  |
 *    ----------     4 |  0  |
 *                   5 |  2  |
 *                      -----</code></pre>
 * which is normally rendered with the call
 * <pre><code style="font-family: monospace">
 * DrawElements(TRIANGLES, 6, UNSIGNED_BYTE, &indices).</code></pre>
 * Now consider the case where the vertices you want to draw are not at the start of a vertex array but are instead located at offset 100 into a larger
 * array:
 * <pre><code style="font-family: monospace">
 *      vertices2         indices2
 *      ----------        -----
 *         ....        0 | 100 |
 * 100 | (-1,  1) |    1 | 101 |
 * 101 | (-1, -1) |    2 | 102 |
 * 102 | ( 1, -1) |    3 | 103 |
 * 103 | ( 1,  1) |    4 | 100 |
 *         ....        5 | 102 |
 *      ----------        -----</code></pre>
 * The typical choices for rendering this are to rebind your vertex attributes with an additional offset of 100*stride, or to create an new array of
 * indices (as indices2 in the example). However both rebinding vertex attributes and rebuilding index arrays can be quite costly activities.</p>
 * 
 * <p>With the new drawing commands introduced by this extension you can instead draw using vertices2 and the new draw call:
 * <pre><code style="font-family: monospace">
 * DrawElementsBaseVertex(TRIANGLES, 6, UNSIGNED_BYTE, &indices, 100)</code></pre></p>
 * 
 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public final class ARBDrawElementsBaseVertex {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawElementsBaseVertex,
		DrawRangeElementsBaseVertex,
		DrawElementsInstancedBaseVertex,
		MultiDrawElementsBaseVertex;

	@JavadocExclude
	public ARBDrawElementsBaseVertex(FunctionProvider provider) {
		DrawElementsBaseVertex = provider.getFunctionAddress("glDrawElementsBaseVertex");
		DrawRangeElementsBaseVertex = provider.getFunctionAddress("glDrawRangeElementsBaseVertex");
		DrawElementsInstancedBaseVertex = provider.getFunctionAddress("glDrawElementsInstancedBaseVertex");
		MultiDrawElementsBaseVertex = provider.getFunctionAddress("glMultiDrawElementsBaseVertex");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBDrawElementsBaseVertex} instance for the current context. */
	public static ARBDrawElementsBaseVertex getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBDrawElementsBaseVertex);
	}

	static ARBDrawElementsBaseVertex create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_draw_elements_base_vertex") ) return null;

		ARBDrawElementsBaseVertex funcs = new ARBDrawElementsBaseVertex(provider);

		boolean supported = checkFunctions(
			funcs.DrawElementsBaseVertex, funcs.DrawRangeElementsBaseVertex, funcs.DrawElementsInstancedBaseVertex, funcs.MultiDrawElementsBaseVertex
		);

		return GL.checkExtension("GL_ARB_draw_elements_base_vertex", funcs, supported);
	}

	// --- [ glDrawElementsBaseVertex ] ---

	/** Unsafe version of {@link #glDrawElementsBaseVertex DrawElementsBaseVertex} */
	@JavadocExclude
	public static void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
		long __functionAddress = getInstance().DrawElementsBaseVertex;
		GL32.nglDrawElementsBaseVertex(mode, count, type, indices, basevertex, __functionAddress);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, int count, int type, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsBaseVertex(mode, count, type, memAddress(indices), basevertex);
	}

	/** Buffer object offset version of: {@link #glDrawElementsBaseVertex DrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, int count, int type, long indicesOffset, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsBaseVertex(mode, count, type, indicesOffset, basevertex);
	}

	/** Alternative version of: {@link #glDrawElementsBaseVertex DrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsBaseVertex DrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsBaseVertex DrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsBaseVertex DrawElementsBaseVertex} */
	public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawRangeElementsBaseVertex ] ---

	/** Unsafe version of {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex} */
	@JavadocExclude
	public static void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		long __functionAddress = getInstance().DrawRangeElementsBaseVertex;
		GL32.nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex, __functionAddress);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, memAddress(indices), basevertex);
	}

	/** Buffer object offset version of: {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indicesOffset, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indicesOffset, basevertex);
	}

	/** Alternative version of: {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex} */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawElementsInstancedBaseVertex ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseVertex;
		GL32.nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex, __functionAddress);
	}

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, ByteBuffer indices, int primcount, int basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertex(mode, count, type, memAddress(indices), primcount, basevertex);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indicesOffset, int primcount, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertex(mode, count, type, indicesOffset, primcount, basevertex);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount, basevertex);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex} */
	public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex);
	}

	// --- [ glMultiDrawElementsBaseVertex ] ---

	/** Unsafe version of {@link #glMultiDrawElementsBaseVertex MultiDrawElementsBaseVertex} */
	@JavadocExclude
	public static void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int primcount, long basevertex) {
		long __functionAddress = getInstance().MultiDrawElementsBaseVertex;
		GL32.nglMultiDrawElementsBaseVertex(mode, count, type, indices, primcount, basevertex, __functionAddress);
	}

	/**
	 * Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
	 *
	 * @param mode       the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count      an array of the elements counts
	 * @param type       the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the size of the {@code count} array
	 * @param basevertex a pointer to the location where the base vertices are stored
	 */
	public static void glMultiDrawElementsBaseVertex(int mode, ByteBuffer count, int type, ByteBuffer indices, int primcount, ByteBuffer basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(count, primcount << 2);
			checkBuffer(indices, primcount << POINTER_SHIFT);
			checkBuffer(basevertex, primcount << 2);
		}
		nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), primcount, memAddress(basevertex));
	}

	/** Alternative version of: {@link #glMultiDrawElementsBaseVertex MultiDrawElementsBaseVertex} */
	public static void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count.remaining());
			checkBuffer(basevertex, count.remaining());
		}
		nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
	}

}