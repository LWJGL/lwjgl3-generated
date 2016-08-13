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
 * <pre><code>struct nk_text_undo_state {
    {@link NkTextUndoRecord struct nk_text_undo_record}[99] undo_rec;
    nk_rune[999] undo_char;
    short undo_point;
    short redo_point;
    short undo_char_point;
    short redo_char_point;
}</code></pre>
 */
public class NkTextUndoState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		UNDO_REC,
		UNDO_CHAR,
		UNDO_POINT,
		REDO_POINT,
		UNDO_CHAR_POINT,
		REDO_CHAR_POINT;

	static {
		Layout layout = __struct(
			__array(NkTextUndoRecord.SIZEOF, NkTextUndoRecord.ALIGNOF, 99),
			__array(4, 999),
			__member(2),
			__member(2),
			__member(2),
			__member(2)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		UNDO_REC = layout.offsetof(0);
		UNDO_CHAR = layout.offsetof(1);
		UNDO_POINT = layout.offsetof(2);
		REDO_POINT = layout.offsetof(3);
		UNDO_CHAR_POINT = layout.offsetof(4);
		REDO_CHAR_POINT = layout.offsetof(5);
	}

	NkTextUndoState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkTextUndoState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkTextUndoState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkTextUndoRecord}.Buffer view of the {@code undo_rec} field. */
	public NkTextUndoRecord.Buffer undo_rec() { return nundo_rec(address()); }
	/** Returns a {@link NkTextUndoRecord} view of the struct at the specified index of the {@code undo_rec} field. */
	public NkTextUndoRecord undo_rec(int index) { return nundo_rec(address(), index); }
	/** Returns a {@link IntBuffer} view of the {@code undo_char} field. */
	public IntBuffer undo_char() { return nundo_char(address()); }
	/** Returns the value at the specified index of the {@code undo_char} field. */
	public int undo_char(int index) { return nundo_char(address(), index); }
	/** Returns the value of the {@code undo_point} field. */
	public short undo_point() { return nundo_point(address()); }
	/** Returns the value of the {@code redo_point} field. */
	public short redo_point() { return nredo_point(address()); }
	/** Returns the value of the {@code undo_char_point} field. */
	public short undo_char_point() { return nundo_char_point(address()); }
	/** Returns the value of the {@code redo_char_point} field. */
	public short redo_char_point() { return nredo_char_point(address()); }

	// -----------------------------------

	/** Returns a new {@link NkTextUndoState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkTextUndoState create(long address) {
		return address == NULL ? null : new NkTextUndoState(address, null);
	}

	/**
	 * Create a {@link NkTextUndoState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #undo_rec}. */
	public static NkTextUndoRecord.Buffer nundo_rec(long struct) {
		return NkTextUndoRecord.create(struct + NkTextUndoState.UNDO_REC, 99);
	}
	/** Unsafe version of {@link #undo_rec(int) undo_rec}. */
	public static NkTextUndoRecord nundo_rec(long struct, int index) {
		return NkTextUndoRecord.create(struct + NkTextUndoState.UNDO_REC + index * NkTextUndoRecord.SIZEOF);
	}
	/** Unsafe version of {@link #undo_char}. */
	public static IntBuffer nundo_char(long struct) {
		return memIntBuffer(struct + NkTextUndoState.UNDO_CHAR, 999);
	}
	/** Unsafe version of {@link #undo_char(int) undo_char}. */
	public static int nundo_char(long struct, int index) { return memGetInt(struct + NkTextUndoState.UNDO_CHAR + index * 4); }
	/** Unsafe version of {@link #undo_point}. */
	public static short nundo_point(long struct) { return memGetShort(struct + NkTextUndoState.UNDO_POINT); }
	/** Unsafe version of {@link #redo_point}. */
	public static short nredo_point(long struct) { return memGetShort(struct + NkTextUndoState.REDO_POINT); }
	/** Unsafe version of {@link #undo_char_point}. */
	public static short nundo_char_point(long struct) { return memGetShort(struct + NkTextUndoState.UNDO_CHAR_POINT); }
	/** Unsafe version of {@link #redo_char_point}. */
	public static short nredo_char_point(long struct) { return memGetShort(struct + NkTextUndoState.REDO_CHAR_POINT); }

	// -----------------------------------

	/** An array of {@link NkTextUndoState} structs. */
	public static final class Buffer extends StructBuffer<NkTextUndoState, Buffer> {

		/**
		 * Creates a new {@link NkTextUndoState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkTextUndoState#SIZEOF}, and its mark will be undefined.
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
		protected NkTextUndoState newInstance(long address) {
			return new NkTextUndoState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkTextUndoRecord}.Buffer view of the {@code undo_rec} field. */
		public NkTextUndoRecord.Buffer undo_rec() { return NkTextUndoState.nundo_rec(address()); }
		/** Returns a {@link NkTextUndoRecord} view of the struct at the specified index of the {@code undo_rec} field. */
		public NkTextUndoRecord undo_rec(int index) { return NkTextUndoState.nundo_rec(address(), index); }
		/** Returns a {@link IntBuffer} view of the {@code undo_char} field. */
		public IntBuffer undo_char() { return NkTextUndoState.nundo_char(address()); }
		/** Returns the value at the specified index of the {@code undo_char} field. */
		public int undo_char(int index) { return NkTextUndoState.nundo_char(address(), index); }
		/** Returns the value of the {@code undo_point} field. */
		public short undo_point() { return NkTextUndoState.nundo_point(address()); }
		/** Returns the value of the {@code redo_point} field. */
		public short redo_point() { return NkTextUndoState.nredo_point(address()); }
		/** Returns the value of the {@code undo_char_point} field. */
		public short undo_char_point() { return NkTextUndoState.nundo_char_point(address()); }
		/** Returns the value of the {@code redo_char_point} field. */
		public short redo_char_point() { return NkTextUndoState.nredo_char_point(address()); }

	}

}