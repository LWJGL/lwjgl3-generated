/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A buffer to use for allocations by {@link STBVorbis} */
public final class STBVorbisAlloc implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ALLOC_BUFFER,
		ALLOC_BUFFER_LENGTH_IN_BYTES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		ALLOC_BUFFER = offsets.get(0);
		ALLOC_BUFFER_LENGTH_IN_BYTES = offsets.get(1);
	}

	private final ByteBuffer struct;

	public STBVorbisAlloc() {
		this(malloc());
	}

	public STBVorbisAlloc(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setAllocBuffer(long alloc_buffer) { alloc_buffer(struct, alloc_buffer); }
	public void setAllocBuffer(ByteBuffer alloc_buffer) { alloc_buffer(struct, alloc_buffer); }
	public void setAllocBufferLengthInBytes(int alloc_buffer_length_in_bytes) { alloc_buffer_length_in_bytes(struct, alloc_buffer_length_in_bytes); }

	public long getAllocBuffer() { return alloc_buffer(struct); }
	public ByteBuffer getAllocBuffer(int byteLen) { return alloc_buffer(struct, byteLen); }
	public int getAllocBufferLengthInBytes() { return alloc_buffer_length_in_bytes(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer alloc_buffer,
		int alloc_buffer_length_in_bytes
	) {
		ByteBuffer stb_vorbis_alloc = malloc();

		alloc_buffer(stb_vorbis_alloc, alloc_buffer);
		alloc_buffer_length_in_bytes(stb_vorbis_alloc, alloc_buffer_length_in_bytes);

		return stb_vorbis_alloc;
	}

	public static void alloc_buffer(ByteBuffer stb_vorbis_alloc, long alloc_buffer) { PointerBuffer.put(stb_vorbis_alloc, stb_vorbis_alloc.position() + ALLOC_BUFFER, alloc_buffer); }
	public static void alloc_buffer(ByteBuffer stb_vorbis_alloc, ByteBuffer alloc_buffer) { alloc_buffer(stb_vorbis_alloc, memAddressSafe(alloc_buffer)); }
	public static void alloc_buffer_length_in_bytes(ByteBuffer stb_vorbis_alloc, int alloc_buffer_length_in_bytes) { stb_vorbis_alloc.putInt(stb_vorbis_alloc.position() + ALLOC_BUFFER_LENGTH_IN_BYTES, alloc_buffer_length_in_bytes); }

	public static long alloc_buffer(ByteBuffer stb_vorbis_alloc) { return PointerBuffer.get(stb_vorbis_alloc, stb_vorbis_alloc.position() + ALLOC_BUFFER); }
	public static ByteBuffer alloc_buffer(ByteBuffer stb_vorbis_alloc, int byteLen) { return memByteBuffer(alloc_buffer(stb_vorbis_alloc), byteLen); }
	public static int alloc_buffer_length_in_bytes(ByteBuffer stb_vorbis_alloc) { return stb_vorbis_alloc.getInt(stb_vorbis_alloc.position() + ALLOC_BUFFER_LENGTH_IN_BYTES); }

}