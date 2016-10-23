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
 * Structure specifying a buffer image copy operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>When copying to or from a depth or stencil aspect, the data in buffer memory uses a layout that is a (mostly) tightly packed representation of the depth or stencil data. Specifically:</p>
 * 
 * <ul>
 * <li>data copied to or from the stencil aspect of any depth/stencil format is tightly packed with one {@link VK10#VK_FORMAT_S8_UINT FORMAT_S8_UINT} value per texel.</li>
 * <li>data copied to or from the depth aspect of a {@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM} or {@link VK10#VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT} format is tightly packed with one {@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM} value per texel.</li>
 * <li>data copied to or from the depth aspect of a {@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT} or {@link VK10#VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT} format is tightly packed with one {@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT} value per texel.</li>
 * <li>data copied to or from the depth aspect of a {@link VK10#VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32} or {@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT} format is packed with one 32-bit word per texel with the D24 value in the LSBs of the word, and undefined values in the eight MSBs.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>To copy both the depth and stencil aspects of a depth/stencil format, two entries in {@code pRegions} <b>can</b> be used, where one specifies the depth aspect in {@code imageSubresource}, and the other specifies the stencil aspect.</p>
 * </div>
 * 
 * <p>Because depth or stencil aspect buffer to image copies <b>may</b> require format conversions on some implementations, they are not supported on queues that do not support graphics. When copying to a depth aspect, the data in buffer memory <b>must</b> be in the the range <code>[0,1]</code> or undefined results occur.</p>
 * 
 * <p>Copies are done layer by layer starting with image layer {@code baseArrayLayer} member of {@code imageSubresource}. {@code layerCount} layers are copied from the source image or to the destination image.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code bufferOffset} <b>must</b> be a multiple of the calling command&#8217;s {@code VkImage} parameter&#8217;s format&#8217;s element size</li>
 * <li>{@code bufferOffset} <b>must</b> be a multiple of 4</li>
 * <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
 * <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
 * <li>{@code imageOffset.x} and ({@code imageExtent.width} + {@code imageOffset.x}) <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource width</li>
 * <li>{@code imageOffset.y} and (imageExtent.height + {@code imageOffset.y}) <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource height
 * 
 * <ul>
 * <li>If the calling command&#8217;s {@code srcImage} ({@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}) or {@code dstImage} ({@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}) is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1.</li>
 * </ul>
 * </li>
 * <li>{@code imageOffset.z} and (imageExtent.depth + {@code imageOffset.z}) <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource depth
 * 
 * <ul>
 * <li>If the calling command&#8217;s {@code srcImage} ({@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}) or {@code dstImage} ({@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}) is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1.</li>
 * </ul>
 * </li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image:
 * 
 * <ul>
 * <li>{@code bufferRowLength} <b>must</b> be a multiple of the compressed texel block width</li>
 * <li>{@code bufferImageHeight} <b>must</b> be a multiple of the compressed texel block height</li>
 * <li>all members of {@code imageOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>{@code bufferOffset} <b>must</b> be a multiple of the compressed texel block size in bytes</li>
 * <li>{@code imageExtent.width} <b>must</b> be a multiple of the compressed texel block width or ({@code imageExtent.width} + {@code imageOffset.x}) <b>must</b> equal the image subresource width</li>
 * <li>{@code imageExtent.height} <b>must</b> be a multiple of the compressed texel block height or ({@code imageExtent.height} + {@code imageOffset.y}) <b>must</b> equal the image subresource height</li>
 * <li>{@code imageExtent.depth} <b>must</b> be a multiple of the compressed texel block depth or ({@code imageExtent.depth} + {@code imageOffset.z}) <b>must</b> equal the image subresource depth</li>
 * </ul>
 * </li>
 * <li>{@code bufferOffset}, {@code bufferRowLength}, {@code bufferImageHeight} and all members of {@code imageOffset} and {@code imageExtent} <b>must</b> respect the image transfer granularity requirements of the queue family that it will be submitted against, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#devsandqueues-physical-device-enumeration">Physical Device Enumeration</a></li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code VkImage} parameter</li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is of {@code VkImageType} {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, the {@code baseArrayLayer} and {@code layerCount} members of {@code imageSubresource} <b>must</b> be 0 and 1, respectively</li>
 * <li>When copying to the depth aspect of an image subresource, the data in the source buffer <b>must</b> be in the range <code>[0,1]</code></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code imageSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}, {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bufferOffset} &ndash; the offset in bytes from the start of the buffer object where the image data is copied from or to.</li>
 * <li>{@code bufferRowLength} &ndash; {@code bufferRowLength} and {@code bufferImageHeight} specify the data in buffer memory as a subregion of a larger two- or three-dimensional image, and control the addressing calculations of data in buffer memory. If either of these values is zero, that aspect of the buffer memory is considered to be tightly packed according to the {@code imageExtent}.</li>
 * <li>{@code bufferImageHeight} &ndash; see {@code bufferRowLength}</li>
 * <li>{@code imageSubresource} &ndash; a {@link VkImageSubresourceLayers} used to specify the specific image subresources of the image used for the source or destination image data.</li>
 * <li>{@code imageOffset} &ndash; selects the initial x, y, z offsets in texels of the sub-region of the source or destination image data.</li>
 * <li>{@code imageExtent} &ndash; the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkBufferImageCopy {
    VkDeviceSize bufferOffset;
    uint32_t bufferRowLength;
    uint32_t bufferImageHeight;
    {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
    {@link VkOffset3D VkOffset3D} imageOffset;
    {@link VkExtent3D VkExtent3D} imageExtent;
}</code></pre>
 */
public class VkBufferImageCopy extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BUFFEROFFSET,
		BUFFERROWLENGTH,
		BUFFERIMAGEHEIGHT,
		IMAGESUBRESOURCE,
		IMAGEOFFSET,
		IMAGEEXTENT;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4),
			__member(4),
			__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
			__member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
			__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BUFFEROFFSET = layout.offsetof(0);
		BUFFERROWLENGTH = layout.offsetof(1);
		BUFFERIMAGEHEIGHT = layout.offsetof(2);
		IMAGESUBRESOURCE = layout.offsetof(3);
		IMAGEOFFSET = layout.offsetof(4);
		IMAGEEXTENT = layout.offsetof(5);
	}

	VkBufferImageCopy(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBufferImageCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBufferImageCopy(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code bufferOffset} field. */
	public long bufferOffset() { return nbufferOffset(address()); }
	/** Returns the value of the {@code bufferRowLength} field. */
	public int bufferRowLength() { return nbufferRowLength(address()); }
	/** Returns the value of the {@code bufferImageHeight} field. */
	public int bufferImageHeight() { return nbufferImageHeight(address()); }
	/** Returns a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
	public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
	/** Returns a {@link VkOffset3D} view of the {@code imageOffset} field. */
	public VkOffset3D imageOffset() { return nimageOffset(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code imageExtent} field. */
	public VkExtent3D imageExtent() { return nimageExtent(address()); }

	/** Sets the specified value to the {@code bufferOffset} field. */
	public VkBufferImageCopy bufferOffset(long value) { nbufferOffset(address(), value); return this; }
	/** Sets the specified value to the {@code bufferRowLength} field. */
	public VkBufferImageCopy bufferRowLength(int value) { nbufferRowLength(address(), value); return this; }
	/** Sets the specified value to the {@code bufferImageHeight} field. */
	public VkBufferImageCopy bufferImageHeight(int value) { nbufferImageHeight(address(), value); return this; }
	/** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
	public VkBufferImageCopy imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
	public VkBufferImageCopy imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
	/** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
	public VkBufferImageCopy imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBufferImageCopy set(
		long bufferOffset,
		int bufferRowLength,
		int bufferImageHeight,
		VkImageSubresourceLayers imageSubresource,
		VkOffset3D imageOffset,
		VkExtent3D imageExtent
	) {
		bufferOffset(bufferOffset);
		bufferRowLength(bufferRowLength);
		bufferImageHeight(bufferImageHeight);
		imageSubresource(imageSubresource);
		imageOffset(imageOffset);
		imageExtent(imageExtent);

		return this;
	}

	/** Unsafe version of {@link #set(VkBufferImageCopy) set}. */
	public VkBufferImageCopy nset(long struct) {
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
	public VkBufferImageCopy set(VkBufferImageCopy src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferImageCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkBufferImageCopy malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBufferImageCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkBufferImageCopy calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBufferImageCopy} instance allocated with {@link BufferUtils}. */
	public static VkBufferImageCopy create() {
		return new VkBufferImageCopy(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBufferImageCopy} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBufferImageCopy create(long address) {
		return address == NULL ? null : new VkBufferImageCopy(address, null);
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBufferImageCopy.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferImageCopy} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkBufferImageCopy mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkBufferImageCopy} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkBufferImageCopy callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkBufferImageCopy} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferImageCopy mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferImageCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferImageCopy callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #bufferOffset}. */
	public static long nbufferOffset(long struct) { return memGetLong(struct + VkBufferImageCopy.BUFFEROFFSET); }
	/** Unsafe version of {@link #bufferRowLength}. */
	public static int nbufferRowLength(long struct) { return memGetInt(struct + VkBufferImageCopy.BUFFERROWLENGTH); }
	/** Unsafe version of {@link #bufferImageHeight}. */
	public static int nbufferImageHeight(long struct) { return memGetInt(struct + VkBufferImageCopy.BUFFERIMAGEHEIGHT); }
	/** Unsafe version of {@link #imageSubresource}. */
	public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkBufferImageCopy.IMAGESUBRESOURCE); }
	/** Unsafe version of {@link #imageOffset}. */
	public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkBufferImageCopy.IMAGEOFFSET); }
	/** Unsafe version of {@link #imageExtent}. */
	public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkBufferImageCopy.IMAGEEXTENT); }

	/** Unsafe version of {@link #bufferOffset(long) bufferOffset}. */
	public static void nbufferOffset(long struct, long value) { memPutLong(struct + VkBufferImageCopy.BUFFEROFFSET, value); }
	/** Unsafe version of {@link #bufferRowLength(int) bufferRowLength}. */
	public static void nbufferRowLength(long struct, int value) { memPutInt(struct + VkBufferImageCopy.BUFFERROWLENGTH, value); }
	/** Unsafe version of {@link #bufferImageHeight(int) bufferImageHeight}. */
	public static void nbufferImageHeight(long struct, int value) { memPutInt(struct + VkBufferImageCopy.BUFFERIMAGEHEIGHT, value); }
	/** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
	public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
	/** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
	public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGEOFFSET, VkOffset3D.SIZEOF); }
	/** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
	public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGEEXTENT, VkExtent3D.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkBufferImageCopy} structs. */
	public static class Buffer extends StructBuffer<VkBufferImageCopy, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkBufferImageCopy.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBufferImageCopy#SIZEOF}, and its mark will be undefined.
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
		protected VkBufferImageCopy newInstance(long address) {
			return new VkBufferImageCopy(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code bufferOffset} field. */
		public long bufferOffset() { return VkBufferImageCopy.nbufferOffset(address()); }
		/** Returns the value of the {@code bufferRowLength} field. */
		public int bufferRowLength() { return VkBufferImageCopy.nbufferRowLength(address()); }
		/** Returns the value of the {@code bufferImageHeight} field. */
		public int bufferImageHeight() { return VkBufferImageCopy.nbufferImageHeight(address()); }
		/** Returns a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
		public VkImageSubresourceLayers imageSubresource() { return VkBufferImageCopy.nimageSubresource(address()); }
		/** Returns a {@link VkOffset3D} view of the {@code imageOffset} field. */
		public VkOffset3D imageOffset() { return VkBufferImageCopy.nimageOffset(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code imageExtent} field. */
		public VkExtent3D imageExtent() { return VkBufferImageCopy.nimageExtent(address()); }

		/** Sets the specified value to the {@code bufferOffset} field. */
		public VkBufferImageCopy.Buffer bufferOffset(long value) { VkBufferImageCopy.nbufferOffset(address(), value); return this; }
		/** Sets the specified value to the {@code bufferRowLength} field. */
		public VkBufferImageCopy.Buffer bufferRowLength(int value) { VkBufferImageCopy.nbufferRowLength(address(), value); return this; }
		/** Sets the specified value to the {@code bufferImageHeight} field. */
		public VkBufferImageCopy.Buffer bufferImageHeight(int value) { VkBufferImageCopy.nbufferImageHeight(address(), value); return this; }
		/** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
		public VkBufferImageCopy.Buffer imageSubresource(VkImageSubresourceLayers value) { VkBufferImageCopy.nimageSubresource(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
		public VkBufferImageCopy.Buffer imageOffset(VkOffset3D value) { VkBufferImageCopy.nimageOffset(address(), value); return this; }
		/** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
		public VkBufferImageCopy.Buffer imageExtent(VkExtent3D value) { VkBufferImageCopy.nimageExtent(address(), value); return this; }

	}

}