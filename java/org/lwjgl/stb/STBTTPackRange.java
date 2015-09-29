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

/** A range of packed character data, returned by {@link STBTruetype#stbtt_PackFontRanges} */
public final class STBTTPackRange extends Struct {

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

	private static native int offsets(long buffer);

	STBTTPackRange(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTPackRange} instance at the specified memory address. */
	public STBTTPackRange(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTPackRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTPackRange(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getFontSize() { return ngetFontSize(address()); }
	public int getFirstUnicodeCodepointInRange() { return ngetFirstUnicodeCodepointInRange(address()); }
	public ByteBuffer getArrayOfUnicodeCodepoints(int byteLen) { return ngetArrayOfUnicodeCodepoints(address(), byteLen); }
	public int getNumChars() { return ngetNumChars(address()); }
	public STBTTPackedchar getChardataForRange() { return ngetChardataForRangeStruct(address()); }

	// -----------------------------------

	/** Returns a new {@link STBTTPackRange} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTPackRange malloc() {
		return new STBTTPackRange(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTPackRange} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTPackRange calloc() {
		return new STBTTPackRange(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTPackRange} instance allocated with {@link BufferUtils}. */
	public static STBTTPackRange create() {
		return new STBTTPackRange(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static float ngetFontSize(long struct) { return memGetFloat(struct + FONT_SIZE); }
	public static float getFontSize(ByteBuffer struct) { return ngetFontSize(memAddress(struct)); }
	public static int ngetFirstUnicodeCodepointInRange(long struct) { return memGetInt(struct + FIRST_UNICODE_CODEPOINT_IN_RANGE); }
	public static int getFirstUnicodeCodepointInRange(ByteBuffer struct) { return ngetFirstUnicodeCodepointInRange(memAddress(struct)); }
	public static long ngetArrayOfUnicodeCodepoints(long struct) { return memGetAddress(struct + ARRAY_OF_UNICODE_CODEPOINTS); }
	public static ByteBuffer ngetArrayOfUnicodeCodepoints(long struct, int byteLen) { return memByteBuffer(ngetArrayOfUnicodeCodepoints(struct), byteLen); }
	public static ByteBuffer getArrayOfUnicodeCodepoints(ByteBuffer struct, int byteLen) { return ngetArrayOfUnicodeCodepoints(memAddress(struct), byteLen); }
	public static int ngetNumChars(long struct) { return memGetInt(struct + NUM_CHARS); }
	public static int getNumChars(ByteBuffer struct) { return ngetNumChars(memAddress(struct)); }
	public static long ngetChardataForRange(long struct) { return memGetAddress(struct + CHARDATA_FOR_RANGE); }
	public static STBTTPackedchar ngetChardataForRangeStruct(long struct) { return new STBTTPackedchar(ngetChardataForRange(struct)); }
	public static STBTTPackedchar getChardataForRange(ByteBuffer struct) { return ngetChardataForRangeStruct(memAddress(struct)); }

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
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected STBTTPackRange newInstance(long address) {
			return new STBTTPackRange(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public float getFontSize() { return ngetFontSize(address()); }
		public int getFirstUnicodeCodepointInRange() { return ngetFirstUnicodeCodepointInRange(address()); }
		public ByteBuffer getArrayOfUnicodeCodepoints(int byteLen) { return ngetArrayOfUnicodeCodepoints(address(), byteLen); }
		public int getNumChars() { return ngetNumChars(address()); }
		public STBTTPackedchar getChardataForRange() { return ngetChardataForRangeStruct(address()); }

	}

}