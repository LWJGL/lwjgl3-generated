/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

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

	/**
	 * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawArraysIndirectBindlessNV MultiDrawArraysIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
	 * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
	 * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
	 * {@code maxDrawCount} parameter sets.
	 *
	 * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indirect          an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)
	 * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
	 * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
	 * @param stride            the size of one DrawArraysIndirectBindlessCommandNV structure
	 * @param vertexBufferCount the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure
	 */
	public static void nglMultiDrawArraysIndirectBindlessCountNV(int mode, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
		long __functionAddress = GL.getCapabilities().glMultiDrawArraysIndirectBindlessCountNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
	}

	/**
	 * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawArraysIndirectBindlessNV MultiDrawArraysIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
	 * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
	 * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
	 * {@code maxDrawCount} parameter sets.
	 *
	 * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
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

	/**
	 * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawElementsIndirectBindlessNV MultiDrawElementsIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
	 * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
	 * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
	 * {@code maxDrawCount} parameter sets.
	 *
	 * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type              the data type of the element indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indirect          an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)
	 * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
	 * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
	 * @param stride            the size of one DrawElementsIndirectBindlessCommandNV structure
	 * @param vertexBufferCount the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure
	 */
	public static void nglMultiDrawElementsIndirectBindlessCountNV(int mode, int type, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
		long __functionAddress = GL.getCapabilities().glMultiDrawElementsIndirectBindlessCountNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
	}

	/**
	 * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawElementsIndirectBindlessNV MultiDrawElementsIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
	 * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
	 * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
	 * {@code maxDrawCount} parameter sets.
	 *
	 * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type              the data type of the element indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
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