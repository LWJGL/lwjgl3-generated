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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/map_buffer_range.txt">ARB_map_buffer_range</a> extension.
 * 
 * <p>ARB_map_buffer_range expands the buffer object API to allow greater performance when a client application only needs to write to a sub-range of a buffer
 * object. To that end, this extension introduces two new buffer object features: non-serialized buffer modification and explicit sub-range flushing for
 * mapped buffer objects.</p>
 * 
 * <p>OpenGL requires that commands occur in a FIFO manner meaning that any changes to buffer objects either block until the data has been processed by the
 * OpenGL pipeline or else create extra copies to avoid such a block. By providing a method to asynchronously modify buffer object data, an application is
 * then able to manage the synchronization points themselves and modify ranges of data contained by a buffer object even though OpenGL might still be using
 * other parts of it.</p>
 * 
 * <p>This extension also provides a method for explicitly flushing ranges of a mapped buffer object so OpenGL does not have to assume that the entire range
 * may have been modified. Further, it allows the application to more precisely specify its intent with respect to reading, writing, and whether the
 * previous contents of a mapped range of interest need be preserved prior to modification.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class ARBMapBufferRange {

	/** Accepted by the {@code access} parameter of MapBufferRange. */
	public static final int
		GL_MAP_READ_BIT              = 0x1,
		GL_MAP_WRITE_BIT             = 0x2,
		GL_MAP_INVALIDATE_RANGE_BIT  = 0x4,
		GL_MAP_INVALIDATE_BUFFER_BIT = 0x8,
		GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10,
		GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;

	/** Function address. */
	@JavadocExclude
	public final long
		MapBufferRange,
		FlushMappedBufferRange;

	@JavadocExclude
	public ARBMapBufferRange(FunctionProvider provider) {
		MapBufferRange = provider.getFunctionAddress("glMapBufferRange");
		FlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBMapBufferRange} instance for the current context. */
	public static ARBMapBufferRange getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBMapBufferRange);
	}

	static ARBMapBufferRange create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_map_buffer_range") ) return null;

		ARBMapBufferRange funcs = new ARBMapBufferRange(provider);

		boolean supported = checkFunctions(
			funcs.MapBufferRange, funcs.FlushMappedBufferRange
		);

		return GL.checkExtension("GL_ARB_map_buffer_range", funcs, supported);
	}

	// --- [ glMapBufferRange ] ---

	/** Unsafe version of {@link #glMapBufferRange MapBufferRange} */
	@JavadocExclude
	public static long nglMapBufferRange(int target, long offset, long length, int access) {
		long __functionAddress = getInstance().MapBufferRange;
		return GL30.nglMapBufferRange(target, offset, length, access, __functionAddress);
	}

	/**
	 * Maps a section of a buffer object's data store.
	 * 
	 * <p><b>LWJGL note</b>: This method comes in 2 flavors:
	 * <ol>
	 * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
	 * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if the specified length and returned pointer match the buffer capacity and address, respectively.</li>
	 * </ol></p>
	 *
	 * @param target a binding to which the target buffer is bound. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br>{@link #GL_MAP_READ_BIT MAP_READ_BIT}, {@link #GL_MAP_WRITE_BIT MAP_WRITE_BIT}, {@link #GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}, {@link #GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}, {@link #GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}, {@link #GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}
	 */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/** Alternative version of: {@link #glMapBufferRange MapBufferRange} */
	public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapBufferRange(target, offset, length, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glFlushMappedBufferRange ] ---

	/**
	 * Indicates modifications to a range of a mapped buffer.
	 *
	 * @param target the target of the flush operation. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the start of the buffer subrange, in basic machine units
	 * @param length the length of the buffer subrange, in basic machine units
	 */
	public static void glFlushMappedBufferRange(int target, long offset, long length) {
		long __functionAddress = getInstance().FlushMappedBufferRange;
		GL30.nglFlushMappedBufferRange(target, offset, length, __functionAddress);
	}

}