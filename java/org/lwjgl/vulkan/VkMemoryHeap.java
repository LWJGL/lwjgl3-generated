/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying a memory heap.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code size} &ndash; the total memory size in bytes in the heap.</li>
 * <li>{@code flags} &ndash; a bitmask of attribute flags for the heap. The bits specified in {@code flags} are:
 * 
 * <pre><code>typedef enum VkMemoryHeapFlagBits {
    VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001,
} VkMemoryHeapFlagBits;</code></pre>
 * 
 * <ul>
 * <li>if {@code flags} contains {@link VK10#VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT}, it means the heap corresponds to device local memory. Device local memory <b>may</b> have different performance characteristics than host local memory, and <b>may</b> support different memory property flags.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkMemoryHeap {
    VkDeviceSize size;
    VkMemoryHeapFlags flags;
}</code></pre>
 */
public class VkMemoryHeap extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SIZE = layout.offsetof(0);
		FLAGS = layout.offsetof(1);
	}

	VkMemoryHeap(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMemoryHeap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMemoryHeap(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }

	// -----------------------------------

	/** Returns a new {@link VkMemoryHeap} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryHeap create(long address) {
		return address == NULL ? null : new VkMemoryHeap(address, null);
	}

	/**
	 * Create a {@link VkMemoryHeap.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetLong(struct + VkMemoryHeap.SIZE); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkMemoryHeap.FLAGS); }

	// -----------------------------------

	/** An array of {@link VkMemoryHeap} structs. */
	public static class Buffer extends StructBuffer<VkMemoryHeap, Buffer> {

		/**
		 * Creates a new {@link VkMemoryHeap.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMemoryHeap#SIZEOF}, and its mark will be undefined.
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
		protected VkMemoryHeap newInstance(long address) {
			return new VkMemoryHeap(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code size} field. */
		public long size() { return VkMemoryHeap.nsize(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkMemoryHeap.nflags(address()); }

	}

}