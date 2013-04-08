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
public final class XRRCrtcGamma {

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

	private XRRCrtcGamma() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int size,
		long red,
		long green,
		long blue
	) {
		ByteBuffer xrrcrtcgamma = malloc();

		sizeSet(xrrcrtcgamma, size);
		redSet(xrrcrtcgamma, red);
		greenSet(xrrcrtcgamma, green);
		blueSet(xrrcrtcgamma, blue);

		return xrrcrtcgamma;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int size,
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue
	) {
		ByteBuffer xrrcrtcgamma = malloc();

		sizeSet(xrrcrtcgamma, size);
		redSet(xrrcrtcgamma, red);
		greenSet(xrrcrtcgamma, green);
		blueSet(xrrcrtcgamma, blue);

		return xrrcrtcgamma;
	}

	public static void sizeSet(ByteBuffer xrrcrtcgamma, int size) { xrrcrtcgamma.putInt(xrrcrtcgamma.position() + SIZE, size); }
	public static void redSet(ByteBuffer xrrcrtcgamma, long red) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + RED, red); }
	public static void redSet(ByteBuffer xrrcrtcgamma, ByteBuffer red) { redSet(xrrcrtcgamma, memAddress(red)); }
	public static void greenSet(ByteBuffer xrrcrtcgamma, long green) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + GREEN, green); }
	public static void greenSet(ByteBuffer xrrcrtcgamma, ByteBuffer green) { greenSet(xrrcrtcgamma, memAddress(green)); }
	public static void blueSet(ByteBuffer xrrcrtcgamma, long blue) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + BLUE, blue); }
	public static void blueSet(ByteBuffer xrrcrtcgamma, ByteBuffer blue) { blueSet(xrrcrtcgamma, memAddress(blue)); }

	public static int sizeGet(ByteBuffer xrrcrtcgamma) { return xrrcrtcgamma.getInt(xrrcrtcgamma.position() + SIZE); }
	public static long redGet(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + RED); }
	public static ByteBuffer redGet(ByteBuffer xrrcrtcgamma, int size) { long address = redGet(xrrcrtcgamma); return address == 0 ? null : memByteBuffer(address, size); }
	public static long greenGet(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + GREEN); }
	public static ByteBuffer greenGet(ByteBuffer xrrcrtcgamma, int size) { long address = greenGet(xrrcrtcgamma); return address == 0 ? null : memByteBuffer(address, size); }
	public static long blueGet(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + BLUE); }
	public static ByteBuffer blueGet(ByteBuffer xrrcrtcgamma, int size) { long address = blueGet(xrrcrtcgamma); return address == 0 ? null : memByteBuffer(address, size); }

}