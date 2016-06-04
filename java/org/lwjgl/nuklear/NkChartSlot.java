/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_chart_slot {
    nk_chart_type type;
    {@link NkColor struct nk_color} color;
    {@link NkColor struct nk_color} highlight;
    float min;
    float max;
    float range;
    int count;
    {@link NkVec2 struct nk_vec2} last;
    int index;
}</code></pre>
 */
public class NkChartSlot extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		COLOR,
		HIGHLIGHT,
		MIN,
		MAX,
		RANGE,
		COUNT,
		LAST,
		INDEX;

	static {
		Layout layout = __struct(
			__member(4),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TYPE = layout.offsetof(0);
		COLOR = layout.offsetof(1);
		HIGHLIGHT = layout.offsetof(2);
		MIN = layout.offsetof(3);
		MAX = layout.offsetof(4);
		RANGE = layout.offsetof(5);
		COUNT = layout.offsetof(6);
		LAST = layout.offsetof(7);
		INDEX = layout.offsetof(8);
	}

	NkChartSlot(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkChartSlot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkChartSlot(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns a {@link NkColor} view of the {@code color} field. */
	public NkColor color() { return ncolor(address()); }
	/** Returns a {@link NkColor} view of the {@code highlight} field. */
	public NkColor highlight() { return nhighlight(address()); }
	/** Returns the value of the {@code min} field. */
	public float min() { return nmin(address()); }
	/** Returns the value of the {@code max} field. */
	public float max() { return nmax(address()); }
	/** Returns the value of the {@code range} field. */
	public float range() { return nrange(address()); }
	/** Returns the value of the {@code count} field. */
	public int count() { return ncount(address()); }
	/** Returns a {@link NkVec2} view of the {@code last} field. */
	public NkVec2 last() { return nlast(address()); }
	/** Returns the value of the {@code index} field. */
	public int index() { return nindex(address()); }

	/** Sets the specified value to the {@code type} field. */
	public NkChartSlot type(int value) { ntype(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code color} field. */
	public NkChartSlot color(NkColor value) { ncolor(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code highlight} field. */
	public NkChartSlot highlight(NkColor value) { nhighlight(address(), value); return this; }
	/** Sets the specified value to the {@code min} field. */
	public NkChartSlot min(float value) { nmin(address(), value); return this; }
	/** Sets the specified value to the {@code max} field. */
	public NkChartSlot max(float value) { nmax(address(), value); return this; }
	/** Sets the specified value to the {@code range} field. */
	public NkChartSlot range(float value) { nrange(address(), value); return this; }
	/** Sets the specified value to the {@code count} field. */
	public NkChartSlot count(int value) { ncount(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code last} field. */
	public NkChartSlot last(NkVec2 value) { nlast(address(), value); return this; }
	/** Sets the specified value to the {@code index} field. */
	public NkChartSlot index(int value) { nindex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkChartSlot set(
		int type,
		NkColor color,
		NkColor highlight,
		float min,
		float max,
		float range,
		int count,
		NkVec2 last,
		int index
	) {
		type(type);
		color(color);
		highlight(highlight);
		min(min);
		max(max);
		range(range);
		count(count);
		last(last);
		index(index);

		return this;
	}

	/** Unsafe version of {@link #set(NkChartSlot) set}. */
	public NkChartSlot nset(long struct) {
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
	public NkChartSlot set(NkChartSlot src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkChartSlot} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkChartSlot malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkChartSlot} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkChartSlot calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkChartSlot} instance allocated with {@link BufferUtils}. */
	public static NkChartSlot create() {
		return new NkChartSlot(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkChartSlot} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkChartSlot create(long address) {
		return address == NULL ? null : new NkChartSlot(address, null);
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkChartSlot.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkChartSlot} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkChartSlot mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkChartSlot} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkChartSlot callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkChartSlot} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkChartSlot mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkChartSlot} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkChartSlot callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkChartSlot.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkChartSlot.TYPE); }
	/** Unsafe version of {@link #color}. */
	public static NkColor ncolor(long struct) { return NkColor.create(struct + NkChartSlot.COLOR); }
	/** Unsafe version of {@link #highlight}. */
	public static NkColor nhighlight(long struct) { return NkColor.create(struct + NkChartSlot.HIGHLIGHT); }
	/** Unsafe version of {@link #min}. */
	public static float nmin(long struct) { return memGetFloat(struct + NkChartSlot.MIN); }
	/** Unsafe version of {@link #max}. */
	public static float nmax(long struct) { return memGetFloat(struct + NkChartSlot.MAX); }
	/** Unsafe version of {@link #range}. */
	public static float nrange(long struct) { return memGetFloat(struct + NkChartSlot.RANGE); }
	/** Unsafe version of {@link #count}. */
	public static int ncount(long struct) { return memGetInt(struct + NkChartSlot.COUNT); }
	/** Unsafe version of {@link #last}. */
	public static NkVec2 nlast(long struct) { return NkVec2.create(struct + NkChartSlot.LAST); }
	/** Unsafe version of {@link #index}. */
	public static int nindex(long struct) { return memGetInt(struct + NkChartSlot.INDEX); }

	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + NkChartSlot.TYPE, value); }
	/** Unsafe version of {@link #color(NkColor) color}. */
	public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkChartSlot.COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #highlight(NkColor) highlight}. */
	public static void nhighlight(long struct, NkColor value) { memCopy(value.address(), struct + NkChartSlot.HIGHLIGHT, NkColor.SIZEOF); }
	/** Unsafe version of {@link #min(float) min}. */
	public static void nmin(long struct, float value) { memPutFloat(struct + NkChartSlot.MIN, value); }
	/** Unsafe version of {@link #max(float) max}. */
	public static void nmax(long struct, float value) { memPutFloat(struct + NkChartSlot.MAX, value); }
	/** Unsafe version of {@link #range(float) range}. */
	public static void nrange(long struct, float value) { memPutFloat(struct + NkChartSlot.RANGE, value); }
	/** Unsafe version of {@link #count(int) count}. */
	public static void ncount(long struct, int value) { memPutInt(struct + NkChartSlot.COUNT, value); }
	/** Unsafe version of {@link #last(NkVec2) last}. */
	public static void nlast(long struct, NkVec2 value) { memCopy(value.address(), struct + NkChartSlot.LAST, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #index(int) index}. */
	public static void nindex(long struct, int value) { memPutInt(struct + NkChartSlot.INDEX, value); }

	// -----------------------------------

	/** An array of {@link NkChartSlot} structs. */
	public static final class Buffer extends StructBuffer<NkChartSlot, Buffer> {

		/**
		 * Creates a new {@link NkChartSlot.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkChartSlot#SIZEOF}, and its mark will be undefined.
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
		protected NkChartSlot newInstance(long address) {
			return new NkChartSlot(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code type} field. */
		public int type() { return NkChartSlot.ntype(address()); }
		/** Returns a {@link NkColor} view of the {@code color} field. */
		public NkColor color() { return NkChartSlot.ncolor(address()); }
		/** Returns a {@link NkColor} view of the {@code highlight} field. */
		public NkColor highlight() { return NkChartSlot.nhighlight(address()); }
		/** Returns the value of the {@code min} field. */
		public float min() { return NkChartSlot.nmin(address()); }
		/** Returns the value of the {@code max} field. */
		public float max() { return NkChartSlot.nmax(address()); }
		/** Returns the value of the {@code range} field. */
		public float range() { return NkChartSlot.nrange(address()); }
		/** Returns the value of the {@code count} field. */
		public int count() { return NkChartSlot.ncount(address()); }
		/** Returns a {@link NkVec2} view of the {@code last} field. */
		public NkVec2 last() { return NkChartSlot.nlast(address()); }
		/** Returns the value of the {@code index} field. */
		public int index() { return NkChartSlot.nindex(address()); }

		/** Sets the specified value to the {@code type} field. */
		public NkChartSlot.Buffer type(int value) { NkChartSlot.ntype(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code color} field. */
		public NkChartSlot.Buffer color(NkColor value) { NkChartSlot.ncolor(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code highlight} field. */
		public NkChartSlot.Buffer highlight(NkColor value) { NkChartSlot.nhighlight(address(), value); return this; }
		/** Sets the specified value to the {@code min} field. */
		public NkChartSlot.Buffer min(float value) { NkChartSlot.nmin(address(), value); return this; }
		/** Sets the specified value to the {@code max} field. */
		public NkChartSlot.Buffer max(float value) { NkChartSlot.nmax(address(), value); return this; }
		/** Sets the specified value to the {@code range} field. */
		public NkChartSlot.Buffer range(float value) { NkChartSlot.nrange(address(), value); return this; }
		/** Sets the specified value to the {@code count} field. */
		public NkChartSlot.Buffer count(int value) { NkChartSlot.ncount(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code last} field. */
		public NkChartSlot.Buffer last(NkVec2 value) { NkChartSlot.nlast(address(), value); return this; }
		/** Sets the specified value to the {@code index} field. */
		public NkChartSlot.Buffer index(int value) { NkChartSlot.nindex(address(), value); return this; }

	}

}