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
 * <pre><code>struct nk_window {
    unsigned int seq;
    nk_hash name;
    nk_flags flags;
    {@link NkRect struct nk_rect} bounds;
    {@link NkScroll struct nk_scroll} scrollbar;
    {@link NkCommandBuffer struct nk_command_buffer} buffer;
    struct nk_panel * layout;
    {@link NkPropertyState struct nk_property_state} property;
    {@link NkPopupState struct nk_popup_state} popup;
    {@link NkEditState struct nk_edit_state} edit;
    {@link NkScalingState struct nk_scaling_state} scaling;
    nk_table * tables;
    unsigned short table_count;
    unsigned short table_size;
    struct nk_window * next;
    struct nk_window * prev;
    struct nk_window * parent;
}</code></pre>
 */
public class NkWindow extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SEQ,
		NAME,
		FLAGS,
		BOUNDS,
		SCROLLBAR,
		BUFFER,
		LAYOUT,
		PROPERTY,
		POPUP,
		EDIT,
		SCALING,
		TABLES,
		TABLE_COUNT,
		TABLE_SIZE,
		NEXT,
		PREV,
		PARENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(NkScroll.SIZEOF, NkScroll.ALIGNOF),
			__member(NkCommandBuffer.SIZEOF, NkCommandBuffer.ALIGNOF),
			__member(POINTER_SIZE),
			__member(NkPropertyState.SIZEOF, NkPropertyState.ALIGNOF),
			__member(NkPopupState.SIZEOF, NkPopupState.ALIGNOF),
			__member(NkEditState.SIZEOF, NkEditState.ALIGNOF),
			__member(NkScalingState.SIZEOF, NkScalingState.ALIGNOF),
			__member(POINTER_SIZE),
			__member(2),
			__member(2),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SEQ = layout.offsetof(0);
		NAME = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		BOUNDS = layout.offsetof(3);
		SCROLLBAR = layout.offsetof(4);
		BUFFER = layout.offsetof(5);
		LAYOUT = layout.offsetof(6);
		PROPERTY = layout.offsetof(7);
		POPUP = layout.offsetof(8);
		EDIT = layout.offsetof(9);
		SCALING = layout.offsetof(10);
		TABLES = layout.offsetof(11);
		TABLE_COUNT = layout.offsetof(12);
		TABLE_SIZE = layout.offsetof(13);
		NEXT = layout.offsetof(14);
		PREV = layout.offsetof(15);
		PARENT = layout.offsetof(16);
	}

	NkWindow(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkWindow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkWindow(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code seq} field. */
	public int seq() { return nseq(address()); }
	/** Returns the value of the {@code name} field. */
	public int name() { return nname(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns a {@link NkRect} view of the {@code bounds} field. */
	public NkRect bounds() { return nbounds(address()); }
	/** Returns a {@link NkScroll} view of the {@code scrollbar} field. */
	public NkScroll scrollbar() { return nscrollbar(address()); }
	/** Returns a {@link NkCommandBuffer} view of the {@code buffer} field. */
	public NkCommandBuffer buffer() { return nbuffer(address()); }
	/** Returns a {@link NkPanel} view of the struct pointed to by the {@code layout} field. */
	public NkPanel layout() { return nlayout(address()); }
	/** Returns a {@link NkPropertyState} view of the {@code property} field. */
	public NkPropertyState property() { return nproperty(address()); }
	/** Returns a {@link NkPopupState} view of the {@code popup} field. */
	public NkPopupState popup() { return npopup(address()); }
	/** Returns a {@link NkEditState} view of the {@code edit} field. */
	public NkEditState edit() { return nedit(address()); }
	/** Returns a {@link NkScalingState} view of the {@code scaling} field. */
	public NkScalingState scaling() { return nscaling(address()); }
	/** Returns the value of the {@code tables} field. */
	public long tables() { return ntables(address()); }
	/** Returns the value of the {@code table_count} field. */
	public short table_count() { return ntable_count(address()); }
	/** Returns the value of the {@code table_size} field. */
	public short table_size() { return ntable_size(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code next} field. */
	public NkWindow next() { return nnext(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code prev} field. */
	public NkWindow prev() { return nprev(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code parent} field. */
	public NkWindow parent() { return nparent(address()); }

	/** Sets the specified value to the {@code seq} field. */
	public NkWindow seq(int value) { nseq(address(), value); return this; }
	/** Sets the specified value to the {@code name} field. */
	public NkWindow name(int value) { nname(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public NkWindow flags(int value) { nflags(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code bounds} field. */
	public NkWindow bounds(NkRect value) { nbounds(address(), value); return this; }
	/** Copies the specified {@link NkScroll} to the {@code scrollbar} field. */
	public NkWindow scrollbar(NkScroll value) { nscrollbar(address(), value); return this; }
	/** Copies the specified {@link NkCommandBuffer} to the {@code buffer} field. */
	public NkWindow buffer(NkCommandBuffer value) { nbuffer(address(), value); return this; }
	/** Sets the address of the specified {@link NkPanel} to the {@code layout} field. */
	public NkWindow layout(NkPanel value) { nlayout(address(), value); return this; }
	/** Copies the specified {@link NkPropertyState} to the {@code property} field. */
	public NkWindow property(NkPropertyState value) { nproperty(address(), value); return this; }
	/** Copies the specified {@link NkPopupState} to the {@code popup} field. */
	public NkWindow popup(NkPopupState value) { npopup(address(), value); return this; }
	/** Copies the specified {@link NkEditState} to the {@code edit} field. */
	public NkWindow edit(NkEditState value) { nedit(address(), value); return this; }
	/** Copies the specified {@link NkScalingState} to the {@code scaling} field. */
	public NkWindow scaling(NkScalingState value) { nscaling(address(), value); return this; }
	/** Sets the specified value to the {@code tables} field. */
	public NkWindow tables(long value) { ntables(address(), value); return this; }
	/** Sets the specified value to the {@code table_count} field. */
	public NkWindow table_count(short value) { ntable_count(address(), value); return this; }
	/** Sets the specified value to the {@code table_size} field. */
	public NkWindow table_size(short value) { ntable_size(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code next} field. */
	public NkWindow next(NkWindow value) { nnext(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code prev} field. */
	public NkWindow prev(NkWindow value) { nprev(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code parent} field. */
	public NkWindow parent(NkWindow value) { nparent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkWindow set(
		int seq,
		int name,
		int flags,
		NkRect bounds,
		NkScroll scrollbar,
		NkCommandBuffer buffer,
		NkPanel layout,
		NkPropertyState property,
		NkPopupState popup,
		NkEditState edit,
		NkScalingState scaling,
		long tables,
		short table_count,
		short table_size,
		NkWindow next,
		NkWindow prev,
		NkWindow parent
	) {
		seq(seq);
		name(name);
		flags(flags);
		bounds(bounds);
		scrollbar(scrollbar);
		buffer(buffer);
		layout(layout);
		property(property);
		popup(popup);
		edit(edit);
		scaling(scaling);
		tables(tables);
		table_count(table_count);
		table_size(table_size);
		next(next);
		prev(prev);
		parent(parent);

		return this;
	}

	/** Unsafe version of {@link #set(NkWindow) set}. */
	public NkWindow nset(long struct) {
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
	public NkWindow set(NkWindow src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkWindow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkWindow malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkWindow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkWindow calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkWindow} instance allocated with {@link BufferUtils}. */
	public static NkWindow create() {
		return new NkWindow(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkWindow} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkWindow create(long address) {
		return address == NULL ? null : new NkWindow(address, null);
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkWindow.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkWindow} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkWindow mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkWindow} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkWindow callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkWindow} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkWindow mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkWindow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkWindow callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkWindow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #seq}. */
	public static int nseq(long struct) { return memGetInt(struct + NkWindow.SEQ); }
	/** Unsafe version of {@link #name}. */
	public static int nname(long struct) { return memGetInt(struct + NkWindow.NAME); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + NkWindow.FLAGS); }
	/** Unsafe version of {@link #bounds}. */
	public static NkRect nbounds(long struct) { return NkRect.create(struct + NkWindow.BOUNDS); }
	/** Unsafe version of {@link #scrollbar}. */
	public static NkScroll nscrollbar(long struct) { return NkScroll.create(struct + NkWindow.SCROLLBAR); }
	/** Unsafe version of {@link #buffer}. */
	public static NkCommandBuffer nbuffer(long struct) { return NkCommandBuffer.create(struct + NkWindow.BUFFER); }
	/** Unsafe version of {@link #layout}. */
	public static NkPanel nlayout(long struct) { return NkPanel.create(memGetAddress(struct + NkWindow.LAYOUT)); }
	/** Unsafe version of {@link #property}. */
	public static NkPropertyState nproperty(long struct) { return NkPropertyState.create(struct + NkWindow.PROPERTY); }
	/** Unsafe version of {@link #popup}. */
	public static NkPopupState npopup(long struct) { return NkPopupState.create(struct + NkWindow.POPUP); }
	/** Unsafe version of {@link #edit}. */
	public static NkEditState nedit(long struct) { return NkEditState.create(struct + NkWindow.EDIT); }
	/** Unsafe version of {@link #scaling}. */
	public static NkScalingState nscaling(long struct) { return NkScalingState.create(struct + NkWindow.SCALING); }
	/** Unsafe version of {@link #tables}. */
	public static long ntables(long struct) { return memGetAddress(struct + NkWindow.TABLES); }
	/** Unsafe version of {@link #table_count}. */
	public static short ntable_count(long struct) { return memGetShort(struct + NkWindow.TABLE_COUNT); }
	/** Unsafe version of {@link #table_size}. */
	public static short ntable_size(long struct) { return memGetShort(struct + NkWindow.TABLE_SIZE); }
	/** Unsafe version of {@link #next}. */
	public static NkWindow nnext(long struct) { return NkWindow.create(memGetAddress(struct + NkWindow.NEXT)); }
	/** Unsafe version of {@link #prev}. */
	public static NkWindow nprev(long struct) { return NkWindow.create(memGetAddress(struct + NkWindow.PREV)); }
	/** Unsafe version of {@link #parent}. */
	public static NkWindow nparent(long struct) { return NkWindow.create(memGetAddress(struct + NkWindow.PARENT)); }

	/** Unsafe version of {@link #seq(int) seq}. */
	public static void nseq(long struct, int value) { memPutInt(struct + NkWindow.SEQ, value); }
	/** Unsafe version of {@link #name(int) name}. */
	public static void nname(long struct, int value) { memPutInt(struct + NkWindow.NAME, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + NkWindow.FLAGS, value); }
	/** Unsafe version of {@link #bounds(NkRect) bounds}. */
	public static void nbounds(long struct, NkRect value) { memCopy(value.address(), struct + NkWindow.BOUNDS, NkRect.SIZEOF); }
	/** Unsafe version of {@link #scrollbar(NkScroll) scrollbar}. */
	public static void nscrollbar(long struct, NkScroll value) { memCopy(value.address(), struct + NkWindow.SCROLLBAR, NkScroll.SIZEOF); }
	/** Unsafe version of {@link #buffer(NkCommandBuffer) buffer}. */
	public static void nbuffer(long struct, NkCommandBuffer value) { memCopy(value.address(), struct + NkWindow.BUFFER, NkCommandBuffer.SIZEOF); }
	/** Unsafe version of {@link #layout(NkPanel) layout}. */
	public static void nlayout(long struct, NkPanel value) { memPutAddress(struct + NkWindow.LAYOUT, value.address()); }
	/** Unsafe version of {@link #property(NkPropertyState) property}. */
	public static void nproperty(long struct, NkPropertyState value) { memCopy(value.address(), struct + NkWindow.PROPERTY, NkPropertyState.SIZEOF); }
	/** Unsafe version of {@link #popup(NkPopupState) popup}. */
	public static void npopup(long struct, NkPopupState value) { memCopy(value.address(), struct + NkWindow.POPUP, NkPopupState.SIZEOF); }
	/** Unsafe version of {@link #edit(NkEditState) edit}. */
	public static void nedit(long struct, NkEditState value) { memCopy(value.address(), struct + NkWindow.EDIT, NkEditState.SIZEOF); }
	/** Unsafe version of {@link #scaling(NkScalingState) scaling}. */
	public static void nscaling(long struct, NkScalingState value) { memCopy(value.address(), struct + NkWindow.SCALING, NkScalingState.SIZEOF); }
	/** Unsafe version of {@link #tables(long) tables}. */
	public static void ntables(long struct, long value) { memPutAddress(struct + NkWindow.TABLES, checkPointer(value)); }
	/** Unsafe version of {@link #table_count(short) table_count}. */
	public static void ntable_count(long struct, short value) { memPutShort(struct + NkWindow.TABLE_COUNT, value); }
	/** Unsafe version of {@link #table_size(short) table_size}. */
	public static void ntable_size(long struct, short value) { memPutShort(struct + NkWindow.TABLE_SIZE, value); }
	/** Unsafe version of {@link #next(NkWindow) next}. */
	public static void nnext(long struct, NkWindow value) { memPutAddress(struct + NkWindow.NEXT, value.address()); }
	/** Unsafe version of {@link #prev(NkWindow) prev}. */
	public static void nprev(long struct, NkWindow value) { memPutAddress(struct + NkWindow.PREV, value.address()); }
	/** Unsafe version of {@link #parent(NkWindow) parent}. */
	public static void nparent(long struct, NkWindow value) { memPutAddress(struct + NkWindow.PARENT, value.address()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		NkCommandBuffer.validate(struct + NkWindow.BUFFER);
		long layout = memGetAddress(struct + NkWindow.LAYOUT);
		checkPointer(layout);
		NkPanel.validate(layout);
		NkPopupState.validate(struct + NkWindow.POPUP);
		checkPointer(memGetAddress(struct + NkWindow.TABLES));
		checkPointer(memGetAddress(struct + NkWindow.NEXT));
		checkPointer(memGetAddress(struct + NkWindow.PREV));
		checkPointer(memGetAddress(struct + NkWindow.PARENT));
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

	/** An array of {@link NkWindow} structs. */
	public static final class Buffer extends StructBuffer<NkWindow, Buffer> {

		/**
		 * Creates a new {@link NkWindow.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkWindow#SIZEOF}, and its mark will be undefined.
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
		protected NkWindow newInstance(long address) {
			return new NkWindow(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code seq} field. */
		public int seq() { return NkWindow.nseq(address()); }
		/** Returns the value of the {@code name} field. */
		public int name() { return NkWindow.nname(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return NkWindow.nflags(address()); }
		/** Returns a {@link NkRect} view of the {@code bounds} field. */
		public NkRect bounds() { return NkWindow.nbounds(address()); }
		/** Returns a {@link NkScroll} view of the {@code scrollbar} field. */
		public NkScroll scrollbar() { return NkWindow.nscrollbar(address()); }
		/** Returns a {@link NkCommandBuffer} view of the {@code buffer} field. */
		public NkCommandBuffer buffer() { return NkWindow.nbuffer(address()); }
		/** Returns a {@link NkPanel} view of the struct pointed to by the {@code layout} field. */
		public NkPanel layout() { return NkWindow.nlayout(address()); }
		/** Returns a {@link NkPropertyState} view of the {@code property} field. */
		public NkPropertyState property() { return NkWindow.nproperty(address()); }
		/** Returns a {@link NkPopupState} view of the {@code popup} field. */
		public NkPopupState popup() { return NkWindow.npopup(address()); }
		/** Returns a {@link NkEditState} view of the {@code edit} field. */
		public NkEditState edit() { return NkWindow.nedit(address()); }
		/** Returns a {@link NkScalingState} view of the {@code scaling} field. */
		public NkScalingState scaling() { return NkWindow.nscaling(address()); }
		/** Returns the value of the {@code tables} field. */
		public long tables() { return NkWindow.ntables(address()); }
		/** Returns the value of the {@code table_count} field. */
		public short table_count() { return NkWindow.ntable_count(address()); }
		/** Returns the value of the {@code table_size} field. */
		public short table_size() { return NkWindow.ntable_size(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code next} field. */
		public NkWindow next() { return NkWindow.nnext(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code prev} field. */
		public NkWindow prev() { return NkWindow.nprev(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code parent} field. */
		public NkWindow parent() { return NkWindow.nparent(address()); }

		/** Sets the specified value to the {@code seq} field. */
		public NkWindow.Buffer seq(int value) { NkWindow.nseq(address(), value); return this; }
		/** Sets the specified value to the {@code name} field. */
		public NkWindow.Buffer name(int value) { NkWindow.nname(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public NkWindow.Buffer flags(int value) { NkWindow.nflags(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code bounds} field. */
		public NkWindow.Buffer bounds(NkRect value) { NkWindow.nbounds(address(), value); return this; }
		/** Copies the specified {@link NkScroll} to the {@code scrollbar} field. */
		public NkWindow.Buffer scrollbar(NkScroll value) { NkWindow.nscrollbar(address(), value); return this; }
		/** Copies the specified {@link NkCommandBuffer} to the {@code buffer} field. */
		public NkWindow.Buffer buffer(NkCommandBuffer value) { NkWindow.nbuffer(address(), value); return this; }
		/** Sets the address of the specified {@link NkPanel} to the {@code layout} field. */
		public NkWindow.Buffer layout(NkPanel value) { NkWindow.nlayout(address(), value); return this; }
		/** Copies the specified {@link NkPropertyState} to the {@code property} field. */
		public NkWindow.Buffer property(NkPropertyState value) { NkWindow.nproperty(address(), value); return this; }
		/** Copies the specified {@link NkPopupState} to the {@code popup} field. */
		public NkWindow.Buffer popup(NkPopupState value) { NkWindow.npopup(address(), value); return this; }
		/** Copies the specified {@link NkEditState} to the {@code edit} field. */
		public NkWindow.Buffer edit(NkEditState value) { NkWindow.nedit(address(), value); return this; }
		/** Copies the specified {@link NkScalingState} to the {@code scaling} field. */
		public NkWindow.Buffer scaling(NkScalingState value) { NkWindow.nscaling(address(), value); return this; }
		/** Sets the specified value to the {@code tables} field. */
		public NkWindow.Buffer tables(long value) { NkWindow.ntables(address(), value); return this; }
		/** Sets the specified value to the {@code table_count} field. */
		public NkWindow.Buffer table_count(short value) { NkWindow.ntable_count(address(), value); return this; }
		/** Sets the specified value to the {@code table_size} field. */
		public NkWindow.Buffer table_size(short value) { NkWindow.ntable_size(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code next} field. */
		public NkWindow.Buffer next(NkWindow value) { NkWindow.nnext(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code prev} field. */
		public NkWindow.Buffer prev(NkWindow value) { NkWindow.nprev(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code parent} field. */
		public NkWindow.Buffer parent(NkWindow value) { NkWindow.nparent(address(), value); return this; }

	}

}