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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/base_instance.txt">ARB_base_instance</a> extension.
 * 
 * <p>This extension allows the offset within buffer objects used for instanced rendering to be specified. This is congruent with the {@code first} parameter
 * in {@link GL11#glDrawArrays DrawArrays} and the {@code basevertex} parameter in {@link GL11#glDrawElements DrawElements}. When instanced rendering is performed (for example, through
 * {@link GL31#glDrawArraysInstanced DrawArraysInstanced}), instanced vertex attributes whose vertex attribute divisors are non-zero are fetched from enabled vertex arrays
 * per-instance rather than per-vertex. However, in unextended OpenGL, there is no way to define the offset into those arrays from which the attributes are
 * fetched. This extension adds that offset in the form of a <baseinstance> parameter to several new procedures.</p>
 * 
 * <p>The {@code baseinstance} parameter is added to the index of the array element, after division by the vertex attribute divisor. This allows several sets
 * of instanced vertex attribute data to be stored in a single vertex array, and the base offset of that data to be specified for each draw. Further, this
 * extension exposes the <baseinstance> parameter as the final and previously undefined structure member of the draw-indirect data structure.</p>
 * 
 * <p>Requires {@link GL31 OpenGL 3.1} or {@link ARBDrawInstanced ARB_draw_instanced}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBBaseInstance {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedBaseInstance,
		DrawElementsInstancedBaseInstance,
		DrawElementsInstancedBaseVertexBaseInstance;

	@JavadocExclude
	public ARBBaseInstance(FunctionProvider provider) {
		DrawArraysInstancedBaseInstance = provider.getFunctionAddress("glDrawArraysInstancedBaseInstance");
		DrawElementsInstancedBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseInstance");
		DrawElementsInstancedBaseVertexBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstance");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBBaseInstance} instance for the current context. */
	public static ARBBaseInstance getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBBaseInstance);
	}

	static ARBBaseInstance create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_base_instance") ) return null;

		ARBBaseInstance funcs = new ARBBaseInstance(provider);

		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedBaseInstance, funcs.DrawElementsInstancedBaseInstance, funcs.DrawElementsInstancedBaseVertexBaseInstance
		);

		return GL.checkExtension("GL_ARB_base_instance", funcs, supported);
	}

	// --- [ glDrawArraysInstancedBaseInstance ] ---

	/**
	 * Draws multiple instances of a range of elements with an offset applied to instanced attributes.
	 *
	 * @param mode         what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param first        the starting index in the enabled arrays
	 * @param count        the number of indices to be rendered
	 * @param primcount    the number of instances of the specified range of indices to be rendered
	 * @param baseinstance the base instance for use in fetching instanced vertex attributes
	 */
	public static void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
		long __functionAddress = getInstance().DrawArraysInstancedBaseInstance;
		GL42.nglDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance, __functionAddress);
	}

	// --- [ glDrawElementsInstancedBaseInstance ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseInstance;
		GL42.nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance, __functionAddress);
	}

	/**
	 * Draws multiple instances of a set of elements with an offset applied to instanced attributes
	 *
	 * @param mode         what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count        the number of elements to be rendered
	 * @param type         the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices      a pointer to the location where the indices are stored
	 * @param primcount    the number of instances of the specified range of indices to be rendered
	 * @param baseinstance the base instance for use in fetching instanced vertex attributes
	 */
	public static void glDrawElementsInstancedBaseInstance(int mode, int count, int type, ByteBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseInstance(mode, count, type, memAddress(indices), primcount, baseinstance);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indicesOffset, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseInstance(mode, count, type, indicesOffset, primcount, baseinstance);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount, baseinstance);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, baseinstance);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, baseinstance);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance} */
	public static void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, baseinstance);
	}

	// --- [ glDrawElementsInstancedBaseVertexBaseInstance ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseVertexBaseInstance;
		GL42.nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance, __functionAddress);
	}

	/**
	 * Renders multiple instances of a set of primitives from array data with a per-element offset.
	 *
	 * @param mode         what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count        the number of elements to be rendered
	 * @param type         the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices      a pointer to the location where the indices are stored
	 * @param primcount    the number of instances of the indexed geometry that should be drawn
	 * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
	 * @param baseinstance the base instance for use in fetching instanced vertex attributes
	 */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indicesOffset, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indicesOffset, primcount, basevertex, baseinstance);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance} */
	public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex, baseinstance);
	}

}