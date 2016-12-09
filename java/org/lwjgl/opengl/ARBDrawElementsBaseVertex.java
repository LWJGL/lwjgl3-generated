/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
 * <pre><code>DrawElementsBaseVertex(TRIANGLES, 6, UNSIGNED_BYTE, &indices, 100)</code></pre>
 * 
 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public class ARBDrawElementsBaseVertex {

	static { GL.initialize(); }

	protected ARBDrawElementsBaseVertex() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glDrawElementsBaseVertex, caps.glDrawRangeElementsBaseVertex, caps.glDrawElementsInstancedBaseVertex, caps.glMultiDrawElementsBaseVertex
		);
	}

	// --- [ glDrawElementsBaseVertex ] ---

	/**
	 * Unsafe version of: {@link #glDrawElementsBaseVertex DrawElementsBaseVertex}
	 *
	 * @param count the number of elements to be rendered
	 * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 */
	public static native void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
		nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
		nglDrawElementsBaseVertex(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
		nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawRangeElementsBaseVertex ] ---

	/**
	 * Unsafe version of: {@link #glDrawRangeElementsBaseVertex DrawRangeElementsBaseVertex}
	 *
	 * @param count the number of elements to be rendered
	 * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 */
	public static native void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex);

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
		nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
	}

	/**
	 * Renders primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param start      the minimum array index contained in {@code indices}
	 * @param end        the maximum array index contained in {@code indices}
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 */
	public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
		nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
	}

	// --- [ glDrawElementsInstancedBaseVertex ] ---

	/**
	 * Unsafe version of: {@link #glDrawElementsInstancedBaseVertex DrawElementsInstancedBaseVertex}
	 *
	 * @param count the number of elements to be rendered
	 * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 */
	public static native void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex);

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      the number of elements to be rendered
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
		nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
	}

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex) {
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount, basevertex);
	}

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex);
	}

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex);
	}

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param primcount  the number of instances of the indexed geometry that should be drawn
	 * @param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays
	 */
	public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
		nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex);
	}

	// --- [ glMultiDrawElementsBaseVertex ] ---

	/**
	 * Unsafe version of: {@link #glMultiDrawElementsBaseVertex MultiDrawElementsBaseVertex}
	 *
	 * @param primcount the size of the {@code count} array
	 */
	public static native void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int primcount, long basevertex);

	/**
	 * Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
	 *
	 * @param mode       the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count      an array of the elements counts
	 * @param type       the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices    a pointer to the location where the indices are stored
	 * @param basevertex a pointer to the location where the base vertices are stored
	 */
	public static void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
		if ( CHECKS ) {
			check(indices, count.remaining());
			check(basevertex, count.remaining());
		}
		nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
	}

	/** Array version of: {@link #glMultiDrawElementsBaseVertex MultiDrawElementsBaseVertex} */
	public static void glMultiDrawElementsBaseVertex(int mode, int[] count, int type, PointerBuffer indices, int[] basevertex) {
		long __functionAddress = GL.getICD().glMultiDrawElementsBaseVertex;
		if ( CHECKS ) {
			check(__functionAddress);
			check(indices, count.length);
			check(basevertex, count.length);
		}
		callPPPV(__functionAddress, mode, count, type, memAddress(indices), count.length, basevertex);
	}

}