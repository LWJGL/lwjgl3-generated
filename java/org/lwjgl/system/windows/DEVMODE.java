/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about the initialization and environment of a printer or a display device. */
public final class DEVMODE implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DEVICENAME,
		SPECVERSION,
		DRIVERVERSION,
		SIZE,
		DRIVEREXTRA,
		FIELDS,
		POSITION,
		LOGPIXELS,
		BITSPERPEL,
		PELSWIDTH,
		PELSHEIGHT,
		DISPLAYFLAGS,
		DISPLAYFREQUENCY;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(13);

		SIZEOF = offsets(memAddress(offsets));

		DEVICENAME = offsets.get(0);
		SPECVERSION = offsets.get(1);
		DRIVERVERSION = offsets.get(2);
		SIZE = offsets.get(3);
		DRIVEREXTRA = offsets.get(4);
		FIELDS = offsets.get(5);
		POSITION = offsets.get(6);
		LOGPIXELS = offsets.get(7);
		BITSPERPEL = offsets.get(8);
		PELSWIDTH = offsets.get(9);
		PELSHEIGHT = offsets.get(10);
		DISPLAYFLAGS = offsets.get(11);
		DISPLAYFREQUENCY = offsets.get(12);
	}

	private final ByteBuffer struct;

	public DEVMODE() {
		this(malloc());
	}

	public DEVMODE(ByteBuffer struct) {
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

	public void setDeviceName(ByteBuffer deviceName) { deviceNameSet(struct, deviceName); }
	public void setDeviceName(CharSequence deviceName) { deviceName(struct, deviceName); }
	public void setSpecVersion(int specVersion) { specVersion(struct, specVersion); }
	public void setDriverVersion(int driverVersion) { driverVersion(struct, driverVersion); }
	public void setSize(int size) { size(struct, size); }
	public void setDriverExtra(int driverExtra) { driverExtra(struct, driverExtra); }
	public void setFields(int fields) { fields(struct, fields); }
	public void setPosition(ByteBuffer position) { positionSet(struct, position); }
	public void setPositionX(int x) { positionX(struct, x); }
	public void setPositionY(int y) { positionY(struct, y); }
	public void setLogPixels(int logPixels) { logPixels(struct, logPixels); }
	public void setBitsPerPel(int bitsPerPel) { bitsPerPel(struct, bitsPerPel); }
	public void setPelsWidth(int pelsWidth) { pelsWidth(struct, pelsWidth); }
	public void setPelsHeight(int pelsHeight) { pelsHeight(struct, pelsHeight); }
	public void setDisplayFlags(int displayFlags) { displayFlags(struct, displayFlags); }
	public void setDisplayFrequency(int displayFrequency) { displayFrequency(struct, displayFrequency); }

	public void getDeviceName(ByteBuffer deviceName) { deviceNameGet(struct, deviceName); }
	public String getDeviceNameString() { return deviceNameString(struct); }
	public String getDeviceNameString(int byteLen) { return deviceNameString(struct, byteLen); }
	public int getSpecVersion() { return specVersion(struct); }
	public int getDriverVersion() { return driverVersion(struct); }
	public int getSize() { return size(struct); }
	public int getDriverExtra() { return driverExtra(struct); }
	public int getFields() { return fields(struct); }
	public void getPosition(ByteBuffer position) { positionGet(struct, position); }
	public int getPositionX() { return positionX(struct); }
	public int getPositionY() { return positionY(struct); }
	public int getLogPixels() { return logPixels(struct); }
	public int getBitsPerPel() { return bitsPerPel(struct); }
	public int getPelsWidth() { return pelsWidth(struct); }
	public int getPelsHeight() { return pelsHeight(struct); }
	public int getDisplayFlags() { return displayFlags(struct); }
	public int getDisplayFrequency() { return displayFrequency(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer deviceName,
		int specVersion,
		int driverVersion,
		int size,
		int driverExtra,
		int fields,
		ByteBuffer position,
		int logPixels,
		int bitsPerPel,
		int pelsWidth,
		int pelsHeight,
		int displayFlags,
		int displayFrequency
	) {
		ByteBuffer devmode = malloc();

		deviceNameSet(devmode, deviceName);
		specVersion(devmode, specVersion);
		driverVersion(devmode, driverVersion);
		size(devmode, size);
		driverExtra(devmode, driverExtra);
		fields(devmode, fields);
		positionSet(devmode, position);
		logPixels(devmode, logPixels);
		bitsPerPel(devmode, bitsPerPel);
		pelsWidth(devmode, pelsWidth);
		pelsHeight(devmode, pelsHeight);
		displayFlags(devmode, displayFlags);
		displayFrequency(devmode, displayFrequency);

		return devmode;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		CharSequence deviceName,
		int specVersion,
		int driverVersion,
		int size,
		int driverExtra,
		int fields,
		ByteBuffer position,
		int logPixels,
		int bitsPerPel,
		int pelsWidth,
		int pelsHeight,
		int displayFlags,
		int displayFrequency
	) {
		ByteBuffer devmode = malloc();

		deviceName(devmode, deviceName);
		specVersion(devmode, specVersion);
		driverVersion(devmode, driverVersion);
		size(devmode, size);
		driverExtra(devmode, driverExtra);
		fields(devmode, fields);
		positionSet(devmode, position);
		logPixels(devmode, logPixels);
		bitsPerPel(devmode, bitsPerPel);
		pelsWidth(devmode, pelsWidth);
		pelsHeight(devmode, pelsHeight);
		displayFlags(devmode, displayFlags);
		displayFrequency(devmode, displayFrequency);

		return devmode;
	}

	public static void deviceNameSet(ByteBuffer devmode, ByteBuffer deviceName) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(deviceName);
			checkBufferGT(deviceName, 32 * 2);
		}
		memCopy(memAddress(deviceName), memAddress(devmode) + DEVICENAME, deviceName.remaining());
	}
	public static void deviceName(ByteBuffer devmode, CharSequence deviceName) { memEncodeUTF16(deviceName, true, devmode, DEVICENAME); }
	public static void specVersion(ByteBuffer devmode, int specVersion) { devmode.putShort(devmode.position() + SPECVERSION, (short)specVersion); }
	public static void driverVersion(ByteBuffer devmode, int driverVersion) { devmode.putShort(devmode.position() + DRIVERVERSION, (short)driverVersion); }
	public static void size(ByteBuffer devmode, int size) { devmode.putShort(devmode.position() + SIZE, (short)size); }
	public static void driverExtra(ByteBuffer devmode, int driverExtra) { devmode.putShort(devmode.position() + DRIVEREXTRA, (short)driverExtra); }
	public static void fields(ByteBuffer devmode, int fields) { devmode.putInt(devmode.position() + FIELDS, fields); }
	public static void positionSet(ByteBuffer devmode, ByteBuffer position) { if ( position != null ) memCopy(memAddress(position), memAddress(devmode) + POSITION, POINTL.SIZEOF); }
	public static void positionX(ByteBuffer devmode, int x) { devmode.putInt(devmode.position() + POSITION + POINTL.X, x); }
	public static void positionY(ByteBuffer devmode, int y) { devmode.putInt(devmode.position() + POSITION + POINTL.Y, y); }
	public static void logPixels(ByteBuffer devmode, int logPixels) { devmode.putShort(devmode.position() + LOGPIXELS, (short)logPixels); }
	public static void bitsPerPel(ByteBuffer devmode, int bitsPerPel) { devmode.putInt(devmode.position() + BITSPERPEL, bitsPerPel); }
	public static void pelsWidth(ByteBuffer devmode, int pelsWidth) { devmode.putInt(devmode.position() + PELSWIDTH, pelsWidth); }
	public static void pelsHeight(ByteBuffer devmode, int pelsHeight) { devmode.putInt(devmode.position() + PELSHEIGHT, pelsHeight); }
	public static void displayFlags(ByteBuffer devmode, int displayFlags) { devmode.putInt(devmode.position() + DISPLAYFLAGS, displayFlags); }
	public static void displayFrequency(ByteBuffer devmode, int displayFrequency) { devmode.putInt(devmode.position() + DISPLAYFREQUENCY, displayFrequency); }

	public static void deviceNameGet(ByteBuffer devmode, ByteBuffer deviceName) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(deviceName, 32 * 2);
		memCopy(memAddress(devmode) + DEVICENAME, memAddress(deviceName), deviceName.remaining());
	}
	public static String deviceNameString(ByteBuffer devmode) { return memDecodeUTF16(devmode, memStrLen2(devmode, DEVICENAME), DEVICENAME); }
	public static String deviceNameString(ByteBuffer devmode, int byteLen) { return memDecodeUTF16(devmode, byteLen, DEVICENAME); }
	public static int specVersion(ByteBuffer devmode) { return devmode.getShort(devmode.position() + SPECVERSION); }
	public static int driverVersion(ByteBuffer devmode) { return devmode.getShort(devmode.position() + DRIVERVERSION); }
	public static int size(ByteBuffer devmode) { return devmode.getShort(devmode.position() + SIZE); }
	public static int driverExtra(ByteBuffer devmode) { return devmode.getShort(devmode.position() + DRIVEREXTRA); }
	public static int fields(ByteBuffer devmode) { return devmode.getInt(devmode.position() + FIELDS); }
	public static void positionGet(ByteBuffer devmode, ByteBuffer position) { if ( LWJGLUtil.CHECKS ) checkBuffer(position, POINTL.SIZEOF); memCopy(memAddress(devmode) + POSITION, memAddress(position), POINTL.SIZEOF); }
	public static int positionX(ByteBuffer devmode) { return devmode.getInt(devmode.position() + POSITION + POINTL.X); }
	public static int positionY(ByteBuffer devmode) { return devmode.getInt(devmode.position() + POSITION + POINTL.Y); }
	public static int logPixels(ByteBuffer devmode) { return devmode.getShort(devmode.position() + LOGPIXELS); }
	public static int bitsPerPel(ByteBuffer devmode) { return devmode.getInt(devmode.position() + BITSPERPEL); }
	public static int pelsWidth(ByteBuffer devmode) { return devmode.getInt(devmode.position() + PELSWIDTH); }
	public static int pelsHeight(ByteBuffer devmode) { return devmode.getInt(devmode.position() + PELSHEIGHT); }
	public static int displayFlags(ByteBuffer devmode) { return devmode.getInt(devmode.position() + DISPLAYFLAGS); }
	public static int displayFrequency(ByteBuffer devmode) { return devmode.getInt(devmode.position() + DISPLAYFREQUENCY); }

}