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
 * Structure specifying parameters of a newly created pipeline input assembly state.
 * 
 * <h5>Description</h5>
 * 
 * <p>Restarting the assembly of primitives discards the most recent index values if those elements formed an incomplete primitive, and restarts the primitive assembly using the subsequent indices, but only assembling the immediately following element through the end of the originally specified elements. The primitive restart index value comparison is performed before adding the {@code vertexOffset} value to the index value.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code topology} is {@link VK10#VK_PRIMITIVE_TOPOLOGY_POINT_LIST PRIMITIVE_TOPOLOGY_POINT_LIST}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_LIST PRIMITIVE_TOPOLOGY_LINE_LIST}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST PRIMITIVE_TOPOLOGY_TRIANGLE_LIST}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY} or {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}, {@code primitiveRestartEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code topology} <b>must</b> not be any of {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY} or {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY}</li>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code topology} <b>must</b> not be {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code topology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code topology} &ndash; a {@code VkPrimitiveTopology} defining the primitive topology, as described below.</li>
 * <li>{@code primitiveRestartEnable} &ndash; controls whether a special vertex index value is treated as restarting the assembly of primitives. This enable only applies to indexed draws ({@link VK10#vkCmdDrawIndexed CmdDrawIndexed} and {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}), and the special index value is either 0xFFFFFFFF when the {@code indexType} parameter of {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer} is equal to {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}, or 0xFFFF when {@code indexType} is equal to {@link VK10#VK_INDEX_TYPE_UINT16 INDEX_TYPE_UINT16}. Primitive restart is not allowed for “list” topologies.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineInputAssemblyStateCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineInputAssemblyStateCreateFlags flags;
    VkPrimitiveTopology topology;
    VkBool32 primitiveRestartEnable;
}</code></pre>
 */
public class VkPipelineInputAssemblyStateCreateInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		TOPOLOGY,
		PRIMITIVERESTARTENABLE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		TOPOLOGY = layout.offsetof(3);
		PRIMITIVERESTARTENABLE = layout.offsetof(4);
	}

	VkPipelineInputAssemblyStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineInputAssemblyStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code topology} field. */
	public int topology() { return ntopology(address()); }
	/** Returns the value of the {@code primitiveRestartEnable} field. */
	public boolean primitiveRestartEnable() { return nprimitiveRestartEnable(address()) != 0; }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineInputAssemblyStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineInputAssemblyStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineInputAssemblyStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code topology} field. */
	public VkPipelineInputAssemblyStateCreateInfo topology(int value) { ntopology(address(), value); return this; }
	/** Sets the specified value to the {@code primitiveRestartEnable} field. */
	public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(boolean value) { nprimitiveRestartEnable(address(), value ? 1 : 0); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineInputAssemblyStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int topology,
		boolean primitiveRestartEnable
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		topology(topology);
		primitiveRestartEnable(primitiveRestartEnable);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPipelineInputAssemblyStateCreateInfo set(VkPipelineInputAssemblyStateCreateInfo src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineInputAssemblyStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineInputAssemblyStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineInputAssemblyStateCreateInfo create() {
		return new VkPipelineInputAssemblyStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineInputAssemblyStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineInputAssemblyStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineInputAssemblyStateCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineInputAssemblyStateCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineInputAssemblyStateCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineInputAssemblyStateCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #topology}. */
	public static int ntopology(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY); }
	/** Unsafe version of {@link #primitiveRestartEnable}. */
	public static int nprimitiveRestartEnable(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #topology(int) topology}. */
	public static void ntopology(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY, value); }
	/** Unsafe version of {@link #primitiveRestartEnable(boolean) primitiveRestartEnable}. */
	public static void nprimitiveRestartEnable(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineInputAssemblyStateCreateInfo} structs. */
	public static class Buffer extends StructBuffer<VkPipelineInputAssemblyStateCreateInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineInputAssemblyStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineInputAssemblyStateCreateInfo newInstance(long address) {
			return new VkPipelineInputAssemblyStateCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineInputAssemblyStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineInputAssemblyStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineInputAssemblyStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code topology} field. */
		public int topology() { return VkPipelineInputAssemblyStateCreateInfo.ntopology(address()); }
		/** Returns the value of the {@code primitiveRestartEnable} field. */
		public boolean primitiveRestartEnable() { return VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address()) != 0; }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer sType(int value) { VkPipelineInputAssemblyStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer pNext(long value) { VkPipelineInputAssemblyStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer flags(int value) { VkPipelineInputAssemblyStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code topology} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer topology(int value) { VkPipelineInputAssemblyStateCreateInfo.ntopology(address(), value); return this; }
		/** Sets the specified value to the {@code primitiveRestartEnable} field. */
		public VkPipelineInputAssemblyStateCreateInfo.Buffer primitiveRestartEnable(boolean value) { VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address(), value ? 1 : 0); return this; }

	}

}