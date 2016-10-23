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
 * Structure providing information about a queue family.
 * 
 * <h5>Description</h5>
 * 
 * <p>The bits specified in {@code queueFlags} are:</p>
 * 
 * <pre><code>typedef enum VkQueueFlagBits {
    VK_QUEUE_GRAPHICS_BIT = 0x00000001,
    VK_QUEUE_COMPUTE_BIT = 0x00000002,
    VK_QUEUE_TRANSFER_BIT = 0x00000004,
    VK_QUEUE_SPARSE_BINDING_BIT = 0x00000008,
} VkQueueFlagBits;</code></pre>
 * 
 * <ul>
 * <li>if {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} is set, then the queues in this queue family support graphics operations.</li>
 * <li>if {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} is set, then the queues in this queue family support compute operations.</li>
 * <li>if {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT} is set, then the queues in this queue family support transfer operations.</li>
 * <li>if {@link VK10#VK_QUEUE_SPARSE_BINDING_BIT QUEUE_SPARSE_BINDING_BIT} is set, then the queues in this queue family support sparse memory management operations (see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#sparsememory">Sparse Resources</a>). If any of the sparse resource features are enabled, then at least one queue family <b>must</b> support this bit.</li>
 * </ul>
 * 
 * <p>If an implementation exposes any queue family that supports graphics operations, at least one queue family of at least one physical device exposed by the implementation <b>must</b> support both graphics and compute operations.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>All commands that are allowed on a queue that supports transfer operations are also allowed on a queue that supports either graphics or compute operations thus if the capabilities of a queue family include {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} then reporting the {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT} capability separately for that queue family is optional:.</p>
 * </div>
 * 
 * <p>For further details see <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-queues">Queues</a>.</p>
 * 
 * <p>The value returned in {@code minImageTransferGranularity} has a unit of compressed texel blocks for images having a block-compressed format, and a unit of texels otherwise.</p>
 * 
 * <p>Possible values of {@code minImageTransferGranularity} are:</p>
 * 
 * <ul>
 * <li><code>(0,0,0)</code> which indicates that only whole mip levels <b>must</b> be transferred using the image transfer operations on the corresponding queues. In this case, the following restrictions apply to all offset and extent parameters of image transfer operations:
 * 
 * <ul>
 * <li>The {@code x}, {@code y}, and {@code z} members of a {@link VkOffset3D} parameter <b>must</b> always be zero.</li>
 * <li>The {@code width}, {@code height}, and {@code depth} members of a {@link VkExtent3D} parameter <b>must</b> always match the width, height, and depth of the image subresource corresponding to the parameter, respectively.</li>
 * </ul>
 * </li>
 * <li><code>(A<sub>x</sub>, A<sub>y</sub>, A<sub>z</sub>)</code> where <code>A<sub>x</sub></code>, <code>A<sub>y</sub></code>, and <code>A<sub>z</sub></code> are all integer powers of two. In this case the following restrictions apply to all image transfer operations:
 * 
 * <ul>
 * <li>{@code x}, {@code y}, and {@code z} of a {@link VkOffset3D} parameter <b>must</b> be integer multiples of <code>A<sub>x</sub></code>, <code>A<sub>y</sub></code>, and <code>A<sub>z</sub></code>, respectively.</li>
 * <li>{@code width} of a {@link VkExtent3D} parameter <b>must</b> be an integer multiple of <code>A<sub>x</sub></code>, or else <code>x + width</code> <b>must</b> equal the width of the image subresource corresponding to the parameter.</li>
 * <li>{@code height} of a {@link VkExtent3D} parameter <b>must</b> be an integer multiple of <code>A<sub>y</sub></code>, or else <code>y + height</code> <b>must</b> equal the height of the image subresource corresponding to the parameter.</li>
 * <li>{@code depth} of a {@link VkExtent3D} parameter <b>must</b> be an integer multiple of <code>A<sub>z</sub></code>, or else <code>z + depth</code> <b>must</b> equal the depth of the image subresource corresponding to the parameter.</li>
 * <li>If the format of the image corresponding to the parameters is one of the block-compressed formats then for the purposes of the above calculations the granularity <b>must</b> be scaled up by the compressed texel block dimensions.</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <p>Queues supporting graphics and/or compute operations <b>must</b> report <code>(1,1,1)</code> in {@code minImageTransferGranularity}, meaning that there are no additional restrictions on the granularity of image transfer operations for these queues. Other queues supporting image transfer operations are only required: to support whole mip level transfers, thus {@code minImageTransferGranularity} for queues belonging to such queue families <b>may</b> be <code>(0,0,0)</code>.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code queueFlags} &ndash; contains flags indicating the capabilities of the queues in this queue family.</li>
 * <li>{@code queueCount} &ndash; the unsigned integer count of queues in this queue family.</li>
 * <li>{@code timestampValidBits} &ndash; the unsigned integer count of meaningful bits in the timestamps written via {@link VK10#vkCmdWriteTimestamp CmdWriteTimestamp}. The valid range for the count is 36..64 bits, or a value of 0, indicating no support for timestamps. Bits outside the valid range are guaranteed to be zeros.</li>
 * <li>{@code minImageTransferGranularity} &ndash; the minimum granularity supported for image transfer operations on the queues in this queue family.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkQueueFamilyProperties {
    VkQueueFlags queueFlags;
    uint32_t queueCount;
    uint32_t timestampValidBits;
    {@link VkExtent3D VkExtent3D} minImageTransferGranularity;
}</code></pre>
 */
public class VkQueueFamilyProperties extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		QUEUEFLAGS,
		QUEUECOUNT,
		TIMESTAMPVALIDBITS,
		MINIMAGETRANSFERGRANULARITY;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		QUEUEFLAGS = layout.offsetof(0);
		QUEUECOUNT = layout.offsetof(1);
		TIMESTAMPVALIDBITS = layout.offsetof(2);
		MINIMAGETRANSFERGRANULARITY = layout.offsetof(3);
	}

	VkQueueFamilyProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkQueueFamilyProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkQueueFamilyProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code queueFlags} field. */
	public int queueFlags() { return nqueueFlags(address()); }
	/** Returns the value of the {@code queueCount} field. */
	public int queueCount() { return nqueueCount(address()); }
	/** Returns the value of the {@code timestampValidBits} field. */
	public int timestampValidBits() { return ntimestampValidBits(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
	public VkExtent3D minImageTransferGranularity() { return nminImageTransferGranularity(address()); }

	// -----------------------------------

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkQueueFamilyProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkQueueFamilyProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated with {@link BufferUtils}. */
	public static VkQueueFamilyProperties create() {
		return new VkQueueFamilyProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkQueueFamilyProperties create(long address) {
		return address == NULL ? null : new VkQueueFamilyProperties(address, null);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkQueueFamilyProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkQueueFamilyProperties mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkQueueFamilyProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkQueueFamilyProperties callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkQueueFamilyProperties mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkQueueFamilyProperties callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #queueFlags}. */
	public static int nqueueFlags(long struct) { return memGetInt(struct + VkQueueFamilyProperties.QUEUEFLAGS); }
	/** Unsafe version of {@link #queueCount}. */
	public static int nqueueCount(long struct) { return memGetInt(struct + VkQueueFamilyProperties.QUEUECOUNT); }
	/** Unsafe version of {@link #timestampValidBits}. */
	public static int ntimestampValidBits(long struct) { return memGetInt(struct + VkQueueFamilyProperties.TIMESTAMPVALIDBITS); }
	/** Unsafe version of {@link #minImageTransferGranularity}. */
	public static VkExtent3D nminImageTransferGranularity(long struct) { return VkExtent3D.create(struct + VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY); }

	// -----------------------------------

	/** An array of {@link VkQueueFamilyProperties} structs. */
	public static class Buffer extends StructBuffer<VkQueueFamilyProperties, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkQueueFamilyProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkQueueFamilyProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkQueueFamilyProperties newInstance(long address) {
			return new VkQueueFamilyProperties(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code queueFlags} field. */
		public int queueFlags() { return VkQueueFamilyProperties.nqueueFlags(address()); }
		/** Returns the value of the {@code queueCount} field. */
		public int queueCount() { return VkQueueFamilyProperties.nqueueCount(address()); }
		/** Returns the value of the {@code timestampValidBits} field. */
		public int timestampValidBits() { return VkQueueFamilyProperties.ntimestampValidBits(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
		public VkExtent3D minImageTransferGranularity() { return VkQueueFamilyProperties.nminImageTransferGranularity(address()); }

	}

}