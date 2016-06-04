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
 * <pre><code>struct nk_style_tab {
    {@link NkStyleItem struct nk_style_item} background;
    {@link NkColor struct nk_color} border_color;
    {@link NkColor struct nk_color} text;
    {@link NkStyleButton struct nk_style_button} tab_button;
    {@link NkStyleButton struct nk_style_button} node_button;
    nk_symbol_type sym_minimize;
    nk_symbol_type sym_maximize;
    float border;
    float rounding;
    {@link NkVec2 struct nk_vec2} padding;
    {@link NkVec2 struct nk_vec2} spacing;
}</code></pre>
 */
public class NkStyleTab extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BACKGROUND,
		BORDER_COLOR,
		TEXT,
		TAB_BUTTON,
		NODE_BUTTON,
		SYM_MINIMIZE,
		SYM_MAXIMIZE,
		BORDER,
		ROUNDING,
		PADDING,
		SPACING;

	static {
		Layout layout = __struct(
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
			__member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BACKGROUND = layout.offsetof(0);
		BORDER_COLOR = layout.offsetof(1);
		TEXT = layout.offsetof(2);
		TAB_BUTTON = layout.offsetof(3);
		NODE_BUTTON = layout.offsetof(4);
		SYM_MINIMIZE = layout.offsetof(5);
		SYM_MAXIMIZE = layout.offsetof(6);
		BORDER = layout.offsetof(7);
		ROUNDING = layout.offsetof(8);
		PADDING = layout.offsetof(9);
		SPACING = layout.offsetof(10);
	}

	NkStyleTab(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStyleTab} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStyleTab(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkStyleItem} view of the {@code background} field. */
	public NkStyleItem background() { return nbackground(address()); }
	/** Returns a {@link NkColor} view of the {@code border_color} field. */
	public NkColor border_color() { return nborder_color(address()); }
	/** Returns a {@link NkColor} view of the {@code text} field. */
	public NkColor text() { return ntext(address()); }
	/** Returns a {@link NkStyleButton} view of the {@code tab_button} field. */
	public NkStyleButton tab_button() { return ntab_button(address()); }
	/** Returns a {@link NkStyleButton} view of the {@code node_button} field. */
	public NkStyleButton node_button() { return nnode_button(address()); }
	/** Returns the value of the {@code sym_minimize} field. */
	public int sym_minimize() { return nsym_minimize(address()); }
	/** Returns the value of the {@code sym_maximize} field. */
	public int sym_maximize() { return nsym_maximize(address()); }
	/** Returns the value of the {@code border} field. */
	public float border() { return nborder(address()); }
	/** Returns the value of the {@code rounding} field. */
	public float rounding() { return nrounding(address()); }
	/** Returns a {@link NkVec2} view of the {@code padding} field. */
	public NkVec2 padding() { return npadding(address()); }
	/** Returns a {@link NkVec2} view of the {@code spacing} field. */
	public NkVec2 spacing() { return nspacing(address()); }

	/** Copies the specified {@link NkStyleItem} to the {@code background} field. */
	public NkStyleTab background(NkStyleItem value) { nbackground(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code border_color} field. */
	public NkStyleTab border_color(NkColor value) { nborder_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code text} field. */
	public NkStyleTab text(NkColor value) { ntext(address(), value); return this; }
	/** Copies the specified {@link NkStyleButton} to the {@code tab_button} field. */
	public NkStyleTab tab_button(NkStyleButton value) { ntab_button(address(), value); return this; }
	/** Copies the specified {@link NkStyleButton} to the {@code node_button} field. */
	public NkStyleTab node_button(NkStyleButton value) { nnode_button(address(), value); return this; }
	/** Sets the specified value to the {@code sym_minimize} field. */
	public NkStyleTab sym_minimize(int value) { nsym_minimize(address(), value); return this; }
	/** Sets the specified value to the {@code sym_maximize} field. */
	public NkStyleTab sym_maximize(int value) { nsym_maximize(address(), value); return this; }
	/** Sets the specified value to the {@code border} field. */
	public NkStyleTab border(float value) { nborder(address(), value); return this; }
	/** Sets the specified value to the {@code rounding} field. */
	public NkStyleTab rounding(float value) { nrounding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code padding} field. */
	public NkStyleTab padding(NkVec2 value) { npadding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code spacing} field. */
	public NkStyleTab spacing(NkVec2 value) { nspacing(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkStyleTab set(
		NkStyleItem background,
		NkColor border_color,
		NkColor text,
		NkStyleButton tab_button,
		NkStyleButton node_button,
		int sym_minimize,
		int sym_maximize,
		float border,
		float rounding,
		NkVec2 padding,
		NkVec2 spacing
	) {
		background(background);
		border_color(border_color);
		text(text);
		tab_button(tab_button);
		node_button(node_button);
		sym_minimize(sym_minimize);
		sym_maximize(sym_maximize);
		border(border);
		rounding(rounding);
		padding(padding);
		spacing(spacing);

		return this;
	}

	/** Unsafe version of {@link #set(NkStyleTab) set}. */
	public NkStyleTab nset(long struct) {
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
	public NkStyleTab set(NkStyleTab src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleTab} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStyleTab malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStyleTab} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStyleTab calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStyleTab} instance allocated with {@link BufferUtils}. */
	public static NkStyleTab create() {
		return new NkStyleTab(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStyleTab} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStyleTab create(long address) {
		return address == NULL ? null : new NkStyleTab(address, null);
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStyleTab.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleTab} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStyleTab mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStyleTab} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStyleTab callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStyleTab} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleTab mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleTab} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleTab callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleTab.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #background}. */
	public static NkStyleItem nbackground(long struct) { return NkStyleItem.create(struct + NkStyleTab.BACKGROUND); }
	/** Unsafe version of {@link #border_color}. */
	public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleTab.BORDER_COLOR); }
	/** Unsafe version of {@link #text}. */
	public static NkColor ntext(long struct) { return NkColor.create(struct + NkStyleTab.TEXT); }
	/** Unsafe version of {@link #tab_button}. */
	public static NkStyleButton ntab_button(long struct) { return NkStyleButton.create(struct + NkStyleTab.TAB_BUTTON); }
	/** Unsafe version of {@link #node_button}. */
	public static NkStyleButton nnode_button(long struct) { return NkStyleButton.create(struct + NkStyleTab.NODE_BUTTON); }
	/** Unsafe version of {@link #sym_minimize}. */
	public static int nsym_minimize(long struct) { return memGetInt(struct + NkStyleTab.SYM_MINIMIZE); }
	/** Unsafe version of {@link #sym_maximize}. */
	public static int nsym_maximize(long struct) { return memGetInt(struct + NkStyleTab.SYM_MAXIMIZE); }
	/** Unsafe version of {@link #border}. */
	public static float nborder(long struct) { return memGetFloat(struct + NkStyleTab.BORDER); }
	/** Unsafe version of {@link #rounding}. */
	public static float nrounding(long struct) { return memGetFloat(struct + NkStyleTab.ROUNDING); }
	/** Unsafe version of {@link #padding}. */
	public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleTab.PADDING); }
	/** Unsafe version of {@link #spacing}. */
	public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleTab.SPACING); }

	/** Unsafe version of {@link #background(NkStyleItem) background}. */
	public static void nbackground(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleTab.BACKGROUND, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #border_color(NkColor) border_color}. */
	public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleTab.BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #text(NkColor) text}. */
	public static void ntext(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleTab.TEXT, NkColor.SIZEOF); }
	/** Unsafe version of {@link #tab_button(NkStyleButton) tab_button}. */
	public static void ntab_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleTab.TAB_BUTTON, NkStyleButton.SIZEOF); }
	/** Unsafe version of {@link #node_button(NkStyleButton) node_button}. */
	public static void nnode_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleTab.NODE_BUTTON, NkStyleButton.SIZEOF); }
	/** Unsafe version of {@link #sym_minimize(int) sym_minimize}. */
	public static void nsym_minimize(long struct, int value) { memPutInt(struct + NkStyleTab.SYM_MINIMIZE, value); }
	/** Unsafe version of {@link #sym_maximize(int) sym_maximize}. */
	public static void nsym_maximize(long struct, int value) { memPutInt(struct + NkStyleTab.SYM_MAXIMIZE, value); }
	/** Unsafe version of {@link #border(float) border}. */
	public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleTab.BORDER, value); }
	/** Unsafe version of {@link #rounding(float) rounding}. */
	public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleTab.ROUNDING, value); }
	/** Unsafe version of {@link #padding(NkVec2) padding}. */
	public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleTab.PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #spacing(NkVec2) spacing}. */
	public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleTab.SPACING, NkVec2.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkStyleTab} structs. */
	public static final class Buffer extends StructBuffer<NkStyleTab, Buffer> {

		/**
		 * Creates a new {@link NkStyleTab.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStyleTab#SIZEOF}, and its mark will be undefined.
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
		protected NkStyleTab newInstance(long address) {
			return new NkStyleTab(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkStyleItem} view of the {@code background} field. */
		public NkStyleItem background() { return NkStyleTab.nbackground(address()); }
		/** Returns a {@link NkColor} view of the {@code border_color} field. */
		public NkColor border_color() { return NkStyleTab.nborder_color(address()); }
		/** Returns a {@link NkColor} view of the {@code text} field. */
		public NkColor text() { return NkStyleTab.ntext(address()); }
		/** Returns a {@link NkStyleButton} view of the {@code tab_button} field. */
		public NkStyleButton tab_button() { return NkStyleTab.ntab_button(address()); }
		/** Returns a {@link NkStyleButton} view of the {@code node_button} field. */
		public NkStyleButton node_button() { return NkStyleTab.nnode_button(address()); }
		/** Returns the value of the {@code sym_minimize} field. */
		public int sym_minimize() { return NkStyleTab.nsym_minimize(address()); }
		/** Returns the value of the {@code sym_maximize} field. */
		public int sym_maximize() { return NkStyleTab.nsym_maximize(address()); }
		/** Returns the value of the {@code border} field. */
		public float border() { return NkStyleTab.nborder(address()); }
		/** Returns the value of the {@code rounding} field. */
		public float rounding() { return NkStyleTab.nrounding(address()); }
		/** Returns a {@link NkVec2} view of the {@code padding} field. */
		public NkVec2 padding() { return NkStyleTab.npadding(address()); }
		/** Returns a {@link NkVec2} view of the {@code spacing} field. */
		public NkVec2 spacing() { return NkStyleTab.nspacing(address()); }

		/** Copies the specified {@link NkStyleItem} to the {@code background} field. */
		public NkStyleTab.Buffer background(NkStyleItem value) { NkStyleTab.nbackground(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code border_color} field. */
		public NkStyleTab.Buffer border_color(NkColor value) { NkStyleTab.nborder_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code text} field. */
		public NkStyleTab.Buffer text(NkColor value) { NkStyleTab.ntext(address(), value); return this; }
		/** Copies the specified {@link NkStyleButton} to the {@code tab_button} field. */
		public NkStyleTab.Buffer tab_button(NkStyleButton value) { NkStyleTab.ntab_button(address(), value); return this; }
		/** Copies the specified {@link NkStyleButton} to the {@code node_button} field. */
		public NkStyleTab.Buffer node_button(NkStyleButton value) { NkStyleTab.nnode_button(address(), value); return this; }
		/** Sets the specified value to the {@code sym_minimize} field. */
		public NkStyleTab.Buffer sym_minimize(int value) { NkStyleTab.nsym_minimize(address(), value); return this; }
		/** Sets the specified value to the {@code sym_maximize} field. */
		public NkStyleTab.Buffer sym_maximize(int value) { NkStyleTab.nsym_maximize(address(), value); return this; }
		/** Sets the specified value to the {@code border} field. */
		public NkStyleTab.Buffer border(float value) { NkStyleTab.nborder(address(), value); return this; }
		/** Sets the specified value to the {@code rounding} field. */
		public NkStyleTab.Buffer rounding(float value) { NkStyleTab.nrounding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code padding} field. */
		public NkStyleTab.Buffer padding(NkVec2 value) { NkStyleTab.npadding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code spacing} field. */
		public NkStyleTab.Buffer spacing(NkVec2 value) { NkStyleTab.nspacing(address(), value); return this; }

	}

}