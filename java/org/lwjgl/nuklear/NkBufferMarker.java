/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_buffer_marker {
    int active;
    nk_size offset;
}</code></pre>
 */
public class NkBufferMarker extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ACTIVE,
		OFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ACTIVE = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
	}

	NkBufferMarker(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkBufferMarker} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkBufferMarker(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }

	// -----------------------------------

	/** Returns a new {@link NkBufferMarker} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkBufferMarker create(long address) {
		return address == NULL ? null : new NkBufferMarker(address, null);
	}

	/**
	 * Create a {@link NkBufferMarker.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkBufferMarker.ACTIVE); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetAddress(struct + NkBufferMarker.OFFSET); }

	// -----------------------------------

	/** An array of {@link NkBufferMarker} structs. */
	public static class Buffer extends StructBuffer<NkBufferMarker, Buffer> {

		/**
		 * Creates a new {@link NkBufferMarker.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkBufferMarker#SIZEOF}, and its mark will be undefined.
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
		protected NkBufferMarker newInstance(long address) {
			return new NkBufferMarker(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code active} field. */
		public int active() { return NkBufferMarker.nactive(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return NkBufferMarker.noffset(address()); }

	}

}