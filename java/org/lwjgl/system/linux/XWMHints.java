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

/** Used by {@link Xlib#XSetWMHints}. */
public final class XWMHints implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		INPUT,
		INITIAL_STATE,
		ICON_PIXMAP,
		ICON_WINDOW,
		ICON_X,
		ICON_Y,
		ICON_MASK,
		WINDOW_GROUP;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(9);

		SIZEOF = offsets(memAddress(offsets));

		FLAGS = offsets.get(0);
		INPUT = offsets.get(1);
		INITIAL_STATE = offsets.get(2);
		ICON_PIXMAP = offsets.get(3);
		ICON_WINDOW = offsets.get(4);
		ICON_X = offsets.get(5);
		ICON_Y = offsets.get(6);
		ICON_MASK = offsets.get(7);
		WINDOW_GROUP = offsets.get(8);
	}

	private final ByteBuffer struct;

	public XWMHints() {
		this(malloc());
	}

	public XWMHints(ByteBuffer struct) {
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
	public void setInput(int input) { input(struct, input); }
	public void setInitialState(int initial_state) { initial_state(struct, initial_state); }
	public void setIconPixmap(long icon_pixmap) { icon_pixmap(struct, icon_pixmap); }
	public void setIconWindow(long icon_window) { icon_window(struct, icon_window); }
	public void setIconX(int icon_x) { icon_x(struct, icon_x); }
	public void setIconY(int icon_y) { icon_y(struct, icon_y); }
	public void setIconMask(long icon_mask) { icon_mask(struct, icon_mask); }
	public void setWindowGroup(long window_group) { window_group(struct, window_group); }

	public long getFlags() { return flags(struct); }
	public int getInput() { return input(struct); }
	public int getInitialState() { return initial_state(struct); }
	public long getIconPixmap() { return icon_pixmap(struct); }
	public long getIconWindow() { return icon_window(struct); }
	public int getIconX() { return icon_x(struct); }
	public int getIconY() { return icon_y(struct); }
	public long getIconMask() { return icon_mask(struct); }
	public long getWindowGroup() { return window_group(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long flags,
		int input,
		int initial_state,
		long icon_pixmap,
		long icon_window,
		int icon_x,
		int icon_y,
		long icon_mask,
		long window_group
	) {
		ByteBuffer xwmhints = malloc();

		flags(xwmhints, flags);
		input(xwmhints, input);
		initial_state(xwmhints, initial_state);
		icon_pixmap(xwmhints, icon_pixmap);
		icon_window(xwmhints, icon_window);
		icon_x(xwmhints, icon_x);
		icon_y(xwmhints, icon_y);
		icon_mask(xwmhints, icon_mask);
		window_group(xwmhints, window_group);

		return xwmhints;
	}

	public static void flags(ByteBuffer xwmhints, long flags) { PointerBuffer.put(xwmhints, xwmhints.position() + FLAGS, flags); }
	public static void input(ByteBuffer xwmhints, int input) { xwmhints.putInt(xwmhints.position() + INPUT, input); }
	public static void initial_state(ByteBuffer xwmhints, int initial_state) { xwmhints.putInt(xwmhints.position() + INITIAL_STATE, initial_state); }
	public static void icon_pixmap(ByteBuffer xwmhints, long icon_pixmap) { PointerBuffer.put(xwmhints, xwmhints.position() + ICON_PIXMAP, icon_pixmap); }
	public static void icon_window(ByteBuffer xwmhints, long icon_window) { PointerBuffer.put(xwmhints, xwmhints.position() + ICON_WINDOW, icon_window); }
	public static void icon_x(ByteBuffer xwmhints, int icon_x) { xwmhints.putInt(xwmhints.position() + ICON_X, icon_x); }
	public static void icon_y(ByteBuffer xwmhints, int icon_y) { xwmhints.putInt(xwmhints.position() + ICON_Y, icon_y); }
	public static void icon_mask(ByteBuffer xwmhints, long icon_mask) { PointerBuffer.put(xwmhints, xwmhints.position() + ICON_MASK, icon_mask); }
	public static void window_group(ByteBuffer xwmhints, long window_group) { PointerBuffer.put(xwmhints, xwmhints.position() + WINDOW_GROUP, window_group); }

	public static long flags(ByteBuffer xwmhints) { return PointerBuffer.get(xwmhints, xwmhints.position() + FLAGS); }
	public static int input(ByteBuffer xwmhints) { return xwmhints.getInt(xwmhints.position() + INPUT); }
	public static int initial_state(ByteBuffer xwmhints) { return xwmhints.getInt(xwmhints.position() + INITIAL_STATE); }
	public static long icon_pixmap(ByteBuffer xwmhints) { return PointerBuffer.get(xwmhints, xwmhints.position() + ICON_PIXMAP); }
	public static long icon_window(ByteBuffer xwmhints) { return PointerBuffer.get(xwmhints, xwmhints.position() + ICON_WINDOW); }
	public static int icon_x(ByteBuffer xwmhints) { return xwmhints.getInt(xwmhints.position() + ICON_X); }
	public static int icon_y(ByteBuffer xwmhints) { return xwmhints.getInt(xwmhints.position() + ICON_Y); }
	public static long icon_mask(ByteBuffer xwmhints) { return PointerBuffer.get(xwmhints, xwmhints.position() + ICON_MASK); }
	public static long window_group(ByteBuffer xwmhints) { return PointerBuffer.get(xwmhints, xwmhints.position() + WINDOW_GROUP); }

}