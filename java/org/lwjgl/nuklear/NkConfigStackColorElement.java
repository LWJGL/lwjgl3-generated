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
 * <pre><code>struct nk_config_stack_color_element {
    struct nk_color * pValues;
    {@link NkColor struct nk_color} old_value;
}</code></pre>
 */
class NkConfigStackColorElement extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		PVALUES,
		OLD_VALUE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		PVALUES = layout.offsetof(0);
		OLD_VALUE = layout.offsetof(1);
	}

	NkConfigStackColorElement(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkConfigStackColorElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	NkConfigStackColorElement(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkColor} view of the struct pointed to by the {@code pValues} field. */
	public NkColor pValues() { return npValues(address()); }
	/** Returns a {@link NkColor} view of the {@code old_value} field. */
	public NkColor old_value() { return nold_value(address()); }

	// -----------------------------------

	/** Returns a new {@link NkConfigStackColorElement} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkConfigStackColorElement create(long address) {
		return address == NULL ? null : new NkConfigStackColorElement(address, null);
	}

	/**
	 * Create a {@link NkConfigStackColorElement.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #pValues}. */
	public static NkColor npValues(long struct) { return NkColor.create(memGetAddress(struct + NkConfigStackColorElement.PVALUES)); }
	/** Unsafe version of {@link #old_value}. */
	public static NkColor nold_value(long struct) { return NkColor.create(struct + NkConfigStackColorElement.OLD_VALUE); }

	// -----------------------------------

	/** An array of {@link NkConfigStackColorElement} structs. */
	public static class Buffer extends StructBuffer<NkConfigStackColorElement, Buffer> {

		/**
		 * Creates a new {@link NkConfigStackColorElement.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkConfigStackColorElement#SIZEOF}, and its mark will be undefined.
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
		protected NkConfigStackColorElement newInstance(long address) {
			return new NkConfigStackColorElement(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkColor} view of the struct pointed to by the {@code pValues} field. */
		public NkColor pValues() { return NkConfigStackColorElement.npValues(address()); }
		/** Returns a {@link NkColor} view of the {@code old_value} field. */
		public NkColor old_value() { return NkConfigStackColorElement.nold_value(address()); }

	}

}