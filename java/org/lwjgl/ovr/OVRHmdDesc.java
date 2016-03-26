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
import static org.lwjgl.system.MemoryStack.*;

/**
 * A complete descriptor of the HMD.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrHmdDesc {
    ovrHmdType Type;
    char[4];
    char[64] ProductName;
    char[64] Manufacturer;
    short VendorId;
    short ProductId;
    char[24] SerialNumber;
    short FirmwareMajor;
    short FirmwareMinor;
    float CameraFrustumHFovInRadians;
    float CameraFrustumVFovInRadians;
    float CameraFrustumNearZInMeters;
    float CameraFrustumFarZInMeters;
    unsigned int AvailableHmdCaps;
    unsigned int DefaultHmdCaps;
    unsigned int AvailableTrackingCaps;
    unsigned int DefaultTrackingCaps;
    {@link OVRFovPort ovrFovPort}[2] DefaultEyeFov;
    {@link OVRFovPort ovrFovPort}[2] MaxEyeFov;
    {@link OVRSizei ovrSizei} Resolution;
    float DisplayRefreshRate;
    char[4];
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>Type</td><td>this HMD's type</td></tr>
 * <tr><td>ProductName</td><td>name string describing the product: "Oculus Rift DK1", etc.</td></tr>
 * <tr><td>Manufacturer</td><td>string describing the manufacturer. Usually "Oculus".</td></tr>
 * <tr><td>VendorId</td><td>HID Vendor ID of the device</td></tr>
 * <tr><td>ProductId</td><td>HID Product ID of the device</td></tr>
 * <tr><td>SerialNumber</td><td>sensor (and display) serial number</td></tr>
 * <tr><td>FirmwareMajor</td><td>sensor firmware major version number</td></tr>
 * <tr><td>FirmwareMinor</td><td>sensor firmware minor version number</td></tr>
 * <tr><td>CameraFrustumHFovInRadians</td><td>horizontal field-of-view</td></tr>
 * <tr><td>CameraFrustumVFovInRadians</td><td>vertical field-of-view</td></tr>
 * <tr><td>CameraFrustumNearZInMeters</td><td>near clip distance</td></tr>
 * <tr><td>CameraFrustumFarZInMeters</td><td>far clip distance</td></tr>
 * <tr><td>AvailableHmdCaps</td><td>capability bits described by {@code ovrHmdCaps} which the HMD currently supports</td></tr>
 * <tr><td>DefaultHmdCaps</td><td>capability bits described by {@code ovrHmdCaps} which are default for the current {@code Hmd}</td></tr>
 * <tr><td>AvailableTrackingCaps</td><td>capability bits described by {@code ovrTrackingCaps} which the system currently supports</td></tr>
 * <tr><td>DefaultTrackingCaps</td><td>capability bits described by {@code ovrTrackingCaps} which are default for the current system</td></tr>
 * <tr><td>DefaultEyeFov</td><td>the recommended optical FOV for the HMD</td></tr>
 * <tr><td>MaxEyeFov</td><td>the maximum optical FOV for the HMD</td></tr>
 * <tr><td>Resolution</td><td>resolution of the full HMD screen (both eyes) in pixels</td></tr>
 * <tr><td>DisplayRefreshRate</td><td>nominal refresh rate of the display in cycles per second at the time of HMD creation</td></tr>
 * </table>
 */
