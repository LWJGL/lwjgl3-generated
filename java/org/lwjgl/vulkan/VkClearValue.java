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
 * <pre><code>union VkClearValue {
    {@link VkClearColorValue VkClearColorValue} color;
    {@link VkClearDepthStencilValue VkClearDepthStencilValue} depthStencil;
}</code></pre>
 */
public class VkClearValue extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		COLOR,
		DEPTHSTENCIL;

	static {
		Layout layout = __union(
			__member(VkClearColorValue.SIZEOF, VkClearColorValue.__ALIGNMENT),
			__member(VkClearDepthStencilValue.SIZEOF, VkClearDepthStencilValue.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		COLOR = layout.offsetof(0);
		DEPTHSTENCIL = layout.offsetof(1);
	}

	VkClearValue(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkClearValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkClearValue(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkClearColorValue} view of the {@code color} field. */
	public VkClearColorValue color() { return ncolor(address()); }
	/** Returns a {@link VkClearDepthStencilValue} view of the {@code depthStencil} field. */
	public VkClearDepthStencilValue depthStencil() { return ndepthStencil(address()); }

	/** Copies the specified {@link VkClearColorValue} to the {@code color} field. */
	public VkClearValue color(VkClearColorValue value) { ncolor(address(), value); return this; }
	/** Copies the specified {@link VkClearDepthStencilValue} to the {@code depthStencil} field. */
	public VkClearValue depthStencil(VkClearDepthStencilValue value) { ndepthStencil(address(), value); return this; }

	/** Unsafe version of {@link #set(VkClearValue) set}. */
	public VkClearValue nset(long struct) {
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
	public VkClearValue set(VkClearValue src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkClearValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkClearValue malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkClearValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkClearValue calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkClearValue} instance allocated with {@link BufferUtils}. */
	public static VkClearValue create() {
		return new VkClearValue(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkClearValue} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkClearValue create(long address) {
		return address == NULL ? null : new VkClearValue(address, null);
	}

	/**
	 * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkClearValue.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #color}. */
	public static VkClearColorValue ncolor(long struct) { return VkClearColorValue.create(struct + VkClearValue.COLOR); }
	/** Unsafe version of {@link #depthStencil}. */
	public static VkClearDepthStencilValue ndepthStencil(long struct) { return VkClearDepthStencilValue.create(struct + VkClearValue.DEPTHSTENCIL); }

	/** Unsafe version of {@link #color(VkClearColorValue) color}. */
	public static void ncolor(long struct, VkClearColorValue value) { memCopy(value.address(), struct + VkClearValue.COLOR, VkClearColorValue.SIZEOF); }
	/** Unsafe version of {@link #depthStencil(VkClearDepthStencilValue) depthStencil}. */
	public static void ndepthStencil(long struct, VkClearDepthStencilValue value) { memCopy(value.address(), struct + VkClearValue.DEPTHSTENCIL, VkClearDepthStencilValue.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkClearValue} structs. */
	public static final class Buffer extends StructBuffer<VkClearValue, Buffer> {

		/**
		 * Creates a new {@link VkClearValue.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkClearValue#SIZEOF}, and its mark will be undefined.
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
		protected VkClearValue newInstance(long address) {
			return new VkClearValue(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkClearColorValue} view of the {@code color} field. */
		public VkClearColorValue color() { return VkClearValue.ncolor(address()); }
		/** Returns a {@link VkClearDepthStencilValue} view of the {@code depthStencil} field. */
		public VkClearDepthStencilValue depthStencil() { return VkClearValue.ndepthStencil(address()); }

		/** Copies the specified {@link VkClearColorValue} to the {@code color} field. */
		public VkClearValue.Buffer color(VkClearColorValue value) { VkClearValue.ncolor(address(), value); return this; }
		/** Copies the specified {@link VkClearDepthStencilValue} to the {@code depthStencil} field. */
		public VkClearValue.Buffer depthStencil(VkClearDepthStencilValue value) { VkClearValue.ndepthStencil(address(), value); return this; }

	}

}