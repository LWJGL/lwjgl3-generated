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

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	public static void hwndSet(ByteBuffer struct, long hwnd) { PointerBuffer.put(struct, struct.position() + HWND, hwnd); }
	public static void hwndInsertAfterSet(ByteBuffer struct, long hwndInsertAfter) { PointerBuffer.put(struct, struct.position() + HWNDINSERTAFTER, hwndInsertAfter); }
	public static void xSet(ByteBuffer struct, int x) { struct.putInt(struct.position() + X, x); }
	public static void ySet(ByteBuffer struct, int y) { struct.putInt(struct.position() + Y, y); }
	public static void cxSet(ByteBuffer struct, int cx) { struct.putInt(struct.position() + CX, cx); }
	public static void cySet(ByteBuffer struct, int cy) { struct.putInt(struct.position() + CY, cy); }
	public static void flagsSet(ByteBuffer struct, int flags) { struct.putInt(struct.position() + FLAGS, flags); }

	public static long hwndGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + HWND); }
	public static long hwndInsertAfterGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + HWNDINSERTAFTER); }
	public static int xGet(ByteBuffer struct) { return struct.getInt(struct.position() + X); }
	public static int yGet(ByteBuffer struct) { return struct.getInt(struct.position() + Y); }
	public static int cxGet(ByteBuffer struct) { return struct.getInt(struct.position() + CX); }
	public static int cyGet(ByteBuffer struct) { return struct.getInt(struct.position() + CY); }
	public static int flagsGet(ByteBuffer struct) { return struct.getInt(struct.position() + FLAGS); }

}