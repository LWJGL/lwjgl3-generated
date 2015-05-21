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

/** A range of packed character data, returned by {@link STBTruetype#stbtt_PackFontRanges} */
public final class STBTTPackRange implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FONT_SIZE,
		FIRST_UNICODE_CHAR_IN_RANGE,
		NUM_CHARS_IN_RANGE,
		CHARDATA_FOR_RANGE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		FONT_SIZE = offsets.get(0);
		FIRST_UNICODE_CHAR_IN_RANGE = offsets.get(1);
		NUM_CHARS_IN_RANGE = offsets.get(2);
		CHARDATA_FOR_RANGE = offsets.get(3);
	}

	private final ByteBuffer struct;

	public STBTTPackRange() {
		this(malloc());
	}

	public STBTTPackRange(ByteBuffer struct) {
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

	public void setFontSize(float font_size) { font_size(struct, font_size); }
	public void setFirstUnicodeCharInRange(int first_unicode_char_in_range) { first_unicode_char_in_range(struct, first_unicode_char_in_range); }
	public void setNumCharsInRange(int num_chars_in_range) { num_chars_in_range(struct, num_chars_in_range); }
	public void setChardataForRange(long chardata_for_range) { chardata_for_range(struct, chardata_for_range); }
	public void setChardataForRange(ByteBuffer chardata_for_range) { chardata_for_range(struct, chardata_for_range); }

	public float getFontSize() { return font_size(struct); }
	public int getFirstUnicodeCharInRange() { return first_unicode_char_in_range(struct); }
	public int getNumCharsInRange() { return num_chars_in_range(struct); }
	public long getChardataForRange() { return chardata_for_range(struct); }
	public ByteBuffer getChardataForRangeBuffer() { return chardata_for_rangeBuffer(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float font_size,
		int first_unicode_char_in_range,
		int num_chars_in_range,
		ByteBuffer chardata_for_range
	) {
		ByteBuffer stbtt_pack_range = malloc();

		font_size(stbtt_pack_range, font_size);
		first_unicode_char_in_range(stbtt_pack_range, first_unicode_char_in_range);
		num_chars_in_range(stbtt_pack_range, num_chars_in_range);
		chardata_for_range(stbtt_pack_range, chardata_for_range);

		return stbtt_pack_range;
	}

	public static void font_size(ByteBuffer stbtt_pack_range, float font_size) { stbtt_pack_range.putFloat(stbtt_pack_range.position() + FONT_SIZE, font_size); }
	public static void first_unicode_char_in_range(ByteBuffer stbtt_pack_range, int first_unicode_char_in_range) { stbtt_pack_range.putInt(stbtt_pack_range.position() + FIRST_UNICODE_CHAR_IN_RANGE, first_unicode_char_in_range); }
	public static void num_chars_in_range(ByteBuffer stbtt_pack_range, int num_chars_in_range) { stbtt_pack_range.putInt(stbtt_pack_range.position() + NUM_CHARS_IN_RANGE, num_chars_in_range); }
	public static void chardata_for_range(ByteBuffer stbtt_pack_range, long chardata_for_range) { PointerBuffer.put(stbtt_pack_range, stbtt_pack_range.position() + CHARDATA_FOR_RANGE, chardata_for_range); }
	public static void chardata_for_range(ByteBuffer stbtt_pack_range, ByteBuffer chardata_for_range) { chardata_for_range(stbtt_pack_range, memAddressSafe(chardata_for_range)); }

	public static float font_size(ByteBuffer stbtt_pack_range) { return stbtt_pack_range.getFloat(stbtt_pack_range.position() + FONT_SIZE); }
	public static int first_unicode_char_in_range(ByteBuffer stbtt_pack_range) { return stbtt_pack_range.getInt(stbtt_pack_range.position() + FIRST_UNICODE_CHAR_IN_RANGE); }
	public static int num_chars_in_range(ByteBuffer stbtt_pack_range) { return stbtt_pack_range.getInt(stbtt_pack_range.position() + NUM_CHARS_IN_RANGE); }
	public static long chardata_for_range(ByteBuffer stbtt_pack_range) { return PointerBuffer.get(stbtt_pack_range, stbtt_pack_range.position() + CHARDATA_FOR_RANGE); }
	public static ByteBuffer chardata_for_rangeBuffer(ByteBuffer stbtt_pack_range) { return memByteBuffer(chardata_for_range(stbtt_pack_range), STBTTPackedchar.SIZEOF); }

}