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
 * Structure specifying a queue submit operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The order that command buffers appear in {@code pCommandBuffers} is used to determine <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-submission-order"> submission order</a>, and thus all the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-implicit"> implicit ordering guarantees</a> that respect it. Other than these implicit ordering guarantees and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> explicit synchronization primitives</a>, these command buffers <b>may</b> overlap or otherwise execute out of order.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Any given element of {@code pCommandBuffers} <b>must</b> not have been allocated with {@link VK10#VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, any given element of {@code pWaitDstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, any given element of {@code pWaitDstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>Any given element of {@code pWaitDstStageMask} <b>must</b> not include {@link VK10#VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SUBMIT_INFO STRUCTURE_TYPE_SUBMIT_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}, or a pointer to a valid instance of {@link VkWin32KeyedMutexAcquireReleaseInfoNV}, {@link VkWin32KeyedMutexAcquireReleaseInfoKHX}, {@link VkD3D12FenceSubmitInfoKHX}, or {@link VkDeviceGroupSubmitInfoKHX}</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitDstStageMask} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid combinations of {@code VkPipelineStageFlagBits} values</li>
 * <li>Each element of {@code pWaitDstStageMask} <b>must</b> not be 0</li>
 * <li>If {@code commandBufferCount} is not 0, {@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
 * <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} <b>must</b> be a pointer to an array of {@code signalSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>Each of the elements of {@code pCommandBuffers}, the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkQueueSubmit QueueSubmit}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code waitSemaphoreCount} &ndash; the number of semaphores upon which to wait before executing the command buffers for the batch.</li>
 * <li>{@code pWaitSemaphores} &ndash; a pointer to an array of semaphores upon which to wait before the command buffers for this batch begin execution. If semaphores to wait on are provided, they define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-waiting">semaphore wait operation</a>.</li>
 * <li>{@code pWaitDstStageMask} &ndash; a pointer to an array of pipeline stages at which each corresponding semaphore wait will occur.</li>
 * <li>{@code commandBufferCount} &ndash; the number of command buffers to execute in the batch.</li>
 * <li>{@code pCommandBuffers} &ndash; a pointer to an array of command buffers to execute in the batch.</li>
 * <li>{@code signalSemaphoreCount} &ndash; the number of semaphores to be signaled once the commands specified in {@code pCommandBuffers} have completed execution.</li>
 * <li>{@code pSignalSemaphores} &ndash; a pointer to an array of semaphores which will be signaled when the command buffers for this batch have completed execution. If semaphores to be signaled are provided, they define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSubmitInfo {
    VkStructureType sType;
    const void * pNext;
    uint32_t waitSemaphoreCount;
    const VkSemaphore * pWaitSemaphores;
    const VkPipelineStageFlags * pWaitDstStageMask;
    uint32_t commandBufferCount;
    const VkCommandBuffer * pCommandBuffers;
    uint32_t signalSemaphoreCount;
    const VkSemaphore * pSignalSemaphores;
}</code></pre>
 */
