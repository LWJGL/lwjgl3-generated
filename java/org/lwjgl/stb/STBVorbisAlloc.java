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
 * <h3>stb_vorbis_alloc members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>alloc_buffer</td><td class="nw">char</td><td></td></tr>
 * <tr><td>alloc_buffer_length_in_bytes</td><td class="nw">int</td><td></td></tr>
 * </table>
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
			__member(Pointer.POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ALLOC_BUFFER = layout.offsetof(0);
		ALLOC_BUFFER_LENGTH_IN_BYTES = layout.offsetof(1);
	}

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

	/**
	 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field.
	 *
	 * @param capacity the number of elements in the returned {@link ByteBuffer}
	 */
	public ByteBuffer alloc_buffer(int capacity) { return nalloc_buffer(address(), capacity); }
	/** Returns the value of the {@code alloc_buffer_length_in_bytes} field. */
	public int alloc_buffer_length_in_bytes() { return nalloc_buffer_length_in_bytes(address()); }

	/** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
	public STBVorbisAlloc alloc_buffer(ByteBuffer value) { nalloc_buffer(address(), value); return this; }
	/** Sets the specified value to the {@code alloc_buffer_length_in_bytes} field. */
	public STBVorbisAlloc alloc_buffer_length_in_bytes(int value) { nalloc_buffer_length_in_bytes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public STBVorbisAlloc set(
		ByteBuffer alloc_buffer,
		int alloc_buffer_length_in_bytes
	) {
		alloc_buffer(alloc_buffer);
		alloc_buffer_length_in_bytes(alloc_buffer_length_in_bytes);

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

	/** {@link ByteBuffer} version of {@link #set(STBVorbisAlloc) set}. */
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

	/** Unsafe version of {@link #alloc_buffer(int) alloc_buffer}. */
	public static ByteBuffer nalloc_buffer(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + STBVorbisAlloc.ALLOC_BUFFER), capacity); }
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

		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field.
		 *
		 * @param capacity the number of elements in the returned {@link ByteBuffer}
		 */
		public ByteBuffer alloc_buffer(int capacity) { return nalloc_buffer(address(), capacity); }
		/** Returns the value of the {@code alloc_buffer_length_in_bytes} field. */
		public int alloc_buffer_length_in_bytes() { return nalloc_buffer_length_in_bytes(address()); }

		/** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
		public STBVorbisAlloc.Buffer alloc_buffer(ByteBuffer value) { nalloc_buffer(address(), value); return this; }
		/** Sets the specified value to the {@code alloc_buffer_length_in_bytes} field. */
		public STBVorbisAlloc.Buffer alloc_buffer_length_in_bytes(int value) { nalloc_buffer_length_in_bytes(address(), value); return this; }

	}

}