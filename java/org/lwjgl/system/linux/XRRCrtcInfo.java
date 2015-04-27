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
public final class XRRCrtcInfo implements Pointer {

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

	private final ByteBuffer struct;

	public XRRCrtcInfo() {
		this(malloc());
	}

	public XRRCrtcInfo(ByteBuffer struct) {
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

	public void setTimestamp(long timestamp) { timestamp(struct, timestamp); }
	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setWidth(int width) { width(struct, width); }
	public void setHeight(int height) { height(struct, height); }
	public void setMode(long mode) { mode(struct, mode); }
	public void setRotation(int rotation) { rotation(struct, rotation); }
	public void setNoutput(int noutput) { noutput(struct, noutput); }
	public void setOutputs(long outputs) { outputs(struct, outputs); }
	public void setOutputs(ByteBuffer outputs) { outputs(struct, outputs); }
	public void setRotations(int rotations) { rotations(struct, rotations); }
	public void setNpossible(int npossible) { npossible(struct, npossible); }
	public void setPossible(long possible) { possible(struct, possible); }
	public void setPossible(ByteBuffer possible) { possible(struct, possible); }

	public long getTimestamp() { return timestamp(struct); }
	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getWidth() { return width(struct); }
	public int getHeight() { return height(struct); }
	public long getMode() { return mode(struct); }
	public int getRotation() { return rotation(struct); }
	public int getNoutput() { return noutput(struct); }
	public long getOutputs() { return outputs(struct); }
	public ByteBuffer getOutputs(int byteLen) { return outputs(struct, byteLen); }
	public int getRotations() { return rotations(struct); }
	public int getNpossible() { return npossible(struct); }
	public long getPossible() { return possible(struct); }
	public ByteBuffer getPossible(int byteLen) { return possible(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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
	public static void outputs(ByteBuffer xrrcrtcinfo, ByteBuffer outputs) { outputs(xrrcrtcinfo, memAddressSafe(outputs)); }
	public static void rotations(ByteBuffer xrrcrtcinfo, int rotations) { xrrcrtcinfo.putShort(xrrcrtcinfo.position() + ROTATIONS, (short)rotations); }
	public static void npossible(ByteBuffer xrrcrtcinfo, int npossible) { xrrcrtcinfo.putInt(xrrcrtcinfo.position() + NPOSSIBLE, npossible); }
	public static void possible(ByteBuffer xrrcrtcinfo, long possible) { PointerBuffer.put(xrrcrtcinfo, xrrcrtcinfo.position() + POSSIBLE, possible); }
	public static void possible(ByteBuffer xrrcrtcinfo, ByteBuffer possible) { possible(xrrcrtcinfo, memAddressSafe(possible)); }

	public static long timestamp(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + TIMESTAMP); }
	public static int x(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + X); }
	public static int y(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + Y); }
	public static int width(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + WIDTH); }
	public static int height(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + HEIGHT); }
	public static long mode(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + MODE); }
	public static int rotation(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getShort(xrrcrtcinfo.position() + ROTATION) & 0xFFFF; }
	public static int noutput(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + NOUTPUT); }
	public static long outputs(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + OUTPUTS); }
	public static ByteBuffer outputs(ByteBuffer xrrcrtcinfo, int byteLen) { return memByteBuffer(outputs(xrrcrtcinfo), byteLen); }
	public static int rotations(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getShort(xrrcrtcinfo.position() + ROTATIONS) & 0xFFFF; }
	public static int npossible(ByteBuffer xrrcrtcinfo) { return xrrcrtcinfo.getInt(xrrcrtcinfo.position() + NPOSSIBLE); }
	public static long possible(ByteBuffer xrrcrtcinfo) { return PointerBuffer.get(xrrcrtcinfo, xrrcrtcinfo.position() + POSSIBLE); }
	public static ByteBuffer possible(ByteBuffer xrrcrtcinfo, int byteLen) { return memByteBuffer(possible(xrrcrtcinfo), byteLen); }

}