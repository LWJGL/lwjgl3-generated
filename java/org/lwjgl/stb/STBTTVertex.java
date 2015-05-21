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

/** Vertex data. */
public final class STBTTVertex implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		CX,
		CY,
		TYPE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		CX = offsets.get(2);
		CY = offsets.get(3);
		TYPE = offsets.get(4);
	}

	private final ByteBuffer struct;

	public STBTTVertex() {
		this(malloc());
	}

	public STBTTVertex(ByteBuffer struct) {
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
	public void setCx(int cx) { cx(struct, cx); }
	public void setCy(int cy) { cy(struct, cy); }
	public void setType(int type) { type(struct, type); }

	public int getX() { return x(struct); }
	public int getY() { return y(struct); }
	public int getCx() { return cx(struct); }
	public int getCy() { return cy(struct); }
	public int getType() { return type(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int x,
		int y,
		int cx,
		int cy,
		int type
	) {
		ByteBuffer stbtt_vertex = malloc();

		x(stbtt_vertex, x);
		y(stbtt_vertex, y);
		cx(stbtt_vertex, cx);
		cy(stbtt_vertex, cy);
		type(stbtt_vertex, type);

		return stbtt_vertex;
	}

	public static void x(ByteBuffer stbtt_vertex, int x) { stbtt_vertex.putShort(stbtt_vertex.position() + X, (short)x); }
	public static void y(ByteBuffer stbtt_vertex, int y) { stbtt_vertex.putShort(stbtt_vertex.position() + Y, (short)y); }
	public static void cx(ByteBuffer stbtt_vertex, int cx) { stbtt_vertex.putShort(stbtt_vertex.position() + CX, (short)cx); }
	public static void cy(ByteBuffer stbtt_vertex, int cy) { stbtt_vertex.putShort(stbtt_vertex.position() + CY, (short)cy); }
	public static void type(ByteBuffer stbtt_vertex, int type) { stbtt_vertex.put(stbtt_vertex.position() + TYPE, (byte)type); }

	public static int x(ByteBuffer stbtt_vertex) { return stbtt_vertex.getShort(stbtt_vertex.position() + X); }
	public static int y(ByteBuffer stbtt_vertex) { return stbtt_vertex.getShort(stbtt_vertex.position() + Y); }
	public static int cx(ByteBuffer stbtt_vertex) { return stbtt_vertex.getShort(stbtt_vertex.position() + CX); }
	public static int cy(ByteBuffer stbtt_vertex) { return stbtt_vertex.getShort(stbtt_vertex.position() + CY); }
	public static int type(ByteBuffer stbtt_vertex) { return stbtt_vertex.get(stbtt_vertex.position() + TYPE) & 0xFF; }

}