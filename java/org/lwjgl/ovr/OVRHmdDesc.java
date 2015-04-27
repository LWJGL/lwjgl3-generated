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
		HMDCAPS,
		TRACKINGCAPS,
		DISTORTIONCAPS,
		DEFAULTEYEFOV,
		MAXEYEFOV,
		EYERENDERORDER,
		RESOLUTION,
		WINDOWSPOS,
		DISPLAYDEVICENAME,
		DISPLAYID;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(22);

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
		HMDCAPS = offsets.get(12);
		TRACKINGCAPS = offsets.get(13);
		DISTORTIONCAPS = offsets.get(14);
		DEFAULTEYEFOV = offsets.get(15);
		MAXEYEFOV = offsets.get(16);
		EYERENDERORDER = offsets.get(17);
		RESOLUTION = offsets.get(18);
		WINDOWSPOS = offsets.get(19);
		DISPLAYDEVICENAME = offsets.get(20);
		DISPLAYID = offsets.get(21);
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

	public void setType(int Type) { Type(struct, Type); }
	public void setProductName(long ProductName) { ProductName(struct, ProductName); }
	public void setProductName(ByteBuffer ProductName) { ProductName(struct, ProductName); }
	public void setManufacturer(long Manufacturer) { Manufacturer(struct, Manufacturer); }
	public void setManufacturer(ByteBuffer Manufacturer) { Manufacturer(struct, Manufacturer); }
	public void setVendorId(int VendorId) { VendorId(struct, VendorId); }
	public void setProductId(int ProductId) { ProductId(struct, ProductId); }
	public void setSerialNumber(ByteBuffer SerialNumber) { SerialNumberSet(struct, SerialNumber); }
	public void setSerialNumber(CharSequence SerialNumber) { SerialNumber(struct, SerialNumber); }
	public void setFirmwareMajor(int FirmwareMajor) { FirmwareMajor(struct, FirmwareMajor); }
	public void setFirmwareMinor(int FirmwareMinor) { FirmwareMinor(struct, FirmwareMinor); }
	public void setCameraFrustumHFovInRadians(float CameraFrustumHFovInRadians) { CameraFrustumHFovInRadians(struct, CameraFrustumHFovInRadians); }
	public void setCameraFrustumVFovInRadians(float CameraFrustumVFovInRadians) { CameraFrustumVFovInRadians(struct, CameraFrustumVFovInRadians); }
	public void setCameraFrustumNearZInMeters(float CameraFrustumNearZInMeters) { CameraFrustumNearZInMeters(struct, CameraFrustumNearZInMeters); }
	public void setCameraFrustumFarZInMeters(float CameraFrustumFarZInMeters) { CameraFrustumFarZInMeters(struct, CameraFrustumFarZInMeters); }
	public void setHmdCaps(int HmdCaps) { HmdCaps(struct, HmdCaps); }
	public void setTrackingCaps(int TrackingCaps) { TrackingCaps(struct, TrackingCaps); }
	public void setDistortionCaps(int DistortionCaps) { DistortionCaps(struct, DistortionCaps); }
	public void setDefaultEyeFov(ByteBuffer DefaultEyeFov) { DefaultEyeFovSet(struct, DefaultEyeFov); }
	public void setDefaultEyeFov(ByteBuffer DefaultEyeFov, int index) { DefaultEyeFovSet(struct, DefaultEyeFov, index); }
	public void setMaxEyeFov(ByteBuffer MaxEyeFov) { MaxEyeFovSet(struct, MaxEyeFov); }
	public void setMaxEyeFov(ByteBuffer MaxEyeFov, int index) { MaxEyeFovSet(struct, MaxEyeFov, index); }
	public void setEyeRenderOrder(ByteBuffer EyeRenderOrder) { EyeRenderOrderSet(struct, EyeRenderOrder); }
	public void setEyeRenderOrder(int index, int EyeRenderOrder) { EyeRenderOrder(struct, index, EyeRenderOrder); }
	public void setResolution(ByteBuffer Resolution) { ResolutionSet(struct, Resolution); }
	public void setResolutionW(int w) { ResolutionW(struct, w); }
	public void setResolutionH(int h) { ResolutionH(struct, h); }
	public void setWindowsPos(ByteBuffer WindowsPos) { WindowsPosSet(struct, WindowsPos); }
	public void setWindowsPosX(int x) { WindowsPosX(struct, x); }
	public void setWindowsPosY(int y) { WindowsPosY(struct, y); }
	public void setDisplayDeviceName(long DisplayDeviceName) { DisplayDeviceName(struct, DisplayDeviceName); }
	public void setDisplayDeviceName(ByteBuffer DisplayDeviceName) { DisplayDeviceName(struct, DisplayDeviceName); }
	public void setDisplayId(int DisplayId) { DisplayId(struct, DisplayId); }

	public int getType() { return Type(struct); }
	public long getProductName() { return ProductName(struct); }
	public ByteBuffer getProductNameBuffer() { return ProductNameBuffer(struct); }
	public String getProductNameString() { return ProductNameString(struct); }
	public long getManufacturer() { return Manufacturer(struct); }
	public ByteBuffer getManufacturerBuffer() { return ManufacturerBuffer(struct); }
	public String getManufacturerString() { return ManufacturerString(struct); }
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
	public int getHmdCaps() { return HmdCaps(struct); }
	public int getTrackingCaps() { return TrackingCaps(struct); }
	public int getDistortionCaps() { return DistortionCaps(struct); }
	public void getDefaultEyeFov(ByteBuffer DefaultEyeFov) { DefaultEyeFovGet(struct, DefaultEyeFov); }
	public void getDefaultEyeFov(ByteBuffer DefaultEyeFov, int index) { DefaultEyeFovGet(struct, DefaultEyeFov, index); }
	public void getMaxEyeFov(ByteBuffer MaxEyeFov) { MaxEyeFovGet(struct, MaxEyeFov); }
	public void getMaxEyeFov(ByteBuffer MaxEyeFov, int index) { MaxEyeFovGet(struct, MaxEyeFov, index); }
	public void getEyeRenderOrder(ByteBuffer EyeRenderOrder) { EyeRenderOrderGet(struct, EyeRenderOrder); }
	public void getResolution(ByteBuffer Resolution) { ResolutionGet(struct, Resolution); }
	public int getResolutionW() { return ResolutionW(struct); }
	public int getResolutionH() { return ResolutionH(struct); }
	public void getWindowsPos(ByteBuffer WindowsPos) { WindowsPosGet(struct, WindowsPos); }
	public int getWindowsPosX() { return WindowsPosX(struct); }
	public int getWindowsPosY() { return WindowsPosY(struct); }
	public long getDisplayDeviceName() { return DisplayDeviceName(struct); }
	public ByteBuffer getDisplayDeviceNameBuffer() { return DisplayDeviceNameBuffer(struct); }
	public String getDisplayDeviceNameString() { return DisplayDeviceNameString(struct); }
	public int getDisplayId() { return DisplayId(struct); }

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
		int HmdCaps,
		int TrackingCaps,
		int DistortionCaps,
		ByteBuffer DefaultEyeFov,
		ByteBuffer MaxEyeFov,
		ByteBuffer EyeRenderOrder,
		ByteBuffer Resolution,
		ByteBuffer WindowsPos,
		ByteBuffer DisplayDeviceName,
		int DisplayId
	) {
		ByteBuffer ovrhmddesc = malloc();

		Type(ovrhmddesc, Type);
		ProductName(ovrhmddesc, ProductName);
		Manufacturer(ovrhmddesc, Manufacturer);
		VendorId(ovrhmddesc, VendorId);
		ProductId(ovrhmddesc, ProductId);
		SerialNumberSet(ovrhmddesc, SerialNumber);
		FirmwareMajor(ovrhmddesc, FirmwareMajor);
		FirmwareMinor(ovrhmddesc, FirmwareMinor);
		CameraFrustumHFovInRadians(ovrhmddesc, CameraFrustumHFovInRadians);
		CameraFrustumVFovInRadians(ovrhmddesc, CameraFrustumVFovInRadians);
		CameraFrustumNearZInMeters(ovrhmddesc, CameraFrustumNearZInMeters);
		CameraFrustumFarZInMeters(ovrhmddesc, CameraFrustumFarZInMeters);
		HmdCaps(ovrhmddesc, HmdCaps);
		TrackingCaps(ovrhmddesc, TrackingCaps);
		DistortionCaps(ovrhmddesc, DistortionCaps);
		DefaultEyeFovSet(ovrhmddesc, DefaultEyeFov);
		MaxEyeFovSet(ovrhmddesc, MaxEyeFov);
		EyeRenderOrderSet(ovrhmddesc, EyeRenderOrder);
		ResolutionSet(ovrhmddesc, Resolution);
		WindowsPosSet(ovrhmddesc, WindowsPos);
		DisplayDeviceName(ovrhmddesc, DisplayDeviceName);
		DisplayId(ovrhmddesc, DisplayId);

		return ovrhmddesc;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Type,
		ByteBuffer ProductName,
		ByteBuffer Manufacturer,
		int VendorId,
		int ProductId,
		CharSequence SerialNumber,
		int FirmwareMajor,
		int FirmwareMinor,
		float CameraFrustumHFovInRadians,
		float CameraFrustumVFovInRadians,
		float CameraFrustumNearZInMeters,
		float CameraFrustumFarZInMeters,
		int HmdCaps,
		int TrackingCaps,
		int DistortionCaps,
		ByteBuffer DefaultEyeFov,
		ByteBuffer MaxEyeFov,
		ByteBuffer EyeRenderOrder,
		ByteBuffer Resolution,
		ByteBuffer WindowsPos,
		ByteBuffer DisplayDeviceName,
		int DisplayId
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
		HmdCaps(ovrhmddesc, HmdCaps);
		TrackingCaps(ovrhmddesc, TrackingCaps);
		DistortionCaps(ovrhmddesc, DistortionCaps);
		DefaultEyeFovSet(ovrhmddesc, DefaultEyeFov);
		MaxEyeFovSet(ovrhmddesc, MaxEyeFov);
		EyeRenderOrderSet(ovrhmddesc, EyeRenderOrder);
		ResolutionSet(ovrhmddesc, Resolution);
		WindowsPosSet(ovrhmddesc, WindowsPos);
		DisplayDeviceName(ovrhmddesc, DisplayDeviceName);
		DisplayId(ovrhmddesc, DisplayId);

		return ovrhmddesc;
	}

	public static void Type(ByteBuffer ovrhmddesc, int Type) { ovrhmddesc.putInt(ovrhmddesc.position() + TYPE, Type); }
	public static void ProductName(ByteBuffer ovrhmddesc, long ProductName) { PointerBuffer.put(ovrhmddesc, ovrhmddesc.position() + PRODUCTNAME, ProductName); }
	public static void ProductName(ByteBuffer ovrhmddesc, ByteBuffer ProductName) { if ( LWJGLUtil.CHECKS && ProductName != null ) checkNT1(ProductName); ProductName(ovrhmddesc, memAddressSafe(ProductName)); }
	public static void Manufacturer(ByteBuffer ovrhmddesc, long Manufacturer) { PointerBuffer.put(ovrhmddesc, ovrhmddesc.position() + MANUFACTURER, Manufacturer); }
	public static void Manufacturer(ByteBuffer ovrhmddesc, ByteBuffer Manufacturer) { if ( LWJGLUtil.CHECKS && Manufacturer != null ) checkNT1(Manufacturer); Manufacturer(ovrhmddesc, memAddressSafe(Manufacturer)); }
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
	public static void HmdCaps(ByteBuffer ovrhmddesc, int HmdCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + HMDCAPS, HmdCaps); }
	public static void TrackingCaps(ByteBuffer ovrhmddesc, int TrackingCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + TRACKINGCAPS, TrackingCaps); }
	public static void DistortionCaps(ByteBuffer ovrhmddesc, int DistortionCaps) { ovrhmddesc.putInt(ovrhmddesc.position() + DISTORTIONCAPS, DistortionCaps); }
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
	public static void EyeRenderOrderSet(ByteBuffer ovrhmddesc, ByteBuffer EyeRenderOrder) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(EyeRenderOrder, 2 * 4);
		}
		memCopy(memAddress(EyeRenderOrder), memAddress(ovrhmddesc) + EYERENDERORDER, EyeRenderOrder.remaining());
	}
	public static void EyeRenderOrder(ByteBuffer ovrhmddesc, int index, int EyeRenderOrder) { ovrhmddesc.putInt(EYERENDERORDER + index * 4, EyeRenderOrder); }
	public static void ResolutionSet(ByteBuffer ovrhmddesc, ByteBuffer Resolution) { if ( Resolution != null ) memCopy(memAddress(Resolution), memAddress(ovrhmddesc) + RESOLUTION, OVRSizei.SIZEOF); }
	public static void ResolutionW(ByteBuffer ovrhmddesc, int w) { ovrhmddesc.putInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.W, w); }
	public static void ResolutionH(ByteBuffer ovrhmddesc, int h) { ovrhmddesc.putInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.H, h); }
	public static void WindowsPosSet(ByteBuffer ovrhmddesc, ByteBuffer WindowsPos) { if ( WindowsPos != null ) memCopy(memAddress(WindowsPos), memAddress(ovrhmddesc) + WINDOWSPOS, OVRVector2i.SIZEOF); }
	public static void WindowsPosX(ByteBuffer ovrhmddesc, int x) { ovrhmddesc.putInt(ovrhmddesc.position() + WINDOWSPOS + OVRVector2i.X, x); }
	public static void WindowsPosY(ByteBuffer ovrhmddesc, int y) { ovrhmddesc.putInt(ovrhmddesc.position() + WINDOWSPOS + OVRVector2i.Y, y); }
	public static void DisplayDeviceName(ByteBuffer ovrhmddesc, long DisplayDeviceName) { PointerBuffer.put(ovrhmddesc, ovrhmddesc.position() + DISPLAYDEVICENAME, DisplayDeviceName); }
	public static void DisplayDeviceName(ByteBuffer ovrhmddesc, ByteBuffer DisplayDeviceName) { if ( LWJGLUtil.CHECKS && DisplayDeviceName != null ) checkNT1(DisplayDeviceName); DisplayDeviceName(ovrhmddesc, memAddressSafe(DisplayDeviceName)); }
	public static void DisplayId(ByteBuffer ovrhmddesc, int DisplayId) { ovrhmddesc.putInt(ovrhmddesc.position() + DISPLAYID, DisplayId); }

	public static int Type(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + TYPE); }
	public static long ProductName(ByteBuffer ovrhmddesc) { return PointerBuffer.get(ovrhmddesc, ovrhmddesc.position() + PRODUCTNAME); }
	public static ByteBuffer ProductNameBuffer(ByteBuffer ovrhmddesc) { return memByteBufferNT1(ProductName(ovrhmddesc)); }
	public static String ProductNameString(ByteBuffer ovrhmddesc) { return memDecodeASCII(ProductName(ovrhmddesc)); }
	public static long Manufacturer(ByteBuffer ovrhmddesc) { return PointerBuffer.get(ovrhmddesc, ovrhmddesc.position() + MANUFACTURER); }
	public static ByteBuffer ManufacturerBuffer(ByteBuffer ovrhmddesc) { return memByteBufferNT1(Manufacturer(ovrhmddesc)); }
	public static String ManufacturerString(ByteBuffer ovrhmddesc) { return memDecodeASCII(Manufacturer(ovrhmddesc)); }
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
	public static int HmdCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + HMDCAPS); }
	public static int TrackingCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + TRACKINGCAPS); }
	public static int DistortionCaps(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + DISTORTIONCAPS); }
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
	public static void EyeRenderOrderGet(ByteBuffer ovrhmddesc, ByteBuffer EyeRenderOrder) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(EyeRenderOrder, 2 * 4);
		memCopy(memAddress(ovrhmddesc) + EYERENDERORDER, memAddress(EyeRenderOrder), EyeRenderOrder.remaining());
	}
	public static int EyeRenderOrder(ByteBuffer ovrhmddesc, int index) {
		return ovrhmddesc.getInt(EYERENDERORDER + index * 4);
	}
	public static void ResolutionGet(ByteBuffer ovrhmddesc, ByteBuffer Resolution) { if ( LWJGLUtil.CHECKS ) checkBuffer(Resolution, OVRSizei.SIZEOF); memCopy(memAddress(ovrhmddesc) + RESOLUTION, memAddress(Resolution), OVRSizei.SIZEOF); }
	public static int ResolutionW(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.W); }
	public static int ResolutionH(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + RESOLUTION + OVRSizei.H); }
	public static void WindowsPosGet(ByteBuffer ovrhmddesc, ByteBuffer WindowsPos) { if ( LWJGLUtil.CHECKS ) checkBuffer(WindowsPos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrhmddesc) + WINDOWSPOS, memAddress(WindowsPos), OVRVector2i.SIZEOF); }
	public static int WindowsPosX(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + WINDOWSPOS + OVRVector2i.X); }
	public static int WindowsPosY(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + WINDOWSPOS + OVRVector2i.Y); }
	public static long DisplayDeviceName(ByteBuffer ovrhmddesc) { return PointerBuffer.get(ovrhmddesc, ovrhmddesc.position() + DISPLAYDEVICENAME); }
	public static ByteBuffer DisplayDeviceNameBuffer(ByteBuffer ovrhmddesc) { return memByteBufferNT1(DisplayDeviceName(ovrhmddesc)); }
	public static String DisplayDeviceNameString(ByteBuffer ovrhmddesc) { return memDecodeASCII(DisplayDeviceName(ovrhmddesc)); }
	public static int DisplayId(ByteBuffer ovrhmddesc) { return ovrhmddesc.getInt(ovrhmddesc.position() + DISPLAYID); }

}