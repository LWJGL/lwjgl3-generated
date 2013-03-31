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
		ByteBuffer struct = malloc();

		deviceNameSet(struct, deviceName, deviceNameBytes);
		specVersionSet(struct, specVersion);
		driverVersionSet(struct, driverVersion);
		sizeSet(struct, size);
		driverExtraSet(struct, driverExtra);
		fieldsSet(struct, fields);
		positionXSet(struct, position_x);
		positionYSet(struct, position_y);
		logPixelsSet(struct, logPixels);
		bitsPerPelSet(struct, bitsPerPel);
		pelsWidthSet(struct, pelsWidth);
		pelsHeightSet(struct, pelsHeight);
		displayFlagsSet(struct, displayFlags);
		displayFrequencySet(struct, displayFrequency);

		return struct;
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
		ByteBuffer struct = malloc();

		deviceNameSet(struct, deviceName);
		specVersionSet(struct, specVersion);
		driverVersionSet(struct, driverVersion);
		sizeSet(struct, size);
		driverExtraSet(struct, driverExtra);
		fieldsSet(struct, fields);
		positionXSet(struct, position_x);
		positionYSet(struct, position_y);
		logPixelsSet(struct, logPixels);
		bitsPerPelSet(struct, bitsPerPel);
		pelsWidthSet(struct, pelsWidth);
		pelsHeightSet(struct, pelsHeight);
		displayFlagsSet(struct, displayFlags);
		displayFrequencySet(struct, displayFrequency);

		return struct;
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
		ByteBuffer struct = malloc();

		deviceNameSet(struct, deviceName);
		specVersionSet(struct, specVersion);
		driverVersionSet(struct, driverVersion);
		sizeSet(struct, size);
		driverExtraSet(struct, driverExtra);
		fieldsSet(struct, fields);
		positionXSet(struct, position_x);
		positionYSet(struct, position_y);
		logPixelsSet(struct, logPixels);
		bitsPerPelSet(struct, bitsPerPel);
		pelsWidthSet(struct, pelsWidth);
		pelsHeightSet(struct, pelsHeight);
		displayFlagsSet(struct, displayFlags);
		displayFrequencySet(struct, displayFrequency);

		return struct;
	}

	public static void deviceNameSet(ByteBuffer struct, long deviceName, int bytes) { memCopy(deviceName, memAddress(struct) + DEVICENAME, bytes); }
	public static void deviceNameSet(ByteBuffer struct, ByteBuffer deviceName) {
		checkNT2(deviceName);
		checkBufferGT(deviceName, 32 * 2);
		deviceNameSet(struct, memAddress(deviceName), deviceName.remaining());
	}
	public static void deviceNameSet(ByteBuffer struct, CharSequence deviceName) { ByteBuffer buffer = memEncodeUTF16(deviceName, true); deviceNameSet(struct, memAddress(buffer), buffer.capacity()); }
	public static void specVersionSet(ByteBuffer struct, int specVersion) { struct.putShort(struct.position() + SPECVERSION, (short)specVersion); }
	public static void driverVersionSet(ByteBuffer struct, int driverVersion) { struct.putShort(struct.position() + DRIVERVERSION, (short)driverVersion); }
	public static void sizeSet(ByteBuffer struct, int size) { struct.putShort(struct.position() + SIZE, (short)size); }
	public static void driverExtraSet(ByteBuffer struct, int driverExtra) { struct.putShort(struct.position() + DRIVEREXTRA, (short)driverExtra); }
	public static void fieldsSet(ByteBuffer struct, int fields) { struct.putInt(struct.position() + FIELDS, fields); }
	public static void positionXSet(ByteBuffer struct, int x) { struct.putInt(struct.position() + POSITION_X, x); }
	public static void positionYSet(ByteBuffer struct, int y) { struct.putInt(struct.position() + POSITION_Y, y); }
	public static void logPixelsSet(ByteBuffer struct, int logPixels) { struct.putShort(struct.position() + LOGPIXELS, (short)logPixels); }
	public static void bitsPerPelSet(ByteBuffer struct, int bitsPerPel) { struct.putInt(struct.position() + BITSPERPEL, bitsPerPel); }
	public static void pelsWidthSet(ByteBuffer struct, int pelsWidth) { struct.putInt(struct.position() + PELSWIDTH, pelsWidth); }
	public static void pelsHeightSet(ByteBuffer struct, int pelsHeight) { struct.putInt(struct.position() + PELSHEIGHT, pelsHeight); }
	public static void displayFlagsSet(ByteBuffer struct, int displayFlags) { struct.putInt(struct.position() + DISPLAYFLAGS, displayFlags); }
	public static void displayFrequencySet(ByteBuffer struct, int displayFrequency) { struct.putInt(struct.position() + DISPLAYFREQUENCY, displayFrequency); }

	public static void deviceNameGet(ByteBuffer struct, long deviceName, int bytes) {
		memCopy(memAddress(struct) + DEVICENAME, deviceName, bytes);
	}
	public static void deviceNameGetb(ByteBuffer struct, ByteBuffer deviceName) {
		checkBufferGT(deviceName, 32 * 2);
		deviceNameGet(struct, memAddress(deviceName), deviceName.remaining());
	}
	public static String deviceNameGets(ByteBuffer struct) { return memDecodeUTF16(memByteBufferNT2(memAddress(struct) + DEVICENAME)); }
	public static String deviceNameGets(ByteBuffer struct, int size) { return memDecodeUTF16(memByteBuffer(memAddress(struct) + DEVICENAME, size)); }
	public static int specVersionGet(ByteBuffer struct) { return struct.getShort(struct.position() + SPECVERSION); }
	public static int driverVersionGet(ByteBuffer struct) { return struct.getShort(struct.position() + DRIVERVERSION); }
	public static int sizeGet(ByteBuffer struct) { return struct.getShort(struct.position() + SIZE); }
	public static int driverExtraGet(ByteBuffer struct) { return struct.getShort(struct.position() + DRIVEREXTRA); }
	public static int fieldsGet(ByteBuffer struct) { return struct.getInt(struct.position() + FIELDS); }
	public static int positionXGet(ByteBuffer struct) { return struct.getInt(struct.position() + POSITION_X); }
	public static int positionYGet(ByteBuffer struct) { return struct.getInt(struct.position() + POSITION_Y); }
	public static int logPixelsGet(ByteBuffer struct) { return struct.getShort(struct.position() + LOGPIXELS); }
	public static int bitsPerPelGet(ByteBuffer struct) { return struct.getInt(struct.position() + BITSPERPEL); }
	public static int pelsWidthGet(ByteBuffer struct) { return struct.getInt(struct.position() + PELSWIDTH); }
	public static int pelsHeightGet(ByteBuffer struct) { return struct.getInt(struct.position() + PELSHEIGHT); }
	public static int displayFlagsGet(ByteBuffer struct) { return struct.getInt(struct.position() + DISPLAYFLAGS); }
	public static int displayFrequencyGet(ByteBuffer struct) { return struct.getInt(struct.position() + DISPLAYFREQUENCY); }

}