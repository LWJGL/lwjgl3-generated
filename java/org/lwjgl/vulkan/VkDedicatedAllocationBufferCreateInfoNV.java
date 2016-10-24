/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specify that a buffer is bound to a dedicated memory resource.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code dedicatedAllocation} is {@link VK10#VK_TRUE TRUE}, {@link VkBufferCreateInfo}{@code ::flags} <b>must</b> not include {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code dedicatedAllocation} &ndash; indicates whether the buffer will have a dedicated allocation bound to it.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDedicatedAllocationBufferCreateInfoNV {
    VkStructureType sType;
    const void * pNext;
    VkBool32 dedicatedAllocation;
}</code></pre>
 */
public class VkDedicatedAllocationBufferCreateInfoNV extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		DEDICATEDALLOCATION;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		DEDICATEDALLOCATION = layout.offsetof(2);
	}

	VkDedicatedAllocationBufferCreateInfoNV(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDedicatedAllocationBufferCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDedicatedAllocationBufferCreateInfoNV(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code dedicatedAllocation} field. */
	public boolean dedicatedAllocation() { return ndedicatedAllocation(address()) != 0; }

	/** Sets the specified value to the {@code sType} field. */
	public VkDedicatedAllocationBufferCreateInfoNV sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDedicatedAllocationBufferCreateInfoNV pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code dedicatedAllocation} field. */
	public VkDedicatedAllocationBufferCreateInfoNV dedicatedAllocation(boolean value) { ndedicatedAllocation(address(), value ? 1 : 0); return this; }

	/** Initializes this struct with the specified values. */
	public VkDedicatedAllocationBufferCreateInfoNV set(
		int sType,
		long pNext,
		boolean dedicatedAllocation
	) {
		sType(sType);
		pNext(pNext);
		dedicatedAllocation(dedicatedAllocation);

		return this;
	}

	/** Unsafe version of {@link #set(VkDedicatedAllocationBufferCreateInfoNV) set}. */
	public VkDedicatedAllocationBufferCreateInfoNV nset(long struct) {
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
	public VkDedicatedAllocationBufferCreateInfoNV set(VkDedicatedAllocationBufferCreateInfoNV src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDedicatedAllocationBufferCreateInfoNV malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDedicatedAllocationBufferCreateInfoNV calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated with {@link BufferUtils}. */
	public static VkDedicatedAllocationBufferCreateInfoNV create() {
		return new VkDedicatedAllocationBufferCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDedicatedAllocationBufferCreateInfoNV create(long address) {
		return address == NULL ? null : new VkDedicatedAllocationBufferCreateInfoNV(address, null);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDedicatedAllocationBufferCreateInfoNV mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDedicatedAllocationBufferCreateInfoNV callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDedicatedAllocationBufferCreateInfoNV mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDedicatedAllocationBufferCreateInfoNV callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDedicatedAllocationBufferCreateInfoNV.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationBufferCreateInfoNV.PNEXT); }
	/** Unsafe version of {@link #dedicatedAllocation}. */
	public static int ndedicatedAllocation(long struct) { return memGetInt(struct + VkDedicatedAllocationBufferCreateInfoNV.DEDICATEDALLOCATION); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDedicatedAllocationBufferCreateInfoNV.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationBufferCreateInfoNV.PNEXT, value); }
	/** Unsafe version of {@link #dedicatedAllocation(boolean) dedicatedAllocation}. */
	public static void ndedicatedAllocation(long struct, int value) { memPutInt(struct + VkDedicatedAllocationBufferCreateInfoNV.DEDICATEDALLOCATION, value); }

	// -----------------------------------

	/** An array of {@link VkDedicatedAllocationBufferCreateInfoNV} structs. */
	public static class Buffer extends StructBuffer<VkDedicatedAllocationBufferCreateInfoNV, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDedicatedAllocationBufferCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
		protected VkDedicatedAllocationBufferCreateInfoNV newInstance(long address) {
			return new VkDedicatedAllocationBufferCreateInfoNV(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDedicatedAllocationBufferCreateInfoNV.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDedicatedAllocationBufferCreateInfoNV.npNext(address()); }
		/** Returns the value of the {@code dedicatedAllocation} field. */
		public boolean dedicatedAllocation() { return VkDedicatedAllocationBufferCreateInfoNV.ndedicatedAllocation(address()) != 0; }

		/** Sets the specified value to the {@code sType} field. */
		public VkDedicatedAllocationBufferCreateInfoNV.Buffer sType(int value) { VkDedicatedAllocationBufferCreateInfoNV.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDedicatedAllocationBufferCreateInfoNV.Buffer pNext(long value) { VkDedicatedAllocationBufferCreateInfoNV.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code dedicatedAllocation} field. */
		public VkDedicatedAllocationBufferCreateInfoNV.Buffer dedicatedAllocation(boolean value) { VkDedicatedAllocationBufferCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0); return this; }

	}

}