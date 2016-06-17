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
 * <pre><code>struct nk_style_chart {
    {@link NkStyleItem struct nk_style_item} background;
    {@link NkColor struct nk_color} border_color;
    {@link NkColor struct nk_color} selected_color;
    {@link NkColor struct nk_color} color;
    float border;
    float rounding;
    {@link NkVec2 struct nk_vec2} padding;
}</code></pre>
 */
public class NkStyleChart extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BACKGROUND,
		BORDER_COLOR,
		SELECTED_COLOR,
		COLOR,
		BORDER,
		ROUNDING,
		PADDING;

	static {
		Layout layout = __struct(
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(4),
			__member(4),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BACKGROUND = layout.offsetof(0);
		BORDER_COLOR = layout.offsetof(1);
		SELECTED_COLOR = layout.offsetof(2);
		COLOR = layout.offsetof(3);
		BORDER = layout.offsetof(4);
		ROUNDING = layout.offsetof(5);
		PADDING = layout.offsetof(6);
	}

	NkStyleChart(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStyleChart} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStyleChart(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkStyleItem} view of the {@code background} field. */
	public NkStyleItem background() { return nbackground(address()); }
	/** Returns a {@link NkColor} view of the {@code border_color} field. */
	public NkColor border_color() { return nborder_color(address()); }
	/** Returns a {@link NkColor} view of the {@code selected_color} field. */
	public NkColor selected_color() { return nselected_color(address()); }
	/** Returns a {@link NkColor} view of the {@code color} field. */
	public NkColor color() { return ncolor(address()); }
	/** Returns the value of the {@code border} field. */
	public float border() { return nborder(address()); }
	/** Returns the value of the {@code rounding} field. */
	public float rounding() { return nrounding(address()); }
	/** Returns a {@link NkVec2} view of the {@code padding} field. */
	public NkVec2 padding() { return npadding(address()); }

	/** Copies the specified {@link NkStyleItem} to the {@code background} field. */
	public NkStyleChart background(NkStyleItem value) { nbackground(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code border_color} field. */
	public NkStyleChart border_color(NkColor value) { nborder_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code selected_color} field. */
	public NkStyleChart selected_color(NkColor value) { nselected_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code color} field. */
	public NkStyleChart color(NkColor value) { ncolor(address(), value); return this; }
	/** Sets the specified value to the {@code border} field. */
	public NkStyleChart border(float value) { nborder(address(), value); return this; }
	/** Sets the specified value to the {@code rounding} field. */
	public NkStyleChart rounding(float value) { nrounding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code padding} field. */
	public NkStyleChart padding(NkVec2 value) { npadding(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkStyleChart set(
		NkStyleItem background,
		NkColor border_color,
		NkColor selected_color,
		NkColor color,
		float border,
		float rounding,
		NkVec2 padding
	) {
		background(background);
		border_color(border_color);
		selected_color(selected_color);
		color(color);
		border(border);
		rounding(rounding);
		padding(padding);

		return this;
	}

	/** Unsafe version of {@link #set(NkStyleChart) set}. */
	public NkStyleChart nset(long struct) {
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
	public NkStyleChart set(NkStyleChart src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleChart} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStyleChart malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStyleChart} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStyleChart calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStyleChart} instance allocated with {@link BufferUtils}. */
	public static NkStyleChart create() {
		return new NkStyleChart(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStyleChart} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStyleChart create(long address) {
		return address == NULL ? null : new NkStyleChart(address, null);
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStyleChart.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleChart} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStyleChart mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStyleChart} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStyleChart callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStyleChart} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleChart mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleChart} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleChart callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleChart.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #background}. */
	public static NkStyleItem nbackground(long struct) { return NkStyleItem.create(struct + NkStyleChart.BACKGROUND); }
	/** Unsafe version of {@link #border_color}. */
	public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleChart.BORDER_COLOR); }
	/** Unsafe version of {@link #selected_color}. */
	public static NkColor nselected_color(long struct) { return NkColor.create(struct + NkStyleChart.SELECTED_COLOR); }
	/** Unsafe version of {@link #color}. */
	public static NkColor ncolor(long struct) { return NkColor.create(struct + NkStyleChart.COLOR); }
	/** Unsafe version of {@link #border}. */
	public static float nborder(long struct) { return memGetFloat(struct + NkStyleChart.BORDER); }
	/** Unsafe version of {@link #rounding}. */
	public static float nrounding(long struct) { return memGetFloat(struct + NkStyleChart.ROUNDING); }
	/** Unsafe version of {@link #padding}. */
	public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleChart.PADDING); }

	/** Unsafe version of {@link #background(NkStyleItem) background}. */
	public static void nbackground(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleChart.BACKGROUND, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #border_color(NkColor) border_color}. */
	public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #selected_color(NkColor) selected_color}. */
	public static void nselected_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.SELECTED_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #color(NkColor) color}. */
	public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #border(float) border}. */
	public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleChart.BORDER, value); }
	/** Unsafe version of {@link #rounding(float) rounding}. */
	public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleChart.ROUNDING, value); }
	/** Unsafe version of {@link #padding(NkVec2) padding}. */
	public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleChart.PADDING, NkVec2.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkStyleChart} structs. */
	public static final class Buffer extends StructBuffer<NkStyleChart, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkStyleChart.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStyleChart#SIZEOF}, and its mark will be undefined.
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
		protected NkStyleChart newInstance(long address) {
			return new NkStyleChart(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkStyleItem} view of the {@code background} field. */
		public NkStyleItem background() { return NkStyleChart.nbackground(address()); }
		/** Returns a {@link NkColor} view of the {@code border_color} field. */
		public NkColor border_color() { return NkStyleChart.nborder_color(address()); }
		/** Returns a {@link NkColor} view of the {@code selected_color} field. */
		public NkColor selected_color() { return NkStyleChart.nselected_color(address()); }
		/** Returns a {@link NkColor} view of the {@code color} field. */
		public NkColor color() { return NkStyleChart.ncolor(address()); }
		/** Returns the value of the {@code border} field. */
		public float border() { return NkStyleChart.nborder(address()); }
		/** Returns the value of the {@code rounding} field. */
		public float rounding() { return NkStyleChart.nrounding(address()); }
		/** Returns a {@link NkVec2} view of the {@code padding} field. */
		public NkVec2 padding() { return NkStyleChart.npadding(address()); }

		/** Copies the specified {@link NkStyleItem} to the {@code background} field. */
		public NkStyleChart.Buffer background(NkStyleItem value) { NkStyleChart.nbackground(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code border_color} field. */
		public NkStyleChart.Buffer border_color(NkColor value) { NkStyleChart.nborder_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code selected_color} field. */
		public NkStyleChart.Buffer selected_color(NkColor value) { NkStyleChart.nselected_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code color} field. */
		public NkStyleChart.Buffer color(NkColor value) { NkStyleChart.ncolor(address(), value); return this; }
		/** Sets the specified value to the {@code border} field. */
		public NkStyleChart.Buffer border(float value) { NkStyleChart.nborder(address(), value); return this; }
		/** Sets the specified value to the {@code rounding} field. */
		public NkStyleChart.Buffer rounding(float value) { NkStyleChart.nrounding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code padding} field. */
		public NkStyleChart.Buffer padding(NkVec2 value) { NkStyleChart.npadding(address(), value); return this; }

	}

}