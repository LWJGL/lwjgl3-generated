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
 * The earliest time each image should be presented.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> be the same value as {@link VkPresentInfoKHR}{@code ::swapchainCount}, where {@link VkPresentInfoKHR} is in the {@code pNext} chain of this {@link VkPresentTimesInfoGOOGLE} structure.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link GOOGLEDisplayTiming#VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE}</li>
 * <li>If {@code pTimes} is not {@code NULL}, {@code pTimes} <b>must</b> be a pointer to an array of {@code swapchainCount} {@link VkPresentTimeGOOGLE} structures</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPresentTimeGOOGLE}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code swapchainCount} &ndash; the number of swapchains being presented to by this command.</li>
 * <li>{@code pTimes} &ndash; {@code NULL} or a pointer to an array of {@link VkPresentTimeGOOGLE} elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pTimes} contains the earliest time to present the image corresponding to the entry in the {@link VkPresentInfoKHR}{@code ::pImageIndices} array.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPresentTimesInfoGOOGLE {
    VkStructureType sType;
    const void * pNext;
    uint32_t swapchainCount;
    const {@link VkPresentTimeGOOGLE VkPresentTimeGOOGLE} * pTimes;
}</code></pre>
 */
public class VkPresentTimesInfoGOOGLE extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SWAPCHAINCOUNT,
		PTIMES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SWAPCHAINCOUNT = layout.offsetof(2);
		PTIMES = layout.offsetof(3);
	}

	VkPresentTimesInfoGOOGLE(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPresentTimesInfoGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPresentTimesInfoGOOGLE(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code swapchainCount} field. */
	public int swapchainCount() { return nswapchainCount(address()); }
	/** Returns a {@link VkPresentTimeGOOGLE.Buffer} view of the struct array pointed to by the {@code pTimes} field. */
	public VkPresentTimeGOOGLE.Buffer pTimes() { return npTimes(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPresentTimesInfoGOOGLE sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPresentTimesInfoGOOGLE pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code swapchainCount} field. */
	public VkPresentTimesInfoGOOGLE swapchainCount(int value) { nswapchainCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkPresentTimeGOOGLE.Buffer} to the {@code pTimes} field. */
	public VkPresentTimesInfoGOOGLE pTimes(VkPresentTimeGOOGLE.Buffer value) { npTimes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPresentTimesInfoGOOGLE set(
		int sType,
		long pNext,
		int swapchainCount,
		VkPresentTimeGOOGLE.Buffer pTimes
	) {
		sType(sType);
		pNext(pNext);
		swapchainCount(swapchainCount);
		pTimes(pTimes);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPresentTimesInfoGOOGLE set(VkPresentTimesInfoGOOGLE src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPresentTimesInfoGOOGLE malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPresentTimesInfoGOOGLE calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated with {@link BufferUtils}. */
	public static VkPresentTimesInfoGOOGLE create() {
		return new VkPresentTimesInfoGOOGLE(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPresentTimesInfoGOOGLE} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPresentTimesInfoGOOGLE create(long address) {
		return address == NULL ? null : new VkPresentTimesInfoGOOGLE(address, null);
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPresentTimesInfoGOOGLE.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPresentTimesInfoGOOGLE mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPresentTimesInfoGOOGLE callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPresentTimesInfoGOOGLE mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPresentTimesInfoGOOGLE callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPresentTimesInfoGOOGLE.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPresentTimesInfoGOOGLE.PNEXT); }
	/** Unsafe version of {@link #swapchainCount}. */
	public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentTimesInfoGOOGLE.SWAPCHAINCOUNT); }
	/** Unsafe version of {@link #pTimes}. */
	public static VkPresentTimeGOOGLE.Buffer npTimes(long struct) { return VkPresentTimeGOOGLE.create(memGetAddress(struct + VkPresentTimesInfoGOOGLE.PTIMES), nswapchainCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPresentTimesInfoGOOGLE.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentTimesInfoGOOGLE.PNEXT, value); }
	/** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
	public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentTimesInfoGOOGLE.SWAPCHAINCOUNT, value); }
	/** Unsafe version of {@link #pTimes(VkPresentTimeGOOGLE.Buffer) pTimes}. */
	public static void npTimes(long struct, VkPresentTimeGOOGLE.Buffer value) { memPutAddress(struct + VkPresentTimesInfoGOOGLE.PTIMES, addressSafe(value)); if ( value != null ) nswapchainCount(struct, value.remaining()); }

	// -----------------------------------

	/** An array of {@link VkPresentTimesInfoGOOGLE} structs. */
	public static class Buffer extends StructBuffer<VkPresentTimesInfoGOOGLE, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPresentTimesInfoGOOGLE#SIZEOF}, and its mark will be undefined.
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
		protected VkPresentTimesInfoGOOGLE newInstance(long address) {
			return new VkPresentTimesInfoGOOGLE(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPresentTimesInfoGOOGLE.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPresentTimesInfoGOOGLE.npNext(address()); }
		/** Returns the value of the {@code swapchainCount} field. */
		public int swapchainCount() { return VkPresentTimesInfoGOOGLE.nswapchainCount(address()); }
		/** Returns a {@link VkPresentTimeGOOGLE.Buffer} view of the struct array pointed to by the {@code pTimes} field. */
		public VkPresentTimeGOOGLE.Buffer pTimes() { return VkPresentTimesInfoGOOGLE.npTimes(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPresentTimesInfoGOOGLE.Buffer sType(int value) { VkPresentTimesInfoGOOGLE.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPresentTimesInfoGOOGLE.Buffer pNext(long value) { VkPresentTimesInfoGOOGLE.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code swapchainCount} field. */
		public VkPresentTimesInfoGOOGLE.Buffer swapchainCount(int value) { VkPresentTimesInfoGOOGLE.nswapchainCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkPresentTimeGOOGLE.Buffer} to the {@code pTimes} field. */
		public VkPresentTimesInfoGOOGLE.Buffer pTimes(VkPresentTimeGOOGLE.Buffer value) { VkPresentTimesInfoGOOGLE.npTimes(address(), value); return this; }

	}

}