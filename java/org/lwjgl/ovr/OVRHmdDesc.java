/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A complete descriptor of the HMD.
 * 
 * <h3>ovrHmdDesc members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Type</td><td class="nw">ovrHmdType</td><td>this HMD's type</td></tr>
 * <tr><td>*</td><td class="nw">char[4]</td><td></td></tr>
 * <tr><td>ProductName</td><td class="nw">char[64]</td><td>name string describing the product: "Oculus Rift DK1", etc.</td></tr>
 * <tr><td>Manufacturer</td><td class="nw">char[64]</td><td>string describing the manufacturer. Usually "Oculus".</td></tr>
 * <tr><td>VendorId</td><td class="nw">short</td><td>HID Vendor ID of the device</td></tr>
 * <tr><td>ProductId</td><td class="nw">short</td><td>HID Product ID of the device</td></tr>
 * <tr><td>SerialNumber</td><td class="nw">char[24]</td><td>sensor (and display) serial number</td></tr>
 * <tr><td>FirmwareMajor</td><td class="nw">short</td><td>sensor firmware major version number</td></tr>
 * <tr><td>FirmwareMinor</td><td class="nw">short</td><td>sensor firmware minor version number</td></tr>
 * <tr><td>CameraFrustumHFovInRadians</td><td class="nw">float</td><td>horizontal field-of-view</td></tr>
 * <tr><td>CameraFrustumVFovInRadians</td><td class="nw">float</td><td>vertical field-of-view</td></tr>
 * <tr><td>CameraFrustumNearZInMeters</td><td class="nw">float</td><td>near clip distance</td></tr>
 * <tr><td>CameraFrustumFarZInMeters</td><td class="nw">float</td><td>far clip distance</td></tr>
 * <tr><td>AvailableHmdCaps</td><td class="nw">unsigned int</td><td>capability bits described by {@code ovrHmdCaps} which the HMD currently supports</td></tr>
 * <tr><td>DefaultHmdCaps</td><td class="nw">unsigned int</td><td>capability bits described by {@code ovrHmdCaps} which are default for the current {@code Hmd}</td></tr>
 * <tr><td>AvailableTrackingCaps</td><td class="nw">unsigned int</td><td>capability bits described by {@code ovrTrackingCaps} which the system currently supports</td></tr>
 * <tr><td>DefaultTrackingCaps</td><td class="nw">unsigned int</td><td>capability bits described by {@code ovrTrackingCaps} which are default for the current system</td></tr>
 * <tr><td>DefaultEyeFov</td><td class="nw">ovrFovPort[2]</td><td>the recommended optical FOV for the HMD</td></tr>
 * <tr><td>MaxEyeFov</td><td class="nw">ovrFovPort[2]</td><td>the maximum optical FOV for the HMD</td></tr>
 * <tr><td>Resolution</td><td class="nw">{@link OVRSizei ovrSizei}</td><td>resolution of the full HMD screen (both eyes) in pixels</td></tr>
 * <tr><td>DisplayRefreshRate</td><td class="nw">float</td><td>nominal refresh rate of the display in cycles per second at the time of HMD creation</td></tr>
 * <tr><td>*</td><td class="nw">char[4]</td><td></td></tr>
 * </table>
 */
