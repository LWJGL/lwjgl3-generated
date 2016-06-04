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
 * <pre><code>struct nk_panel {
    nk_flags flags;
    {@link NkRect struct nk_rect} bounds;
    struct nk_scroll * offset;
    float at_x;
    float at_y;
    float max_x;
    float width;
    float height;
    float footer_h;
    float header_h;
    float border;
    {@link NkRect struct nk_rect} clip;
    {@link NkMenuState struct nk_menu_state} menu;
    {@link NkRowLayout struct nk_row_layout} row;
    {@link NkChart struct nk_chart} chart;
    {@link NkPopupBuffer struct nk_popup_buffer} popup_buffer;
    struct nk_command_buffer * buffer;
    struct nk_panel * parent;
}</code></pre>
 */
public class NkPanel extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		BOUNDS,
		OFFSET,
		AT_X,
		AT_Y,
		MAX_X,
		WIDTH,
		HEIGHT,
		FOOTER_H,
		HEADER_H,
		BORDER,
		CLIP,
		MENU,
		ROW,
		CHART,
		POPUP_BUFFER,
		BUFFER,
		PARENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(NkMenuState.SIZEOF, NkMenuState.ALIGNOF),
			__member(NkRowLayout.SIZEOF, NkRowLayout.ALIGNOF),
			__member(NkChart.SIZEOF, NkChart.ALIGNOF),
			__member(NkPopupBuffer.SIZEOF, NkPopupBuffer.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FLAGS = layout.offsetof(0);
		BOUNDS = layout.offsetof(1);
		OFFSET = layout.offsetof(2);
		AT_X = layout.offsetof(3);
		AT_Y = layout.offsetof(4);
		MAX_X = layout.offsetof(5);
		WIDTH = layout.offsetof(6);
		HEIGHT = layout.offsetof(7);
		FOOTER_H = layout.offsetof(8);
		HEADER_H = layout.offsetof(9);
		BORDER = layout.offsetof(10);
		CLIP = layout.offsetof(11);
		MENU = layout.offsetof(12);
		ROW = layout.offsetof(13);
		CHART = layout.offsetof(14);
		POPUP_BUFFER = layout.offsetof(15);
		BUFFER = layout.offsetof(16);
		PARENT = layout.offsetof(17);
	}

	NkPanel(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkPanel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkPanel(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns a {@link NkRect} view of the {@code bounds} field. */
	public NkRect bounds() { return nbounds(address()); }
	/** Returns a {@link NkScroll} view of the struct pointed to by the {@code offset} field. */
	public NkScroll offset() { return noffset(address()); }
	/** Returns the value of the {@code at_x} field. */
	public float at_x() { return nat_x(address()); }
	/** Returns the value of the {@code at_y} field. */
	public float at_y() { return nat_y(address()); }
	/** Returns the value of the {@code max_x} field. */
	public float max_x() { return nmax_x(address()); }
	/** Returns the value of the {@code width} field. */
	public float width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public float height() { return nheight(address()); }
	/** Returns the value of the {@code footer_h} field. */
	public float footer_h() { return nfooter_h(address()); }
	/** Returns the value of the {@code header_h} field. */
	public float header_h() { return nheader_h(address()); }
	/** Returns the value of the {@code border} field. */
	public float border() { return nborder(address()); }
	/** Returns a {@link NkRect} view of the {@code clip} field. */
	public NkRect clip() { return nclip(address()); }
	/** Returns a {@link NkMenuState} view of the {@code menu} field. */
	public NkMenuState menu() { return nmenu(address()); }
	/** Returns a {@link NkRowLayout} view of the {@code row} field. */
	public NkRowLayout row() { return nrow(address()); }
	/** Returns a {@link NkChart} view of the {@code chart} field. */
	public NkChart chart() { return nchart(address()); }
	/** Returns a {@link NkPopupBuffer} view of the {@code popup_buffer} field. */
	public NkPopupBuffer popup_buffer() { return npopup_buffer(address()); }
	/** Returns a {@link NkCommandBuffer} view of the struct pointed to by the {@code buffer} field. */
	public NkCommandBuffer buffer() { return nbuffer(address()); }
	/** Returns a {@link NkPanel} view of the struct pointed to by the {@code parent} field. */
	public NkPanel parent() { return nparent(address()); }

	/** Sets the specified value to the {@code flags} field. */
	public NkPanel flags(int value) { nflags(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code bounds} field. */
	public NkPanel bounds(NkRect value) { nbounds(address(), value); return this; }
	/** Sets the address of the specified {@link NkScroll} to the {@code offset} field. */
	public NkPanel offset(NkScroll value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code at_x} field. */
	public NkPanel at_x(float value) { nat_x(address(), value); return this; }
	/** Sets the specified value to the {@code at_y} field. */
	public NkPanel at_y(float value) { nat_y(address(), value); return this; }
	/** Sets the specified value to the {@code max_x} field. */
	public NkPanel max_x(float value) { nmax_x(address(), value); return this; }
	/** Sets the specified value to the {@code width} field. */
	public NkPanel width(float value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public NkPanel height(float value) { nheight(address(), value); return this; }
	/** Sets the specified value to the {@code footer_h} field. */
	public NkPanel footer_h(float value) { nfooter_h(address(), value); return this; }
	/** Sets the specified value to the {@code header_h} field. */
	public NkPanel header_h(float value) { nheader_h(address(), value); return this; }
	/** Sets the specified value to the {@code border} field. */
	public NkPanel border(float value) { nborder(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code clip} field. */
	public NkPanel clip(NkRect value) { nclip(address(), value); return this; }
	/** Copies the specified {@link NkMenuState} to the {@code menu} field. */
	public NkPanel menu(NkMenuState value) { nmenu(address(), value); return this; }
	/** Copies the specified {@link NkRowLayout} to the {@code row} field. */
	public NkPanel row(NkRowLayout value) { nrow(address(), value); return this; }
	/** Copies the specified {@link NkChart} to the {@code chart} field. */
	public NkPanel chart(NkChart value) { nchart(address(), value); return this; }
	/** Copies the specified {@link NkPopupBuffer} to the {@code popup_buffer} field. */
	public NkPanel popup_buffer(NkPopupBuffer value) { npopup_buffer(address(), value); return this; }
	/** Sets the address of the specified {@link NkCommandBuffer} to the {@code buffer} field. */
	public NkPanel buffer(NkCommandBuffer value) { nbuffer(address(), value); return this; }
	/** Sets the address of the specified {@link NkPanel} to the {@code parent} field. */
	public NkPanel parent(NkPanel value) { nparent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkPanel set(
		int flags,
		NkRect bounds,
		NkScroll offset,
		float at_x,
		float at_y,
		float max_x,
		float width,
		float height,
		float footer_h,
		float header_h,
		float border,
		NkRect clip,
		NkMenuState menu,
		NkRowLayout row,
		NkChart chart,
		NkPopupBuffer popup_buffer,
		NkCommandBuffer buffer,
		NkPanel parent
	) {
		flags(flags);
		bounds(bounds);
		offset(offset);
		at_x(at_x);
		at_y(at_y);
		max_x(max_x);
		width(width);
		height(height);
		footer_h(footer_h);
		header_h(header_h);
		border(border);
		clip(clip);
		menu(menu);
		row(row);
		chart(chart);
		popup_buffer(popup_buffer);
		buffer(buffer);
		parent(parent);

		return this;
	}

	/** Unsafe version of {@link #set(NkPanel) set}. */
	public NkPanel nset(long struct) {
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
	public NkPanel set(NkPanel src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkPanel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkPanel malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkPanel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkPanel calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkPanel} instance allocated with {@link BufferUtils}. */
	public static NkPanel create() {
		return new NkPanel(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkPanel} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPanel create(long address) {
		return address == NULL ? null : new NkPanel(address, null);
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkPanel.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkPanel} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkPanel mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkPanel} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkPanel callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkPanel} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPanel mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPanel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPanel callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPanel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + NkPanel.FLAGS); }
	/** Unsafe version of {@link #bounds}. */
	public static NkRect nbounds(long struct) { return NkRect.create(struct + NkPanel.BOUNDS); }
	/** Unsafe version of {@link #offset}. */
	public static NkScroll noffset(long struct) { return NkScroll.create(memGetAddress(struct + NkPanel.OFFSET)); }
	/** Unsafe version of {@link #at_x}. */
	public static float nat_x(long struct) { return memGetFloat(struct + NkPanel.AT_X); }
	/** Unsafe version of {@link #at_y}. */
	public static float nat_y(long struct) { return memGetFloat(struct + NkPanel.AT_Y); }
	/** Unsafe version of {@link #max_x}. */
	public static float nmax_x(long struct) { return memGetFloat(struct + NkPanel.MAX_X); }
	/** Unsafe version of {@link #width}. */
	public static float nwidth(long struct) { return memGetFloat(struct + NkPanel.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static float nheight(long struct) { return memGetFloat(struct + NkPanel.HEIGHT); }
	/** Unsafe version of {@link #footer_h}. */
	public static float nfooter_h(long struct) { return memGetFloat(struct + NkPanel.FOOTER_H); }
	/** Unsafe version of {@link #header_h}. */
	public static float nheader_h(long struct) { return memGetFloat(struct + NkPanel.HEADER_H); }
	/** Unsafe version of {@link #border}. */
	public static float nborder(long struct) { return memGetFloat(struct + NkPanel.BORDER); }
	/** Unsafe version of {@link #clip}. */
	public static NkRect nclip(long struct) { return NkRect.create(struct + NkPanel.CLIP); }
	/** Unsafe version of {@link #menu}. */
	public static NkMenuState nmenu(long struct) { return NkMenuState.create(struct + NkPanel.MENU); }
	/** Unsafe version of {@link #row}. */
	public static NkRowLayout nrow(long struct) { return NkRowLayout.create(struct + NkPanel.ROW); }
	/** Unsafe version of {@link #chart}. */
	public static NkChart nchart(long struct) { return NkChart.create(struct + NkPanel.CHART); }
	/** Unsafe version of {@link #popup_buffer}. */
	public static NkPopupBuffer npopup_buffer(long struct) { return NkPopupBuffer.create(struct + NkPanel.POPUP_BUFFER); }
	/** Unsafe version of {@link #buffer}. */
	public static NkCommandBuffer nbuffer(long struct) { return NkCommandBuffer.create(memGetAddress(struct + NkPanel.BUFFER)); }
	/** Unsafe version of {@link #parent}. */
	public static NkPanel nparent(long struct) { return NkPanel.create(memGetAddress(struct + NkPanel.PARENT)); }

	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + NkPanel.FLAGS, value); }
	/** Unsafe version of {@link #bounds(NkRect) bounds}. */
	public static void nbounds(long struct, NkRect value) { memCopy(value.address(), struct + NkPanel.BOUNDS, NkRect.SIZEOF); }
	/** Unsafe version of {@link #offset(NkScroll) offset}. */
	public static void noffset(long struct, NkScroll value) { memPutAddress(struct + NkPanel.OFFSET, value.address()); }
	/** Unsafe version of {@link #at_x(float) at_x}. */
	public static void nat_x(long struct, float value) { memPutFloat(struct + NkPanel.AT_X, value); }
	/** Unsafe version of {@link #at_y(float) at_y}. */
	public static void nat_y(long struct, float value) { memPutFloat(struct + NkPanel.AT_Y, value); }
	/** Unsafe version of {@link #max_x(float) max_x}. */
	public static void nmax_x(long struct, float value) { memPutFloat(struct + NkPanel.MAX_X, value); }
	/** Unsafe version of {@link #width(float) width}. */
	public static void nwidth(long struct, float value) { memPutFloat(struct + NkPanel.WIDTH, value); }
	/** Unsafe version of {@link #height(float) height}. */
	public static void nheight(long struct, float value) { memPutFloat(struct + NkPanel.HEIGHT, value); }
	/** Unsafe version of {@link #footer_h(float) footer_h}. */
	public static void nfooter_h(long struct, float value) { memPutFloat(struct + NkPanel.FOOTER_H, value); }
	/** Unsafe version of {@link #header_h(float) header_h}. */
	public static void nheader_h(long struct, float value) { memPutFloat(struct + NkPanel.HEADER_H, value); }
	/** Unsafe version of {@link #border(float) border}. */
	public static void nborder(long struct, float value) { memPutFloat(struct + NkPanel.BORDER, value); }
	/** Unsafe version of {@link #clip(NkRect) clip}. */
	public static void nclip(long struct, NkRect value) { memCopy(value.address(), struct + NkPanel.CLIP, NkRect.SIZEOF); }
	/** Unsafe version of {@link #menu(NkMenuState) menu}. */
	public static void nmenu(long struct, NkMenuState value) { memCopy(value.address(), struct + NkPanel.MENU, NkMenuState.SIZEOF); }
	/** Unsafe version of {@link #row(NkRowLayout) row}. */
	public static void nrow(long struct, NkRowLayout value) { memCopy(value.address(), struct + NkPanel.ROW, NkRowLayout.SIZEOF); }
	/** Unsafe version of {@link #chart(NkChart) chart}. */
	public static void nchart(long struct, NkChart value) { memCopy(value.address(), struct + NkPanel.CHART, NkChart.SIZEOF); }
	/** Unsafe version of {@link #popup_buffer(NkPopupBuffer) popup_buffer}. */
	public static void npopup_buffer(long struct, NkPopupBuffer value) { memCopy(value.address(), struct + NkPanel.POPUP_BUFFER, NkPopupBuffer.SIZEOF); }
	/** Unsafe version of {@link #buffer(NkCommandBuffer) buffer}. */
	public static void nbuffer(long struct, NkCommandBuffer value) { memPutAddress(struct + NkPanel.BUFFER, value.address()); }
	/** Unsafe version of {@link #parent(NkPanel) parent}. */
	public static void nparent(long struct, NkPanel value) { memPutAddress(struct + NkPanel.PARENT, value.address()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NkPanel.OFFSET));
		NkRowLayout.validate(struct + NkPanel.ROW);
		long buffer = memGetAddress(struct + NkPanel.BUFFER);
		checkPointer(buffer);
		NkCommandBuffer.validate(buffer);
		checkPointer(memGetAddress(struct + NkPanel.PARENT));
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

	/** An array of {@link NkPanel} structs. */
	public static final class Buffer extends StructBuffer<NkPanel, Buffer> {

		/**
		 * Creates a new {@link NkPanel.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkPanel#SIZEOF}, and its mark will be undefined.
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
		protected NkPanel newInstance(long address) {
			return new NkPanel(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code flags} field. */
		public int flags() { return NkPanel.nflags(address()); }
		/** Returns a {@link NkRect} view of the {@code bounds} field. */
		public NkRect bounds() { return NkPanel.nbounds(address()); }
		/** Returns a {@link NkScroll} view of the struct pointed to by the {@code offset} field. */
		public NkScroll offset() { return NkPanel.noffset(address()); }
		/** Returns the value of the {@code at_x} field. */
		public float at_x() { return NkPanel.nat_x(address()); }
		/** Returns the value of the {@code at_y} field. */
		public float at_y() { return NkPanel.nat_y(address()); }
		/** Returns the value of the {@code max_x} field. */
		public float max_x() { return NkPanel.nmax_x(address()); }
		/** Returns the value of the {@code width} field. */
		public float width() { return NkPanel.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public float height() { return NkPanel.nheight(address()); }
		/** Returns the value of the {@code footer_h} field. */
		public float footer_h() { return NkPanel.nfooter_h(address()); }
		/** Returns the value of the {@code header_h} field. */
		public float header_h() { return NkPanel.nheader_h(address()); }
		/** Returns the value of the {@code border} field. */
		public float border() { return NkPanel.nborder(address()); }
		/** Returns a {@link NkRect} view of the {@code clip} field. */
		public NkRect clip() { return NkPanel.nclip(address()); }
		/** Returns a {@link NkMenuState} view of the {@code menu} field. */
		public NkMenuState menu() { return NkPanel.nmenu(address()); }
		/** Returns a {@link NkRowLayout} view of the {@code row} field. */
		public NkRowLayout row() { return NkPanel.nrow(address()); }
		/** Returns a {@link NkChart} view of the {@code chart} field. */
		public NkChart chart() { return NkPanel.nchart(address()); }
		/** Returns a {@link NkPopupBuffer} view of the {@code popup_buffer} field. */
		public NkPopupBuffer popup_buffer() { return NkPanel.npopup_buffer(address()); }
		/** Returns a {@link NkCommandBuffer} view of the struct pointed to by the {@code buffer} field. */
		public NkCommandBuffer buffer() { return NkPanel.nbuffer(address()); }
		/** Returns a {@link NkPanel} view of the struct pointed to by the {@code parent} field. */
		public NkPanel parent() { return NkPanel.nparent(address()); }

		/** Sets the specified value to the {@code flags} field. */
		public NkPanel.Buffer flags(int value) { NkPanel.nflags(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code bounds} field. */
		public NkPanel.Buffer bounds(NkRect value) { NkPanel.nbounds(address(), value); return this; }
		/** Sets the address of the specified {@link NkScroll} to the {@code offset} field. */
		public NkPanel.Buffer offset(NkScroll value) { NkPanel.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code at_x} field. */
		public NkPanel.Buffer at_x(float value) { NkPanel.nat_x(address(), value); return this; }
		/** Sets the specified value to the {@code at_y} field. */
		public NkPanel.Buffer at_y(float value) { NkPanel.nat_y(address(), value); return this; }
		/** Sets the specified value to the {@code max_x} field. */
		public NkPanel.Buffer max_x(float value) { NkPanel.nmax_x(address(), value); return this; }
		/** Sets the specified value to the {@code width} field. */
		public NkPanel.Buffer width(float value) { NkPanel.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public NkPanel.Buffer height(float value) { NkPanel.nheight(address(), value); return this; }
		/** Sets the specified value to the {@code footer_h} field. */
		public NkPanel.Buffer footer_h(float value) { NkPanel.nfooter_h(address(), value); return this; }
		/** Sets the specified value to the {@code header_h} field. */
		public NkPanel.Buffer header_h(float value) { NkPanel.nheader_h(address(), value); return this; }
		/** Sets the specified value to the {@code border} field. */
		public NkPanel.Buffer border(float value) { NkPanel.nborder(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code clip} field. */
		public NkPanel.Buffer clip(NkRect value) { NkPanel.nclip(address(), value); return this; }
		/** Copies the specified {@link NkMenuState} to the {@code menu} field. */
		public NkPanel.Buffer menu(NkMenuState value) { NkPanel.nmenu(address(), value); return this; }
		/** Copies the specified {@link NkRowLayout} to the {@code row} field. */
		public NkPanel.Buffer row(NkRowLayout value) { NkPanel.nrow(address(), value); return this; }
		/** Copies the specified {@link NkChart} to the {@code chart} field. */
		public NkPanel.Buffer chart(NkChart value) { NkPanel.nchart(address(), value); return this; }
		/** Copies the specified {@link NkPopupBuffer} to the {@code popup_buffer} field. */
		public NkPanel.Buffer popup_buffer(NkPopupBuffer value) { NkPanel.npopup_buffer(address(), value); return this; }
		/** Sets the address of the specified {@link NkCommandBuffer} to the {@code buffer} field. */
		public NkPanel.Buffer buffer(NkCommandBuffer value) { NkPanel.nbuffer(address(), value); return this; }
		/** Sets the address of the specified {@link NkPanel} to the {@code parent} field. */
		public NkPanel.Buffer parent(NkPanel value) { NkPanel.nparent(address(), value); return this; }

	}

}