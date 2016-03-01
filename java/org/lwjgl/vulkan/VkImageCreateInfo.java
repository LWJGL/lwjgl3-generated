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
 * <pre><code>struct VkImageCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkImageCreateFlags flags;
    VkImageType imageType;
    VkFormat format;
    {@link VkExtent3D VkExtent3D} extent;
    uint32_t mipLevels;
    uint32_t arrayLayers;
    VkSampleCountFlagBits samples;
    VkImageTiling tiling;
    VkImageUsageFlags usage;
    VkSharingMode sharingMode;
    uint32_t queueFamilyIndexCount;
    const uint32_t * pQueueFamilyIndices;
    VkImageLayout initialLayout;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * </table>
 */
public class VkImageCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		IMAGETYPE,
		FORMAT,
		EXTENT,
		MIPLEVELS,
		ARRAYLAYERS,
		SAMPLES,
		TILING,
		USAGE,
		SHARINGMODE,
		QUEUEFAMILYINDEXCOUNT,
		PQUEUEFAMILYINDICES,
		INITIALLAYOUT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(VkExtent3D.SIZEOF, VkExtent3D.__ALIGNMENT),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		IMAGETYPE = layout.offsetof(3);
		FORMAT = layout.offsetof(4);
		EXTENT = layout.offsetof(5);
		MIPLEVELS = layout.offsetof(6);
		ARRAYLAYERS = layout.offsetof(7);
		SAMPLES = layout.offsetof(8);
		TILING = layout.offsetof(9);
		USAGE = layout.offsetof(10);
		SHARINGMODE = layout.offsetof(11);
		QUEUEFAMILYINDEXCOUNT = layout.offsetof(12);
		PQUEUEFAMILYINDICES = layout.offsetof(13);
		INITIALLAYOUT = layout.offsetof(14);
	}

	VkImageCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code imageType} field. */
	public int imageType() { return nimageType(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
	public VkExtent3D extent() { return nextent(address()); }
	/** Returns the value of the {@code mipLevels} field. */
	public int mipLevels() { return nmipLevels(address()); }
	/** Returns the value of the {@code arrayLayers} field. */
	public int arrayLayers() { return narrayLayers(address()); }
	/** Returns the value of the {@code samples} field. */
	public int samples() { return nsamples(address()); }
	/** Returns the value of the {@code tiling} field. */
	public int tiling() { return ntiling(address()); }
	/** Returns the value of the {@code usage} field. */
	public int usage() { return nusage(address()); }
	/** Returns the value of the {@code sharingMode} field. */
	public int sharingMode() { return nsharingMode(address()); }
	/** Returns the value of the {@code queueFamilyIndexCount} field. */
	public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
	public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
	/** Returns the value of the {@code initialLayout} field. */
	public int initialLayout() { return ninitialLayout(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImageCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImageCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkImageCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code imageType} field. */
	public VkImageCreateInfo imageType(int value) { nimageType(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkImageCreateInfo format(int value) { nformat(address(), value); return this; }
	/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
	public VkImageCreateInfo extent(VkExtent3D value) { nextent(address(), value); return this; }
	/** Sets the specified value to the {@code mipLevels} field. */
	public VkImageCreateInfo mipLevels(int value) { nmipLevels(address(), value); return this; }
	/** Sets the specified value to the {@code arrayLayers} field. */
	public VkImageCreateInfo arrayLayers(int value) { narrayLayers(address(), value); return this; }
	/** Sets the specified value to the {@code samples} field. */
	public VkImageCreateInfo samples(int value) { nsamples(address(), value); return this; }
	/** Sets the specified value to the {@code tiling} field. */
	public VkImageCreateInfo tiling(int value) { ntiling(address(), value); return this; }
	/** Sets the specified value to the {@code usage} field. */
	public VkImageCreateInfo usage(int value) { nusage(address(), value); return this; }
	/** Sets the specified value to the {@code sharingMode} field. */
	public VkImageCreateInfo sharingMode(int value) { nsharingMode(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
	public VkImageCreateInfo pQueueFamilyIndices(IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
	/** Sets the specified value to the {@code initialLayout} field. */
	public VkImageCreateInfo initialLayout(int value) { ninitialLayout(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int imageType,
		int format,
		VkExtent3D extent,
		int mipLevels,
		int arrayLayers,
		int samples,
		int tiling,
		int usage,
		int sharingMode,
		IntBuffer pQueueFamilyIndices,
		int initialLayout
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		imageType(imageType);
		format(format);
		extent(extent);
		mipLevels(mipLevels);
		arrayLayers(arrayLayers);
		samples(samples);
		tiling(tiling);
		usage(usage);
		sharingMode(sharingMode);
		pQueueFamilyIndices(pQueueFamilyIndices);
		initialLayout(initialLayout);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageCreateInfo) set}. */
	public VkImageCreateInfo nset(long struct) {
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
	public VkImageCreateInfo set(VkImageCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkImageCreateInfo create() {
		return new VkImageCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageCreateInfo create(long address) {
		return address == NULL ? null : new VkImageCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImageCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImageCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkImageCreateInfo.FLAGS); }
	/** Unsafe version of {@link #imageType}. */
	public static int nimageType(long struct) { return memGetInt(struct + VkImageCreateInfo.IMAGETYPE); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkImageCreateInfo.FORMAT); }
	/** Unsafe version of {@link #extent}. */
	public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCreateInfo.EXTENT); }
	/** Unsafe version of {@link #mipLevels}. */
	public static int nmipLevels(long struct) { return memGetInt(struct + VkImageCreateInfo.MIPLEVELS); }
	/** Unsafe version of {@link #arrayLayers}. */
	public static int narrayLayers(long struct) { return memGetInt(struct + VkImageCreateInfo.ARRAYLAYERS); }
	/** Unsafe version of {@link #samples}. */
	public static int nsamples(long struct) { return memGetInt(struct + VkImageCreateInfo.SAMPLES); }
	/** Unsafe version of {@link #tiling}. */
	public static int ntiling(long struct) { return memGetInt(struct + VkImageCreateInfo.TILING); }
	/** Unsafe version of {@link #usage}. */
	public static int nusage(long struct) { return memGetInt(struct + VkImageCreateInfo.USAGE); }
	/** Unsafe version of {@link #sharingMode}. */
	public static int nsharingMode(long struct) { return memGetInt(struct + VkImageCreateInfo.SHARINGMODE); }
	/** Unsafe version of {@link #queueFamilyIndexCount}. */
	public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT); }
	/** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
	public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
	/** Unsafe version of {@link #initialLayout}. */
	public static int ninitialLayout(long struct) { return memGetInt(struct + VkImageCreateInfo.INITIALLAYOUT); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImageCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkImageCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #imageType(int) imageType}. */
	public static void nimageType(long struct, int value) { memPutInt(struct + VkImageCreateInfo.IMAGETYPE, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkImageCreateInfo.FORMAT, value); }
	/** Unsafe version of {@link #extent(VkExtent3D) extent}. */
	public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCreateInfo.EXTENT, VkExtent3D.SIZEOF); }
	/** Unsafe version of {@link #mipLevels(int) mipLevels}. */
	public static void nmipLevels(long struct, int value) { memPutInt(struct + VkImageCreateInfo.MIPLEVELS, value); }
	/** Unsafe version of {@link #arrayLayers(int) arrayLayers}. */
	public static void narrayLayers(long struct, int value) { memPutInt(struct + VkImageCreateInfo.ARRAYLAYERS, value); }
	/** Unsafe version of {@link #samples(int) samples}. */
	public static void nsamples(long struct, int value) { memPutInt(struct + VkImageCreateInfo.SAMPLES, value); }
	/** Unsafe version of {@link #tiling(int) tiling}. */
	public static void ntiling(long struct, int value) { memPutInt(struct + VkImageCreateInfo.TILING, value); }
	/** Unsafe version of {@link #usage(int) usage}. */
	public static void nusage(long struct, int value) { memPutInt(struct + VkImageCreateInfo.USAGE, value); }
	/** Unsafe version of {@link #sharingMode(int) sharingMode}. */
	public static void nsharingMode(long struct, int value) { memPutInt(struct + VkImageCreateInfo.SHARINGMODE, value); }
	/** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
	public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
	/** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
	public static void npQueueFamilyIndices(long struct, IntBuffer value) { memPutAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); nqueueFamilyIndexCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #initialLayout(int) initialLayout}. */
	public static void ninitialLayout(long struct, int value) { memPutInt(struct + VkImageCreateInfo.INITIALLAYOUT, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nqueueFamilyIndexCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkImageCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkImageCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkImageCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkImageCreateInfo newInstance(long address) {
			return new VkImageCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImageCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImageCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkImageCreateInfo.nflags(address()); }
		/** Returns the value of the {@code imageType} field. */
		public int imageType() { return VkImageCreateInfo.nimageType(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkImageCreateInfo.nformat(address()); }
		/** Returns a {@link VkExtent3D} view of the {@code extent} field. */
		public VkExtent3D extent() { return VkImageCreateInfo.nextent(address()); }
		/** Returns the value of the {@code mipLevels} field. */
		public int mipLevels() { return VkImageCreateInfo.nmipLevels(address()); }
		/** Returns the value of the {@code arrayLayers} field. */
		public int arrayLayers() { return VkImageCreateInfo.narrayLayers(address()); }
		/** Returns the value of the {@code samples} field. */
		public int samples() { return VkImageCreateInfo.nsamples(address()); }
		/** Returns the value of the {@code tiling} field. */
		public int tiling() { return VkImageCreateInfo.ntiling(address()); }
		/** Returns the value of the {@code usage} field. */
		public int usage() { return VkImageCreateInfo.nusage(address()); }
		/** Returns the value of the {@code sharingMode} field. */
		public int sharingMode() { return VkImageCreateInfo.nsharingMode(address()); }
		/** Returns the value of the {@code queueFamilyIndexCount} field. */
		public int queueFamilyIndexCount() { return VkImageCreateInfo.nqueueFamilyIndexCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
		public IntBuffer pQueueFamilyIndices() { return VkImageCreateInfo.npQueueFamilyIndices(address()); }
		/** Returns the value of the {@code initialLayout} field. */
		public int initialLayout() { return VkImageCreateInfo.ninitialLayout(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImageCreateInfo.Buffer sType(int value) { VkImageCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImageCreateInfo.Buffer pNext(long value) { VkImageCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkImageCreateInfo.Buffer flags(int value) { VkImageCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code imageType} field. */
		public VkImageCreateInfo.Buffer imageType(int value) { VkImageCreateInfo.nimageType(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkImageCreateInfo.Buffer format(int value) { VkImageCreateInfo.nformat(address(), value); return this; }
		/** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
		public VkImageCreateInfo.Buffer extent(VkExtent3D value) { VkImageCreateInfo.nextent(address(), value); return this; }
		/** Sets the specified value to the {@code mipLevels} field. */
		public VkImageCreateInfo.Buffer mipLevels(int value) { VkImageCreateInfo.nmipLevels(address(), value); return this; }
		/** Sets the specified value to the {@code arrayLayers} field. */
		public VkImageCreateInfo.Buffer arrayLayers(int value) { VkImageCreateInfo.narrayLayers(address(), value); return this; }
		/** Sets the specified value to the {@code samples} field. */
		public VkImageCreateInfo.Buffer samples(int value) { VkImageCreateInfo.nsamples(address(), value); return this; }
		/** Sets the specified value to the {@code tiling} field. */
		public VkImageCreateInfo.Buffer tiling(int value) { VkImageCreateInfo.ntiling(address(), value); return this; }
		/** Sets the specified value to the {@code usage} field. */
		public VkImageCreateInfo.Buffer usage(int value) { VkImageCreateInfo.nusage(address(), value); return this; }
		/** Sets the specified value to the {@code sharingMode} field. */
		public VkImageCreateInfo.Buffer sharingMode(int value) { VkImageCreateInfo.nsharingMode(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
		public VkImageCreateInfo.Buffer pQueueFamilyIndices(IntBuffer value) { VkImageCreateInfo.npQueueFamilyIndices(address(), value); return this; }
		/** Sets the specified value to the {@code initialLayout} field. */
		public VkImageCreateInfo.Buffer initialLayout(int value) { VkImageCreateInfo.ninitialLayout(address(), value); return this; }

	}

}