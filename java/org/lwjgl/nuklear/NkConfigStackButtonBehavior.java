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
 * <pre><code>struct nk_config_stack_button_behavior {
    int head;
    {@link NkConfigStackButtonBehaviorElement struct nk_config_stack_button_behavior_element} elements[8];
}</code></pre>
 */
class NkConfigStackButtonBehavior extends Struct {

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
			__array(NkConfigStackButtonBehaviorElement.SIZEOF, NkConfigStackButtonBehaviorElement.ALIGNOF, 8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEAD = layout.offsetof(0);
		ELEMENTS = layout.offsetof(1);
	}

	NkConfigStackButtonBehavior(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkConfigStackButtonBehavior} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	NkConfigStackButtonBehavior(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code head} field. */
	public int head() { return nhead(address()); }
	/** Returns a {@link NkConfigStackButtonBehaviorElement}.Buffer view of the {@code elements} field. */
	public NkConfigStackButtonBehaviorElement.Buffer elements() { return nelements(address()); }
	/** Returns a {@link NkConfigStackButtonBehaviorElement} view of the struct at the specified index of the {@code elements} field. */
	public NkConfigStackButtonBehaviorElement elements(int index) { return nelements(address(), index); }

	// -----------------------------------

	/** Returns a new {@link NkConfigStackButtonBehavior} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkConfigStackButtonBehavior create(long address) {
		return address == NULL ? null : new NkConfigStackButtonBehavior(address, null);
	}

	/**
	 * Create a {@link NkConfigStackButtonBehavior.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #head}. */
	public static int nhead(long struct) { return memGetInt(struct + NkConfigStackButtonBehavior.HEAD); }
	/** Unsafe version of {@link #elements}. */
	public static NkConfigStackButtonBehaviorElement.Buffer nelements(long struct) {
		return NkConfigStackButtonBehaviorElement.create(struct + NkConfigStackButtonBehavior.ELEMENTS, 8);
	}
	/** Unsafe version of {@link #elements(int) elements}. */
	public static NkConfigStackButtonBehaviorElement nelements(long struct, int index) {
		return NkConfigStackButtonBehaviorElement.create(struct + NkConfigStackButtonBehavior.ELEMENTS + index * NkConfigStackButtonBehaviorElement.SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link NkConfigStackButtonBehavior} structs. */
	public static class Buffer extends StructBuffer<NkConfigStackButtonBehavior, Buffer> {

		/**
		 * Creates a new {@link NkConfigStackButtonBehavior.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkConfigStackButtonBehavior#SIZEOF}, and its mark will be undefined.
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
		protected NkConfigStackButtonBehavior newInstance(long address) {
			return new NkConfigStackButtonBehavior(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code head} field. */
		public int head() { return NkConfigStackButtonBehavior.nhead(address()); }
		/** Returns a {@link NkConfigStackButtonBehaviorElement}.Buffer view of the {@code elements} field. */
		public NkConfigStackButtonBehaviorElement.Buffer elements() { return NkConfigStackButtonBehavior.nelements(address()); }
		/** Returns a {@link NkConfigStackButtonBehaviorElement} view of the struct at the specified index of the {@code elements} field. */
		public NkConfigStackButtonBehaviorElement elements(int index) { return NkConfigStackButtonBehavior.nelements(address(), index); }

	}

}