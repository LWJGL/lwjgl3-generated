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

		timestamp(xrrcrtcinfo, timestamp);
		x(xrrcrtcinfo, x);
		y(xrrcrtcinfo, y);
		width(xrrcrtcinfo, width);
		height(xrrcrtcinfo, height);
		mode(xrrcrtcinfo, mode);
		rotation(xrrcrtcinfo, rotation);
		noutput(xrrcrtcinfo, noutput);
		outputs(xrrcrtcinfo, outputs);
		rotations(xrrcrtcinfo, rotations);
		npossible(xrrcrtcinfo, npossible);
		possible(xrrcrtcinfo, possible);

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

		timestamp(xrrcrtcinfo, timestamp);
		x(xrrcrtcinfo, x);
		y(xrrcrtcinfo, y);
		width(xrrcrtcinfo, width);
		height(xrrcrtcinfo, height);
		mode(xrrcrtcinfo, mode);
		rotation(xrrcrtcinfo, rotation);
		noutput(xrrcrtcinfo, noutput);
		outputs(xrrcrtcinfo, outputs);
		rotations(xrrcrtcinfo, rotations);
		npossible(xrrcrtcinfo, npossible);
		possible(xrrcrtcinfo, possible);

		return xrrcrtcinfo;
	}

	public static void timestamp(ByteBuffer xrrcrtcinfo, long timestamp) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + TIMESTAMP, timestamp); }
	public static void x(ByteBuffer xrrcrtcinfo, int x) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + X, x); }
	public static void y(ByteBuffer xrrcrtcinfo, int y) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + Y, y); }
	public static void width(ByteBuffer xrrcrtcinfo, int width) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + WIDTH, width); }
	public static void height(ByteBuffer xrrcrtcinfo, int height) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + HEIGHT, height); }
	public static void mode(ByteBuffer xrrcrtcinfo, long mode) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + MODE, mode); }
	public static void rotation(ByteBuffer xrrcrtcinfo, int rotation) { xrrcrtcinfo.putShort(xrrcrtcinfo.position() + ROTATION, (short)rotation); }
	public static void noutput(ByteBuffer xrrcrtcinfo, int noutput) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + NOUTPUT, noutput); }
	public static void outputs(ByteBuffer xrrcrtcinfo, long outputs) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + OUTPUTS, outputs); }
	public static void outputs(ByteBuffer xrrcrtcinfo, ByteBuffer outputs) { outputs(xrrcrtcinfo, memAddress(outputs)); }
	public static void rotations(ByteBuffer xrrcrtcinfo, int rotations) { xrrcrtcinfo.putShort(xrrcrtcinfo.position() + ROTATIONS, (short)rotations); }
	public static void npossible(ByteBuffer xrrcrtcinfo, int npossible) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + NPOSSIBLE, npossible); }
	public static void possible(ByteBuffer xrrcrtcinfo, long possible) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + POSSIBLE, possible); }
	public static void possible(ByteBuffer xrrcrtcinfo, ByteBuffer possible) { possible(xrrcrtcinfo, memAddress(possible)); }

	public static long timestamp(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + TIMESTAMP); }
	public static int x(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + X); }
	public static int y(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + Y); }
	public static int width(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + WIDTH); }
	public static int height(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + HEIGHT); }
	public static long mode(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + MODE); }
	public static int rotation(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getShort(xrrcrtcinfo.position() + ROTATION) & 0xFFFF; }
	public static int noutput(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + NOUTPUT); }
	public static long outputs(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + OUTPUTS); }
	public static ByteBuffer outputs(ByteBuffer xrrcrtcinfo, int size) { long address = outputs(xrrcrtcinfo); return address == NULL ? null : memByteBuffer(address, size); }
	public static int rotations(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getShort(xrrcrtcinfo.position() + ROTATIONS) & 0xFFFF; }
	public static int npossible(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + NPOSSIBLE); }
	public static long possible(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + POSSIBLE); }
	public static ByteBuffer possible(ByteBuffer xrrcrtcinfo, int size) { long address = possible(xrrcrtcinfo); return address == NULL ? null : memByteBuffer(address, size); }

}