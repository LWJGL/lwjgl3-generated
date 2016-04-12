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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkQueryPoolCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkQueryPoolCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a query pool object should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
 * <li>If the pipeline statistics queries feature is not enabled, {@code queryType} <b>must not</b> be {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}</li>
 * <li>If {@code queryType} is {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}, {@code pipelineStatistics} <b>must</b> be a valid combination of
 * {@code VkQueryPipelineStatisticFlagBits} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code queryType} &ndash; the {@code VkQueryType} type of queries managed by the pool</li>
 * <li>{@code queryCount} &ndash; the number of queries managed by the pool</li>
 * <li>{@code pipelineStatistics} &ndash; a bitmask indicating which counters will be returned in queries on the new pool. One or more of:<br><table><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT}</td></tr><tr><td>{@link VK10#VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT}</td></tr></table></li>
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
public class VkQueryPoolCreateInfo extends Struct {

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
	public static final class Buffer extends StructBuffer<VkQueryPoolCreateInfo, Buffer> {

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
			return new VkQueryPoolCreateInfo(address, getContainer());
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