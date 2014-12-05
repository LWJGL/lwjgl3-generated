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

/** Used by {@link Xlib#XSetSizeHints}. */
public final class XSizeHints implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		X,
		Y,
		WIDTH,
		HEIGHT,
		MIN_WIDTH,
		MIN_HEIGHT,
		MAX_WIDTH,
		MAX_HEIGHT,
		WIDTH_INC,
		HEIGHT_INC,
		MIN_ASPECT,
			MIN_ASPECT_X,
			MIN_ASPECT_Y,
		MAX_ASPECT,
			MAX_ASPECT_X,
			MAX_ASPECT_Y,
		BASE_WIDTH,
		BASE_HEIGHT,
		WIN_GRAVITY;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(20);

		SIZEOF = offsets(memAddress(offsets));

		FLAGS = offsets.get(0);
		X = offsets.get(1);
		Y = offsets.get(2);
		WIDTH = offsets.get(3);
		HEIGHT = offsets.get(4);
		MIN_WIDTH = offsets.get(5);
		MIN_HEIGHT = offsets.get(6);
		MAX_WIDTH = offsets.get(7);
		MAX_HEIGHT = offsets.get(8);
		WIDTH_INC = offsets.get(9);
		HEIGHT_INC = offsets.get(10);
		MIN_ASPECT = offsets.get(11);
			MIN_ASPECT_X = offsets.get(12);
			MIN_ASPECT_Y = offsets.get(13);
		MAX_ASPECT = offsets.get(14);
			MAX_ASPECT_X = offsets.get(15);
			MAX_ASPECT_Y = offsets.get(16);
		BASE_WIDTH = offsets.get(17);
		BASE_HEIGHT = offsets.get(18);
		WIN_GRAVITY = offsets.get(19);
	}

	private final ByteBuffer struct;

	public XSizeHints() {
		this(malloc());
	}

	public XSizeHints(ByteBuffer struct) {
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

	public void setFlags(long flags) { flags(struct, flags); }
	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setWidth(int width) { width(struct, width); }
	public void setHeight(int height) { height(struct, height); }
	public void setMinWidth(int min_width) { min_width(struct, min_width); }
	public void setMinHeight(int min_height) { min_height(struct, min_height); }
	public void setMaxWidth(int max_width) { max_width(struct, max_width); }
	public void setMaxHeight(int max_height) { max_height(struct, max_height); }
	public void setWidthInc(int width_inc) { width_inc(struct, width_inc); }
	public void setHeightInc(int height_inc) { height_inc(struct, height_inc); }
	public void setMinAspectX(int x) { min_aspectX(struct, x); }
	public void setMinAspectY(int y) { min_aspectY(struct, y); }
	public void setMaxAspectX(int x) { max_aspectX(struct, x); }
	public void setMaxAspectY(int y) { max_aspectY(struct, y); }
	public void setBaseWidth(int base_width) { base_width(struct, base_width); }
	public void setBaseHeight(int base_height) { base_height(struct, base_height); }
	public void setWinGravity(int win_gravity) { win_gravity(struct, win_gravity); }

	public long getFlags() { return flags(struct); }
	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getWidth() { return width(struct); }
	public int getHeight() { return height(struct); }
	public int getMinWidth() { return min_width(struct); }
	public int getMinHeight() { return min_height(struct); }
	public int getMaxWidth() { return max_width(struct); }
	public int getMaxHeight() { return max_height(struct); }
	public int getWidthInc() { return width_inc(struct); }
	public int getHeightInc() { return height_inc(struct); }
	public int getMinAspectX() { return min_aspectX(struct); }
	public int getMinAspectY() { return min_aspectY(struct); }
	public int getMaxAspectX() { return max_aspectX(struct); }
	public int getMaxAspectY() { return max_aspectY(struct); }
	public int getBaseWidth() { return base_width(struct); }
	public int getBaseHeight() { return base_height(struct); }
	public int getWinGravity() { return win_gravity(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long flags,
		int x,
		int y,
		int width,
		int height,
		int min_width,
		int min_height,
		int max_width,
		int max_height,
		int width_inc,
		int height_inc,
		int min_aspect_x,
		int min_aspect_y,
		int max_aspect_x,
		int max_aspect_y,
		int base_width,
		int base_height,
		int win_gravity
	) {
		ByteBuffer xsizehints = malloc();

		flags(xsizehints, flags);
		x(xsizehints, x);
		y(xsizehints, y);
		width(xsizehints, width);
		height(xsizehints, height);
		min_width(xsizehints, min_width);
		min_height(xsizehints, min_height);
		max_width(xsizehints, max_width);
		max_height(xsizehints, max_height);
		width_inc(xsizehints, width_inc);
		height_inc(xsizehints, height_inc);
		min_aspectX(xsizehints, min_aspect_x);
		min_aspectY(xsizehints, min_aspect_y);
		max_aspectX(xsizehints, max_aspect_x);
		max_aspectY(xsizehints, max_aspect_y);
		base_width(xsizehints, base_width);
		base_height(xsizehints, base_height);
		win_gravity(xsizehints, win_gravity);

		return xsizehints;
	}

	public static void flags(ByteBuffer xsizehints, long flags) { PointerBuffer.put(xsizehints, xsizehints.position() + FLAGS, flags); }
	public static void x(ByteBuffer xsizehints, int x) { xsizehints.putInt(xsizehints.position() + X, x); }
	public static void y(ByteBuffer xsizehints, int y) { xsizehints.putInt(xsizehints.position() + Y, y); }
	public static void width(ByteBuffer xsizehints, int width) { xsizehints.putInt(xsizehints.position() + WIDTH, width); }
	public static void height(ByteBuffer xsizehints, int height) { xsizehints.putInt(xsizehints.position() + HEIGHT, height); }
	public static void min_width(ByteBuffer xsizehints, int min_width) { xsizehints.putInt(xsizehints.position() + MIN_WIDTH, min_width); }
	public static void min_height(ByteBuffer xsizehints, int min_height) { xsizehints.putInt(xsizehints.position() + MIN_HEIGHT, min_height); }
	public static void max_width(ByteBuffer xsizehints, int max_width) { xsizehints.putInt(xsizehints.position() + MAX_WIDTH, max_width); }
	public static void max_height(ByteBuffer xsizehints, int max_height) { xsizehints.putInt(xsizehints.position() + MAX_HEIGHT, max_height); }
	public static void width_inc(ByteBuffer xsizehints, int width_inc) { xsizehints.putInt(xsizehints.position() + WIDTH_INC, width_inc); }
	public static void height_inc(ByteBuffer xsizehints, int height_inc) { xsizehints.putInt(xsizehints.position() + HEIGHT_INC, height_inc); }
	public static void min_aspectX(ByteBuffer xsizehints, int x) { xsizehints.putInt(xsizehints.position() + MIN_ASPECT_X, x); }
	public static void min_aspectY(ByteBuffer xsizehints, int y) { xsizehints.putInt(xsizehints.position() + MIN_ASPECT_Y, y); }
	public static void max_aspectX(ByteBuffer xsizehints, int x) { xsizehints.putInt(xsizehints.position() + MAX_ASPECT_X, x); }
	public static void max_aspectY(ByteBuffer xsizehints, int y) { xsizehints.putInt(xsizehints.position() + MAX_ASPECT_Y, y); }
	public static void base_width(ByteBuffer xsizehints, int base_width) { xsizehints.putInt(xsizehints.position() + BASE_WIDTH, base_width); }
	public static void base_height(ByteBuffer xsizehints, int base_height) { xsizehints.putInt(xsizehints.position() + BASE_HEIGHT, base_height); }
	public static void win_gravity(ByteBuffer xsizehints, int win_gravity) { xsizehints.putInt(xsizehints.position() + WIN_GRAVITY, win_gravity); }

	public static long flags(ByteBuffer xsizehints) { return PointerBuffer.get(xsizehints, xsizehints.position() + FLAGS); }
	public static int x(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + X); }
	public static int y(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + Y); }
	public static int width(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + WIDTH); }
	public static int height(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + HEIGHT); }
	public static int min_width(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MIN_WIDTH); }
	public static int min_height(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MIN_HEIGHT); }
	public static int max_width(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MAX_WIDTH); }
	public static int max_height(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MAX_HEIGHT); }
	public static int width_inc(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + WIDTH_INC); }
	public static int height_inc(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + HEIGHT_INC); }
	public static int min_aspectX(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MIN_ASPECT_X); }
	public static int min_aspectY(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MIN_ASPECT_Y); }
	public static int max_aspectX(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MAX_ASPECT_X); }
	public static int max_aspectY(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + MAX_ASPECT_Y); }
	public static int base_width(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + BASE_WIDTH); }
	public static int base_height(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + BASE_HEIGHT); }
	public static int win_gravity(ByteBuffer xsizehints) { return xsizehints.getInt(xsizehints.position() + WIN_GRAVITY); }

}