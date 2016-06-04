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
 * <pre><code>struct nk_property_state {
    int active;
    int prev;
    char[64] buffer;
    int length;
    int cursor;
    nk_hash name;
    unsigned int seq;
    unsigned int old;
    int state;
}</code></pre>
 */
public class NkPropertyState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ACTIVE,
		PREV,
		BUFFER,
		LENGTH,
		CURSOR,
		NAME,
		SEQ,
		OLD,
		STATE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__array(1, 64),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ACTIVE = layout.offsetof(0);
		PREV = layout.offsetof(1);
		BUFFER = layout.offsetof(2);
		LENGTH = layout.offsetof(3);
		CURSOR = layout.offsetof(4);
		NAME = layout.offsetof(5);
		SEQ = layout.offsetof(6);
		OLD = layout.offsetof(7);
		STATE = layout.offsetof(8);
	}

	NkPropertyState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkPropertyState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkPropertyState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }
	/** Returns the value of the {@code prev} field. */
	public int prev() { return nprev(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code buffer} field. */
	public ByteBuffer buffer() { return nbuffer(address()); }
	/** Returns the value at the specified index of the {@code buffer} field. */
	public byte buffer(int index) { return nbuffer(address(), index); }
	/** Returns the value of the {@code length} field. */
	public int length() { return nlength(address()); }
	/** Returns the value of the {@code cursor} field. */
	public int cursor() { return ncursor(address()); }
	/** Returns the value of the {@code name} field. */
	public int name() { return nname(address()); }
	/** Returns the value of the {@code seq} field. */
	public int seq() { return nseq(address()); }
	/** Returns the value of the {@code old} field. */
	public int old() { return nold(address()); }
	/** Returns the value of the {@code state} field. */
	public int state() { return nstate(address()); }

	/** Sets the specified value to the {@code active} field. */
	public NkPropertyState active(int value) { nactive(address(), value); return this; }
	/** Sets the specified value to the {@code prev} field. */
	public NkPropertyState prev(int value) { nprev(address(), value); return this; }
	/** Copies the specified {@link ByteBuffer} to the {@code buffer} field. */
	public NkPropertyState buffer(ByteBuffer value) { nbuffer(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code buffer} field. */
	public NkPropertyState buffer(int index, byte value) { nbuffer(address(), index, value); return this; }
	/** Sets the specified value to the {@code length} field. */
	public NkPropertyState length(int value) { nlength(address(), value); return this; }
	/** Sets the specified value to the {@code cursor} field. */
	public NkPropertyState cursor(int value) { ncursor(address(), value); return this; }
	/** Sets the specified value to the {@code name} field. */
	public NkPropertyState name(int value) { nname(address(), value); return this; }
	/** Sets the specified value to the {@code seq} field. */
	public NkPropertyState seq(int value) { nseq(address(), value); return this; }
	/** Sets the specified value to the {@code old} field. */
	public NkPropertyState old(int value) { nold(address(), value); return this; }
	/** Sets the specified value to the {@code state} field. */
	public NkPropertyState state(int value) { nstate(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkPropertyState set(
		int active,
		int prev,
		ByteBuffer buffer,
		int length,
		int cursor,
		int name,
		int seq,
		int old,
		int state
	) {
		active(active);
		prev(prev);
		buffer(buffer);
		length(length);
		cursor(cursor);
		name(name);
		seq(seq);
		old(old);
		state(state);

		return this;
	}

	/** Unsafe version of {@link #set(NkPropertyState) set}. */
	public NkPropertyState nset(long struct) {
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
	public NkPropertyState set(NkPropertyState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkPropertyState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkPropertyState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkPropertyState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkPropertyState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkPropertyState} instance allocated with {@link BufferUtils}. */
	public static NkPropertyState create() {
		return new NkPropertyState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkPropertyState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPropertyState create(long address) {
		return address == NULL ? null : new NkPropertyState(address, null);
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkPropertyState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkPropertyState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkPropertyState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkPropertyState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkPropertyState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkPropertyState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPropertyState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPropertyState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPropertyState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPropertyState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkPropertyState.ACTIVE); }
	/** Unsafe version of {@link #prev}. */
	public static int nprev(long struct) { return memGetInt(struct + NkPropertyState.PREV); }
	/** Unsafe version of {@link #buffer}. */
	public static ByteBuffer nbuffer(long struct) {
		return memByteBuffer(struct + NkPropertyState.BUFFER, 64);
	}
	/** Unsafe version of {@link #buffer(int) buffer}. */
	public static byte nbuffer(long struct, int index) { return memGetByte(struct + NkPropertyState.BUFFER + index * 1); }
	/** Unsafe version of {@link #length}. */
	public static int nlength(long struct) { return memGetInt(struct + NkPropertyState.LENGTH); }
	/** Unsafe version of {@link #cursor}. */
	public static int ncursor(long struct) { return memGetInt(struct + NkPropertyState.CURSOR); }
	/** Unsafe version of {@link #name}. */
	public static int nname(long struct) { return memGetInt(struct + NkPropertyState.NAME); }
	/** Unsafe version of {@link #seq}. */
	public static int nseq(long struct) { return memGetInt(struct + NkPropertyState.SEQ); }
	/** Unsafe version of {@link #old}. */
	public static int nold(long struct) { return memGetInt(struct + NkPropertyState.OLD); }
	/** Unsafe version of {@link #state}. */
	public static int nstate(long struct) { return memGetInt(struct + NkPropertyState.STATE); }

	/** Unsafe version of {@link #active(int) active}. */
	public static void nactive(long struct, int value) { memPutInt(struct + NkPropertyState.ACTIVE, value); }
	/** Unsafe version of {@link #prev(int) prev}. */
	public static void nprev(long struct, int value) { memPutInt(struct + NkPropertyState.PREV, value); }
	/** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
	public static void nbuffer(long struct, ByteBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 64);
		memCopy(memAddress(value), struct + NkPropertyState.BUFFER, value.remaining() * 1);
	}
	/** Unsafe version of {@link #buffer(int, byte) buffer}. */
	public static void nbuffer(long struct, int index, byte value) { memPutByte(struct + NkPropertyState.BUFFER + index * 1, value); }
	/** Unsafe version of {@link #length(int) length}. */
	public static void nlength(long struct, int value) { memPutInt(struct + NkPropertyState.LENGTH, value); }
	/** Unsafe version of {@link #cursor(int) cursor}. */
	public static void ncursor(long struct, int value) { memPutInt(struct + NkPropertyState.CURSOR, value); }
	/** Unsafe version of {@link #name(int) name}. */
	public static void nname(long struct, int value) { memPutInt(struct + NkPropertyState.NAME, value); }
	/** Unsafe version of {@link #seq(int) seq}. */
	public static void nseq(long struct, int value) { memPutInt(struct + NkPropertyState.SEQ, value); }
	/** Unsafe version of {@link #old(int) old}. */
	public static void nold(long struct, int value) { memPutInt(struct + NkPropertyState.OLD, value); }
	/** Unsafe version of {@link #state(int) state}. */
	public static void nstate(long struct, int value) { memPutInt(struct + NkPropertyState.STATE, value); }

	// -----------------------------------

	/** An array of {@link NkPropertyState} structs. */
	public static final class Buffer extends StructBuffer<NkPropertyState, Buffer> {

		/**
		 * Creates a new {@link NkPropertyState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkPropertyState#SIZEOF}, and its mark will be undefined.
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
		protected NkPropertyState newInstance(long address) {
			return new NkPropertyState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code active} field. */
		public int active() { return NkPropertyState.nactive(address()); }
		/** Returns the value of the {@code prev} field. */
		public int prev() { return NkPropertyState.nprev(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code buffer} field. */
		public ByteBuffer buffer() { return NkPropertyState.nbuffer(address()); }
		/** Returns the value at the specified index of the {@code buffer} field. */
		public byte buffer(int index) { return NkPropertyState.nbuffer(address(), index); }
		/** Returns the value of the {@code length} field. */
		public int length() { return NkPropertyState.nlength(address()); }
		/** Returns the value of the {@code cursor} field. */
		public int cursor() { return NkPropertyState.ncursor(address()); }
		/** Returns the value of the {@code name} field. */
		public int name() { return NkPropertyState.nname(address()); }
		/** Returns the value of the {@code seq} field. */
		public int seq() { return NkPropertyState.nseq(address()); }
		/** Returns the value of the {@code old} field. */
		public int old() { return NkPropertyState.nold(address()); }
		/** Returns the value of the {@code state} field. */
		public int state() { return NkPropertyState.nstate(address()); }

		/** Sets the specified value to the {@code active} field. */
		public NkPropertyState.Buffer active(int value) { NkPropertyState.nactive(address(), value); return this; }
		/** Sets the specified value to the {@code prev} field. */
		public NkPropertyState.Buffer prev(int value) { NkPropertyState.nprev(address(), value); return this; }
		/** Copies the specified {@link ByteBuffer} to the {@code buffer} field. */
		public NkPropertyState.Buffer buffer(ByteBuffer value) { NkPropertyState.nbuffer(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code buffer} field. */
		public NkPropertyState.Buffer buffer(int index, byte value) { NkPropertyState.nbuffer(address(), index, value); return this; }
		/** Sets the specified value to the {@code length} field. */
		public NkPropertyState.Buffer length(int value) { NkPropertyState.nlength(address(), value); return this; }
		/** Sets the specified value to the {@code cursor} field. */
		public NkPropertyState.Buffer cursor(int value) { NkPropertyState.ncursor(address(), value); return this; }
		/** Sets the specified value to the {@code name} field. */
		public NkPropertyState.Buffer name(int value) { NkPropertyState.nname(address(), value); return this; }
		/** Sets the specified value to the {@code seq} field. */
		public NkPropertyState.Buffer seq(int value) { NkPropertyState.nseq(address(), value); return this; }
		/** Sets the specified value to the {@code old} field. */
		public NkPropertyState.Buffer old(int value) { NkPropertyState.nold(address(), value); return this; }
		/** Sets the specified value to the {@code state} field. */
		public NkPropertyState.Buffer state(int value) { NkPropertyState.nstate(address(), value); return this; }

	}

}