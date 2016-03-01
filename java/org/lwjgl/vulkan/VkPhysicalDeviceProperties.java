/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceProperties {
    uint32_t apiVersion;
    uint32_t driverVersion;
    uint32_t vendorID;
    uint32_t deviceID;
    VkPhysicalDeviceType deviceType;
    char[256] deviceName;
    uint8_t[16] pipelineCacheUUID;
    {@link VkPhysicalDeviceLimits VkPhysicalDeviceLimits} limits;
    {@link VkPhysicalDeviceSparseProperties VkPhysicalDeviceSparseProperties} sparseProperties;
}</code></pre>
 */
public class VkPhysicalDeviceProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		APIVERSION,
		DRIVERVERSION,
		VENDORID,
		DEVICEID,
		DEVICETYPE,
		DEVICENAME,
		PIPELINECACHEUUID,
		LIMITS,
		SPARSEPROPERTIES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__array(1, 256),
			__array(1, 16),
			__member(VkPhysicalDeviceLimits.SIZEOF, VkPhysicalDeviceLimits.__ALIGNMENT),
			__member(VkPhysicalDeviceSparseProperties.SIZEOF, VkPhysicalDeviceSparseProperties.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		APIVERSION = layout.offsetof(0);
		DRIVERVERSION = layout.offsetof(1);
		VENDORID = layout.offsetof(2);
		DEVICEID = layout.offsetof(3);
		DEVICETYPE = layout.offsetof(4);
		DEVICENAME = layout.offsetof(5);
		PIPELINECACHEUUID = layout.offsetof(6);
		LIMITS = layout.offsetof(7);
		SPARSEPROPERTIES = layout.offsetof(8);
	}

	VkPhysicalDeviceProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code apiVersion} field. */
	public int apiVersion() { return napiVersion(address()); }
	/** Returns the value of the {@code driverVersion} field. */
	public int driverVersion() { return ndriverVersion(address()); }
	/** Returns the value of the {@code vendorID} field. */
	public int vendorID() { return nvendorID(address()); }
	/** Returns the value of the {@code deviceID} field. */
	public int deviceID() { return ndeviceID(address()); }
	/** Returns the value of the {@code deviceType} field. */
	public int deviceType() { return ndeviceType(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code deviceName} field. */
	public ByteBuffer deviceName() { return ndeviceName(address()); }
	/** Decodes the null-terminated string stored in the {@code deviceName} field. */
	public String deviceNameString() { return ndeviceNameString(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
	public ByteBuffer pipelineCacheUUID() { return npipelineCacheUUID(address()); }
	/** Returns the value at the specified index of the {@code pipelineCacheUUID} field. */
	public byte pipelineCacheUUID(int index) { return npipelineCacheUUID(address(), index); }
	/** Returns a {@link VkPhysicalDeviceLimits} view of the {@code limits} field. */
	public VkPhysicalDeviceLimits limits() { return nlimits(address()); }
	/** Returns a {@link VkPhysicalDeviceSparseProperties} view of the {@code sparseProperties} field. */
	public VkPhysicalDeviceSparseProperties sparseProperties() { return nsparseProperties(address()); }

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceProperties} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceProperties create() {
		return new VkPhysicalDeviceProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceProperties create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceProperties(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #apiVersion}. */
	public static int napiVersion(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.APIVERSION); }
	/** Unsafe version of {@link #driverVersion}. */
	public static int ndriverVersion(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.DRIVERVERSION); }
	/** Unsafe version of {@link #vendorID}. */
	public static int nvendorID(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.VENDORID); }
	/** Unsafe version of {@link #deviceID}. */
	public static int ndeviceID(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.DEVICEID); }
	/** Unsafe version of {@link #deviceType}. */
	public static int ndeviceType(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.DEVICETYPE); }
	/** Unsafe version of {@link #deviceName}. */
	public static ByteBuffer ndeviceName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceProperties.DEVICENAME, 256); }
	/** Unsafe version of {@link #deviceNameString}. */
	public static String ndeviceNameString(long struct) { return memDecodeUTF8(struct + VkPhysicalDeviceProperties.DEVICENAME); }
	/** Unsafe version of {@link #pipelineCacheUUID}. */
	public static ByteBuffer npipelineCacheUUID(long struct) {
		return memByteBuffer(struct + VkPhysicalDeviceProperties.PIPELINECACHEUUID, 16);
	}
	/** Unsafe version of {@link #pipelineCacheUUID(int) pipelineCacheUUID}. */
	public static byte npipelineCacheUUID(long struct, int index) { return memGetByte(struct + VkPhysicalDeviceProperties.PIPELINECACHEUUID + index * 1); }
	/** Unsafe version of {@link #limits}. */
	public static VkPhysicalDeviceLimits nlimits(long struct) { return VkPhysicalDeviceLimits.create(struct + VkPhysicalDeviceProperties.LIMITS); }
	/** Unsafe version of {@link #sparseProperties}. */
	public static VkPhysicalDeviceSparseProperties nsparseProperties(long struct) { return VkPhysicalDeviceSparseProperties.create(struct + VkPhysicalDeviceProperties.SPARSEPROPERTIES); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceProperties} structs. */
	public static final class Buffer extends StructBuffer<VkPhysicalDeviceProperties, Buffer> {

		/**
		 * Creates a new {@link VkPhysicalDeviceProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceProperties newInstance(long address) {
			return new VkPhysicalDeviceProperties(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code apiVersion} field. */
		public int apiVersion() { return VkPhysicalDeviceProperties.napiVersion(address()); }
		/** Returns the value of the {@code driverVersion} field. */
		public int driverVersion() { return VkPhysicalDeviceProperties.ndriverVersion(address()); }
		/** Returns the value of the {@code vendorID} field. */
		public int vendorID() { return VkPhysicalDeviceProperties.nvendorID(address()); }
		/** Returns the value of the {@code deviceID} field. */
		public int deviceID() { return VkPhysicalDeviceProperties.ndeviceID(address()); }
		/** Returns the value of the {@code deviceType} field. */
		public int deviceType() { return VkPhysicalDeviceProperties.ndeviceType(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code deviceName} field. */
		public ByteBuffer deviceName() { return VkPhysicalDeviceProperties.ndeviceName(address()); }
		/** Decodes the null-terminated string stored in the {@code deviceName} field. */
		public String deviceNameString() { return VkPhysicalDeviceProperties.ndeviceNameString(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
		public ByteBuffer pipelineCacheUUID() { return VkPhysicalDeviceProperties.npipelineCacheUUID(address()); }
		/** Returns the value at the specified index of the {@code pipelineCacheUUID} field. */
		public byte pipelineCacheUUID(int index) { return VkPhysicalDeviceProperties.npipelineCacheUUID(address(), index); }
		/** Returns a {@link VkPhysicalDeviceLimits} view of the {@code limits} field. */
		public VkPhysicalDeviceLimits limits() { return VkPhysicalDeviceProperties.nlimits(address()); }
		/** Returns a {@link VkPhysicalDeviceSparseProperties} view of the {@code sparseProperties} field. */
		public VkPhysicalDeviceSparseProperties sparseProperties() { return VkPhysicalDeviceProperties.nsparseProperties(address()); }

	}

}