/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A complete descriptor of the HMD. */
public final class OVRHmdDesc implements Pointer {

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

	private final ByteBuffer struct;

	public OVRHmdDesc() {
		this(malloc());
	}

	public OVRHmdDesc(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public OVRHmdDesc setType(int Type) { Type(struct, Type); return this; }
	public OVRHmdDesc setProductName(ByteBuffer ProductName) { ProductNameSet(struct, ProductName); return this; }
	public OVRHmdDesc setProductName(CharSequence ProductName) { ProductName(struct, ProductName); return this; }
	public OVRHmdDesc setManufacturer(ByteBuffer Manufacturer) { ManufacturerSet(struct, Manufacturer); return this; }
	public OVRHmdDesc setManufacturer(CharSequence Manufacturer) { Manufacturer(struct, Manufacturer); return this; }
	public OVRHmdDesc setVendorId(int VendorId) { VendorId(struct, VendorId); return this; }
	public OVRHmdDesc setProductId(int ProductId) { ProductId(struct, ProductId); return this; }
	public OVRHmdDesc setSerialNumber(ByteBuffer SerialNumber) { SerialNumberSet(struct, SerialNumber); return this; }
	public OVRHmdDesc setSerialNumber(CharSequence SerialNumber) { SerialNumber(struct, SerialNumber); return this; }
	public OVRHmdDesc setFirmwareMajor(int FirmwareMajor) { FirmwareMajor(struct, FirmwareMajor); return this; }
	public OVRHmdDesc setFirmwareMinor(int FirmwareMinor) { FirmwareMinor(struct, FirmwareMinor); return this; }
	public OVRHmdDesc setCameraFrustumHFovInRadians(float CameraFrustumHFovInRadians) { CameraFrustumHFovInRadians(struct, CameraFrustumHFovInRadians); return this; }
	public OVRHmdDesc setCameraFrustumVFovInRadians(float CameraFrustumVFovInRadians) { CameraFrustumVFovInRadians(struct, CameraFrustumVFovInRadians); return this; }
	public OVRHmdDesc setCameraFrustumNearZInMeters(float CameraFrustumNearZInMeters) { CameraFrustumNearZInMeters(struct, CameraFrustumNearZInMeters); return this; }
	public OVRHmdDesc setCameraFrustumFarZInMeters(float CameraFrustumFarZInMeters) { CameraFrustumFarZInMeters(struct, CameraFrustumFarZInMeters); return this; }
	public OVRHmdDesc setAvailableHmdCaps(int AvailableHmdCaps) { AvailableHmdCaps(struct, AvailableHmdCaps); return this; }
	public OVRHmdDesc setDefaultHmdCaps(int DefaultHmdCaps) { DefaultHmdCaps(struct, DefaultHmdCaps); return this; }
	public OVRHmdDesc setAvailableTrackingCaps(int AvailableTrackingCaps) { AvailableTrackingCaps(struct, AvailableTrackingCaps); return this; }
	public OVRHmdDesc setDefaultTrackingCaps(int DefaultTrackingCaps) { DefaultTrackingCaps(struct, DefaultTrackingCaps); return this; }
	public OVRHmdDesc setDefaultEyeFov(ByteBuffer DefaultEyeFov) { DefaultEyeFovSet(struct, DefaultEyeFov); return this; }
	public OVRHmdDesc setDefaultEyeFov(ByteBuffer DefaultEyeFov, int index) { DefaultEyeFovSet(struct, DefaultEyeFov, index); return this; }
	public OVRHmdDesc setMaxEyeFov(ByteBuffer MaxEyeFov) { MaxEyeFovSet(struct, MaxEyeFov); return this; }
	public OVRHmdDesc setMaxEyeFov(ByteBuffer MaxEyeFov, int index) { MaxEyeFovSet(struct, MaxEyeFov, index); return this; }
	public OVRHmdDesc setResolution(ByteBuffer Resolution) { ResolutionSet(struct, Resolution); return this; }
	public OVRHmdDesc setResolutionW(int w) { ResolutionW(struct, w); return this; }
	public OVRHmdDesc setResolutionH(int h) { ResolutionH(struct, h); return this; }
	public OVRHmdDesc setDisplayRefreshRate(float DisplayRefreshRate) { DisplayRefreshRate(struct, DisplayRefreshRate); return this; }

	public int getType() { return Type(struct); }
	public void getProductName(ByteBuffer ProductName) { ProductNameGet(struct, ProductName); }
	public String getProductNameString() { return ProductNameString(struct); }
	public String getProductNameString(int byteLen) { return ProductNameString(struct, byteLen); }
	public void getManufacturer(ByteBuffer Manufacturer) { ManufacturerGet(struct, Manufacturer); }
	public String getManufacturerString() { return ManufacturerString(struct); }
	public String getManufacturerString(int byteLen) { return ManufacturerString(struct, byteLen); }
	public int getVendorId() { return VendorId(struct); }
	public int getProductId() { return ProductId(struct); }
	public void getSerialNumber(ByteBuffer SerialNumber) { SerialNumberGet(struct, SerialNumber); }
	public String getSerialNumberString() { return SerialNumberString(struct); }
	public String getSerialNumberString(int byteLen) { return SerialNumberString(struct, byteLen); }
	public int getFirmwareMajor() { return FirmwareMajor(struct); }
	public int getFirmwareMinor() { return FirmwareMinor(struct); }
	public float getCameraFrustumHFovInRadians() { return CameraFrustumHFovInRadians(struct); }
	public float getCameraFrustumVFovInRadians() { return CameraFrustumVFovInRadians(struct); }
	public float getCameraFrustumNearZInMeters() { return CameraFrustumNearZInMeters(struct); }
	public float getCameraFrustumFarZInMeters() { return CameraFrustumFarZInMeters(struct); }
	public int getAvailableHmdCaps() { return AvailableHmdCaps(struct); }
	public int getDefaultHmdCaps() { return DefaultHmdCaps(struct); }
	public int getAvailableTrackingCaps() { return AvailableTrackingCaps(struct); }
	public int getDefaultTrackingCaps() { return DefaultTrackingCaps(struct); }
	public void getDefaultEyeFov(ByteBuffer DefaultEyeFov) { DefaultEyeFovGet(struct, DefaultEyeFov); }
	public void getDefaultEyeFov(ByteBuffer DefaultEyeFov, int index) { DefaultEyeFovGet(struct, DefaultEyeFov, index); }
	public void getMaxEyeFov(ByteBuffer MaxEyeFov) { MaxEyeFovGet(struct, MaxEyeFov); }
	public void getMaxEyeFov(ByteBuffer MaxEyeFov, int index) { MaxEyeFovGet(struct, MaxEyeFov, index); }
	public void getResolution(ByteBuffer Resolution) { ResolutionGet(struct, Resolution); }
	public int getResolutionW() { return ResolutionW(struct); }
	public int getResolutionH() { return ResolutionH(struct); }
	public float getDisplayRefreshRate() { return DisplayRefreshRate(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Type,
		ByteBuffer ProductName,
		ByteBuffer Manufacturer,
		int VendorId,
		int ProductId,
		ByteBuffer SerialNumber,
		int FirmwareMajor,
		int FirmwareMinor,
		float CameraFrustumHFovInRadians,
		float CameraFrustumVFovInRadians,
		float CameraFrustumNearZInMeters,
		float CameraFrustumFarZInMeters,
		int AvailableHmdCaps,
		int DefaultHmdCaps,
		int AvailableTrackingCaps,
		int DefaultTrackingCaps,
		ByteBuffer DefaultEyeFov,
		ByteBuffer MaxEyeFov,
		ByteBuffer Resolution,
		float DisplayRefreshRate
	) {
		ByteBuffer ovrhmddesc = malloc();

		Type(ovrhmddesc, Type);
		ProductNameSet(ovrhmddesc, ProductName);
		ManufacturerSet(ovrhmddesc, Manufacturer);
		VendorId(ovrhmddesc, VendorId);
		ProductId(ovrhmddesc, ProductId);
		SerialNumberSet(ovrhmddesc, SerialNumber);
		FirmwareMajor(ovrhmddesc, FirmwareMajor);
		FirmwareMinor(ovrhmddesc, FirmwareMinor);
		CameraFrustumHFovInRadians(ovrhmddesc, CameraFrustumHFovInRadians);
		CameraFrustumVFovInRadians(ovrhmddesc, CameraFrustumVFovInRadians);
		CameraFrustumNearZInMeters(ovrhmddesc, CameraFrustumNearZInMeters);
		CameraFrustumFarZInMeters(ovrhmddesc, CameraFrustumFarZInMeters);
		AvailableHmdCaps(ovrhmddesc, AvailableHmdCaps);
		DefaultHmdCaps(ovrhmddesc, DefaultHmdCaps);
		AvailableTrackingCaps(ovrhmddesc, AvailableTrackingCaps);
		DefaultTrackingCaps(ovrhmddesc, DefaultTrackingCaps);
		DefaultEyeFovSet(ovrhmddesc, DefaultEyeFov);
		MaxEyeFovSet(ovrhmddesc, MaxEyeFov);
		ResolutionSet(ovrhmddesc, Resolution);
		DisplayRefreshRate(ovrhmddesc, DisplayRefreshRate);

		return ovrhmddesc;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Type,
		CharSequence ProductName,
		CharSequence Manufacturer,
		int VendorId,
		int ProductId,
		CharSequence SerialNumber,
		int FirmwareMajor,
		int FirmwareMinor,
		float CameraFrustumHFovInRadians,
		float CameraFrustumVFovInRadians,
		float CameraFrustumNearZInMeters,
		float CameraFrustumFarZInMeters,
		int AvailableHmdCaps,
		int DefaultHmdCaps,
		int AvailableTrackingCaps,
		int DefaultTrackingCaps,
		ByteBuffer DefaultEyeFov,
		ByteBuffer MaxEyeFov,
		ByteBuffer Resolution,
		float DisplayRefreshRate
	) {
		ByteBuffer ovrhmddesc = malloc();

		Type(ovrhmddesc, Type);
		ProductName(ovrhmddesc, ProductName);
		Manufacturer(ovrhmddesc, Manufacturer);
		VendorId(ovrhmddesc, VendorId);
		ProductId(ovrhmddesc, ProductId);
		SerialNumber(ovrhmddesc, SerialNumber);
		FirmwareMajor(ovrhmddesc, FirmwareMajor);
		FirmwareMinor(ovrhmddesc, FirmwareMinor);
		CameraFrustumHFovInRadians(ovrhmddesc, CameraFrustumHFovInRadians);
		CameraFrustumVFovInRadians(ovrhmddesc, CameraFrustumVFovInRadians);
		CameraFrustumNearZInMeters(ovrhmddesc, CameraFrustumNearZInMeters);
		CameraFrustumFarZInMeters(ovrhmddesc, CameraFrustumFarZInMeters);
		AvailableHmdCaps(ovrhmddesc, AvailableHmdCaps);
		DefaultHmdCaps(ovrhmddesc, DefaultHmdCaps);
		AvailableTrackingCaps(ovrhmddesc, AvailableTrackingCaps);
		DefaultTrackingCaps(ovrhmddesc, DefaultTrackingCaps);
		DefaultEyeFovSet(ovrhmddesc, DefaultEyeFov);
		MaxEyeFovSet(ovrhmddesc, MaxEyeFov);
		ResolutionSet(ovrhmddesc, Resolution);
		DisplayRefreshRate(ovrhmddesc, DisplayRefreshRate);

		return ovrhmddesc;
	}

	public static void Type(ByteBuffer ovrhmddesc, int Type) { ovrhmddesc.putInt(ovrhmddesc.position() + TYPE, Type); }
	public static void ProductNameSet(ByteBuffer ovrhmddesc, ByteBuffer ProductName) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(ProductName);
			checkBufferGT(ProductName, 64 * 1);
		}
		memCopy(memAddress(ProductName), memAddress(ovrhmddesc) + PRODUCTNAME, ProductName.remaining());
	}
	public static void ProductName(ByteBuffer ovrhmddesc, CharSequence ProductName) { memEncodeUTF8(ProductName, true, ovrhmddesc, PRODUCTNAME); }
	public static void ManufacturerSet(ByteBuffer ovrhmddesc, ByteBuffer Manufacturer) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(Manufacturer);
			checkBufferGT(Manufacturer, 64 * 1);
		}
		memCopy(memAddress(Manufacturer), memAddress(ovrhmddesc) + MANUFACTURER, Manufacturer.remaining());
	}
	public static void Manufacturer(ByteBuffer ovrhmddesc, CharSequence Manufacturer) { memEncodeUTF8(Manufacturer, true, ovrhmddesc, MANUFACTURER); }
	public static void VendorId(ByteBuffer ovrhmddesc, int VendorId) { ovrhmddesc.putShort(ovrhmddesc.position() + VENDORID, (short)VendorId); }
	public static void ProductId(ByteBuffer ovrhmddesc, int ProductId) { ovrhmddesc.putShort(ovrhmddesc.position() + PRODUCTID, (short)ProductId); }
	public static void SerialNumberSet(ByteBuffer ovrhmddesc, ByteBuffer SerialNumber) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(SerialNumber);
			checkBufferGT(SerialNumber, 24 * 1);
		}
		memCopy(memAddress(SerialNumber), memAddress(ovrhmddesc) + SERIALNUMBER, SerialNumber.remaining());
	}
	public static void SerialNumber(ByteBuffer ovrhmddesc, CharSequence SerialNumber) { memEncodeASCII(SerialNumber, true, ovrhmddesc, SERIALNUMBER); }
	public static void FirmwareMajor(ByteBuffer ovrhmddesc, int FirmwareMajor) { ovrhmddesc.putShort(ovrhmddesc.position() + FIRMWAREMAJOR, (short)FirmwareMajor); }
	public static void FirmwareMinor(ByteBuffer ovrhmddesc, int FirmwareMinor) { ovrhmddesc.putShort(ovrhmddesc.position() + FIRMWAREMINOR, (short)FirmwareMinor); }
	public static void CameraFrustumHFovInRadians(ByteBuffer ovrhmddesc, float CameraFrustumHFovInRadians) { ovrhmddesc.putFloat(ovrhmddesc.position() + CAMERAFRUSTUMHFOVINRADIANS, CameraFrustumHFovInRadians); }
	public static void CameraFrustumVFovInRadians(ByteBuffer ovrhmddesc, float CameraFrustumVFovInRadians) { ovrhmddesc.putFloat(ovrhmddesc.position() + CAMERAFRUSTUMVFOVINRADIANS, CameraFrustumVFovInRadians); }
	public static void CameraFrustumNearZInMeters(ByteBuffer ovrhmddesc, float CameraFrustumNearZInMeters) { ovrhmddesc.putFloat(ovrhmddesc.position() + CAMERAFRUSTUMNEARZINMETERS, CameraFrustumNearZInMeters); }
	public static void CameraFrustumFarZInMeters(ByteBuffer ovrhmddesc, float CameraFrustumFarZInMeters) { ovrhmddesc.putFloat(ovrhmddesc.position() + CAMERAFRUSTUMFARZINMETERS, CameraFrustumFarZInMeters); }
	public static void AvailableHmdCaps(ByteBuffer ovrhmddesc, int AvailableHmdCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + AVAILABLEHMDCAPS, AvailableHmdCaps); }
	public static void DefaultHmdCaps(ByteBuffer ovrhmddesc, int DefaultHmdCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + DEFAULTHMDCAPS, DefaultHmdCaps); }
	public static void AvailableTrackingCaps(ByteBuffer ovrhmddesc, int AvailableTrackingCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + AVAILABLETRACKINGCAPS, AvailableTrackingCaps); }
	public static void DefaultTrackingCaps(ByteBuffer ovrhmddesc, int DefaultTrackingCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + DEFAULTTRACKINGCAPS, DefaultTrackingCaps); }
	public static void DefaultEyeFovSet(ByteBuffer ovrhmddesc, ByteBuffer DefaultEyeFov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DefaultEyeFov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(DefaultEyeFov), memAddress(ovrhmddesc) + DEFAULTEYEFOV, DefaultEyeFov.remaining());
	}
	public static void DefaultEyeFovSet(ByteBuffer ovrhmddesc, ByteBuffer DefaultEyeFov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DefaultEyeFov, OVRFovPort.SIZEOF);
		memCopy(memAddress(DefaultEyeFov), memAddress(ovrhmddesc) + DEFAULTEYEFOV + index * OVRFovPort.SIZEOF, DefaultEyeFov.remaining());
	}
	public static void MaxEyeFovSet(ByteBuffer ovrhmddesc, ByteBuffer MaxEyeFov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(MaxEyeFov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(MaxEyeFov), memAddress(ovrhmddesc) + MAXEYEFOV, MaxEyeFov.remaining());
	}
	public static void MaxEyeFovSet(ByteBuffer ovrhmddesc, ByteBuffer MaxEyeFov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(MaxEyeFov, OVRFovPort.SIZEOF);
		memCopy(memAddress(MaxEyeFov), memAddress(ovrhmddesc) + MAXEYEFOV + index * OVRFovPort.SIZEOF, MaxEyeFov.remaining());
	}
	public static void ResolutionSet(ByteBuffer ovrhmddesc, ByteBuffer Resolution) { if ( Resolution != null ) memCopy(memAddress(Resolution), memAddress(ovrhmddesc) + RESOLUTION, OVRSizei.SIZEOF); }
	public static void ResolutionW(ByteBuffer ovrhmddesc, int w) { ovrhmddesc.putInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.W, w); }
	public static void ResolutionH(ByteBuffer ovrhmddesc, int h) { ovrhmddesc.putInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.H, h); }
	public static void DisplayRefreshRate(ByteBuffer ovrhmddesc, float DisplayRefreshRate) { ovrhmddesc.putFloat(ovrhmddesc.position() + DISPLAYREFRESHRATE, DisplayRefreshRate); }

	public static int Type(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + TYPE); }
	public static void ProductNameGet(ByteBuffer ovrhmddesc, ByteBuffer ProductName) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ProductName, 64 * 1);
		memCopy(memAddress(ovrhmddesc) + PRODUCTNAME, memAddress(ProductName), ProductName.remaining());
	}
	public static String ProductNameString(ByteBuffer ovrhmddesc) { return memDecodeUTF8(ovrhmddesc, memStrLen1(ovrhmddesc, PRODUCTNAME), PRODUCTNAME); }
	public static String ProductNameString(ByteBuffer ovrhmddesc, int byteLen) { return memDecodeUTF8(ovrhmddesc, byteLen, PRODUCTNAME); }
	public static void ManufacturerGet(ByteBuffer ovrhmddesc, ByteBuffer Manufacturer) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Manufacturer, 64 * 1);
		memCopy(memAddress(ovrhmddesc) + MANUFACTURER, memAddress(Manufacturer), Manufacturer.remaining());
	}
	public static String ManufacturerString(ByteBuffer ovrhmddesc) { return memDecodeUTF8(ovrhmddesc, memStrLen1(ovrhmddesc, MANUFACTURER), MANUFACTURER); }
	public static String ManufacturerString(ByteBuffer ovrhmddesc, int byteLen) { return memDecodeUTF8(ovrhmddesc, byteLen, MANUFACTURER); }
	public static int VendorId(ByteBuffer ovrhmddesc) { return ovrhmddesc.getShort(ovrhmddesc.position() + VENDORID); }
	public static int ProductId(ByteBuffer ovrhmddesc) { return ovrhmddesc.getShort(ovrhmddesc.position() + PRODUCTID); }
	public static void SerialNumberGet(ByteBuffer ovrhmddesc, ByteBuffer SerialNumber) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(SerialNumber, 24 * 1);
		memCopy(memAddress(ovrhmddesc) + SERIALNUMBER, memAddress(SerialNumber), SerialNumber.remaining());
	}
	public static String SerialNumberString(ByteBuffer ovrhmddesc) { return memDecodeASCII(ovrhmddesc, memStrLen1(ovrhmddesc, SERIALNUMBER), SERIALNUMBER); }
	public static String SerialNumberString(ByteBuffer ovrhmddesc, int byteLen) { return memDecodeASCII(ovrhmddesc, byteLen, SERIALNUMBER); }
	public static int FirmwareMajor(ByteBuffer ovrhmddesc) { return ovrhmddesc.getShort(ovrhmddesc.position() + FIRMWAREMAJOR); }
	public static int FirmwareMinor(ByteBuffer ovrhmddesc) { return ovrhmddesc.getShort(ovrhmddesc.position() + FIRMWAREMINOR); }
	public static float CameraFrustumHFovInRadians(ByteBuffer ovrhmddesc) { return ovrhmddesc.getFloat(ovrhmddesc.position() + CAMERAFRUSTUMHFOVINRADIANS); }
	public static float CameraFrustumVFovInRadians(ByteBuffer ovrhmddesc) { return ovrhmddesc.getFloat(ovrhmddesc.position() + CAMERAFRUSTUMVFOVINRADIANS); }
	public static float CameraFrustumNearZInMeters(ByteBuffer ovrhmddesc) { return ovrhmddesc.getFloat(ovrhmddesc.position() + CAMERAFRUSTUMNEARZINMETERS); }
	public static float CameraFrustumFarZInMeters(ByteBuffer ovrhmddesc) { return ovrhmddesc.getFloat(ovrhmddesc.position() + CAMERAFRUSTUMFARZINMETERS); }
	public static int AvailableHmdCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + AVAILABLEHMDCAPS); }
	public static int DefaultHmdCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + DEFAULTHMDCAPS); }
	public static int AvailableTrackingCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + AVAILABLETRACKINGCAPS); }
	public static int DefaultTrackingCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + DEFAULTTRACKINGCAPS); }
	public static void DefaultEyeFovGet(ByteBuffer ovrhmddesc, ByteBuffer DefaultEyeFov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DefaultEyeFov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrhmddesc) + DEFAULTEYEFOV, memAddress(DefaultEyeFov), DefaultEyeFov.remaining());
	}
	public static void DefaultEyeFovGet(ByteBuffer ovrhmddesc, ByteBuffer DefaultEyeFov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DefaultEyeFov, OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrhmddesc) + DEFAULTEYEFOV + index * OVRFovPort.SIZEOF, memAddress(DefaultEyeFov), DefaultEyeFov.remaining());
	}
	public static void MaxEyeFovGet(ByteBuffer ovrhmddesc, ByteBuffer MaxEyeFov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(MaxEyeFov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrhmddesc) + MAXEYEFOV, memAddress(MaxEyeFov), MaxEyeFov.remaining());
	}
	public static void MaxEyeFovGet(ByteBuffer ovrhmddesc, ByteBuffer MaxEyeFov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(MaxEyeFov, OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrhmddesc) + MAXEYEFOV + index * OVRFovPort.SIZEOF, memAddress(MaxEyeFov), MaxEyeFov.remaining());
	}
	public static void ResolutionGet(ByteBuffer ovrhmddesc, ByteBuffer Resolution) { if ( LWJGLUtil.CHECKS ) checkBuffer(Resolution, OVRSizei.SIZEOF); memCopy(memAddress(ovrhmddesc) + RESOLUTION, memAddress(Resolution), OVRSizei.SIZEOF); }
	public static int ResolutionW(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.W); }
	public static int ResolutionH(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.H); }
	public static float DisplayRefreshRate(ByteBuffer ovrhmddesc) { return ovrhmddesc.getFloat(ovrhmddesc.position() + DISPLAYREFRESHRATE); }

}