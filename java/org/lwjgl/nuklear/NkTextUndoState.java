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
 * <pre><code>struct nk_text_undo_state {
    {@link NkTextUndoRecord struct nk_text_undo_record}[99] undo_rec;
    nk_rune[999] undo_char;
    short undo_point;
    short redo_point;
    short undo_char_point;
    short redo_char_point;
}</code></pre>
 */
public class NkTextUndoState extends Struct implements NativeResource {

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

	/** Copies the specified {@link NkTextUndoRecord.Buffer} to the {@code undo_rec} field. */
	public NkTextUndoState undo_rec(NkTextUndoRecord.Buffer value) { nundo_rec(address(), value); return this; }
	/** Copies the specified {@link NkTextUndoRecord} at the specified index of the {@code undo_rec} field. */
	public NkTextUndoState undo_rec(int index, NkTextUndoRecord value) { nundo_rec(address(), index, value); return this; }
	/** Copies the specified {@link IntBuffer} to the {@code undo_char} field. */
	public NkTextUndoState undo_char(IntBuffer value) { nundo_char(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code undo_char} field. */
	public NkTextUndoState undo_char(int index, int value) { nundo_char(address(), index, value); return this; }
	/** Sets the specified value to the {@code undo_point} field. */
	public NkTextUndoState undo_point(short value) { nundo_point(address(), value); return this; }
	/** Sets the specified value to the {@code redo_point} field. */
	public NkTextUndoState redo_point(short value) { nredo_point(address(), value); return this; }
	/** Sets the specified value to the {@code undo_char_point} field. */
	public NkTextUndoState undo_char_point(short value) { nundo_char_point(address(), value); return this; }
	/** Sets the specified value to the {@code redo_char_point} field. */
	public NkTextUndoState redo_char_point(short value) { nredo_char_point(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkTextUndoState set(
		NkTextUndoRecord.Buffer undo_rec,
		IntBuffer undo_char,
		short undo_point,
		short redo_point,
		short undo_char_point,
		short redo_char_point
	) {
		undo_rec(undo_rec);
		undo_char(undo_char);
		undo_point(undo_point);
		redo_point(redo_point);
		undo_char_point(undo_char_point);
		redo_char_point(redo_char_point);

		return this;
	}

	/** Unsafe version of {@link #set(NkTextUndoState) set}. */
	public NkTextUndoState nset(long struct) {
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
	public NkTextUndoState set(NkTextUndoState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkTextUndoState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkTextUndoState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkTextUndoState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkTextUndoState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkTextUndoState} instance allocated with {@link BufferUtils}. */
	public static NkTextUndoState create() {
		return new NkTextUndoState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkTextUndoState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkTextUndoState create(long address) {
		return address == NULL ? null : new NkTextUndoState(address, null);
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
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

	/** Returns a new {@link NkTextUndoState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkTextUndoState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkTextUndoState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkTextUndoState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkTextUndoState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkTextUndoState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkTextUndoState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkTextUndoState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextUndoState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

	/** Unsafe version of {@link #undo_rec(NkTextUndoRecord.Buffer) undo_rec}. */
	public static void nundo_rec(long struct, NkTextUndoRecord.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 99);
		memCopy(value.address(), struct + NkTextUndoState.UNDO_REC, value.remaining() * NkTextUndoRecord.SIZEOF);
	}
	/** Unsafe version of {@link #undo_rec(int, NkTextUndoRecord) undo_rec}. */
	public static void nundo_rec(long struct, int index, NkTextUndoRecord value) { memCopy(value.address(), struct + NkTextUndoState.UNDO_REC + index * NkTextUndoRecord.SIZEOF, NkTextUndoRecord.SIZEOF); }
	/** Unsafe version of {@link #undo_char(IntBuffer) undo_char}. */
	public static void nundo_char(long struct, IntBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 999);
		memCopy(memAddress(value), struct + NkTextUndoState.UNDO_CHAR, value.remaining() * 4);
	}
	/** Unsafe version of {@link #undo_char(int, int) undo_char}. */
	public static void nundo_char(long struct, int index, int value) { memPutInt(struct + NkTextUndoState.UNDO_CHAR + index * 4, value); }
	/** Unsafe version of {@link #undo_point(short) undo_point}. */
	public static void nundo_point(long struct, short value) { memPutShort(struct + NkTextUndoState.UNDO_POINT, value); }
	/** Unsafe version of {@link #redo_point(short) redo_point}. */
	public static void nredo_point(long struct, short value) { memPutShort(struct + NkTextUndoState.REDO_POINT, value); }
	/** Unsafe version of {@link #undo_char_point(short) undo_char_point}. */
	public static void nundo_char_point(long struct, short value) { memPutShort(struct + NkTextUndoState.UNDO_CHAR_POINT, value); }
	/** Unsafe version of {@link #redo_char_point(short) redo_char_point}. */
	public static void nredo_char_point(long struct, short value) { memPutShort(struct + NkTextUndoState.REDO_CHAR_POINT, value); }

	// -----------------------------------

	/** An array of {@link NkTextUndoState} structs. */
	public static final class Buffer extends StructBuffer<NkTextUndoState, Buffer> implements NativeResource {

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

		/** Copies the specified {@link NkTextUndoRecord.Buffer} to the {@code undo_rec} field. */
		public NkTextUndoState.Buffer undo_rec(NkTextUndoRecord.Buffer value) { NkTextUndoState.nundo_rec(address(), value); return this; }
		/** Copies the specified {@link NkTextUndoRecord} at the specified index of the {@code undo_rec} field. */
		public NkTextUndoState.Buffer undo_rec(int index, NkTextUndoRecord value) { NkTextUndoState.nundo_rec(address(), index, value); return this; }
		/** Copies the specified {@link IntBuffer} to the {@code undo_char} field. */
		public NkTextUndoState.Buffer undo_char(IntBuffer value) { NkTextUndoState.nundo_char(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code undo_char} field. */
		public NkTextUndoState.Buffer undo_char(int index, int value) { NkTextUndoState.nundo_char(address(), index, value); return this; }
		/** Sets the specified value to the {@code undo_point} field. */
		public NkTextUndoState.Buffer undo_point(short value) { NkTextUndoState.nundo_point(address(), value); return this; }
		/** Sets the specified value to the {@code redo_point} field. */
		public NkTextUndoState.Buffer redo_point(short value) { NkTextUndoState.nredo_point(address(), value); return this; }
		/** Sets the specified value to the {@code undo_char_point} field. */
		public NkTextUndoState.Buffer undo_char_point(short value) { NkTextUndoState.nundo_char_point(address(), value); return this; }
		/** Sets the specified value to the {@code redo_char_point} field. */
		public NkTextUndoState.Buffer redo_char_point(short value) { NkTextUndoState.nredo_char_point(address(), value); return this; }

	}

}