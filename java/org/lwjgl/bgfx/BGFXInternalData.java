/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Internal data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code caps} &ndash; renderer capabilities</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_internal_data_t {
    bgfx_caps_t * caps;
}</code></pre>
 */
public class BGFXInternalData extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		CAPS;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		CAPS = layout.offsetof(0);
	}

	BGFXInternalData(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXInternalData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXInternalData(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link BGFXCaps} view of the struct pointed to by the {@code caps} field. */
	public BGFXCaps caps() { return ncaps(address()); }

	// -----------------------------------

	/** Returns a new {@link BGFXInternalData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXInternalData create(long address) {
		return address == NULL ? null : new BGFXInternalData(address, null);
	}

	/**
	 * Create a {@link BGFXInternalData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #caps}. */
	public static BGFXCaps ncaps(long struct) { return BGFXCaps.create(memGetAddress(struct + BGFXInternalData.CAPS)); }

	// -----------------------------------

	/** An array of {@link BGFXInternalData} structs. */
	public static class Buffer extends StructBuffer<BGFXInternalData, Buffer> {

		/**
		 * Creates a new {@link BGFXInternalData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXInternalData#SIZEOF}, and its mark will be undefined.
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
		protected BGFXInternalData newInstance(long address) {
			return new BGFXInternalData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link BGFXCaps} view of the struct pointed to by the {@code caps} field. */
		public BGFXCaps caps() { return BGFXInternalData.ncaps(address()); }

	}

}