/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * <pre><code>struct nk_style_window {
    {@link NkStyleWindowHeader struct nk_style_window_header} header;
    {@link NkStyleItem struct nk_style_item} fixed_background;
    {@link NkColor struct nk_color} background;
    {@link NkColor struct nk_color} border_color;
    {@link NkColor struct nk_color} combo_border_color;
    {@link NkColor struct nk_color} contextual_border_color;
    {@link NkColor struct nk_color} menu_border_color;
    {@link NkColor struct nk_color} group_border_color;
    {@link NkColor struct nk_color} tooltip_border_color;
    {@link NkStyleItem struct nk_style_item} scaler;
    float border;
    float combo_border;
    float contextual_border;
    float menu_border;
    float group_border;
    float tooltip_border;
    float rounding;
    {@link NkVec2 struct nk_vec2} spacing;
    {@link NkVec2 struct nk_vec2} scrollbar_size;
    {@link NkVec2 struct nk_vec2} min_size;
    {@link NkVec2 struct nk_vec2} padding;
    {@link NkVec2 struct nk_vec2} group_padding;
    {@link NkVec2 struct nk_vec2} popup_padding;
    {@link NkVec2 struct nk_vec2} combo_padding;
    {@link NkVec2 struct nk_vec2} contextual_padding;
    {@link NkVec2 struct nk_vec2} menu_padding;
    {@link NkVec2 struct nk_vec2} tooltip_padding;
}</code></pre>
 */
