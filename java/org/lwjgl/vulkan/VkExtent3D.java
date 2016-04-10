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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkExtent3D.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkExtent3D">Vulkan Specification</a>
 * 
 * <p>Describes the size of a rectangular region of pixels within a three-dimensional image or framebuffer.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; the region width</li>
 * <li>{@code height} &ndash; the region height</li>
 * <li>{@code depth} &ndash; the region depth</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExtent3D {
    uint32_t width;
    uint32_t height;
    uint32_t depth;
}</code></pre>
 */
public class VkExtent3D extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		DEPTH;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
		DEPTH = layout.offsetof(2);
	}

	VkExtent3D(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExtent3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExtent3D(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }
	/** Returns the value of the {@code depth} field. */
	public int depth() { return ndepth(address()); }

	/** Sets the specified value to the {@code width} field. */
	public VkExtent3D width(int value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public VkExtent3D height(int value) { nheight(address(), value); return this; }
	/** Sets the specified value to the {@code depth} field. */
	public VkExtent3D depth(int value) { ndepth(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkExtent3D set(
		int width,
		int height,
		int depth
	) {
		width(width);
		height(height);
		depth(depth);

		return this;
	}

	/** Unsafe version of {@link #set(VkExtent3D) set}. */
	public VkExtent3D nset(long struct) {
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
	public VkExtent3D set(VkExtent3D src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkExtent3D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkExtent3D malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkExtent3D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkExtent3D calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkExtent3D} instance allocated with {@link BufferUtils}. */
	public static VkExtent3D create() {
		return new VkExtent3D(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkExtent3D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExtent3D create(long address) {
		return address == NULL ? null : new VkExtent3D(address, null);
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkExtent3D.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkExtent3D} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkExtent3D mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkExtent3D} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkExtent3D callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkExtent3D} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExtent3D mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExtent3D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExtent3D callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExtent3D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + VkExtent3D.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + VkExtent3D.HEIGHT); }
	/** Unsafe version of {@link #depth}. */
	public static int ndepth(long struct) { return memGetInt(struct + VkExtent3D.DEPTH); }

	/** Unsafe version of {@link #width(int) width}. */
	public static void nwidth(long struct, int value) { memPutInt(struct + VkExtent3D.WIDTH, value); }
	/** Unsafe version of {@link #height(int) height}. */
	public static void nheight(long struct, int value) { memPutInt(struct + VkExtent3D.HEIGHT, value); }
	/** Unsafe version of {@link #depth(int) depth}. */
	public static void ndepth(long struct, int value) { memPutInt(struct + VkExtent3D.DEPTH, value); }

	// -----------------------------------

	/** An array of {@link VkExtent3D} structs. */
	public static final class Buffer extends StructBuffer<VkExtent3D, Buffer> {

		/**
		 * Creates a new {@link VkExtent3D.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExtent3D#SIZEOF}, and its mark will be undefined.
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
		protected VkExtent3D newInstance(long address) {
			return new VkExtent3D(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public int width() { return VkExtent3D.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return VkExtent3D.nheight(address()); }
		/** Returns the value of the {@code depth} field. */
		public int depth() { return VkExtent3D.ndepth(address()); }

		/** Sets the specified value to the {@code width} field. */
		public VkExtent3D.Buffer width(int value) { VkExtent3D.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public VkExtent3D.Buffer height(int value) { VkExtent3D.nheight(address(), value); return this; }
		/** Sets the specified value to the {@code depth} field. */
		public VkExtent3D.Buffer depth(int value) { VkExtent3D.ndepth(address(), value); return this; }

	}

}