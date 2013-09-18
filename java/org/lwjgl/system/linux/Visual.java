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

/** Visual structure; contains information about colormapping possible. */
public final class Visual {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		VISUALID,
		CLAZZ,
		RED_MASK,
		GREEN_MASK,
		BLUE_MASK,
		BITS_PER_RGB,
		MAP_ENTRIES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(7);

		SIZEOF = offsets(memAddress(offsets));

		VISUALID = offsets.get(0);
		CLAZZ = offsets.get(1);
		RED_MASK = offsets.get(2);
		GREEN_MASK = offsets.get(3);
		BLUE_MASK = offsets.get(4);
		BITS_PER_RGB = offsets.get(5);
		MAP_ENTRIES = offsets.get(6);
	}

	private Visual() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long visualid,
		int clazz,
		long red_mask,
		long green_mask,
		long blue_mask,
		int bits_per_rgb,
		int map_entries
	) {
		ByteBuffer visual = malloc();

		visualid(visual, visualid);
		clazz(visual, clazz);
		red_mask(visual, red_mask);
		green_mask(visual, green_mask);
		blue_mask(visual, blue_mask);
		bits_per_rgb(visual, bits_per_rgb);
		map_entries(visual, map_entries);

		return visual;
	}

	public static void visualid(ByteBuffer visual, long visualid) { PointerBuffer.put(visual, visual.position() + VISUALID, visualid); }
	public static void clazz(ByteBuffer visual, int clazz) { visual.putInt(visual.position() + CLAZZ, clazz); }
	public static void red_mask(ByteBuffer visual, long red_mask) { PointerBuffer.put(visual, visual.position() + RED_MASK, red_mask); }
	public static void green_mask(ByteBuffer visual, long green_mask) { PointerBuffer.put(visual, visual.position() + GREEN_MASK, green_mask); }
	public static void blue_mask(ByteBuffer visual, long blue_mask) { PointerBuffer.put(visual, visual.position() + BLUE_MASK, blue_mask); }
	public static void bits_per_rgb(ByteBuffer visual, int bits_per_rgb) { visual.putInt(visual.position() + BITS_PER_RGB, bits_per_rgb); }
	public static void map_entries(ByteBuffer visual, int map_entries) { visual.putInt(visual.position() + MAP_ENTRIES, map_entries); }

	public static long visualid(ByteBuffer visual) { return PointerBuffer.get(visual, visual.position() + VISUALID); }
	public static int clazz(ByteBuffer visual) { return visual.getInt(visual.position() + CLAZZ); }
	public static long red_mask(ByteBuffer visual) { return PointerBuffer.get(visual, visual.position() + RED_MASK); }
	public static long green_mask(ByteBuffer visual) { return PointerBuffer.get(visual, visual.position() + GREEN_MASK); }
	public static long blue_mask(ByteBuffer visual) { return PointerBuffer.get(visual, visual.position() + BLUE_MASK); }
	public static int bits_per_rgb(ByteBuffer visual) { return visual.getInt(visual.position() + BITS_PER_RGB); }
	public static int map_entries(ByteBuffer visual) { return visual.getInt(visual.position() + MAP_ENTRIES); }

}