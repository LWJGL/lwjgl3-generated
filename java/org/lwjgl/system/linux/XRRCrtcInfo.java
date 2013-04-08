/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Xrandr Crtc info struct. */
public final class XRRCrtcInfo {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TIMESTAMP,
		X,
		Y,
		WIDTH,
		HEIGHT,
		MODE,
		ROTATION,
		NOUTPUT,
		OUTPUTS,
		ROTATIONS,
		NPOSSIBLE,
		POSSIBLE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(12);

		SIZEOF = offsets(memAddress(offsets));

		TIMESTAMP = offsets.get(0);
		X = offsets.get(1);
		Y = offsets.get(2);
		WIDTH = offsets.get(3);
		HEIGHT = offsets.get(4);
		MODE = offsets.get(5);
		ROTATION = offsets.get(6);
		NOUTPUT = offsets.get(7);
		OUTPUTS = offsets.get(8);
		ROTATIONS = offsets.get(9);
		NPOSSIBLE = offsets.get(10);
		POSSIBLE = offsets.get(11);
	}

	private XRRCrtcInfo() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long timestamp,
		int x,
		int y,
		int width,
		int height,
		long mode,
		int rotation,
		int noutput,
		long outputs,
		int rotations,
		int npossible,
		long possible
	) {
		ByteBuffer xrrcrtcinfo = malloc();

		timestampSet(xrrcrtcinfo, timestamp);
		xSet(xrrcrtcinfo, x);
		ySet(xrrcrtcinfo, y);
		widthSet(xrrcrtcinfo, width);
		heightSet(xrrcrtcinfo, height);
		modeSet(xrrcrtcinfo, mode);
		rotationSet(xrrcrtcinfo, rotation);
		noutputSet(xrrcrtcinfo, noutput);
		outputsSet(xrrcrtcinfo, outputs);
		rotationsSet(xrrcrtcinfo, rotations);
		npossibleSet(xrrcrtcinfo, npossible);
		possibleSet(xrrcrtcinfo, possible);

		return xrrcrtcinfo;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long timestamp,
		int x,
		int y,
		int width,
		int height,
		long mode,
		int rotation,
		int noutput,
		ByteBuffer outputs,
		int rotations,
		int npossible,
		ByteBuffer possible
	) {
		ByteBuffer xrrcrtcinfo = malloc();

		timestampSet(xrrcrtcinfo, timestamp);
		xSet(xrrcrtcinfo, x);
		ySet(xrrcrtcinfo, y);
		widthSet(xrrcrtcinfo, width);
		heightSet(xrrcrtcinfo, height);
		modeSet(xrrcrtcinfo, mode);
		rotationSet(xrrcrtcinfo, rotation);
		noutputSet(xrrcrtcinfo, noutput);
		outputsSet(xrrcrtcinfo, outputs);
		rotationsSet(xrrcrtcinfo, rotations);
		npossibleSet(xrrcrtcinfo, npossible);
		possibleSet(xrrcrtcinfo, possible);

		return xrrcrtcinfo;
	}

	public static void timestampSet(ByteBuffer xrrcrtcinfo, long timestamp) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + TIMESTAMP, timestamp); }
	public static void xSet(ByteBuffer xrrcrtcinfo, int x) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + X, x); }
	public static void ySet(ByteBuffer xrrcrtcinfo, int y) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + Y, y); }
	public static void widthSet(ByteBuffer xrrcrtcinfo, int width) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + WIDTH, width); }
	public static void heightSet(ByteBuffer xrrcrtcinfo, int height) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + HEIGHT, height); }
	public static void modeSet(ByteBuffer xrrcrtcinfo, long mode) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + MODE, mode); }
	public static void rotationSet(ByteBuffer xrrcrtcinfo, int rotation) { xrrcrtcinfo.putShort(xrrcrtcinfo.position() + ROTATION, (short)rotation); }
	public static void noutputSet(ByteBuffer xrrcrtcinfo, int noutput) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + NOUTPUT, noutput); }
	public static void outputsSet(ByteBuffer xrrcrtcinfo, long outputs) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + OUTPUTS, outputs); }
	public static void outputsSet(ByteBuffer xrrcrtcinfo, ByteBuffer outputs) { outputsSet(xrrcrtcinfo, memAddress(outputs)); }
	public static void rotationsSet(ByteBuffer xrrcrtcinfo, int rotations) { xrrcrtcinfo.putShort(xrrcrtcinfo.position() + ROTATIONS, (short)rotations); }
	public static void npossibleSet(ByteBuffer xrrcrtcinfo, int npossible) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + NPOSSIBLE, npossible); }
	public static void possibleSet(ByteBuffer xrrcrtcinfo, long possible) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + POSSIBLE, possible); }
	public static void possibleSet(ByteBuffer xrrcrtcinfo, ByteBuffer possible) { possibleSet(xrrcrtcinfo, memAddress(possible)); }

	public static long timestampGet(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + TIMESTAMP); }
	public static int xGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + X); }
	public static int yGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + Y); }
	public static int widthGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + WIDTH); }
	public static int heightGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + HEIGHT); }
	public static long modeGet(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + MODE); }
	public static int rotationGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getShort(xrrcrtcinfo.position() + ROTATION); }
	public static int noutputGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + NOUTPUT); }
	public static long outputsGet(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + OUTPUTS); }
	public static ByteBuffer outputsGet(ByteBuffer xrrcrtcinfo, int size) { long address = outputsGet(xrrcrtcinfo); return address == 0 ? null : memByteBuffer(address, size); }
	public static int rotationsGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getShort(xrrcrtcinfo.position() + ROTATIONS); }
	public static int npossibleGet(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + NPOSSIBLE); }
	public static long possibleGet(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + POSSIBLE); }
	public static ByteBuffer possibleGet(ByteBuffer xrrcrtcinfo, int size) { long address = possibleGet(xrrcrtcinfo); return address == 0 ? null : memByteBuffer(address, size); }

}