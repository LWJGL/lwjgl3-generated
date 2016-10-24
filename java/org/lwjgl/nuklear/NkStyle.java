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

import static org.lwjgl.nuklear.Nuklear.NK_CURSOR_COUNT;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_style {
    struct nk_user_font * font;
    struct nk_cursor * cursors[NK_CURSOR_COUNT];
    struct nk_cursor * cursor_active;
    struct nk_cursor * cursor_last;
    int cursor_visible;
    {@link NkStyleText struct nk_style_text} text;
    {@link NkStyleButton struct nk_style_button} button;
    {@link NkStyleButton struct nk_style_button} contextual_button;
    {@link NkStyleButton struct nk_style_button} menu_button;
    {@link NkStyleToggle struct nk_style_toggle} option;
    {@link NkStyleToggle struct nk_style_toggle} checkbox;
    {@link NkStyleSelectable struct nk_style_selectable} selectable;
    {@link NkStyleSlider struct nk_style_slider} slider;
    {@link NkStyleProgress struct nk_style_progress} progress;
    {@link NkStyleProperty struct nk_style_property} property;
    {@link NkStyleEdit struct nk_style_edit} edit;
    {@link NkStyleChart struct nk_style_chart} chart;
    {@link NkStyleScrollbar struct nk_style_scrollbar} scrollh;
    {@link NkStyleScrollbar struct nk_style_scrollbar} scrollv;
    {@link NkStyleTab struct nk_style_tab} tab;
    {@link NkStyleCombo struct nk_style_combo} combo;
    {@link NkStyleWindow struct nk_style_window} window;
}</code></pre>
 */
