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
public final class DEVMODE {

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
			POSITION_X,
			POSITION_Y,
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
			POSITION_X = POSITION + POINTL.X;
			POSITION_Y = POSITION + POINTL.Y;
		LOGPIXELS = offsets.get(7);
		BITSPERPEL = offsets.get(8);
		PELSWIDTH = offsets.get(9);
		PELSHEIGHT = offsets.get(10);
		DISPLAYFLAGS = offsets.get(11);
		DISPLAYFREQUENCY = offsets.get(12);
	}

	private DEVMODE() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long deviceName,
		int deviceNameBytes,
		int specVersion,
		int driverVersion,
		int size,
		int driverExtra,
		int fields,
		int position_x,
		int position_y,
		int logPixels,
		int bitsPerPel,
		int pelsWidth,
		int pelsHeight,
		int displayFlags,
		int displayFrequency
	) {
		ByteBuffer devmode = malloc();

		deviceNameSet(devmode, deviceName, deviceNameBytes);
		specVersionSet(devmode, specVersion);
		driverVersionSet(devmode, driverVersion);
		sizeSet(devmode, size);
		driverExtraSet(devmode, driverExtra);
		fieldsSet(devmode, fields);
		positionXSet(devmode, position_x);
		positionYSet(devmode, position_y);
		logPixelsSet(devmode, logPixels);
		bitsPerPelSet(devmode, bitsPerPel);
		pelsWidthSet(devmode, pelsWidth);
		pelsHeightSet(devmode, pelsHeight);
		displayFlagsSet(devmode, displayFlags);
		displayFrequencySet(devmode, displayFrequency);

		return devmode;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer deviceName,
		int specVersion,
		int driverVersion,
		int size,
		int driverExtra,
		int fields,
		int position_x,
		int position_y,
		int logPixels,
		int bitsPerPel,
		int pelsWidth,
		int pelsHeight,
		int displayFlags,
		int displayFrequency
	) {
		ByteBuffer devmode = malloc();

		deviceNameSet(devmode, deviceName);
		specVersionSet(devmode, specVersion);
		driverVersionSet(devmode, driverVersion);
		sizeSet(devmode, size);
		driverExtraSet(devmode, driverExtra);
		fieldsSet(devmode, fields);
		positionXSet(devmode, position_x);
		positionYSet(devmode, position_y);
		logPixelsSet(devmode, logPixels);
		bitsPerPelSet(devmode, bitsPerPel);
		pelsWidthSet(devmode, pelsWidth);
		pelsHeightSet(devmode, pelsHeight);
		displayFlagsSet(devmode, displayFlags);
		displayFrequencySet(devmode, displayFrequency);

		return devmode;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		CharSequence deviceName,
		int specVersion,
		int driverVersion,
		int size,
		int driverExtra,
		int fields,
		int position_x,
		int position_y,
		int logPixels,
		int bitsPerPel,
		int pelsWidth,
		int pelsHeight,
		int displayFlags,
		int displayFrequency
	) {
		ByteBuffer devmode = malloc();

		deviceNameSet(devmode, deviceName);
		specVersionSet(devmode, specVersion);
		driverVersionSet(devmode, driverVersion);
		sizeSet(devmode, size);
		driverExtraSet(devmode, driverExtra);
		fieldsSet(devmode, fields);
		positionXSet(devmode, position_x);
		positionYSet(devmode, position_y);
		logPixelsSet(devmode, logPixels);
		bitsPerPelSet(devmode, bitsPerPel);
		pelsWidthSet(devmode, pelsWidth);
		pelsHeightSet(devmode, pelsHeight);
		displayFlagsSet(devmode, displayFlags);
		displayFrequencySet(devmode, displayFrequency);

		return devmode;
	}

	public static void deviceNameSet(ByteBuffer devmode, long deviceName, int bytes) { memCopy(deviceName, memAddress(devmode) + DEVICENAME, bytes); }
	public static void deviceNameSet(ByteBuffer devmode, ByteBuffer deviceName) {
		checkNT2(deviceName);
		checkBufferGT(deviceName, 32 * 2);
		deviceNameSet(devmode, memAddress(deviceName), deviceName.remaining());
	}
	public static void deviceNameSet(ByteBuffer devmode, CharSequence deviceName) { ByteBuffer buffer = memEncodeUTF16(deviceName, true); deviceNameSet(devmode, memAddress(buffer), buffer.capacity()); }
	public static void specVersionSet(ByteBuffer devmode, int specVersion) { devmode.putShort(devmode.position() + SPECVERSION, (short)specVersion); }
	public static void driverVersionSet(ByteBuffer devmode, int driverVersion) { devmode.putShort(devmode.position() + DRIVERVERSION, (short)driverVersion); }
	public static void sizeSet(ByteBuffer devmode, int size) { devmode.putShort(devmode.position() + SIZE, (short)size); }
	public static void driverExtraSet(ByteBuffer devmode, int driverExtra) { devmode.putShort(devmode.position() + DRIVEREXTRA, (short)driverExtra); }
	public static void fieldsSet(ByteBuffer devmode, int fields) { devmode.putInt(devmode.position() + FIELDS, fields); }
	public static void positionXSet(ByteBuffer devmode, int x) { devmode.putInt(devmode.position() + POSITION_X, x); }
	public static void positionYSet(ByteBuffer devmode, int y) { devmode.putInt(devmode.position() + POSITION_Y, y); }
	public static void logPixelsSet(ByteBuffer devmode, int logPixels) { devmode.putShort(devmode.position() + LOGPIXELS, (short)logPixels); }
	public static void bitsPerPelSet(ByteBuffer devmode, int bitsPerPel) { devmode.putInt(devmode.position() + BITSPERPEL, bitsPerPel); }
	public static void pelsWidthSet(ByteBuffer devmode, int pelsWidth) { devmode.putInt(devmode.position() + PELSWIDTH, pelsWidth); }
	public static void pelsHeightSet(ByteBuffer devmode, int pelsHeight) { devmode.putInt(devmode.position() + PELSHEIGHT, pelsHeight); }
	public static void displayFlagsSet(ByteBuffer devmode, int displayFlags) { devmode.putInt(devmode.position() + DISPLAYFLAGS, displayFlags); }
	public static void displayFrequencySet(ByteBuffer devmode, int displayFrequency) { devmode.putInt(devmode.position() + DISPLAYFREQUENCY, displayFrequency); }

	public static void deviceNameGet(ByteBuffer devmode, long deviceName, int bytes) {
		memCopy(memAddress(devmode) + DEVICENAME, deviceName, bytes);
	}
	public static void deviceNameGetb(ByteBuffer devmode, ByteBuffer deviceName) {
		checkBufferGT(deviceName, 32 * 2);
		deviceNameGet(devmode, memAddress(deviceName), deviceName.remaining());
	}
	public static String deviceNameGets(ByteBuffer devmode) { return memDecodeUTF16(devmode, memStrLen2(devmode, DEVICENAME), DEVICENAME); }
	public static String deviceNameGets(ByteBuffer devmode, int size) { return memDecodeUTF16(devmode, size, DEVICENAME); }
	public static int specVersionGet(ByteBuffer devmode) { return devmode.getShort(devmode.position() + SPECVERSION); }
	public static int driverVersionGet(ByteBuffer devmode) { return devmode.getShort(devmode.position() + DRIVERVERSION); }
	public static int sizeGet(ByteBuffer devmode) { return devmode.getShort(devmode.position() + SIZE); }
	public static int driverExtraGet(ByteBuffer devmode) { return devmode.getShort(devmode.position() + DRIVEREXTRA); }
	public static int fieldsGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + FIELDS); }
	public static int positionXGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + POSITION_X); }
	public static int positionYGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + POSITION_Y); }
	public static int logPixelsGet(ByteBuffer devmode) { return devmode.getShort(devmode.position() + LOGPIXELS); }
	public static int bitsPerPelGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + BITSPERPEL); }
	public static int pelsWidthGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + PELSWIDTH); }
	public static int pelsHeightGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + PELSHEIGHT); }
	public static int displayFlagsGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + DISPLAYFLAGS); }
	public static int displayFrequencyGet(ByteBuffer devmode) { return devmode.getInt(devmode.position() + DISPLAYFREQUENCY); }

}