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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_PANEL_WINDOW PANEL_WINDOW}</td><td>{@link Nuklear#NK_PANEL_GROUP PANEL_GROUP}</td><td>{@link Nuklear#NK_PANEL_POPUP PANEL_POPUP}</td><td>{@link Nuklear#NK_PANEL_CONTEXTUAL PANEL_CONTEXTUAL}</td><td>{@link Nuklear#NK_PANEL_COMBO PANEL_COMBO}</td><td>{@link Nuklear#NK_PANEL_MENU PANEL_MENU}</td></tr><tr><td>{@link Nuklear#NK_PANEL_TOOLTIP PANEL_TOOLTIP}</td><td>{@link Nuklear#NK_PANEL_SET_NONBLOCK PANEL_SET_NONBLOCK}</td><td>{@link Nuklear#NK_PANEL_SET_POPUP PANEL_SET_POPUP}</td><td>{@link Nuklear#NK_PANEL_SET_SUB PANEL_SET_SUB}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_popup_state {
    {@link NkWindow struct nk_window} * win;
    enum nk_panel_type type;
    {@link NkPopupBuffer struct nk_popup_buffer} buf;
    nk_hash name;
    int active;
    unsigned combo_count;
    unsigned con_count;
    unsigned con_old;
    unsigned active_con;
    {@link NkRect struct nk_rect} header;
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
		BUF,
		NAME,
		ACTIVE,
		COMBO_COUNT,
		CON_COUNT,
		CON_OLD,
		ACTIVE_CON,
		HEADER;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(NkPopupBuffer.SIZEOF, NkPopupBuffer.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WIN = layout.offsetof(0);
		TYPE = layout.offsetof(1);
		BUF = layout.offsetof(2);
		NAME = layout.offsetof(3);
		ACTIVE = layout.offsetof(4);
		COMBO_COUNT = layout.offsetof(5);
		CON_COUNT = layout.offsetof(6);
		CON_OLD = layout.offsetof(7);
		ACTIVE_CON = layout.offsetof(8);
		HEADER = layout.offsetof(9);
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
	/** Returns a {@link NkPopupBuffer} view of the {@code buf} field. */
	public NkPopupBuffer buf() { return nbuf(address()); }
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
	/** Returns a {@link NkRect} view of the {@code header} field. */
	public NkRect header() { return nheader(address()); }

	// -----------------------------------

	/** Returns a new {@link NkPopupState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkPopupState create(long address) {
		return address == NULL ? null : new NkPopupState(address, null);
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

	/** Unsafe version of {@link #win}. */
	public static NkWindow nwin(long struct) { return NkWindow.create(memGetAddress(struct + NkPopupState.WIN)); }
	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkPopupState.TYPE); }
	/** Unsafe version of {@link #buf}. */
	public static NkPopupBuffer nbuf(long struct) { return NkPopupBuffer.create(struct + NkPopupState.BUF); }
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
	/** Unsafe version of {@link #header}. */
	public static NkRect nheader(long struct) { return NkRect.create(struct + NkPopupState.HEADER); }

	// -----------------------------------

	/** An array of {@link NkPopupState} structs. */
	public static class Buffer extends StructBuffer<NkPopupState, Buffer> {

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
			return new NkPopupState(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code win} field. */
		public NkWindow win() { return NkPopupState.nwin(address()); }
		/** Returns the value of the {@code type} field. */
		public int type() { return NkPopupState.ntype(address()); }
		/** Returns a {@link NkPopupBuffer} view of the {@code buf} field. */
		public NkPopupBuffer buf() { return NkPopupState.nbuf(address()); }
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
		/** Returns a {@link NkRect} view of the {@code header} field. */
		public NkRect header() { return NkPopupState.nheader(address()); }

	}

}