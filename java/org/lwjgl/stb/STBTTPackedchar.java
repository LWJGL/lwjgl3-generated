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

/** Packed character data, returned by {@link STBTruetype#stbtt_PackFontRange} */
public final class STBTTPackedchar implements Pointer {

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
		XADVANCE,
		XOFF2,
		YOFF2;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(9);

		SIZEOF = offsets(memAddress(offsets));

		X0 = offsets.get(0);
		Y0 = offsets.get(1);
		X1 = offsets.get(2);
		Y1 = offsets.get(3);
		XOFF = offsets.get(4);
		YOFF = offsets.get(5);
		XADVANCE = offsets.get(6);
		XOFF2 = offsets.get(7);
		YOFF2 = offsets.get(8);
	}

	private final ByteBuffer struct;

	public STBTTPackedchar() {
		this(malloc());
	}

	public STBTTPackedchar(ByteBuffer struct) {
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
	public void setXoff2(float xoff2) { xoff2(struct, xoff2); }
	public void setYoff2(float yoff2) { yoff2(struct, yoff2); }

	public int getX0() { return x0(struct); }
	public int getY0() { return y0(struct); }
	public int getX1() { return x1(struct); }
	public int getY1() { return y1(struct); }
	public float getXoff() { return xoff(struct); }
	public float getYoff() { return yoff(struct); }
	public float getXadvance() { return xadvance(struct); }
	public float getXoff2() { return xoff2(struct); }
	public float getYoff2() { return yoff2(struct); }

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
		float xadvance,
		float xoff2,
		float yoff2
	) {
		ByteBuffer stbtt_packedchar = malloc();

		x0(stbtt_packedchar, x0);
		y0(stbtt_packedchar, y0);
		x1(stbtt_packedchar, x1);
		y1(stbtt_packedchar, y1);
		xoff(stbtt_packedchar, xoff);
		yoff(stbtt_packedchar, yoff);
		xadvance(stbtt_packedchar, xadvance);
		xoff2(stbtt_packedchar, xoff2);
		yoff2(stbtt_packedchar, yoff2);

		return stbtt_packedchar;
	}

	public static void x0(ByteBuffer stbtt_packedchar, int x0) { stbtt_packedchar.putShort(stbtt_packedchar.position() + X0, (short)x0); }
	public static void y0(ByteBuffer stbtt_packedchar, int y0) { stbtt_packedchar.putShort(stbtt_packedchar.position() + Y0, (short)y0); }
	public static void x1(ByteBuffer stbtt_packedchar, int x1) { stbtt_packedchar.putShort(stbtt_packedchar.position() + X1, (short)x1); }
	public static void y1(ByteBuffer stbtt_packedchar, int y1) { stbtt_packedchar.putShort(stbtt_packedchar.position() + Y1, (short)y1); }
	public static void xoff(ByteBuffer stbtt_packedchar, float xoff) { stbtt_packedchar.putFloat(stbtt_packedchar.position() + XOFF, xoff); }
	public static void yoff(ByteBuffer stbtt_packedchar, float yoff) { stbtt_packedchar.putFloat(stbtt_packedchar.position() + YOFF, yoff); }
	public static void xadvance(ByteBuffer stbtt_packedchar, float xadvance) { stbtt_packedchar.putFloat(stbtt_packedchar.position() + XADVANCE, xadvance); }
	public static void xoff2(ByteBuffer stbtt_packedchar, float xoff2) { stbtt_packedchar.putFloat(stbtt_packedchar.position() + XOFF2, xoff2); }
	public static void yoff2(ByteBuffer stbtt_packedchar, float yoff2) { stbtt_packedchar.putFloat(stbtt_packedchar.position() + YOFF2, yoff2); }

	public static int x0(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getShort(stbtt_packedchar.position() + X0) & 0xFFFF; }
	public static int y0(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getShort(stbtt_packedchar.position() + Y0) & 0xFFFF; }
	public static int x1(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getShort(stbtt_packedchar.position() + X1) & 0xFFFF; }
	public static int y1(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getShort(stbtt_packedchar.position() + Y1) & 0xFFFF; }
	public static float xoff(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getFloat(stbtt_packedchar.position() + XOFF); }
	public static float yoff(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getFloat(stbtt_packedchar.position() + YOFF); }
	public static float xadvance(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getFloat(stbtt_packedchar.position() + XADVANCE); }
	public static float xoff2(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getFloat(stbtt_packedchar.position() + XOFF2); }
	public static float yoff2(ByteBuffer stbtt_packedchar) { return stbtt_packedchar.getFloat(stbtt_packedchar.position() + YOFF2); }

}