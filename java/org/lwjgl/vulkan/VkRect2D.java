/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkRect2D {
 *     {@link VkOffset2D VkOffset2D} offset;
 *     {@link VkExtent2D VkExtent2D} extent;
 * }</code></pre>
 */
public class VkRect2D extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		OFFSET,
		EXTENT;

	static {
		Layout layout = __struct(
			__member(VkOffset2D.SIZEOF, VkOffset2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		OFFSET = layout.offsetof(0);
		EXTENT = layout.offsetof(1);
	}

	VkRect2D(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkRect2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkRect2D(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkOffset2D} view of the {@code offset} field. */
	public VkOffset2D offset() { return noffset(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code extent} field. */
	public VkExtent2D extent() { return nextent(address()); }

	/** Copies the specified {@link VkOffset2D} to the {@code offset} field. */
	public VkRect2D offset(VkOffset2D value) { noffset(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code extent} field. */
	public VkRect2D extent(VkExtent2D value) { nextent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkRect2D set(
		VkOffset2D offset,
		VkExtent2D extent
	) {
		offset(offset);
		extent(extent);

		return this;
	}

	/** Unsafe version of {@link #set(VkRect2D) set}. */
	public VkRect2D nset(long struct) {
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
	public VkRect2D set(VkRect2D src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkRect2D) set}. */
	public VkRect2D set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkRect2D} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkRect2D malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkRect2D} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkRect2D calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkRect2D} instance allocated with {@link BufferUtils}. */
	public static VkRect2D create() {
		return new VkRect2D(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkRect2D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkRect2D create(long address) {
		return address == NULL ? null : new VkRect2D(address, null);
	}

	/**
	 * Returns a new {@link VkRect2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRect2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRect2D.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkRect2D.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #offset}. */
	public static VkOffset2D noffset(long struct) { return VkOffset2D.create(struct + VkRect2D.OFFSET); }
	/** Unsafe version of {@link #extent}. */
	public static VkExtent2D nextent(long struct) { return VkExtent2D.create(struct + VkRect2D.EXTENT); }

	/** Unsafe version of {@link #offset(VkOffset2D) offset}. */
	public static void noffset(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkRect2D.OFFSET, VkOffset2D.SIZEOF); }
	/** Unsafe version of {@link #extent(VkExtent2D) extent}. */
	public static void nextent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkRect2D.EXTENT, VkExtent2D.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkRect2D} structs. */
	public static final class Buffer extends StructBuffer<VkRect2D, Buffer> {

		/**
		 * Creates a new {@link VkRect2D.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkRect2D#SIZEOF}, and its mark will be undefined.
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
		protected VkRect2D newInstance(long address) {
			return new VkRect2D(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkOffset2D} view of the {@code offset} field. */
		public VkOffset2D offset() { return VkRect2D.noffset(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code extent} field. */
		public VkExtent2D extent() { return VkRect2D.nextent(address()); }

		/** Copies the specified {@link VkOffset2D} to the {@code offset} field. */
		public VkRect2D.Buffer offset(VkOffset2D value) { VkRect2D.noffset(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code extent} field. */
		public VkRect2D.Buffer extent(VkExtent2D value) { VkRect2D.nextent(address(), value); return this; }

	}

}