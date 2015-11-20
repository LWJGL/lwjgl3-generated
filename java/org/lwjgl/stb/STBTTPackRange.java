/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A range of packed character data, returned by {@link STBTruetype#stbtt_PackFontRanges}
 * 
 * <h3>stbtt_pack_range members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>font_size</td><td class="nw">float</td><td></td></tr>
 * <tr><td>first_unicode_codepoint_in_range</td><td class="nw">int</td><td>if non-zero, then the chars are continuous, and this is the first codepoint</td></tr>
 * <tr><td>array_of_unicode_codepoints</td><td class="nw">int</td><td>if non-zero, then this is an array of unicode codepoints</td></tr>
 * <tr><td>num_chars</td><td class="nw">int</td><td></td></tr>
 * <tr><td>chardata_for_range</td><td class="nw">stbtt_packedchar *</td><td>output</td></tr>
 * <tr><td>*</td><td class="nw">char[2]</td><td></td></tr>
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
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(Pointer.POINTER_SIZE),
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

	/** Returns the value of the {@code font_size} field. */
	public float font_size() { return nfont_size(address()); }
	/** Returns the value of the {@code first_unicode_codepoint_in_range} field. */
	public int first_unicode_codepoint_in_range() { return nfirst_unicode_codepoint_in_range(address()); }
	/**
	 * Returns a {@link IntBuffer} view of the data pointed to by the {@code array_of_unicode_codepoints} field.
	 *
	 * @param capacity the number of elements in the returned {@link IntBuffer}
	 */
	public IntBuffer array_of_unicode_codepoints(int capacity) { return narray_of_unicode_codepoints(address(), capacity); }
	/** Returns the value of the {@code num_chars} field. */
	public int num_chars() { return nnum_chars(address()); }
	/** Returns a {@link STBTTPackedchar} view of the struct pointed to by the {@code chardata_for_range} field. */
	public STBTTPackedchar chardata_for_range() { return nchardata_for_rangeStruct(address()); }

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

	/**
	 * Create a {@link STBTTPackRange.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #font_size}. */
	public static float nfont_size(long struct) { return memGetFloat(struct + STBTTPackRange.FONT_SIZE); }
	/** Unsafe version of {@link #first_unicode_codepoint_in_range}. */
	public static int nfirst_unicode_codepoint_in_range(long struct) { return memGetInt(struct + STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE); }
	/** Unsafe version of {@link #array_of_unicode_codepoints(int) array_of_unicode_codepoints}. */
	public static IntBuffer narray_of_unicode_codepoints(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS), capacity); }
	/** Unsafe version of {@link #num_chars}. */
	public static int nnum_chars(long struct) { return memGetInt(struct + STBTTPackRange.NUM_CHARS); }
	/** Unsafe version of {@link #chardata_for_range}. */
	public static STBTTPackedchar nchardata_for_rangeStruct(long struct) { return new STBTTPackedchar(memGetAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE)); }

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

		/** Returns the value of the {@code font_size} field. */
		public float font_size() { return nfont_size(address()); }
		/** Returns the value of the {@code first_unicode_codepoint_in_range} field. */
		public int first_unicode_codepoint_in_range() { return nfirst_unicode_codepoint_in_range(address()); }
		/**
		 * Returns a {@link IntBuffer} view of the data pointed to by the {@code array_of_unicode_codepoints} field.
		 *
		 * @param capacity the number of elements in the returned {@link IntBuffer}
		 */
		public IntBuffer array_of_unicode_codepoints(int capacity) { return narray_of_unicode_codepoints(address(), capacity); }
		/** Returns the value of the {@code num_chars} field. */
		public int num_chars() { return nnum_chars(address()); }
		/** Returns a {@link STBTTPackedchar} view of the struct pointed to by the {@code chardata_for_range} field. */
		public STBTTPackedchar chardata_for_range() { return nchardata_for_rangeStruct(address()); }

	}

}