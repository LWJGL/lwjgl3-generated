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
 * <pre><code>struct YGLayout {
    float positions[4];
    float dimensions[2];
    YGDirection direction;
    uint32_t computedFlexBasisGeneration;
    float computedFlexBasis;
    uint32_t generationCount;
    YGDirection lastParentDirection;
    uint32_t nextCachedMeasurementsIndex;
    {@link YGCachedMeasurement YGCachedMeasurement} cachedMeasurements[16];
    float measuredDimensions[2];
    {@link YGCachedMeasurement YGCachedMeasurement} cachedLayout;
}</code></pre>
 */
public class YGLayout extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		POSITIONS,
		DIMENSIONS,
		DIRECTION,
		COMPUTEDFLEXBASISGENERATION,
		COMPUTEDFLEXBASIS,
		GENERATIONCOUNT,
		LASTPARENTDIRECTION,
		NEXTCACHEDMEASUREMENTSINDEX,
		CACHEDMEASUREMENTS,
		MEASUREDDIMENSIONS,
		CACHEDLAYOUT;

	static {
		Layout layout = __struct(
			__array(4, 4),
			__array(4, 2),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__array(YGCachedMeasurement.SIZEOF, YGCachedMeasurement.ALIGNOF, 16),
			__array(4, 2),
			__member(YGCachedMeasurement.SIZEOF, YGCachedMeasurement.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		POSITIONS = layout.offsetof(0);
		DIMENSIONS = layout.offsetof(1);
		DIRECTION = layout.offsetof(2);
		COMPUTEDFLEXBASISGENERATION = layout.offsetof(3);
		COMPUTEDFLEXBASIS = layout.offsetof(4);
		GENERATIONCOUNT = layout.offsetof(5);
		LASTPARENTDIRECTION = layout.offsetof(6);
		NEXTCACHEDMEASUREMENTSINDEX = layout.offsetof(7);
		CACHEDMEASUREMENTS = layout.offsetof(8);
		MEASUREDDIMENSIONS = layout.offsetof(9);
		CACHEDLAYOUT = layout.offsetof(10);
	}

	YGLayout(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link YGLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public YGLayout(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link FloatBuffer} view of the {@code positions} field. */
	public FloatBuffer positions() { return npositions(address()); }
	/** Returns the value at the specified index of the {@code positions} field. */
	public float positions(int index) { return npositions(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code dimensions} field. */
	public FloatBuffer dimensions() { return ndimensions(address()); }
	/** Returns the value at the specified index of the {@code dimensions} field. */
	public float dimensions(int index) { return ndimensions(address(), index); }
	/** Returns the value of the {@code direction} field. */
	public int direction() { return ndirection(address()); }
	/** Returns the value of the {@code computedFlexBasisGeneration} field. */
	public int computedFlexBasisGeneration() { return ncomputedFlexBasisGeneration(address()); }
	/** Returns the value of the {@code computedFlexBasis} field. */
	public float computedFlexBasis() { return ncomputedFlexBasis(address()); }
	/** Returns the value of the {@code generationCount} field. */
	public int generationCount() { return ngenerationCount(address()); }
	/** Returns the value of the {@code lastParentDirection} field. */
	public int lastParentDirection() { return nlastParentDirection(address()); }
	/** Returns the value of the {@code nextCachedMeasurementsIndex} field. */
	public int nextCachedMeasurementsIndex() { return nnextCachedMeasurementsIndex(address()); }
	/** Returns a {@link YGCachedMeasurement}.Buffer view of the {@code cachedMeasurements} field. */
	public YGCachedMeasurement.Buffer cachedMeasurements() { return ncachedMeasurements(address()); }
	/** Returns a {@link YGCachedMeasurement} view of the struct at the specified index of the {@code cachedMeasurements} field. */
	public YGCachedMeasurement cachedMeasurements(int index) { return ncachedMeasurements(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code measuredDimensions} field. */
	public FloatBuffer measuredDimensions() { return nmeasuredDimensions(address()); }
	/** Returns the value at the specified index of the {@code measuredDimensions} field. */
	public float measuredDimensions(int index) { return nmeasuredDimensions(address(), index); }
	/** Returns a {@link YGCachedMeasurement} view of the {@code cachedLayout} field. */
	public YGCachedMeasurement cachedLayout() { return ncachedLayout(address()); }

	// -----------------------------------

	/** Returns a new {@link YGLayout} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static YGLayout create(long address) {
		return address == NULL ? null : new YGLayout(address, null);
	}

	/**
	 * Create a {@link YGLayout.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #positions}. */
	public static FloatBuffer npositions(long struct) { return memFloatBuffer(struct + YGLayout.POSITIONS, 4); }
	/** Unsafe version of {@link #positions(int) positions}. */
	public static float npositions(long struct, int index) {
		if ( CHECKS ) check(index, 4);
		return memGetFloat(struct + YGLayout.POSITIONS + index * 4);
	}
	/** Unsafe version of {@link #dimensions}. */
	public static FloatBuffer ndimensions(long struct) { return memFloatBuffer(struct + YGLayout.DIMENSIONS, 2); }
	/** Unsafe version of {@link #dimensions(int) dimensions}. */
	public static float ndimensions(long struct, int index) {
		if ( CHECKS ) check(index, 2);
		return memGetFloat(struct + YGLayout.DIMENSIONS + index * 4);
	}
	/** Unsafe version of {@link #direction}. */
	public static int ndirection(long struct) { return memGetInt(struct + YGLayout.DIRECTION); }
	/** Unsafe version of {@link #computedFlexBasisGeneration}. */
	public static int ncomputedFlexBasisGeneration(long struct) { return memGetInt(struct + YGLayout.COMPUTEDFLEXBASISGENERATION); }
	/** Unsafe version of {@link #computedFlexBasis}. */
	public static float ncomputedFlexBasis(long struct) { return memGetFloat(struct + YGLayout.COMPUTEDFLEXBASIS); }
	/** Unsafe version of {@link #generationCount}. */
	public static int ngenerationCount(long struct) { return memGetInt(struct + YGLayout.GENERATIONCOUNT); }
	/** Unsafe version of {@link #lastParentDirection}. */
	public static int nlastParentDirection(long struct) { return memGetInt(struct + YGLayout.LASTPARENTDIRECTION); }
	/** Unsafe version of {@link #nextCachedMeasurementsIndex}. */
	public static int nnextCachedMeasurementsIndex(long struct) { return memGetInt(struct + YGLayout.NEXTCACHEDMEASUREMENTSINDEX); }
	/** Unsafe version of {@link #cachedMeasurements}. */
	public static YGCachedMeasurement.Buffer ncachedMeasurements(long struct) { return YGCachedMeasurement.create(struct + YGLayout.CACHEDMEASUREMENTS, 16); }
	/** Unsafe version of {@link #cachedMeasurements(int) cachedMeasurements}. */
	public static YGCachedMeasurement ncachedMeasurements(long struct, int index) {
		if ( CHECKS ) check(index, 16);
		return YGCachedMeasurement.create(struct + YGLayout.CACHEDMEASUREMENTS + index * YGCachedMeasurement.SIZEOF);
	}
	/** Unsafe version of {@link #measuredDimensions}. */
	public static FloatBuffer nmeasuredDimensions(long struct) { return memFloatBuffer(struct + YGLayout.MEASUREDDIMENSIONS, 2); }
	/** Unsafe version of {@link #measuredDimensions(int) measuredDimensions}. */
	public static float nmeasuredDimensions(long struct, int index) {
		if ( CHECKS ) check(index, 2);
		return memGetFloat(struct + YGLayout.MEASUREDDIMENSIONS + index * 4);
	}
	/** Unsafe version of {@link #cachedLayout}. */
	public static YGCachedMeasurement ncachedLayout(long struct) { return YGCachedMeasurement.create(struct + YGLayout.CACHEDLAYOUT); }

	// -----------------------------------

	/** An array of {@link YGLayout} structs. */
	public static class Buffer extends StructBuffer<YGLayout, Buffer> {

		/**
		 * Creates a new {@link YGLayout.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link YGLayout#SIZEOF}, and its mark will be undefined.
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
		protected YGLayout newInstance(long address) {
			return new YGLayout(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link FloatBuffer} view of the {@code positions} field. */
		public FloatBuffer positions() { return YGLayout.npositions(address()); }
		/** Returns the value at the specified index of the {@code positions} field. */
		public float positions(int index) { return YGLayout.npositions(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code dimensions} field. */
		public FloatBuffer dimensions() { return YGLayout.ndimensions(address()); }
		/** Returns the value at the specified index of the {@code dimensions} field. */
		public float dimensions(int index) { return YGLayout.ndimensions(address(), index); }
		/** Returns the value of the {@code direction} field. */
		public int direction() { return YGLayout.ndirection(address()); }
		/** Returns the value of the {@code computedFlexBasisGeneration} field. */
		public int computedFlexBasisGeneration() { return YGLayout.ncomputedFlexBasisGeneration(address()); }
		/** Returns the value of the {@code computedFlexBasis} field. */
		public float computedFlexBasis() { return YGLayout.ncomputedFlexBasis(address()); }
		/** Returns the value of the {@code generationCount} field. */
		public int generationCount() { return YGLayout.ngenerationCount(address()); }
		/** Returns the value of the {@code lastParentDirection} field. */
		public int lastParentDirection() { return YGLayout.nlastParentDirection(address()); }
		/** Returns the value of the {@code nextCachedMeasurementsIndex} field. */
		public int nextCachedMeasurementsIndex() { return YGLayout.nnextCachedMeasurementsIndex(address()); }
		/** Returns a {@link YGCachedMeasurement}.Buffer view of the {@code cachedMeasurements} field. */
		public YGCachedMeasurement.Buffer cachedMeasurements() { return YGLayout.ncachedMeasurements(address()); }
		/** Returns a {@link YGCachedMeasurement} view of the struct at the specified index of the {@code cachedMeasurements} field. */
		public YGCachedMeasurement cachedMeasurements(int index) { return YGLayout.ncachedMeasurements(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code measuredDimensions} field. */
		public FloatBuffer measuredDimensions() { return YGLayout.nmeasuredDimensions(address()); }
		/** Returns the value at the specified index of the {@code measuredDimensions} field. */
		public float measuredDimensions(int index) { return YGLayout.nmeasuredDimensions(address(), index); }
		/** Returns a {@link YGCachedMeasurement} view of the {@code cachedLayout} field. */
		public YGCachedMeasurement cachedLayout() { return YGLayout.ncachedLayout(address()); }

	}

}