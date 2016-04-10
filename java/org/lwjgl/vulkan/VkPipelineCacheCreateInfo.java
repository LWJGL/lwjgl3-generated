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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPipelineCacheCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPipelineCacheCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a pipeline cache object should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> be a pointer to an array of {@code initialDataSize} bytes</li>
 * <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by {@link VK10#vkGetPipelineCacheData GetPipelineCacheData} when
 * {@code pInitialData} was originally retrieved</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to {@link VK10#vkGetPipelineCacheData GetPipelineCacheData}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code initialDataSize} &ndash; the number of bytes in {@code pInitialData}</li>
 * <li>{@code pInitialData} &ndash; a pointer to previously retrieved pipeline cache data</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineCacheCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineCacheCreateFlags flags;
    size_t initialDataSize;
    const void * pInitialData;
}</code></pre>
 */
public class VkPipelineCacheCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		INITIALDATASIZE,
		PINITIALDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		INITIALDATASIZE = layout.offsetof(3);
		PINITIALDATA = layout.offsetof(4);
	}

	VkPipelineCacheCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineCacheCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineCacheCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code initialDataSize} field. */
	public long initialDataSize() { return ninitialDataSize(address()); }
	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pInitialData} field. */
	public ByteBuffer pInitialData() { return npInitialData(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineCacheCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineCacheCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineCacheCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link ByteBuffer} to the {@code pInitialData} field. */
	public VkPipelineCacheCreateInfo pInitialData(ByteBuffer value) { npInitialData(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineCacheCreateInfo set(
		int sType,
		long pNext,
		int flags,
		ByteBuffer pInitialData
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pInitialData(pInitialData);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineCacheCreateInfo) set}. */
	public VkPipelineCacheCreateInfo nset(long struct) {
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
	public VkPipelineCacheCreateInfo set(VkPipelineCacheCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineCacheCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineCacheCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineCacheCreateInfo create() {
		return new VkPipelineCacheCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineCacheCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineCacheCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineCacheCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineCacheCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineCacheCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineCacheCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineCacheCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineCacheCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineCacheCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineCacheCreateInfo.FLAGS); }
	/** Unsafe version of {@link #initialDataSize}. */
	public static long ninitialDataSize(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.INITIALDATASIZE); }
	/** Unsafe version of {@link #pInitialData() pInitialData}. */
	public static ByteBuffer npInitialData(long struct) { return memByteBuffer(memGetAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA), (int)ninitialDataSize(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineCacheCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineCacheCreateInfo.FLAGS, value); }
	/** Sets the specified value to the {@code initialDataSize} field of the specified {@code struct}. */
	public static void ninitialDataSize(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.INITIALDATASIZE, value); }
	/** Unsafe version of {@link #pInitialData(ByteBuffer) pInitialData}. */
	public static void npInitialData(long struct, ByteBuffer value) { memPutAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA, memAddressSafe(value)); ninitialDataSize(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( ninitialDataSize(struct) != 0 )
			checkPointer(memGetAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA));
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

	/** An array of {@link VkPipelineCacheCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineCacheCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineCacheCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineCacheCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineCacheCreateInfo newInstance(long address) {
			return new VkPipelineCacheCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineCacheCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineCacheCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineCacheCreateInfo.nflags(address()); }
		/** Returns the value of the {@code initialDataSize} field. */
		public long initialDataSize() { return VkPipelineCacheCreateInfo.ninitialDataSize(address()); }
		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pInitialData} field. */
		public ByteBuffer pInitialData() { return VkPipelineCacheCreateInfo.npInitialData(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineCacheCreateInfo.Buffer sType(int value) { VkPipelineCacheCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineCacheCreateInfo.Buffer pNext(long value) { VkPipelineCacheCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineCacheCreateInfo.Buffer flags(int value) { VkPipelineCacheCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code pInitialData} field. */
		public VkPipelineCacheCreateInfo.Buffer pInitialData(ByteBuffer value) { VkPipelineCacheCreateInfo.npInitialData(address(), value); return this; }

	}

}