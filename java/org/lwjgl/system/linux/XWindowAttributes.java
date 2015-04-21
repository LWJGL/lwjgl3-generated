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

/** Data structure for window attributes. */
public final class XWindowAttributes implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		WIDTH,
		HEIGHT,
		BORDER_WIDTH,
		DEPTH,
		VISUAL,
		ROOT,
		CLAZZ,
		BIT_GRAVITY,
		WIN_GRAVITY,
		BACKING_STORE,
		BACKING_PLANES,
		BACKING_PIXEL,
		SAVE_UNDER,
		COLORMAP,
		MAP_INSTALLED,
		MAP_STATE,
		ALL_EVENT_MASKS,
		YOUR_EVENT_MASK,
		DO_NOT_PROPAGATE_MASK,
		OVERRIDE_REDIRECT,
		SCREEN;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(23);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		WIDTH = offsets.get(2);
		HEIGHT = offsets.get(3);
		BORDER_WIDTH = offsets.get(4);
		DEPTH = offsets.get(5);
		VISUAL = offsets.get(6);
		ROOT = offsets.get(7);
		CLAZZ = offsets.get(8);
		BIT_GRAVITY = offsets.get(9);
		WIN_GRAVITY = offsets.get(10);
		BACKING_STORE = offsets.get(11);
		BACKING_PLANES = offsets.get(12);
		BACKING_PIXEL = offsets.get(13);
		SAVE_UNDER = offsets.get(14);
		COLORMAP = offsets.get(15);
		MAP_INSTALLED = offsets.get(16);
		MAP_STATE = offsets.get(17);
		ALL_EVENT_MASKS = offsets.get(18);
		YOUR_EVENT_MASK = offsets.get(19);
		DO_NOT_PROPAGATE_MASK = offsets.get(20);
		OVERRIDE_REDIRECT = offsets.get(21);
		SCREEN = offsets.get(22);
	}

	private final ByteBuffer struct;

	public XWindowAttributes() {
		this(malloc());
	}

	public XWindowAttributes(ByteBuffer struct) {
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

	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setWidth(int width) { width(struct, width); }
	public void setHeight(int height) { height(struct, height); }
	public void setBorderWidth(int border_width) { border_width(struct, border_width); }
	public void setDepth(int depth) { depth(struct, depth); }
	public void setVisual(long visual) { visual(struct, visual); }
	public void setVisual(ByteBuffer visual) { visual(struct, visual); }
	public void setRoot(long root) { root(struct, root); }
	public void setClazz(int clazz) { clazz(struct, clazz); }
	public void setBitGravity(int bit_gravity) { bit_gravity(struct, bit_gravity); }
	public void setWinGravity(int win_gravity) { win_gravity(struct, win_gravity); }
	public void setBackingStore(int backing_store) { backing_store(struct, backing_store); }
	public void setBackingPlanes(long backing_planes) { backing_planes(struct, backing_planes); }
	public void setBackingPixel(long backing_pixel) { backing_pixel(struct, backing_pixel); }
	public void setSaveUnder(int save_under) { save_under(struct, save_under); }
	public void setColormap(long colormap) { colormap(struct, colormap); }
	public void setMapInstalled(int map_installed) { map_installed(struct, map_installed); }
	public void setMapState(int map_state) { map_state(struct, map_state); }
	public void setAllEventMasks(long all_event_masks) { all_event_masks(struct, all_event_masks); }
	public void setYourEventMask(long your_event_mask) { your_event_mask(struct, your_event_mask); }
	public void setDoNotPropagateMask(long do_not_propagate_mask) { do_not_propagate_mask(struct, do_not_propagate_mask); }
	public void setOverrideRedirect(int override_redirect) { override_redirect(struct, override_redirect); }
	public void setScreen(long screen) { screen(struct, screen); }

	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getWidth() { return width(struct); }
	public int getHeight() { return height(struct); }
	public int getBorderWidth() { return border_width(struct); }
	public int getDepth() { return depth(struct); }
	public long getVisual() { return visual(struct); }
	public ByteBuffer getVisualBuffer() { return visualBuffer(struct); }
	public long getRoot() { return root(struct); }
	public int getClazz() { return clazz(struct); }
	public int getBitGravity() { return bit_gravity(struct); }
	public int getWinGravity() { return win_gravity(struct); }
	public int getBackingStore() { return backing_store(struct); }
	public long getBackingPlanes() { return backing_planes(struct); }
	public long getBackingPixel() { return backing_pixel(struct); }
	public int getSaveUnder() { return save_under(struct); }
	public long getColormap() { return colormap(struct); }
	public int getMapInstalled() { return map_installed(struct); }
	public int getMapState() { return map_state(struct); }
	public long getAllEventMasks() { return all_event_masks(struct); }
	public long getYourEventMask() { return your_event_mask(struct); }
	public long getDoNotPropagateMask() { return do_not_propagate_mask(struct); }
	public int getOverrideRedirect() { return override_redirect(struct); }
	public long getScreen() { return screen(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int x,
		int y,
		int width,
		int height,
		int border_width,
		int depth,
		ByteBuffer visual,
		long root,
		int clazz,
		int bit_gravity,
		int win_gravity,
		int backing_store,
		long backing_planes,
		long backing_pixel,
		int save_under,
		long colormap,
		int map_installed,
		int map_state,
		long all_event_masks,
		long your_event_mask,
		long do_not_propagate_mask,
		int override_redirect,
		long screen
	) {
		ByteBuffer xwindowattributes = malloc();

		x(xwindowattributes, x);
		y(xwindowattributes, y);
		width(xwindowattributes, width);
		height(xwindowattributes, height);
		border_width(xwindowattributes, border_width);
		depth(xwindowattributes, depth);
		visual(xwindowattributes, visual);
		root(xwindowattributes, root);
		clazz(xwindowattributes, clazz);
		bit_gravity(xwindowattributes, bit_gravity);
		win_gravity(xwindowattributes, win_gravity);
		backing_store(xwindowattributes, backing_store);
		backing_planes(xwindowattributes, backing_planes);
		backing_pixel(xwindowattributes, backing_pixel);
		save_under(xwindowattributes, save_under);
		colormap(xwindowattributes, colormap);
		map_installed(xwindowattributes, map_installed);
		map_state(xwindowattributes, map_state);
		all_event_masks(xwindowattributes, all_event_masks);
		your_event_mask(xwindowattributes, your_event_mask);
		do_not_propagate_mask(xwindowattributes, do_not_propagate_mask);
		override_redirect(xwindowattributes, override_redirect);
		screen(xwindowattributes, screen);

		return xwindowattributes;
	}

	public static void x(ByteBuffer xwindowattributes, int x) { xwindowattributes.putInt(xwindowattributes.position() + X, x); }
	public static void y(ByteBuffer xwindowattributes, int y) { xwindowattributes.putInt(xwindowattributes.position() + Y, y); }
	public static void width(ByteBuffer xwindowattributes, int width) { xwindowattributes.putInt(xwindowattributes.position() + WIDTH, width); }
	public static void height(ByteBuffer xwindowattributes, int height) { xwindowattributes.putInt(xwindowattributes.position() + HEIGHT, height); }
	public static void border_width(ByteBuffer xwindowattributes, int border_width) { xwindowattributes.putInt(xwindowattributes.position() + BORDER_WIDTH, border_width); }
	public static void depth(ByteBuffer xwindowattributes, int depth) { xwindowattributes.putInt(xwindowattributes.position() + DEPTH, depth); }
	public static void visual(ByteBuffer xwindowattributes, long visual) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + VISUAL, visual); }
	public static void visual(ByteBuffer xwindowattributes, ByteBuffer visual) { visual(xwindowattributes, memAddressSafe(visual)); }
	public static void root(ByteBuffer xwindowattributes, long root) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + ROOT, root); }
	public static void clazz(ByteBuffer xwindowattributes, int clazz) { xwindowattributes.putInt(xwindowattributes.position() + CLAZZ, clazz); }
	public static void bit_gravity(ByteBuffer xwindowattributes, int bit_gravity) { xwindowattributes.putInt(xwindowattributes.position() + BIT_GRAVITY, bit_gravity); }
	public static void win_gravity(ByteBuffer xwindowattributes, int win_gravity) { xwindowattributes.putInt(xwindowattributes.position() + WIN_GRAVITY, win_gravity); }
	public static void backing_store(ByteBuffer xwindowattributes, int backing_store) { xwindowattributes.putInt(xwindowattributes.position() + BACKING_STORE, backing_store); }
	public static void backing_planes(ByteBuffer xwindowattributes, long backing_planes) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + BACKING_PLANES, backing_planes); }
	public static void backing_pixel(ByteBuffer xwindowattributes, long backing_pixel) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + BACKING_PIXEL, backing_pixel); }
	public static void save_under(ByteBuffer xwindowattributes, int save_under) { xwindowattributes.putInt(xwindowattributes.position() + SAVE_UNDER, save_under); }
	public static void colormap(ByteBuffer xwindowattributes, long colormap) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + COLORMAP, colormap); }
	public static void map_installed(ByteBuffer xwindowattributes, int map_installed) { xwindowattributes.putInt(xwindowattributes.position() + MAP_INSTALLED, map_installed); }
	public static void map_state(ByteBuffer xwindowattributes, int map_state) { xwindowattributes.putInt(xwindowattributes.position() + MAP_STATE, map_state); }
	public static void all_event_masks(ByteBuffer xwindowattributes, long all_event_masks) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + ALL_EVENT_MASKS, all_event_masks); }
	public static void your_event_mask(ByteBuffer xwindowattributes, long your_event_mask) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + YOUR_EVENT_MASK, your_event_mask); }
	public static void do_not_propagate_mask(ByteBuffer xwindowattributes, long do_not_propagate_mask) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + DO_NOT_PROPAGATE_MASK, do_not_propagate_mask); }
	public static void override_redirect(ByteBuffer xwindowattributes, int override_redirect) { xwindowattributes.putInt(xwindowattributes.position() + OVERRIDE_REDIRECT, override_redirect); }
	public static void screen(ByteBuffer xwindowattributes, long screen) { PointerBuffer.put(xwindowattributes, xwindowattributes.position() + SCREEN, screen); }

	public static int x(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + X); }
	public static int y(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + Y); }
	public static int width(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + WIDTH); }
	public static int height(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + HEIGHT); }
	public static int border_width(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + BORDER_WIDTH); }
	public static int depth(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + DEPTH); }
	public static long visual(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + VISUAL); }
	public static ByteBuffer visualBuffer(ByteBuffer xwindowattributes) { return memByteBuffer(visual(xwindowattributes), Visual.SIZEOF); }
	public static long root(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + ROOT); }
	public static int clazz(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + CLAZZ); }
	public static int bit_gravity(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + BIT_GRAVITY); }
	public static int win_gravity(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + WIN_GRAVITY); }
	public static int backing_store(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + BACKING_STORE); }
	public static long backing_planes(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + BACKING_PLANES); }
	public static long backing_pixel(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + BACKING_PIXEL); }
	public static int save_under(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + SAVE_UNDER); }
	public static long colormap(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + COLORMAP); }
	public static int map_installed(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + MAP_INSTALLED); }
	public static int map_state(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + MAP_STATE); }
	public static long all_event_masks(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + ALL_EVENT_MASKS); }
	public static long your_event_mask(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + YOUR_EVENT_MASK); }
	public static long do_not_propagate_mask(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + DO_NOT_PROPAGATE_MASK); }
	public static int override_redirect(ByteBuffer xwindowattributes) { return xwindowattributes.getInt(xwindowattributes.position() + OVERRIDE_REDIRECT); }
	public static long screen(ByteBuffer xwindowattributes) { return PointerBuffer.get(xwindowattributes, xwindowattributes.position() + SCREEN); }

}