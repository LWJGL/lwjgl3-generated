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
 * <pre><code>struct nk_key {
    int down;
    unsigned int clicked;
}</code></pre>
 */
public class NkKey extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DOWN,
		CLICKED;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DOWN = layout.offsetof(0);
		CLICKED = layout.offsetof(1);
	}

	NkKey(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkKey(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code down} field. */
	public int down() { return ndown(address()); }
	/** Returns the value of the {@code clicked} field. */
	public int clicked() { return nclicked(address()); }

	// -----------------------------------

	/** Returns a new {@link NkKey} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkKey create(long address) {
		return address == NULL ? null : new NkKey(address, null);
	}

	/**
	 * Create a {@link NkKey.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #down}. */
	public static int ndown(long struct) { return memGetInt(struct + NkKey.DOWN); }
	/** Unsafe version of {@link #clicked}. */
	public static int nclicked(long struct) { return memGetInt(struct + NkKey.CLICKED); }

	// -----------------------------------

	/** An array of {@link NkKey} structs. */
	public static class Buffer extends StructBuffer<NkKey, Buffer> {

		/**
		 * Creates a new {@link NkKey.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkKey#SIZEOF}, and its mark will be undefined.
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
		protected NkKey newInstance(long address) {
			return new NkKey(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code down} field. */
		public int down() { return NkKey.ndown(address()); }
		/** Returns the value of the {@code clicked} field. */
		public int clicked() { return NkKey.nclicked(address()); }

	}

}