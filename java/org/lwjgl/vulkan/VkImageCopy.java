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
 * Structure specifying an image copy operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>For {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} images, copies are performed slice by slice starting with the {@code z} member of the {@code srcOffset} or {@code dstOffset}, and copying {@code depth} slices. For images with multiple layers, copies are performed layer by layer starting with the {@code baseArrayLayer} member of the {@code srcSubresource} or {@code dstSubresource} and copying {@code layerCount} layers. Image data <b>can</b> be copied between images with different image types. If one image is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} and the other image is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} with multiple layers, then each slice is copied to or from a different layer.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * <li>The number of slices of the {@code extent} (for 3D) or layers of the {@code srcSubresource} (for non-3D) <b>must</b> match the number of slices of the {@code extent} (for 3D) or layers of the {@code dstSubresource} (for non-3D)</li>
 * <li>If either of the calling command&#8217;s {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, the {@code baseArrayLayer} and {@code layerCount} members of the corresponding subresource <b>must</b> be 0 and 1, respectively</li>
 * <li>The {@code aspectMask} member of {@code srcSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code srcImage}</li>
 * <li>The {@code aspectMask} member of {@code dstSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code dstImage}</li>
 * <li>{@code srcOffset.x} and ({@code extent.width} + {@code srcOffset.x}) <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource width</li>
 * <li>{@code srcOffset.y} and ({@code extent.height} + {@code srcOffset.y}) <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource height</li>
 * <li>If the calling command&#8217;s {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1.</li>
 * <li>{@code srcOffset.z} and ({@code extent.depth} + {@code srcOffset.z}) <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource depth</li>
 * <li>If the calling command&#8217;s {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1.</li>
 * <li>{@code srcSubresource.baseArrayLayer} <b>must</b> be less than and ({@code srcSubresource.layerCount} + {@code srcSubresource.baseArrayLayer}) <b>must</b> be less than or equal to the number of layers in the source image</li>
 * <li>{@code dstOffset.x} and ({@code extent.width} + {@code dstOffset.x}) <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource width</li>
 * <li>{@code dstOffset.y} and ({@code extent.height} + {@code dstOffset.y}) <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource height</li>
 * <li>If the calling command&#8217;s {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1.</li>
 * <li>{@code dstOffset.z} and ({@code extent.depth} + {@code dstOffset.z}) <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource depth</li>
 * <li>If the calling command&#8217;s {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1.</li>
 * <li>{@code dstSubresource.baseArrayLayer} <b>must</b> be less than and ({@code dstSubresource.layerCount} + {@code dstSubresource.baseArrayLayer}) <b>must</b> be less than or equal to the number of layers in the destination image</li>
 * <li>If the calling command&#8217;s {@code srcImage} is a compressed format image:
 * 
 * <ul>
 * <li>all members of {@code srcOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>{@code extent.width} <b>must</b> be a multiple of the compressed texel block width or ({@code extent.width} + {@code srcOffset.x}) <b>must</b> equal the source image subresource width</li>
 * <li>{@code extent.height} <b>must</b> be a multiple of the compressed texel block height or ({@code extent.height} + {@code srcOffset.y}) <b>must</b> equal the source image subresource height</li>
 * <li>{@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or ({@code extent.depth} + {@code srcOffset.z}) <b>must</b> equal the source image subresource depth</li>
 * </ul>
 * </li>
 * <li>If the calling command&#8217;s {@code dstImage} is a compressed format image:
 * 
 * <ul>
 * <li>all members of {@code dstOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>{@code extent.width} <b>must</b> be a multiple of the compressed texel block width or ({@code extent.width} + {@code dstOffset.x}) <b>must</b> equal the destination image subresource width</li>
 * <li>{@code extent.height} <b>must</b> be a multiple of the compressed texel block height or ({@code extent.height} + {@code dstOffset.y}) <b>must</b> equal the destination image subresource height</li>
 * <li>{@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or ({@code extent.depth} + {@code dstOffset.z}) <b>must</b> equal the destination image subresource depth</li>
 * </ul>
 * </li>
 * <li>{@code srcOffset}, {@code dstOffset}, and {@code extent} <b>must</b> respect the image transfer granularity requirements of the queue family that it will be submitted against, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-physical-device-enumeration">Physical Device Enumeration</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code srcSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * <li>{@code dstSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}, {@link VK10#vkCmdCopyImage CmdCopyImage}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code srcSubresource} &ndash; {@code srcSubresource} and {@code dstSubresource} are {@link VkImageSubresourceLayers} structures specifying the image subresources of the images used for the source and destination image data, respectively.</li>
 * <li>{@code srcOffset} &ndash; {@code srcOffset} and {@code dstOffset} select the initial x, y, and z offsets in texels of the sub-regions of the source and destination image data.</li>
 * <li>{@code dstSubresource} &ndash; see {@code srcSubresource}</li>
 * <li>{@code dstOffset} &ndash; see {@code srcOffset}</li>
 * <li>{@code extent} &ndash; the size in texels of the source image to copy in {@code width}, {@code height} and {@code depth}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageCopy {
    {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
    {@link VkOffset3D VkOffset3D} srcOffset;
    {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
    {@link VkOffset3D VkOffset3D} dstOffset;
    {@link VkExtent3D VkExtent3D} extent;
}</code></pre>
 */
public class VkImageCopy extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SRCSUBRESOURCE,
		SRCOFFSET,
		DSTSUBRESOURCE,
		DSTOFFSET,
		EXTENT;

	static {
		Layout layout = __struct(
			__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
			__member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
			__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
			__member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
			__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SRCSUBRESOURCE = layout.offsetof(0);
		SRCOFFSET = layout.offsetof(1);
		DSTSUBRESOURCE = layout.offsetof(2);
		DSTOFFSET = layout.offsetof(3);
		EXTENT = layout.offsetof(4);
	}

	VkImageCopy(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageCopy(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
	public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
	/** Returns a {@link VkOffset3D} view of the {@code srcOffset} field. */
	public VkOffset3D srcOffset() { return nsrcOffset(address()); }
	/** Returns a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
	public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
	/** Returns a {@link VkOffset3D} view of the {@code dstOffset} field. */
	public VkOffset3D dstOffset() { return ndstOffset(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
	public VkExtent3D extent() { return nextent(address()); }

	/** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
	public VkImageCopy srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
	public VkImageCopy srcOffset(VkOffset3D value) { nsrcOffset(address(), value); return this; }
	/** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
	public VkImageCopy dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
	public VkImageCopy dstOffset(VkOffset3D value) { ndstOffset(address(), value); return this; }
	/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
	public VkImageCopy extent(VkExtent3D value) { nextent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageCopy set(
		VkImageSubresourceLayers srcSubresource,
		VkOffset3D srcOffset,
		VkImageSubresourceLayers dstSubresource,
		VkOffset3D dstOffset,
		VkExtent3D extent
	) {
		srcSubresource(srcSubresource);
		srcOffset(srcOffset);
		dstSubresource(dstSubresource);
		dstOffset(dstOffset);
		extent(extent);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkImageCopy set(VkImageCopy src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkImageCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageCopy malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageCopy calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageCopy} instance allocated with {@link BufferUtils}. */
	public static VkImageCopy create() {
		return new VkImageCopy(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageCopy} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageCopy create(long address) {
		return address == NULL ? null : new VkImageCopy(address, null);
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageCopy.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImageCopy} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImageCopy mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImageCopy} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImageCopy callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImageCopy} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageCopy mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageCopy callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #srcSubresource}. */
	public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageCopy.SRCSUBRESOURCE); }
	/** Unsafe version of {@link #srcOffset}. */
	public static VkOffset3D nsrcOffset(long struct) { return VkOffset3D.create(struct + VkImageCopy.SRCOFFSET); }
	/** Unsafe version of {@link #dstSubresource}. */
	public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageCopy.DSTSUBRESOURCE); }
	/** Unsafe version of {@link #dstOffset}. */
	public static VkOffset3D ndstOffset(long struct) { return VkOffset3D.create(struct + VkImageCopy.DSTOFFSET); }
	/** Unsafe version of {@link #extent}. */
	public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCopy.EXTENT); }

	/** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
	public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageCopy.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
	/** Unsafe version of {@link #srcOffset(VkOffset3D) srcOffset}. */
	public static void nsrcOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageCopy.SRCOFFSET, VkOffset3D.SIZEOF); }
	/** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
	public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageCopy.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
	/** Unsafe version of {@link #dstOffset(VkOffset3D) dstOffset}. */
	public static void ndstOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageCopy.DSTOFFSET, VkOffset3D.SIZEOF); }
	/** Unsafe version of {@link #extent(VkExtent3D) extent}. */
	public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCopy.EXTENT, VkExtent3D.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkImageCopy} structs. */
	public static class Buffer extends StructBuffer<VkImageCopy, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkImageCopy.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageCopy#SIZEOF}, and its mark will be undefined.
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
		protected VkImageCopy newInstance(long address) {
			return new VkImageCopy(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
		public VkImageSubresourceLayers srcSubresource() { return VkImageCopy.nsrcSubresource(address()); }
		/** Returns a {@link VkOffset3D} view of the {@code srcOffset} field. */
		public VkOffset3D srcOffset() { return VkImageCopy.nsrcOffset(address()); }
		/** Returns a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
		public VkImageSubresourceLayers dstSubresource() { return VkImageCopy.ndstSubresource(address()); }
		/** Returns a {@link VkOffset3D} view of the {@code dstOffset} field. */
		public VkOffset3D dstOffset() { return VkImageCopy.ndstOffset(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
		public VkExtent3D extent() { return VkImageCopy.nextent(address()); }

		/** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
		public VkImageCopy.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageCopy.nsrcSubresource(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
		public VkImageCopy.Buffer srcOffset(VkOffset3D value) { VkImageCopy.nsrcOffset(address(), value); return this; }
		/** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
		public VkImageCopy.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageCopy.ndstSubresource(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
		public VkImageCopy.Buffer dstOffset(VkOffset3D value) { VkImageCopy.ndstOffset(address(), value); return this; }
		/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
		public VkImageCopy.Buffer extent(VkExtent3D value) { VkImageCopy.nextent(address(), value); return this; }

	}

}