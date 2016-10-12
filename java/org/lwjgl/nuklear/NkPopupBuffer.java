/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_popup_buffer {
    nk_size begin;
    nk_size parent;
    nk_size last;
    nk_size end;
    int active;
}</code></pre>
 */
public class NkPopupBuffer extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BEGIN,
		PARENT,
		LAST,
		END,
		ACTIVE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BEGIN = layout.offsetof(0);
		PARENT = layout.offsetof(1);
		LAST = layout.offsetof(2);
		END = layout.offsetof(3);
		ACTIVE = layout.offsetof(4);
	}

	NkPopupBuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkPopupBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkPopupBuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code begin} field. */
	public long begin() { return nbegin(address()); }
	/** Returns the value of the {@code parent} field. */
	public long parent() { return nparent(address()); }
	/** Returns the value of the {@code last} field. */
	public long last() { return nlast(address()); }
	/** Returns the value of the {@code end} field. */
	public long end() { return nend(address()); }
	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }

	// -----------------------------------

	/** Returns a new {@link NkPopupBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPopupBuffer create(long address) {
		return address == NULL ? null : new NkPopupBuffer(address, null);
	}

	/**
	 * Create a {@link NkPopupBuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #begin}. */
	public static long nbegin(long struct) { return memGetAddress(struct + NkPopupBuffer.BEGIN); }
	/** Unsafe version of {@link #parent}. */
	public static long nparent(long struct) { return memGetAddress(struct + NkPopupBuffer.PARENT); }
	/** Unsafe version of {@link #last}. */
	public static long nlast(long struct) { return memGetAddress(struct + NkPopupBuffer.LAST); }
	/** Unsafe version of {@link #end}. */
	public static long nend(long struct) { return memGetAddress(struct + NkPopupBuffer.END); }
	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkPopupBuffer.ACTIVE); }

	// -----------------------------------

	/** An array of {@link NkPopupBuffer} structs. */
	public static class Buffer extends StructBuffer<NkPopupBuffer, Buffer> {

		/**
		 * Creates a new {@link NkPopupBuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkPopupBuffer#SIZEOF}, and its mark will be undefined.
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
		protected NkPopupBuffer newInstance(long address) {
			return new NkPopupBuffer(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code begin} field. */
		public long begin() { return NkPopupBuffer.nbegin(address()); }
		/** Returns the value of the {@code parent} field. */
		public long parent() { return NkPopupBuffer.nparent(address()); }
		/** Returns the value of the {@code last} field. */
		public long last() { return NkPopupBuffer.nlast(address()); }
		/** Returns the value of the {@code end} field. */
		public long end() { return NkPopupBuffer.nend(address()); }
		/** Returns the value of the {@code active} field. */
		public int active() { return NkPopupBuffer.nactive(address()); }

	}

}