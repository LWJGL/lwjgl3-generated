/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A range of packed character data, used by {@link STBTruetype#stbtt_PackFontRanges}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct stbtt_pack_range {
 *     float font_size;
 *     int first_unicode_codepoint_in_range;
 *     int * array_of_unicode_codepoints;
 *     int num_chars;
 *     stbtt_packedchar * chardata_for_range;
 *     char[2];
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>font_size</td><td>the font size</td></tr>
 * <tr><td>first_unicode_codepoint_in_range</td><td>if non-zero, then the chars are continuous, and this is the first codepoint</td></tr>
 * <tr><td>array_of_unicode_codepoints</td><td>if non-zero, then this is an array of unicode codepoints</td></tr>
 * <tr><td>num_chars</td><td>the number of codepoints in the range</td></tr>
 * <tr><td>chardata_for_range</td><td>output</td></tr>
 * </table>
 */
public class STBTTPackRange extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		FONT_SIZE,
		FIRST_UNICODE_CODEPOINT_IN_RANGE,
		ARRAY_OF_UNICODE_CODEPOINTS,
		NUM_CHARS,
		CHARDATA_FOR_RANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__padding(2, true)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		FONT_SIZE = layout.offsetof(0);
		FIRST_UNICODE_CODEPOINT_IN_RANGE = layout.offsetof(1);
		ARRAY_OF_UNICODE_CODEPOINTS = layout.offsetof(2);
		NUM_CHARS = layout.offsetof(3);
		CHARDATA_FOR_RANGE = layout.offsetof(4);
	}

	STBTTPackRange(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBTTPackRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTPackRange(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code font_size} field. */
	public float font_size() { return nfont_size(address()); }
	/** Returns the value of the {@code first_unicode_codepoint_in_range} field. */
	public int first_unicode_codepoint_in_range() { return nfirst_unicode_codepoint_in_range(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code array_of_unicode_codepoints} field. */
	public IntBuffer array_of_unicode_codepoints() { return narray_of_unicode_codepoints(address()); }
	/** Returns the value of the {@code num_chars} field. */
	public int num_chars() { return nnum_chars(address()); }
	/** Returns a {@link STBTTPackedchar.Buffer} view of the struct array pointed to by the {@code chardata_for_range} field. */
	public STBTTPackedchar.Buffer chardata_for_range() { return nchardata_for_range(address()); }

	/** Sets the specified value to the {@code font_size} field. */
	public STBTTPackRange font_size(float value) { nfont_size(address(), value); return this; }
	/** Sets the specified value to the {@code first_unicode_codepoint_in_range} field. */
	public STBTTPackRange first_unicode_codepoint_in_range(int value) { nfirst_unicode_codepoint_in_range(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code array_of_unicode_codepoints} field. */
	public STBTTPackRange array_of_unicode_codepoints(IntBuffer value) { narray_of_unicode_codepoints(address(), value); return this; }
	/** Sets the address of the specified {@link STBTTPackedchar.Buffer} to the {@code chardata_for_range} field. */
	public STBTTPackRange chardata_for_range(STBTTPackedchar.Buffer value) { nchardata_for_range(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public STBTTPackRange set(
		float font_size,
		int first_unicode_codepoint_in_range,
		IntBuffer array_of_unicode_codepoints,
		STBTTPackedchar.Buffer chardata_for_range
	) {
		font_size(font_size);
		first_unicode_codepoint_in_range(first_unicode_codepoint_in_range);
		array_of_unicode_codepoints(array_of_unicode_codepoints);
		chardata_for_range(chardata_for_range);

		return this;
	}

	/** Unsafe version of {@link #set(STBTTPackRange) set}. */
	public STBTTPackRange nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public STBTTPackRange set(STBTTPackRange src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link STBTTPackRange} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTPackRange malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTPackRange} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTPackRange calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTPackRange} instance allocated with {@link BufferUtils}. */
	public static STBTTPackRange create() {
		return new STBTTPackRange(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBTTPackRange} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBTTPackRange create(long address) {
		return address == NULL ? null : new STBTTPackRange(address, null);
	}

	/**
	 * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBTTPackRange.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #font_size}. */
	public static float nfont_size(long struct) { return memGetFloat(struct + STBTTPackRange.FONT_SIZE); }
	/** Unsafe version of {@link #first_unicode_codepoint_in_range}. */
	public static int nfirst_unicode_codepoint_in_range(long struct) { return memGetInt(struct + STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE); }
	/** Unsafe version of {@link #array_of_unicode_codepoints() array_of_unicode_codepoints}. */
	public static IntBuffer narray_of_unicode_codepoints(long struct) { return memIntBuffer(memGetAddress(struct + STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS), nnum_chars(struct)); }
	/** Unsafe version of {@link #num_chars}. */
	public static int nnum_chars(long struct) { return memGetInt(struct + STBTTPackRange.NUM_CHARS); }
	/** Unsafe version of {@link #chardata_for_range}. */
	public static STBTTPackedchar.Buffer nchardata_for_range(long struct) { return STBTTPackedchar.create(memGetAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE), nnum_chars(struct)); }

	/** Unsafe version of {@link #font_size(float) font_size}. */
	public static void nfont_size(long struct, float value) { memPutFloat(struct + STBTTPackRange.FONT_SIZE, value); }
	/** Unsafe version of {@link #first_unicode_codepoint_in_range(int) first_unicode_codepoint_in_range}. */
	public static void nfirst_unicode_codepoint_in_range(long struct, int value) { memPutInt(struct + STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE, value); }
	/** Unsafe version of {@link #array_of_unicode_codepoints(IntBuffer) array_of_unicode_codepoints}. */
	public static void narray_of_unicode_codepoints(long struct, IntBuffer value) { memPutAddress(struct + STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS, memAddressSafe(value)); }
	/** Sets the specified value to the {@code num_chars} field of the specified {@code struct}. */
	public static void nnum_chars(long struct, int value) { memPutInt(struct + STBTTPackRange.NUM_CHARS, value); }
	/** Unsafe version of {@link #chardata_for_range(STBTTPackedchar.Buffer) chardata_for_range}. */
	public static void nchardata_for_range(long struct, STBTTPackedchar.Buffer value) { memPutAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE, value.address()); nnum_chars(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link STBTTPackRange} structs. */
	public static final class Buffer extends StructBuffer<STBTTPackRange, Buffer> {

		/**
		 * Creates a new {@link STBTTPackRange.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTPackRange#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected STBTTPackRange newInstance(long address) {
			return new STBTTPackRange(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code font_size} field. */
		public float font_size() { return STBTTPackRange.nfont_size(address()); }
		/** Returns the value of the {@code first_unicode_codepoint_in_range} field. */
		public int first_unicode_codepoint_in_range() { return STBTTPackRange.nfirst_unicode_codepoint_in_range(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code array_of_unicode_codepoints} field. */
		public IntBuffer array_of_unicode_codepoints() { return STBTTPackRange.narray_of_unicode_codepoints(address()); }
		/** Returns the value of the {@code num_chars} field. */
		public int num_chars() { return STBTTPackRange.nnum_chars(address()); }
		/** Returns a {@link STBTTPackedchar.Buffer} view of the struct array pointed to by the {@code chardata_for_range} field. */
		public STBTTPackedchar.Buffer chardata_for_range() { return STBTTPackRange.nchardata_for_range(address()); }

		/** Sets the specified value to the {@code font_size} field. */
		public STBTTPackRange.Buffer font_size(float value) { STBTTPackRange.nfont_size(address(), value); return this; }
		/** Sets the specified value to the {@code first_unicode_codepoint_in_range} field. */
		public STBTTPackRange.Buffer first_unicode_codepoint_in_range(int value) { STBTTPackRange.nfirst_unicode_codepoint_in_range(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code array_of_unicode_codepoints} field. */
		public STBTTPackRange.Buffer array_of_unicode_codepoints(IntBuffer value) { STBTTPackRange.narray_of_unicode_codepoints(address(), value); return this; }
		/** Sets the address of the specified {@link STBTTPackedchar.Buffer} to the {@code chardata_for_range} field. */
		public STBTTPackRange.Buffer chardata_for_range(STBTTPackedchar.Buffer value) { STBTTPackRange.nchardata_for_range(address(), value); return this; }

	}

}