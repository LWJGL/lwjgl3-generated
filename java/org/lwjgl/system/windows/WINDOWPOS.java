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

public final class WINDOWPOS {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HWND,
		HWNDINSERTAFTER,
		X,
		Y,
		CX,
		CY,
		FLAGS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(7);

		SIZEOF = offsets(memAddress(offsets));

		HWND = offsets.get(0);
		HWNDINSERTAFTER = offsets.get(1);
		X = offsets.get(2);
		Y = offsets.get(3);
		CX = offsets.get(4);
		CY = offsets.get(5);
		FLAGS = offsets.get(6);
	}

	private WINDOWPOS() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long hwnd,
		long hwndInsertAfter,
		int x,
		int y,
		int cx,
		int cy,
		int flags
	) {
		ByteBuffer windowpos = malloc();

		hwndSet(windowpos, hwnd);
		hwndInsertAfterSet(windowpos, hwndInsertAfter);
		xSet(windowpos, x);
		ySet(windowpos, y);
		cxSet(windowpos, cx);
		cySet(windowpos, cy);
		flagsSet(windowpos, flags);

		return windowpos;
	}

	public static void hwndSet(ByteBuffer windowpos, long hwnd) { PointerBuffer.put(windowpos, windowpos.position() + HWND, hwnd); }
	public static void hwndInsertAfterSet(ByteBuffer windowpos, long hwndInsertAfter) { PointerBuffer.put(windowpos, windowpos.position() + HWNDINSERTAFTER, hwndInsertAfter); }
	public static void xSet(ByteBuffer windowpos, int x) { windowpos.putInt(windowpos.position() + X, x); }
	public static void ySet(ByteBuffer windowpos, int y) { windowpos.putInt(windowpos.position() + Y, y); }
	public static void cxSet(ByteBuffer windowpos, int cx) { windowpos.putInt(windowpos.position() + CX, cx); }
	public static void cySet(ByteBuffer windowpos, int cy) { windowpos.putInt(windowpos.position() + CY, cy); }
	public static void flagsSet(ByteBuffer windowpos, int flags) { windowpos.putInt(windowpos.position() + FLAGS, flags); }

	public static long hwndGet(ByteBuffer windowpos) { return PointerBuffer.get(windowpos, windowpos.position() + HWND); }
	public static long hwndInsertAfterGet(ByteBuffer windowpos) { return PointerBuffer.get(windowpos, windowpos.position() + HWNDINSERTAFTER); }
	public static int xGet(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + X); }
	public static int yGet(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + Y); }
	public static int cxGet(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + CX); }
	public static int cyGet(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + CY); }
	public static int flagsGet(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + FLAGS); }

}