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

/**
 * A buffer to use for allocations by {@link STBVorbis}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct stb_vorbis_alloc {
 *     char * alloc_buffer;
 *     int alloc_buffer_length_in_bytes;
 * }</code></pre>
 */
public class STBVorbisAlloc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ALLOC_BUFFER,
		ALLOC_BUFFER_LENGTH_IN_BYTES;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ALLOC_BUFFER = layout.offsetof(0);
		ALLOC_BUFFER_LENGTH_IN_BYTES = layout.offsetof(1);
	}

	STBVorbisAlloc(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBVorbisAlloc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBVorbisAlloc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field. */
	public ByteBuffer alloc_buffer() { return nalloc_buffer(address()); }
	/** Returns the value of the {@code alloc_buffer_length_in_bytes} field. */
	public int alloc_buffer_length_in_bytes() { return nalloc_buffer_length_in_bytes(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
	public STBVorbisAlloc alloc_buffer(ByteBuffer value) { nalloc_buffer(address(), value); return this; }
	/** Sets the specified value to the {@code alloc_buffer_length_in_bytes} field. */
	public STBVorbisAlloc alloc_buffer_length_in_bytes(int value) { nalloc_buffer_length_in_bytes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public STBVorbisAlloc set(
		ByteBuffer alloc_buffer
	) {
		alloc_buffer(alloc_buffer);
		alloc_buffer_length_in_bytes(alloc_buffer != null ? alloc_buffer.remaining() : 0);

		return this;
	}

	/** Unsafe version of {@link #set(STBVorbisAlloc) set}. */
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
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link STBVorbisAlloc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBVorbisAlloc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBVorbisAlloc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBVorbisAlloc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBVorbisAlloc} instance allocated with {@link BufferUtils}. */
	public static STBVorbisAlloc create() {
		return new STBVorbisAlloc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBVorbisAlloc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBVorbisAlloc create(long address) {
		return address == NULL ? null : new STBVorbisAlloc(address, null);
	}

	/**
	 * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBVorbisAlloc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #alloc_buffer() alloc_buffer}. */
	public static ByteBuffer nalloc_buffer(long struct) { return memByteBuffer(memGetAddress(struct + STBVorbisAlloc.ALLOC_BUFFER), nalloc_buffer_length_in_bytes(struct)); }
	/** Unsafe version of {@link #alloc_buffer_length_in_bytes}. */
	public static int nalloc_buffer_length_in_bytes(long struct) { return memGetInt(struct + STBVorbisAlloc.ALLOC_BUFFER_LENGTH_IN_BYTES); }

	/** Unsafe version of {@link #alloc_buffer(ByteBuffer) alloc_buffer}. */
	public static void nalloc_buffer(long struct, ByteBuffer value) { memPutAddress(struct + STBVorbisAlloc.ALLOC_BUFFER, memAddressSafe(value)); }
	/** Unsafe version of {@link #alloc_buffer_length_in_bytes(int) alloc_buffer_length_in_bytes}. */
	public static void nalloc_buffer_length_in_bytes(long struct, int value) { memPutInt(struct + STBVorbisAlloc.ALLOC_BUFFER_LENGTH_IN_BYTES, value); }

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected STBVorbisAlloc newInstance(long address) {
			return new STBVorbisAlloc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field. */
		public ByteBuffer alloc_buffer() { return STBVorbisAlloc.nalloc_buffer(address()); }
		/** Returns the value of the {@code alloc_buffer_length_in_bytes} field. */
		public int alloc_buffer_length_in_bytes() { return STBVorbisAlloc.nalloc_buffer_length_in_bytes(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
		public STBVorbisAlloc.Buffer alloc_buffer(ByteBuffer value) { STBVorbisAlloc.nalloc_buffer(address(), value); return this; }
		/** Sets the specified value to the {@code alloc_buffer_length_in_bytes} field. */
		public STBVorbisAlloc.Buffer alloc_buffer_length_in_bytes(int value) { STBVorbisAlloc.nalloc_buffer_length_in_bytes(address(), value); return this; }

	}

}