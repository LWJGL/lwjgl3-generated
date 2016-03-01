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

/**
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
public class VkBufferImageCopy extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

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
			__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.__ALIGNMENT),
			__member(VkOffset3D.SIZEOF, VkOffset3D.__ALIGNMENT),
			__member(VkExtent3D.SIZEOF, VkExtent3D.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

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
	public static final class Buffer extends StructBuffer<VkBufferImageCopy, Buffer> {

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