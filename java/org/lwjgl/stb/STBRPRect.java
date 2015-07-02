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

/** A packed rectangle. */
public final class STBRPRect implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ID,
		W,
		H,
		X,
		Y,
		WAS_PACKED;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		ID = offsets.get(0);
		W = offsets.get(1);
		H = offsets.get(2);
		X = offsets.get(3);
		Y = offsets.get(4);
		WAS_PACKED = offsets.get(5);
	}

	private final ByteBuffer struct;

	public STBRPRect() {
		this(malloc());
	}

	public STBRPRect(ByteBuffer struct) {
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

	public void setId(int id) { id(struct, id); }
	public void setW(int w) { w(struct, w); }
	public void setH(int h) { h(struct, h); }
	public void setX(int x) { x(struct, x); }
	public void setY(int y) { y(struct, y); }
	public void setWasPacked(int was_packed) { was_packed(struct, was_packed); }

	public int getId() { return id(struct); }
	public int getW() { return w(struct); }
	public int getH() { return h(struct); }
	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getWasPacked() { return was_packed(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int id,
		int w,
		int h,
		int x,
		int y,
		int was_packed
	) {
		ByteBuffer stbrp_rect = malloc();

		id(stbrp_rect, id);
		w(stbrp_rect, w);
		h(stbrp_rect, h);
		x(stbrp_rect, x);
		y(stbrp_rect, y);
		was_packed(stbrp_rect, was_packed);

		return stbrp_rect;
	}

	public static void id(ByteBuffer stbrp_rect, int id) { stbrp_rect.putInt(stbrp_rect.position() + ID, id); }
	public static void w(ByteBuffer stbrp_rect, int w) { stbrp_rect.putShort(stbrp_rect.position() + W, (short)w); }
	public static void h(ByteBuffer stbrp_rect, int h) { stbrp_rect.putShort(stbrp_rect.position() + H, (short)h); }
	public static void x(ByteBuffer stbrp_rect, int x) { stbrp_rect.putShort(stbrp_rect.position() + X, (short)x); }
	public static void y(ByteBuffer stbrp_rect, int y) { stbrp_rect.putShort(stbrp_rect.position() + Y, (short)y); }
	public static void was_packed(ByteBuffer stbrp_rect, int was_packed) { stbrp_rect.putInt(stbrp_rect.position() + WAS_PACKED, was_packed); }

	public static int id(ByteBuffer stbrp_rect) { return stbrp_rect.getInt(stbrp_rect.position() + ID); }
	public static int w(ByteBuffer stbrp_rect) { return stbrp_rect.getShort(stbrp_rect.position() + W) & 0xFFFF; }
	public static int h(ByteBuffer stbrp_rect) { return stbrp_rect.getShort(stbrp_rect.position() + H) & 0xFFFF; }
	public static int x(ByteBuffer stbrp_rect) { return stbrp_rect.getShort(stbrp_rect.position() + X) & 0xFFFF; }
	public static int y(ByteBuffer stbrp_rect) { return stbrp_rect.getShort(stbrp_rect.position() + Y) & 0xFFFF; }
	public static int was_packed(ByteBuffer stbrp_rect) { return stbrp_rect.getInt(stbrp_rect.position() + WAS_PACKED); }

}