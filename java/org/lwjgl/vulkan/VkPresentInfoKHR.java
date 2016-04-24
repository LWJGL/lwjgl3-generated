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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPresentInfoKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPresentInfoKHR">Vulkan Specification</a>
 * 
 * <p>Specifies the parameters of an image presentation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code waitSemaphoreCount} is not 0, and {@code pWaitSemaphores} is not {@code NULL}, {@code pWaitSemaphores} <b>must</b> be a pointer to an array of
 * {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
 * <li>{@code pImageIndices} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
 * <li>If {@code pResults} is not {@code NULL}, {@code pResults} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code VkResult} values</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * <li>Each of the elements of {@code pSwapchains} and the elements of {@code pWaitSemaphores} that are valid handles <b>must</b> have been created, allocated
 * or retrieved from the same {@code VkInstance}</li>
 * <li>Any given element of {@code pImageIndices} <b>must</b> be the index of a presentable image acquired from the swapchain specified by the corresponding
 * element of the {@code pSwapchains} array</li>
 * <li>Any given element of {@code VkSemaphore} in {@code pWaitSemaphores} <b>must</b> refer to a prior signal of that {@code VkSemaphore} that won't be
 * consumed by any other wait on that semaphore</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link KHRSwapchain#VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code waitSemaphoreCount} &ndash; the number of semaphores to wait for before issuing the present request. The number may be zero.</li>
 * <li>{@code pWaitSemaphores} &ndash; 
 * if non-{@code NULL}, is an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before
 * issuing the present request</li>
 * <li>{@code swapchainCount} &ndash; the number of swapchains being presented to by this command</li>
 * <li>{@code pSwapchains} &ndash; an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain must not appear in this list more than once.</li>
 * <li>{@code pImageIndices} &ndash; 
 * an array of indices into the array of each swapchain’s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the
 * image to present on the corresponding entry in the {@code pSwapchains} array.</li>
 * <li>{@code pResults} &ndash; 
 * an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that don’t need per-swapchain results can use {@code NULL} for
 * {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the
 * same index in {@code pSwapchains}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPresentInfoKHR {
    VkStructureType sType;
    const void * pNext;
    uint32_t waitSemaphoreCount;
    const VkSemaphore * pWaitSemaphores;
    uint32_t swapchainCount;
    const VkSwapchainKHR * pSwapchains;
    const uint32_t * pImageIndices;
    VkResult * pResults;
}</code></pre>
 */
public class VkPresentInfoKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		WAITSEMAPHORECOUNT,
		PWAITSEMAPHORES,
		SWAPCHAINCOUNT,
		PSWAPCHAINS,
		PIMAGEINDICES,
		PRESULTS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		WAITSEMAPHORECOUNT = layout.offsetof(2);
		PWAITSEMAPHORES = layout.offsetof(3);
		SWAPCHAINCOUNT = layout.offsetof(4);
		PSWAPCHAINS = layout.offsetof(5);
		PIMAGEINDICES = layout.offsetof(6);
		PRESULTS = layout.offsetof(7);
	}

	VkPresentInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPresentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPresentInfoKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code waitSemaphoreCount} field. */
	public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
	public LongBuffer pWaitSemaphores() { return npWaitSemaphores(address()); }
	/** Returns the value of the {@code swapchainCount} field. */
	public int swapchainCount() { return nswapchainCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSwapchains} field. */
	public LongBuffer pSwapchains() { return npSwapchains(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
	public IntBuffer pImageIndices() { return npImageIndices(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pResults} field. */
	public IntBuffer pResults() { return npResults(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPresentInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPresentInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
	public VkPresentInfoKHR pWaitSemaphores(LongBuffer value) { npWaitSemaphores(address(), value); return this; }
	/** Sets the specified value to the {@code swapchainCount} field. */
	public VkPresentInfoKHR swapchainCount(int value) { nswapchainCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pSwapchains} field. */
	public VkPresentInfoKHR pSwapchains(LongBuffer value) { npSwapchains(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
	public VkPresentInfoKHR pImageIndices(IntBuffer value) { npImageIndices(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pResults} field. */
	public VkPresentInfoKHR pResults(IntBuffer value) { npResults(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPresentInfoKHR set(
		int sType,
		long pNext,
		LongBuffer pWaitSemaphores,
		int swapchainCount,
		LongBuffer pSwapchains,
		IntBuffer pImageIndices,
		IntBuffer pResults
	) {
		sType(sType);
		pNext(pNext);
		pWaitSemaphores(pWaitSemaphores);
		swapchainCount(swapchainCount);
		pSwapchains(pSwapchains);
		pImageIndices(pImageIndices);
		pResults(pResults);

		return this;
	}

	/** Unsafe version of {@link #set(VkPresentInfoKHR) set}. */
	public VkPresentInfoKHR nset(long struct) {
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
	public VkPresentInfoKHR set(VkPresentInfoKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPresentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPresentInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPresentInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPresentInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkPresentInfoKHR create() {
		return new VkPresentInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPresentInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPresentInfoKHR create(long address) {
		return address == NULL ? null : new VkPresentInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPresentInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPresentInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPresentInfoKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPresentInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPresentInfoKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPresentInfoKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPresentInfoKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPresentInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPresentInfoKHR.PNEXT); }
	/** Unsafe version of {@link #waitSemaphoreCount}. */
	public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkPresentInfoKHR.WAITSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
	public static LongBuffer npWaitSemaphores(long struct) { return memLongBuffer(memGetAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
	/** Unsafe version of {@link #swapchainCount}. */
	public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentInfoKHR.SWAPCHAINCOUNT); }
	/** Unsafe version of {@link #pSwapchains() pSwapchains}. */
	public static LongBuffer npSwapchains(long struct) { return memLongBuffer(memGetAddress(struct + VkPresentInfoKHR.PSWAPCHAINS), nswapchainCount(struct)); }
	/** Unsafe version of {@link #pImageIndices() pImageIndices}. */
	public static IntBuffer npImageIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkPresentInfoKHR.PIMAGEINDICES), nswapchainCount(struct)); }
	/** Unsafe version of {@link #pResults() pResults}. */
	public static IntBuffer npResults(long struct) { return memIntBuffer(memGetAddress(struct + VkPresentInfoKHR.PRESULTS), nswapchainCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPresentInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentInfoKHR.PNEXT, value); }
	/** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
	public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkPresentInfoKHR.WAITSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
	public static void npWaitSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
	public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentInfoKHR.SWAPCHAINCOUNT, value); }
	/** Unsafe version of {@link #pSwapchains(LongBuffer) pSwapchains}. */
	public static void npSwapchains(long struct, LongBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PSWAPCHAINS, memAddress(value)); }
	/** Unsafe version of {@link #pImageIndices(IntBuffer) pImageIndices}. */
	public static void npImageIndices(long struct, IntBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PIMAGEINDICES, memAddress(value)); }
	/** Unsafe version of {@link #pResults(IntBuffer) pResults}. */
	public static void npResults(long struct, IntBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PRESULTS, memAddressSafe(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nwaitSemaphoreCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES));
		checkPointer(memGetAddress(struct + VkPresentInfoKHR.PSWAPCHAINS));
		checkPointer(memGetAddress(struct + VkPresentInfoKHR.PIMAGEINDICES));
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

	/** An array of {@link VkPresentInfoKHR} structs. */
	public static final class Buffer extends StructBuffer<VkPresentInfoKHR, Buffer> {

		/**
		 * Creates a new {@link VkPresentInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPresentInfoKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkPresentInfoKHR newInstance(long address) {
			return new VkPresentInfoKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPresentInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPresentInfoKHR.npNext(address()); }
		/** Returns the value of the {@code waitSemaphoreCount} field. */
		public int waitSemaphoreCount() { return VkPresentInfoKHR.nwaitSemaphoreCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
		public LongBuffer pWaitSemaphores() { return VkPresentInfoKHR.npWaitSemaphores(address()); }
		/** Returns the value of the {@code swapchainCount} field. */
		public int swapchainCount() { return VkPresentInfoKHR.nswapchainCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSwapchains} field. */
		public LongBuffer pSwapchains() { return VkPresentInfoKHR.npSwapchains(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
		public IntBuffer pImageIndices() { return VkPresentInfoKHR.npImageIndices(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pResults} field. */
		public IntBuffer pResults() { return VkPresentInfoKHR.npResults(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPresentInfoKHR.Buffer sType(int value) { VkPresentInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPresentInfoKHR.Buffer pNext(long value) { VkPresentInfoKHR.npNext(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
		public VkPresentInfoKHR.Buffer pWaitSemaphores(LongBuffer value) { VkPresentInfoKHR.npWaitSemaphores(address(), value); return this; }
		/** Sets the specified value to the {@code swapchainCount} field. */
		public VkPresentInfoKHR.Buffer swapchainCount(int value) { VkPresentInfoKHR.nswapchainCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pSwapchains} field. */
		public VkPresentInfoKHR.Buffer pSwapchains(LongBuffer value) { VkPresentInfoKHR.npSwapchains(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
		public VkPresentInfoKHR.Buffer pImageIndices(IntBuffer value) { VkPresentInfoKHR.npImageIndices(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pResults} field. */
		public VkPresentInfoKHR.Buffer pResults(IntBuffer value) { VkPresentInfoKHR.npResults(address(), value); return this; }

	}

}