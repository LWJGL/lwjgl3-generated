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

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	public static void blackBoxXSet(ByteBuffer struct, float blackBoxX) { struct.putFloat(struct.position() + BLACKBOXX, blackBoxX); }
	public static void blockBoxYSet(ByteBuffer struct, float blockBoxY) { struct.putFloat(struct.position() + BLOCKBOXY, blockBoxY); }
	public static void glyphOriginXSet(ByteBuffer struct, float x) { struct.putFloat(struct.position() + GLYPHORIGIN_X, x); }
	public static void glyphOriginYSet(ByteBuffer struct, float y) { struct.putFloat(struct.position() + GLYPHORIGIN_Y, y); }
	public static void cellIncXSet(ByteBuffer struct, float cellIncX) { struct.putFloat(struct.position() + CELLINCX, cellIncX); }
	public static void cellIncYSet(ByteBuffer struct, float cellIncY) { struct.putFloat(struct.position() + CELLINCY, cellIncY); }

	public static float blackBoxXGet(ByteBuffer struct) { return struct.getFloat(struct.position() + BLACKBOXX); }
	public static float blockBoxYGet(ByteBuffer struct) { return struct.getFloat(struct.position() + BLOCKBOXY); }
	public static float glyphOriginXGet(ByteBuffer struct) { return struct.getFloat(struct.position() + GLYPHORIGIN_X); }
	public static float glyphOriginYGet(ByteBuffer struct) { return struct.getFloat(struct.position() + GLYPHORIGIN_Y); }
	public static float cellIncXGet(ByteBuffer struct) { return struct.getFloat(struct.position() + CELLINCX); }
	public static float cellIncYGet(ByteBuffer struct) { return struct.getFloat(struct.position() + CELLINCY); }

}