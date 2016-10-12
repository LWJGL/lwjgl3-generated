/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_style_progress {
    {@link NkStyleItem struct nk_style_item} normal;
    {@link NkStyleItem struct nk_style_item} hover;
    {@link NkStyleItem struct nk_style_item} active;
    {@link NkColor struct nk_color} border_color;
    {@link NkStyleItem struct nk_style_item} cursor_normal;
    {@link NkStyleItem struct nk_style_item} cursor_hover;
    {@link NkStyleItem struct nk_style_item} cursor_active;
    {@link NkColor struct nk_color} cursor_border_color;
    float rounding;
    float border;
    float cursor_border;
    float cursor_rounding;
    {@link NkVec2 struct nk_vec2} padding;
    {@link NkHandle nk_handle} userdata;
    nk_draw_begin draw_begin;
    nk_draw_end draw_end;
}</code></pre>
 */
public class NkStyleProgress extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NORMAL,
		HOVER,
		ACTIVE,
		BORDER_COLOR,
		CURSOR_NORMAL,
		CURSOR_HOVER,
		CURSOR_ACTIVE,
		CURSOR_BORDER_COLOR,
		ROUNDING,
		BORDER,
		CURSOR_BORDER,
		CURSOR_ROUNDING,
		PADDING,
		USERDATA,
		DRAW_BEGIN,
		DRAW_END;

	static {
		Layout layout = __struct(
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NORMAL = layout.offsetof(0);
		HOVER = layout.offsetof(1);
		ACTIVE = layout.offsetof(2);
		BORDER_COLOR = layout.offsetof(3);
		CURSOR_NORMAL = layout.offsetof(4);
		CURSOR_HOVER = layout.offsetof(5);
		CURSOR_ACTIVE = layout.offsetof(6);
		CURSOR_BORDER_COLOR = layout.offsetof(7);
		ROUNDING = layout.offsetof(8);
		BORDER = layout.offsetof(9);
		CURSOR_BORDER = layout.offsetof(10);
		CURSOR_ROUNDING = layout.offsetof(11);
		PADDING = layout.offsetof(12);
		USERDATA = layout.offsetof(13);
		DRAW_BEGIN = layout.offsetof(14);
		DRAW_END = layout.offsetof(15);
	}

	NkStyleProgress(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStyleProgress} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStyleProgress(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkStyleItem} view of the {@code normal} field. */
	public NkStyleItem normal() { return nnormal(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code hover} field. */
	public NkStyleItem hover() { return nhover(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code active} field. */
	public NkStyleItem active() { return nactive(address()); }
	/** Returns a {@link NkColor} view of the {@code border_color} field. */
	public NkColor border_color() { return nborder_color(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code cursor_normal} field. */
	public NkStyleItem cursor_normal() { return ncursor_normal(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code cursor_hover} field. */
	public NkStyleItem cursor_hover() { return ncursor_hover(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code cursor_active} field. */
	public NkStyleItem cursor_active() { return ncursor_active(address()); }
	/** Returns a {@link NkColor} view of the {@code cursor_border_color} field. */
	public NkColor cursor_border_color() { return ncursor_border_color(address()); }
	/** Returns the value of the {@code rounding} field. */
	public float rounding() { return nrounding(address()); }
	/** Returns the value of the {@code border} field. */
	public float border() { return nborder(address()); }
	/** Returns the value of the {@code cursor_border} field. */
	public float cursor_border() { return ncursor_border(address()); }
	/** Returns the value of the {@code cursor_rounding} field. */
	public float cursor_rounding() { return ncursor_rounding(address()); }
	/** Returns a {@link NkVec2} view of the {@code padding} field. */
	public NkVec2 padding() { return npadding(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns the {@code NkDrawBeginCallback} instance at the {@code draw_begin} field. */
	public NkDrawBeginCallback draw_begin() { return NkDrawBeginCallback.create(ndraw_begin(address())); }
	/** Returns the {@code NkDrawEndCallback} instance at the {@code draw_end} field. */
	public NkDrawEndCallback draw_end() { return NkDrawEndCallback.create(ndraw_end(address())); }

	/** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
	public NkStyleProgress normal(NkStyleItem value) { nnormal(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
	public NkStyleProgress hover(NkStyleItem value) { nhover(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code active} field. */
	public NkStyleProgress active(NkStyleItem value) { nactive(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code border_color} field. */
	public NkStyleProgress border_color(NkColor value) { nborder_color(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
	public NkStyleProgress cursor_normal(NkStyleItem value) { ncursor_normal(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
	public NkStyleProgress cursor_hover(NkStyleItem value) { ncursor_hover(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code cursor_active} field. */
	public NkStyleProgress cursor_active(NkStyleItem value) { ncursor_active(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code cursor_border_color} field. */
	public NkStyleProgress cursor_border_color(NkColor value) { ncursor_border_color(address(), value); return this; }
	/** Sets the specified value to the {@code rounding} field. */
	public NkStyleProgress rounding(float value) { nrounding(address(), value); return this; }
	/** Sets the specified value to the {@code border} field. */
	public NkStyleProgress border(float value) { nborder(address(), value); return this; }
	/** Sets the specified value to the {@code cursor_border} field. */
	public NkStyleProgress cursor_border(float value) { ncursor_border(address(), value); return this; }
	/** Sets the specified value to the {@code cursor_rounding} field. */
	public NkStyleProgress cursor_rounding(float value) { ncursor_rounding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code padding} field. */
	public NkStyleProgress padding(NkVec2 value) { npadding(address(), value); return this; }
	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkStyleProgress userdata(NkHandle value) { nuserdata(address(), value); return this; }
	/** Sets the address of the specified {@link NkDrawBeginCallbackI} to the {@code draw_begin} field. */
	public NkStyleProgress draw_begin(NkDrawBeginCallbackI value) { ndraw_begin(address(), addressSafe(value)); return this; }
	/** Sets the address of the specified {@link NkDrawEndCallbackI} to the {@code draw_end} field. */
	public NkStyleProgress draw_end(NkDrawEndCallbackI value) { ndraw_end(address(), addressSafe(value)); return this; }

	/** Unsafe version of {@link #set(NkStyleProgress) set}. */
	public NkStyleProgress nset(long struct) {
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
	public NkStyleProgress set(NkStyleProgress src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleProgress} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStyleProgress malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStyleProgress} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStyleProgress calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStyleProgress} instance allocated with {@link BufferUtils}. */
	public static NkStyleProgress create() {
		return new NkStyleProgress(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStyleProgress} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStyleProgress create(long address) {
		return address == NULL ? null : new NkStyleProgress(address, null);
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStyleProgress.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleProgress} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStyleProgress mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStyleProgress} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStyleProgress callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStyleProgress} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleProgress mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleProgress} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleProgress callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleProgress.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #normal}. */
	public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleProgress.NORMAL); }
	/** Unsafe version of {@link #hover}. */
	public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleProgress.HOVER); }
	/** Unsafe version of {@link #active}. */
	public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleProgress.ACTIVE); }
	/** Unsafe version of {@link #border_color}. */
	public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleProgress.BORDER_COLOR); }
	/** Unsafe version of {@link #cursor_normal}. */
	public static NkStyleItem ncursor_normal(long struct) { return NkStyleItem.create(struct + NkStyleProgress.CURSOR_NORMAL); }
	/** Unsafe version of {@link #cursor_hover}. */
	public static NkStyleItem ncursor_hover(long struct) { return NkStyleItem.create(struct + NkStyleProgress.CURSOR_HOVER); }
	/** Unsafe version of {@link #cursor_active}. */
	public static NkStyleItem ncursor_active(long struct) { return NkStyleItem.create(struct + NkStyleProgress.CURSOR_ACTIVE); }
	/** Unsafe version of {@link #cursor_border_color}. */
	public static NkColor ncursor_border_color(long struct) { return NkColor.create(struct + NkStyleProgress.CURSOR_BORDER_COLOR); }
	/** Unsafe version of {@link #rounding}. */
	public static float nrounding(long struct) { return memGetFloat(struct + NkStyleProgress.ROUNDING); }
	/** Unsafe version of {@link #border}. */
	public static float nborder(long struct) { return memGetFloat(struct + NkStyleProgress.BORDER); }
	/** Unsafe version of {@link #cursor_border}. */
	public static float ncursor_border(long struct) { return memGetFloat(struct + NkStyleProgress.CURSOR_BORDER); }
	/** Unsafe version of {@link #cursor_rounding}. */
	public static float ncursor_rounding(long struct) { return memGetFloat(struct + NkStyleProgress.CURSOR_ROUNDING); }
	/** Unsafe version of {@link #padding}. */
	public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleProgress.PADDING); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleProgress.USERDATA); }
	/** Unsafe version of {@link #draw_begin}. */
	public static long ndraw_begin(long struct) { return memGetAddress(struct + NkStyleProgress.DRAW_BEGIN); }
	/** Unsafe version of {@link #draw_end}. */
	public static long ndraw_end(long struct) { return memGetAddress(struct + NkStyleProgress.DRAW_END); }

	/** Unsafe version of {@link #normal(NkStyleItem) normal}. */
	public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProgress.NORMAL, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #hover(NkStyleItem) hover}. */
	public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProgress.HOVER, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #active(NkStyleItem) active}. */
	public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProgress.ACTIVE, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #border_color(NkColor) border_color}. */
	public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProgress.BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #cursor_normal(NkStyleItem) cursor_normal}. */
	public static void ncursor_normal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProgress.CURSOR_NORMAL, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #cursor_hover(NkStyleItem) cursor_hover}. */
	public static void ncursor_hover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProgress.CURSOR_HOVER, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #cursor_active(NkStyleItem) cursor_active}. */
	public static void ncursor_active(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProgress.CURSOR_ACTIVE, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #cursor_border_color(NkColor) cursor_border_color}. */
	public static void ncursor_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProgress.CURSOR_BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #rounding(float) rounding}. */
	public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleProgress.ROUNDING, value); }
	/** Unsafe version of {@link #border(float) border}. */
	public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleProgress.BORDER, value); }
	/** Unsafe version of {@link #cursor_border(float) cursor_border}. */
	public static void ncursor_border(long struct, float value) { memPutFloat(struct + NkStyleProgress.CURSOR_BORDER, value); }
	/** Unsafe version of {@link #cursor_rounding(float) cursor_rounding}. */
	public static void ncursor_rounding(long struct, float value) { memPutFloat(struct + NkStyleProgress.CURSOR_ROUNDING, value); }
	/** Unsafe version of {@link #padding(NkVec2) padding}. */
	public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleProgress.PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleProgress.USERDATA, NkHandle.SIZEOF); }
	/** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
	public static void ndraw_begin(long struct, long value) { memPutAddress(struct + NkStyleProgress.DRAW_BEGIN, value); }
	/** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
	public static void ndraw_end(long struct, long value) { memPutAddress(struct + NkStyleProgress.DRAW_END, value); }

	// -----------------------------------

	/** An array of {@link NkStyleProgress} structs. */
	public static class Buffer extends StructBuffer<NkStyleProgress, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkStyleProgress.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStyleProgress#SIZEOF}, and its mark will be undefined.
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
		protected NkStyleProgress newInstance(long address) {
			return new NkStyleProgress(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkStyleItem} view of the {@code normal} field. */
		public NkStyleItem normal() { return NkStyleProgress.nnormal(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code hover} field. */
		public NkStyleItem hover() { return NkStyleProgress.nhover(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code active} field. */
		public NkStyleItem active() { return NkStyleProgress.nactive(address()); }
		/** Returns a {@link NkColor} view of the {@code border_color} field. */
		public NkColor border_color() { return NkStyleProgress.nborder_color(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code cursor_normal} field. */
		public NkStyleItem cursor_normal() { return NkStyleProgress.ncursor_normal(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code cursor_hover} field. */
		public NkStyleItem cursor_hover() { return NkStyleProgress.ncursor_hover(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code cursor_active} field. */
		public NkStyleItem cursor_active() { return NkStyleProgress.ncursor_active(address()); }
		/** Returns a {@link NkColor} view of the {@code cursor_border_color} field. */
		public NkColor cursor_border_color() { return NkStyleProgress.ncursor_border_color(address()); }
		/** Returns the value of the {@code rounding} field. */
		public float rounding() { return NkStyleProgress.nrounding(address()); }
		/** Returns the value of the {@code border} field. */
		public float border() { return NkStyleProgress.nborder(address()); }
		/** Returns the value of the {@code cursor_border} field. */
		public float cursor_border() { return NkStyleProgress.ncursor_border(address()); }
		/** Returns the value of the {@code cursor_rounding} field. */
		public float cursor_rounding() { return NkStyleProgress.ncursor_rounding(address()); }
		/** Returns a {@link NkVec2} view of the {@code padding} field. */
		public NkVec2 padding() { return NkStyleProgress.npadding(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkStyleProgress.nuserdata(address()); }
		/** Returns the {@code NkDrawBeginCallback} instance at the {@code draw_begin} field. */
		public NkDrawBeginCallback draw_begin() { return NkDrawBeginCallback.create(NkStyleProgress.ndraw_begin(address())); }
		/** Returns the {@code NkDrawEndCallback} instance at the {@code draw_end} field. */
		public NkDrawEndCallback draw_end() { return NkDrawEndCallback.create(NkStyleProgress.ndraw_end(address())); }

		/** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
		public NkStyleProgress.Buffer normal(NkStyleItem value) { NkStyleProgress.nnormal(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
		public NkStyleProgress.Buffer hover(NkStyleItem value) { NkStyleProgress.nhover(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code active} field. */
		public NkStyleProgress.Buffer active(NkStyleItem value) { NkStyleProgress.nactive(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code border_color} field. */
		public NkStyleProgress.Buffer border_color(NkColor value) { NkStyleProgress.nborder_color(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
		public NkStyleProgress.Buffer cursor_normal(NkStyleItem value) { NkStyleProgress.ncursor_normal(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
		public NkStyleProgress.Buffer cursor_hover(NkStyleItem value) { NkStyleProgress.ncursor_hover(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code cursor_active} field. */
		public NkStyleProgress.Buffer cursor_active(NkStyleItem value) { NkStyleProgress.ncursor_active(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code cursor_border_color} field. */
		public NkStyleProgress.Buffer cursor_border_color(NkColor value) { NkStyleProgress.ncursor_border_color(address(), value); return this; }
		/** Sets the specified value to the {@code rounding} field. */
		public NkStyleProgress.Buffer rounding(float value) { NkStyleProgress.nrounding(address(), value); return this; }
		/** Sets the specified value to the {@code border} field. */
		public NkStyleProgress.Buffer border(float value) { NkStyleProgress.nborder(address(), value); return this; }
		/** Sets the specified value to the {@code cursor_border} field. */
		public NkStyleProgress.Buffer cursor_border(float value) { NkStyleProgress.ncursor_border(address(), value); return this; }
		/** Sets the specified value to the {@code cursor_rounding} field. */
		public NkStyleProgress.Buffer cursor_rounding(float value) { NkStyleProgress.ncursor_rounding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code padding} field. */
		public NkStyleProgress.Buffer padding(NkVec2 value) { NkStyleProgress.npadding(address(), value); return this; }
		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkStyleProgress.Buffer userdata(NkHandle value) { NkStyleProgress.nuserdata(address(), value); return this; }
		/** Sets the address of the specified {@link NkDrawBeginCallbackI} to the {@code draw_begin} field. */
		public NkStyleProgress.Buffer draw_begin(NkDrawBeginCallbackI value) { NkStyleProgress.ndraw_begin(address(), addressSafe(value)); return this; }
		/** Sets the address of the specified {@link NkDrawEndCallbackI} to the {@code draw_end} field. */
		public NkStyleProgress.Buffer draw_end(NkDrawEndCallbackI value) { NkStyleProgress.ndraw_end(address(), addressSafe(value)); return this; }

	}

}