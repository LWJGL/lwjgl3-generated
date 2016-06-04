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
 * <pre><code>struct nk_mouse {
    {@link NkMouseButton struct nk_mouse_button}[3] buttons;
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
			__array(NkMouseButton.SIZEOF, NkMouseButton.ALIGNOF, 3),
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

	/** Copies the specified {@link NkMouseButton.Buffer} to the {@code buttons} field. */
	public NkMouse buttons(NkMouseButton.Buffer value) { nbuttons(address(), value); return this; }
	/** Copies the specified {@link NkMouseButton} at the specified index of the {@code buttons} field. */
	public NkMouse buttons(int index, NkMouseButton value) { nbuttons(address(), index, value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code pos} field. */
	public NkMouse pos(NkVec2 value) { npos(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code prev} field. */
	public NkMouse prev(NkVec2 value) { nprev(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code delta} field. */
	public NkMouse delta(NkVec2 value) { ndelta(address(), value); return this; }
	/** Sets the specified value to the {@code scroll_delta} field. */
	public NkMouse scroll_delta(float value) { nscroll_delta(address(), value); return this; }
	/** Sets the specified value to the {@code grab} field. */
	public NkMouse grab(boolean value) { ngrab(address(), value); return this; }
	/** Sets the specified value to the {@code grabbed} field. */
	public NkMouse grabbed(boolean value) { ngrabbed(address(), value); return this; }
	/** Sets the specified value to the {@code ungrab} field. */
	public NkMouse ungrab(boolean value) { nungrab(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkMouse set(
		NkMouseButton.Buffer buttons,
		NkVec2 pos,
		NkVec2 prev,
		NkVec2 delta,
		float scroll_delta,
		boolean grab,
		boolean grabbed,
		boolean ungrab
	) {
		buttons(buttons);
		pos(pos);
		prev(prev);
		delta(delta);
		scroll_delta(scroll_delta);
		grab(grab);
		grabbed(grabbed);
		ungrab(ungrab);

		return this;
	}

	/** Unsafe version of {@link #set(NkMouse) set}. */
	public NkMouse nset(long struct) {
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
	public NkMouse set(NkMouse src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkMouse} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkMouse malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkMouse} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkMouse calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkMouse} instance allocated with {@link BufferUtils}. */
	public static NkMouse create() {
		return new NkMouse(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkMouse} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkMouse create(long address) {
		return address == NULL ? null : new NkMouse(address, null);
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
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

	/** Returns a new {@link NkMouse} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkMouse mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkMouse} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkMouse callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkMouse} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMouse mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMouse} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMouse callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMouse.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #buttons}. */
	public static NkMouseButton.Buffer nbuttons(long struct) {
		return NkMouseButton.create(struct + NkMouse.BUTTONS, 3);
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

	/** Unsafe version of {@link #buttons(NkMouseButton.Buffer) buttons}. */
	public static void nbuttons(long struct, NkMouseButton.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 3);
		memCopy(value.address(), struct + NkMouse.BUTTONS, value.remaining() * NkMouseButton.SIZEOF);
	}
	/** Unsafe version of {@link #buttons(int, NkMouseButton) buttons}. */
	public static void nbuttons(long struct, int index, NkMouseButton value) { memCopy(value.address(), struct + NkMouse.BUTTONS + index * NkMouseButton.SIZEOF, NkMouseButton.SIZEOF); }
	/** Unsafe version of {@link #pos(NkVec2) pos}. */
	public static void npos(long struct, NkVec2 value) { memCopy(value.address(), struct + NkMouse.POS, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #prev(NkVec2) prev}. */
	public static void nprev(long struct, NkVec2 value) { memCopy(value.address(), struct + NkMouse.PREV, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #delta(NkVec2) delta}. */
	public static void ndelta(long struct, NkVec2 value) { memCopy(value.address(), struct + NkMouse.DELTA, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #scroll_delta(float) scroll_delta}. */
	public static void nscroll_delta(long struct, float value) { memPutFloat(struct + NkMouse.SCROLL_DELTA, value); }
	/** Unsafe version of {@link #grab(boolean) grab}. */
	public static void ngrab(long struct, boolean value) { memPutByte(struct + NkMouse.GRAB, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #grabbed(boolean) grabbed}. */
	public static void ngrabbed(long struct, boolean value) { memPutByte(struct + NkMouse.GRABBED, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #ungrab(boolean) ungrab}. */
	public static void nungrab(long struct, boolean value) { memPutByte(struct + NkMouse.UNGRAB, value ? (byte)1 : (byte)0); }

	// -----------------------------------

	/** An array of {@link NkMouse} structs. */
	public static final class Buffer extends StructBuffer<NkMouse, Buffer> {

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
			return new NkMouse(address, getContainer());
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

		/** Copies the specified {@link NkMouseButton.Buffer} to the {@code buttons} field. */
		public NkMouse.Buffer buttons(NkMouseButton.Buffer value) { NkMouse.nbuttons(address(), value); return this; }
		/** Copies the specified {@link NkMouseButton} at the specified index of the {@code buttons} field. */
		public NkMouse.Buffer buttons(int index, NkMouseButton value) { NkMouse.nbuttons(address(), index, value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code pos} field. */
		public NkMouse.Buffer pos(NkVec2 value) { NkMouse.npos(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code prev} field. */
		public NkMouse.Buffer prev(NkVec2 value) { NkMouse.nprev(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code delta} field. */
		public NkMouse.Buffer delta(NkVec2 value) { NkMouse.ndelta(address(), value); return this; }
		/** Sets the specified value to the {@code scroll_delta} field. */
		public NkMouse.Buffer scroll_delta(float value) { NkMouse.nscroll_delta(address(), value); return this; }
		/** Sets the specified value to the {@code grab} field. */
		public NkMouse.Buffer grab(boolean value) { NkMouse.ngrab(address(), value); return this; }
		/** Sets the specified value to the {@code grabbed} field. */
		public NkMouse.Buffer grabbed(boolean value) { NkMouse.ngrabbed(address(), value); return this; }
		/** Sets the specified value to the {@code ungrab} field. */
		public NkMouse.Buffer ungrab(boolean value) { NkMouse.nungrab(address(), value); return this; }

	}

}