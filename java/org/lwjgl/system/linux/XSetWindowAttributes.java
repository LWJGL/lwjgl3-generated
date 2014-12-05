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
public final class XSetWindowAttributes implements Pointer {

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

	private final ByteBuffer struct;

	public XSetWindowAttributes() {
		this(malloc());
	}

	public XSetWindowAttributes(ByteBuffer struct) {
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

	public void setBackgroundPixmap(long background_pixmap) { background_pixmap(struct, background_pixmap); }
	public void setBackgroundPixel(long background_pixel) { background_pixel(struct, background_pixel); }
	public void setBorderPixmap(long border_pixmap) { border_pixmap(struct, border_pixmap); }
	public void setBorderPixel(long border_pixel) { border_pixel(struct, border_pixel); }
	public void setBitGravity(int bit_gravity) { bit_gravity(struct, bit_gravity); }
	public void setWinGravity(int win_gravity) { win_gravity(struct, win_gravity); }
	public void setBackingStore(int backing_store) { backing_store(struct, backing_store); }
	public void setBackingPlanes(long backing_planes) { backing_planes(struct, backing_planes); }
	public void setBackingPixel(long backing_pixel) { backing_pixel(struct, backing_pixel); }
	public void setSaveUnder(int save_under) { save_under(struct, save_under); }
	public void setEventMask(long event_mask) { event_mask(struct, event_mask); }
	public void setDoNotPropagateMask(long do_not_propagate_mask) { do_not_propagate_mask(struct, do_not_propagate_mask); }
	public void setOverrideRedirect(int override_redirect) { override_redirect(struct, override_redirect); }
	public void setColormap(long colormap) { colormap(struct, colormap); }
	public void setCursor(long cursor) { cursor(struct, cursor); }

	public long getBackgroundPixmap() { return background_pixmap(struct); }
	public long getBackgroundPixel() { return background_pixel(struct); }
	public long getBorderPixmap() { return border_pixmap(struct); }
	public long getBorderPixel() { return border_pixel(struct); }
	public int getBitGravity() { return bit_gravity(struct); }
	public int getWinGravity() { return win_gravity(struct); }
	public int getBackingStore() { return backing_store(struct); }
	public long getBackingPlanes() { return backing_planes(struct); }
	public long getBackingPixel() { return backing_pixel(struct); }
	public int getSaveUnder() { return save_under(struct); }
	public long getEventMask() { return event_mask(struct); }
	public long getDoNotPropagateMask() { return do_not_propagate_mask(struct); }
	public int getOverrideRedirect() { return override_redirect(struct); }
	public long getColormap() { return colormap(struct); }
	public long getCursor() { return cursor(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		background_pixmap(xsetwindowattributes, background_pixmap);
		background_pixel(xsetwindowattributes, background_pixel);
		border_pixmap(xsetwindowattributes, border_pixmap);
		border_pixel(xsetwindowattributes, border_pixel);
		bit_gravity(xsetwindowattributes, bit_gravity);
		win_gravity(xsetwindowattributes, win_gravity);
		backing_store(xsetwindowattributes, backing_store);
		backing_planes(xsetwindowattributes, backing_planes);
		backing_pixel(xsetwindowattributes, backing_pixel);
		save_under(xsetwindowattributes, save_under);
		event_mask(xsetwindowattributes, event_mask);
		do_not_propagate_mask(xsetwindowattributes, do_not_propagate_mask);
		override_redirect(xsetwindowattributes, override_redirect);
		colormap(xsetwindowattributes, colormap);
		cursor(xsetwindowattributes, cursor);

		return xsetwindowattributes;
	}

	public static void background_pixmap(ByteBuffer xsetwindowattributes, long background_pixmap) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXMAP, background_pixmap); }
	public static void background_pixel(ByteBuffer xsetwindowattributes, long background_pixel) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXEL, background_pixel); }
	public static void border_pixmap(ByteBuffer xsetwindowattributes, long border_pixmap) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXMAP, border_pixmap); }
	public static void border_pixel(ByteBuffer xsetwindowattributes, long border_pixel) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXEL, border_pixel); }
	public static void bit_gravity(ByteBuffer xsetwindowattributes, int bit_gravity) { xsetwindowattributes.putInt(xsetwindowattributes.position() + BIT_GRAVITY, bit_gravity); }
	public static void win_gravity(ByteBuffer xsetwindowattributes, int win_gravity) { xsetwindowattributes.putInt(xsetwindowattributes.position() + WIN_GRAVITY, win_gravity); }
	public static void backing_store(ByteBuffer xsetwindowattributes, int backing_store) { xsetwindowattributes.putInt(xsetwindowattributes.position() + BACKING_STORE, backing_store); }
	public static void backing_planes(ByteBuffer xsetwindowattributes, long backing_planes) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PLANES, backing_planes); }
	public static void backing_pixel(ByteBuffer xsetwindowattributes, long backing_pixel) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PIXEL, backing_pixel); }
	public static void save_under(ByteBuffer xsetwindowattributes, int save_under) { xsetwindowattributes.putInt(xsetwindowattributes.position() + SAVE_UNDER, save_under); }
	public static void event_mask(ByteBuffer xsetwindowattributes, long event_mask) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + EVENT_MASK, event_mask); }
	public static void do_not_propagate_mask(ByteBuffer xsetwindowattributes, long do_not_propagate_mask) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + DO_NOT_PROPAGATE_MASK, do_not_propagate_mask); }
	public static void override_redirect(ByteBuffer xsetwindowattributes, int override_redirect) { xsetwindowattributes.putInt(xsetwindowattributes.position() + OVERRIDE_REDIRECT, override_redirect); }
	public static void colormap(ByteBuffer xsetwindowattributes, long colormap) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + COLORMAP, colormap); }
	public static void cursor(ByteBuffer xsetwindowattributes, long cursor) { PointerBuffer.put(xsetwindowattributes, xsetwindowattributes.position() + CURSOR, cursor); }

	public static long background_pixmap(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXMAP); }
	public static long background_pixel(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKGROUND_PIXEL); }
	public static long border_pixmap(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXMAP); }
	public static long border_pixel(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BORDER_PIXEL); }
	public static int bit_gravity(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + BIT_GRAVITY); }
	public static int win_gravity(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + WIN_GRAVITY); }
	public static int backing_store(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + BACKING_STORE); }
	public static long backing_planes(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PLANES); }
	public static long backing_pixel(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + BACKING_PIXEL); }
	public static int save_under(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + SAVE_UNDER); }
	public static long event_mask(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + EVENT_MASK); }
	public static long do_not_propagate_mask(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + DO_NOT_PROPAGATE_MASK); }
	public static int override_redirect(ByteBuffer xsetwindowattributes) { return xsetwindowattributes.getInt(xsetwindowattributes.position() + OVERRIDE_REDIRECT); }
	public static long colormap(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + COLORMAP); }
	public static long cursor(ByteBuffer xsetwindowattributes) { return PointerBuffer.get(xsetwindowattributes, xsetwindowattributes.position() + CURSOR); }

}