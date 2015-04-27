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
public final class GLYPHMETRICSFLOAT implements Pointer {

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

	private final ByteBuffer struct;

	public GLYPHMETRICSFLOAT() {
		this(malloc());
	}

	public GLYPHMETRICSFLOAT(ByteBuffer struct) {
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

	public void setBlackBoxX(float blackBoxX) { blackBoxX(struct, blackBoxX); }
	public void setBlockBoxY(float blockBoxY) { blockBoxY(struct, blockBoxY); }
	public void setGlyphOrigin(ByteBuffer glyphOrigin) { glyphOriginSet(struct, glyphOrigin); }
	public void setGlyphOriginX(float x) { glyphOriginX(struct, x); }
	public void setGlyphOriginY(float y) { glyphOriginY(struct, y); }
	public void setCellIncX(float cellIncX) { cellIncX(struct, cellIncX); }
	public void setCellIncY(float cellIncY) { cellIncY(struct, cellIncY); }

	public float getBlackBoxX() { return blackBoxX(struct); }
	public float getBlockBoxY() { return blockBoxY(struct); }
	public void getGlyphOrigin(ByteBuffer glyphOrigin) { glyphOriginGet(struct, glyphOrigin); }
	public float getGlyphOriginX() { return glyphOriginX(struct); }
	public float getGlyphOriginY() { return glyphOriginY(struct); }
	public float getCellIncX() { return cellIncX(struct); }
	public float getCellIncY() { return cellIncY(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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
	public static void glyphOriginSet(ByteBuffer glyphmetricsfloat, ByteBuffer glyphOrigin) { if ( glyphOrigin != null ) memCopy(memAddress(glyphOrigin), memAddress(glyphmetricsfloat) + GLYPHORIGIN, POINTFLOAT.SIZEOF); }
	public static void glyphOriginX(ByteBuffer glyphmetricsfloat, float x) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.X, x); }
	public static void glyphOriginY(ByteBuffer glyphmetricsfloat, float y) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.Y, y); }
	public static void cellIncX(ByteBuffer glyphmetricsfloat, float cellIncX) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + CELLINCX, cellIncX); }
	public static void cellIncY(ByteBuffer glyphmetricsfloat, float cellIncY) { glyphmetricsfloat.putFloat(glyphmetricsfloat.position() + CELLINCY, cellIncY); }

	public static float blackBoxX(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + BLACKBOXX); }
	public static float blockBoxY(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + BLOCKBOXY); }
	public static void glyphOriginGet(ByteBuffer glyphmetricsfloat, ByteBuffer glyphOrigin) { if ( LWJGLUtil.CHECKS ) checkBuffer(glyphOrigin, POINTFLOAT.SIZEOF); memCopy(memAddress(glyphmetricsfloat) + GLYPHORIGIN, memAddress(glyphOrigin), POINTFLOAT.SIZEOF); }
	public static float glyphOriginX(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.X); }
	public static float glyphOriginY(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + GLYPHORIGIN + POINTFLOAT.Y); }
	public static float cellIncX(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + CELLINCX); }
	public static float cellIncY(ByteBuffer glyphmetricsfloat) { return glyphmetricsfloat.getFloat(glyphmetricsfloat.position() + CELLINCY); }

}