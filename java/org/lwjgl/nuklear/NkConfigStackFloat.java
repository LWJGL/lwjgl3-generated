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
 * <pre><code>struct nk_config_stack_float {
    int head;
    {@link NkConfigStackFloatElement struct nk_config_stack_float_element} elements[32];
}</code></pre>
 */
class NkConfigStackFloat extends Struct {

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
			__array(NkConfigStackFloatElement.SIZEOF, NkConfigStackFloatElement.ALIGNOF, 32)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEAD = layout.offsetof(0);
		ELEMENTS = layout.offsetof(1);
	}

	NkConfigStackFloat(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkConfigStackFloat} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	NkConfigStackFloat(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code head} field. */
	public int head() { return nhead(address()); }
	/** Returns a {@link NkConfigStackFloatElement}.Buffer view of the {@code elements} field. */
	public NkConfigStackFloatElement.Buffer elements() { return nelements(address()); }
	/** Returns a {@link NkConfigStackFloatElement} view of the struct at the specified index of the {@code elements} field. */
	public NkConfigStackFloatElement elements(int index) { return nelements(address(), index); }

	// -----------------------------------

	/** Returns a new {@link NkConfigStackFloat} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkConfigStackFloat create(long address) {
		return address == NULL ? null : new NkConfigStackFloat(address, null);
	}

	/**
	 * Create a {@link NkConfigStackFloat.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #head}. */
	public static int nhead(long struct) { return memGetInt(struct + NkConfigStackFloat.HEAD); }
	/** Unsafe version of {@link #elements}. */
	public static NkConfigStackFloatElement.Buffer nelements(long struct) {
		return NkConfigStackFloatElement.create(struct + NkConfigStackFloat.ELEMENTS, 32);
	}
	/** Unsafe version of {@link #elements(int) elements}. */
	public static NkConfigStackFloatElement nelements(long struct, int index) {
		return NkConfigStackFloatElement.create(struct + NkConfigStackFloat.ELEMENTS + index * NkConfigStackFloatElement.SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link NkConfigStackFloat} structs. */
	public static class Buffer extends StructBuffer<NkConfigStackFloat, Buffer> {

		/**
		 * Creates a new {@link NkConfigStackFloat.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkConfigStackFloat#SIZEOF}, and its mark will be undefined.
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
		protected NkConfigStackFloat newInstance(long address) {
			return new NkConfigStackFloat(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code head} field. */
		public int head() { return NkConfigStackFloat.nhead(address()); }
		/** Returns a {@link NkConfigStackFloatElement}.Buffer view of the {@code elements} field. */
		public NkConfigStackFloatElement.Buffer elements() { return NkConfigStackFloat.nelements(address()); }
		/** Returns a {@link NkConfigStackFloatElement} view of the struct at the specified index of the {@code elements} field. */
		public NkConfigStackFloatElement elements(int index) { return NkConfigStackFloat.nelements(address(), index); }

	}

}