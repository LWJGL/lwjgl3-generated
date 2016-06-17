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
 * <pre><code>struct nk_text_undo_record {
    int where;
    short insert_length;
    short delete_length;
    short char_storage;
}</code></pre>
 */
public class NkTextUndoRecord extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WHERE,
		INSERT_LENGTH,
		DELETE_LENGTH,
		CHAR_STORAGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(2),
			__member(2),
			__member(2)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WHERE = layout.offsetof(0);
		INSERT_LENGTH = layout.offsetof(1);
		DELETE_LENGTH = layout.offsetof(2);
		CHAR_STORAGE = layout.offsetof(3);
	}

	NkTextUndoRecord(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkTextUndoRecord} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkTextUndoRecord(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code where} field. */
	public int where() { return nwhere(address()); }
	/** Returns the value of the {@code insert_length} field. */
	public short insert_length() { return ninsert_length(address()); }
	/** Returns the value of the {@code delete_length} field. */
	public short delete_length() { return ndelete_length(address()); }
	/** Returns the value of the {@code char_storage} field. */
	public short char_storage() { return nchar_storage(address()); }

	/** Sets the specified value to the {@code where} field. */
	public NkTextUndoRecord where(int value) { nwhere(address(), value); return this; }
	/** Sets the specified value to the {@code insert_length} field. */
	public NkTextUndoRecord insert_length(short value) { ninsert_length(address(), value); return this; }
	/** Sets the specified value to the {@code delete_length} field. */
	public NkTextUndoRecord delete_length(short value) { ndelete_length(address(), value); return this; }
	/** Sets the specified value to the {@code char_storage} field. */
	public NkTextUndoRecord char_storage(short value) { nchar_storage(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkTextUndoRecord set(
		int where,
		short insert_length,
		short delete_length,
		short char_storage
	) {
		where(where);
		insert_length(insert_length);
		delete_length(delete_length);
		char_storage(char_storage);

		return this;
	}

	/** Unsafe version of {@link #set(NkTextUndoRecord) set}. */
	public NkTextUndoRecord nset(long struct) {
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
	public NkTextUndoRecord set(NkTextUndoRecord src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkTextUndoRecord} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkTextUndoRecord malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkTextUndoRecord} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkTextUndoRecord calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkTextUndoRecord} instance allocated with {@link BufferUtils}. */
	public static NkTextUndoRecord create() {
		return new NkTextUndoRecord(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkTextUndoRecord} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkTextUndoRecord create(long address) {
		return address == NULL ? null : new NkTextUndoRecord(address, null);
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkTextUndoRecord.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkTextUndoRecord} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkTextUndoRecord mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkTextUndoRecord} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkTextUndoRecord callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkTextUndoRecord} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkTextUndoRecord mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkTextUndoRecord} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkTextUndoRecord callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextUndoRecord.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #where}. */
	public static int nwhere(long struct) { return memGetInt(struct + NkTextUndoRecord.WHERE); }
	/** Unsafe version of {@link #insert_length}. */
	public static short ninsert_length(long struct) { return memGetShort(struct + NkTextUndoRecord.INSERT_LENGTH); }
	/** Unsafe version of {@link #delete_length}. */
	public static short ndelete_length(long struct) { return memGetShort(struct + NkTextUndoRecord.DELETE_LENGTH); }
	/** Unsafe version of {@link #char_storage}. */
	public static short nchar_storage(long struct) { return memGetShort(struct + NkTextUndoRecord.CHAR_STORAGE); }

	/** Unsafe version of {@link #where(int) where}. */
	public static void nwhere(long struct, int value) { memPutInt(struct + NkTextUndoRecord.WHERE, value); }
	/** Unsafe version of {@link #insert_length(short) insert_length}. */
	public static void ninsert_length(long struct, short value) { memPutShort(struct + NkTextUndoRecord.INSERT_LENGTH, value); }
	/** Unsafe version of {@link #delete_length(short) delete_length}. */
	public static void ndelete_length(long struct, short value) { memPutShort(struct + NkTextUndoRecord.DELETE_LENGTH, value); }
	/** Unsafe version of {@link #char_storage(short) char_storage}. */
	public static void nchar_storage(long struct, short value) { memPutShort(struct + NkTextUndoRecord.CHAR_STORAGE, value); }

	// -----------------------------------

	/** An array of {@link NkTextUndoRecord} structs. */
	public static final class Buffer extends StructBuffer<NkTextUndoRecord, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkTextUndoRecord.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkTextUndoRecord#SIZEOF}, and its mark will be undefined.
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
		protected NkTextUndoRecord newInstance(long address) {
			return new NkTextUndoRecord(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code where} field. */
		public int where() { return NkTextUndoRecord.nwhere(address()); }
		/** Returns the value of the {@code insert_length} field. */
		public short insert_length() { return NkTextUndoRecord.ninsert_length(address()); }
		/** Returns the value of the {@code delete_length} field. */
		public short delete_length() { return NkTextUndoRecord.ndelete_length(address()); }
		/** Returns the value of the {@code char_storage} field. */
		public short char_storage() { return NkTextUndoRecord.nchar_storage(address()); }

		/** Sets the specified value to the {@code where} field. */
		public NkTextUndoRecord.Buffer where(int value) { NkTextUndoRecord.nwhere(address(), value); return this; }
		/** Sets the specified value to the {@code insert_length} field. */
		public NkTextUndoRecord.Buffer insert_length(short value) { NkTextUndoRecord.ninsert_length(address(), value); return this; }
		/** Sets the specified value to the {@code delete_length} field. */
		public NkTextUndoRecord.Buffer delete_length(short value) { NkTextUndoRecord.ndelete_length(address(), value); return this; }
		/** Sets the specified value to the {@code char_storage} field. */
		public NkTextUndoRecord.Buffer char_storage(short value) { NkTextUndoRecord.nchar_storage(address(), value); return this; }

	}

}