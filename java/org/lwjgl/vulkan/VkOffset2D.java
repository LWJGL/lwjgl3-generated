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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkOffset2D.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkOffset2D">Vulkan Specification</a>
 * 
 * <p>Describes a 2D offset.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the x offset</li>
 * <li>{@code y} &ndash; the y offset</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkOffset2D {
    int32_t x;
    int32_t y;
}</code></pre>
 */
public class VkOffset2D extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
	}

	VkOffset2D(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkOffset2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkOffset2D(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }

	/** Sets the specified value to the {@code x} field. */
	public VkOffset2D x(int value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public VkOffset2D y(int value) { ny(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkOffset2D set(
		int x,
		int y
	) {
		x(x);
		y(y);

		return this;
	}

	/** Unsafe version of {@link #set(VkOffset2D) set}. */
	public VkOffset2D nset(long struct) {
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
	public VkOffset2D set(VkOffset2D src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkOffset2D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkOffset2D malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkOffset2D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkOffset2D calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkOffset2D} instance allocated with {@link BufferUtils}. */
	public static VkOffset2D create() {
		return new VkOffset2D(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkOffset2D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkOffset2D create(long address) {
		return address == NULL ? null : new VkOffset2D(address, null);
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkOffset2D.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkOffset2D} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkOffset2D mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkOffset2D} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkOffset2D callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkOffset2D} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkOffset2D mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkOffset2D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkOffset2D callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkOffset2D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + VkOffset2D.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + VkOffset2D.Y); }

	/** Unsafe version of {@link #x(int) x}. */
	public static void nx(long struct, int value) { memPutInt(struct + VkOffset2D.X, value); }
	/** Unsafe version of {@link #y(int) y}. */
	public static void ny(long struct, int value) { memPutInt(struct + VkOffset2D.Y, value); }

	// -----------------------------------

	/** An array of {@link VkOffset2D} structs. */
	public static final class Buffer extends StructBuffer<VkOffset2D, Buffer> {

		/**
		 * Creates a new {@link VkOffset2D.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkOffset2D#SIZEOF}, and its mark will be undefined.
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
		protected VkOffset2D newInstance(long address) {
			return new VkOffset2D(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return VkOffset2D.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return VkOffset2D.ny(address()); }

		/** Sets the specified value to the {@code x} field. */
		public VkOffset2D.Buffer x(int value) { VkOffset2D.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public VkOffset2D.Buffer y(int value) { VkOffset2D.ny(address(), value); return this; }

	}

}