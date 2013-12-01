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

/**
 * Used by the {@link WinUser#TrackMouseEvent} function to track when the mouse pointer leaves a window or hovers over a window for a specified amount
 * of time.
 */
public final class TRACKMOUSEEVENT {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		FLAGS,
		HWNDTRACK,
		HOVERTIME;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		FLAGS = offsets.get(1);
		HWNDTRACK = offsets.get(2);
		HOVERTIME = offsets.get(3);
	}

	private TRACKMOUSEEVENT() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int size,
		int flags,
		long hwndTrack,
		int hoverTime
	) {
		ByteBuffer trackmouseevent = malloc();

		size(trackmouseevent, size);
		flags(trackmouseevent, flags);
		hwndTrack(trackmouseevent, hwndTrack);
		hoverTime(trackmouseevent, hoverTime);

		return trackmouseevent;
	}

	public static void size(ByteBuffer trackmouseevent, int size) { trackmouseevent.putInt(trackmouseevent.position() + SIZE, size); }
	public static void flags(ByteBuffer trackmouseevent, int flags) { trackmouseevent.putInt(trackmouseevent.position() + FLAGS, flags); }
	public static void hwndTrack(ByteBuffer trackmouseevent, long hwndTrack) { PointerBuffer.put(trackmouseevent, trackmouseevent.position() + HWNDTRACK, hwndTrack); }
	public static void hoverTime(ByteBuffer trackmouseevent, int hoverTime) { trackmouseevent.putInt(trackmouseevent.position() + HOVERTIME, hoverTime); }

	public static int size(ByteBuffer trackmouseevent) { return trackmouseevent.getInt(trackmouseevent.position() + SIZE); }
	public static int flags(ByteBuffer trackmouseevent) { return trackmouseevent.getInt(trackmouseevent.position() + FLAGS); }
	public static long hwndTrack(ByteBuffer trackmouseevent) { return PointerBuffer.get(trackmouseevent, trackmouseevent.position() + HWNDTRACK); }
	public static int hoverTime(ByteBuffer trackmouseevent) { return trackmouseevent.getInt(trackmouseevent.position() + HOVERTIME); }

}