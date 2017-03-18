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
 * Structure specifying swapchain image memory to bind to.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code swapchain} is not {@code NULL}, the {@code swapchain} and {@code imageIndex} are used to determine the memory that the image is bound to, instead of {@code memory} and {@code memoryOffset}.</p>
 * 
 * <p>Memory <b>can</b> be bound to a swapchain and use the {@code pDeviceIndices} or {@code pSFRRects} members of {@link VkBindImageMemoryInfoKHX}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>At least one of {@code swapchain} and {@link VkBindImageMemoryInfoKHX}{@code ::memory} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>{@code imageIndex} <b>must</b> be less than the number of images in {@code swapchain}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code swapchain} &ndash; {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a swapchain handle.</li>
 * <li>{@code imageIndex} &ndash; an image index within {@code swapchain}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkBindImageMemorySwapchainInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkSwapchainKHR swapchain;
    uint32_t imageIndex;
}</code></pre>
 */
public class VkBindImageMemorySwapchainInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SWAPCHAIN,
		IMAGEINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SWAPCHAIN = layout.offsetof(2);
		IMAGEINDEX = layout.offsetof(3);
	}

	VkBindImageMemorySwapchainInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBindImageMemorySwapchainInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBindImageMemorySwapchainInfoKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code swapchain} field. */
	public long swapchain() { return nswapchain(address()); }
	/** Returns the value of the {@code imageIndex} field. */
	public int imageIndex() { return nimageIndex(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBindImageMemorySwapchainInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBindImageMemorySwapchainInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code swapchain} field. */
	public VkBindImageMemorySwapchainInfoKHX swapchain(long value) { nswapchain(address(), value); return this; }
	/** Sets the specified value to the {@code imageIndex} field. */
	public VkBindImageMemorySwapchainInfoKHX imageIndex(int value) { nimageIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBindImageMemorySwapchainInfoKHX set(
		int sType,
		long pNext,
		long swapchain,
		int imageIndex
	) {
		sType(sType);
		pNext(pNext);
		swapchain(swapchain);
		imageIndex(imageIndex);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkBindImageMemorySwapchainInfoKHX set(VkBindImageMemorySwapchainInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkBindImageMemorySwapchainInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkBindImageMemorySwapchainInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkBindImageMemorySwapchainInfoKHX create() {
		return new VkBindImageMemorySwapchainInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBindImageMemorySwapchainInfoKHX create(long address) {
		return address == NULL ? null : new VkBindImageMemorySwapchainInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkBindImageMemorySwapchainInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkBindImageMemorySwapchainInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBindImageMemorySwapchainInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBindImageMemorySwapchainInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBindImageMemorySwapchainInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemorySwapchainInfoKHX.PNEXT); }
	/** Unsafe version of {@link #swapchain}. */
	public static long nswapchain(long struct) { return memGetLong(struct + VkBindImageMemorySwapchainInfoKHX.SWAPCHAIN); }
	/** Unsafe version of {@link #imageIndex}. */
	public static int nimageIndex(long struct) { return memGetInt(struct + VkBindImageMemorySwapchainInfoKHX.IMAGEINDEX); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBindImageMemorySwapchainInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemorySwapchainInfoKHX.PNEXT, value); }
	/** Unsafe version of {@link #swapchain(long) swapchain}. */
	public static void nswapchain(long struct, long value) { memPutLong(struct + VkBindImageMemorySwapchainInfoKHX.SWAPCHAIN, value); }
	/** Unsafe version of {@link #imageIndex(int) imageIndex}. */
	public static void nimageIndex(long struct, int value) { memPutInt(struct + VkBindImageMemorySwapchainInfoKHX.IMAGEINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkBindImageMemorySwapchainInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkBindImageMemorySwapchainInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkBindImageMemorySwapchainInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBindImageMemorySwapchainInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkBindImageMemorySwapchainInfoKHX newInstance(long address) {
			return new VkBindImageMemorySwapchainInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBindImageMemorySwapchainInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBindImageMemorySwapchainInfoKHX.npNext(address()); }
		/** Returns the value of the {@code swapchain} field. */
		public long swapchain() { return VkBindImageMemorySwapchainInfoKHX.nswapchain(address()); }
		/** Returns the value of the {@code imageIndex} field. */
		public int imageIndex() { return VkBindImageMemorySwapchainInfoKHX.nimageIndex(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBindImageMemorySwapchainInfoKHX.Buffer sType(int value) { VkBindImageMemorySwapchainInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBindImageMemorySwapchainInfoKHX.Buffer pNext(long value) { VkBindImageMemorySwapchainInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code swapchain} field. */
		public VkBindImageMemorySwapchainInfoKHX.Buffer swapchain(long value) { VkBindImageMemorySwapchainInfoKHX.nswapchain(address(), value); return this; }
		/** Sets the specified value to the {@code imageIndex} field. */
		public VkBindImageMemorySwapchainInfoKHX.Buffer imageIndex(int value) { VkBindImageMemorySwapchainInfoKHX.nimageIndex(address(), value); return this; }

	}

}