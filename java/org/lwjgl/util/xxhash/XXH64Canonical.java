/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * 64-bit canonical representation.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct XXH64_canonical_t {
    unsigned char[8] digest;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>digest</td><td>the digest in canonical representation</td></tr>
 * </table>
 */
public class XXH64Canonical extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		DIGEST;

	static {
		Layout layout = __struct(
			__array(1, 8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		DIGEST = layout.offsetof(0);
	}

	XXH64Canonical(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link XXH64Canonical} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public XXH64Canonical(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the {@code digest} field. */
	public ByteBuffer digest() { return ndigest(address()); }
	/** Returns the value at the specified index of the {@code digest} field. */
	public byte digest(int index) { return ndigest(address(), index); }

	// -----------------------------------

	/** Returns a new {@link XXH64Canonical} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static XXH64Canonical malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link XXH64Canonical} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static XXH64Canonical calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link XXH64Canonical} instance allocated with {@link BufferUtils}. */
	public static XXH64Canonical create() {
		return new XXH64Canonical(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link XXH64Canonical} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static XXH64Canonical create(long address) {
		return address == NULL ? null : new XXH64Canonical(address, null);
	}

	/**
	 * Returns a new {@link XXH64Canonical.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH64Canonical.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH64Canonical.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link XXH64Canonical.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #digest}. */
	public static ByteBuffer ndigest(long struct) {
		return memByteBuffer(struct + XXH64Canonical.DIGEST, 8);
	}
	/** Unsafe version of {@link #digest(int) digest}. */
	public static byte ndigest(long struct, int index) { return memGetByte(struct + XXH64Canonical.DIGEST + index * 1); }

	// -----------------------------------

	/** An array of {@link XXH64Canonical} structs. */
	public static final class Buffer extends StructBuffer<XXH64Canonical, Buffer> {

		/**
		 * Creates a new {@link XXH64Canonical.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link XXH64Canonical#SIZEOF}, and its mark will be undefined.
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
		protected XXH64Canonical newInstance(long address) {
			return new XXH64Canonical(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the {@code digest} field. */
		public ByteBuffer digest() { return XXH64Canonical.ndigest(address()); }
		/** Returns the value at the specified index of the {@code digest} field. */
		public byte digest(int index) { return XXH64Canonical.ndigest(address(), index); }

	}

}