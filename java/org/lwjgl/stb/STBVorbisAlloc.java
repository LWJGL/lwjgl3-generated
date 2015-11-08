/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A buffer to use for allocations by {@link STBVorbis} */
public class STBVorbisAlloc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ALLOC_BUFFER,
		ALLOC_BUFFER_LENGTH_IN_BYTES;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		ALLOC_BUFFER = offsets.get(0);
		ALLOC_BUFFER_LENGTH_IN_BYTES = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	STBVorbisAlloc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBVorbisAlloc} instance at the specified memory address. */
	public STBVorbisAlloc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBVorbisAlloc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBVorbisAlloc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public ByteBuffer getAllocBuffer(int byteLen) { return ngetAllocBuffer(address(), byteLen); }
	public int getAllocBufferLengthInBytes() { return ngetAllocBufferLengthInBytes(address()); }

	public STBVorbisAlloc setAllocBuffer(ByteBuffer alloc_buffer) { nsetAllocBuffer(address(), alloc_buffer); return this; }
	public STBVorbisAlloc setAllocBufferLengthInBytes(int alloc_buffer_length_in_bytes) { nsetAllocBufferLengthInBytes(address(), alloc_buffer_length_in_bytes); return this; }

	/** Initializes this struct with the specified values. */
	public STBVorbisAlloc set(
		ByteBuffer alloc_buffer,
		int alloc_buffer_length_in_bytes
	) {
		setAllocBuffer(alloc_buffer);
		setAllocBufferLengthInBytes(alloc_buffer_length_in_bytes);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public STBVorbisAlloc nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public STBVorbisAlloc set(STBVorbisAlloc src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public STBVorbisAlloc set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link STBVorbisAlloc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBVorbisAlloc malloc() {
		return new STBVorbisAlloc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBVorbisAlloc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBVorbisAlloc calloc() {
		return new STBVorbisAlloc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBVorbisAlloc} instance allocated with {@link BufferUtils}. */
	public static STBVorbisAlloc create() {
		return new STBVorbisAlloc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBVorbisAlloc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static long ngetAllocBuffer(long struct) { return memGetAddress(struct + ALLOC_BUFFER); }
	public static ByteBuffer ngetAllocBuffer(long struct, int byteLen) { return memByteBuffer(ngetAllocBuffer(struct), byteLen); }
	public static ByteBuffer getAllocBuffer(ByteBuffer struct, int byteLen) { return ngetAllocBuffer(memAddress(struct), byteLen); }
	public static int ngetAllocBufferLengthInBytes(long struct) { return memGetInt(struct + ALLOC_BUFFER_LENGTH_IN_BYTES); }
	public static int getAllocBufferLengthInBytes(ByteBuffer struct) { return ngetAllocBufferLengthInBytes(memAddress(struct)); }

	public static void nsetAllocBuffer(long struct, long alloc_buffer) { memPutAddress(struct + ALLOC_BUFFER, alloc_buffer); }
	public static void nsetAllocBuffer(long struct, ByteBuffer alloc_buffer) { nsetAllocBuffer(struct, memAddressSafe(alloc_buffer)); }
	public static void setAllocBuffer(ByteBuffer struct, ByteBuffer alloc_buffer) { nsetAllocBuffer(memAddress(struct), alloc_buffer); }
	public static void nsetAllocBufferLengthInBytes(long struct, int alloc_buffer_length_in_bytes) { memPutInt(struct + ALLOC_BUFFER_LENGTH_IN_BYTES, alloc_buffer_length_in_bytes); }
	public static void setAllocBufferLengthInBytes(ByteBuffer struct, int alloc_buffer_length_in_bytes) { nsetAllocBufferLengthInBytes(memAddress(struct), alloc_buffer_length_in_bytes); }

	// -----------------------------------

	/** An array of {@link STBVorbisAlloc} structs. */
	public static final class Buffer extends StructBuffer<STBVorbisAlloc, Buffer> {

		/**
		 * Creates a new {@link STBVorbisAlloc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBVorbisAlloc#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected STBVorbisAlloc newInstance(long address) {
			return new STBVorbisAlloc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public ByteBuffer getAllocBuffer(int byteLen) { return ngetAllocBuffer(address(), byteLen); }
		public int getAllocBufferLengthInBytes() { return ngetAllocBufferLengthInBytes(address()); }

		public STBVorbisAlloc.Buffer setAllocBuffer(ByteBuffer alloc_buffer) { nsetAllocBuffer(address(), alloc_buffer); return this; }
		public STBVorbisAlloc.Buffer setAllocBufferLengthInBytes(int alloc_buffer_length_in_bytes) { nsetAllocBufferLengthInBytes(address(), alloc_buffer_length_in_bytes); return this; }

	}

}