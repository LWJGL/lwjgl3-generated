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

/** Xrandr CrtcGamma struct. */
public final class XRRCrtcGamma implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		RED,
		GREEN,
		BLUE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		RED = offsets.get(1);
		GREEN = offsets.get(2);
		BLUE = offsets.get(3);
	}

	private final ByteBuffer struct;

	public XRRCrtcGamma() {
		this(malloc());
	}

	public XRRCrtcGamma(ByteBuffer struct) {
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

	public void setSize(int size) { size(struct, size); }
	public void setRed(long red) { red(struct, red); }
	public void setRed(ByteBuffer red) { red(struct, red); }
	public void setGreen(long green) { green(struct, green); }
	public void setGreen(ByteBuffer green) { green(struct, green); }
	public void setBlue(long blue) { blue(struct, blue); }
	public void setBlue(ByteBuffer blue) { blue(struct, blue); }

	public int getSize() { return size(struct); }
	public long getRed() { return red(struct); }
	public ByteBuffer getRed(int byteLen) { return red(struct, byteLen); }
	public long getGreen() { return green(struct); }
	public ByteBuffer getGreen(int byteLen) { return green(struct, byteLen); }
	public long getBlue() { return blue(struct); }
	public ByteBuffer getBlue(int byteLen) { return blue(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int size,
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue
	) {
		ByteBuffer xrrcrtcgamma = malloc();

		size(xrrcrtcgamma, size);
		red(xrrcrtcgamma, red);
		green(xrrcrtcgamma, green);
		blue(xrrcrtcgamma, blue);

		return xrrcrtcgamma;
	}

	public static void size(ByteBuffer xrrcrtcgamma, int size) { xrrcrtcgamma.putInt(xrrcrtcgamma.position() + SIZE, size); }
	public static void red(ByteBuffer xrrcrtcgamma, long red) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + RED, red); }
	public static void red(ByteBuffer xrrcrtcgamma, ByteBuffer red) { red(xrrcrtcgamma, memAddressSafe(red)); }
	public static void green(ByteBuffer xrrcrtcgamma, long green) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + GREEN, green); }
	public static void green(ByteBuffer xrrcrtcgamma, ByteBuffer green) { green(xrrcrtcgamma, memAddressSafe(green)); }
	public static void blue(ByteBuffer xrrcrtcgamma, long blue) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + BLUE, blue); }
	public static void blue(ByteBuffer xrrcrtcgamma, ByteBuffer blue) { blue(xrrcrtcgamma, memAddressSafe(blue)); }

	public static int size(ByteBuffer xrrcrtcgamma) { return xrrcrtcgamma.getInt(xrrcrtcgamma.position() + SIZE); }
	public static long red(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + RED); }
	public static ByteBuffer red(ByteBuffer xrrcrtcgamma, int byteLen) { return memByteBuffer(red(xrrcrtcgamma), byteLen); }
	public static long green(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + GREEN); }
	public static ByteBuffer green(ByteBuffer xrrcrtcgamma, int byteLen) { return memByteBuffer(green(xrrcrtcgamma), byteLen); }
	public static long blue(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + BLUE); }
	public static ByteBuffer blue(ByteBuffer xrrcrtcgamma, int byteLen) { return memByteBuffer(blue(xrrcrtcgamma), byteLen); }

}