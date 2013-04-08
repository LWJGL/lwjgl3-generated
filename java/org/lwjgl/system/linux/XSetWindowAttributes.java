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

/** Data structure for setting window attributes. */
public final class XSetWindowAttributes {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		BACKGROUND_PIXMAP,
		BACKGROUND_PIXEL,
		BORDER_PIXMAP,
		BORDER_PIXEL,
		BIT_GRAVITY,
		WIN_GRAVITY,
		BACKING_STORE,
		BACKING_PLANES,
		BACKING_PIXEL,
		SAVE_UNDER,
		EVENT_MASK,
		DO_NOT_PROPAGATE_MASK,
		OVERRIDE_REDIRECT,
		COLORMAP,
		CURSOR;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(15);

		SIZEOF = offsets(memAddress(offsets));

		BACKGROUND_PIXMAP = offsets.get(0);
		BACKGROUND_PIXEL = offsets.get(1);
		BORDER_PIXMAP = offsets.get(2);
		BORDER_PIXEL = offsets.get(3);
		BIT_GRAVITY = offsets.get(4);
		WIN_GRAVITY = offsets.get(5);
		BACKING_STORE = offsets.get(6);
		BACKING_PLANES = offsets.get(7);
		BACKING_PIXEL = offsets.get(8);
		SAVE_UNDER = offsets.get(9);
		EVENT_MASK = offsets.get(10);
		DO_NOT_PROPAGATE_MASK = offsets.get(11);
		OVERRIDE_REDIRECT = offsets.get(12);
		COLORMAP = offsets.get(13);
		CURSOR = offsets.get(14);
	}

	private XSetWindowAttributes() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long background_pixmap,
		long background_pixel,
		long border_pixmap,
		long border_pixel,
		int bit_gravity,
		int win_gravity,
		int backing_store,
		long backing_planes,
		long backing_pixel,
		int save_under,
		long event_mask,
		long do_not_propagate_mask,
		int override_redirect,
		long colormap,
		long cursor
	) {
		ByteBuffer xsetwindowattributes = malloc();

		background_pixmapSet(xsetwindowattributes, background_pixmap);
		background_pixelSet(xsetwindowattributes, background_pixel);
		border_pixmapSet(xsetwindowattributes, border_pixmap);
		border_pixelSet(xsetwindowattributes, border_pixel);
		bit_gravitySet(xsetwindowattributes, bit_gravity);
		win_gravitySet(xsetwindowattributes, win_gravity);
		backing_storeSet(xsetwindowattributes, backing_store);
		backing_planesSet(xsetwindowattributes, backing_planes);
		backing_pixelSet(xsetwindowattributes, backing_pixel);
		save_underSet(xsetwindowattributes, save_under);
		event_maskSet(xsetwindowattributes, event_mask);
		do_not_propagate_maskSet(xsetwindowattributes, do_not_propagate_mask);
		override_redirectSet(xsetwindowattributes, override_redirect);
		colormapSet(xsetwindowattributes, colormap);
		cursorSet(xsetwindowattributes, cursor);

		return xsetwindowattributes;
	}

	public static void background_pixmapSet(ByteBuffer xsetwindowattributes, long background_pixmap) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXMAP, background_pixmap); }
	public static void background_pixelSet(ByteBuffer xsetwindowattributes, long background_pixel) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXEL, background_pixel); }
	public static void border_pixmapSet(ByteBuffer xsetwindowattributes, long border_pixmap) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXMAP, border_pixmap); }
	public static void border_pixelSet(ByteBuffer xsetwindowattributes, long border_pixel) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXEL, border_pixel); }
	public static void bit_gravitySet(ByteBuffer xsetwindowattributes, int bit_gravity) { xsetwindowattributes.putInt(xsetwindowattributes.position() + BIT_GRAVITY, bit_gravity); }
	public static void win_gravitySet(ByteBuffer xsetwindowattributes, int win_gravity) { xsetwindowattributes.putInt(xsetwindowattributes.position() + WIN_GRAVITY, win_gravity); }
	public static void backing_storeSet(ByteBuffer xsetwindowattributes, int backing_store) { xsetwindowattributes.putInt(xsetwindowattributes.position() + BACKING_STORE, backing_store); }
	public static void backing_planesSet(ByteBuffer xsetwindowattributes, long backing_planes) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PLANES, backing_planes); }
	public static void backing_pixelSet(ByteBuffer xsetwindowattributes, long backing_pixel) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PIXEL, backing_pixel); }
	public static void save_underSet(ByteBuffer xsetwindowattributes, int save_under) { xsetwindowattributes.putInt(xsetwindowattributes.position() + SAVE_UNDER, save_under); }
	public static void event_maskSet(ByteBuffer xsetwindowattributes, long event_mask) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + EVENT_MASK, event_mask); }
	public static void do_not_propagate_maskSet(ByteBuffer xsetwindowattributes, long do_not_propagate_mask) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + DO_NOT_PROPAGATE_MASK, do_not_propagate_mask); }
	public static void override_redirectSet(ByteBuffer xsetwindowattributes, int override_redirect) { xsetwindowattributes.putInt(xsetwindowattributes.position() + OVERRIDE_REDIRECT, override_redirect); }
	public static void colormapSet(ByteBuffer xsetwindowattributes, long colormap) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + COLORMAP, colormap); }
	public static void cursorSet(ByteBuffer xsetwindowattributes, long cursor) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + CURSOR, cursor); }

	public static long background_pixmapGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXMAP); }
	public static long background_pixelGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXEL); }
	public static long border_pixmapGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXMAP); }
	public static long border_pixelGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXEL); }
	public static int bit_gravityGet(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + BIT_GRAVITY); }
	public static int win_gravityGet(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + WIN_GRAVITY); }
	public static int backing_storeGet(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + BACKING_STORE); }
	public static long backing_planesGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PLANES); }
	public static long backing_pixelGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PIXEL); }
	public static int save_underGet(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + SAVE_UNDER); }
	public static long event_maskGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + EVENT_MASK); }
	public static long do_not_propagate_maskGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + DO_NOT_PROPAGATE_MASK); }
	public static int override_redirectGet(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + OVERRIDE_REDIRECT); }
	public static long colormapGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + COLORMAP); }
	public static long cursorGet(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + CURSOR); }

}