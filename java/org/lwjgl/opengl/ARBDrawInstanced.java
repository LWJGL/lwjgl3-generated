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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/draw_instanced.txt">ARB_draw_instanced</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while restricting the number of API calls, and keeping
 * the amount of duplicate data to a minimum.</p>
 * 
 * <p>This extension introduces two draw calls which are conceptually equivalent to a series of draw calls. Each conceptual call in this series is considered
 * an "instance" of the actual draw call.</p>
 * 
 * <p>This extension also introduces a read-only built-in variable to GLSL which contains the "instance ID." This variable initially contains 0, but increases
 * by one after each conceptual draw call.</p>
 * 
 * <p>By using the instance ID or multiples thereof as an index into a uniform array containing transform data, vertex shaders can draw multiple instances of
 * an object with a single draw call.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} or <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a> or <a href="http://www.opengl.org/registry/specs/NV/vertex_program4.txt">NV_vertex_program4</a>. Promoted to core in {@link GL31 OpenGL 3.1}.</p>
 */
public final class ARBDrawInstanced {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedARB,
		DrawElementsInstancedARB;

	@JavadocExclude
	public ARBDrawInstanced(FunctionProvider provider) {
		DrawArraysInstancedARB = provider.getFunctionAddress("glDrawArraysInstancedARB");
		DrawElementsInstancedARB = provider.getFunctionAddress("glDrawElementsInstancedARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBDrawInstanced} instance for the current context. */
	public static ARBDrawInstanced getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBDrawInstanced);
	}

	static ARBDrawInstanced create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_draw_instanced") ) return null;

		ARBDrawInstanced funcs = new ARBDrawInstanced(provider);

		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedARB, funcs.DrawElementsInstancedARB
		);

		return GL.checkExtension("GL_ARB_draw_instanced", funcs, supported);
	}

	// --- [ glDrawArraysInstancedARB ] ---

	/** JNI method for {@link #glDrawArraysInstancedARB DrawArraysInstancedARB} */
	@JavadocExclude
	public static native void nglDrawArraysInstancedARB(int mode, int first, int count, int primcount, long __functionAddress);

	/**
	 * Draw multiple instances of a range of elements.
	 *
	 * @param mode      the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param first     the starting index in the enabled arrays
	 * @param count     the number of indices to be rendered
	 * @param primcount the number of instances of the specified range of indices to be rendered
	 */
	public static void glDrawArraysInstancedARB(int mode, int first, int count, int primcount) {
		long __functionAddress = getInstance().DrawArraysInstancedARB;
		nglDrawArraysInstancedARB(mode, first, count, primcount, __functionAddress);
	}

	// --- [ glDrawElementsInstancedARB ] ---

	/** JNI method for {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	@JavadocExclude
	public static native void nglDrawElementsInstancedARB(int mode, int count, int type, long indices, int primcount, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	@JavadocExclude
	public static void nglDrawElementsInstancedARB(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = getInstance().DrawElementsInstancedARB;
		nglDrawElementsInstancedARB(mode, count, type, indices, primcount, __functionAddress);
	}

	/**
	 * Draws multiple instances of a set of elements.
	 *
	 * @param mode      the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count     the number of elements to be rendered
	 * @param type      the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices   a pointer to the location where the indices are stored
	 * @param primcount the number of instances of the specified range of indices to be rendered
	 */
	public static void glDrawElementsInstancedARB(int mode, int count, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedARB(mode, count, type, memAddress(indices), primcount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	public static void glDrawElementsInstancedARB(int mode, int count, int type, long indicesOffset, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedARB(mode, count, type, indicesOffset, primcount);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	public static void glDrawElementsInstancedARB(int mode, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedARB(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	public static void glDrawElementsInstancedARB(int mode, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedARB(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	public static void glDrawElementsInstancedARB(int mode, ShortBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedARB(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedARB DrawElementsInstancedARB} */
	public static void glDrawElementsInstancedARB(int mode, IntBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedARB(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

}