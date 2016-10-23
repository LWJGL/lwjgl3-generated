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
 * Structure specifying parameters of a newly created command pool.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code queueFamilyIndex} <b>must</b> be the index of a queue family available in the calling command&#8217;s {@code device} parameter</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolCreateFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateCommandPool CreateCommandPool}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask indicating usage behavior for the pool and command buffers allocated from it. Bits which <b>can</b> be set include:
 * 
 * <pre><code>typedef enum VkCommandPoolCreateFlagBits {
    VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x00000001,
    VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x00000002,
} VkCommandPoolCreateFlagBits;</code></pre>
 * 
 * <ul>
 * <li>{@link VK10#VK_COMMAND_POOL_CREATE_TRANSIENT_BIT COMMAND_POOL_CREATE_TRANSIENT_BIT} indicates that command buffers allocated from the pool will be short-lived, meaning that they will be reset or freed in a relatively short timeframe. This flag <b>may</b> be used by the implementation to control memory allocation behavior within the pool.</li>
 * <li>{@link VK10#VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT} controls whether command buffers allocated from the pool <b>can</b> be individually reset. If this flag is set, individual command buffers allocated from the pool <b>can</b> be reset either explicitly, by calling {@link VK10#vkResetCommandBuffer ResetCommandBuffer}, or implicitly, by calling {@link VK10#vkBeginCommandBuffer BeginCommandBuffer} on an executable command buffer. If this flag is not set, then {@link VK10#vkResetCommandBuffer ResetCommandBuffer} and {@link VK10#vkBeginCommandBuffer BeginCommandBuffer} (on an executable command buffer) <b>must</b> not be called on the command buffers allocated from the pool, and they <b>can</b> only be reset in bulk by calling {@link VK10#vkResetCommandPool ResetCommandPool}.</li>
 * </ul></li>
 * <li>{@code queueFamilyIndex} &ndash; designates a queue family as described in section <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-queueprops">Queue Family Properties</a>. All command buffers allocated from this command pool <b>must</b> be submitted on queues from the same queue family.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkCommandPoolCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkCommandPoolCreateFlags flags;
    uint32_t queueFamilyIndex;
}</code></pre>
 */
public class VkCommandPoolCreateInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		QUEUEFAMILYINDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		QUEUEFAMILYINDEX = layout.offsetof(3);
	}

	VkCommandPoolCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCommandPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCommandPoolCreateInfo(ByteBuffer container) {
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

	/** Sets the specified value to the {@code sType} field. */
	public VkCommandPoolCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCommandPoolCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkCommandPoolCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code queueFamilyIndex} field. */
	public VkCommandPoolCreateInfo queueFamilyIndex(int value) { nqueueFamilyIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCommandPoolCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int queueFamilyIndex
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		queueFamilyIndex(queueFamilyIndex);

		return this;
	}

	/** Unsafe version of {@link #set(VkCommandPoolCreateInfo) set}. */
	public VkCommandPoolCreateInfo nset(long struct) {
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
	public VkCommandPoolCreateInfo set(VkCommandPoolCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkCommandPoolCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkCommandPoolCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkCommandPoolCreateInfo create() {
		return new VkCommandPoolCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCommandPoolCreateInfo create(long address) {
		return address == NULL ? null : new VkCommandPoolCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCommandPoolCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkCommandPoolCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkCommandPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkCommandPoolCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCommandPoolCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCommandPoolCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCommandPoolCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.FLAGS); }
	/** Unsafe version of {@link #queueFamilyIndex}. */
	public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandPoolCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
	public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX, value); }

	// -----------------------------------

	/** An array of {@link VkCommandPoolCreateInfo} structs. */
	public static class Buffer extends StructBuffer<VkCommandPoolCreateInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkCommandPoolCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCommandPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkCommandPoolCreateInfo newInstance(long address) {
			return new VkCommandPoolCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCommandPoolCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCommandPoolCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkCommandPoolCreateInfo.nflags(address()); }
		/** Returns the value of the {@code queueFamilyIndex} field. */
		public int queueFamilyIndex() { return VkCommandPoolCreateInfo.nqueueFamilyIndex(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCommandPoolCreateInfo.Buffer sType(int value) { VkCommandPoolCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCommandPoolCreateInfo.Buffer pNext(long value) { VkCommandPoolCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkCommandPoolCreateInfo.Buffer flags(int value) { VkCommandPoolCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code queueFamilyIndex} field. */
		public VkCommandPoolCreateInfo.Buffer queueFamilyIndex(int value) { VkCommandPoolCreateInfo.nqueueFamilyIndex(address(), value); return this; }

	}

}