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
 * <pre><code>struct nk_edit_state {
    nk_hash name;
    unsigned int seq;
    unsigned int old;
    int active;
    int prev;
    int cursor;
    int sel_start;
    int sel_end;
    {@link NkScroll struct nk_scroll} scrollbar;
    unsigned char mode;
    bool single_line;
}</code></pre>
 */
public class NkEditState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		SEQ,
		OLD,
		ACTIVE,
		PREV,
		CURSOR,
		SEL_START,
		SEL_END,
		SCROLLBAR,
		MODE,
		SINGLE_LINE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkScroll.SIZEOF, NkScroll.ALIGNOF),
			__member(1),
			__member(1)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NAME = layout.offsetof(0);
		SEQ = layout.offsetof(1);
		OLD = layout.offsetof(2);
		ACTIVE = layout.offsetof(3);
		PREV = layout.offsetof(4);
		CURSOR = layout.offsetof(5);
		SEL_START = layout.offsetof(6);
		SEL_END = layout.offsetof(7);
		SCROLLBAR = layout.offsetof(8);
		MODE = layout.offsetof(9);
		SINGLE_LINE = layout.offsetof(10);
	}

	NkEditState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkEditState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkEditState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code name} field. */
	public int name() { return nname(address()); }
	/** Returns the value of the {@code seq} field. */
	public int seq() { return nseq(address()); }
	/** Returns the value of the {@code old} field. */
	public int old() { return nold(address()); }
	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }
	/** Returns the value of the {@code prev} field. */
	public int prev() { return nprev(address()); }
	/** Returns the value of the {@code cursor} field. */
	public int cursor() { return ncursor(address()); }
	/** Returns the value of the {@code sel_start} field. */
	public int sel_start() { return nsel_start(address()); }
	/** Returns the value of the {@code sel_end} field. */
	public int sel_end() { return nsel_end(address()); }
	/** Returns a {@link NkScroll} view of the {@code scrollbar} field. */
	public NkScroll scrollbar() { return nscrollbar(address()); }
	/** Returns the value of the {@code mode} field. */
	public byte mode() { return nmode(address()); }
	/** Returns the value of the {@code single_line} field. */
	public boolean single_line() { return nsingle_line(address()); }

	/** Sets the specified value to the {@code name} field. */
	public NkEditState name(int value) { nname(address(), value); return this; }
	/** Sets the specified value to the {@code seq} field. */
	public NkEditState seq(int value) { nseq(address(), value); return this; }
	/** Sets the specified value to the {@code old} field. */
	public NkEditState old(int value) { nold(address(), value); return this; }
	/** Sets the specified value to the {@code active} field. */
	public NkEditState active(int value) { nactive(address(), value); return this; }
	/** Sets the specified value to the {@code prev} field. */
	public NkEditState prev(int value) { nprev(address(), value); return this; }
	/** Sets the specified value to the {@code cursor} field. */
	public NkEditState cursor(int value) { ncursor(address(), value); return this; }
	/** Sets the specified value to the {@code sel_start} field. */
	public NkEditState sel_start(int value) { nsel_start(address(), value); return this; }
	/** Sets the specified value to the {@code sel_end} field. */
	public NkEditState sel_end(int value) { nsel_end(address(), value); return this; }
	/** Copies the specified {@link NkScroll} to the {@code scrollbar} field. */
	public NkEditState scrollbar(NkScroll value) { nscrollbar(address(), value); return this; }
	/** Sets the specified value to the {@code mode} field. */
	public NkEditState mode(byte value) { nmode(address(), value); return this; }
	/** Sets the specified value to the {@code single_line} field. */
	public NkEditState single_line(boolean value) { nsingle_line(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkEditState set(
		int name,
		int seq,
		int old,
		int active,
		int prev,
		int cursor,
		int sel_start,
		int sel_end,
		NkScroll scrollbar,
		byte mode,
		boolean single_line
	) {
		name(name);
		seq(seq);
		old(old);
		active(active);
		prev(prev);
		cursor(cursor);
		sel_start(sel_start);
		sel_end(sel_end);
		scrollbar(scrollbar);
		mode(mode);
		single_line(single_line);

		return this;
	}

	/** Unsafe version of {@link #set(NkEditState) set}. */
	public NkEditState nset(long struct) {
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
	public NkEditState set(NkEditState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkEditState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkEditState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkEditState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkEditState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkEditState} instance allocated with {@link BufferUtils}. */
	public static NkEditState create() {
		return new NkEditState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkEditState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkEditState create(long address) {
		return address == NULL ? null : new NkEditState(address, null);
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkEditState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkEditState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkEditState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkEditState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkEditState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkEditState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkEditState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkEditState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkEditState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkEditState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #name}. */
	public static int nname(long struct) { return memGetInt(struct + NkEditState.NAME); }
	/** Unsafe version of {@link #seq}. */
	public static int nseq(long struct) { return memGetInt(struct + NkEditState.SEQ); }
	/** Unsafe version of {@link #old}. */
	public static int nold(long struct) { return memGetInt(struct + NkEditState.OLD); }
	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkEditState.ACTIVE); }
	/** Unsafe version of {@link #prev}. */
	public static int nprev(long struct) { return memGetInt(struct + NkEditState.PREV); }
	/** Unsafe version of {@link #cursor}. */
	public static int ncursor(long struct) { return memGetInt(struct + NkEditState.CURSOR); }
	/** Unsafe version of {@link #sel_start}. */
	public static int nsel_start(long struct) { return memGetInt(struct + NkEditState.SEL_START); }
	/** Unsafe version of {@link #sel_end}. */
	public static int nsel_end(long struct) { return memGetInt(struct + NkEditState.SEL_END); }
	/** Unsafe version of {@link #scrollbar}. */
	public static NkScroll nscrollbar(long struct) { return NkScroll.create(struct + NkEditState.SCROLLBAR); }
	/** Unsafe version of {@link #mode}. */
	public static byte nmode(long struct) { return memGetByte(struct + NkEditState.MODE); }
	/** Unsafe version of {@link #single_line}. */
	public static boolean nsingle_line(long struct) { return memGetByte(struct + NkEditState.SINGLE_LINE) != 0; }

	/** Unsafe version of {@link #name(int) name}. */
	public static void nname(long struct, int value) { memPutInt(struct + NkEditState.NAME, value); }
	/** Unsafe version of {@link #seq(int) seq}. */
	public static void nseq(long struct, int value) { memPutInt(struct + NkEditState.SEQ, value); }
	/** Unsafe version of {@link #old(int) old}. */
	public static void nold(long struct, int value) { memPutInt(struct + NkEditState.OLD, value); }
	/** Unsafe version of {@link #active(int) active}. */
	public static void nactive(long struct, int value) { memPutInt(struct + NkEditState.ACTIVE, value); }
	/** Unsafe version of {@link #prev(int) prev}. */
	public static void nprev(long struct, int value) { memPutInt(struct + NkEditState.PREV, value); }
	/** Unsafe version of {@link #cursor(int) cursor}. */
	public static void ncursor(long struct, int value) { memPutInt(struct + NkEditState.CURSOR, value); }
	/** Unsafe version of {@link #sel_start(int) sel_start}. */
	public static void nsel_start(long struct, int value) { memPutInt(struct + NkEditState.SEL_START, value); }
	/** Unsafe version of {@link #sel_end(int) sel_end}. */
	public static void nsel_end(long struct, int value) { memPutInt(struct + NkEditState.SEL_END, value); }
	/** Unsafe version of {@link #scrollbar(NkScroll) scrollbar}. */
	public static void nscrollbar(long struct, NkScroll value) { memCopy(value.address(), struct + NkEditState.SCROLLBAR, NkScroll.SIZEOF); }
	/** Unsafe version of {@link #mode(byte) mode}. */
	public static void nmode(long struct, byte value) { memPutByte(struct + NkEditState.MODE, value); }
	/** Unsafe version of {@link #single_line(boolean) single_line}. */
	public static void nsingle_line(long struct, boolean value) { memPutByte(struct + NkEditState.SINGLE_LINE, value ? (byte)1 : (byte)0); }

	// -----------------------------------

	/** An array of {@link NkEditState} structs. */
	public static final class Buffer extends StructBuffer<NkEditState, Buffer> {

		/**
		 * Creates a new {@link NkEditState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkEditState#SIZEOF}, and its mark will be undefined.
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
		protected NkEditState newInstance(long address) {
			return new NkEditState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code name} field. */
		public int name() { return NkEditState.nname(address()); }
		/** Returns the value of the {@code seq} field. */
		public int seq() { return NkEditState.nseq(address()); }
		/** Returns the value of the {@code old} field. */
		public int old() { return NkEditState.nold(address()); }
		/** Returns the value of the {@code active} field. */
		public int active() { return NkEditState.nactive(address()); }
		/** Returns the value of the {@code prev} field. */
		public int prev() { return NkEditState.nprev(address()); }
		/** Returns the value of the {@code cursor} field. */
		public int cursor() { return NkEditState.ncursor(address()); }
		/** Returns the value of the {@code sel_start} field. */
		public int sel_start() { return NkEditState.nsel_start(address()); }
		/** Returns the value of the {@code sel_end} field. */
		public int sel_end() { return NkEditState.nsel_end(address()); }
		/** Returns a {@link NkScroll} view of the {@code scrollbar} field. */
		public NkScroll scrollbar() { return NkEditState.nscrollbar(address()); }
		/** Returns the value of the {@code mode} field. */
		public byte mode() { return NkEditState.nmode(address()); }
		/** Returns the value of the {@code single_line} field. */
		public boolean single_line() { return NkEditState.nsingle_line(address()); }

		/** Sets the specified value to the {@code name} field. */
		public NkEditState.Buffer name(int value) { NkEditState.nname(address(), value); return this; }
		/** Sets the specified value to the {@code seq} field. */
		public NkEditState.Buffer seq(int value) { NkEditState.nseq(address(), value); return this; }
		/** Sets the specified value to the {@code old} field. */
		public NkEditState.Buffer old(int value) { NkEditState.nold(address(), value); return this; }
		/** Sets the specified value to the {@code active} field. */
		public NkEditState.Buffer active(int value) { NkEditState.nactive(address(), value); return this; }
		/** Sets the specified value to the {@code prev} field. */
		public NkEditState.Buffer prev(int value) { NkEditState.nprev(address(), value); return this; }
		/** Sets the specified value to the {@code cursor} field. */
		public NkEditState.Buffer cursor(int value) { NkEditState.ncursor(address(), value); return this; }
		/** Sets the specified value to the {@code sel_start} field. */
		public NkEditState.Buffer sel_start(int value) { NkEditState.nsel_start(address(), value); return this; }
		/** Sets the specified value to the {@code sel_end} field. */
		public NkEditState.Buffer sel_end(int value) { NkEditState.nsel_end(address(), value); return this; }
		/** Copies the specified {@link NkScroll} to the {@code scrollbar} field. */
		public NkEditState.Buffer scrollbar(NkScroll value) { NkEditState.nscrollbar(address(), value); return this; }
		/** Sets the specified value to the {@code mode} field. */
		public NkEditState.Buffer mode(byte value) { NkEditState.nmode(address(), value); return this; }
		/** Sets the specified value to the {@code single_line} field. */
		public NkEditState.Buffer single_line(boolean value) { NkEditState.nsingle_line(address(), value); return this; }

	}

}