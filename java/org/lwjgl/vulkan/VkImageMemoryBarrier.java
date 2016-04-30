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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkImageMemoryBarrier.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkImageMemoryBarrier">Vulkan Specification</a>
 * 
 * <p>Specifies an image memory barrier. This type of barrier only applies to memory accesses involving a specific image subresource range of the specified
 * image object. That is, a memory dependency formed from an image memory barrier is scoped to the specified subresources of the image. It is also used to
 * perform a layout transition for an image subresource range, or to transfer ownership of an image subresource range from one queue family to another.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * <li>{@code oldLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED} or the current layout of the image region affected by the barrier</li>
 * <li>{@code newLayout} <b>must not</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b>
 * both be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b>
 * either both be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, or both be a valid queue family</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are
 * valid queue families, at least one of them <b>must</b> be the same as the family of the queue that will execute this barrier</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid image subresource range for the image</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil components, then {@code aspectMask} member of {@code subresourceRange}
 * <b>must</b> include both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with
 * {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with
 * {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with
 * {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with
 * {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then {@code image} <b>must</b> have been created with
 * {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then {@code image} <b>must</b> have been created with
 * {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} set</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code srcAccessMask} &ndash; a bitmask of the classes of memory accesses performed by the first set of commands that will participate in the dependency. One or more of:<br><table><tr><td>{@link VK10#VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT}</td><td>{@link VK10#VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ACCESS_COLOR_ATTACHMENT_WRITE_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT}</td><td>{@link VK10#VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}</td><td>{@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_INDEX_READ_BIT ACCESS_INDEX_READ_BIT}</td><td>{@link VK10#VK_ACCESS_INDIRECT_COMMAND_READ_BIT ACCESS_INDIRECT_COMMAND_READ_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_INPUT_ATTACHMENT_READ_BIT ACCESS_INPUT_ATTACHMENT_READ_BIT}</td><td>{@link VK10#VK_ACCESS_MEMORY_READ_BIT ACCESS_MEMORY_READ_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_MEMORY_WRITE_BIT ACCESS_MEMORY_WRITE_BIT}</td><td>{@link VK10#VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_SHADER_WRITE_BIT ACCESS_SHADER_WRITE_BIT}</td><td>{@link VK10#VK_ACCESS_TRANSFER_READ_BIT ACCESS_TRANSFER_READ_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}</td><td>{@link VK10#VK_ACCESS_UNIFORM_READ_BIT ACCESS_UNIFORM_READ_BIT}</td></tr><tr><td>{@link VK10#VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT ACCESS_VERTEX_ATTRIBUTE_READ_BIT}</td></tr></table></li>
 * <li>{@code dstAccessMask} &ndash; a bitmask of the classes of memory accesses performed by the second set of commands that will participate in the dependency</li>
 * <li>{@code oldLayout} &ndash; describes the current layout of the image subresource(s). One of:<br><table><tr><td>{@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</td><td>{@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}</td></tr><tr><td>{@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}</td><td>{@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</td></tr></table></li>
 * <li>{@code newLayout} &ndash; describes the new layout of the image subresource(s)</li>
 * <li>{@code srcQueueFamilyIndex} &ndash; 
 * the queue family that is relinquishing ownership of the image subresource(s) to another queue, or {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED} if there is no transfer of
 * ownership)</li>
 * <li>{@code dstQueueFamilyIndex} &ndash; 
 * the queue family that is acquiring ownership of the image subresource(s) from another queue, or {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED} if there is no transfer of
 * ownership)</li>
 * <li>{@code image} &ndash; a handle to the image whose backing memory is affected by the barrier</li>
 * <li>{@code subresourceRange} &ndash; describes an area of the backing memory for image, as well as the set of image subresources whose image layouts are modified</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageMemoryBarrier {
    VkStructureType sType;
    const void * pNext;
    VkAccessFlags srcAccessMask;
    VkAccessFlags dstAccessMask;
    VkImageLayout oldLayout;
    VkImageLayout newLayout;
    uint32_t srcQueueFamilyIndex;
    uint32_t dstQueueFamilyIndex;
    VkImage image;
    {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
}</code></pre>
 */
public class VkImageMemoryBarrier extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SRCACCESSMASK,
		DSTACCESSMASK,
		OLDLAYOUT,
		NEWLAYOUT,
		SRCQUEUEFAMILYINDEX,
		DSTQUEUEFAMILYINDEX,
		IMAGE,
		SUBRESOURCERANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(8),
			__member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SRCACCESSMASK = layout.offsetof(2);
		DSTACCESSMASK = layout.offsetof(3);
		OLDLAYOUT = layout.offsetof(4);
		NEWLAYOUT = layout.offsetof(5);
		SRCQUEUEFAMILYINDEX = layout.offsetof(6);
		DSTQUEUEFAMILYINDEX = layout.offsetof(7);
		IMAGE = layout.offsetof(8);
		SUBRESOURCERANGE = layout.offsetof(9);
	}

	VkImageMemoryBarrier(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageMemoryBarrier(ByteBuffer container) {
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
	/** Returns the value of the {@code oldLayout} field. */
	public int oldLayout() { return noldLayout(address()); }
	/** Returns the value of the {@code newLayout} field. */
	public int newLayout() { return nnewLayout(address()); }
	/** Returns the value of the {@code srcQueueFamilyIndex} field. */
	public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
	/** Returns the value of the {@code dstQueueFamilyIndex} field. */
	public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
	public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImageMemoryBarrier sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImageMemoryBarrier pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkImageMemoryBarrier srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkImageMemoryBarrier dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code oldLayout} field. */
	public VkImageMemoryBarrier oldLayout(int value) { noldLayout(address(), value); return this; }
	/** Sets the specified value to the {@code newLayout} field. */
	public VkImageMemoryBarrier newLayout(int value) { nnewLayout(address(), value); return this; }
	/** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
	public VkImageMemoryBarrier srcQueueFamilyIndex(int value) { nsrcQueueFamilyIndex(address(), value); return this; }
	/** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
	public VkImageMemoryBarrier dstQueueFamilyIndex(int value) { ndstQueueFamilyIndex(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public VkImageMemoryBarrier image(long value) { nimage(address(), value); return this; }
	/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
	public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageMemoryBarrier set(
		int sType,
		long pNext,
		int srcAccessMask,
		int dstAccessMask,
		int oldLayout,
		int newLayout,
		int srcQueueFamilyIndex,
		int dstQueueFamilyIndex,
		long image,
		VkImageSubresourceRange subresourceRange
	) {
		sType(sType);
		pNext(pNext);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);
		oldLayout(oldLayout);
		newLayout(newLayout);
		srcQueueFamilyIndex(srcQueueFamilyIndex);
		dstQueueFamilyIndex(dstQueueFamilyIndex);
		image(image);
		subresourceRange(subresourceRange);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageMemoryBarrier) set}. */
	public VkImageMemoryBarrier nset(long struct) {
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
	public VkImageMemoryBarrier set(VkImageMemoryBarrier src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageMemoryBarrier malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageMemoryBarrier calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated with {@link BufferUtils}. */
	public static VkImageMemoryBarrier create() {
		return new VkImageMemoryBarrier(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageMemoryBarrier create(long address) {
		return address == NULL ? null : new VkImageMemoryBarrier(address, null);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageMemoryBarrier.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImageMemoryBarrier mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImageMemoryBarrier} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImageMemoryBarrier callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageMemoryBarrier mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageMemoryBarrier callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImageMemoryBarrier.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier.PNEXT); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkImageMemoryBarrier.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkImageMemoryBarrier.DSTACCESSMASK); }
	/** Unsafe version of {@link #oldLayout}. */
	public static int noldLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier.OLDLAYOUT); }
	/** Unsafe version of {@link #newLayout}. */
	public static int nnewLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier.NEWLAYOUT); }
	/** Unsafe version of {@link #srcQueueFamilyIndex}. */
	public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #dstQueueFamilyIndex}. */
	public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX); }
	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkImageMemoryBarrier.IMAGE); }
	/** Unsafe version of {@link #subresourceRange}. */
	public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier.SUBRESOURCERANGE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier.PNEXT, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.DSTACCESSMASK, value); }
	/** Unsafe version of {@link #oldLayout(int) oldLayout}. */
	public static void noldLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.OLDLAYOUT, value); }
	/** Unsafe version of {@link #newLayout(int) newLayout}. */
	public static void nnewLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.NEWLAYOUT, value); }
	/** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
	public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
	/** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
	public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier.IMAGE, value); }
	/** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
	public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkImageMemoryBarrier} structs. */
	public static final class Buffer extends StructBuffer<VkImageMemoryBarrier, Buffer> {

		/**
		 * Creates a new {@link VkImageMemoryBarrier.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
		protected VkImageMemoryBarrier newInstance(long address) {
			return new VkImageMemoryBarrier(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImageMemoryBarrier.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImageMemoryBarrier.npNext(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkImageMemoryBarrier.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkImageMemoryBarrier.ndstAccessMask(address()); }
		/** Returns the value of the {@code oldLayout} field. */
		public int oldLayout() { return VkImageMemoryBarrier.noldLayout(address()); }
		/** Returns the value of the {@code newLayout} field. */
		public int newLayout() { return VkImageMemoryBarrier.nnewLayout(address()); }
		/** Returns the value of the {@code srcQueueFamilyIndex} field. */
		public int srcQueueFamilyIndex() { return VkImageMemoryBarrier.nsrcQueueFamilyIndex(address()); }
		/** Returns the value of the {@code dstQueueFamilyIndex} field. */
		public int dstQueueFamilyIndex() { return VkImageMemoryBarrier.ndstQueueFamilyIndex(address()); }
		/** Returns the value of the {@code image} field. */
		public long image() { return VkImageMemoryBarrier.nimage(address()); }
		/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
		public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier.nsubresourceRange(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImageMemoryBarrier.Buffer sType(int value) { VkImageMemoryBarrier.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImageMemoryBarrier.Buffer pNext(long value) { VkImageMemoryBarrier.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkImageMemoryBarrier.Buffer srcAccessMask(int value) { VkImageMemoryBarrier.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkImageMemoryBarrier.Buffer dstAccessMask(int value) { VkImageMemoryBarrier.ndstAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code oldLayout} field. */
		public VkImageMemoryBarrier.Buffer oldLayout(int value) { VkImageMemoryBarrier.noldLayout(address(), value); return this; }
		/** Sets the specified value to the {@code newLayout} field. */
		public VkImageMemoryBarrier.Buffer newLayout(int value) { VkImageMemoryBarrier.nnewLayout(address(), value); return this; }
		/** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
		public VkImageMemoryBarrier.Buffer srcQueueFamilyIndex(int value) { VkImageMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
		/** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
		public VkImageMemoryBarrier.Buffer dstQueueFamilyIndex(int value) { VkImageMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public VkImageMemoryBarrier.Buffer image(long value) { VkImageMemoryBarrier.nimage(address(), value); return this; }
		/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
		public VkImageMemoryBarrier.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier.nsubresourceRange(address(), value); return this; }

	}

}