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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkBufferCopy.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkBufferCopy">Vulkan Specification</a>
 * 
 * <p>Specifies a buffer regions to copy.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code srcOffset} &ndash; the starting offset in bytes from the start of {@code srcBuffer}</li>
 * <li>{@code dstOffset} &ndash; the starting offset in bytes from the start of {@code dstBuffer}</li>
 * <li>{@code size} &ndash; the number of bytes to copy</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkBufferCopy {
    VkDeviceSize srcOffset;
    VkDeviceSize dstOffset;
    VkDeviceSize size;
}</code></pre>
 */
public class VkBufferCopy extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SRCOFFSET,
		DSTOFFSET,
		SIZE;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SRCOFFSET = layout.offsetof(0);
		DSTOFFSET = layout.offsetof(1);
		SIZE = layout.offsetof(2);
	}

	VkBufferCopy(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBufferCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBufferCopy(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code srcOffset} field. */
	public long srcOffset() { return nsrcOffset(address()); }
	/** Returns the value of the {@code dstOffset} field. */
	public long dstOffset() { return ndstOffset(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Sets the specified value to the {@code srcOffset} field. */
	public VkBufferCopy srcOffset(long value) { nsrcOffset(address(), value); return this; }
	/** Sets the specified value to the {@code dstOffset} field. */
	public VkBufferCopy dstOffset(long value) { ndstOffset(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkBufferCopy size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBufferCopy set(
		long srcOffset,
		long dstOffset,
		long size
	) {
		srcOffset(srcOffset);
		dstOffset(dstOffset);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(VkBufferCopy) set}. */
	public VkBufferCopy nset(long struct) {
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
	public VkBufferCopy set(VkBufferCopy src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkBufferCopy malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBufferCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkBufferCopy calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBufferCopy} instance allocated with {@link BufferUtils}. */
	public static VkBufferCopy create() {
		return new VkBufferCopy(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBufferCopy} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBufferCopy create(long address) {
		return address == NULL ? null : new VkBufferCopy(address, null);
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBufferCopy.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferCopy} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkBufferCopy mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkBufferCopy} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkBufferCopy callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkBufferCopy} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferCopy mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferCopy callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #srcOffset}. */
	public static long nsrcOffset(long struct) { return memGetLong(struct + VkBufferCopy.SRCOFFSET); }
	/** Unsafe version of {@link #dstOffset}. */
	public static long ndstOffset(long struct) { return memGetLong(struct + VkBufferCopy.DSTOFFSET); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkBufferCopy.SIZE); }

	/** Unsafe version of {@link #srcOffset(long) srcOffset}. */
	public static void nsrcOffset(long struct, long value) { memPutLong(struct + VkBufferCopy.SRCOFFSET, value); }
	/** Unsafe version of {@link #dstOffset(long) dstOffset}. */
	public static void ndstOffset(long struct, long value) { memPutLong(struct + VkBufferCopy.DSTOFFSET, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutLong(struct + VkBufferCopy.SIZE, value); }

	// -----------------------------------

	/** An array of {@link VkBufferCopy} structs. */
	public static final class Buffer extends StructBuffer<VkBufferCopy, Buffer> {

		/**
		 * Creates a new {@link VkBufferCopy.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBufferCopy#SIZEOF}, and its mark will be undefined.
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
		protected VkBufferCopy newInstance(long address) {
			return new VkBufferCopy(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code srcOffset} field. */
		public long srcOffset() { return VkBufferCopy.nsrcOffset(address()); }
		/** Returns the value of the {@code dstOffset} field. */
		public long dstOffset() { return VkBufferCopy.ndstOffset(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkBufferCopy.nsize(address()); }

		/** Sets the specified value to the {@code srcOffset} field. */
		public VkBufferCopy.Buffer srcOffset(long value) { VkBufferCopy.nsrcOffset(address(), value); return this; }
		/** Sets the specified value to the {@code dstOffset} field. */
		public VkBufferCopy.Buffer dstOffset(long value) { VkBufferCopy.ndstOffset(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkBufferCopy.Buffer size(long value) { VkBufferCopy.nsize(address(), value); return this; }

	}

}