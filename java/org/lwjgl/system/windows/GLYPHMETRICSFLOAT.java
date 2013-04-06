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
			GLYPHORIGIN_X,
			GLYPHORIGIN_Y,
		CELLINCX,
		CELLINCY;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		BLACKBOXX = offsets.get(0);
		BLOCKBOXY = offsets.get(1);
		GLYPHORIGIN = offsets.get(2);
			GLYPHORIGIN_X = GLYPHORIGIN + POINTFLOAT.X;
			GLYPHORIGIN_Y = GLYPHORIGIN + POINTFLOAT.Y;
		CELLINCX = offsets.get(3);
		CELLINCY = offsets.get(4);
	}

	private GLYPHMETRICSFLOAT() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		float blackBoxX,
		float blockBoxY,
		float glyphOrigin_x,
		float glyphOrigin_y,
		float cellIncX,
		float cellIncY
	) {
		ByteBuffer glyphmetricsfloat = malloc();

		blackBoxXSet(glyphmetricsfloat, blackBoxX);
		blockBoxYSet(glyphmetricsfloat, blockBoxY);
		glyphOriginXSet(glyphmetricsfloat, glyphOrigin_x);
		glyphOriginYSet(glyphmetricsfloat, glyphOrigin_y);
		cellIncXSet(glyphmetricsfloat, cellIncX);
		cellIncYSet(glyphmetricsfloat, cellIncY);

		return glyphmetricsfloat;
	}

	public static void blackBoxXSet(ByteBuffer glyphmetricsfloat, float blackBoxX) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + BLACKBOXX, blackBoxX); }
	public static void blockBoxYSet(ByteBuffer glyphmetricsfloat, float blockBoxY) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + BLOCKBOXY, blockBoxY); }
	public static void glyphOriginXSet(ByteBuffer glyphmetricsfloat, float x) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + GLYPHORIGIN_X, x); }
	public static void glyphOriginYSet(ByteBuffer glyphmetricsfloat, float y) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + GLYPHORIGIN_Y, y); }
	public static void cellIncXSet(ByteBuffer glyphmetricsfloat, float cellIncX) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + CELLINCX, cellIncX); }
	public static void cellIncYSet(ByteBuffer glyphmetricsfloat, float cellIncY) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + CELLINCY, cellIncY); }

	public static float blackBoxXGet(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + BLACKBOXX); }
	public static float blockBoxYGet(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + BLOCKBOXY); }
	public static float glyphOriginXGet(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + GLYPHORIGIN_X); }
	public static float glyphOriginYGet(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + GLYPHORIGIN_Y); }
	public static float cellIncXGet(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + CELLINCX); }
	public static float cellIncYGet(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + CELLINCY); }

}