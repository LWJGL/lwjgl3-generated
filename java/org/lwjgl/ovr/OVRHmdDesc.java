/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A complete descriptor of the HMD. */
public final class OVRHmdDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		PRODUCTNAME,
		MANUFACTURER,
		VENDORID,
		PRODUCTID,
		SERIALNUMBER,
		FIRMWAREMAJOR,
		FIRMWAREMINOR,
		CAMERAFRUSTUMHFOVINRADIANS,
		CAMERAFRUSTUMVFOVINRADIANS,
		CAMERAFRUSTUMNEARZINMETERS,
		CAMERAFRUSTUMFARZINMETERS,
		AVAILABLEHMDCAPS,
		DEFAULTHMDCAPS,
		AVAILABLETRACKINGCAPS,
		DEFAULTTRACKINGCAPS,
		DEFAULTEYEFOV,
		MAXEYEFOV,
		RESOLUTION,
		DISPLAYREFRESHRATE;

	static {
		IntBuffer offsets = memAllocInt(20);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		PRODUCTNAME = offsets.get(1);
		MANUFACTURER = offsets.get(2);
		VENDORID = offsets.get(3);
		PRODUCTID = offsets.get(4);
		SERIALNUMBER = offsets.get(5);
		FIRMWAREMAJOR = offsets.get(6);
		FIRMWAREMINOR = offsets.get(7);
		CAMERAFRUSTUMHFOVINRADIANS = offsets.get(8);
		CAMERAFRUSTUMVFOVINRADIANS = offsets.get(9);
		CAMERAFRUSTUMNEARZINMETERS = offsets.get(10);
		CAMERAFRUSTUMFARZINMETERS = offsets.get(11);
		AVAILABLEHMDCAPS = offsets.get(12);
		DEFAULTHMDCAPS = offsets.get(13);
		AVAILABLETRACKINGCAPS = offsets.get(14);
		DEFAULTTRACKINGCAPS = offsets.get(15);
		DEFAULTEYEFOV = offsets.get(16);
		MAXEYEFOV = offsets.get(17);
		RESOLUTION = offsets.get(18);
		DISPLAYREFRESHRATE = offsets.get(19);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRHmdDesc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRHmdDesc} instance at the specified memory address. */
	public OVRHmdDesc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRHmdDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRHmdDesc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getType() { return ngetType(address()); }
	public void getProductName(ByteBuffer ProductName) { ngetProductName(address(), ProductName); }
	public String getProductNameString() { return ngetProductNameString(address()); }
	public String getProductNameString(int byteLen) { return ngetProductNameString(address(), byteLen); }
	public void getManufacturer(ByteBuffer Manufacturer) { ngetManufacturer(address(), Manufacturer); }
	public String getManufacturerString() { return ngetManufacturerString(address()); }
	public String getManufacturerString(int byteLen) { return ngetManufacturerString(address(), byteLen); }
	public int getVendorId() { return ngetVendorId(address()); }
	public int getProductId() { return ngetProductId(address()); }
	public void getSerialNumber(ByteBuffer SerialNumber) { ngetSerialNumber(address(), SerialNumber); }
	public String getSerialNumberString() { return ngetSerialNumberString(address()); }
	public String getSerialNumberString(int byteLen) { return ngetSerialNumberString(address(), byteLen); }
	public int getFirmwareMajor() { return ngetFirmwareMajor(address()); }
	public int getFirmwareMinor() { return ngetFirmwareMinor(address()); }
	public float getCameraFrustumHFovInRadians() { return ngetCameraFrustumHFovInRadians(address()); }
	public float getCameraFrustumVFovInRadians() { return ngetCameraFrustumVFovInRadians(address()); }
	public float getCameraFrustumNearZInMeters() { return ngetCameraFrustumNearZInMeters(address()); }
	public float getCameraFrustumFarZInMeters() { return ngetCameraFrustumFarZInMeters(address()); }
	public int getAvailableHmdCaps() { return ngetAvailableHmdCaps(address()); }
	public int getDefaultHmdCaps() { return ngetDefaultHmdCaps(address()); }
	public int getAvailableTrackingCaps() { return ngetAvailableTrackingCaps(address()); }
	public int getDefaultTrackingCaps() { return ngetDefaultTrackingCaps(address()); }
	public void getDefaultEyeFov(ByteBuffer DefaultEyeFov) { ngetDefaultEyeFov(address(), DefaultEyeFov); }
	public OVRFovPort getDefaultEyeFov(int index) { return ngetDefaultEyeFov(address(), index); }
	public void getMaxEyeFov(ByteBuffer MaxEyeFov) { ngetMaxEyeFov(address(), MaxEyeFov); }
	public OVRFovPort getMaxEyeFov(int index) { return ngetMaxEyeFov(address(), index); }
	public OVRSizei getResolution() { return ngetResolution(address()); }
	public int getResolutionW() { return ngetResolutionW(address()); }
	public int getResolutionH() { return ngetResolutionH(address()); }
	public float getDisplayRefreshRate() { return ngetDisplayRefreshRate(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRHmdDesc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRHmdDesc malloc() {
		return new OVRHmdDesc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRHmdDesc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRHmdDesc calloc() {
		return new OVRHmdDesc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRHmdDesc} instance allocated with {@link BufferUtils}. */
	public static OVRHmdDesc create() {
		return new OVRHmdDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetType(long struct) { return memGetInt(struct + TYPE); }
	public static int getType(ByteBuffer struct) { return ngetType(memAddress(struct)); }
	public static void ngetProductName(long struct, ByteBuffer ProductName) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ProductName, 64 * 1);
		memCopy(struct + PRODUCTNAME, memAddress(ProductName), ProductName.remaining());
	}
	public static void getProductName(ByteBuffer struct, ByteBuffer ProductName) { ngetProductName(memAddress(struct), ProductName); }
	public static String ngetProductNameString(long struct) { return memDecodeUTF8(struct + PRODUCTNAME); }
	public static String getProductNameString(ByteBuffer struct) { return ngetProductNameString(memAddress(struct)); }
	public static String ngetProductNameString(long struct, int byteLen) { return memDecodeUTF8(memByteBuffer(struct + PRODUCTNAME, byteLen)); }
	public static String getProductNameString(ByteBuffer struct, int byteLen) { return ngetProductNameString(memAddress(struct), byteLen); }
	public static void ngetManufacturer(long struct, ByteBuffer Manufacturer) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Manufacturer, 64 * 1);
		memCopy(struct + MANUFACTURER, memAddress(Manufacturer), Manufacturer.remaining());
	}
	public static void getManufacturer(ByteBuffer struct, ByteBuffer Manufacturer) { ngetManufacturer(memAddress(struct), Manufacturer); }
	public static String ngetManufacturerString(long struct) { return memDecodeUTF8(struct + MANUFACTURER); }
	public static String getManufacturerString(ByteBuffer struct) { return ngetManufacturerString(memAddress(struct)); }
	public static String ngetManufacturerString(long struct, int byteLen) { return memDecodeUTF8(memByteBuffer(struct + MANUFACTURER, byteLen)); }
	public static String getManufacturerString(ByteBuffer struct, int byteLen) { return ngetManufacturerString(memAddress(struct), byteLen); }
	public static int ngetVendorId(long struct) { return memGetShort(struct + VENDORID); }
	public static int getVendorId(ByteBuffer struct) { return ngetVendorId(memAddress(struct)); }
	public static int ngetProductId(long struct) { return memGetShort(struct + PRODUCTID); }
	public static int getProductId(ByteBuffer struct) { return ngetProductId(memAddress(struct)); }
	public static void ngetSerialNumber(long struct, ByteBuffer SerialNumber) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(SerialNumber, 24 * 1);
		memCopy(struct + SERIALNUMBER, memAddress(SerialNumber), SerialNumber.remaining());
	}
	public static void getSerialNumber(ByteBuffer struct, ByteBuffer SerialNumber) { ngetSerialNumber(memAddress(struct), SerialNumber); }
	public static String ngetSerialNumberString(long struct) { return memDecodeASCII(struct + SERIALNUMBER); }
	public static String getSerialNumberString(ByteBuffer struct) { return ngetSerialNumberString(memAddress(struct)); }
	public static String ngetSerialNumberString(long struct, int byteLen) { return memDecodeASCII(memByteBuffer(struct + SERIALNUMBER, byteLen)); }
	public static String getSerialNumberString(ByteBuffer struct, int byteLen) { return ngetSerialNumberString(memAddress(struct), byteLen); }
	public static int ngetFirmwareMajor(long struct) { return memGetShort(struct + FIRMWAREMAJOR); }
	public static int getFirmwareMajor(ByteBuffer struct) { return ngetFirmwareMajor(memAddress(struct)); }
	public static int ngetFirmwareMinor(long struct) { return memGetShort(struct + FIRMWAREMINOR); }
	public static int getFirmwareMinor(ByteBuffer struct) { return ngetFirmwareMinor(memAddress(struct)); }
	public static float ngetCameraFrustumHFovInRadians(long struct) { return memGetFloat(struct + CAMERAFRUSTUMHFOVINRADIANS); }
	public static float getCameraFrustumHFovInRadians(ByteBuffer struct) { return ngetCameraFrustumHFovInRadians(memAddress(struct)); }
	public static float ngetCameraFrustumVFovInRadians(long struct) { return memGetFloat(struct + CAMERAFRUSTUMVFOVINRADIANS); }
	public static float getCameraFrustumVFovInRadians(ByteBuffer struct) { return ngetCameraFrustumVFovInRadians(memAddress(struct)); }
	public static float ngetCameraFrustumNearZInMeters(long struct) { return memGetFloat(struct + CAMERAFRUSTUMNEARZINMETERS); }
	public static float getCameraFrustumNearZInMeters(ByteBuffer struct) { return ngetCameraFrustumNearZInMeters(memAddress(struct)); }
	public static float ngetCameraFrustumFarZInMeters(long struct) { return memGetFloat(struct + CAMERAFRUSTUMFARZINMETERS); }
	public static float getCameraFrustumFarZInMeters(ByteBuffer struct) { return ngetCameraFrustumFarZInMeters(memAddress(struct)); }
	public static int ngetAvailableHmdCaps(long struct) { return memGetInt(struct + AVAILABLEHMDCAPS); }
	public static int getAvailableHmdCaps(ByteBuffer struct) { return ngetAvailableHmdCaps(memAddress(struct)); }
	public static int ngetDefaultHmdCaps(long struct) { return memGetInt(struct + DEFAULTHMDCAPS); }
	public static int getDefaultHmdCaps(ByteBuffer struct) { return ngetDefaultHmdCaps(memAddress(struct)); }
	public static int ngetAvailableTrackingCaps(long struct) { return memGetInt(struct + AVAILABLETRACKINGCAPS); }
	public static int getAvailableTrackingCaps(ByteBuffer struct) { return ngetAvailableTrackingCaps(memAddress(struct)); }
	public static int ngetDefaultTrackingCaps(long struct) { return memGetInt(struct + DEFAULTTRACKINGCAPS); }
	public static int getDefaultTrackingCaps(ByteBuffer struct) { return ngetDefaultTrackingCaps(memAddress(struct)); }
	public static void ngetDefaultEyeFov(long struct, ByteBuffer DefaultEyeFov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DefaultEyeFov, 2 * OVRFovPort.SIZEOF);
		memCopy(struct + DEFAULTEYEFOV, memAddress(DefaultEyeFov), DefaultEyeFov.remaining());
	}
	public static void getDefaultEyeFov(ByteBuffer struct, ByteBuffer DefaultEyeFov) { ngetDefaultEyeFov(memAddress(struct), DefaultEyeFov); }
	public static OVRFovPort ngetDefaultEyeFov(long struct, int index) {
		return OVRFovPort.malloc().nset(struct + DEFAULTEYEFOV + index * OVRFovPort.SIZEOF);
	}
	public static OVRFovPort getDefaultEyeFov(ByteBuffer struct, int index) { return ngetDefaultEyeFov(memAddress(struct), index); }
	public static void ngetMaxEyeFov(long struct, ByteBuffer MaxEyeFov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(MaxEyeFov, 2 * OVRFovPort.SIZEOF);
		memCopy(struct + MAXEYEFOV, memAddress(MaxEyeFov), MaxEyeFov.remaining());
	}
	public static void getMaxEyeFov(ByteBuffer struct, ByteBuffer MaxEyeFov) { ngetMaxEyeFov(memAddress(struct), MaxEyeFov); }
	public static OVRFovPort ngetMaxEyeFov(long struct, int index) {
		return OVRFovPort.malloc().nset(struct + MAXEYEFOV + index * OVRFovPort.SIZEOF);
	}
	public static OVRFovPort getMaxEyeFov(ByteBuffer struct, int index) { return ngetMaxEyeFov(memAddress(struct), index); }
	public static OVRSizei ngetResolution(long struct) { return OVRSizei.malloc().nset(struct + RESOLUTION); }
	/** Returns a copy of the {@code Resolution} {@link OVRSizei} struct. */
	public static OVRSizei getResolution(ByteBuffer struct) { return ngetResolution(memAddress(struct)); }
	public static int ngetResolutionW(long struct) { return memGetInt(struct + RESOLUTION + OVRSizei.W); }
	public static int getResolutionW(ByteBuffer struct) { return ngetResolutionW(memAddress(struct)); }
	public static int ngetResolutionH(long struct) { return memGetInt(struct + RESOLUTION + OVRSizei.H); }
	public static int getResolutionH(ByteBuffer struct) { return ngetResolutionH(memAddress(struct)); }
	public static float ngetDisplayRefreshRate(long struct) { return memGetFloat(struct + DISPLAYREFRESHRATE); }
	public static float getDisplayRefreshRate(ByteBuffer struct) { return ngetDisplayRefreshRate(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link OVRHmdDesc} structs. */
	public static final class Buffer extends StructBuffer<OVRHmdDesc, Buffer> {

		/**
		 * Creates a new {@link OVRHmdDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRHmdDesc#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRHmdDesc newInstance(long address) {
			return new OVRHmdDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getType() { return ngetType(address()); }
		public void getProductName(ByteBuffer ProductName) { ngetProductName(address(), ProductName); }
		public String getProductNameString() { return ngetProductNameString(address()); }
		public String getProductNameString(int byteLen) { return ngetProductNameString(address(), byteLen); }
		public void getManufacturer(ByteBuffer Manufacturer) { ngetManufacturer(address(), Manufacturer); }
		public String getManufacturerString() { return ngetManufacturerString(address()); }
		public String getManufacturerString(int byteLen) { return ngetManufacturerString(address(), byteLen); }
		public int getVendorId() { return ngetVendorId(address()); }
		public int getProductId() { return ngetProductId(address()); }
		public void getSerialNumber(ByteBuffer SerialNumber) { ngetSerialNumber(address(), SerialNumber); }
		public String getSerialNumberString() { return ngetSerialNumberString(address()); }
		public String getSerialNumberString(int byteLen) { return ngetSerialNumberString(address(), byteLen); }
		public int getFirmwareMajor() { return ngetFirmwareMajor(address()); }
		public int getFirmwareMinor() { return ngetFirmwareMinor(address()); }
		public float getCameraFrustumHFovInRadians() { return ngetCameraFrustumHFovInRadians(address()); }
		public float getCameraFrustumVFovInRadians() { return ngetCameraFrustumVFovInRadians(address()); }
		public float getCameraFrustumNearZInMeters() { return ngetCameraFrustumNearZInMeters(address()); }
		public float getCameraFrustumFarZInMeters() { return ngetCameraFrustumFarZInMeters(address()); }
		public int getAvailableHmdCaps() { return ngetAvailableHmdCaps(address()); }
		public int getDefaultHmdCaps() { return ngetDefaultHmdCaps(address()); }
		public int getAvailableTrackingCaps() { return ngetAvailableTrackingCaps(address()); }
		public int getDefaultTrackingCaps() { return ngetDefaultTrackingCaps(address()); }
		public void getDefaultEyeFov(ByteBuffer DefaultEyeFov) { ngetDefaultEyeFov(address(), DefaultEyeFov); }
		public OVRFovPort getDefaultEyeFov(int index) { return ngetDefaultEyeFov(address(), index); }
		public void getMaxEyeFov(ByteBuffer MaxEyeFov) { ngetMaxEyeFov(address(), MaxEyeFov); }
		public OVRFovPort getMaxEyeFov(int index) { return ngetMaxEyeFov(address(), index); }
		public OVRSizei getResolution() { return ngetResolution(address()); }
		public int getResolutionW() { return ngetResolutionW(address()); }
		public int getResolutionH() { return ngetResolutionH(address()); }
		public float getDisplayRefreshRate() { return ngetDisplayRefreshRate(address()); }

	}

}