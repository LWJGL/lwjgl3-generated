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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDescriptorPoolCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDescriptorPoolCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a descriptor pool should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDescriptorPoolCreateFlagBits} values</li>
 * <li>{@code pPoolSizes} <b>must</b> be a pointer to an array of {@code poolSizeCount} valid {@link VkDescriptorPoolSize} structures</li>
 * <li>{@code poolSizeCount} <b>must</b> be greater than 0</li>
 * <li>{@code maxSets} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; specifies certain supported operations on the pool</li>
 * <li>{@code maxSets} &ndash; the maximum number of descriptor sets that <b>can</b> be allocated from the pool</li>
 * <li>{@code poolSizeCount} &ndash;  the number of elements in {@code pPoolSizes}</li>
 * <li>{@code pPoolSizes} &ndash; 
 * a pointer to an array of {@link VkDescriptorPoolSize} structures, each containing a descriptor type and number of descriptors of that type to be allocated in
 * the pool</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDescriptorPoolCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkDescriptorPoolCreateFlags flags;
    uint32_t maxSets;
    uint32_t poolSizeCount;
    const VkDescriptorPoolSize * pPoolSizes;
}</code></pre>
 */
public class VkDescriptorPoolCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		MAXSETS,
		POOLSIZECOUNT,
		PPOOLSIZES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		MAXSETS = layout.offsetof(3);
		POOLSIZECOUNT = layout.offsetof(4);
		PPOOLSIZES = layout.offsetof(5);
	}

	VkDescriptorPoolCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorPoolCreateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code maxSets} field. */
	public int maxSets() { return nmaxSets(address()); }
	/** Returns the value of the {@code poolSizeCount} field. */
	public int poolSizeCount() { return npoolSizeCount(address()); }
	/** Returns a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@code pPoolSizes} field. */
	public VkDescriptorPoolSize.Buffer pPoolSizes() { return npPoolSizes(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDescriptorPoolCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDescriptorPoolCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDescriptorPoolCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code maxSets} field. */
	public VkDescriptorPoolCreateInfo maxSets(int value) { nmaxSets(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@code pPoolSizes} field. */
	public VkDescriptorPoolCreateInfo pPoolSizes(VkDescriptorPoolSize.Buffer value) { npPoolSizes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorPoolCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int maxSets,
		VkDescriptorPoolSize.Buffer pPoolSizes
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		maxSets(maxSets);
		pPoolSizes(pPoolSizes);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorPoolCreateInfo) set}. */
	public VkDescriptorPoolCreateInfo nset(long struct) {
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
	public VkDescriptorPoolCreateInfo set(VkDescriptorPoolCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorPoolCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorPoolCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorPoolCreateInfo create() {
		return new VkDescriptorPoolCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorPoolCreateInfo create(long address) {
		return address == NULL ? null : new VkDescriptorPoolCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorPoolCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDescriptorPoolCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDescriptorPoolCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorPoolCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorPoolCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.FLAGS); }
	/** Unsafe version of {@link #maxSets}. */
	public static int nmaxSets(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.MAXSETS); }
	/** Unsafe version of {@link #poolSizeCount}. */
	public static int npoolSizeCount(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT); }
	/** Unsafe version of {@link #pPoolSizes}. */
	public static VkDescriptorPoolSize.Buffer npPoolSizes(long struct) { return VkDescriptorPoolSize.create(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES), npoolSizeCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #maxSets(int) maxSets}. */
	public static void nmaxSets(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.MAXSETS, value); }
	/** Sets the specified value to the {@code poolSizeCount} field of the specified {@code struct}. */
	public static void npoolSizeCount(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT, value); }
	/** Unsafe version of {@link #pPoolSizes(VkDescriptorPoolSize.Buffer) pPoolSizes}. */
	public static void npPoolSizes(long struct, VkDescriptorPoolSize.Buffer value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES, value.address()); npoolSizeCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkDescriptorPoolCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorPoolCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorPoolCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorPoolCreateInfo newInstance(long address) {
			return new VkDescriptorPoolCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDescriptorPoolCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDescriptorPoolCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDescriptorPoolCreateInfo.nflags(address()); }
		/** Returns the value of the {@code maxSets} field. */
		public int maxSets() { return VkDescriptorPoolCreateInfo.nmaxSets(address()); }
		/** Returns the value of the {@code poolSizeCount} field. */
		public int poolSizeCount() { return VkDescriptorPoolCreateInfo.npoolSizeCount(address()); }
		/** Returns a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@code pPoolSizes} field. */
		public VkDescriptorPoolSize.Buffer pPoolSizes() { return VkDescriptorPoolCreateInfo.npPoolSizes(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDescriptorPoolCreateInfo.Buffer sType(int value) { VkDescriptorPoolCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDescriptorPoolCreateInfo.Buffer pNext(long value) { VkDescriptorPoolCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDescriptorPoolCreateInfo.Buffer flags(int value) { VkDescriptorPoolCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code maxSets} field. */
		public VkDescriptorPoolCreateInfo.Buffer maxSets(int value) { VkDescriptorPoolCreateInfo.nmaxSets(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@code pPoolSizes} field. */
		public VkDescriptorPoolCreateInfo.Buffer pPoolSizes(VkDescriptorPoolSize.Buffer value) { VkDescriptorPoolCreateInfo.npPoolSizes(address(), value); return this; }

	}

}