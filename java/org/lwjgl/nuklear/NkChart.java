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
 * <pre><code>struct nk_chart {
    {@link NkChartSlot struct nk_chart_slot}[4] slots;
    int slot;
    float x;
    float y;
    float w;
    float h;
}</code></pre>
 */
public class NkChart extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SLOTS,
		SLOT,
		X,
		Y,
		W,
		H;

	static {
		Layout layout = __struct(
			__array(NkChartSlot.SIZEOF, NkChartSlot.ALIGNOF, 4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SLOTS = layout.offsetof(0);
		SLOT = layout.offsetof(1);
		X = layout.offsetof(2);
		Y = layout.offsetof(3);
		W = layout.offsetof(4);
		H = layout.offsetof(5);
	}

	NkChart(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkChart} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkChart(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkChartSlot}.Buffer view of the {@code slots} field. */
	public NkChartSlot.Buffer slots() { return nslots(address()); }
	/** Returns a {@link NkChartSlot} view of the struct at the specified index of the {@code slots} field. */
	public NkChartSlot slots(int index) { return nslots(address(), index); }
	/** Returns the value of the {@code slot} field. */
	public int slot() { return nslot(address()); }
	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public float y() { return ny(address()); }
	/** Returns the value of the {@code w} field. */
	public float w() { return nw(address()); }
	/** Returns the value of the {@code h} field. */
	public float h() { return nh(address()); }

	/** Copies the specified {@link NkChartSlot.Buffer} to the {@code slots} field. */
	public NkChart slots(NkChartSlot.Buffer value) { nslots(address(), value); return this; }
	/** Copies the specified {@link NkChartSlot} at the specified index of the {@code slots} field. */
	public NkChart slots(int index, NkChartSlot value) { nslots(address(), index, value); return this; }
	/** Sets the specified value to the {@code slot} field. */
	public NkChart slot(int value) { nslot(address(), value); return this; }
	/** Sets the specified value to the {@code x} field. */
	public NkChart x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public NkChart y(float value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code w} field. */
	public NkChart w(float value) { nw(address(), value); return this; }
	/** Sets the specified value to the {@code h} field. */
	public NkChart h(float value) { nh(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkChart set(
		NkChartSlot.Buffer slots,
		int slot,
		float x,
		float y,
		float w,
		float h
	) {
		slots(slots);
		slot(slot);
		x(x);
		y(y);
		w(w);
		h(h);

		return this;
	}

	/** Unsafe version of {@link #set(NkChart) set}. */
	public NkChart nset(long struct) {
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
	public NkChart set(NkChart src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkChart} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkChart malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkChart} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkChart calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkChart} instance allocated with {@link BufferUtils}. */
	public static NkChart create() {
		return new NkChart(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkChart} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkChart create(long address) {
		return address == NULL ? null : new NkChart(address, null);
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkChart.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkChart} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkChart mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkChart} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkChart callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkChart} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkChart mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkChart} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkChart callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkChart.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #slots}. */
	public static NkChartSlot.Buffer nslots(long struct) {
		return NkChartSlot.create(struct + NkChart.SLOTS, 4);
	}
	/** Unsafe version of {@link #slots(int) slots}. */
	public static NkChartSlot nslots(long struct, int index) {
		return NkChartSlot.create(struct + NkChart.SLOTS + index * NkChartSlot.SIZEOF);
	}
	/** Unsafe version of {@link #slot}. */
	public static int nslot(long struct) { return memGetInt(struct + NkChart.SLOT); }
	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + NkChart.X); }
	/** Unsafe version of {@link #y}. */
	public static float ny(long struct) { return memGetFloat(struct + NkChart.Y); }
	/** Unsafe version of {@link #w}. */
	public static float nw(long struct) { return memGetFloat(struct + NkChart.W); }
	/** Unsafe version of {@link #h}. */
	public static float nh(long struct) { return memGetFloat(struct + NkChart.H); }

	/** Unsafe version of {@link #slots(NkChartSlot.Buffer) slots}. */
	public static void nslots(long struct, NkChartSlot.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(value.address(), struct + NkChart.SLOTS, value.remaining() * NkChartSlot.SIZEOF);
	}
	/** Unsafe version of {@link #slots(int, NkChartSlot) slots}. */
	public static void nslots(long struct, int index, NkChartSlot value) { memCopy(value.address(), struct + NkChart.SLOTS + index * NkChartSlot.SIZEOF, NkChartSlot.SIZEOF); }
	/** Unsafe version of {@link #slot(int) slot}. */
	public static void nslot(long struct, int value) { memPutInt(struct + NkChart.SLOT, value); }
	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + NkChart.X, value); }
	/** Unsafe version of {@link #y(float) y}. */
	public static void ny(long struct, float value) { memPutFloat(struct + NkChart.Y, value); }
	/** Unsafe version of {@link #w(float) w}. */
	public static void nw(long struct, float value) { memPutFloat(struct + NkChart.W, value); }
	/** Unsafe version of {@link #h(float) h}. */
	public static void nh(long struct, float value) { memPutFloat(struct + NkChart.H, value); }

	// -----------------------------------

	/** An array of {@link NkChart} structs. */
	public static final class Buffer extends StructBuffer<NkChart, Buffer> {

		/**
		 * Creates a new {@link NkChart.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkChart#SIZEOF}, and its mark will be undefined.
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
		protected NkChart newInstance(long address) {
			return new NkChart(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkChartSlot}.Buffer view of the {@code slots} field. */
		public NkChartSlot.Buffer slots() { return NkChart.nslots(address()); }
		/** Returns a {@link NkChartSlot} view of the struct at the specified index of the {@code slots} field. */
		public NkChartSlot slots(int index) { return NkChart.nslots(address(), index); }
		/** Returns the value of the {@code slot} field. */
		public int slot() { return NkChart.nslot(address()); }
		/** Returns the value of the {@code x} field. */
		public float x() { return NkChart.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return NkChart.ny(address()); }
		/** Returns the value of the {@code w} field. */
		public float w() { return NkChart.nw(address()); }
		/** Returns the value of the {@code h} field. */
		public float h() { return NkChart.nh(address()); }

		/** Copies the specified {@link NkChartSlot.Buffer} to the {@code slots} field. */
		public NkChart.Buffer slots(NkChartSlot.Buffer value) { NkChart.nslots(address(), value); return this; }
		/** Copies the specified {@link NkChartSlot} at the specified index of the {@code slots} field. */
		public NkChart.Buffer slots(int index, NkChartSlot value) { NkChart.nslots(address(), index, value); return this; }
		/** Sets the specified value to the {@code slot} field. */
		public NkChart.Buffer slot(int value) { NkChart.nslot(address(), value); return this; }
		/** Sets the specified value to the {@code x} field. */
		public NkChart.Buffer x(float value) { NkChart.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public NkChart.Buffer y(float value) { NkChart.ny(address(), value); return this; }
		/** Sets the specified value to the {@code w} field. */
		public NkChart.Buffer w(float value) { NkChart.nw(address(), value); return this; }
		/** Sets the specified value to the {@code h} field. */
		public NkChart.Buffer h(float value) { NkChart.nh(address(), value); return this; }

	}

}