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

/** Information used by the visual utility routines to find desired visual type from the many visuals a display may support. */
public final class XVisualInfo implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		VISUAL,
		VISUALID,
		SCREEN,
		DEPTH,
		CLAZZ,
		RED_MASK,
		GREEN_MASK,
		BLUE_MASK,
		COLORMAP_SIZE,
		BITS_PER_RGB;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(10);

		SIZEOF = offsets(memAddress(offsets));

		VISUAL = offsets.get(0);
		VISUALID = offsets.get(1);
		SCREEN = offsets.get(2);
		DEPTH = offsets.get(3);
		CLAZZ = offsets.get(4);
		RED_MASK = offsets.get(5);
		GREEN_MASK = offsets.get(6);
		BLUE_MASK = offsets.get(7);
		COLORMAP_SIZE = offsets.get(8);
		BITS_PER_RGB = offsets.get(9);
	}

	private final ByteBuffer struct;

	public XVisualInfo() {
		this(malloc());
	}

	public XVisualInfo(ByteBuffer struct) {
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

	public void setVisual(long visual) { visual(struct, visual); }
	public void setVisual(ByteBuffer visual) { visual(struct, visual); }
	public void setVisualid(long visualid) { visualid(struct, visualid); }
	public void setScreen(int screen) { screen(struct, screen); }
	public void setDepth(int depth) { depth(struct, depth); }
	public void setClazz(int clazz) { clazz(struct, clazz); }
	public void setRedMask(long red_mask) { red_mask(struct, red_mask); }
	public void setGreenMask(long green_mask) { green_mask(struct, green_mask); }
	public void setBlueMask(long blue_mask) { blue_mask(struct, blue_mask); }
	public void setColormapSize(int colormap_size) { colormap_size(struct, colormap_size); }
	public void setBitsPerRgb(int bits_per_rgb) { bits_per_rgb(struct, bits_per_rgb); }

	public long getVisual() { return visual(struct); }
	public ByteBuffer getVisualBuffer() { return visualBuffer(struct); }
	public long getVisualid() { return visualid(struct); }
	public int getScreen() { return screen(struct); }
	public int getDepth() { return depth(struct); }
	public int getClazz() { return clazz(struct); }
	public long getRedMask() { return red_mask(struct); }
	public long getGreenMask() { return green_mask(struct); }
	public long getBlueMask() { return blue_mask(struct); }
	public int getColormapSize() { return colormap_size(struct); }
	public int getBitsPerRgb() { return bits_per_rgb(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer visual,
		long visualid,
		int screen,
		int depth,
		int clazz,
		long red_mask,
		long green_mask,
		long blue_mask,
		int colormap_size,
		int bits_per_rgb
	) {
		ByteBuffer xvisualinfo = malloc();

		visual(xvisualinfo, visual);
		visualid(xvisualinfo, visualid);
		screen(xvisualinfo, screen);
		depth(xvisualinfo, depth);
		clazz(xvisualinfo, clazz);
		red_mask(xvisualinfo, red_mask);
		green_mask(xvisualinfo, green_mask);
		blue_mask(xvisualinfo, blue_mask);
		colormap_size(xvisualinfo, colormap_size);
		bits_per_rgb(xvisualinfo, bits_per_rgb);

		return xvisualinfo;
	}

	public static void visual(ByteBuffer xvisualinfo, long visual) { PointerBuffer.put(xvisualinfo, xvisualinfo.position() + VISUAL, visual); }
	public static void visual(ByteBuffer xvisualinfo, ByteBuffer visual) { visual(xvisualinfo, memAddressSafe(visual)); }
	public static void visualid(ByteBuffer xvisualinfo, long visualid) { PointerBuffer.put(xvisualinfo, xvisualinfo.position() + VISUALID, visualid); }
	public static void screen(ByteBuffer xvisualinfo, int screen) { xvisualinfo.putInt(xvisualinfo.position() + SCREEN, screen); }
	public static void depth(ByteBuffer xvisualinfo, int depth) { xvisualinfo.putInt(xvisualinfo.position() + DEPTH, depth); }
	public static void clazz(ByteBuffer xvisualinfo, int clazz) { xvisualinfo.putInt(xvisualinfo.position() + CLAZZ, clazz); }
	public static void red_mask(ByteBuffer xvisualinfo, long red_mask) { PointerBuffer.put(xvisualinfo, xvisualinfo.position() + RED_MASK, red_mask); }
	public static void green_mask(ByteBuffer xvisualinfo, long green_mask) { PointerBuffer.put(xvisualinfo, xvisualinfo.position() + GREEN_MASK, green_mask); }
	public static void blue_mask(ByteBuffer xvisualinfo, long blue_mask) { PointerBuffer.put(xvisualinfo, xvisualinfo.position() + BLUE_MASK, blue_mask); }
	public static void colormap_size(ByteBuffer xvisualinfo, int colormap_size) { xvisualinfo.putInt(xvisualinfo.position() + COLORMAP_SIZE, colormap_size); }
	public static void bits_per_rgb(ByteBuffer xvisualinfo, int bits_per_rgb) { xvisualinfo.putInt(xvisualinfo.position() + BITS_PER_RGB, bits_per_rgb); }

	public static long visual(ByteBuffer xvisualinfo) { return PointerBuffer.get(xvisualinfo, xvisualinfo.position() + VISUAL); }
	public static ByteBuffer visualBuffer(ByteBuffer xvisualinfo) { return memByteBuffer(visual(xvisualinfo), Visual.SIZEOF); }
	public static long visualid(ByteBuffer xvisualinfo) { return PointerBuffer.get(xvisualinfo, xvisualinfo.position() + VISUALID); }
	public static int screen(ByteBuffer xvisualinfo) { return xvisualinfo.getInt(xvisualinfo.position() + SCREEN); }
	public static int depth(ByteBuffer xvisualinfo) { return xvisualinfo.getInt(xvisualinfo.position() + DEPTH); }
	public static int clazz(ByteBuffer xvisualinfo) { return xvisualinfo.getInt(xvisualinfo.position() + CLAZZ); }
	public static long red_mask(ByteBuffer xvisualinfo) { return PointerBuffer.get(xvisualinfo, xvisualinfo.position() + RED_MASK); }
	public static long green_mask(ByteBuffer xvisualinfo) { return PointerBuffer.get(xvisualinfo, xvisualinfo.position() + GREEN_MASK); }
	public static long blue_mask(ByteBuffer xvisualinfo) { return PointerBuffer.get(xvisualinfo, xvisualinfo.position() + BLUE_MASK); }
	public static int colormap_size(ByteBuffer xvisualinfo) { return xvisualinfo.getInt(xvisualinfo.position() + COLORMAP_SIZE); }
	public static int bits_per_rgb(ByteBuffer xvisualinfo) { return xvisualinfo.getInt(xvisualinfo.position() + BITS_PER_RGB); }

}