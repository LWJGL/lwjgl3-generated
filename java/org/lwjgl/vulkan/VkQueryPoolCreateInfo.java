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
 * Structure specifying parameters of a newly created query pool.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is not enabled, {@code queryType} <b>must</b> not be {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}</li>
 * <li>If {@code queryType} is {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}, {@code pipelineStatistics} <b>must</b> be a valid combination of {@code VkQueryPipelineStatisticFlagBits} values</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateQueryPool CreateQueryPool}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code queryType} &ndash; the type of queries managed by the pool, and <b>must</b> be one of the values
 * 
 * <pre><code>typedef enum VkQueryType {
    VK_QUERY_TYPE_OCCLUSION = 0,
    VK_QUERY_TYPE_PIPELINE_STATISTICS = 1,
    VK_QUERY_TYPE_TIMESTAMP = 2,
} VkQueryType;</code></pre></li>
 * <li>{@code queryCount} &ndash; the number of queries managed by the pool.</li>
 * <li>{@code pipelineStatistics} &ndash; a bitmask indicating which counters will be returned in queries on the new pool, as described below in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#queries-pipestats">the “Pipeline Statistics Queries” section</a>. {@code pipelineStatistics} is ignored if {@code queryType} is not {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkQueryPoolCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkQueryPoolCreateFlags flags;
    VkQueryType queryType;
    uint32_t queryCount;
    VkQueryPipelineStatisticFlags pipelineStatistics;
}</code></pre>
 */
public class VkQueryPoolCreateInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		QUERYTYPE,
		QUERYCOUNT,
		PIPELINESTATISTICS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		QUERYTYPE = layout.offsetof(3);
		QUERYCOUNT = layout.offsetof(4);
		PIPELINESTATISTICS = layout.offsetof(5);
	}

	VkQueryPoolCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkQueryPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkQueryPoolCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code queryType} field. */
	public int queryType() { return nqueryType(address()); }
	/** Returns the value of the {@code queryCount} field. */
	public int queryCount() { return nqueryCount(address()); }
	/** Returns the value of the {@code pipelineStatistics} field. */
	public int pipelineStatistics() { return npipelineStatistics(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkQueryPoolCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkQueryPoolCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkQueryPoolCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code queryType} field. */
	public VkQueryPoolCreateInfo queryType(int value) { nqueryType(address(), value); return this; }
	/** Sets the specified value to the {@code queryCount} field. */
	public VkQueryPoolCreateInfo queryCount(int value) { nqueryCount(address(), value); return this; }
	/** Sets the specified value to the {@code pipelineStatistics} field. */
	public VkQueryPoolCreateInfo pipelineStatistics(int value) { npipelineStatistics(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkQueryPoolCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int queryType,
		int queryCount,
		int pipelineStatistics
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		queryType(queryType);
		queryCount(queryCount);
		pipelineStatistics(pipelineStatistics);

		return this;
	}

	/** Unsafe version of {@link #set(VkQueryPoolCreateInfo) set}. */
	public VkQueryPoolCreateInfo nset(long struct) {
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
	public VkQueryPoolCreateInfo set(VkQueryPoolCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkQueryPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkQueryPoolCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkQueryPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkQueryPoolCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkQueryPoolCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkQueryPoolCreateInfo create() {
		return new VkQueryPoolCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkQueryPoolCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkQueryPoolCreateInfo create(long address) {
		return address == NULL ? null : new VkQueryPoolCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkQueryPoolCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkQueryPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkQueryPoolCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkQueryPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkQueryPoolCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkQueryPoolCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkQueryPoolCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkQueryPoolCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkQueryPoolCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkQueryPoolCreateInfo.FLAGS); }
	/** Unsafe version of {@link #queryType}. */
	public static int nqueryType(long struct) { return memGetInt(struct + VkQueryPoolCreateInfo.QUERYTYPE); }
	/** Unsafe version of {@link #queryCount}. */
	public static int nqueryCount(long struct) { return memGetInt(struct + VkQueryPoolCreateInfo.QUERYCOUNT); }
	/** Unsafe version of {@link #pipelineStatistics}. */
	public static int npipelineStatistics(long struct) { return memGetInt(struct + VkQueryPoolCreateInfo.PIPELINESTATISTICS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkQueryPoolCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryPoolCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkQueryPoolCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #queryType(int) queryType}. */
	public static void nqueryType(long struct, int value) { memPutInt(struct + VkQueryPoolCreateInfo.QUERYTYPE, value); }
	/** Unsafe version of {@link #queryCount(int) queryCount}. */
	public static void nqueryCount(long struct, int value) { memPutInt(struct + VkQueryPoolCreateInfo.QUERYCOUNT, value); }
	/** Unsafe version of {@link #pipelineStatistics(int) pipelineStatistics}. */
	public static void npipelineStatistics(long struct, int value) { memPutInt(struct + VkQueryPoolCreateInfo.PIPELINESTATISTICS, value); }

	// -----------------------------------

	/** An array of {@link VkQueryPoolCreateInfo} structs. */
	public static class Buffer extends StructBuffer<VkQueryPoolCreateInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkQueryPoolCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkQueryPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkQueryPoolCreateInfo newInstance(long address) {
			return new VkQueryPoolCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkQueryPoolCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkQueryPoolCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkQueryPoolCreateInfo.nflags(address()); }
		/** Returns the value of the {@code queryType} field. */
		public int queryType() { return VkQueryPoolCreateInfo.nqueryType(address()); }
		/** Returns the value of the {@code queryCount} field. */
		public int queryCount() { return VkQueryPoolCreateInfo.nqueryCount(address()); }
		/** Returns the value of the {@code pipelineStatistics} field. */
		public int pipelineStatistics() { return VkQueryPoolCreateInfo.npipelineStatistics(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkQueryPoolCreateInfo.Buffer sType(int value) { VkQueryPoolCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkQueryPoolCreateInfo.Buffer pNext(long value) { VkQueryPoolCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkQueryPoolCreateInfo.Buffer flags(int value) { VkQueryPoolCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code queryType} field. */
		public VkQueryPoolCreateInfo.Buffer queryType(int value) { VkQueryPoolCreateInfo.nqueryType(address(), value); return this; }
		/** Sets the specified value to the {@code queryCount} field. */
		public VkQueryPoolCreateInfo.Buffer queryCount(int value) { VkQueryPoolCreateInfo.nqueryCount(address(), value); return this; }
		/** Sets the specified value to the {@code pipelineStatistics} field. */
		public VkQueryPoolCreateInfo.Buffer pipelineStatistics(int value) { VkQueryPoolCreateInfo.npipelineStatistics(address(), value); return this; }

	}

}