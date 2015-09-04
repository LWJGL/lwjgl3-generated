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
		FIRST_UNICODE_CODEPOINT_IN_RANGE,
		ARRAY_OF_UNICODE_CODEPOINTS,
		NUM_CHARS,
		CHARDATA_FOR_RANGE;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		FONT_SIZE = offsets.get(0);
		FIRST_UNICODE_CODEPOINT_IN_RANGE = offsets.get(1);
		ARRAY_OF_UNICODE_CODEPOINTS = offsets.get(2);
		NUM_CHARS = offsets.get(3);
		CHARDATA_FOR_RANGE = offsets.get(4);

		memFree(offsets);
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

	public STBTTPackRange setFontSize(float font_size) { font_size(struct, font_size); return this; }
	public STBTTPackRange setFirstUnicodeCodepointInRange(int first_unicode_codepoint_in_range) { first_unicode_codepoint_in_range(struct, first_unicode_codepoint_in_range); return this; }
	public STBTTPackRange setArrayOfUnicodeCodepoints(long array_of_unicode_codepoints) { array_of_unicode_codepoints(struct, array_of_unicode_codepoints); return this; }
	public STBTTPackRange setArrayOfUnicodeCodepoints(ByteBuffer array_of_unicode_codepoints) { array_of_unicode_codepoints(struct, array_of_unicode_codepoints); return this; }
	public STBTTPackRange setNumChars(int num_chars) { num_chars(struct, num_chars); return this; }
	public STBTTPackRange setChardataForRange(long chardata_for_range) { chardata_for_range(struct, chardata_for_range); return this; }
	public STBTTPackRange setChardataForRange(ByteBuffer chardata_for_range) { chardata_for_range(struct, chardata_for_range); return this; }

	public float getFontSize() { return font_size(struct); }
	public int getFirstUnicodeCodepointInRange() { return first_unicode_codepoint_in_range(struct); }
	public long getArrayOfUnicodeCodepoints() { return array_of_unicode_codepoints(struct); }
	public ByteBuffer getArrayOfUnicodeCodepoints(int byteLen) { return array_of_unicode_codepoints(struct, byteLen); }
	public int getNumChars() { return num_chars(struct); }
	public long getChardataForRange() { return chardata_for_range(struct); }
	public ByteBuffer getChardataForRangeBuffer() { return chardata_for_rangeBuffer(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float font_size,
		int first_unicode_codepoint_in_range,
		ByteBuffer array_of_unicode_codepoints,
		int num_chars,
		ByteBuffer chardata_for_range
	) {
		ByteBuffer stbtt_pack_range = malloc();

		font_size(stbtt_pack_range, font_size);
		first_unicode_codepoint_in_range(stbtt_pack_range, first_unicode_codepoint_in_range);
		array_of_unicode_codepoints(stbtt_pack_range, array_of_unicode_codepoints);
		num_chars(stbtt_pack_range, num_chars);
		chardata_for_range(stbtt_pack_range, chardata_for_range);

		return stbtt_pack_range;
	}

	public static void font_size(ByteBuffer stbtt_pack_range, float font_size) { stbtt_pack_range.putFloat(stbtt_pack_range.position() + FONT_SIZE, font_size); }
	public static void first_unicode_codepoint_in_range(ByteBuffer stbtt_pack_range, int first_unicode_codepoint_in_range) { stbtt_pack_range.putInt(stbtt_pack_range.position() + FIRST_UNICODE_CODEPOINT_IN_RANGE, first_unicode_codepoint_in_range); }
	public static void array_of_unicode_codepoints(ByteBuffer stbtt_pack_range, long array_of_unicode_codepoints) { PointerBuffer.put(stbtt_pack_range, stbtt_pack_range.position() + ARRAY_OF_UNICODE_CODEPOINTS, array_of_unicode_codepoints); }
	public static void array_of_unicode_codepoints(ByteBuffer stbtt_pack_range, ByteBuffer array_of_unicode_codepoints) { array_of_unicode_codepoints(stbtt_pack_range, memAddressSafe(array_of_unicode_codepoints)); }
	public static void num_chars(ByteBuffer stbtt_pack_range, int num_chars) { stbtt_pack_range.putInt(stbtt_pack_range.position() + NUM_CHARS, num_chars); }
	public static void chardata_for_range(ByteBuffer stbtt_pack_range, long chardata_for_range) { PointerBuffer.put(stbtt_pack_range, stbtt_pack_range.position() + CHARDATA_FOR_RANGE, chardata_for_range); }
	public static void chardata_for_range(ByteBuffer stbtt_pack_range, ByteBuffer chardata_for_range) { chardata_for_range(stbtt_pack_range, memAddressSafe(chardata_for_range)); }

	public static float font_size(ByteBuffer stbtt_pack_range) { return stbtt_pack_range.getFloat(stbtt_pack_range.position() + FONT_SIZE); }
	public static int first_unicode_codepoint_in_range(ByteBuffer stbtt_pack_range) { return stbtt_pack_range.getInt(stbtt_pack_range.position() + FIRST_UNICODE_CODEPOINT_IN_RANGE); }
	public static long array_of_unicode_codepoints(ByteBuffer stbtt_pack_range) { return PointerBuffer.get(stbtt_pack_range, stbtt_pack_range.position() + ARRAY_OF_UNICODE_CODEPOINTS); }
	public static ByteBuffer array_of_unicode_codepoints(ByteBuffer stbtt_pack_range, int byteLen) { return memByteBuffer(array_of_unicode_codepoints(stbtt_pack_range), byteLen); }
	public static int num_chars(ByteBuffer stbtt_pack_range) { return stbtt_pack_range.getInt(stbtt_pack_range.position() + NUM_CHARS); }
	public static long chardata_for_range(ByteBuffer stbtt_pack_range) { return PointerBuffer.get(stbtt_pack_range, stbtt_pack_range.position() + CHARDATA_FOR_RANGE); }
	public static ByteBuffer chardata_for_rangeBuffer(ByteBuffer stbtt_pack_range) { return memByteBuffer(chardata_for_range(stbtt_pack_range), STBTTPackedchar.SIZEOF); }

}