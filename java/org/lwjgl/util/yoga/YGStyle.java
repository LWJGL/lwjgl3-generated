/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct YGStyle {
    YGDirection direction;
    YGFlexDirection flexDirection;
    YGJustify justifyContent;
    YGAlign alignContent;
    YGAlign alignItems;
    YGAlign alignSelf;
    YGPositionType positionType;
    YGWrap flexWrap;
    YGOverflow overflow;
    float flex;
    float flexGrow;
    float flexShrink;
    float flexBasis;
    float margin[9];
    float positions[9];
    float padding[9];
    float border[9];
    float dimensions[2];
    float minDimensions[2];
    float maxDimensions[2];
    float aspectRatio;
}</code></pre>
 */
public class YGStyle extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		DIRECTION,
		FLEXDIRECTION,
		JUSTIFYCONTENT,
		ALIGNCONTENT,
		ALIGNITEMS,
		ALIGNSELF,
		POSITIONTYPE,
		FLEXWRAP,
		OVERFLOW,
		FLEX,
		FLEXGROW,
		FLEXSHRINK,
		FLEXBASIS,
		MARGIN,
		POSITIONS,
		PADDING,
		BORDER,
		DIMENSIONS,
		MINDIMENSIONS,
		MAXDIMENSIONS,
		ASPECTRATIO;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__array(4, 9),
			__array(4, 9),
			__array(4, 9),
			__array(4, 9),
			__array(4, 2),
			__array(4, 2),
			__array(4, 2),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		DIRECTION = layout.offsetof(0);
		FLEXDIRECTION = layout.offsetof(1);
		JUSTIFYCONTENT = layout.offsetof(2);
		ALIGNCONTENT = layout.offsetof(3);
		ALIGNITEMS = layout.offsetof(4);
		ALIGNSELF = layout.offsetof(5);
		POSITIONTYPE = layout.offsetof(6);
		FLEXWRAP = layout.offsetof(7);
		OVERFLOW = layout.offsetof(8);
		FLEX = layout.offsetof(9);
		FLEXGROW = layout.offsetof(10);
		FLEXSHRINK = layout.offsetof(11);
		FLEXBASIS = layout.offsetof(12);
		MARGIN = layout.offsetof(13);
		POSITIONS = layout.offsetof(14);
		PADDING = layout.offsetof(15);
		BORDER = layout.offsetof(16);
		DIMENSIONS = layout.offsetof(17);
		MINDIMENSIONS = layout.offsetof(18);
		MAXDIMENSIONS = layout.offsetof(19);
		ASPECTRATIO = layout.offsetof(20);
	}

	YGStyle(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link YGStyle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public YGStyle(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code direction} field. */
	public int direction() { return ndirection(address()); }
	/** Returns the value of the {@code flexDirection} field. */
	public int flexDirection() { return nflexDirection(address()); }
	/** Returns the value of the {@code justifyContent} field. */
	public int justifyContent() { return njustifyContent(address()); }
	/** Returns the value of the {@code alignContent} field. */
	public int alignContent() { return nalignContent(address()); }
	/** Returns the value of the {@code alignItems} field. */
	public int alignItems() { return nalignItems(address()); }
	/** Returns the value of the {@code alignSelf} field. */
	public int alignSelf() { return nalignSelf(address()); }
	/** Returns the value of the {@code positionType} field. */
	public int positionType() { return npositionType(address()); }
	/** Returns the value of the {@code flexWrap} field. */
	public int flexWrap() { return nflexWrap(address()); }
	/** Returns the value of the {@code overflow} field. */
	public int overflow() { return noverflow(address()); }
	/** Returns the value of the {@code flex} field. */
	public float flex() { return nflex(address()); }
	/** Returns the value of the {@code flexGrow} field. */
	public float flexGrow() { return nflexGrow(address()); }
	/** Returns the value of the {@code flexShrink} field. */
	public float flexShrink() { return nflexShrink(address()); }
	/** Returns the value of the {@code flexBasis} field. */
	public float flexBasis() { return nflexBasis(address()); }
	/** Returns a {@link FloatBuffer} view of the {@code margin} field. */
	public FloatBuffer margin() { return nmargin(address()); }
	/** Returns the value at the specified index of the {@code margin} field. */
	public float margin(int index) { return nmargin(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code positions} field. */
	public FloatBuffer positions() { return npositions(address()); }
	/** Returns the value at the specified index of the {@code positions} field. */
	public float positions(int index) { return npositions(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code padding} field. */
	public FloatBuffer padding() { return npadding(address()); }
	/** Returns the value at the specified index of the {@code padding} field. */
	public float padding(int index) { return npadding(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code border} field. */
	public FloatBuffer border() { return nborder(address()); }
	/** Returns the value at the specified index of the {@code border} field. */
	public float border(int index) { return nborder(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code dimensions} field. */
	public FloatBuffer dimensions() { return ndimensions(address()); }
	/** Returns the value at the specified index of the {@code dimensions} field. */
	public float dimensions(int index) { return ndimensions(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code minDimensions} field. */
	public FloatBuffer minDimensions() { return nminDimensions(address()); }
	/** Returns the value at the specified index of the {@code minDimensions} field. */
	public float minDimensions(int index) { return nminDimensions(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code maxDimensions} field. */
	public FloatBuffer maxDimensions() { return nmaxDimensions(address()); }
	/** Returns the value at the specified index of the {@code maxDimensions} field. */
	public float maxDimensions(int index) { return nmaxDimensions(address(), index); }
	/** Returns the value of the {@code aspectRatio} field. */
	public float aspectRatio() { return naspectRatio(address()); }

	// -----------------------------------

	/** Returns a new {@link YGStyle} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static YGStyle create(long address) {
		return address == NULL ? null : new YGStyle(address, null);
	}

	/**
	 * Create a {@link YGStyle.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #direction}. */
	public static int ndirection(long struct) { return memGetInt(struct + YGStyle.DIRECTION); }
	/** Unsafe version of {@link #flexDirection}. */
	public static int nflexDirection(long struct) { return memGetInt(struct + YGStyle.FLEXDIRECTION); }
	/** Unsafe version of {@link #justifyContent}. */
	public static int njustifyContent(long struct) { return memGetInt(struct + YGStyle.JUSTIFYCONTENT); }
	/** Unsafe version of {@link #alignContent}. */
	public static int nalignContent(long struct) { return memGetInt(struct + YGStyle.ALIGNCONTENT); }
	/** Unsafe version of {@link #alignItems}. */
	public static int nalignItems(long struct) { return memGetInt(struct + YGStyle.ALIGNITEMS); }
	/** Unsafe version of {@link #alignSelf}. */
	public static int nalignSelf(long struct) { return memGetInt(struct + YGStyle.ALIGNSELF); }
	/** Unsafe version of {@link #positionType}. */
	public static int npositionType(long struct) { return memGetInt(struct + YGStyle.POSITIONTYPE); }
	/** Unsafe version of {@link #flexWrap}. */
	public static int nflexWrap(long struct) { return memGetInt(struct + YGStyle.FLEXWRAP); }
	/** Unsafe version of {@link #overflow}. */
	public static int noverflow(long struct) { return memGetInt(struct + YGStyle.OVERFLOW); }
	/** Unsafe version of {@link #flex}. */
	public static float nflex(long struct) { return memGetFloat(struct + YGStyle.FLEX); }
	/** Unsafe version of {@link #flexGrow}. */
	public static float nflexGrow(long struct) { return memGetFloat(struct + YGStyle.FLEXGROW); }
	/** Unsafe version of {@link #flexShrink}. */
	public static float nflexShrink(long struct) { return memGetFloat(struct + YGStyle.FLEXSHRINK); }
	/** Unsafe version of {@link #flexBasis}. */
	public static float nflexBasis(long struct) { return memGetFloat(struct + YGStyle.FLEXBASIS); }
	/** Unsafe version of {@link #margin}. */
	public static FloatBuffer nmargin(long struct) { return memFloatBuffer(struct + YGStyle.MARGIN, 9); }
	/** Unsafe version of {@link #margin(int) margin}. */
	public static float nmargin(long struct, int index) {
		if ( CHECKS ) check(index, 9);
		return memGetFloat(struct + YGStyle.MARGIN + index * 4);
	}
	/** Unsafe version of {@link #positions}. */
	public static FloatBuffer npositions(long struct) { return memFloatBuffer(struct + YGStyle.POSITIONS, 9); }
	/** Unsafe version of {@link #positions(int) positions}. */
	public static float npositions(long struct, int index) {
		if ( CHECKS ) check(index, 9);
		return memGetFloat(struct + YGStyle.POSITIONS + index * 4);
	}
	/** Unsafe version of {@link #padding}. */
	public static FloatBuffer npadding(long struct) { return memFloatBuffer(struct + YGStyle.PADDING, 9); }
	/** Unsafe version of {@link #padding(int) padding}. */
	public static float npadding(long struct, int index) {
		if ( CHECKS ) check(index, 9);
		return memGetFloat(struct + YGStyle.PADDING + index * 4);
	}
	/** Unsafe version of {@link #border}. */
	public static FloatBuffer nborder(long struct) { return memFloatBuffer(struct + YGStyle.BORDER, 9); }
	/** Unsafe version of {@link #border(int) border}. */
	public static float nborder(long struct, int index) {
		if ( CHECKS ) check(index, 9);
		return memGetFloat(struct + YGStyle.BORDER + index * 4);
	}
	/** Unsafe version of {@link #dimensions}. */
	public static FloatBuffer ndimensions(long struct) { return memFloatBuffer(struct + YGStyle.DIMENSIONS, 2); }
	/** Unsafe version of {@link #dimensions(int) dimensions}. */
	public static float ndimensions(long struct, int index) {
		if ( CHECKS ) check(index, 2);
		return memGetFloat(struct + YGStyle.DIMENSIONS + index * 4);
	}
	/** Unsafe version of {@link #minDimensions}. */
	public static FloatBuffer nminDimensions(long struct) { return memFloatBuffer(struct + YGStyle.MINDIMENSIONS, 2); }
	/** Unsafe version of {@link #minDimensions(int) minDimensions}. */
	public static float nminDimensions(long struct, int index) {
		if ( CHECKS ) check(index, 2);
		return memGetFloat(struct + YGStyle.MINDIMENSIONS + index * 4);
	}
	/** Unsafe version of {@link #maxDimensions}. */
	public static FloatBuffer nmaxDimensions(long struct) { return memFloatBuffer(struct + YGStyle.MAXDIMENSIONS, 2); }
	/** Unsafe version of {@link #maxDimensions(int) maxDimensions}. */
	public static float nmaxDimensions(long struct, int index) {
		if ( CHECKS ) check(index, 2);
		return memGetFloat(struct + YGStyle.MAXDIMENSIONS + index * 4);
	}
	/** Unsafe version of {@link #aspectRatio}. */
	public static float naspectRatio(long struct) { return memGetFloat(struct + YGStyle.ASPECTRATIO); }

	// -----------------------------------

	/** An array of {@link YGStyle} structs. */
	public static class Buffer extends StructBuffer<YGStyle, Buffer> {

		/**
		 * Creates a new {@link YGStyle.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link YGStyle#SIZEOF}, and its mark will be undefined.
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
		protected YGStyle newInstance(long address) {
			return new YGStyle(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code direction} field. */
		public int direction() { return YGStyle.ndirection(address()); }
		/** Returns the value of the {@code flexDirection} field. */
		public int flexDirection() { return YGStyle.nflexDirection(address()); }
		/** Returns the value of the {@code justifyContent} field. */
		public int justifyContent() { return YGStyle.njustifyContent(address()); }
		/** Returns the value of the {@code alignContent} field. */
		public int alignContent() { return YGStyle.nalignContent(address()); }
		/** Returns the value of the {@code alignItems} field. */
		public int alignItems() { return YGStyle.nalignItems(address()); }
		/** Returns the value of the {@code alignSelf} field. */
		public int alignSelf() { return YGStyle.nalignSelf(address()); }
		/** Returns the value of the {@code positionType} field. */
		public int positionType() { return YGStyle.npositionType(address()); }
		/** Returns the value of the {@code flexWrap} field. */
		public int flexWrap() { return YGStyle.nflexWrap(address()); }
		/** Returns the value of the {@code overflow} field. */
		public int overflow() { return YGStyle.noverflow(address()); }
		/** Returns the value of the {@code flex} field. */
		public float flex() { return YGStyle.nflex(address()); }
		/** Returns the value of the {@code flexGrow} field. */
		public float flexGrow() { return YGStyle.nflexGrow(address()); }
		/** Returns the value of the {@code flexShrink} field. */
		public float flexShrink() { return YGStyle.nflexShrink(address()); }
		/** Returns the value of the {@code flexBasis} field. */
		public float flexBasis() { return YGStyle.nflexBasis(address()); }
		/** Returns a {@link FloatBuffer} view of the {@code margin} field. */
		public FloatBuffer margin() { return YGStyle.nmargin(address()); }
		/** Returns the value at the specified index of the {@code margin} field. */
		public float margin(int index) { return YGStyle.nmargin(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code positions} field. */
		public FloatBuffer positions() { return YGStyle.npositions(address()); }
		/** Returns the value at the specified index of the {@code positions} field. */
		public float positions(int index) { return YGStyle.npositions(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code padding} field. */
		public FloatBuffer padding() { return YGStyle.npadding(address()); }
		/** Returns the value at the specified index of the {@code padding} field. */
		public float padding(int index) { return YGStyle.npadding(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code border} field. */
		public FloatBuffer border() { return YGStyle.nborder(address()); }
		/** Returns the value at the specified index of the {@code border} field. */
		public float border(int index) { return YGStyle.nborder(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code dimensions} field. */
		public FloatBuffer dimensions() { return YGStyle.ndimensions(address()); }
		/** Returns the value at the specified index of the {@code dimensions} field. */
		public float dimensions(int index) { return YGStyle.ndimensions(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code minDimensions} field. */
		public FloatBuffer minDimensions() { return YGStyle.nminDimensions(address()); }
		/** Returns the value at the specified index of the {@code minDimensions} field. */
		public float minDimensions(int index) { return YGStyle.nminDimensions(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code maxDimensions} field. */
		public FloatBuffer maxDimensions() { return YGStyle.nmaxDimensions(address()); }
		/** Returns the value at the specified index of the {@code maxDimensions} field. */
		public float maxDimensions(int index) { return YGStyle.nmaxDimensions(address(), index); }
		/** Returns the value of the {@code aspectRatio} field. */
		public float aspectRatio() { return YGStyle.naspectRatio(address()); }

	}

}