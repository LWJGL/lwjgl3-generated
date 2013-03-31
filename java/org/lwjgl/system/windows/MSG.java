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
		POINT,
			POINT_X,
			POINT_Y;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		WINDOW = offsets.get(0);
		MESSAGE = offsets.get(1);
		WPARAM = offsets.get(2);
		LPARAM = offsets.get(3);
		TIME = offsets.get(4);
		POINT = offsets.get(5);
			POINT_X = POINT + org.lwjgl.system.windows.POINT.X;
			POINT_Y = POINT + org.lwjgl.system.windows.POINT.Y;
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
		int point_x,
		int point_y
	) {
		ByteBuffer struct = malloc();

		windowSet(struct, window);
		messageSet(struct, message);
		wParamSet(struct, wParam);
		lParamSet(struct, lParam);
		timeSet(struct, time);
		pointXSet(struct, point_x);
		pointYSet(struct, point_y);

		return struct;
	}

	public static void windowSet(ByteBuffer struct, long window) { PointerBuffer.put(struct, struct.position() + WINDOW, window); }
	public static void messageSet(ByteBuffer struct, int message) { struct.putInt(struct.position() + MESSAGE, message); }
	public static void wParamSet(ByteBuffer struct, long wParam) { PointerBuffer.put(struct, struct.position() + WPARAM, wParam); }
	public static void lParamSet(ByteBuffer struct, long lParam) { PointerBuffer.put(struct, struct.position() + LPARAM, lParam); }
	public static void timeSet(ByteBuffer struct, int time) { struct.putInt(struct.position() + TIME, time); }
	public static void pointXSet(ByteBuffer struct, int x) { struct.putInt(struct.position() + POINT_X, x); }
	public static void pointYSet(ByteBuffer struct, int y) { struct.putInt(struct.position() + POINT_Y, y); }

	public static long windowGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + WINDOW); }
	public static int messageGet(ByteBuffer struct) { return struct.getInt(struct.position() + MESSAGE); }
	public static long wParamGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + WPARAM); }
	public static long lParamGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + LPARAM); }
	public static int timeGet(ByteBuffer struct) { return struct.getInt(struct.position() + TIME); }
	public static int pointXGet(ByteBuffer struct) { return struct.getInt(struct.position() + POINT_X); }
	public static int pointYGet(ByteBuffer struct) { return struct.getInt(struct.position() + POINT_Y); }

}