public class OVRHmdDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
			__array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, 2),
			__array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, 2),
			__member(OVRSizei.SIZEOF, OVRSizei.ALIGNOF),
			__member(4),
			__padding(4, Pointer.BITS64)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

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
		super(address, container);
	}

	/**
	 * Creates a {@link OVRHmdDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRHmdDesc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	/** Returns a new {@link OVRHmdDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRHmdDesc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRHmdDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRHmdDesc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRHmdDesc} instance allocated with {@link BufferUtils}. */
	public static OVRHmdDesc create() {
		return new OVRHmdDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRHmdDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRHmdDesc create(long address) {
		return address == NULL ? null : new OVRHmdDesc(address, null);
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRHmdDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRHmdDesc} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRHmdDesc mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRHmdDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRHmdDesc callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRHmdDesc} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRHmdDesc mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRHmdDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRHmdDesc callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Type}. */
	public static int nType(long struct) { return memGetInt(struct + OVRHmdDesc.TYPE); }
	/** Unsafe version of {@link #ProductName}. */
	public static ByteBuffer nProductName(long struct) { return memByteBuffer(struct + OVRHmdDesc.PRODUCTNAME, 64); }
	/** Unsafe version of {@link #ProductNameString}. */
	public static String nProductNameString(long struct) { return memUTF8(struct + OVRHmdDesc.PRODUCTNAME); }
	/** Unsafe version of {@link #Manufacturer}. */
	public static ByteBuffer nManufacturer(long struct) { return memByteBuffer(struct + OVRHmdDesc.MANUFACTURER, 64); }
	/** Unsafe version of {@link #ManufacturerString}. */
	public static String nManufacturerString(long struct) { return memUTF8(struct + OVRHmdDesc.MANUFACTURER); }
	/** Unsafe version of {@link #VendorId}. */
	public static short nVendorId(long struct) { return memGetShort(struct + OVRHmdDesc.VENDORID); }
	/** Unsafe version of {@link #ProductId}. */
	public static short nProductId(long struct) { return memGetShort(struct + OVRHmdDesc.PRODUCTID); }
	/** Unsafe version of {@link #SerialNumber}. */
	public static ByteBuffer nSerialNumber(long struct) { return memByteBuffer(struct + OVRHmdDesc.SERIALNUMBER, 24); }
	/** Unsafe version of {@link #SerialNumberString}. */
	public static String nSerialNumberString(long struct) { return memASCII(struct + OVRHmdDesc.SERIALNUMBER); }
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
		return OVRFovPort.create(struct + OVRHmdDesc.DEFAULTEYEFOV, 2);
	}
	/** Unsafe version of {@link #DefaultEyeFov(int) DefaultEyeFov}. */
	public static OVRFovPort nDefaultEyeFov(long struct, int index) {
		return OVRFovPort.create(struct + OVRHmdDesc.DEFAULTEYEFOV + index * OVRFovPort.SIZEOF);
	}
	/** Unsafe version of {@link #MaxEyeFov}. */
	public static OVRFovPort.Buffer nMaxEyeFov(long struct) {
		return OVRFovPort.create(struct + OVRHmdDesc.MAXEYEFOV, 2);
	}
	/** Unsafe version of {@link #MaxEyeFov(int) MaxEyeFov}. */
	public static OVRFovPort nMaxEyeFov(long struct, int index) {
		return OVRFovPort.create(struct + OVRHmdDesc.MAXEYEFOV + index * OVRFovPort.SIZEOF);
	}
	/** Unsafe version of {@link #Resolution}. */
	public static OVRSizei nResolution(long struct) { return OVRSizei.create(struct + OVRHmdDesc.RESOLUTION); }
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
		protected OVRHmdDesc newInstance(long address) {
			return new OVRHmdDesc(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Type} field. */
		public int Type() { return OVRHmdDesc.nType(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code ProductName} field. */
		public ByteBuffer ProductName() { return OVRHmdDesc.nProductName(address()); }
		/** Decodes the null-terminated string stored in the {@code ProductName} field. */
		public String ProductNameString() { return OVRHmdDesc.nProductNameString(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code Manufacturer} field. */
		public ByteBuffer Manufacturer() { return OVRHmdDesc.nManufacturer(address()); }
		/** Decodes the null-terminated string stored in the {@code Manufacturer} field. */
		public String ManufacturerString() { return OVRHmdDesc.nManufacturerString(address()); }
		/** Returns the value of the {@code VendorId} field. */
		public short VendorId() { return OVRHmdDesc.nVendorId(address()); }
		/** Returns the value of the {@code ProductId} field. */
		public short ProductId() { return OVRHmdDesc.nProductId(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code SerialNumber} field. */
		public ByteBuffer SerialNumber() { return OVRHmdDesc.nSerialNumber(address()); }
		/** Decodes the null-terminated string stored in the {@code SerialNumber} field. */
		public String SerialNumberString() { return OVRHmdDesc.nSerialNumberString(address()); }
		/** Returns the value of the {@code FirmwareMajor} field. */
		public short FirmwareMajor() { return OVRHmdDesc.nFirmwareMajor(address()); }
		/** Returns the value of the {@code FirmwareMinor} field. */
		public short FirmwareMinor() { return OVRHmdDesc.nFirmwareMinor(address()); }
		/** Returns the value of the {@code CameraFrustumHFovInRadians} field. */
		public float CameraFrustumHFovInRadians() { return OVRHmdDesc.nCameraFrustumHFovInRadians(address()); }
		/** Returns the value of the {@code CameraFrustumVFovInRadians} field. */
		public float CameraFrustumVFovInRadians() { return OVRHmdDesc.nCameraFrustumVFovInRadians(address()); }
		/** Returns the value of the {@code CameraFrustumNearZInMeters} field. */
		public float CameraFrustumNearZInMeters() { return OVRHmdDesc.nCameraFrustumNearZInMeters(address()); }
		/** Returns the value of the {@code CameraFrustumFarZInMeters} field. */
		public float CameraFrustumFarZInMeters() { return OVRHmdDesc.nCameraFrustumFarZInMeters(address()); }
		/** Returns the value of the {@code AvailableHmdCaps} field. */
		public int AvailableHmdCaps() { return OVRHmdDesc.nAvailableHmdCaps(address()); }
		/** Returns the value of the {@code DefaultHmdCaps} field. */
		public int DefaultHmdCaps() { return OVRHmdDesc.nDefaultHmdCaps(address()); }
		/** Returns the value of the {@code AvailableTrackingCaps} field. */
		public int AvailableTrackingCaps() { return OVRHmdDesc.nAvailableTrackingCaps(address()); }
		/** Returns the value of the {@code DefaultTrackingCaps} field. */
		public int DefaultTrackingCaps() { return OVRHmdDesc.nDefaultTrackingCaps(address()); }
		/** Returns a {@link OVRFovPort}.Buffer view of the {@code DefaultEyeFov} field. */
		public OVRFovPort.Buffer DefaultEyeFov() { return OVRHmdDesc.nDefaultEyeFov(address()); }
		/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code DefaultEyeFov} field. */
		public OVRFovPort DefaultEyeFov(int index) { return OVRHmdDesc.nDefaultEyeFov(address(), index); }
		/** Returns a {@link OVRFovPort}.Buffer view of the {@code MaxEyeFov} field. */
		public OVRFovPort.Buffer MaxEyeFov() { return OVRHmdDesc.nMaxEyeFov(address()); }
		/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code MaxEyeFov} field. */
		public OVRFovPort MaxEyeFov(int index) { return OVRHmdDesc.nMaxEyeFov(address(), index); }
		/** Returns a {@link OVRSizei} view of the {@code Resolution} field. */
		public OVRSizei Resolution() { return OVRHmdDesc.nResolution(address()); }
		/** Returns the value of the {@code DisplayRefreshRate} field. */
		public float DisplayRefreshRate() { return OVRHmdDesc.nDisplayRefreshRate(address()); }

	}

}