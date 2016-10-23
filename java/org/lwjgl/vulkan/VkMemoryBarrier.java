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
 * Structure specifying a memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code srcAccessMask} and {@code dstAccessMask}, along with {@code srcStageMask} and {@code dstStageMask} from {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier}, define the two halves of a memory dependency and an execution dependency. Memory accesses using the set of access types in {@code srcAccessMask} performed in pipeline stages in {@code srcStageMask} by the first set of commands <b>must</b> complete and be available to later commands. The side effects of the first set of commands will be visible to memory accesses using the set of access types in {@code dstAccessMask} performed in pipeline stages in {@code dstStageMask} by the second set of commands. If the barrier is by-region, these requirements only apply to invocations within the same framebuffer-space region, for pipeline stages that perform framebuffer-space work. The execution dependency guarantees that execution of work by the destination stages of the second set of commands will not begin until execution of work by the source stages of the first set of commands has completed.</p>
 * 
 * <p>A common type of memory dependency is to avoid a read-after-write hazard. In this case, the source access mask and stages will include writes from a particular stage, and the destination access mask and stages will indicate how those writes will be read in subsequent commands. However, barriers <b>can</b> also express write-after-read dependencies and write-after-write dependencies, and are even useful to express read-after-read dependencies across an image layout change.</p>
 * 
 * <p>Bits which <b>can</b> be set in {@link VkMemoryBarrier}{@code ::srcAccessMask} and {@link VkMemoryBarrier}{@code ::dstAccessMask} include:</p>
 * 
 * <pre><code>typedef enum VkAccessFlagBits {
    VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x00000001,
    VK_ACCESS_INDEX_READ_BIT = 0x00000002,
    VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004,
    VK_ACCESS_UNIFORM_READ_BIT = 0x00000008,
    VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x00000010,
    VK_ACCESS_SHADER_READ_BIT = 0x00000020,
    VK_ACCESS_SHADER_WRITE_BIT = 0x00000040,
    VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x00000080,
    VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100,
    VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200,
    VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400,
    VK_ACCESS_TRANSFER_READ_BIT = 0x00000800,
    VK_ACCESS_TRANSFER_WRITE_BIT = 0x00001000,
    VK_ACCESS_HOST_READ_BIT = 0x00002000,
    VK_ACCESS_HOST_WRITE_BIT = 0x00004000,
    VK_ACCESS_MEMORY_READ_BIT = 0x00008000,
    VK_ACCESS_MEMORY_WRITE_BIT = 0x00010000,
} VkAccessFlagBits;</code></pre>
 * 
 * <ul>
 * <li>{@link VK10#VK_ACCESS_INDIRECT_COMMAND_READ_BIT ACCESS_INDIRECT_COMMAND_READ_BIT} indicates that the access is an indirect command structure read as part of an indirect drawing command.</li>
 * <li>{@link VK10#VK_ACCESS_INDEX_READ_BIT ACCESS_INDEX_READ_BIT} indicates that the access is an index buffer read.</li>
 * <li>{@link VK10#VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT ACCESS_VERTEX_ATTRIBUTE_READ_BIT} indicates that the access is a read via the vertex input bindings.</li>
 * <li>{@link VK10#VK_ACCESS_UNIFORM_READ_BIT ACCESS_UNIFORM_READ_BIT} indicates that the access is a read via a uniform buffer or dynamic uniform buffer descriptor.</li>
 * <li>{@link VK10#VK_ACCESS_INPUT_ATTACHMENT_READ_BIT ACCESS_INPUT_ATTACHMENT_READ_BIT} indicates that the access is a read via an input attachment descriptor.</li>
 * <li>{@link VK10#VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT} indicates that the access is a read from a shader via any other descriptor type.</li>
 * <li>{@link VK10#VK_ACCESS_SHADER_WRITE_BIT ACCESS_SHADER_WRITE_BIT} indicates that the access is a write or atomic from a shader via the same descriptor types as in {@link VK10#VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}.</li>
 * <li>{@link VK10#VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT} indicates that the access is a read via a color attachment.</li>
 * <li>{@link VK10#VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT} indicates that the access is a write via a color or resolve attachment.</li>
 * <li>{@link VK10#VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT} indicates that the access is a read via a depth/stencil attachment.</li>
 * <li>{@link VK10#VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT} indicates that the access is a write via a depth/stencil attachment.</li>
 * <li>{@link VK10#VK_ACCESS_TRANSFER_READ_BIT ACCESS_TRANSFER_READ_BIT} indicates that the access is a read from a transfer (copy, blit, resolve, etc.) operation. For the complete set of transfer operations, see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-transfer">{@link VK10#VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</a>.</li>
 * <li>{@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT} indicates that the access is a write from a transfer (copy, blit, resolve, etc.) operation. For the complete set of transfer operations, see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-transfer">{@link VK10#VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</a>.</li>
 * <li>{@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT} indicates that the access is a read via the host.</li>
 * <li>{@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT} indicates that the access is a write via the host.</li>
 * <li>{@link VK10#VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT} indicates that the access is a read via a non-specific unit attached to the memory. This unit <b>may</b> be external to the Vulkan device or otherwise not part of the core Vulkan pipeline. When included in {@code dstAccessMask}, all writes using access types in {@code srcAccessMask} performed by pipeline stages in {@code srcStageMask} <b>must</b> be visible in memory.</li>
 * <li>{@link VK10#VK_ACCESS_MEMORY_WRITE_BIT ACCESS_MEMORY_WRITE_BIT} indicates that the access is a write via a non-specific unit attached to the memory. This unit <b>may</b> be external to the Vulkan device or otherwise not part of the core Vulkan pipeline. When included in {@code srcAccessMask}, all access types in {@code dstAccessMask} from pipeline stages in {@code dstStageMask} will observe the side effects of commands that executed before the barrier. When included in {@code dstAccessMask} all writes using access types in {@code srcAccessMask} performed by pipeline stages in {@code srcStageMask} <b>must</b> be visible in memory.</li>
 * </ul>
 * 
 * <p>Color attachment reads and writes are automatically (without memory or execution dependencies) coherent and ordered against themselves and each other for a given sample within a subpass of a render pass instance, executing in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#primrast-order">rasterization order</a>. Similarly, depth/stencil attachment reads and writes are automatically coherent and ordered against themselves and each other in the same circumstances.</p>
 * 
 * <p>Shader reads and/or writes through two variables (in the same or different shader invocations) decorated with {@code Coherent} and which use the same image view or buffer view are automatically coherent with each other, but require execution dependencies if a specific order is desired. Similarly, shader atomic operations are coherent with each other and with {@code Coherent} variables. Non-{@code Coherent} shader memory accesses require memory dependencies for writes to be available and reads to be visible.</p>
 * 
 * <p>Certain memory access types are only supported on queues that support a particular set of operations. The following table lists, for each access flag, which queue capability flag <b>must</b> be supported by the queue. When multiple flags are enumerated in the second column of the table it means that the access type is supported on the queue if it supports any of the listed capability flags. For further details on queue capabilities see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-physical-device-enumeration">Physical Device Enumeration</a> and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-queues">Queues</a>.</p>
 * 
 * <h6>Supported access flags</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Access flag</th><th>Required queue capability flag</th></tr></thead>
 * <tbody>
 * <tr><td>{@link VK10#VK_ACCESS_INDIRECT_COMMAND_READ_BIT ACCESS_INDIRECT_COMMAND_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_INDEX_READ_BIT ACCESS_INDEX_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT ACCESS_VERTEX_ATTRIBUTE_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_UNIFORM_READ_BIT ACCESS_UNIFORM_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_INPUT_ATTACHMENT_READ_BIT ACCESS_INPUT_ATTACHMENT_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_SHADER_WRITE_BIT ACCESS_SHADER_WRITE_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_TRANSFER_READ_BIT ACCESS_TRANSFER_READ_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}, {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} or {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}</td><td>{@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT}, {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} or {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}</td><td>None</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT}</td><td>None</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT}</td><td>None</td></tr>
 * <tr><td>{@link VK10#VK_ACCESS_MEMORY_WRITE_BIT ACCESS_MEMORY_WRITE_BIT}</td><td>None</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_MEMORY_BARRIER STRUCTURE_TYPE_MEMORY_BARRIER}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier}, {@link VK10#vkCmdWaitEvents CmdWaitEvents}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcAccessMask} &ndash; a bitmask of the classes of memory accesses performed by the first set of commands that will participate in the dependency.</li>
 * <li>{@code dstAccessMask} &ndash; a bitmask of the classes of memory accesses performed by the second set of commands that will participate in the dependency.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkMemoryBarrier {
    VkStructureType sType;
    const void * pNext;
    VkAccessFlags srcAccessMask;
    VkAccessFlags dstAccessMask;
}</code></pre>
 */
public class VkMemoryBarrier extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SRCACCESSMASK,
		DSTACCESSMASK;

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
		SRCACCESSMASK = layout.offsetof(2);
		DSTACCESSMASK = layout.offsetof(3);
	}

	VkMemoryBarrier(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMemoryBarrier(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code srcAccessMask} field. */
	public int srcAccessMask() { return nsrcAccessMask(address()); }
	/** Returns the value of the {@code dstAccessMask} field. */
	public int dstAccessMask() { return ndstAccessMask(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkMemoryBarrier sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkMemoryBarrier pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkMemoryBarrier srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkMemoryBarrier dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkMemoryBarrier set(
		int sType,
		long pNext,
		int srcAccessMask,
		int dstAccessMask
	) {
		sType(sType);
		pNext(pNext);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);

		return this;
	}

	/** Unsafe version of {@link #set(VkMemoryBarrier) set}. */
	public VkMemoryBarrier nset(long struct) {
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
	public VkMemoryBarrier set(VkMemoryBarrier src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkMemoryBarrier malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkMemoryBarrier calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkMemoryBarrier} instance allocated with {@link BufferUtils}. */
	public static VkMemoryBarrier create() {
		return new VkMemoryBarrier(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkMemoryBarrier} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryBarrier create(long address) {
		return address == NULL ? null : new VkMemoryBarrier(address, null);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkMemoryBarrier.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkMemoryBarrier} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkMemoryBarrier mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkMemoryBarrier} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkMemoryBarrier callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkMemoryBarrier mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkMemoryBarrier callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkMemoryBarrier.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkMemoryBarrier.PNEXT); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkMemoryBarrier.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkMemoryBarrier.DSTACCESSMASK); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryBarrier.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryBarrier.PNEXT, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkMemoryBarrier.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkMemoryBarrier.DSTACCESSMASK, value); }

	// -----------------------------------

	/** An array of {@link VkMemoryBarrier} structs. */
	public static class Buffer extends StructBuffer<VkMemoryBarrier, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkMemoryBarrier.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
		protected VkMemoryBarrier newInstance(long address) {
			return new VkMemoryBarrier(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkMemoryBarrier.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkMemoryBarrier.npNext(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkMemoryBarrier.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkMemoryBarrier.ndstAccessMask(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkMemoryBarrier.Buffer sType(int value) { VkMemoryBarrier.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkMemoryBarrier.Buffer pNext(long value) { VkMemoryBarrier.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkMemoryBarrier.Buffer srcAccessMask(int value) { VkMemoryBarrier.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkMemoryBarrier.Buffer dstAccessMask(int value) { VkMemoryBarrier.ndstAccessMask(address(), value); return this; }

	}

}