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

/** Data structure used by color operations. */
public final class XColor {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		PIXEL,
		RED,
		GREEN,
		BLUE,
		FLAGS,
		PAD;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		PIXEL = offsets.get(0);
		RED = offsets.get(1);
		GREEN = offsets.get(2);
		BLUE = offsets.get(3);
		FLAGS = offsets.get(4);
		PAD = offsets.get(5);
	}

	private XColor() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long pixel,
		int red,
		int green,
		int blue,
		int flags,
		int pad
	) {
		ByteBuffer xcolor = malloc();

		pixelSet(xcolor, pixel);
		redSet(xcolor, red);
		greenSet(xcolor, green);
		blueSet(xcolor, blue);
		flagsSet(xcolor, flags);
		padSet(xcolor, pad);

		return xcolor;
	}

	public static void pixelSet(ByteBuffer xcolor, long pixel) { PointerBuffer.put(xcolor, xcolor.position() + PIXEL, pixel); }
	public static void redSet(ByteBuffer xcolor, int red) { xcolor.putShort(xcolor.position() + RED, (short)red); }
	public static void greenSet(ByteBuffer xcolor, int green) { xcolor.putShort(xcolor.position() + GREEN, (short)green); }
	public static void blueSet(ByteBuffer xcolor, int blue) { xcolor.putShort(xcolor.position() + BLUE, (short)blue); }
	public static void flagsSet(ByteBuffer xcolor, int flags) { xcolor.put(xcolor.position() + FLAGS, (byte)flags); }
	public static void padSet(ByteBuffer xcolor, int pad) { xcolor.put(xcolor.position() + PAD, (byte)pad); }

	public static long pixelGet(ByteBuffer xcolor) { return PointerBuffer.get(xcolor, xcolor.position() + PIXEL); }
	public static int redGet(ByteBuffer xcolor) { return xcolor.getShort(xcolor.position() + RED); }
	public static int greenGet(ByteBuffer xcolor) { return xcolor.getShort(xcolor.position() + GREEN); }
	public static int blueGet(ByteBuffer xcolor) { return xcolor.getShort(xcolor.position() + BLUE); }
	public static int flagsGet(ByteBuffer xcolor) { return xcolor.get(xcolor.position() + FLAGS); }
	public static int padGet(ByteBuffer xcolor) { return xcolor.get(xcolor.position() + PAD); }

}