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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/multi_draw_indirect.txt">ARB_multi_draw_indirect</a> extension.
 * 
 * <p>The {@link ARBDrawIndirect ARB_draw_indirect} extension (included in OpenGL 4.0) introduced mechanisms whereby the parameters for a draw function may be provided in a
 * structure contained in a buffer object rather than as parameters to the drawing procedure. This is known as an indirect draw and is exposed as two new
 * functions, {@link ARBDrawIndirect#glDrawArraysIndirect DrawArraysIndirect} and {@link ARBDrawIndirect#glDrawElementsIndirect DrawElementsIndirect}. Each of these functions generates a single batch of
 * primitives.</p>
 * 
 * <p>This extension builds on this functionality by providing procedures to invoke multiple draws from a single procedure call. This allows large batches of
 * drawing commands to be assembled in server memory (via a buffer object) which may then be dispatched through a single function call.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} or {@link ARBDrawIndirect ARB_draw_indirect}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBMultiDrawIndirect {

	/** Function address. */
	@JavadocExclude
	public final long
		MultiDrawArraysIndirect,
		MultiDrawElementsIndirect;

	@JavadocExclude
	public ARBMultiDrawIndirect(FunctionProvider provider) {
		MultiDrawArraysIndirect = provider.getFunctionAddress("glMultiDrawArraysIndirect");
		MultiDrawElementsIndirect = provider.getFunctionAddress("glMultiDrawElementsIndirect");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBMultiDrawIndirect} instance for the current context. */
	public static ARBMultiDrawIndirect getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBMultiDrawIndirect);
	}

	static ARBMultiDrawIndirect create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_multi_draw_indirect") ) return null;

		ARBMultiDrawIndirect funcs = new ARBMultiDrawIndirect(provider);

		boolean supported = checkFunctions(
			funcs.MultiDrawArraysIndirect, funcs.MultiDrawElementsIndirect
		);

		return GL.checkExtension("GL_ARB_multi_draw_indirect", funcs, supported);
	}

	// --- [ glMultiDrawArraysIndirect ] ---

	/** Unsafe version of {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	@JavadocExclude
	public static void nglMultiDrawArraysIndirect(int mode, long indirect, int primcount, int stride) {
		long __functionAddress = getInstance().MultiDrawArraysIndirect;
		GL43.nglMultiDrawArraysIndirect(mode, indirect, primcount, stride, __functionAddress);
	}

	/**
	 * Renders multiple sets of primitives from array data, taking parameters from memory.
	 * 
	 * <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint first;
	 * 	uint baseInstance;
	 * } DrawArraysIndirectCommand;</code></pre></p>
	 * 
	 * <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:
	 * <pre><code style="font-family: monospace">
	 * const ubyte *ptr = (const ubyte *)indirect;
	 * for ( i = 0; i < primcount; i++ ) {
	 * 	DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
	 * 	if ( stride == 0 )
	 * 		ptr += sizeof(DrawArraysIndirectCommand);
	 * 	else
	 * 		ptr += stride;
	 * }</code></pre></p>
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param indirect  an array of structures containing the draw parameters
	 * @param primcount the number of elements in the array of draw parameter structures
	 * @param stride    the distance in basic machine units between elements of the draw parameter array
	 */
	public static void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, primcount * (stride == 0 ? (4 * 4) : stride));
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawArraysIndirect(mode, memAddress(indirect), primcount, stride);
	}

	/** Buffer object offset version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	public static void glMultiDrawArraysIndirect(int mode, long indirectOffset, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglMultiDrawArraysIndirect(mode, indirectOffset, primcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect} */
	public static void glMultiDrawArraysIndirect(int mode, IntBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, (primcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawArraysIndirect(mode, memAddress(indirect), primcount, stride);
	}

	// --- [ glMultiDrawElementsIndirect ] ---

	/** Unsafe version of {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	@JavadocExclude
	public static void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int primcount, int stride) {
		long __functionAddress = getInstance().MultiDrawElementsIndirect;
		GL43.nglMultiDrawElementsIndirect(mode, type, indirect, primcount, stride, __functionAddress);
	}

	/**
	 * Renders multiple indexed primitives from array data, taking parameters from memory.
	 * 
	 * <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):
	 * <pre><code style="font-family: monospace">
	 * typedef struct {
	 * 	uint count;
	 * 	uint primCount;
	 * 	uint firstIndex;
	 * 	uint baseVertex;
	 * 	uint baseInstance;
	 * } DrawElementsIndirectCommand;</code></pre></p>
	 * 
	 * <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:
	 * <pre><code style="font-family: monospace">
	 * const ubyte *ptr = (const ubyte *)indirect;
	 * for ( i = 0; i < primcount; i++ ) {
	 * 	DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
	 * 	if ( stride == 0 )
	 * 		ptr += sizeof(DrawElementsIndirectCommand);
	 * 	else
	 * 		ptr += stride;
	 * }</code></pre></p>
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param type      the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indirect  a structure containing an array of draw parameters
	 * @param primcount the number of elements in the array addressed by {@code indirect}
	 * @param stride    the distance in basic machine units between elements of the draw parameter array
	 */
	public static void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, primcount * (stride == 0 ? (5 * 4) : stride));
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), primcount, stride);
	}

	/** Buffer object offset version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	public static void glMultiDrawElementsIndirect(int mode, int type, long indirectOffset, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglMultiDrawElementsIndirect(mode, type, indirectOffset, primcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect} */
	public static void glMultiDrawElementsIndirect(int mode, int type, IntBuffer indirect, int primcount, int stride) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirect, (primcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
			GLChecks.ensureBufferObject(GL40.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), primcount, stride);
	}

}