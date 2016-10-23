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
 * Specify a dedicated memory allocation resource.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>At least one of {@code image} and {@code buffer} <b>must</b> be {@code VK_NULL_HANDLE}</li>
 * <li>If {@code image} is not {@code VK_NULL_HANDLE}, the image <b>must</b> have been created with {@link VkDedicatedAllocationImageCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code buffer} is not {@code VK_NULL_HANDLE}, the buffer <b>must</b> have been created with {@link VkDedicatedAllocationBufferCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code image} is not {@code VK_NULL_HANDLE}, {@link VkMemoryAllocateInfo}{@code ::allocationSize} <b>must</b> equal the {@link VkMemoryRequirements}{@code ::size} of the image</li>
 * <li>If {@code buffer} is not {@code VK_NULL_HANDLE}, {@link VkMemoryAllocateInfo}{@code ::allocationSize} <b>must</b> equal the {@link VkMemoryRequirements}{@code ::size} of the buffer</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>Both of {@code buffer}, and {@code image} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code image} &ndash; {@code VK_NULL_HANDLE} or a handle of an image which this memory will be bound to.</li>
 * <li>{@code buffer} &ndash; {@code VK_NULL_HANDLE} or a handle of a buffer which this memory will be bound to.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDedicatedAllocationMemoryAllocateInfoNV {
    VkStructureType sType;
    const void * pNext;
    VkImage image;
    VkBuffer buffer;
}</code></pre>
 */
public class VkDedicatedAllocationMemoryAllocateInfoNV extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		IMAGE,
		BUFFER;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		IMAGE = layout.offsetof(2);
		BUFFER = layout.offsetof(3);
	}

	VkDedicatedAllocationMemoryAllocateInfoNV(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDedicatedAllocationMemoryAllocateInfoNV(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDedicatedAllocationMemoryAllocateInfoNV sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDedicatedAllocationMemoryAllocateInfoNV pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public VkDedicatedAllocationMemoryAllocateInfoNV image(long value) { nimage(address(), value); return this; }
	/** Sets the specified value to the {@code buffer} field. */
	public VkDedicatedAllocationMemoryAllocateInfoNV buffer(long value) { nbuffer(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDedicatedAllocationMemoryAllocateInfoNV set(
		int sType,
		long pNext,
		long image,
		long buffer
	) {
		sType(sType);
		pNext(pNext);
		image(image);
		buffer(buffer);

		return this;
	}

	/** Unsafe version of {@link #set(VkDedicatedAllocationMemoryAllocateInfoNV) set}. */
	public VkDedicatedAllocationMemoryAllocateInfoNV nset(long struct) {
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
	public VkDedicatedAllocationMemoryAllocateInfoNV set(VkDedicatedAllocationMemoryAllocateInfoNV src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDedicatedAllocationMemoryAllocateInfoNV malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDedicatedAllocationMemoryAllocateInfoNV calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated with {@link BufferUtils}. */
	public static VkDedicatedAllocationMemoryAllocateInfoNV create() {
		return new VkDedicatedAllocationMemoryAllocateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDedicatedAllocationMemoryAllocateInfoNV create(long address) {
		return address == NULL ? null : new VkDedicatedAllocationMemoryAllocateInfoNV(address, null);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDedicatedAllocationMemoryAllocateInfoNV mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDedicatedAllocationMemoryAllocateInfoNV callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDedicatedAllocationMemoryAllocateInfoNV mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDedicatedAllocationMemoryAllocateInfoNV callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDedicatedAllocationMemoryAllocateInfoNV.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationMemoryAllocateInfoNV.PNEXT); }
	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkDedicatedAllocationMemoryAllocateInfoNV.IMAGE); }
	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkDedicatedAllocationMemoryAllocateInfoNV.BUFFER); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDedicatedAllocationMemoryAllocateInfoNV.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationMemoryAllocateInfoNV.PNEXT, value); }
	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkDedicatedAllocationMemoryAllocateInfoNV.IMAGE, value); }
	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkDedicatedAllocationMemoryAllocateInfoNV.BUFFER, value); }

	// -----------------------------------

	/** An array of {@link VkDedicatedAllocationMemoryAllocateInfoNV} structs. */
	public static class Buffer extends StructBuffer<VkDedicatedAllocationMemoryAllocateInfoNV, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDedicatedAllocationMemoryAllocateInfoNV#SIZEOF}, and its mark will be undefined.
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
		protected VkDedicatedAllocationMemoryAllocateInfoNV newInstance(long address) {
			return new VkDedicatedAllocationMemoryAllocateInfoNV(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDedicatedAllocationMemoryAllocateInfoNV.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDedicatedAllocationMemoryAllocateInfoNV.npNext(address()); }
		/** Returns the value of the {@code image} field. */
		public long image() { return VkDedicatedAllocationMemoryAllocateInfoNV.nimage(address()); }
		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkDedicatedAllocationMemoryAllocateInfoNV.nbuffer(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer sType(int value) { VkDedicatedAllocationMemoryAllocateInfoNV.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer pNext(long value) { VkDedicatedAllocationMemoryAllocateInfoNV.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer image(long value) { VkDedicatedAllocationMemoryAllocateInfoNV.nimage(address(), value); return this; }
		/** Sets the specified value to the {@code buffer} field. */
		public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer buffer(long value) { VkDedicatedAllocationMemoryAllocateInfoNV.nbuffer(address(), value); return this; }

	}

}