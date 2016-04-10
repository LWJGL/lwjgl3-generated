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
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkExtent2D.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkExtent2D">Vulkan Specification</a>
 * 
 * <p>Describes a 2D extent.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; the width</li>
 * <li>{@code height} &ndash; the height</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExtent2D {
    uint32_t width;
    uint32_t height;
}</code></pre>
 */
public class VkExtent2D extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
	}

	VkExtent2D(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExtent2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExtent2D(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }

	/** Sets the specified value to the {@code width} field. */
	public VkExtent2D width(int value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public VkExtent2D height(int value) { nheight(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkExtent2D set(
		int width,
		int height
	) {
		width(width);
		height(height);

		return this;
	}

	/** Unsafe version of {@link #set(VkExtent2D) set}. */
	public VkExtent2D nset(long struct) {
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
	public VkExtent2D set(VkExtent2D src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkExtent2D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkExtent2D malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkExtent2D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkExtent2D calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkExtent2D} instance allocated with {@link BufferUtils}. */
	public static VkExtent2D create() {
		return new VkExtent2D(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkExtent2D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExtent2D create(long address) {
		return address == NULL ? null : new VkExtent2D(address, null);
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkExtent2D.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkExtent2D} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkExtent2D mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkExtent2D} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkExtent2D callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkExtent2D} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExtent2D mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExtent2D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExtent2D callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtent2D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + VkExtent2D.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + VkExtent2D.HEIGHT); }

	/** Unsafe version of {@link #width(int) width}. */
	public static void nwidth(long struct, int value) { memPutInt(struct + VkExtent2D.WIDTH, value); }
	/** Unsafe version of {@link #height(int) height}. */
	public static void nheight(long struct, int value) { memPutInt(struct + VkExtent2D.HEIGHT, value); }

	// -----------------------------------

	/** An array of {@link VkExtent2D} structs. */
	public static final class Buffer extends StructBuffer<VkExtent2D, Buffer> {

		/**
		 * Creates a new {@link VkExtent2D.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExtent2D#SIZEOF}, and its mark will be undefined.
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
		protected VkExtent2D newInstance(long address) {
			return new VkExtent2D(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public int width() { return VkExtent2D.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return VkExtent2D.nheight(address()); }

		/** Sets the specified value to the {@code width} field. */
		public VkExtent2D.Buffer width(int value) { VkExtent2D.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public VkExtent2D.Buffer height(int value) { VkExtent2D.nheight(address(), value); return this; }

	}

}