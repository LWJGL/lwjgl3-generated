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

/** Quad used for drawing a baked character, returned by {@link STBTruetype#stbtt_GetBakedQuad}. */
public final class STBTTAlignedQuad implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		S0,
		T0,
		X1,
		Y1,
		S1,
		T1;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(8);

		SIZEOF = offsets(memAddress(offsets));

		X0 = offsets.get(0);
		Y0 = offsets.get(1);
		S0 = offsets.get(2);
		T0 = offsets.get(3);
		X1 = offsets.get(4);
		Y1 = offsets.get(5);
		S1 = offsets.get(6);
		T1 = offsets.get(7);
	}

	private final ByteBuffer struct;

	public STBTTAlignedQuad() {
		this(malloc());
	}

	public STBTTAlignedQuad(ByteBuffer struct) {
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

	public void setX0(float x0) { x0(struct, x0); }
	public void setY0(float y0) { y0(struct, y0); }
	public void setS0(float s0) { s0(struct, s0); }
	public void setT0(float t0) { t0(struct, t0); }
	public void setX1(float x1) { x1(struct, x1); }
	public void setY1(float y1) { y1(struct, y1); }
	public void setS1(float s1) { s1(struct, s1); }
	public void setT1(float t1) { t1(struct, t1); }

	public float getX0() { return x0(struct); }
	public float getY0() { return y0(struct); }
	public float getS0() { return s0(struct); }
	public float getT0() { return t0(struct); }
	public float getX1() { return x1(struct); }
	public float getY1() { return y1(struct); }
	public float getS1() { return s1(struct); }
	public float getT1() { return t1(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float x0,
		float y0,
		float s0,
		float t0,
		float x1,
		float y1,
		float s1,
		float t1
	) {
		ByteBuffer stbtt_aligned_quad = malloc();

		x0(stbtt_aligned_quad, x0);
		y0(stbtt_aligned_quad, y0);
		s0(stbtt_aligned_quad, s0);
		t0(stbtt_aligned_quad, t0);
		x1(stbtt_aligned_quad, x1);
		y1(stbtt_aligned_quad, y1);
		s1(stbtt_aligned_quad, s1);
		t1(stbtt_aligned_quad, t1);

		return stbtt_aligned_quad;
	}

	public static void x0(ByteBuffer stbtt_aligned_quad, float x0) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + X0, x0); }
	public static void y0(ByteBuffer stbtt_aligned_quad, float y0) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + Y0, y0); }
	public static void s0(ByteBuffer stbtt_aligned_quad, float s0) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + S0, s0); }
	public static void t0(ByteBuffer stbtt_aligned_quad, float t0) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + T0, t0); }
	public static void x1(ByteBuffer stbtt_aligned_quad, float x1) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + X1, x1); }
	public static void y1(ByteBuffer stbtt_aligned_quad, float y1) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + Y1, y1); }
	public static void s1(ByteBuffer stbtt_aligned_quad, float s1) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + S1, s1); }
	public static void t1(ByteBuffer stbtt_aligned_quad, float t1) { stbtt_aligned_quad.putFloat(stbtt_aligned_quad.position() + T1, t1); }

	public static float x0(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + X0); }
	public static float y0(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + Y0); }
	public static float s0(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + S0); }
	public static float t0(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + T0); }
	public static float x1(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + X1); }
	public static float y1(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + Y1); }
	public static float s1(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + S1); }
	public static float t1(ByteBuffer stbtt_aligned_quad) { return stbtt_aligned_quad.getFloat(stbtt_aligned_quad.position() + T1); }

}