public class VkSubmitInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		WAITSEMAPHORECOUNT,
		PWAITSEMAPHORES,
		PWAITDSTSTAGEMASK,
		COMMANDBUFFERCOUNT,
		PCOMMANDBUFFERS,
		SIGNALSEMAPHORECOUNT,
		PSIGNALSEMAPHORES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		WAITSEMAPHORECOUNT = layout.offsetof(2);
		PWAITSEMAPHORES = layout.offsetof(3);
		PWAITDSTSTAGEMASK = layout.offsetof(4);
		COMMANDBUFFERCOUNT = layout.offsetof(5);
		PCOMMANDBUFFERS = layout.offsetof(6);
		SIGNALSEMAPHORECOUNT = layout.offsetof(7);
		PSIGNALSEMAPHORES = layout.offsetof(8);
	}

	VkSubmitInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSubmitInfo(ByteBuffer container) {
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
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pWaitDstStageMask} field. */
	public IntBuffer pWaitDstStageMask() { return npWaitDstStageMask(address()); }
	/** Returns the value of the {@code commandBufferCount} field. */
	public int commandBufferCount() { return ncommandBufferCount(address()); }
	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code pCommandBuffers} field. */
	public PointerBuffer pCommandBuffers() { return npCommandBuffers(address()); }
	/** Returns the value of the {@code signalSemaphoreCount} field. */
	public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
	public LongBuffer pSignalSemaphores() { return npSignalSemaphores(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkSubmitInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkSubmitInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code waitSemaphoreCount} field. */
	public VkSubmitInfo waitSemaphoreCount(int value) { nwaitSemaphoreCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
	public VkSubmitInfo pWaitSemaphores(LongBuffer value) { npWaitSemaphores(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pWaitDstStageMask} field. */
	public VkSubmitInfo pWaitDstStageMask(IntBuffer value) { npWaitDstStageMask(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code pCommandBuffers} field. */
	public VkSubmitInfo pCommandBuffers(PointerBuffer value) { npCommandBuffers(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
	public VkSubmitInfo pSignalSemaphores(LongBuffer value) { npSignalSemaphores(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSubmitInfo set(
		int sType,
		long pNext,
		int waitSemaphoreCount,
		LongBuffer pWaitSemaphores,
		IntBuffer pWaitDstStageMask,
		PointerBuffer pCommandBuffers,
		LongBuffer pSignalSemaphores
	) {
		sType(sType);
		pNext(pNext);
		waitSemaphoreCount(waitSemaphoreCount);
		pWaitSemaphores(pWaitSemaphores);
		pWaitDstStageMask(pWaitDstStageMask);
		pCommandBuffers(pCommandBuffers);
		pSignalSemaphores(pSignalSemaphores);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkSubmitInfo set(VkSubmitInfo src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSubmitInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSubmitInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSubmitInfo} instance allocated with {@link BufferUtils}. */
	public static VkSubmitInfo create() {
		return new VkSubmitInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSubmitInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSubmitInfo create(long address) {
		return address == NULL ? null : new VkSubmitInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSubmitInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSubmitInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSubmitInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSubmitInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSubmitInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSubmitInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSubmitInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSubmitInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkSubmitInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkSubmitInfo.PNEXT); }
	/** Unsafe version of {@link #waitSemaphoreCount}. */
	public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkSubmitInfo.WAITSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
	public static LongBuffer npWaitSemaphores(long struct) { return memLongBuffer(memGetAddress(struct + VkSubmitInfo.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
	/** Unsafe version of {@link #pWaitDstStageMask() pWaitDstStageMask}. */
	public static IntBuffer npWaitDstStageMask(long struct) { return memIntBuffer(memGetAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK), nwaitSemaphoreCount(struct)); }
	/** Unsafe version of {@link #commandBufferCount}. */
	public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkSubmitInfo.COMMANDBUFFERCOUNT); }
	/** Unsafe version of {@link #pCommandBuffers() pCommandBuffers}. */
	public static PointerBuffer npCommandBuffers(long struct) { return memPointerBuffer(memGetAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS), ncommandBufferCount(struct)); }
	/** Unsafe version of {@link #signalSemaphoreCount}. */
	public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkSubmitInfo.SIGNALSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pSignalSemaphores() pSignalSemaphores}. */
	public static LongBuffer npSignalSemaphores(long struct) { return memLongBuffer(memGetAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkSubmitInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkSubmitInfo.PNEXT, value); }
	/** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
	public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.WAITSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
	public static void npWaitSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSubmitInfo.PWAITSEMAPHORES, memAddressSafe(value)); }
	/** Unsafe version of {@link #pWaitDstStageMask(IntBuffer) pWaitDstStageMask}. */
	public static void npWaitDstStageMask(long struct, IntBuffer value) { memPutAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK, memAddressSafe(value)); }
	/** Sets the specified value to the {@code commandBufferCount} field of the specified {@code struct}. */
	public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.COMMANDBUFFERCOUNT, value); }
	/** Unsafe version of {@link #pCommandBuffers(PointerBuffer) pCommandBuffers}. */
	public static void npCommandBuffers(long struct, PointerBuffer value) { memPutAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS, memAddressSafe(value)); ncommandBufferCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
	public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.SIGNALSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pSignalSemaphores(LongBuffer) pSignalSemaphores}. */
	public static void npSignalSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES, memAddressSafe(value)); nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nwaitSemaphoreCount(struct) != 0 ) {
			check(memGetAddress(struct + VkSubmitInfo.PWAITSEMAPHORES));
			check(memGetAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK));
		}
		if ( ncommandBufferCount(struct) != 0 )
			check(memGetAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS));
		if ( nsignalSemaphoreCount(struct) != 0 )
			check(memGetAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES));
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

	/** An array of {@link VkSubmitInfo} structs. */
	public static class Buffer extends StructBuffer<VkSubmitInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkSubmitInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSubmitInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSubmitInfo newInstance(long address) {
			return new VkSubmitInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkSubmitInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkSubmitInfo.npNext(address()); }
		/** Returns the value of the {@code waitSemaphoreCount} field. */
		public int waitSemaphoreCount() { return VkSubmitInfo.nwaitSemaphoreCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
		public LongBuffer pWaitSemaphores() { return VkSubmitInfo.npWaitSemaphores(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pWaitDstStageMask} field. */
		public IntBuffer pWaitDstStageMask() { return VkSubmitInfo.npWaitDstStageMask(address()); }
		/** Returns the value of the {@code commandBufferCount} field. */
		public int commandBufferCount() { return VkSubmitInfo.ncommandBufferCount(address()); }
		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code pCommandBuffers} field. */
		public PointerBuffer pCommandBuffers() { return VkSubmitInfo.npCommandBuffers(address()); }
		/** Returns the value of the {@code signalSemaphoreCount} field. */
		public int signalSemaphoreCount() { return VkSubmitInfo.nsignalSemaphoreCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
		public LongBuffer pSignalSemaphores() { return VkSubmitInfo.npSignalSemaphores(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkSubmitInfo.Buffer sType(int value) { VkSubmitInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkSubmitInfo.Buffer pNext(long value) { VkSubmitInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code waitSemaphoreCount} field. */
		public VkSubmitInfo.Buffer waitSemaphoreCount(int value) { VkSubmitInfo.nwaitSemaphoreCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
		public VkSubmitInfo.Buffer pWaitSemaphores(LongBuffer value) { VkSubmitInfo.npWaitSemaphores(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pWaitDstStageMask} field. */
		public VkSubmitInfo.Buffer pWaitDstStageMask(IntBuffer value) { VkSubmitInfo.npWaitDstStageMask(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code pCommandBuffers} field. */
		public VkSubmitInfo.Buffer pCommandBuffers(PointerBuffer value) { VkSubmitInfo.npCommandBuffers(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
		public VkSubmitInfo.Buffer pSignalSemaphores(LongBuffer value) { VkSubmitInfo.npSignalSemaphores(address(), value); return this; }

	}

}