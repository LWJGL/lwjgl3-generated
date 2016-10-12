/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.nuklear.Nuklear.NK_BUTTON_MAX;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_mouse {
    {@link NkMouseButton struct nk_mouse_button} buttons[NK_BUTTON_MAX];
    {@link NkVec2 struct nk_vec2} pos;
    {@link NkVec2 struct nk_vec2} prev;
    {@link NkVec2 struct nk_vec2} delta;
    float scroll_delta;
    bool grab;
    bool grabbed;
    bool ungrab;
}</code></pre>
 */
public class NkMouse extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BUTTONS,
		POS,
		PREV,
		DELTA,
		SCROLL_DELTA,
		GRAB,
		GRABBED,
		UNGRAB;

	static {
		Layout layout = __struct(
			__array(NkMouseButton.SIZEOF, NkMouseButton.ALIGNOF, NK_BUTTON_MAX),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(4),
			__member(1),
			__member(1),
			__member(1)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BUTTONS = layout.offsetof(0);
		POS = layout.offsetof(1);
		PREV = layout.offsetof(2);
		DELTA = layout.offsetof(3);
		SCROLL_DELTA = layout.offsetof(4);
		GRAB = layout.offsetof(5);
		GRABBED = layout.offsetof(6);
		UNGRAB = layout.offsetof(7);
	}

	NkMouse(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkMouse} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkMouse(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkMouseButton}.Buffer view of the {@code buttons} field. */
	public NkMouseButton.Buffer buttons() { return nbuttons(address()); }
	/** Returns a {@link NkMouseButton} view of the struct at the specified index of the {@code buttons} field. */
	public NkMouseButton buttons(int index) { return nbuttons(address(), index); }
	/** Returns a {@link NkVec2} view of the {@code pos} field. */
	public NkVec2 pos() { return npos(address()); }
	/** Returns a {@link NkVec2} view of the {@code prev} field. */
	public NkVec2 prev() { return nprev(address()); }
	/** Returns a {@link NkVec2} view of the {@code delta} field. */
	public NkVec2 delta() { return ndelta(address()); }
	/** Returns the value of the {@code scroll_delta} field. */
	public float scroll_delta() { return nscroll_delta(address()); }
	/** Returns the value of the {@code grab} field. */
	public boolean grab() { return ngrab(address()); }
	/** Returns the value of the {@code grabbed} field. */
	public boolean grabbed() { return ngrabbed(address()); }
	/** Returns the value of the {@code ungrab} field. */
	public boolean ungrab() { return nungrab(address()); }

	// -----------------------------------

	/** Returns a new {@link NkMouse} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkMouse create(long address) {
		return address == NULL ? null : new NkMouse(address, null);
	}

	/**
	 * Create a {@link NkMouse.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #buttons}. */
	public static NkMouseButton.Buffer nbuttons(long struct) {
		return NkMouseButton.create(struct + NkMouse.BUTTONS, NK_BUTTON_MAX);
	}
	/** Unsafe version of {@link #buttons(int) buttons}. */
	public static NkMouseButton nbuttons(long struct, int index) {
		return NkMouseButton.create(struct + NkMouse.BUTTONS + index * NkMouseButton.SIZEOF);
	}
	/** Unsafe version of {@link #pos}. */
	public static NkVec2 npos(long struct) { return NkVec2.create(struct + NkMouse.POS); }
	/** Unsafe version of {@link #prev}. */
	public static NkVec2 nprev(long struct) { return NkVec2.create(struct + NkMouse.PREV); }
	/** Unsafe version of {@link #delta}. */
	public static NkVec2 ndelta(long struct) { return NkVec2.create(struct + NkMouse.DELTA); }
	/** Unsafe version of {@link #scroll_delta}. */
	public static float nscroll_delta(long struct) { return memGetFloat(struct + NkMouse.SCROLL_DELTA); }
	/** Unsafe version of {@link #grab}. */
	public static boolean ngrab(long struct) { return memGetByte(struct + NkMouse.GRAB) != 0; }
	/** Unsafe version of {@link #grabbed}. */
	public static boolean ngrabbed(long struct) { return memGetByte(struct + NkMouse.GRABBED) != 0; }
	/** Unsafe version of {@link #ungrab}. */
	public static boolean nungrab(long struct) { return memGetByte(struct + NkMouse.UNGRAB) != 0; }

	// -----------------------------------

	/** An array of {@link NkMouse} structs. */
	public static class Buffer extends StructBuffer<NkMouse, Buffer> {

		/**
		 * Creates a new {@link NkMouse.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkMouse#SIZEOF}, and its mark will be undefined.
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
		protected NkMouse newInstance(long address) {
			return new NkMouse(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkMouseButton}.Buffer view of the {@code buttons} field. */
		public NkMouseButton.Buffer buttons() { return NkMouse.nbuttons(address()); }
		/** Returns a {@link NkMouseButton} view of the struct at the specified index of the {@code buttons} field. */
		public NkMouseButton buttons(int index) { return NkMouse.nbuttons(address(), index); }
		/** Returns a {@link NkVec2} view of the {@code pos} field. */
		public NkVec2 pos() { return NkMouse.npos(address()); }
		/** Returns a {@link NkVec2} view of the {@code prev} field. */
		public NkVec2 prev() { return NkMouse.nprev(address()); }
		/** Returns a {@link NkVec2} view of the {@code delta} field. */
		public NkVec2 delta() { return NkMouse.ndelta(address()); }
		/** Returns the value of the {@code scroll_delta} field. */
		public float scroll_delta() { return NkMouse.nscroll_delta(address()); }
		/** Returns the value of the {@code grab} field. */
		public boolean grab() { return NkMouse.ngrab(address()); }
		/** Returns the value of the {@code grabbed} field. */
		public boolean grabbed() { return NkMouse.ngrabbed(address()); }
		/** Returns the value of the {@code ungrab} field. */
		public boolean ungrab() { return NkMouse.nungrab(address()); }

	}

}