public class NkStyle extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FONT,
		CURSORS,
		CURSOR_ACTIVE,
		CURSOR_LAST,
		CURSOR_VISIBLE,
		TEXT,
		BUTTON,
		CONTEXTUAL_BUTTON,
		MENU_BUTTON,
		OPTION,
		CHECKBOX,
		SELECTABLE,
		SLIDER,
		PROGRESS,
		PROPERTY,
		EDIT,
		CHART,
		SCROLLH,
		SCROLLV,
		TAB,
		COMBO,
		WINDOW;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__array(POINTER_SIZE, NK_CURSOR_COUNT),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(NkStyleText.SIZEOF, NkStyleText.ALIGNOF),
			__member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
			__member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
			__member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
			__member(NkStyleToggle.SIZEOF, NkStyleToggle.ALIGNOF),
			__member(NkStyleToggle.SIZEOF, NkStyleToggle.ALIGNOF),
			__member(NkStyleSelectable.SIZEOF, NkStyleSelectable.ALIGNOF),
			__member(NkStyleSlider.SIZEOF, NkStyleSlider.ALIGNOF),
			__member(NkStyleProgress.SIZEOF, NkStyleProgress.ALIGNOF),
			__member(NkStyleProperty.SIZEOF, NkStyleProperty.ALIGNOF),
			__member(NkStyleEdit.SIZEOF, NkStyleEdit.ALIGNOF),
			__member(NkStyleChart.SIZEOF, NkStyleChart.ALIGNOF),
			__member(NkStyleScrollbar.SIZEOF, NkStyleScrollbar.ALIGNOF),
			__member(NkStyleScrollbar.SIZEOF, NkStyleScrollbar.ALIGNOF),
			__member(NkStyleTab.SIZEOF, NkStyleTab.ALIGNOF),
			__member(NkStyleCombo.SIZEOF, NkStyleCombo.ALIGNOF),
			__member(NkStyleWindow.SIZEOF, NkStyleWindow.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FONT = layout.offsetof(0);
		CURSORS = layout.offsetof(1);
		CURSOR_ACTIVE = layout.offsetof(2);
		CURSOR_LAST = layout.offsetof(3);
		CURSOR_VISIBLE = layout.offsetof(4);
		TEXT = layout.offsetof(5);
		BUTTON = layout.offsetof(6);
		CONTEXTUAL_BUTTON = layout.offsetof(7);
		MENU_BUTTON = layout.offsetof(8);
		OPTION = layout.offsetof(9);
		CHECKBOX = layout.offsetof(10);
		SELECTABLE = layout.offsetof(11);
		SLIDER = layout.offsetof(12);
		PROGRESS = layout.offsetof(13);
		PROPERTY = layout.offsetof(14);
		EDIT = layout.offsetof(15);
		CHART = layout.offsetof(16);
		SCROLLH = layout.offsetof(17);
		SCROLLV = layout.offsetof(18);
		TAB = layout.offsetof(19);
		COMBO = layout.offsetof(20);
		WINDOW = layout.offsetof(21);
	}

	NkStyle(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStyle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStyle(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkUserFont} view of the struct pointed to by the {@code font} field. */
	public NkUserFont font() { return nfont(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code cursors} field. */
	public PointerBuffer cursors() { return ncursors(address()); }
	/** Returns a {@link NkCursor} view of the pointer at the specified index of the {@code cursors}. */
	public NkCursor cursors(int index) { return ncursors(address(), index); }
	/** Returns a {@link NkCursor} view of the struct pointed to by the {@code cursor_active} field. */
	public NkCursor cursor_active() { return ncursor_active(address()); }
	/** Returns a {@link NkCursor} view of the struct pointed to by the {@code cursor_last} field. */
	public NkCursor cursor_last() { return ncursor_last(address()); }
	/** Returns the value of the {@code cursor_visible} field. */
	public boolean cursor_visible() { return ncursor_visible(address()) != 0; }
	/** Returns a {@link NkStyleText} view of the {@code text} field. */
	public NkStyleText text() { return ntext(address()); }
	/** Returns a {@link NkStyleButton} view of the {@code button} field. */
	public NkStyleButton button() { return nbutton(address()); }
	/** Returns a {@link NkStyleButton} view of the {@code contextual_button} field. */
	public NkStyleButton contextual_button() { return ncontextual_button(address()); }
	/** Returns a {@link NkStyleButton} view of the {@code menu_button} field. */
	public NkStyleButton menu_button() { return nmenu_button(address()); }
	/** Returns a {@link NkStyleToggle} view of the {@code option} field. */
	public NkStyleToggle option() { return noption(address()); }
	/** Returns a {@link NkStyleToggle} view of the {@code checkbox} field. */
	public NkStyleToggle checkbox() { return ncheckbox(address()); }
	/** Returns a {@link NkStyleSelectable} view of the {@code selectable} field. */
	public NkStyleSelectable selectable() { return nselectable(address()); }
	/** Returns a {@link NkStyleSlider} view of the {@code slider} field. */
	public NkStyleSlider slider() { return nslider(address()); }
	/** Returns a {@link NkStyleProgress} view of the {@code progress} field. */
	public NkStyleProgress progress() { return nprogress(address()); }
	/** Returns a {@link NkStyleProperty} view of the {@code property} field. */
	public NkStyleProperty property() { return nproperty(address()); }
	/** Returns a {@link NkStyleEdit} view of the {@code edit} field. */
	public NkStyleEdit edit() { return nedit(address()); }
	/** Returns a {@link NkStyleChart} view of the {@code chart} field. */
	public NkStyleChart chart() { return nchart(address()); }
	/** Returns a {@link NkStyleScrollbar} view of the {@code scrollh} field. */
	public NkStyleScrollbar scrollh() { return nscrollh(address()); }
	/** Returns a {@link NkStyleScrollbar} view of the {@code scrollv} field. */
	public NkStyleScrollbar scrollv() { return nscrollv(address()); }
	/** Returns a {@link NkStyleTab} view of the {@code tab} field. */
	public NkStyleTab tab() { return ntab(address()); }
	/** Returns a {@link NkStyleCombo} view of the {@code combo} field. */
	public NkStyleCombo combo() { return ncombo(address()); }
	/** Returns a {@link NkStyleWindow} view of the {@code window} field. */
	public NkStyleWindow window() { return nwindow(address()); }

	/** Sets the address of the specified {@link NkUserFont} to the {@code font} field. */
	public NkStyle font(NkUserFont value) { nfont(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code cursors} field. */
	public NkStyle cursors(PointerBuffer value) { ncursors(address(), value); return this; }
	/** Copies the address of the specified {@link NkCursor} at the specified index of the {@code cursors} field. */
	public NkStyle cursors(int index, NkCursor value) { ncursors(address(), index, value); return this; }
	/** Sets the address of the specified {@link NkCursor} to the {@code cursor_active} field. */
	public NkStyle cursor_active(NkCursor value) { ncursor_active(address(), value); return this; }
	/** Sets the address of the specified {@link NkCursor} to the {@code cursor_last} field. */
	public NkStyle cursor_last(NkCursor value) { ncursor_last(address(), value); return this; }
	/** Sets the specified value to the {@code cursor_visible} field. */
	public NkStyle cursor_visible(boolean value) { ncursor_visible(address(), value ? 1 : 0); return this; }
	/** Copies the specified {@link NkStyleText} to the {@code text} field. */
	public NkStyle text(NkStyleText value) { ntext(address(), value); return this; }
	/** Copies the specified {@link NkStyleButton} to the {@code button} field. */
	public NkStyle button(NkStyleButton value) { nbutton(address(), value); return this; }
	/** Copies the specified {@link NkStyleButton} to the {@code contextual_button} field. */
	public NkStyle contextual_button(NkStyleButton value) { ncontextual_button(address(), value); return this; }
	/** Copies the specified {@link NkStyleButton} to the {@code menu_button} field. */
	public NkStyle menu_button(NkStyleButton value) { nmenu_button(address(), value); return this; }
	/** Copies the specified {@link NkStyleToggle} to the {@code option} field. */
	public NkStyle option(NkStyleToggle value) { noption(address(), value); return this; }
	/** Copies the specified {@link NkStyleToggle} to the {@code checkbox} field. */
	public NkStyle checkbox(NkStyleToggle value) { ncheckbox(address(), value); return this; }
	/** Copies the specified {@link NkStyleSelectable} to the {@code selectable} field. */
	public NkStyle selectable(NkStyleSelectable value) { nselectable(address(), value); return this; }
	/** Copies the specified {@link NkStyleSlider} to the {@code slider} field. */
	public NkStyle slider(NkStyleSlider value) { nslider(address(), value); return this; }
	/** Copies the specified {@link NkStyleProgress} to the {@code progress} field. */
	public NkStyle progress(NkStyleProgress value) { nprogress(address(), value); return this; }
	/** Copies the specified {@link NkStyleProperty} to the {@code property} field. */
	public NkStyle property(NkStyleProperty value) { nproperty(address(), value); return this; }
	/** Copies the specified {@link NkStyleEdit} to the {@code edit} field. */
	public NkStyle edit(NkStyleEdit value) { nedit(address(), value); return this; }
	/** Copies the specified {@link NkStyleChart} to the {@code chart} field. */
	public NkStyle chart(NkStyleChart value) { nchart(address(), value); return this; }
	/** Copies the specified {@link NkStyleScrollbar} to the {@code scrollh} field. */
	public NkStyle scrollh(NkStyleScrollbar value) { nscrollh(address(), value); return this; }
	/** Copies the specified {@link NkStyleScrollbar} to the {@code scrollv} field. */
	public NkStyle scrollv(NkStyleScrollbar value) { nscrollv(address(), value); return this; }
	/** Copies the specified {@link NkStyleTab} to the {@code tab} field. */
	public NkStyle tab(NkStyleTab value) { ntab(address(), value); return this; }
	/** Copies the specified {@link NkStyleCombo} to the {@code combo} field. */
	public NkStyle combo(NkStyleCombo value) { ncombo(address(), value); return this; }
	/** Copies the specified {@link NkStyleWindow} to the {@code window} field. */
	public NkStyle window(NkStyleWindow value) { nwindow(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkStyle set(
		NkUserFont font,
		PointerBuffer cursors,
		NkCursor cursor_active,
		NkCursor cursor_last,
		boolean cursor_visible,
		NkStyleText text,
		NkStyleButton button,
		NkStyleButton contextual_button,
		NkStyleButton menu_button,
		NkStyleToggle option,
		NkStyleToggle checkbox,
		NkStyleSelectable selectable,
		NkStyleSlider slider,
		NkStyleProgress progress,
		NkStyleProperty property,
		NkStyleEdit edit,
		NkStyleChart chart,
		NkStyleScrollbar scrollh,
		NkStyleScrollbar scrollv,
		NkStyleTab tab,
		NkStyleCombo combo,
		NkStyleWindow window
	) {
		font(font);
		cursors(cursors);
		cursor_active(cursor_active);
		cursor_last(cursor_last);
		cursor_visible(cursor_visible);
		text(text);
		button(button);
		contextual_button(contextual_button);
		menu_button(menu_button);
		option(option);
		checkbox(checkbox);
		selectable(selectable);
		slider(slider);
		progress(progress);
		property(property);
		edit(edit);
		chart(chart);
		scrollh(scrollh);
		scrollv(scrollv);
		tab(tab);
		combo(combo);
		window(window);

		return this;
	}

	/** Unsafe version of {@link #set(NkStyle) set}. */
	public NkStyle nset(long struct) {
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
	public NkStyle set(NkStyle src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStyle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStyle malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStyle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStyle calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStyle} instance allocated with {@link BufferUtils}. */
	public static NkStyle create() {
		return new NkStyle(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStyle} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStyle create(long address) {
		return address == NULL ? null : new NkStyle(address, null);
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStyle.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStyle} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStyle mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStyle} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStyle callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStyle} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyle mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyle callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #font}. */
	public static NkUserFont nfont(long struct) { return NkUserFont.create(memGetAddress(struct + NkStyle.FONT)); }
	/** Unsafe version of {@link #cursors}. */
	public static PointerBuffer ncursors(long struct) {
		return memPointerBuffer(struct + NkStyle.CURSORS, NK_CURSOR_COUNT);
	}
	/** Unsafe version of {@link #cursors(int) cursors}. */
	public static NkCursor ncursors(long struct, int index) {
		return NkCursor.create(memGetAddress(struct + NkStyle.CURSORS + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #cursor_active}. */
	public static NkCursor ncursor_active(long struct) { return NkCursor.create(memGetAddress(struct + NkStyle.CURSOR_ACTIVE)); }
	/** Unsafe version of {@link #cursor_last}. */
	public static NkCursor ncursor_last(long struct) { return NkCursor.create(memGetAddress(struct + NkStyle.CURSOR_LAST)); }
	/** Unsafe version of {@link #cursor_visible}. */
	public static int ncursor_visible(long struct) { return memGetInt(struct + NkStyle.CURSOR_VISIBLE); }
	/** Unsafe version of {@link #text}. */
	public static NkStyleText ntext(long struct) { return NkStyleText.create(struct + NkStyle.TEXT); }
	/** Unsafe version of {@link #button}. */
	public static NkStyleButton nbutton(long struct) { return NkStyleButton.create(struct + NkStyle.BUTTON); }
	/** Unsafe version of {@link #contextual_button}. */
	public static NkStyleButton ncontextual_button(long struct) { return NkStyleButton.create(struct + NkStyle.CONTEXTUAL_BUTTON); }
	/** Unsafe version of {@link #menu_button}. */
	public static NkStyleButton nmenu_button(long struct) { return NkStyleButton.create(struct + NkStyle.MENU_BUTTON); }
	/** Unsafe version of {@link #option}. */
	public static NkStyleToggle noption(long struct) { return NkStyleToggle.create(struct + NkStyle.OPTION); }
	/** Unsafe version of {@link #checkbox}. */
	public static NkStyleToggle ncheckbox(long struct) { return NkStyleToggle.create(struct + NkStyle.CHECKBOX); }
	/** Unsafe version of {@link #selectable}. */
	public static NkStyleSelectable nselectable(long struct) { return NkStyleSelectable.create(struct + NkStyle.SELECTABLE); }
	/** Unsafe version of {@link #slider}. */
	public static NkStyleSlider nslider(long struct) { return NkStyleSlider.create(struct + NkStyle.SLIDER); }
	/** Unsafe version of {@link #progress}. */
	public static NkStyleProgress nprogress(long struct) { return NkStyleProgress.create(struct + NkStyle.PROGRESS); }
	/** Unsafe version of {@link #property}. */
	public static NkStyleProperty nproperty(long struct) { return NkStyleProperty.create(struct + NkStyle.PROPERTY); }
	/** Unsafe version of {@link #edit}. */
	public static NkStyleEdit nedit(long struct) { return NkStyleEdit.create(struct + NkStyle.EDIT); }
	/** Unsafe version of {@link #chart}. */
	public static NkStyleChart nchart(long struct) { return NkStyleChart.create(struct + NkStyle.CHART); }
	/** Unsafe version of {@link #scrollh}. */
	public static NkStyleScrollbar nscrollh(long struct) { return NkStyleScrollbar.create(struct + NkStyle.SCROLLH); }
	/** Unsafe version of {@link #scrollv}. */
	public static NkStyleScrollbar nscrollv(long struct) { return NkStyleScrollbar.create(struct + NkStyle.SCROLLV); }
	/** Unsafe version of {@link #tab}. */
	public static NkStyleTab ntab(long struct) { return NkStyleTab.create(struct + NkStyle.TAB); }
	/** Unsafe version of {@link #combo}. */
	public static NkStyleCombo ncombo(long struct) { return NkStyleCombo.create(struct + NkStyle.COMBO); }
	/** Unsafe version of {@link #window}. */
	public static NkStyleWindow nwindow(long struct) { return NkStyleWindow.create(struct + NkStyle.WINDOW); }

	/** Unsafe version of {@link #font(NkUserFont) font}. */
	public static void nfont(long struct, NkUserFont value) { memPutAddress(struct + NkStyle.FONT, value.address()); }
	/** Unsafe version of {@link #cursors(PointerBuffer) cursors}. */
	public static void ncursors(long struct, PointerBuffer value) {
		if ( CHECKS ) checkBufferGT(value, NK_CURSOR_COUNT);
		memCopy(memAddress(value), struct + NkStyle.CURSORS, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #cursors(int, NkCursor) cursors}. */
	public static void ncursors(long struct, int index, NkCursor value) { memPutAddress(struct + NkStyle.CURSORS + index * POINTER_SIZE, addressSafe(value)); }
	/** Unsafe version of {@link #cursor_active(NkCursor) cursor_active}. */
	public static void ncursor_active(long struct, NkCursor value) { memPutAddress(struct + NkStyle.CURSOR_ACTIVE, addressSafe(value)); }
	/** Unsafe version of {@link #cursor_last(NkCursor) cursor_last}. */
	public static void ncursor_last(long struct, NkCursor value) { memPutAddress(struct + NkStyle.CURSOR_LAST, addressSafe(value)); }
	/** Unsafe version of {@link #cursor_visible(boolean) cursor_visible}. */
	public static void ncursor_visible(long struct, int value) { memPutInt(struct + NkStyle.CURSOR_VISIBLE, value); }
	/** Unsafe version of {@link #text(NkStyleText) text}. */
	public static void ntext(long struct, NkStyleText value) { memCopy(value.address(), struct + NkStyle.TEXT, NkStyleText.SIZEOF); }
	/** Unsafe version of {@link #button(NkStyleButton) button}. */
	public static void nbutton(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyle.BUTTON, NkStyleButton.SIZEOF); }
	/** Unsafe version of {@link #contextual_button(NkStyleButton) contextual_button}. */
	public static void ncontextual_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyle.CONTEXTUAL_BUTTON, NkStyleButton.SIZEOF); }
	/** Unsafe version of {@link #menu_button(NkStyleButton) menu_button}. */
	public static void nmenu_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyle.MENU_BUTTON, NkStyleButton.SIZEOF); }
	/** Unsafe version of {@link #option(NkStyleToggle) option}. */
	public static void noption(long struct, NkStyleToggle value) { memCopy(value.address(), struct + NkStyle.OPTION, NkStyleToggle.SIZEOF); }
	/** Unsafe version of {@link #checkbox(NkStyleToggle) checkbox}. */
	public static void ncheckbox(long struct, NkStyleToggle value) { memCopy(value.address(), struct + NkStyle.CHECKBOX, NkStyleToggle.SIZEOF); }
	/** Unsafe version of {@link #selectable(NkStyleSelectable) selectable}. */
	public static void nselectable(long struct, NkStyleSelectable value) { memCopy(value.address(), struct + NkStyle.SELECTABLE, NkStyleSelectable.SIZEOF); }
	/** Unsafe version of {@link #slider(NkStyleSlider) slider}. */
	public static void nslider(long struct, NkStyleSlider value) { memCopy(value.address(), struct + NkStyle.SLIDER, NkStyleSlider.SIZEOF); }
	/** Unsafe version of {@link #progress(NkStyleProgress) progress}. */
	public static void nprogress(long struct, NkStyleProgress value) { memCopy(value.address(), struct + NkStyle.PROGRESS, NkStyleProgress.SIZEOF); }
	/** Unsafe version of {@link #property(NkStyleProperty) property}. */
	public static void nproperty(long struct, NkStyleProperty value) { memCopy(value.address(), struct + NkStyle.PROPERTY, NkStyleProperty.SIZEOF); }
	/** Unsafe version of {@link #edit(NkStyleEdit) edit}. */
	public static void nedit(long struct, NkStyleEdit value) { memCopy(value.address(), struct + NkStyle.EDIT, NkStyleEdit.SIZEOF); }
	/** Unsafe version of {@link #chart(NkStyleChart) chart}. */
	public static void nchart(long struct, NkStyleChart value) { memCopy(value.address(), struct + NkStyle.CHART, NkStyleChart.SIZEOF); }
	/** Unsafe version of {@link #scrollh(NkStyleScrollbar) scrollh}. */
	public static void nscrollh(long struct, NkStyleScrollbar value) { memCopy(value.address(), struct + NkStyle.SCROLLH, NkStyleScrollbar.SIZEOF); }
	/** Unsafe version of {@link #scrollv(NkStyleScrollbar) scrollv}. */
	public static void nscrollv(long struct, NkStyleScrollbar value) { memCopy(value.address(), struct + NkStyle.SCROLLV, NkStyleScrollbar.SIZEOF); }
	/** Unsafe version of {@link #tab(NkStyleTab) tab}. */
	public static void ntab(long struct, NkStyleTab value) { memCopy(value.address(), struct + NkStyle.TAB, NkStyleTab.SIZEOF); }
	/** Unsafe version of {@link #combo(NkStyleCombo) combo}. */
	public static void ncombo(long struct, NkStyleCombo value) { memCopy(value.address(), struct + NkStyle.COMBO, NkStyleCombo.SIZEOF); }
	/** Unsafe version of {@link #window(NkStyleWindow) window}. */
	public static void nwindow(long struct, NkStyleWindow value) { memCopy(value.address(), struct + NkStyle.WINDOW, NkStyleWindow.SIZEOF); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NkStyle.FONT));
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

	/** An array of {@link NkStyle} structs. */
	public static class Buffer extends StructBuffer<NkStyle, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkStyle.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStyle#SIZEOF}, and its mark will be undefined.
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
		protected NkStyle newInstance(long address) {
			return new NkStyle(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkUserFont} view of the struct pointed to by the {@code font} field. */
		public NkUserFont font() { return NkStyle.nfont(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code cursors} field. */
		public PointerBuffer cursors() { return NkStyle.ncursors(address()); }
		/** Returns a {@link NkCursor} view of the pointer at the specified index of the {@code cursors}. */
		public NkCursor cursors(int index) { return NkStyle.ncursors(address(), index); }
		/** Returns a {@link NkCursor} view of the struct pointed to by the {@code cursor_active} field. */
		public NkCursor cursor_active() { return NkStyle.ncursor_active(address()); }
		/** Returns a {@link NkCursor} view of the struct pointed to by the {@code cursor_last} field. */
		public NkCursor cursor_last() { return NkStyle.ncursor_last(address()); }
		/** Returns the value of the {@code cursor_visible} field. */
		public boolean cursor_visible() { return NkStyle.ncursor_visible(address()) != 0; }
		/** Returns a {@link NkStyleText} view of the {@code text} field. */
		public NkStyleText text() { return NkStyle.ntext(address()); }
		/** Returns a {@link NkStyleButton} view of the {@code button} field. */
		public NkStyleButton button() { return NkStyle.nbutton(address()); }
		/** Returns a {@link NkStyleButton} view of the {@code contextual_button} field. */
		public NkStyleButton contextual_button() { return NkStyle.ncontextual_button(address()); }
		/** Returns a {@link NkStyleButton} view of the {@code menu_button} field. */
		public NkStyleButton menu_button() { return NkStyle.nmenu_button(address()); }
		/** Returns a {@link NkStyleToggle} view of the {@code option} field. */
		public NkStyleToggle option() { return NkStyle.noption(address()); }
		/** Returns a {@link NkStyleToggle} view of the {@code checkbox} field. */
		public NkStyleToggle checkbox() { return NkStyle.ncheckbox(address()); }
		/** Returns a {@link NkStyleSelectable} view of the {@code selectable} field. */
		public NkStyleSelectable selectable() { return NkStyle.nselectable(address()); }
		/** Returns a {@link NkStyleSlider} view of the {@code slider} field. */
		public NkStyleSlider slider() { return NkStyle.nslider(address()); }
		/** Returns a {@link NkStyleProgress} view of the {@code progress} field. */
		public NkStyleProgress progress() { return NkStyle.nprogress(address()); }
		/** Returns a {@link NkStyleProperty} view of the {@code property} field. */
		public NkStyleProperty property() { return NkStyle.nproperty(address()); }
		/** Returns a {@link NkStyleEdit} view of the {@code edit} field. */
		public NkStyleEdit edit() { return NkStyle.nedit(address()); }
		/** Returns a {@link NkStyleChart} view of the {@code chart} field. */
		public NkStyleChart chart() { return NkStyle.nchart(address()); }
		/** Returns a {@link NkStyleScrollbar} view of the {@code scrollh} field. */
		public NkStyleScrollbar scrollh() { return NkStyle.nscrollh(address()); }
		/** Returns a {@link NkStyleScrollbar} view of the {@code scrollv} field. */
		public NkStyleScrollbar scrollv() { return NkStyle.nscrollv(address()); }
		/** Returns a {@link NkStyleTab} view of the {@code tab} field. */
		public NkStyleTab tab() { return NkStyle.ntab(address()); }
		/** Returns a {@link NkStyleCombo} view of the {@code combo} field. */
		public NkStyleCombo combo() { return NkStyle.ncombo(address()); }
		/** Returns a {@link NkStyleWindow} view of the {@code window} field. */
		public NkStyleWindow window() { return NkStyle.nwindow(address()); }

		/** Sets the address of the specified {@link NkUserFont} to the {@code font} field. */
		public NkStyle.Buffer font(NkUserFont value) { NkStyle.nfont(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code cursors} field. */
		public NkStyle.Buffer cursors(PointerBuffer value) { NkStyle.ncursors(address(), value); return this; }
		/** Copies the address of the specified {@link NkCursor} at the specified index of the {@code cursors} field. */
		public NkStyle.Buffer cursors(int index, NkCursor value) { NkStyle.ncursors(address(), index, value); return this; }
		/** Sets the address of the specified {@link NkCursor} to the {@code cursor_active} field. */
		public NkStyle.Buffer cursor_active(NkCursor value) { NkStyle.ncursor_active(address(), value); return this; }
		/** Sets the address of the specified {@link NkCursor} to the {@code cursor_last} field. */
		public NkStyle.Buffer cursor_last(NkCursor value) { NkStyle.ncursor_last(address(), value); return this; }
		/** Sets the specified value to the {@code cursor_visible} field. */
		public NkStyle.Buffer cursor_visible(boolean value) { NkStyle.ncursor_visible(address(), value ? 1 : 0); return this; }
		/** Copies the specified {@link NkStyleText} to the {@code text} field. */
		public NkStyle.Buffer text(NkStyleText value) { NkStyle.ntext(address(), value); return this; }
		/** Copies the specified {@link NkStyleButton} to the {@code button} field. */
		public NkStyle.Buffer button(NkStyleButton value) { NkStyle.nbutton(address(), value); return this; }
		/** Copies the specified {@link NkStyleButton} to the {@code contextual_button} field. */
		public NkStyle.Buffer contextual_button(NkStyleButton value) { NkStyle.ncontextual_button(address(), value); return this; }
		/** Copies the specified {@link NkStyleButton} to the {@code menu_button} field. */
		public NkStyle.Buffer menu_button(NkStyleButton value) { NkStyle.nmenu_button(address(), value); return this; }
		/** Copies the specified {@link NkStyleToggle} to the {@code option} field. */
		public NkStyle.Buffer option(NkStyleToggle value) { NkStyle.noption(address(), value); return this; }
		/** Copies the specified {@link NkStyleToggle} to the {@code checkbox} field. */
		public NkStyle.Buffer checkbox(NkStyleToggle value) { NkStyle.ncheckbox(address(), value); return this; }
		/** Copies the specified {@link NkStyleSelectable} to the {@code selectable} field. */
		public NkStyle.Buffer selectable(NkStyleSelectable value) { NkStyle.nselectable(address(), value); return this; }
		/** Copies the specified {@link NkStyleSlider} to the {@code slider} field. */
		public NkStyle.Buffer slider(NkStyleSlider value) { NkStyle.nslider(address(), value); return this; }
		/** Copies the specified {@link NkStyleProgress} to the {@code progress} field. */
		public NkStyle.Buffer progress(NkStyleProgress value) { NkStyle.nprogress(address(), value); return this; }
		/** Copies the specified {@link NkStyleProperty} to the {@code property} field. */
		public NkStyle.Buffer property(NkStyleProperty value) { NkStyle.nproperty(address(), value); return this; }
		/** Copies the specified {@link NkStyleEdit} to the {@code edit} field. */
		public NkStyle.Buffer edit(NkStyleEdit value) { NkStyle.nedit(address(), value); return this; }
		/** Copies the specified {@link NkStyleChart} to the {@code chart} field. */
		public NkStyle.Buffer chart(NkStyleChart value) { NkStyle.nchart(address(), value); return this; }
		/** Copies the specified {@link NkStyleScrollbar} to the {@code scrollh} field. */
		public NkStyle.Buffer scrollh(NkStyleScrollbar value) { NkStyle.nscrollh(address(), value); return this; }
		/** Copies the specified {@link NkStyleScrollbar} to the {@code scrollv} field. */
		public NkStyle.Buffer scrollv(NkStyleScrollbar value) { NkStyle.nscrollv(address(), value); return this; }
		/** Copies the specified {@link NkStyleTab} to the {@code tab} field. */
		public NkStyle.Buffer tab(NkStyleTab value) { NkStyle.ntab(address(), value); return this; }
		/** Copies the specified {@link NkStyleCombo} to the {@code combo} field. */
		public NkStyle.Buffer combo(NkStyleCombo value) { NkStyle.ncombo(address(), value); return this; }
		/** Copies the specified {@link NkStyleWindow} to the {@code window} field. */
		public NkStyle.Buffer window(NkStyleWindow value) { NkStyle.nwindow(address(), value); return this; }

	}

}