public class NkStyleWindow extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		FIXED_BACKGROUND,
		BACKGROUND,
		BORDER_COLOR,
		COMBO_BORDER_COLOR,
		CONTEXTUAL_BORDER_COLOR,
		MENU_BORDER_COLOR,
		GROUP_BORDER_COLOR,
		TOOLTIP_BORDER_COLOR,
		SCALER,
		BORDER,
		COMBO_BORDER,
		CONTEXTUAL_BORDER,
		MENU_BORDER,
		GROUP_BORDER,
		TOOLTIP_BORDER,
		ROUNDING,
		SPACING,
		SCROLLBAR_SIZE,
		MIN_SIZE,
		PADDING,
		GROUP_PADDING,
		POPUP_PADDING,
		COMBO_PADDING,
		CONTEXTUAL_PADDING,
		MENU_PADDING,
		TOOLTIP_PADDING;

	static {
		Layout layout = __struct(
			__member(NkStyleWindowHeader.SIZEOF, NkStyleWindowHeader.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF),
			__member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEADER = layout.offsetof(0);
		FIXED_BACKGROUND = layout.offsetof(1);
		BACKGROUND = layout.offsetof(2);
		BORDER_COLOR = layout.offsetof(3);
		COMBO_BORDER_COLOR = layout.offsetof(4);
		CONTEXTUAL_BORDER_COLOR = layout.offsetof(5);
		MENU_BORDER_COLOR = layout.offsetof(6);
		GROUP_BORDER_COLOR = layout.offsetof(7);
		TOOLTIP_BORDER_COLOR = layout.offsetof(8);
		SCALER = layout.offsetof(9);
		BORDER = layout.offsetof(10);
		COMBO_BORDER = layout.offsetof(11);
		CONTEXTUAL_BORDER = layout.offsetof(12);
		MENU_BORDER = layout.offsetof(13);
		GROUP_BORDER = layout.offsetof(14);
		TOOLTIP_BORDER = layout.offsetof(15);
		ROUNDING = layout.offsetof(16);
		SPACING = layout.offsetof(17);
		SCROLLBAR_SIZE = layout.offsetof(18);
		MIN_SIZE = layout.offsetof(19);
		PADDING = layout.offsetof(20);
		GROUP_PADDING = layout.offsetof(21);
		POPUP_PADDING = layout.offsetof(22);
		COMBO_PADDING = layout.offsetof(23);
		CONTEXTUAL_PADDING = layout.offsetof(24);
		MENU_PADDING = layout.offsetof(25);
		TOOLTIP_PADDING = layout.offsetof(26);
	}

	NkStyleWindow(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStyleWindow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStyleWindow(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkStyleWindowHeader} view of the {@code header} field. */
	public NkStyleWindowHeader header() { return nheader(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code fixed_background} field. */
	public NkStyleItem fixed_background() { return nfixed_background(address()); }
	/** Returns a {@link NkColor} view of the {@code background} field. */
	public NkColor background() { return nbackground(address()); }
	/** Returns a {@link NkColor} view of the {@code border_color} field. */
	public NkColor border_color() { return nborder_color(address()); }
	/** Returns a {@link NkColor} view of the {@code combo_border_color} field. */
	public NkColor combo_border_color() { return ncombo_border_color(address()); }
	/** Returns a {@link NkColor} view of the {@code contextual_border_color} field. */
	public NkColor contextual_border_color() { return ncontextual_border_color(address()); }
	/** Returns a {@link NkColor} view of the {@code menu_border_color} field. */
	public NkColor menu_border_color() { return nmenu_border_color(address()); }
	/** Returns a {@link NkColor} view of the {@code group_border_color} field. */
	public NkColor group_border_color() { return ngroup_border_color(address()); }
	/** Returns a {@link NkColor} view of the {@code tooltip_border_color} field. */
	public NkColor tooltip_border_color() { return ntooltip_border_color(address()); }
	/** Returns a {@link NkStyleItem} view of the {@code scaler} field. */
	public NkStyleItem scaler() { return nscaler(address()); }
	/** Returns the value of the {@code border} field. */
	public float border() { return nborder(address()); }
	/** Returns the value of the {@code combo_border} field. */
	public float combo_border() { return ncombo_border(address()); }
	/** Returns the value of the {@code contextual_border} field. */
	public float contextual_border() { return ncontextual_border(address()); }
	/** Returns the value of the {@code menu_border} field. */
	public float menu_border() { return nmenu_border(address()); }
	/** Returns the value of the {@code group_border} field. */
	public float group_border() { return ngroup_border(address()); }
	/** Returns the value of the {@code tooltip_border} field. */
	public float tooltip_border() { return ntooltip_border(address()); }
	/** Returns the value of the {@code rounding} field. */
	public float rounding() { return nrounding(address()); }
	/** Returns a {@link NkVec2} view of the {@code spacing} field. */
	public NkVec2 spacing() { return nspacing(address()); }
	/** Returns a {@link NkVec2} view of the {@code scrollbar_size} field. */
	public NkVec2 scrollbar_size() { return nscrollbar_size(address()); }
	/** Returns a {@link NkVec2} view of the {@code min_size} field. */
	public NkVec2 min_size() { return nmin_size(address()); }
	/** Returns a {@link NkVec2} view of the {@code padding} field. */
	public NkVec2 padding() { return npadding(address()); }
	/** Returns a {@link NkVec2} view of the {@code group_padding} field. */
	public NkVec2 group_padding() { return ngroup_padding(address()); }
	/** Returns a {@link NkVec2} view of the {@code popup_padding} field. */
	public NkVec2 popup_padding() { return npopup_padding(address()); }
	/** Returns a {@link NkVec2} view of the {@code combo_padding} field. */
	public NkVec2 combo_padding() { return ncombo_padding(address()); }
	/** Returns a {@link NkVec2} view of the {@code contextual_padding} field. */
	public NkVec2 contextual_padding() { return ncontextual_padding(address()); }
	/** Returns a {@link NkVec2} view of the {@code menu_padding} field. */
	public NkVec2 menu_padding() { return nmenu_padding(address()); }
	/** Returns a {@link NkVec2} view of the {@code tooltip_padding} field. */
	public NkVec2 tooltip_padding() { return ntooltip_padding(address()); }

	/** Copies the specified {@link NkStyleWindowHeader} to the {@code header} field. */
	public NkStyleWindow header(NkStyleWindowHeader value) { nheader(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code fixed_background} field. */
	public NkStyleWindow fixed_background(NkStyleItem value) { nfixed_background(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code background} field. */
	public NkStyleWindow background(NkColor value) { nbackground(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code border_color} field. */
	public NkStyleWindow border_color(NkColor value) { nborder_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code combo_border_color} field. */
	public NkStyleWindow combo_border_color(NkColor value) { ncombo_border_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code contextual_border_color} field. */
	public NkStyleWindow contextual_border_color(NkColor value) { ncontextual_border_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code menu_border_color} field. */
	public NkStyleWindow menu_border_color(NkColor value) { nmenu_border_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code group_border_color} field. */
	public NkStyleWindow group_border_color(NkColor value) { ngroup_border_color(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code tooltip_border_color} field. */
	public NkStyleWindow tooltip_border_color(NkColor value) { ntooltip_border_color(address(), value); return this; }
	/** Copies the specified {@link NkStyleItem} to the {@code scaler} field. */
	public NkStyleWindow scaler(NkStyleItem value) { nscaler(address(), value); return this; }
	/** Sets the specified value to the {@code border} field. */
	public NkStyleWindow border(float value) { nborder(address(), value); return this; }
	/** Sets the specified value to the {@code combo_border} field. */
	public NkStyleWindow combo_border(float value) { ncombo_border(address(), value); return this; }
	/** Sets the specified value to the {@code contextual_border} field. */
	public NkStyleWindow contextual_border(float value) { ncontextual_border(address(), value); return this; }
	/** Sets the specified value to the {@code menu_border} field. */
	public NkStyleWindow menu_border(float value) { nmenu_border(address(), value); return this; }
	/** Sets the specified value to the {@code group_border} field. */
	public NkStyleWindow group_border(float value) { ngroup_border(address(), value); return this; }
	/** Sets the specified value to the {@code tooltip_border} field. */
	public NkStyleWindow tooltip_border(float value) { ntooltip_border(address(), value); return this; }
	/** Sets the specified value to the {@code rounding} field. */
	public NkStyleWindow rounding(float value) { nrounding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code spacing} field. */
	public NkStyleWindow spacing(NkVec2 value) { nspacing(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code scrollbar_size} field. */
	public NkStyleWindow scrollbar_size(NkVec2 value) { nscrollbar_size(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code min_size} field. */
	public NkStyleWindow min_size(NkVec2 value) { nmin_size(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code padding} field. */
	public NkStyleWindow padding(NkVec2 value) { npadding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code group_padding} field. */
	public NkStyleWindow group_padding(NkVec2 value) { ngroup_padding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code popup_padding} field. */
	public NkStyleWindow popup_padding(NkVec2 value) { npopup_padding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code combo_padding} field. */
	public NkStyleWindow combo_padding(NkVec2 value) { ncombo_padding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code contextual_padding} field. */
	public NkStyleWindow contextual_padding(NkVec2 value) { ncontextual_padding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code menu_padding} field. */
	public NkStyleWindow menu_padding(NkVec2 value) { nmenu_padding(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code tooltip_padding} field. */
	public NkStyleWindow tooltip_padding(NkVec2 value) { ntooltip_padding(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkStyleWindow set(
		NkStyleWindowHeader header,
		NkStyleItem fixed_background,
		NkColor background,
		NkColor border_color,
		NkColor combo_border_color,
		NkColor contextual_border_color,
		NkColor menu_border_color,
		NkColor group_border_color,
		NkColor tooltip_border_color,
		NkStyleItem scaler,
		float border,
		float combo_border,
		float contextual_border,
		float menu_border,
		float group_border,
		float tooltip_border,
		float rounding,
		NkVec2 spacing,
		NkVec2 scrollbar_size,
		NkVec2 min_size,
		NkVec2 padding,
		NkVec2 group_padding,
		NkVec2 popup_padding,
		NkVec2 combo_padding,
		NkVec2 contextual_padding,
		NkVec2 menu_padding,
		NkVec2 tooltip_padding
	) {
		header(header);
		fixed_background(fixed_background);
		background(background);
		border_color(border_color);
		combo_border_color(combo_border_color);
		contextual_border_color(contextual_border_color);
		menu_border_color(menu_border_color);
		group_border_color(group_border_color);
		tooltip_border_color(tooltip_border_color);
		scaler(scaler);
		border(border);
		combo_border(combo_border);
		contextual_border(contextual_border);
		menu_border(menu_border);
		group_border(group_border);
		tooltip_border(tooltip_border);
		rounding(rounding);
		spacing(spacing);
		scrollbar_size(scrollbar_size);
		min_size(min_size);
		padding(padding);
		group_padding(group_padding);
		popup_padding(popup_padding);
		combo_padding(combo_padding);
		contextual_padding(contextual_padding);
		menu_padding(menu_padding);
		tooltip_padding(tooltip_padding);

		return this;
	}

	/** Unsafe version of {@link #set(NkStyleWindow) set}. */
	public NkStyleWindow nset(long struct) {
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
	public NkStyleWindow set(NkStyleWindow src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleWindow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStyleWindow malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStyleWindow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStyleWindow calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStyleWindow} instance allocated with {@link BufferUtils}. */
	public static NkStyleWindow create() {
		return new NkStyleWindow(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStyleWindow} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStyleWindow create(long address) {
		return address == NULL ? null : new NkStyleWindow(address, null);
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStyleWindow.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleWindow} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStyleWindow mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStyleWindow} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStyleWindow callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStyleWindow} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleWindow mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleWindow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleWindow callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #header}. */
	public static NkStyleWindowHeader nheader(long struct) { return NkStyleWindowHeader.create(struct + NkStyleWindow.HEADER); }
	/** Unsafe version of {@link #fixed_background}. */
	public static NkStyleItem nfixed_background(long struct) { return NkStyleItem.create(struct + NkStyleWindow.FIXED_BACKGROUND); }
	/** Unsafe version of {@link #background}. */
	public static NkColor nbackground(long struct) { return NkColor.create(struct + NkStyleWindow.BACKGROUND); }
	/** Unsafe version of {@link #border_color}. */
	public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleWindow.BORDER_COLOR); }
	/** Unsafe version of {@link #combo_border_color}. */
	public static NkColor ncombo_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.COMBO_BORDER_COLOR); }
	/** Unsafe version of {@link #contextual_border_color}. */
	public static NkColor ncontextual_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.CONTEXTUAL_BORDER_COLOR); }
	/** Unsafe version of {@link #menu_border_color}. */
	public static NkColor nmenu_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.MENU_BORDER_COLOR); }
	/** Unsafe version of {@link #group_border_color}. */
	public static NkColor ngroup_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.GROUP_BORDER_COLOR); }
	/** Unsafe version of {@link #tooltip_border_color}. */
	public static NkColor ntooltip_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.TOOLTIP_BORDER_COLOR); }
	/** Unsafe version of {@link #scaler}. */
	public static NkStyleItem nscaler(long struct) { return NkStyleItem.create(struct + NkStyleWindow.SCALER); }
	/** Unsafe version of {@link #border}. */
	public static float nborder(long struct) { return memGetFloat(struct + NkStyleWindow.BORDER); }
	/** Unsafe version of {@link #combo_border}. */
	public static float ncombo_border(long struct) { return memGetFloat(struct + NkStyleWindow.COMBO_BORDER); }
	/** Unsafe version of {@link #contextual_border}. */
	public static float ncontextual_border(long struct) { return memGetFloat(struct + NkStyleWindow.CONTEXTUAL_BORDER); }
	/** Unsafe version of {@link #menu_border}. */
	public static float nmenu_border(long struct) { return memGetFloat(struct + NkStyleWindow.MENU_BORDER); }
	/** Unsafe version of {@link #group_border}. */
	public static float ngroup_border(long struct) { return memGetFloat(struct + NkStyleWindow.GROUP_BORDER); }
	/** Unsafe version of {@link #tooltip_border}. */
	public static float ntooltip_border(long struct) { return memGetFloat(struct + NkStyleWindow.TOOLTIP_BORDER); }
	/** Unsafe version of {@link #rounding}. */
	public static float nrounding(long struct) { return memGetFloat(struct + NkStyleWindow.ROUNDING); }
	/** Unsafe version of {@link #spacing}. */
	public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleWindow.SPACING); }
	/** Unsafe version of {@link #scrollbar_size}. */
	public static NkVec2 nscrollbar_size(long struct) { return NkVec2.create(struct + NkStyleWindow.SCROLLBAR_SIZE); }
	/** Unsafe version of {@link #min_size}. */
	public static NkVec2 nmin_size(long struct) { return NkVec2.create(struct + NkStyleWindow.MIN_SIZE); }
	/** Unsafe version of {@link #padding}. */
	public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleWindow.PADDING); }
	/** Unsafe version of {@link #group_padding}. */
	public static NkVec2 ngroup_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.GROUP_PADDING); }
	/** Unsafe version of {@link #popup_padding}. */
	public static NkVec2 npopup_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.POPUP_PADDING); }
	/** Unsafe version of {@link #combo_padding}. */
	public static NkVec2 ncombo_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.COMBO_PADDING); }
	/** Unsafe version of {@link #contextual_padding}. */
	public static NkVec2 ncontextual_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.CONTEXTUAL_PADDING); }
	/** Unsafe version of {@link #menu_padding}. */
	public static NkVec2 nmenu_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.MENU_PADDING); }
	/** Unsafe version of {@link #tooltip_padding}. */
	public static NkVec2 ntooltip_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.TOOLTIP_PADDING); }

	/** Unsafe version of {@link #header(NkStyleWindowHeader) header}. */
	public static void nheader(long struct, NkStyleWindowHeader value) { memCopy(value.address(), struct + NkStyleWindow.HEADER, NkStyleWindowHeader.SIZEOF); }
	/** Unsafe version of {@link #fixed_background(NkStyleItem) fixed_background}. */
	public static void nfixed_background(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindow.FIXED_BACKGROUND, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #background(NkColor) background}. */
	public static void nbackground(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.BACKGROUND, NkColor.SIZEOF); }
	/** Unsafe version of {@link #border_color(NkColor) border_color}. */
	public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #combo_border_color(NkColor) combo_border_color}. */
	public static void ncombo_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.COMBO_BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #contextual_border_color(NkColor) contextual_border_color}. */
	public static void ncontextual_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.CONTEXTUAL_BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #menu_border_color(NkColor) menu_border_color}. */
	public static void nmenu_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.MENU_BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #group_border_color(NkColor) group_border_color}. */
	public static void ngroup_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.GROUP_BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #tooltip_border_color(NkColor) tooltip_border_color}. */
	public static void ntooltip_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.TOOLTIP_BORDER_COLOR, NkColor.SIZEOF); }
	/** Unsafe version of {@link #scaler(NkStyleItem) scaler}. */
	public static void nscaler(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindow.SCALER, NkStyleItem.SIZEOF); }
	/** Unsafe version of {@link #border(float) border}. */
	public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleWindow.BORDER, value); }
	/** Unsafe version of {@link #combo_border(float) combo_border}. */
	public static void ncombo_border(long struct, float value) { memPutFloat(struct + NkStyleWindow.COMBO_BORDER, value); }
	/** Unsafe version of {@link #contextual_border(float) contextual_border}. */
	public static void ncontextual_border(long struct, float value) { memPutFloat(struct + NkStyleWindow.CONTEXTUAL_BORDER, value); }
	/** Unsafe version of {@link #menu_border(float) menu_border}. */
	public static void nmenu_border(long struct, float value) { memPutFloat(struct + NkStyleWindow.MENU_BORDER, value); }
	/** Unsafe version of {@link #group_border(float) group_border}. */
	public static void ngroup_border(long struct, float value) { memPutFloat(struct + NkStyleWindow.GROUP_BORDER, value); }
	/** Unsafe version of {@link #tooltip_border(float) tooltip_border}. */
	public static void ntooltip_border(long struct, float value) { memPutFloat(struct + NkStyleWindow.TOOLTIP_BORDER, value); }
	/** Unsafe version of {@link #rounding(float) rounding}. */
	public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleWindow.ROUNDING, value); }
	/** Unsafe version of {@link #spacing(NkVec2) spacing}. */
	public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.SPACING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #scrollbar_size(NkVec2) scrollbar_size}. */
	public static void nscrollbar_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.SCROLLBAR_SIZE, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #min_size(NkVec2) min_size}. */
	public static void nmin_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.MIN_SIZE, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #padding(NkVec2) padding}. */
	public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #group_padding(NkVec2) group_padding}. */
	public static void ngroup_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.GROUP_PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #popup_padding(NkVec2) popup_padding}. */
	public static void npopup_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.POPUP_PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #combo_padding(NkVec2) combo_padding}. */
	public static void ncombo_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.COMBO_PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #contextual_padding(NkVec2) contextual_padding}. */
	public static void ncontextual_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.CONTEXTUAL_PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #menu_padding(NkVec2) menu_padding}. */
	public static void nmenu_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.MENU_PADDING, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #tooltip_padding(NkVec2) tooltip_padding}. */
	public static void ntooltip_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.TOOLTIP_PADDING, NkVec2.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkStyleWindow} structs. */
	public static final class Buffer extends StructBuffer<NkStyleWindow, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkStyleWindow.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStyleWindow#SIZEOF}, and its mark will be undefined.
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
		protected NkStyleWindow newInstance(long address) {
			return new NkStyleWindow(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkStyleWindowHeader} view of the {@code header} field. */
		public NkStyleWindowHeader header() { return NkStyleWindow.nheader(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code fixed_background} field. */
		public NkStyleItem fixed_background() { return NkStyleWindow.nfixed_background(address()); }
		/** Returns a {@link NkColor} view of the {@code background} field. */
		public NkColor background() { return NkStyleWindow.nbackground(address()); }
		/** Returns a {@link NkColor} view of the {@code border_color} field. */
		public NkColor border_color() { return NkStyleWindow.nborder_color(address()); }
		/** Returns a {@link NkColor} view of the {@code combo_border_color} field. */
		public NkColor combo_border_color() { return NkStyleWindow.ncombo_border_color(address()); }
		/** Returns a {@link NkColor} view of the {@code contextual_border_color} field. */
		public NkColor contextual_border_color() { return NkStyleWindow.ncontextual_border_color(address()); }
		/** Returns a {@link NkColor} view of the {@code menu_border_color} field. */
		public NkColor menu_border_color() { return NkStyleWindow.nmenu_border_color(address()); }
		/** Returns a {@link NkColor} view of the {@code group_border_color} field. */
		public NkColor group_border_color() { return NkStyleWindow.ngroup_border_color(address()); }
		/** Returns a {@link NkColor} view of the {@code tooltip_border_color} field. */
		public NkColor tooltip_border_color() { return NkStyleWindow.ntooltip_border_color(address()); }
		/** Returns a {@link NkStyleItem} view of the {@code scaler} field. */
		public NkStyleItem scaler() { return NkStyleWindow.nscaler(address()); }
		/** Returns the value of the {@code border} field. */
		public float border() { return NkStyleWindow.nborder(address()); }
		/** Returns the value of the {@code combo_border} field. */
		public float combo_border() { return NkStyleWindow.ncombo_border(address()); }
		/** Returns the value of the {@code contextual_border} field. */
		public float contextual_border() { return NkStyleWindow.ncontextual_border(address()); }
		/** Returns the value of the {@code menu_border} field. */
		public float menu_border() { return NkStyleWindow.nmenu_border(address()); }
		/** Returns the value of the {@code group_border} field. */
		public float group_border() { return NkStyleWindow.ngroup_border(address()); }
		/** Returns the value of the {@code tooltip_border} field. */
		public float tooltip_border() { return NkStyleWindow.ntooltip_border(address()); }
		/** Returns the value of the {@code rounding} field. */
		public float rounding() { return NkStyleWindow.nrounding(address()); }
		/** Returns a {@link NkVec2} view of the {@code spacing} field. */
		public NkVec2 spacing() { return NkStyleWindow.nspacing(address()); }
		/** Returns a {@link NkVec2} view of the {@code scrollbar_size} field. */
		public NkVec2 scrollbar_size() { return NkStyleWindow.nscrollbar_size(address()); }
		/** Returns a {@link NkVec2} view of the {@code min_size} field. */
		public NkVec2 min_size() { return NkStyleWindow.nmin_size(address()); }
		/** Returns a {@link NkVec2} view of the {@code padding} field. */
		public NkVec2 padding() { return NkStyleWindow.npadding(address()); }
		/** Returns a {@link NkVec2} view of the {@code group_padding} field. */
		public NkVec2 group_padding() { return NkStyleWindow.ngroup_padding(address()); }
		/** Returns a {@link NkVec2} view of the {@code popup_padding} field. */
		public NkVec2 popup_padding() { return NkStyleWindow.npopup_padding(address()); }
		/** Returns a {@link NkVec2} view of the {@code combo_padding} field. */
		public NkVec2 combo_padding() { return NkStyleWindow.ncombo_padding(address()); }
		/** Returns a {@link NkVec2} view of the {@code contextual_padding} field. */
		public NkVec2 contextual_padding() { return NkStyleWindow.ncontextual_padding(address()); }
		/** Returns a {@link NkVec2} view of the {@code menu_padding} field. */
		public NkVec2 menu_padding() { return NkStyleWindow.nmenu_padding(address()); }
		/** Returns a {@link NkVec2} view of the {@code tooltip_padding} field. */
		public NkVec2 tooltip_padding() { return NkStyleWindow.ntooltip_padding(address()); }

		/** Copies the specified {@link NkStyleWindowHeader} to the {@code header} field. */
		public NkStyleWindow.Buffer header(NkStyleWindowHeader value) { NkStyleWindow.nheader(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code fixed_background} field. */
		public NkStyleWindow.Buffer fixed_background(NkStyleItem value) { NkStyleWindow.nfixed_background(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code background} field. */
		public NkStyleWindow.Buffer background(NkColor value) { NkStyleWindow.nbackground(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code border_color} field. */
		public NkStyleWindow.Buffer border_color(NkColor value) { NkStyleWindow.nborder_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code combo_border_color} field. */
		public NkStyleWindow.Buffer combo_border_color(NkColor value) { NkStyleWindow.ncombo_border_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code contextual_border_color} field. */
		public NkStyleWindow.Buffer contextual_border_color(NkColor value) { NkStyleWindow.ncontextual_border_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code menu_border_color} field. */
		public NkStyleWindow.Buffer menu_border_color(NkColor value) { NkStyleWindow.nmenu_border_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code group_border_color} field. */
		public NkStyleWindow.Buffer group_border_color(NkColor value) { NkStyleWindow.ngroup_border_color(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code tooltip_border_color} field. */
		public NkStyleWindow.Buffer tooltip_border_color(NkColor value) { NkStyleWindow.ntooltip_border_color(address(), value); return this; }
		/** Copies the specified {@link NkStyleItem} to the {@code scaler} field. */
		public NkStyleWindow.Buffer scaler(NkStyleItem value) { NkStyleWindow.nscaler(address(), value); return this; }
		/** Sets the specified value to the {@code border} field. */
		public NkStyleWindow.Buffer border(float value) { NkStyleWindow.nborder(address(), value); return this; }
		/** Sets the specified value to the {@code combo_border} field. */
		public NkStyleWindow.Buffer combo_border(float value) { NkStyleWindow.ncombo_border(address(), value); return this; }
		/** Sets the specified value to the {@code contextual_border} field. */
		public NkStyleWindow.Buffer contextual_border(float value) { NkStyleWindow.ncontextual_border(address(), value); return this; }
		/** Sets the specified value to the {@code menu_border} field. */
		public NkStyleWindow.Buffer menu_border(float value) { NkStyleWindow.nmenu_border(address(), value); return this; }
		/** Sets the specified value to the {@code group_border} field. */
		public NkStyleWindow.Buffer group_border(float value) { NkStyleWindow.ngroup_border(address(), value); return this; }
		/** Sets the specified value to the {@code tooltip_border} field. */
		public NkStyleWindow.Buffer tooltip_border(float value) { NkStyleWindow.ntooltip_border(address(), value); return this; }
		/** Sets the specified value to the {@code rounding} field. */
		public NkStyleWindow.Buffer rounding(float value) { NkStyleWindow.nrounding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code spacing} field. */
		public NkStyleWindow.Buffer spacing(NkVec2 value) { NkStyleWindow.nspacing(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code scrollbar_size} field. */
		public NkStyleWindow.Buffer scrollbar_size(NkVec2 value) { NkStyleWindow.nscrollbar_size(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code min_size} field. */
		public NkStyleWindow.Buffer min_size(NkVec2 value) { NkStyleWindow.nmin_size(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code padding} field. */
		public NkStyleWindow.Buffer padding(NkVec2 value) { NkStyleWindow.npadding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code group_padding} field. */
		public NkStyleWindow.Buffer group_padding(NkVec2 value) { NkStyleWindow.ngroup_padding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code popup_padding} field. */
		public NkStyleWindow.Buffer popup_padding(NkVec2 value) { NkStyleWindow.npopup_padding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code combo_padding} field. */
		public NkStyleWindow.Buffer combo_padding(NkVec2 value) { NkStyleWindow.ncombo_padding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code contextual_padding} field. */
		public NkStyleWindow.Buffer contextual_padding(NkVec2 value) { NkStyleWindow.ncontextual_padding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code menu_padding} field. */
		public NkStyleWindow.Buffer menu_padding(NkVec2 value) { NkStyleWindow.nmenu_padding(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code tooltip_padding} field. */
		public NkStyleWindow.Buffer tooltip_padding(NkVec2 value) { NkStyleWindow.ntooltip_padding(address(), value); return this; }

	}

}