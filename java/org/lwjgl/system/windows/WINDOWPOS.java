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

public final class WINDOWPOS implements Pointer {

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

	private final ByteBuffer struct;

	public WINDOWPOS() {
		this(malloc());
	}

	public WINDOWPOS(ByteBuffer struct) {
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

	public void setHwnd(long hwnd) { hwnd(struct, hwnd); }
	public void setHwndInsertAfter(long hwndInsertAfter) { hwndInsertAfter(struct, hwndInsertAfter); }
	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setCx(int cx) { cx(struct, cx); }
	public void setCy(int cy) { cy(struct, cy); }
	public void setFlags(int flags) { flags(struct, flags); }

	public long getHwnd() { return hwnd(struct); }
	public long getHwndInsertAfter() { return hwndInsertAfter(struct); }
	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getCx() { return cx(struct); }
	public int getCy() { return cy(struct); }
	public int getFlags() { return flags(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		hwnd(windowpos, hwnd);
		hwndInsertAfter(windowpos, hwndInsertAfter);
		x(windowpos, x);
		y(windowpos, y);
		cx(windowpos, cx);
		cy(windowpos, cy);
		flags(windowpos, flags);

		return windowpos;
	}

	public static void hwnd(ByteBuffer windowpos, long hwnd) { PointerBuffer.put(windowpos, windowpos.position() + HWND, hwnd); }
	public static void hwndInsertAfter(ByteBuffer windowpos, long hwndInsertAfter) { PointerBuffer.put(windowpos, windowpos.position() + HWNDINSERTAFTER, hwndInsertAfter); }
	public static void x(ByteBuffer windowpos, int x) { windowpos.putInt(windowpos.position() + X, x); }
	public static void y(ByteBuffer windowpos, int y) { windowpos.putInt(windowpos.position() + Y, y); }
	public static void cx(ByteBuffer windowpos, int cx) { windowpos.putInt(windowpos.position() + CX, cx); }
	public static void cy(ByteBuffer windowpos, int cy) { windowpos.putInt(windowpos.position() + CY, cy); }
	public static void flags(ByteBuffer windowpos, int flags) { windowpos.putInt(windowpos.position() + FLAGS, flags); }

	public static long hwnd(ByteBuffer windowpos) { return PointerBuffer.get(windowpos, windowpos.position() + HWND); }
	public static long hwndInsertAfter(ByteBuffer windowpos) { return PointerBuffer.get(windowpos, windowpos.position() + HWNDINSERTAFTER); }
	public static int x(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + X); }
	public static int y(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + Y); }
	public static int cx(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + CX); }
	public static int cy(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + CY); }
	public static int flags(ByteBuffer windowpos) { return windowpos.getInt(windowpos.position() + FLAGS); }

}