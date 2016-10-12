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
 * <pre><code>struct nk_config_stack_color {
    int head;
    {@link NkConfigStackColorElement struct nk_config_stack_color_element} elements[32];
}</code></pre>
 */
class NkConfigStackColor extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HEAD,
		ELEMENTS;

	static {
		Layout layout = __struct(
			__member(4),
			__array(NkConfigStackColorElement.SIZEOF, NkConfigStackColorElement.ALIGNOF, 32)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEAD = layout.offsetof(0);
		ELEMENTS = layout.offsetof(1);
	}

	NkConfigStackColor(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkConfigStackColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	NkConfigStackColor(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code head} field. */
	public int head() { return nhead(address()); }
	/** Returns a {@link NkConfigStackColorElement}.Buffer view of the {@code elements} field. */
	public NkConfigStackColorElement.Buffer elements() { return nelements(address()); }
	/** Returns a {@link NkConfigStackColorElement} view of the struct at the specified index of the {@code elements} field. */
	public NkConfigStackColorElement elements(int index) { return nelements(address(), index); }

	// -----------------------------------

	/** Returns a new {@link NkConfigStackColor} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkConfigStackColor create(long address) {
		return address == NULL ? null : new NkConfigStackColor(address, null);
	}

	/**
	 * Create a {@link NkConfigStackColor.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #head}. */
	public static int nhead(long struct) { return memGetInt(struct + NkConfigStackColor.HEAD); }
	/** Unsafe version of {@link #elements}. */
	public static NkConfigStackColorElement.Buffer nelements(long struct) {
		return NkConfigStackColorElement.create(struct + NkConfigStackColor.ELEMENTS, 32);
	}
	/** Unsafe version of {@link #elements(int) elements}. */
	public static NkConfigStackColorElement nelements(long struct, int index) {
		return NkConfigStackColorElement.create(struct + NkConfigStackColor.ELEMENTS + index * NkConfigStackColorElement.SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link NkConfigStackColor} structs. */
	public static class Buffer extends StructBuffer<NkConfigStackColor, Buffer> {

		/**
		 * Creates a new {@link NkConfigStackColor.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkConfigStackColor#SIZEOF}, and its mark will be undefined.
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
		protected NkConfigStackColor newInstance(long address) {
			return new NkConfigStackColor(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code head} field. */
		public int head() { return NkConfigStackColor.nhead(address()); }
		/** Returns a {@link NkConfigStackColorElement}.Buffer view of the {@code elements} field. */
		public NkConfigStackColorElement.Buffer elements() { return NkConfigStackColor.nelements(address()); }
		/** Returns a {@link NkConfigStackColorElement} view of the struct at the specified index of the {@code elements} field. */
		public NkConfigStackColorElement elements(int index) { return NkConfigStackColor.nelements(address(), index); }

	}

}