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
 * <pre><code>struct nk_text_edit {
    {@link NkClipboard struct nk_clipboard} clip;
    {@link NkStr struct nk_str} string;
    nk_filter filter;
    {@link NkVec2 struct nk_vec2} scrollbar;
    int cursor;
    int select_start;
    int select_end;
    unsigned char mode;
    bool cursor_at_end_of_line;
    bool initialized;
    bool has_preferred_x;
    bool single_line;
    bool active;
    char[1];
    float preferred_x;
    {@link NkTextUndoState struct nk_text_undo_state} undo;
}</code></pre>
 */
public class NkTextEdit extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		CLIP,
		STRING,
		FILTER,
		SCROLLBAR,
		CURSOR,
		SELECT_START,
		SELECT_END,
		MODE,
		CURSOR_AT_END_OF_LINE,
		INITIALIZED,
		HAS_PREFERRED_X,
		SINGLE_LINE,
		ACTIVE,
		PREFERRED_X,
		UNDO;

	static {
		Layout layout = __struct(
			__member(NkClipboard.SIZEOF, NkClipboard.ALIGNOF),
			__member(NkStr.SIZEOF, NkStr.ALIGNOF),
			__member(POINTER_SIZE),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__padding(1, true),
			__member(4),
			__member(NkTextUndoState.SIZEOF, NkTextUndoState.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		CLIP = layout.offsetof(0);
		STRING = layout.offsetof(1);
		FILTER = layout.offsetof(2);
		SCROLLBAR = layout.offsetof(3);
		CURSOR = layout.offsetof(4);
		SELECT_START = layout.offsetof(5);
		SELECT_END = layout.offsetof(6);
		MODE = layout.offsetof(7);
		CURSOR_AT_END_OF_LINE = layout.offsetof(8);
		INITIALIZED = layout.offsetof(9);
		HAS_PREFERRED_X = layout.offsetof(10);
		SINGLE_LINE = layout.offsetof(11);
		ACTIVE = layout.offsetof(12);
		PREFERRED_X = layout.offsetof(14);
		UNDO = layout.offsetof(15);
	}

	NkTextEdit(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkTextEdit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkTextEdit(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkClipboard} view of the {@code clip} field. */
	public NkClipboard clip() { return nclip(address()); }
	/** Returns a {@link NkStr} view of the {@code string} field. */
	public NkStr string() { return nstring(address()); }
	/** Returns the {@code NkFilterCallback} instance at the {@code filter} field. */
	public NkFilterCallback filter() { return NkFilterCallback.create(nfilter(address())); }
	/** Returns a {@link NkVec2} view of the {@code scrollbar} field. */
	public NkVec2 scrollbar() { return nscrollbar(address()); }
	/** Returns the value of the {@code cursor} field. */
	public int cursor() { return ncursor(address()); }
	/** Returns the value of the {@code select_start} field. */
	public int select_start() { return nselect_start(address()); }
	/** Returns the value of the {@code select_end} field. */
	public int select_end() { return nselect_end(address()); }
	/** Returns the value of the {@code mode} field. */
	public byte mode() { return nmode(address()); }
	/** Returns the value of the {@code cursor_at_end_of_line} field. */
	public boolean cursor_at_end_of_line() { return ncursor_at_end_of_line(address()); }
	/** Returns the value of the {@code initialized} field. */
	public boolean initialized() { return ninitialized(address()); }
	/** Returns the value of the {@code has_preferred_x} field. */
	public boolean has_preferred_x() { return nhas_preferred_x(address()); }
	/** Returns the value of the {@code single_line} field. */
	public boolean single_line() { return nsingle_line(address()); }
	/** Returns the value of the {@code active} field. */
	public boolean active() { return nactive(address()); }
	/** Returns the value of the {@code preferred_x} field. */
	public float preferred_x() { return npreferred_x(address()); }
	/** Returns a {@link NkTextUndoState} view of the {@code undo} field. */
	public NkTextUndoState undo() { return nundo(address()); }

	/** Copies the specified {@link NkClipboard} to the {@code clip} field. */
	public NkTextEdit clip(NkClipboard value) { nclip(address(), value); return this; }
	/** Copies the specified {@link NkStr} to the {@code string} field. */
	public NkTextEdit string(NkStr value) { nstring(address(), value); return this; }
	/** Sets the address of the specified {@link NkFilterCallbackI} to the {@code filter} field. */
	public NkTextEdit filter(NkFilterCallbackI value) { nfilter(address(), addressSafe(value)); return this; }
	/** Copies the specified {@link NkVec2} to the {@code scrollbar} field. */
	public NkTextEdit scrollbar(NkVec2 value) { nscrollbar(address(), value); return this; }
	/** Sets the specified value to the {@code cursor} field. */
	public NkTextEdit cursor(int value) { ncursor(address(), value); return this; }
	/** Sets the specified value to the {@code select_start} field. */
	public NkTextEdit select_start(int value) { nselect_start(address(), value); return this; }
	/** Sets the specified value to the {@code select_end} field. */
	public NkTextEdit select_end(int value) { nselect_end(address(), value); return this; }
	/** Sets the specified value to the {@code mode} field. */
	public NkTextEdit mode(byte value) { nmode(address(), value); return this; }
	/** Sets the specified value to the {@code cursor_at_end_of_line} field. */
	public NkTextEdit cursor_at_end_of_line(boolean value) { ncursor_at_end_of_line(address(), value); return this; }
	/** Sets the specified value to the {@code initialized} field. */
	public NkTextEdit initialized(boolean value) { ninitialized(address(), value); return this; }
	/** Sets the specified value to the {@code has_preferred_x} field. */
	public NkTextEdit has_preferred_x(boolean value) { nhas_preferred_x(address(), value); return this; }
	/** Sets the specified value to the {@code single_line} field. */
	public NkTextEdit single_line(boolean value) { nsingle_line(address(), value); return this; }
	/** Sets the specified value to the {@code active} field. */
	public NkTextEdit active(boolean value) { nactive(address(), value); return this; }
	/** Sets the specified value to the {@code preferred_x} field. */
	public NkTextEdit preferred_x(float value) { npreferred_x(address(), value); return this; }
	/** Copies the specified {@link NkTextUndoState} to the {@code undo} field. */
	public NkTextEdit undo(NkTextUndoState value) { nundo(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkTextEdit set(
		NkClipboard clip,
		NkStr string,
		NkFilterCallbackI filter,
		NkVec2 scrollbar,
		int cursor,
		int select_start,
		int select_end,
		byte mode,
		boolean cursor_at_end_of_line,
		boolean initialized,
		boolean has_preferred_x,
		boolean single_line,
		boolean active,
		float preferred_x,
		NkTextUndoState undo
	) {
		clip(clip);
		string(string);
		filter(filter);
		scrollbar(scrollbar);
		cursor(cursor);
		select_start(select_start);
		select_end(select_end);
		mode(mode);
		cursor_at_end_of_line(cursor_at_end_of_line);
		initialized(initialized);
		has_preferred_x(has_preferred_x);
		single_line(single_line);
		active(active);
		preferred_x(preferred_x);
		undo(undo);

		return this;
	}

	/** Unsafe version of {@link #set(NkTextEdit) set}. */
	public NkTextEdit nset(long struct) {
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
	public NkTextEdit set(NkTextEdit src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkTextEdit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkTextEdit malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkTextEdit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkTextEdit calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkTextEdit} instance allocated with {@link BufferUtils}. */
	public static NkTextEdit create() {
		return new NkTextEdit(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkTextEdit} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkTextEdit create(long address) {
		return address == NULL ? null : new NkTextEdit(address, null);
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkTextEdit.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkTextEdit} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkTextEdit mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkTextEdit} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkTextEdit callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkTextEdit} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkTextEdit mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkTextEdit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkTextEdit callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkTextEdit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #clip}. */
	public static NkClipboard nclip(long struct) { return NkClipboard.create(struct + NkTextEdit.CLIP); }
	/** Unsafe version of {@link #string}. */
	public static NkStr nstring(long struct) { return NkStr.create(struct + NkTextEdit.STRING); }
	/** Unsafe version of {@link #filter}. */
	public static long nfilter(long struct) { return memGetAddress(struct + NkTextEdit.FILTER); }
	/** Unsafe version of {@link #scrollbar}. */
	public static NkVec2 nscrollbar(long struct) { return NkVec2.create(struct + NkTextEdit.SCROLLBAR); }
	/** Unsafe version of {@link #cursor}. */
	public static int ncursor(long struct) { return memGetInt(struct + NkTextEdit.CURSOR); }
	/** Unsafe version of {@link #select_start}. */
	public static int nselect_start(long struct) { return memGetInt(struct + NkTextEdit.SELECT_START); }
	/** Unsafe version of {@link #select_end}. */
	public static int nselect_end(long struct) { return memGetInt(struct + NkTextEdit.SELECT_END); }
	/** Unsafe version of {@link #mode}. */
	public static byte nmode(long struct) { return memGetByte(struct + NkTextEdit.MODE); }
	/** Unsafe version of {@link #cursor_at_end_of_line}. */
	public static boolean ncursor_at_end_of_line(long struct) { return memGetByte(struct + NkTextEdit.CURSOR_AT_END_OF_LINE) != 0; }
	/** Unsafe version of {@link #initialized}. */
	public static boolean ninitialized(long struct) { return memGetByte(struct + NkTextEdit.INITIALIZED) != 0; }
	/** Unsafe version of {@link #has_preferred_x}. */
	public static boolean nhas_preferred_x(long struct) { return memGetByte(struct + NkTextEdit.HAS_PREFERRED_X) != 0; }
	/** Unsafe version of {@link #single_line}. */
	public static boolean nsingle_line(long struct) { return memGetByte(struct + NkTextEdit.SINGLE_LINE) != 0; }
	/** Unsafe version of {@link #active}. */
	public static boolean nactive(long struct) { return memGetByte(struct + NkTextEdit.ACTIVE) != 0; }
	/** Unsafe version of {@link #preferred_x}. */
	public static float npreferred_x(long struct) { return memGetFloat(struct + NkTextEdit.PREFERRED_X); }
	/** Unsafe version of {@link #undo}. */
	public static NkTextUndoState nundo(long struct) { return NkTextUndoState.create(struct + NkTextEdit.UNDO); }

	/** Unsafe version of {@link #clip(NkClipboard) clip}. */
	public static void nclip(long struct, NkClipboard value) { memCopy(value.address(), struct + NkTextEdit.CLIP, NkClipboard.SIZEOF); }
	/** Unsafe version of {@link #string(NkStr) string}. */
	public static void nstring(long struct, NkStr value) { memCopy(value.address(), struct + NkTextEdit.STRING, NkStr.SIZEOF); }
	/** Unsafe version of {@link #filter(NkFilterCallbackI) filter}. */
	public static void nfilter(long struct, long value) { memPutAddress(struct + NkTextEdit.FILTER, value); }
	/** Unsafe version of {@link #scrollbar(NkVec2) scrollbar}. */
	public static void nscrollbar(long struct, NkVec2 value) { memCopy(value.address(), struct + NkTextEdit.SCROLLBAR, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #cursor(int) cursor}. */
	public static void ncursor(long struct, int value) { memPutInt(struct + NkTextEdit.CURSOR, value); }
	/** Unsafe version of {@link #select_start(int) select_start}. */
	public static void nselect_start(long struct, int value) { memPutInt(struct + NkTextEdit.SELECT_START, value); }
	/** Unsafe version of {@link #select_end(int) select_end}. */
	public static void nselect_end(long struct, int value) { memPutInt(struct + NkTextEdit.SELECT_END, value); }
	/** Unsafe version of {@link #mode(byte) mode}. */
	public static void nmode(long struct, byte value) { memPutByte(struct + NkTextEdit.MODE, value); }
	/** Unsafe version of {@link #cursor_at_end_of_line(boolean) cursor_at_end_of_line}. */
	public static void ncursor_at_end_of_line(long struct, boolean value) { memPutByte(struct + NkTextEdit.CURSOR_AT_END_OF_LINE, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #initialized(boolean) initialized}. */
	public static void ninitialized(long struct, boolean value) { memPutByte(struct + NkTextEdit.INITIALIZED, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #has_preferred_x(boolean) has_preferred_x}. */
	public static void nhas_preferred_x(long struct, boolean value) { memPutByte(struct + NkTextEdit.HAS_PREFERRED_X, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #single_line(boolean) single_line}. */
	public static void nsingle_line(long struct, boolean value) { memPutByte(struct + NkTextEdit.SINGLE_LINE, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #active(boolean) active}. */
	public static void nactive(long struct, boolean value) { memPutByte(struct + NkTextEdit.ACTIVE, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #preferred_x(float) preferred_x}. */
	public static void npreferred_x(long struct, float value) { memPutFloat(struct + NkTextEdit.PREFERRED_X, value); }
	/** Unsafe version of {@link #undo(NkTextUndoState) undo}. */
	public static void nundo(long struct, NkTextUndoState value) { memCopy(value.address(), struct + NkTextEdit.UNDO, NkTextUndoState.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkTextEdit} structs. */
	public static final class Buffer extends StructBuffer<NkTextEdit, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkTextEdit.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkTextEdit#SIZEOF}, and its mark will be undefined.
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
		protected NkTextEdit newInstance(long address) {
			return new NkTextEdit(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkClipboard} view of the {@code clip} field. */
		public NkClipboard clip() { return NkTextEdit.nclip(address()); }
		/** Returns a {@link NkStr} view of the {@code string} field. */
		public NkStr string() { return NkTextEdit.nstring(address()); }
		/** Returns the {@code NkFilterCallback} instance at the {@code filter} field. */
		public NkFilterCallback filter() { return NkFilterCallback.create(NkTextEdit.nfilter(address())); }
		/** Returns a {@link NkVec2} view of the {@code scrollbar} field. */
		public NkVec2 scrollbar() { return NkTextEdit.nscrollbar(address()); }
		/** Returns the value of the {@code cursor} field. */
		public int cursor() { return NkTextEdit.ncursor(address()); }
		/** Returns the value of the {@code select_start} field. */
		public int select_start() { return NkTextEdit.nselect_start(address()); }
		/** Returns the value of the {@code select_end} field. */
		public int select_end() { return NkTextEdit.nselect_end(address()); }
		/** Returns the value of the {@code mode} field. */
		public byte mode() { return NkTextEdit.nmode(address()); }
		/** Returns the value of the {@code cursor_at_end_of_line} field. */
		public boolean cursor_at_end_of_line() { return NkTextEdit.ncursor_at_end_of_line(address()); }
		/** Returns the value of the {@code initialized} field. */
		public boolean initialized() { return NkTextEdit.ninitialized(address()); }
		/** Returns the value of the {@code has_preferred_x} field. */
		public boolean has_preferred_x() { return NkTextEdit.nhas_preferred_x(address()); }
		/** Returns the value of the {@code single_line} field. */
		public boolean single_line() { return NkTextEdit.nsingle_line(address()); }
		/** Returns the value of the {@code active} field. */
		public boolean active() { return NkTextEdit.nactive(address()); }
		/** Returns the value of the {@code preferred_x} field. */
		public float preferred_x() { return NkTextEdit.npreferred_x(address()); }
		/** Returns a {@link NkTextUndoState} view of the {@code undo} field. */
		public NkTextUndoState undo() { return NkTextEdit.nundo(address()); }

		/** Copies the specified {@link NkClipboard} to the {@code clip} field. */
		public NkTextEdit.Buffer clip(NkClipboard value) { NkTextEdit.nclip(address(), value); return this; }
		/** Copies the specified {@link NkStr} to the {@code string} field. */
		public NkTextEdit.Buffer string(NkStr value) { NkTextEdit.nstring(address(), value); return this; }
		/** Sets the address of the specified {@link NkFilterCallbackI} to the {@code filter} field. */
		public NkTextEdit.Buffer filter(NkFilterCallbackI value) { NkTextEdit.nfilter(address(), addressSafe(value)); return this; }
		/** Copies the specified {@link NkVec2} to the {@code scrollbar} field. */
		public NkTextEdit.Buffer scrollbar(NkVec2 value) { NkTextEdit.nscrollbar(address(), value); return this; }
		/** Sets the specified value to the {@code cursor} field. */
		public NkTextEdit.Buffer cursor(int value) { NkTextEdit.ncursor(address(), value); return this; }
		/** Sets the specified value to the {@code select_start} field. */
		public NkTextEdit.Buffer select_start(int value) { NkTextEdit.nselect_start(address(), value); return this; }
		/** Sets the specified value to the {@code select_end} field. */
		public NkTextEdit.Buffer select_end(int value) { NkTextEdit.nselect_end(address(), value); return this; }
		/** Sets the specified value to the {@code mode} field. */
		public NkTextEdit.Buffer mode(byte value) { NkTextEdit.nmode(address(), value); return this; }
		/** Sets the specified value to the {@code cursor_at_end_of_line} field. */
		public NkTextEdit.Buffer cursor_at_end_of_line(boolean value) { NkTextEdit.ncursor_at_end_of_line(address(), value); return this; }
		/** Sets the specified value to the {@code initialized} field. */
		public NkTextEdit.Buffer initialized(boolean value) { NkTextEdit.ninitialized(address(), value); return this; }
		/** Sets the specified value to the {@code has_preferred_x} field. */
		public NkTextEdit.Buffer has_preferred_x(boolean value) { NkTextEdit.nhas_preferred_x(address(), value); return this; }
		/** Sets the specified value to the {@code single_line} field. */
		public NkTextEdit.Buffer single_line(boolean value) { NkTextEdit.nsingle_line(address(), value); return this; }
		/** Sets the specified value to the {@code active} field. */
		public NkTextEdit.Buffer active(boolean value) { NkTextEdit.nactive(address(), value); return this; }
		/** Sets the specified value to the {@code preferred_x} field. */
		public NkTextEdit.Buffer preferred_x(float value) { NkTextEdit.npreferred_x(address(), value); return this; }
		/** Copies the specified {@link NkTextUndoState} to the {@code undo} field. */
		public NkTextEdit.Buffer undo(NkTextUndoState value) { NkTextEdit.nundo(address(), value); return this; }

	}

}