/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about the placement and orientation of a glyph in a character cell. */
public final class GLYPHMETRICSFLOAT {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		BLACKBOXX,
		BLOCKBOXY,
		GLYPHORIGIN,
		CELLINCX,
		CELLINCY;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		BLACKBOXX = offsets.get(0);
		BLOCKBOXY = offsets.get(1);
		GLYPHORIGIN = offsets.get(2);
		CELLINCX = offsets.get(3);
		CELLINCY = offsets.get(4);
	}

	private GLYPHMETRICSFLOAT() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		float blackBoxX,
		float blockBoxY,
		long glyphOrigin,
		float cellIncX,
		float cellIncY
	) {
		ByteBuffer glyphmetricsfloat = malloc();

		blackBoxX(glyphmetricsfloat, blackBoxX);
		blockBoxY(glyphmetricsfloat, blockBoxY);
		glyphOriginSet(glyphmetricsfloat, glyphOrigin);
		cellIncX(glyphmetricsfloat, cellIncX);
		cellIncY(glyphmetricsfloat, cellIncY);

		return glyphmetricsfloat;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		float blackBoxX,
		float blockBoxY,
		ByteBuffer glyphOrigin,
		float cellIncX,
		float cellIncY
	) {
		ByteBuffer glyphmetricsfloat = malloc();

		blackBoxX(glyphmetricsfloat, blackBoxX);
		blockBoxY(glyphmetricsfloat, blockBoxY);
		glyphOriginSet(glyphmetricsfloat, glyphOrigin);
		cellIncX(glyphmetricsfloat, cellIncX);
		cellIncY(glyphmetricsfloat, cellIncY);

		return glyphmetricsfloat;
	}

	public static void blackBoxX(ByteBuffer glyphmetricsfloat, float blackBoxX) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + BLACKBOXX, blackBoxX); }
	public static void blockBoxY(ByteBuffer glyphmetricsfloat, float blockBoxY) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + BLOCKBOXY, blockBoxY); }
	public static void glyphOriginSet(ByteBuffer glyphmetricsfloat, long glyphOrigin) { if ( glyphOrigin != NULL ) memCopy(glyphOrigin, memAddress(glyphmetricsfloat) + GLYPHORIGIN, POINTFLOAT.SIZEOF); }
	public static void glyphOriginSet(ByteBuffer glyphmetricsfloat, ByteBuffer glyphOrigin) { glyphOriginSet(glyphmetricsfloat, memAddressSafe(glyphOrigin)); }
	public static void glyphOriginX(ByteBuffer glyphmetricsfloat, float x) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.X, x); }
	public static void glyphOriginY(ByteBuffer glyphmetricsfloat, float y) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.Y, y); }
	public static void cellIncX(ByteBuffer glyphmetricsfloat, float cellIncX) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + CELLINCX, cellIncX); }
	public static void cellIncY(ByteBuffer glyphmetricsfloat, float cellIncY) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + CELLINCY, cellIncY); }

	public static float blackBoxX(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + BLACKBOXX); }
	public static float blockBoxY(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + BLOCKBOXY); }
	public static void glyphOriginGet(ByteBuffer glyphmetricsfloat, long glyphOrigin) { memCopy(memAddress(glyphmetricsfloat) + GLYPHORIGIN, glyphOrigin, POINTFLOAT.SIZEOF); }
	public static void glyphOriginGet(ByteBuffer glyphmetricsfloat, ByteBuffer glyphOrigin) { checkBuffer(glyphOrigin, POINTFLOAT.SIZEOF); glyphOriginGet(glyphmetricsfloat, memAddress(glyphOrigin)); }
	public static float glyphOriginX(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.X); }
	public static float glyphOriginY(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.Y); }
	public static float cellIncX(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + CELLINCX); }
	public static float cellIncY(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + CELLINCY); }

}