public class OVRHmdDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		Layout layout = __struct(
			__member(4),
			__padding(4, Pointer.BITS64),
			__array(1, 64),
			__array(1, 64),
			__member(2),
			__member(2),
			__array(1, 24),
			__member(2),
			__member(2),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__array(OVRFovPort.SIZEOF, OVRFovPort.__ALIGNMENT, 2),
			__array(OVRFovPort.SIZEOF, OVRFovPort.__ALIGNMENT, 2),
			__member(OVRSizei.SIZEOF, OVRSizei.__ALIGNMENT),
			__member(4),
			__padding(4, Pointer.BITS64)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		TYPE = layout.offsetof(0);
		PRODUCTNAME = layout.offsetof(2);
		MANUFACTURER = layout.offsetof(3);
		VENDORID = layout.offsetof(4);
		PRODUCTID = layout.offsetof(5);
		SERIALNUMBER = layout.offsetof(6);
		FIRMWAREMAJOR = layout.offsetof(7);
		FIRMWAREMINOR = layout.offsetof(8);
		CAMERAFRUSTUMHFOVINRADIANS = layout.offsetof(9);
		CAMERAFRUSTUMVFOVINRADIANS = layout.offsetof(10);
		CAMERAFRUSTUMNEARZINMETERS = layout.offsetof(11);
		CAMERAFRUSTUMFARZINMETERS = layout.offsetof(12);
		AVAILABLEHMDCAPS = layout.offsetof(13);
		DEFAULTHMDCAPS = layout.offsetof(14);
		AVAILABLETRACKINGCAPS = layout.offsetof(15);
		DEFAULTTRACKINGCAPS = layout.offsetof(16);
		DEFAULTEYEFOV = layout.offsetof(17);
		MAXEYEFOV = layout.offsetof(18);
		RESOLUTION = layout.offsetof(19);
		DISPLAYREFRESHRATE = layout.offsetof(20);
	}

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

	/** Returns the value of the {@code Type} field. */
	public int Type() { return nType(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code ProductName} field. */
	public ByteBuffer ProductName() { return nProductName(address()); }
	/** Decodes the null-terminated string stored in the {@code ProductName} field. */
	public String ProductNameString() { return nProductNameString(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code Manufacturer} field. */
	public ByteBuffer Manufacturer() { return nManufacturer(address()); }
	/** Decodes the null-terminated string stored in the {@code Manufacturer} field. */
	public String ManufacturerString() { return nManufacturerString(address()); }
	/** Returns the value of the {@code VendorId} field. */
	public short VendorId() { return nVendorId(address()); }
	/** Returns the value of the {@code ProductId} field. */
	public short ProductId() { return nProductId(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code SerialNumber} field. */
	public ByteBuffer SerialNumber() { return nSerialNumber(address()); }
	/** Decodes the null-terminated string stored in the {@code SerialNumber} field. */
	public String SerialNumberString() { return nSerialNumberString(address()); }
	/** Returns the value of the {@code FirmwareMajor} field. */
	public short FirmwareMajor() { return nFirmwareMajor(address()); }
	/** Returns the value of the {@code FirmwareMinor} field. */
	public short FirmwareMinor() { return nFirmwareMinor(address()); }
	/** Returns the value of the {@code CameraFrustumHFovInRadians} field. */
	public float CameraFrustumHFovInRadians() { return nCameraFrustumHFovInRadians(address()); }
	/** Returns the value of the {@code CameraFrustumVFovInRadians} field. */
	public float CameraFrustumVFovInRadians() { return nCameraFrustumVFovInRadians(address()); }
	/** Returns the value of the {@code CameraFrustumNearZInMeters} field. */
	public float CameraFrustumNearZInMeters() { return nCameraFrustumNearZInMeters(address()); }
	/** Returns the value of the {@code CameraFrustumFarZInMeters} field. */
	public float CameraFrustumFarZInMeters() { return nCameraFrustumFarZInMeters(address()); }
	/** Returns the value of the {@code AvailableHmdCaps} field. */
	public int AvailableHmdCaps() { return nAvailableHmdCaps(address()); }
	/** Returns the value of the {@code DefaultHmdCaps} field. */
	public int DefaultHmdCaps() { return nDefaultHmdCaps(address()); }
	/** Returns the value of the {@code AvailableTrackingCaps} field. */
	public int AvailableTrackingCaps() { return nAvailableTrackingCaps(address()); }
	/** Returns the value of the {@code DefaultTrackingCaps} field. */
	public int DefaultTrackingCaps() { return nDefaultTrackingCaps(address()); }
	/** Returns a {@link OVRFovPort}.Buffer view of the {@code DefaultEyeFov} field. */
	public OVRFovPort.Buffer DefaultEyeFov() { return nDefaultEyeFov(address()); }
	/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code DefaultEyeFov} field. */
	public OVRFovPort DefaultEyeFov(int index) { return nDefaultEyeFov(address(), index); }
	/** Returns a {@link OVRFovPort}.Buffer view of the {@code MaxEyeFov} field. */
	public OVRFovPort.Buffer MaxEyeFov() { return nMaxEyeFov(address()); }
	/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code MaxEyeFov} field. */
	public OVRFovPort MaxEyeFov(int index) { return nMaxEyeFov(address(), index); }
	/** Returns a {@link OVRSizei} view of the {@code Resolution} field. */
	public OVRSizei Resolution() { return nResolution(address()); }
	/** Returns the value of the {@code DisplayRefreshRate} field. */
	public float DisplayRefreshRate() { return nDisplayRefreshRate(address()); }

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

	/**
	 * Create a {@link OVRHmdDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Type}. */
	public static int nType(long struct) { return memGetInt(struct + OVRHmdDesc.TYPE); }
	/** Unsafe version of {@link #ProductName}. */
	public static ByteBuffer nProductName(long struct) { return memByteBuffer(struct + OVRHmdDesc.PRODUCTNAME, 64); }
	/** Unsafe version of {@link #ProductNameString}. */
	public static String nProductNameString(long struct) { return memDecodeUTF8(struct + OVRHmdDesc.PRODUCTNAME); }
	/** Unsafe version of {@link #Manufacturer}. */
	public static ByteBuffer nManufacturer(long struct) { return memByteBuffer(struct + OVRHmdDesc.MANUFACTURER, 64); }
	/** Unsafe version of {@link #ManufacturerString}. */
	public static String nManufacturerString(long struct) { return memDecodeUTF8(struct + OVRHmdDesc.MANUFACTURER); }
	/** Unsafe version of {@link #VendorId}. */
	public static short nVendorId(long struct) { return memGetShort(struct + OVRHmdDesc.VENDORID); }
	/** Unsafe version of {@link #ProductId}. */
	public static short nProductId(long struct) { return memGetShort(struct + OVRHmdDesc.PRODUCTID); }
	/** Unsafe version of {@link #SerialNumber}. */
	public static ByteBuffer nSerialNumber(long struct) { return memByteBuffer(struct + OVRHmdDesc.SERIALNUMBER, 24); }
	/** Unsafe version of {@link #SerialNumberString}. */
	public static String nSerialNumberString(long struct) { return memDecodeASCII(struct + OVRHmdDesc.SERIALNUMBER); }
	/** Unsafe version of {@link #FirmwareMajor}. */
	public static short nFirmwareMajor(long struct) { return memGetShort(struct + OVRHmdDesc.FIRMWAREMAJOR); }
	/** Unsafe version of {@link #FirmwareMinor}. */
	public static short nFirmwareMinor(long struct) { return memGetShort(struct + OVRHmdDesc.FIRMWAREMINOR); }
	/** Unsafe version of {@link #CameraFrustumHFovInRadians}. */
	public static float nCameraFrustumHFovInRadians(long struct) { return memGetFloat(struct + OVRHmdDesc.CAMERAFRUSTUMHFOVINRADIANS); }
	/** Unsafe version of {@link #CameraFrustumVFovInRadians}. */
	public static float nCameraFrustumVFovInRadians(long struct) { return memGetFloat(struct + OVRHmdDesc.CAMERAFRUSTUMVFOVINRADIANS); }
	/** Unsafe version of {@link #CameraFrustumNearZInMeters}. */
	public static float nCameraFrustumNearZInMeters(long struct) { return memGetFloat(struct + OVRHmdDesc.CAMERAFRUSTUMNEARZINMETERS); }
	/** Unsafe version of {@link #CameraFrustumFarZInMeters}. */
	public static float nCameraFrustumFarZInMeters(long struct) { return memGetFloat(struct + OVRHmdDesc.CAMERAFRUSTUMFARZINMETERS); }
	/** Unsafe version of {@link #AvailableHmdCaps}. */
	public static int nAvailableHmdCaps(long struct) { return memGetInt(struct + OVRHmdDesc.AVAILABLEHMDCAPS); }
	/** Unsafe version of {@link #DefaultHmdCaps}. */
	public static int nDefaultHmdCaps(long struct) { return memGetInt(struct + OVRHmdDesc.DEFAULTHMDCAPS); }
	/** Unsafe version of {@link #AvailableTrackingCaps}. */
	public static int nAvailableTrackingCaps(long struct) { return memGetInt(struct + OVRHmdDesc.AVAILABLETRACKINGCAPS); }
	/** Unsafe version of {@link #DefaultTrackingCaps}. */
	public static int nDefaultTrackingCaps(long struct) { return memGetInt(struct + OVRHmdDesc.DEFAULTTRACKINGCAPS); }
	/** Unsafe version of {@link #DefaultEyeFov}. */
	public static OVRFovPort.Buffer nDefaultEyeFov(long struct) {
		return OVRFovPort.createBuffer(struct + OVRHmdDesc.DEFAULTEYEFOV, 2);
	}
	/** Unsafe version of {@link #DefaultEyeFov(int) DefaultEyeFov}. */
	public static OVRFovPort nDefaultEyeFov(long struct, int index) {
		return new OVRFovPort(struct + OVRHmdDesc.DEFAULTEYEFOV + index * OVRFovPort.SIZEOF);
	}
	/** Unsafe version of {@link #MaxEyeFov}. */
	public static OVRFovPort.Buffer nMaxEyeFov(long struct) {
		return OVRFovPort.createBuffer(struct + OVRHmdDesc.MAXEYEFOV, 2);
	}
	/** Unsafe version of {@link #MaxEyeFov(int) MaxEyeFov}. */
	public static OVRFovPort nMaxEyeFov(long struct, int index) {
		return new OVRFovPort(struct + OVRHmdDesc.MAXEYEFOV + index * OVRFovPort.SIZEOF);
	}
	/** Unsafe version of {@link #Resolution}. */
	public static OVRSizei nResolution(long struct) { return new OVRSizei(struct + OVRHmdDesc.RESOLUTION); }
	/** Unsafe version of {@link #DisplayRefreshRate}. */
	public static float nDisplayRefreshRate(long struct) { return memGetFloat(struct + OVRHmdDesc.DISPLAYREFRESHRATE); }

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

		/** Returns the value of the {@code Type} field. */
		public int Type() { return nType(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code ProductName} field. */
		public ByteBuffer ProductName() { return nProductName(address()); }
		/** Decodes the null-terminated string stored in the {@code ProductName} field. */
		public String ProductNameString() { return nProductNameString(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code Manufacturer} field. */
		public ByteBuffer Manufacturer() { return nManufacturer(address()); }
		/** Decodes the null-terminated string stored in the {@code Manufacturer} field. */
		public String ManufacturerString() { return nManufacturerString(address()); }
		/** Returns the value of the {@code VendorId} field. */
		public short VendorId() { return nVendorId(address()); }
		/** Returns the value of the {@code ProductId} field. */
		public short ProductId() { return nProductId(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code SerialNumber} field. */
		public ByteBuffer SerialNumber() { return nSerialNumber(address()); }
		/** Decodes the null-terminated string stored in the {@code SerialNumber} field. */
		public String SerialNumberString() { return nSerialNumberString(address()); }
		/** Returns the value of the {@code FirmwareMajor} field. */
		public short FirmwareMajor() { return nFirmwareMajor(address()); }
		/** Returns the value of the {@code FirmwareMinor} field. */
		public short FirmwareMinor() { return nFirmwareMinor(address()); }
		/** Returns the value of the {@code CameraFrustumHFovInRadians} field. */
		public float CameraFrustumHFovInRadians() { return nCameraFrustumHFovInRadians(address()); }
		/** Returns the value of the {@code CameraFrustumVFovInRadians} field. */
		public float CameraFrustumVFovInRadians() { return nCameraFrustumVFovInRadians(address()); }
		/** Returns the value of the {@code CameraFrustumNearZInMeters} field. */
		public float CameraFrustumNearZInMeters() { return nCameraFrustumNearZInMeters(address()); }
		/** Returns the value of the {@code CameraFrustumFarZInMeters} field. */
		public float CameraFrustumFarZInMeters() { return nCameraFrustumFarZInMeters(address()); }
		/** Returns the value of the {@code AvailableHmdCaps} field. */
		public int AvailableHmdCaps() { return nAvailableHmdCaps(address()); }
		/** Returns the value of the {@code DefaultHmdCaps} field. */
		public int DefaultHmdCaps() { return nDefaultHmdCaps(address()); }
		/** Returns the value of the {@code AvailableTrackingCaps} field. */
		public int AvailableTrackingCaps() { return nAvailableTrackingCaps(address()); }
		/** Returns the value of the {@code DefaultTrackingCaps} field. */
		public int DefaultTrackingCaps() { return nDefaultTrackingCaps(address()); }
		/** Returns a {@link OVRFovPort}.Buffer view of the {@code DefaultEyeFov} field. */
		public OVRFovPort.Buffer DefaultEyeFov() { return nDefaultEyeFov(address()); }
		/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code DefaultEyeFov} field. */
		public OVRFovPort DefaultEyeFov(int index) { return nDefaultEyeFov(address(), index); }
		/** Returns a {@link OVRFovPort}.Buffer view of the {@code MaxEyeFov} field. */
		public OVRFovPort.Buffer MaxEyeFov() { return nMaxEyeFov(address()); }
		/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code MaxEyeFov} field. */
		public OVRFovPort MaxEyeFov(int index) { return nMaxEyeFov(address(), index); }
		/** Returns a {@link OVRSizei} view of the {@code Resolution} field. */
		public OVRSizei Resolution() { return nResolution(address()); }
		/** Returns the value of the {@code DisplayRefreshRate} field. */
		public float DisplayRefreshRate() { return nDisplayRefreshRate(address()); }

	}

}