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
 * <pre><code>struct nk_popup_state {
    struct nk_window * win;
    nk_window_flags type;
    nk_hash name;
    int active;
    unsigned combo_count;
    unsigned con_count;
    unsigned con_old;
    unsigned active_con;
}</code></pre>
 */
public class NkPopupState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WIN,
		TYPE,
		NAME,
		ACTIVE,
		COMBO_COUNT,
		CON_COUNT,
		CON_OLD,
		ACTIVE_CON;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WIN = layout.offsetof(0);
		TYPE = layout.offsetof(1);
		NAME = layout.offsetof(2);
		ACTIVE = layout.offsetof(3);
		COMBO_COUNT = layout.offsetof(4);
		CON_COUNT = layout.offsetof(5);
		CON_OLD = layout.offsetof(6);
		ACTIVE_CON = layout.offsetof(7);
	}

	NkPopupState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkPopupState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkPopupState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code win} field. */
	public NkWindow win() { return nwin(address()); }
	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code name} field. */
	public int name() { return nname(address()); }
	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }
	/** Returns the value of the {@code combo_count} field. */
	public int combo_count() { return ncombo_count(address()); }
	/** Returns the value of the {@code con_count} field. */
	public int con_count() { return ncon_count(address()); }
	/** Returns the value of the {@code con_old} field. */
	public int con_old() { return ncon_old(address()); }
	/** Returns the value of the {@code active_con} field. */
	public int active_con() { return nactive_con(address()); }

	/** Sets the address of the specified {@link NkWindow} to the {@code win} field. */
	public NkPopupState win(NkWindow value) { nwin(address(), value); return this; }
	/** Sets the specified value to the {@code type} field. */
	public NkPopupState type(int value) { ntype(address(), value); return this; }
	/** Sets the specified value to the {@code name} field. */
	public NkPopupState name(int value) { nname(address(), value); return this; }
	/** Sets the specified value to the {@code active} field. */
	public NkPopupState active(int value) { nactive(address(), value); return this; }
	/** Sets the specified value to the {@code combo_count} field. */
	public NkPopupState combo_count(int value) { ncombo_count(address(), value); return this; }
	/** Sets the specified value to the {@code con_count} field. */
	public NkPopupState con_count(int value) { ncon_count(address(), value); return this; }
	/** Sets the specified value to the {@code con_old} field. */
	public NkPopupState con_old(int value) { ncon_old(address(), value); return this; }
	/** Sets the specified value to the {@code active_con} field. */
	public NkPopupState active_con(int value) { nactive_con(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkPopupState set(
		NkWindow win,
		int type,
		int name,
		int active,
		int combo_count,
		int con_count,
		int con_old,
		int active_con
	) {
		win(win);
		type(type);
		name(name);
		active(active);
		combo_count(combo_count);
		con_count(con_count);
		con_old(con_old);
		active_con(active_con);

		return this;
	}

	/** Unsafe version of {@link #set(NkPopupState) set}. */
	public NkPopupState nset(long struct) {
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
	public NkPopupState set(NkPopupState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkPopupState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkPopupState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkPopupState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkPopupState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkPopupState} instance allocated with {@link BufferUtils}. */
	public static NkPopupState create() {
		return new NkPopupState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkPopupState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPopupState create(long address) {
		return address == NULL ? null : new NkPopupState(address, null);
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkPopupState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkPopupState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkPopupState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkPopupState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkPopupState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkPopupState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPopupState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPopupState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkPopupState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkPopupState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #win}. */
	public static NkWindow nwin(long struct) { return NkWindow.create(memGetAddress(struct + NkPopupState.WIN)); }
	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkPopupState.TYPE); }
	/** Unsafe version of {@link #name}. */
	public static int nname(long struct) { return memGetInt(struct + NkPopupState.NAME); }
	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkPopupState.ACTIVE); }
	/** Unsafe version of {@link #combo_count}. */
	public static int ncombo_count(long struct) { return memGetInt(struct + NkPopupState.COMBO_COUNT); }
	/** Unsafe version of {@link #con_count}. */
	public static int ncon_count(long struct) { return memGetInt(struct + NkPopupState.CON_COUNT); }
	/** Unsafe version of {@link #con_old}. */
	public static int ncon_old(long struct) { return memGetInt(struct + NkPopupState.CON_OLD); }
	/** Unsafe version of {@link #active_con}. */
	public static int nactive_con(long struct) { return memGetInt(struct + NkPopupState.ACTIVE_CON); }

	/** Unsafe version of {@link #win(NkWindow) win}. */
	public static void nwin(long struct, NkWindow value) { memPutAddress(struct + NkPopupState.WIN, value.address()); }
	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + NkPopupState.TYPE, value); }
	/** Unsafe version of {@link #name(int) name}. */
	public static void nname(long struct, int value) { memPutInt(struct + NkPopupState.NAME, value); }
	/** Unsafe version of {@link #active(int) active}. */
	public static void nactive(long struct, int value) { memPutInt(struct + NkPopupState.ACTIVE, value); }
	/** Unsafe version of {@link #combo_count(int) combo_count}. */
	public static void ncombo_count(long struct, int value) { memPutInt(struct + NkPopupState.COMBO_COUNT, value); }
	/** Unsafe version of {@link #con_count(int) con_count}. */
	public static void ncon_count(long struct, int value) { memPutInt(struct + NkPopupState.CON_COUNT, value); }
	/** Unsafe version of {@link #con_old(int) con_old}. */
	public static void ncon_old(long struct, int value) { memPutInt(struct + NkPopupState.CON_OLD, value); }
	/** Unsafe version of {@link #active_con(int) active_con}. */
	public static void nactive_con(long struct, int value) { memPutInt(struct + NkPopupState.ACTIVE_CON, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NkPopupState.WIN));
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

	/** An array of {@link NkPopupState} structs. */
	public static final class Buffer extends StructBuffer<NkPopupState, Buffer> {

		/**
		 * Creates a new {@link NkPopupState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkPopupState#SIZEOF}, and its mark will be undefined.
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
		protected NkPopupState newInstance(long address) {
			return new NkPopupState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code win} field. */
		public NkWindow win() { return NkPopupState.nwin(address()); }
		/** Returns the value of the {@code type} field. */
		public int type() { return NkPopupState.ntype(address()); }
		/** Returns the value of the {@code name} field. */
		public int name() { return NkPopupState.nname(address()); }
		/** Returns the value of the {@code active} field. */
		public int active() { return NkPopupState.nactive(address()); }
		/** Returns the value of the {@code combo_count} field. */
		public int combo_count() { return NkPopupState.ncombo_count(address()); }
		/** Returns the value of the {@code con_count} field. */
		public int con_count() { return NkPopupState.ncon_count(address()); }
		/** Returns the value of the {@code con_old} field. */
		public int con_old() { return NkPopupState.ncon_old(address()); }
		/** Returns the value of the {@code active_con} field. */
		public int active_con() { return NkPopupState.nactive_con(address()); }

		/** Sets the address of the specified {@link NkWindow} to the {@code win} field. */
		public NkPopupState.Buffer win(NkWindow value) { NkPopupState.nwin(address(), value); return this; }
		/** Sets the specified value to the {@code type} field. */
		public NkPopupState.Buffer type(int value) { NkPopupState.ntype(address(), value); return this; }
		/** Sets the specified value to the {@code name} field. */
		public NkPopupState.Buffer name(int value) { NkPopupState.nname(address(), value); return this; }
		/** Sets the specified value to the {@code active} field. */
		public NkPopupState.Buffer active(int value) { NkPopupState.nactive(address(), value); return this; }
		/** Sets the specified value to the {@code combo_count} field. */
		public NkPopupState.Buffer combo_count(int value) { NkPopupState.ncombo_count(address(), value); return this; }
		/** Sets the specified value to the {@code con_count} field. */
		public NkPopupState.Buffer con_count(int value) { NkPopupState.ncon_count(address(), value); return this; }
		/** Sets the specified value to the {@code con_old} field. */
		public NkPopupState.Buffer con_old(int value) { NkPopupState.ncon_old(address(), value); return this; }
		/** Sets the specified value to the {@code active_con} field. */
		public NkPopupState.Buffer active_con(int value) { NkPopupState.nactive_con(address(), value); return this; }

	}

}