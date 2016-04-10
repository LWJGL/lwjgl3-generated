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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkBufferViewCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkBufferViewCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a buffer view should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>{@code offset} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minTexelBufferOffsetAlignment}</li>
 * <li>If {@code range} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}:</li>
 * <li>{@code range} <b>must</b> be greater than 0</li>
 * <li>{@code range} <b>must</b> be a multiple of the element size of {@code format}</li>
 * <li>{@code range} divided by the size of an element of {@code format}, <b>must</b> be less than or equal to
 * {@link VkPhysicalDeviceLimits}{@code ::maxTexelBufferElements}</li>
 * <li>the sum of {@code offset} and {@code range} <b>must</b> be less than or equal to the size of {@code buffer}</li>
 * <li>{@code buffer} <b>must</b> have been created with a {@code usage} value containing at least one of {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} or
 * {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}</li>
 * <li>If {@code buffer} was created with {@code usage} containing {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT}, {@code format} <b>must</b> be supported for uniform
 * texel buffers, as specified by the {@link VK10#VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT} flag in {@link VkFormatProperties}{@code ::bufferFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code buffer} was created with {@code usage} containing {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT}, {@code format} <b>must</b> be supported for storage
 * texel buffers, as specified by the {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT} flag in {@link VkFormatProperties}{@code ::bufferFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkBufferViewCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkBufferViewCreateFlags flags;
    VkBuffer buffer;
    VkFormat format;
    VkDeviceSize offset;
    VkDeviceSize range;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>sType</td><td>the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO}</td></tr>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * <tr><td>flags</td><td>reserved for future use</td></tr>
 * <tr><td>buffer</td><td>a {@code VkBuffer} on which the view will be created</td></tr>
 * <tr><td>format</td><td>a {@code VkFormat} describing the format of the data elements in the buffer</td></tr>
 * <tr><td>offset</td><td>an offset in bytes from the base address of the buffer</td></tr>
 * <tr><td>range</td><td>a size in bytes of the buffer view</td></tr>
 * </table>
 */
public class VkBufferViewCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		BUFFER,
		FORMAT,
		OFFSET,
		RANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		BUFFER = layout.offsetof(3);
		FORMAT = layout.offsetof(4);
		OFFSET = layout.offsetof(5);
		RANGE = layout.offsetof(6);
	}

	VkBufferViewCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBufferViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBufferViewCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }
	/** Returns the value of the {@code range} field. */
	public long range() { return nrange(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBufferViewCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBufferViewCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkBufferViewCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code buffer} field. */
	public VkBufferViewCreateInfo buffer(long value) { nbuffer(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkBufferViewCreateInfo format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkBufferViewCreateInfo offset(long value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code range} field. */
	public VkBufferViewCreateInfo range(long value) { nrange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBufferViewCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long buffer,
		int format,
		long offset,
		long range
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		buffer(buffer);
		format(format);
		offset(offset);
		range(range);

		return this;
	}

	/** Unsafe version of {@link #set(VkBufferViewCreateInfo) set}. */
	public VkBufferViewCreateInfo nset(long struct) {
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
	public VkBufferViewCreateInfo set(VkBufferViewCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkBufferViewCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkBufferViewCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkBufferViewCreateInfo create() {
		return new VkBufferViewCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBufferViewCreateInfo create(long address) {
		return address == NULL ? null : new VkBufferViewCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBufferViewCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkBufferViewCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkBufferViewCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkBufferViewCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferViewCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkBufferViewCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBufferViewCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.FLAGS); }
	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.BUFFER); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.FORMAT); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.OFFSET); }
	/** Unsafe version of {@link #range}. */
	public static long nrange(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.RANGE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferViewCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.BUFFER, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.FORMAT, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.OFFSET, value); }
	/** Unsafe version of {@link #range(long) range}. */
	public static void nrange(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.RANGE, value); }

	// -----------------------------------

	/** An array of {@link VkBufferViewCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkBufferViewCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkBufferViewCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBufferViewCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkBufferViewCreateInfo newInstance(long address) {
			return new VkBufferViewCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBufferViewCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBufferViewCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkBufferViewCreateInfo.nflags(address()); }
		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkBufferViewCreateInfo.nbuffer(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkBufferViewCreateInfo.nformat(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return VkBufferViewCreateInfo.noffset(address()); }
		/** Returns the value of the {@code range} field. */
		public long range() { return VkBufferViewCreateInfo.nrange(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBufferViewCreateInfo.Buffer sType(int value) { VkBufferViewCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBufferViewCreateInfo.Buffer pNext(long value) { VkBufferViewCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkBufferViewCreateInfo.Buffer flags(int value) { VkBufferViewCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code buffer} field. */
		public VkBufferViewCreateInfo.Buffer buffer(long value) { VkBufferViewCreateInfo.nbuffer(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkBufferViewCreateInfo.Buffer format(int value) { VkBufferViewCreateInfo.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkBufferViewCreateInfo.Buffer offset(long value) { VkBufferViewCreateInfo.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code range} field. */
		public VkBufferViewCreateInfo.Buffer range(long value) { VkBufferViewCreateInfo.nrange(address(), value); return this; }

	}

}