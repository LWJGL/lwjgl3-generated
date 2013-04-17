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

/** Contains message information from a thread's message queue. */
public final class MSG {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		WINDOW,
		MESSAGE,
		WPARAM,
		LPARAM,
		TIME,
		POINT;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		WINDOW = offsets.get(0);
		MESSAGE = offsets.get(1);
		WPARAM = offsets.get(2);
		LPARAM = offsets.get(3);
		TIME = offsets.get(4);
		POINT = offsets.get(5);
	}

	private MSG() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long window,
		int message,
		long wParam,
		long lParam,
		int time,
		long point
	) {
		ByteBuffer msg = malloc();

		windowSet(msg, window);
		messageSet(msg, message);
		wParamSet(msg, wParam);
		lParamSet(msg, lParam);
		timeSet(msg, time);
		pointSet(msg, point);

		return msg;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long window,
		int message,
		long wParam,
		long lParam,
		int time,
		ByteBuffer point
	) {
		ByteBuffer msg = malloc();

		windowSet(msg, window);
		messageSet(msg, message);
		wParamSet(msg, wParam);
		lParamSet(msg, lParam);
		timeSet(msg, time);
		pointSet(msg, point);

		return msg;
	}

	public static void windowSet(ByteBuffer msg, long window) { PointerBuffer.put(msg, msg.position() + WINDOW, window); }
	public static void messageSet(ByteBuffer msg, int message) { msg.putInt(msg.position() + MESSAGE, message); }
	public static void wParamSet(ByteBuffer msg, long wParam) { PointerBuffer.put(msg, msg.position() + WPARAM, wParam); }
	public static void lParamSet(ByteBuffer msg, long lParam) { PointerBuffer.put(msg, msg.position() + LPARAM, lParam); }
	public static void timeSet(ByteBuffer msg, int time) { msg.putInt(msg.position() + TIME, time); }
	public static void pointSet(ByteBuffer msg, long point) { if ( point != NULL ) memCopy(point, memAddress(msg) + POINT, org.lwjgl.system.windows.POINT.SIZEOF); }
	public static void pointSet(ByteBuffer msg, ByteBuffer point) { pointSet(msg, memAddressSafe(point)); }
	public static void pointXSet(ByteBuffer msg, int x) { msg.putInt(msg.position() + POINT + org.lwjgl.system.windows.POINT.X, x); }
	public static void pointYSet(ByteBuffer msg, int y) { msg.putInt(msg.position() + POINT + org.lwjgl.system.windows.POINT.Y, y); }

	public static long windowGet(ByteBuffer msg) { return PointerBuffer.get(msg, msg.position() + WINDOW); }
	public static int messageGet(ByteBuffer msg) { return msg.getInt(msg.position() + MESSAGE); }
	public static long wParamGet(ByteBuffer msg) { return PointerBuffer.get(msg, msg.position() + WPARAM); }
	public static long lParamGet(ByteBuffer msg) { return PointerBuffer.get(msg, msg.position() + LPARAM); }
	public static int timeGet(ByteBuffer msg) { return msg.getInt(msg.position() + TIME); }
	public static void pointGet(ByteBuffer msg, long point) { memCopy(memAddress(msg) + POINT, point, org.lwjgl.system.windows.POINT.SIZEOF); }
	public static void pointGet(ByteBuffer msg, ByteBuffer point) { checkBuffer(point, org.lwjgl.system.windows.POINT.SIZEOF); pointGet(msg, memAddress(point)); }
	public static int pointXGet(ByteBuffer msg) { return msg.getInt(msg.position() + POINT + org.lwjgl.system.windows.POINT.X); }
	public static int pointYGet(ByteBuffer msg) { return msg.getInt(msg.position() + POINT + org.lwjgl.system.windows.POINT.Y); }

}