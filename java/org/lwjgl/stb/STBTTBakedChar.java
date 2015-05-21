/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Baked character data, returned by {@link STBTruetype#stbtt_BakeFontBitmap}. */
public final class STBTTBakedChar implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		X1,
		Y1,
		XOFF,
		YOFF,
		XADVANCE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(7);

		SIZEOF = offsets(memAddress(offsets));

		X0 = offsets.get(0);
		Y0 = offsets.get(1);
		X1 = offsets.get(2);
		Y1 = offsets.get(3);
		XOFF = offsets.get(4);
		YOFF = offsets.get(5);
		XADVANCE = offsets.get(6);
	}

	private final ByteBuffer struct;

	public STBTTBakedChar() {
		this(malloc());
	}

	public STBTTBakedChar(ByteBuffer struct) {
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

	public void setX0(int x0) { x0(struct, x0); }
	public void setY0(int y0) { y0(struct, y0); }
	public void setX1(int x1) { x1(struct, x1); }
	public void setY1(int y1) { y1(struct, y1); }
	public void setXoff(float xoff) { xoff(struct, xoff); }
	public void setYoff(float yoff) { yoff(struct, yoff); }
	public void setXadvance(float xadvance) { xadvance(struct, xadvance); }

	public int getX0() { return x0(struct); }
	public int getY0() { return y0(struct); }
	public int getX1() { return x1(struct); }
	public int getY1() { return y1(struct); }
	public float getXoff() { return xoff(struct); }
	public float getYoff() { return yoff(struct); }
	public float getXadvance() { return xadvance(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int x0,
		int y0,
		int x1,
		int y1,
		float xoff,
		float yoff,
		float xadvance
	) {
		ByteBuffer stbtt_bakedchar = malloc();

		x0(stbtt_bakedchar, x0);
		y0(stbtt_bakedchar, y0);
		x1(stbtt_bakedchar, x1);
		y1(stbtt_bakedchar, y1);
		xoff(stbtt_bakedchar, xoff);
		yoff(stbtt_bakedchar, yoff);
		xadvance(stbtt_bakedchar, xadvance);

		return stbtt_bakedchar;
	}

	public static void x0(ByteBuffer stbtt_bakedchar, int x0) { stbtt_bakedchar.putShort(stbtt_bakedchar.position() + X0, (short)x0); }
	public static void y0(ByteBuffer stbtt_bakedchar, int y0) { stbtt_bakedchar.putShort(stbtt_bakedchar.position() + Y0, (short)y0); }
	public static void x1(ByteBuffer stbtt_bakedchar, int x1) { stbtt_bakedchar.putShort(stbtt_bakedchar.position() + X1, (short)x1); }
	public static void y1(ByteBuffer stbtt_bakedchar, int y1) { stbtt_bakedchar.putShort(stbtt_bakedchar.position() + Y1, (short)y1); }
	public static void xoff(ByteBuffer stbtt_bakedchar, float xoff) { stbtt_bakedchar.putFloat(stbtt_bakedchar.position() + XOFF, xoff); }
	public static void yoff(ByteBuffer stbtt_bakedchar, float yoff) { stbtt_bakedchar.putFloat(stbtt_bakedchar.position() + YOFF, yoff); }
	public static void xadvance(ByteBuffer stbtt_bakedchar, float xadvance) { stbtt_bakedchar.putFloat(stbtt_bakedchar.position() + XADVANCE, xadvance); }

	public static int x0(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getShort(stbtt_bakedchar.position() + X0) & 0xFFFF; }
	public static int y0(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getShort(stbtt_bakedchar.position() + Y0) & 0xFFFF; }
	public static int x1(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getShort(stbtt_bakedchar.position() + X1) & 0xFFFF; }
	public static int y1(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getShort(stbtt_bakedchar.position() + Y1) & 0xFFFF; }
	public static float xoff(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getFloat(stbtt_bakedchar.position() + XOFF); }
	public static float yoff(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getFloat(stbtt_bakedchar.position() + YOFF); }
	public static float xadvance(ByteBuffer stbtt_bakedchar) { return stbtt_bakedchar.getFloat(stbtt_bakedchar.position() + XADVANCE); }

}