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
public final class XColor implements Pointer {

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

	private final ByteBuffer struct;

	public XColor() {
		this(malloc());
	}

	public XColor(ByteBuffer struct) {
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

	public void setPixel(long pixel) { pixel(struct, pixel); }
	public void setRed(int red) { red(struct, red); }
	public void setGreen(int green) { green(struct, green); }
	public void setBlue(int blue) { blue(struct, blue); }
	public void setFlags(int flags) { flags(struct, flags); }
	public void setPad(int pad) { pad(struct, pad); }

	public long getPixel() { return pixel(struct); }
	public int getRed() { return red(struct); }
	public int getGreen() { return green(struct); }
	public int getBlue() { return blue(struct); }
	public int getFlags() { return flags(struct); }
	public int getPad() { return pad(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long pixel,
		int red,
		int green,
		int blue,
		int flags,
		int pad
	) {
		ByteBuffer xcolor = malloc();

		pixel(xcolor, pixel);
		red(xcolor, red);
		green(xcolor, green);
		blue(xcolor, blue);
		flags(xcolor, flags);
		pad(xcolor, pad);

		return xcolor;
	}

	public static void pixel(ByteBuffer xcolor, long pixel) { PointerBuffer.put(xcolor, xcolor.position() + PIXEL, pixel); }
	public static void red(ByteBuffer xcolor, int red) { xcolor.putShort(xcolor.position() + RED, (short)red); }
	public static void green(ByteBuffer xcolor, int green) { xcolor.putShort(xcolor.position() + GREEN, (short)green); }
	public static void blue(ByteBuffer xcolor, int blue) { xcolor.putShort(xcolor.position() + BLUE, (short)blue); }
	public static void flags(ByteBuffer xcolor, int flags) { xcolor.put(xcolor.position() + FLAGS, (byte)flags); }
	public static void pad(ByteBuffer xcolor, int pad) { xcolor.put(xcolor.position() + PAD, (byte)pad); }

	public static long pixel(ByteBuffer xcolor) { return PointerBuffer.get(xcolor, xcolor.position() + PIXEL); }
	public static int red(ByteBuffer xcolor) { return xcolor.getShort(xcolor.position() + RED) & 0xFFFF; }
	public static int green(ByteBuffer xcolor) { return xcolor.getShort(xcolor.position() + GREEN) & 0xFFFF; }
	public static int blue(ByteBuffer xcolor) { return xcolor.getShort(xcolor.position() + BLUE) & 0xFFFF; }
	public static int flags(ByteBuffer xcolor) { return xcolor.get(xcolor.position() + FLAGS); }
	public static int pad(ByteBuffer xcolor) { return xcolor.get(xcolor.position() + PAD); }

}