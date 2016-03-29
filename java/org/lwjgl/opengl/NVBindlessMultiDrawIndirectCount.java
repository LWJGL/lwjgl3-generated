/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/bindless_multi_draw_indirect_count.txt">NV_bindless_multi_draw_indirect_count</a> extension.
 * 
 * <p>This extension adds the possibility to define the number of drawcalls within a multi-draw-indirect call from the GPU, as provided by
 * ARB_indirect_parameters, for the functions added in NV_bindless_multi_draw_indirect.</p>
 * 
 * <p>Requires {@link NVBindlessMultiDrawIndirect NV_bindless_multi_draw_indirect}, {@link ARBIndirectParameters ARB_indirect_parameters}.</p>
 */
public class NVBindlessMultiDrawIndirectCount {

	protected NVBindlessMultiDrawIndirectCount() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glMultiDrawArraysIndirectBindlessCountNV, caps.glMultiDrawElementsIndirectBindlessCountNV
		);
	}

	// --- [ glMultiDrawArraysIndirectBindlessCountNV ] ---

	/** Unsafe version of {@link #glMultiDrawArraysIndirectBindlessCountNV MultiDrawArraysIndirectBindlessCountNV} */
	public static void nglMultiDrawArraysIndirectBindlessCountNV(int mode, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
		long __functionAddress = GL.getCapabilities().glMultiDrawArraysIndirectBindlessCountNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPIIIV(__functionAddress, mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
	}

	/**
	 * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawArraysIndirectBindlessNV MultiDrawArraysIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
	 * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
	 * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
	 * {@code maxDrawCount} parameter sets.
	 *
	 * @param mode              the primitive mode. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param indirect          an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)
	 * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
	 * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
	 * @param stride            the size of one DrawArraysIndirectBindlessCommandNV structure
	 * @param vertexBufferCount the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure
	 */
	public static void glMultiDrawArraysIndirectBindlessCountNV(int mode, ByteBuffer indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
		nglMultiDrawArraysIndirectBindlessCountNV(mode, memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
	}

	// --- [ glMultiDrawElementsIndirectBindlessCountNV ] ---

	/** Unsafe version of {@link #glMultiDrawElementsIndirectBindlessCountNV MultiDrawElementsIndirectBindlessCountNV} */
	public static void nglMultiDrawElementsIndirectBindlessCountNV(int mode, int type, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
		long __functionAddress = GL.getCapabilities().glMultiDrawElementsIndirectBindlessCountNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPPIIIV(__functionAddress, mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
	}

	/**
	 * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawElementsIndirectBindlessNV MultiDrawElementsIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
	 * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
	 * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
	 * {@code maxDrawCount} parameter sets.
	 *
	 * @param mode              the primitive mode. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param type              the data type of the element indices. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indirect          an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)
	 * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
	 * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
	 * @param stride            the size of one DrawElementsIndirectBindlessCommandNV structure
	 * @param vertexBufferCount the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure
	 */
	public static void glMultiDrawElementsIndirectBindlessCountNV(int mode, int type, ByteBuffer indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
		nglMultiDrawElementsIndirectBindlessCountNV(mode, type, memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
	}

}