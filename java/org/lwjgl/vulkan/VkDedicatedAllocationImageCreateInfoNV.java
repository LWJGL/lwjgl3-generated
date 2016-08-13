/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDedicatedAllocationImageCreateInfoNV.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDedicatedAllocationImageCreateInfoNV">Vulkan Specification</a>
 * 
 * <p>This structure <b>may</b> be included in the {@code pNext} list of a {@link VkImageCreateInfo} structure. It includes an enable controlling whether the image will
 * have a dedicated memory allocation bound to it.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code dedicatedAllocation} is {@link VK10#VK_TRUE TRUE}, {@link VkImageCreateInfo}{@code ::flags} <b>must not</b> include {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT},
 * {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Using a dedicated allocation for color and depth/stencil attachments or other large images <b>may</b> improve performance on some devices.</p>
 * </div>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code dedicatedAllocation} &ndash; if {@link VK10#VK_TRUE TRUE}, the image will have a dedicated memory allocation bound to it</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDedicatedAllocationImageCreateInfoNV {
    VkStructureType sType;
    const void * pNext;
    VkBool32 dedicatedAllocation;
}</code></pre>
 */
public class VkDedicatedAllocationImageCreateInfoNV extends Struct implements NativeResource {

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

	VkDedicatedAllocationImageCreateInfoNV(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDedicatedAllocationImageCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDedicatedAllocationImageCreateInfoNV(ByteBuffer container) {
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
	public VkDedicatedAllocationImageCreateInfoNV sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDedicatedAllocationImageCreateInfoNV pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code dedicatedAllocation} field. */
	public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocation(boolean value) { ndedicatedAllocation(address(), value ? 1 : 0); return this; }

	/** Initializes this struct with the specified values. */
	public VkDedicatedAllocationImageCreateInfoNV set(
		int sType,
		long pNext,
		boolean dedicatedAllocation
	) {
		sType(sType);
		pNext(pNext);
		dedicatedAllocation(dedicatedAllocation);

		return this;
	}

	/** Unsafe version of {@link #set(VkDedicatedAllocationImageCreateInfoNV) set}. */
	public VkDedicatedAllocationImageCreateInfoNV nset(long struct) {
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
	public VkDedicatedAllocationImageCreateInfoNV set(VkDedicatedAllocationImageCreateInfoNV src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDedicatedAllocationImageCreateInfoNV malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDedicatedAllocationImageCreateInfoNV calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link BufferUtils}. */
	public static VkDedicatedAllocationImageCreateInfoNV create() {
		return new VkDedicatedAllocationImageCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDedicatedAllocationImageCreateInfoNV create(long address) {
		return address == NULL ? null : new VkDedicatedAllocationImageCreateInfoNV(address, null);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDedicatedAllocationImageCreateInfoNV mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDedicatedAllocationImageCreateInfoNV callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDedicatedAllocationImageCreateInfoNV mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDedicatedAllocationImageCreateInfoNV callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDedicatedAllocationImageCreateInfoNV.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationImageCreateInfoNV.PNEXT); }
	/** Unsafe version of {@link #dedicatedAllocation}. */
	public static int ndedicatedAllocation(long struct) { return memGetInt(struct + VkDedicatedAllocationImageCreateInfoNV.DEDICATEDALLOCATION); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDedicatedAllocationImageCreateInfoNV.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationImageCreateInfoNV.PNEXT, value); }
	/** Unsafe version of {@link #dedicatedAllocation(int) dedicatedAllocation}. */
	public static void ndedicatedAllocation(long struct, int value) { memPutInt(struct + VkDedicatedAllocationImageCreateInfoNV.DEDICATEDALLOCATION, value); }

	// -----------------------------------

	/** An array of {@link VkDedicatedAllocationImageCreateInfoNV} structs. */
	public static final class Buffer extends StructBuffer<VkDedicatedAllocationImageCreateInfoNV, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDedicatedAllocationImageCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
		protected VkDedicatedAllocationImageCreateInfoNV newInstance(long address) {
			return new VkDedicatedAllocationImageCreateInfoNV(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDedicatedAllocationImageCreateInfoNV.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDedicatedAllocationImageCreateInfoNV.npNext(address()); }
		/** Returns the value of the {@code dedicatedAllocation} field. */
		public boolean dedicatedAllocation() { return VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address()) != 0; }

		/** Sets the specified value to the {@code sType} field. */
		public VkDedicatedAllocationImageCreateInfoNV.Buffer sType(int value) { VkDedicatedAllocationImageCreateInfoNV.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDedicatedAllocationImageCreateInfoNV.Buffer pNext(long value) { VkDedicatedAllocationImageCreateInfoNV.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code dedicatedAllocation} field. */
		public VkDedicatedAllocationImageCreateInfoNV.Buffer dedicatedAllocation(boolean value) { VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0); return this; }

	}

}