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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDeviceQueueCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDeviceQueueCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how to create a device queue.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pQueuePriorities} <b>must</b> be a pointer to an array of {@code queueCount} {@code float} values</li>
 * <li>{@code queueCount} <b>must</b> be greater than 0</li>
 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}</li>
 * <li>{@code queueCount} <b>must</b> be less than or equal to the {@code queueCount} member of the {@link VkQueueFamilyProperties} structure, as returned by
 * {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} in the {@code pQueueFamilyProperties}[{@code queueFamilyIndex}]</li>
 * <li>Each element of {@code pQueuePriorities} <b>must</b> be between {@code 0.0} and {@code 1.0} inclusive</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code queueFamilyIndex} &ndash; an unsigned integer indicating the index of the queue family to create on this device</li>
 * <li>{@code queueCount} &ndash; an unsigned integer specifying the number of queues to create in the queue family indicated by {@code queueFamilyIndex}</li>
 * <li>{@code pQueuePriorities} &ndash; an array of {@code queueCount} normalized floating point values, specifying priorities of work that will be submitted to each created queue</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDeviceQueueCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkDeviceQueueCreateFlags flags;
    uint32_t queueFamilyIndex;
    uint32_t queueCount;
    const float * pQueuePriorities;
}</code></pre>
 */
public class VkDeviceQueueCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		QUEUEFAMILYINDEX,
		QUEUECOUNT,
		PQUEUEPRIORITIES;

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
		QUEUEFAMILYINDEX = layout.offsetof(3);
		QUEUECOUNT = layout.offsetof(4);
		PQUEUEPRIORITIES = layout.offsetof(5);
	}

	VkDeviceQueueCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDeviceQueueCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDeviceQueueCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code queueFamilyIndex} field. */
	public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
	/** Returns the value of the {@code queueCount} field. */
	public int queueCount() { return nqueueCount(address()); }
	/** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pQueuePriorities} field. */
	public FloatBuffer pQueuePriorities() { return npQueuePriorities(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDeviceQueueCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDeviceQueueCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDeviceQueueCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code queueFamilyIndex} field. */
	public VkDeviceQueueCreateInfo queueFamilyIndex(int value) { nqueueFamilyIndex(address(), value); return this; }
	/** Sets the address of the specified {@link FloatBuffer} to the {@code pQueuePriorities} field. */
	public VkDeviceQueueCreateInfo pQueuePriorities(FloatBuffer value) { npQueuePriorities(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDeviceQueueCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int queueFamilyIndex,
		FloatBuffer pQueuePriorities
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		queueFamilyIndex(queueFamilyIndex);
		pQueuePriorities(pQueuePriorities);

		return this;
	}

	/** Unsafe version of {@link #set(VkDeviceQueueCreateInfo) set}. */
	public VkDeviceQueueCreateInfo nset(long struct) {
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
	public VkDeviceQueueCreateInfo set(VkDeviceQueueCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDeviceQueueCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDeviceQueueCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDeviceQueueCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDeviceQueueCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDeviceQueueCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDeviceQueueCreateInfo create() {
		return new VkDeviceQueueCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDeviceQueueCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDeviceQueueCreateInfo create(long address) {
		return address == NULL ? null : new VkDeviceQueueCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDeviceQueueCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDeviceQueueCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDeviceQueueCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDeviceQueueCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDeviceQueueCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDeviceQueueCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDeviceQueueCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.FLAGS); }
	/** Unsafe version of {@link #queueFamilyIndex}. */
	public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #queueCount}. */
	public static int nqueueCount(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.QUEUECOUNT); }
	/** Unsafe version of {@link #pQueuePriorities() pQueuePriorities}. */
	public static FloatBuffer npQueuePriorities(long struct) { return memFloatBuffer(memGetAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES), nqueueCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
	public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX, value); }
	/** Sets the specified value to the {@code queueCount} field of the specified {@code struct}. */
	public static void nqueueCount(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.QUEUECOUNT, value); }
	/** Unsafe version of {@link #pQueuePriorities(FloatBuffer) pQueuePriorities}. */
	public static void npQueuePriorities(long struct, FloatBuffer value) { memPutAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES, memAddress(value)); nqueueCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES));
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

	/** An array of {@link VkDeviceQueueCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDeviceQueueCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDeviceQueueCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDeviceQueueCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDeviceQueueCreateInfo newInstance(long address) {
			return new VkDeviceQueueCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDeviceQueueCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDeviceQueueCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDeviceQueueCreateInfo.nflags(address()); }
		/** Returns the value of the {@code queueFamilyIndex} field. */
		public int queueFamilyIndex() { return VkDeviceQueueCreateInfo.nqueueFamilyIndex(address()); }
		/** Returns the value of the {@code queueCount} field. */
		public int queueCount() { return VkDeviceQueueCreateInfo.nqueueCount(address()); }
		/** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pQueuePriorities} field. */
		public FloatBuffer pQueuePriorities() { return VkDeviceQueueCreateInfo.npQueuePriorities(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDeviceQueueCreateInfo.Buffer sType(int value) { VkDeviceQueueCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDeviceQueueCreateInfo.Buffer pNext(long value) { VkDeviceQueueCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDeviceQueueCreateInfo.Buffer flags(int value) { VkDeviceQueueCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code queueFamilyIndex} field. */
		public VkDeviceQueueCreateInfo.Buffer queueFamilyIndex(int value) { VkDeviceQueueCreateInfo.nqueueFamilyIndex(address(), value); return this; }
		/** Sets the address of the specified {@link FloatBuffer} to the {@code pQueuePriorities} field. */
		public VkDeviceQueueCreateInfo.Buffer pQueuePriorities(FloatBuffer value) { VkDeviceQueueCreateInfo.npQueuePriorities(address(), value); return this; }

	}

}