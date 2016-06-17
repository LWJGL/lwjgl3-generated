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
 * <pre><code>struct nk_context {
    {@link NkInput struct nk_input} input;
    {@link NkStyle struct nk_style} style;
    {@link NkBuffer struct nk_buffer} memory;
    {@link NkClipboard struct nk_clipboard} clip;
    nk_flags last_widget_state;
    {@link NkDrawList struct nk_draw_list} draw_list;
    {@link NkHandle nk_handle} userdata;
    {@link NkTextEdit struct nk_text_edit} text_edit;
    int build;
    void * pool;
    struct nk_window * begin;
    struct nk_window * end;
    struct nk_window * active;
    struct nk_window * current;
    nk_page_element * freelist;
    unsigned int count;
    unsigned int seq;
}</code></pre>
 */
public class NkContext extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		INPUT,
		STYLE,
		MEMORY,
		CLIP,
		LAST_WIDGET_STATE,
		DRAW_LIST,
		USERDATA,
		TEXT_EDIT,
		BUILD,
		POOL,
		BEGIN,
		END,
		ACTIVE,
		CURRENT,
		FREELIST,
		COUNT,
		SEQ;

	static {
		Layout layout = __struct(
			__member(NkInput.SIZEOF, NkInput.ALIGNOF),
			__member(NkStyle.SIZEOF, NkStyle.ALIGNOF),
			__member(NkBuffer.SIZEOF, NkBuffer.ALIGNOF),
			__member(NkClipboard.SIZEOF, NkClipboard.ALIGNOF),
			__member(4),
			__member(NkDrawList.SIZEOF, NkDrawList.ALIGNOF),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(NkTextEdit.SIZEOF, NkTextEdit.ALIGNOF),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		INPUT = layout.offsetof(0);
		STYLE = layout.offsetof(1);
		MEMORY = layout.offsetof(2);
		CLIP = layout.offsetof(3);
		LAST_WIDGET_STATE = layout.offsetof(4);
		DRAW_LIST = layout.offsetof(5);
		USERDATA = layout.offsetof(6);
		TEXT_EDIT = layout.offsetof(7);
		BUILD = layout.offsetof(8);
		POOL = layout.offsetof(9);
		BEGIN = layout.offsetof(10);
		END = layout.offsetof(11);
		ACTIVE = layout.offsetof(12);
		CURRENT = layout.offsetof(13);
		FREELIST = layout.offsetof(14);
		COUNT = layout.offsetof(15);
		SEQ = layout.offsetof(16);
	}

	NkContext(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkContext} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkContext(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkInput} view of the {@code input} field. */
	public NkInput input() { return ninput(address()); }
	/** Returns a {@link NkStyle} view of the {@code style} field. */
	public NkStyle style() { return nstyle(address()); }
	/** Returns a {@link NkBuffer} view of the {@code memory} field. */
	public NkBuffer memory() { return nmemory(address()); }
	/** Returns a {@link NkClipboard} view of the {@code clip} field. */
	public NkClipboard clip() { return nclip(address()); }
	/** Returns the value of the {@code last_widget_state} field. */
	public int last_widget_state() { return nlast_widget_state(address()); }
	/** Returns a {@link NkDrawList} view of the {@code draw_list} field. */
	public NkDrawList draw_list() { return ndraw_list(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns a {@link NkTextEdit} view of the {@code text_edit} field. */
	public NkTextEdit text_edit() { return ntext_edit(address()); }
	/** Returns the value of the {@code build} field. */
	public int build() { return nbuild(address()); }
	/** Returns the value of the {@code pool} field. */
	public long pool() { return npool(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code begin} field. */
	public NkWindow begin() { return nbegin(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code end} field. */
	public NkWindow end() { return nend(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code active} field. */
	public NkWindow active() { return nactive(address()); }
	/** Returns a {@link NkWindow} view of the struct pointed to by the {@code current} field. */
	public NkWindow current() { return ncurrent(address()); }
	/** Returns the value of the {@code freelist} field. */
	public long freelist() { return nfreelist(address()); }
	/** Returns the value of the {@code count} field. */
	public int count() { return ncount(address()); }
	/** Returns the value of the {@code seq} field. */
	public int seq() { return nseq(address()); }

	/** Copies the specified {@link NkInput} to the {@code input} field. */
	public NkContext input(NkInput value) { ninput(address(), value); return this; }
	/** Copies the specified {@link NkStyle} to the {@code style} field. */
	public NkContext style(NkStyle value) { nstyle(address(), value); return this; }
	/** Copies the specified {@link NkBuffer} to the {@code memory} field. */
	public NkContext memory(NkBuffer value) { nmemory(address(), value); return this; }
	/** Copies the specified {@link NkClipboard} to the {@code clip} field. */
	public NkContext clip(NkClipboard value) { nclip(address(), value); return this; }
	/** Sets the specified value to the {@code last_widget_state} field. */
	public NkContext last_widget_state(int value) { nlast_widget_state(address(), value); return this; }
	/** Copies the specified {@link NkDrawList} to the {@code draw_list} field. */
	public NkContext draw_list(NkDrawList value) { ndraw_list(address(), value); return this; }
	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkContext userdata(NkHandle value) { nuserdata(address(), value); return this; }
	/** Copies the specified {@link NkTextEdit} to the {@code text_edit} field. */
	public NkContext text_edit(NkTextEdit value) { ntext_edit(address(), value); return this; }
	/** Sets the specified value to the {@code build} field. */
	public NkContext build(int value) { nbuild(address(), value); return this; }
	/** Sets the specified value to the {@code pool} field. */
	public NkContext pool(long value) { npool(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code begin} field. */
	public NkContext begin(NkWindow value) { nbegin(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code end} field. */
	public NkContext end(NkWindow value) { nend(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code active} field. */
	public NkContext active(NkWindow value) { nactive(address(), value); return this; }
	/** Sets the address of the specified {@link NkWindow} to the {@code current} field. */
	public NkContext current(NkWindow value) { ncurrent(address(), value); return this; }
	/** Sets the specified value to the {@code freelist} field. */
	public NkContext freelist(long value) { nfreelist(address(), value); return this; }
	/** Sets the specified value to the {@code count} field. */
	public NkContext count(int value) { ncount(address(), value); return this; }
	/** Sets the specified value to the {@code seq} field. */
	public NkContext seq(int value) { nseq(address(), value); return this; }

	/** Unsafe version of {@link #set(NkContext) set}. */
	public NkContext nset(long struct) {
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
	public NkContext set(NkContext src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkContext} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkContext malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkContext} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkContext calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkContext} instance allocated with {@link BufferUtils}. */
	public static NkContext create() {
		return new NkContext(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkContext} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkContext create(long address) {
		return address == NULL ? null : new NkContext(address, null);
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkContext.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkContext} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkContext mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkContext} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkContext callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkContext} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkContext mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkContext} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkContext callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkContext.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #input}. */
	public static NkInput ninput(long struct) { return NkInput.create(struct + NkContext.INPUT); }
	/** Unsafe version of {@link #style}. */
	public static NkStyle nstyle(long struct) { return NkStyle.create(struct + NkContext.STYLE); }
	/** Unsafe version of {@link #memory}. */
	public static NkBuffer nmemory(long struct) { return NkBuffer.create(struct + NkContext.MEMORY); }
	/** Unsafe version of {@link #clip}. */
	public static NkClipboard nclip(long struct) { return NkClipboard.create(struct + NkContext.CLIP); }
	/** Unsafe version of {@link #last_widget_state}. */
	public static int nlast_widget_state(long struct) { return memGetInt(struct + NkContext.LAST_WIDGET_STATE); }
	/** Unsafe version of {@link #draw_list}. */
	public static NkDrawList ndraw_list(long struct) { return NkDrawList.create(struct + NkContext.DRAW_LIST); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkContext.USERDATA); }
	/** Unsafe version of {@link #text_edit}. */
	public static NkTextEdit ntext_edit(long struct) { return NkTextEdit.create(struct + NkContext.TEXT_EDIT); }
	/** Unsafe version of {@link #build}. */
	public static int nbuild(long struct) { return memGetInt(struct + NkContext.BUILD); }
	/** Unsafe version of {@link #pool}. */
	public static long npool(long struct) { return memGetAddress(struct + NkContext.POOL); }
	/** Unsafe version of {@link #begin}. */
	public static NkWindow nbegin(long struct) { return NkWindow.create(memGetAddress(struct + NkContext.BEGIN)); }
	/** Unsafe version of {@link #end}. */
	public static NkWindow nend(long struct) { return NkWindow.create(memGetAddress(struct + NkContext.END)); }
	/** Unsafe version of {@link #active}. */
	public static NkWindow nactive(long struct) { return NkWindow.create(memGetAddress(struct + NkContext.ACTIVE)); }
	/** Unsafe version of {@link #current}. */
	public static NkWindow ncurrent(long struct) { return NkWindow.create(memGetAddress(struct + NkContext.CURRENT)); }
	/** Unsafe version of {@link #freelist}. */
	public static long nfreelist(long struct) { return memGetAddress(struct + NkContext.FREELIST); }
	/** Unsafe version of {@link #count}. */
	public static int ncount(long struct) { return memGetInt(struct + NkContext.COUNT); }
	/** Unsafe version of {@link #seq}. */
	public static int nseq(long struct) { return memGetInt(struct + NkContext.SEQ); }

	/** Unsafe version of {@link #input(NkInput) input}. */
	public static void ninput(long struct, NkInput value) { memCopy(value.address(), struct + NkContext.INPUT, NkInput.SIZEOF); }
	/** Unsafe version of {@link #style(NkStyle) style}. */
	public static void nstyle(long struct, NkStyle value) { memCopy(value.address(), struct + NkContext.STYLE, NkStyle.SIZEOF); }
	/** Unsafe version of {@link #memory(NkBuffer) memory}. */
	public static void nmemory(long struct, NkBuffer value) { memCopy(value.address(), struct + NkContext.MEMORY, NkBuffer.SIZEOF); }
	/** Unsafe version of {@link #clip(NkClipboard) clip}. */
	public static void nclip(long struct, NkClipboard value) { memCopy(value.address(), struct + NkContext.CLIP, NkClipboard.SIZEOF); }
	/** Unsafe version of {@link #last_widget_state(int) last_widget_state}. */
	public static void nlast_widget_state(long struct, int value) { memPutInt(struct + NkContext.LAST_WIDGET_STATE, value); }
	/** Unsafe version of {@link #draw_list(NkDrawList) draw_list}. */
	public static void ndraw_list(long struct, NkDrawList value) { memCopy(value.address(), struct + NkContext.DRAW_LIST, NkDrawList.SIZEOF); }
	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkContext.USERDATA, NkHandle.SIZEOF); }
	/** Unsafe version of {@link #text_edit(NkTextEdit) text_edit}. */
	public static void ntext_edit(long struct, NkTextEdit value) { memCopy(value.address(), struct + NkContext.TEXT_EDIT, NkTextEdit.SIZEOF); }
	/** Unsafe version of {@link #build(int) build}. */
	public static void nbuild(long struct, int value) { memPutInt(struct + NkContext.BUILD, value); }
	/** Unsafe version of {@link #pool(long) pool}. */
	public static void npool(long struct, long value) { memPutAddress(struct + NkContext.POOL, value); }
	/** Unsafe version of {@link #begin(NkWindow) begin}. */
	public static void nbegin(long struct, NkWindow value) { memPutAddress(struct + NkContext.BEGIN, addressSafe(value)); }
	/** Unsafe version of {@link #end(NkWindow) end}. */
	public static void nend(long struct, NkWindow value) { memPutAddress(struct + NkContext.END, addressSafe(value)); }
	/** Unsafe version of {@link #active(NkWindow) active}. */
	public static void nactive(long struct, NkWindow value) { memPutAddress(struct + NkContext.ACTIVE, addressSafe(value)); }
	/** Unsafe version of {@link #current(NkWindow) current}. */
	public static void ncurrent(long struct, NkWindow value) { memPutAddress(struct + NkContext.CURRENT, addressSafe(value)); }
	/** Unsafe version of {@link #freelist(long) freelist}. */
	public static void nfreelist(long struct, long value) { memPutAddress(struct + NkContext.FREELIST, value); }
	/** Unsafe version of {@link #count(int) count}. */
	public static void ncount(long struct, int value) { memPutInt(struct + NkContext.COUNT, value); }
	/** Unsafe version of {@link #seq(int) seq}. */
	public static void nseq(long struct, int value) { memPutInt(struct + NkContext.SEQ, value); }

	// -----------------------------------

	/** An array of {@link NkContext} structs. */
	public static final class Buffer extends StructBuffer<NkContext, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkContext.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkContext#SIZEOF}, and its mark will be undefined.
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
		protected NkContext newInstance(long address) {
			return new NkContext(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkInput} view of the {@code input} field. */
		public NkInput input() { return NkContext.ninput(address()); }
		/** Returns a {@link NkStyle} view of the {@code style} field. */
		public NkStyle style() { return NkContext.nstyle(address()); }
		/** Returns a {@link NkBuffer} view of the {@code memory} field. */
		public NkBuffer memory() { return NkContext.nmemory(address()); }
		/** Returns a {@link NkClipboard} view of the {@code clip} field. */
		public NkClipboard clip() { return NkContext.nclip(address()); }
		/** Returns the value of the {@code last_widget_state} field. */
		public int last_widget_state() { return NkContext.nlast_widget_state(address()); }
		/** Returns a {@link NkDrawList} view of the {@code draw_list} field. */
		public NkDrawList draw_list() { return NkContext.ndraw_list(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkContext.nuserdata(address()); }
		/** Returns a {@link NkTextEdit} view of the {@code text_edit} field. */
		public NkTextEdit text_edit() { return NkContext.ntext_edit(address()); }
		/** Returns the value of the {@code build} field. */
		public int build() { return NkContext.nbuild(address()); }
		/** Returns the value of the {@code pool} field. */
		public long pool() { return NkContext.npool(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code begin} field. */
		public NkWindow begin() { return NkContext.nbegin(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code end} field. */
		public NkWindow end() { return NkContext.nend(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code active} field. */
		public NkWindow active() { return NkContext.nactive(address()); }
		/** Returns a {@link NkWindow} view of the struct pointed to by the {@code current} field. */
		public NkWindow current() { return NkContext.ncurrent(address()); }
		/** Returns the value of the {@code freelist} field. */
		public long freelist() { return NkContext.nfreelist(address()); }
		/** Returns the value of the {@code count} field. */
		public int count() { return NkContext.ncount(address()); }
		/** Returns the value of the {@code seq} field. */
		public int seq() { return NkContext.nseq(address()); }

		/** Copies the specified {@link NkInput} to the {@code input} field. */
		public NkContext.Buffer input(NkInput value) { NkContext.ninput(address(), value); return this; }
		/** Copies the specified {@link NkStyle} to the {@code style} field. */
		public NkContext.Buffer style(NkStyle value) { NkContext.nstyle(address(), value); return this; }
		/** Copies the specified {@link NkBuffer} to the {@code memory} field. */
		public NkContext.Buffer memory(NkBuffer value) { NkContext.nmemory(address(), value); return this; }
		/** Copies the specified {@link NkClipboard} to the {@code clip} field. */
		public NkContext.Buffer clip(NkClipboard value) { NkContext.nclip(address(), value); return this; }
		/** Sets the specified value to the {@code last_widget_state} field. */
		public NkContext.Buffer last_widget_state(int value) { NkContext.nlast_widget_state(address(), value); return this; }
		/** Copies the specified {@link NkDrawList} to the {@code draw_list} field. */
		public NkContext.Buffer draw_list(NkDrawList value) { NkContext.ndraw_list(address(), value); return this; }
		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkContext.Buffer userdata(NkHandle value) { NkContext.nuserdata(address(), value); return this; }
		/** Copies the specified {@link NkTextEdit} to the {@code text_edit} field. */
		public NkContext.Buffer text_edit(NkTextEdit value) { NkContext.ntext_edit(address(), value); return this; }
		/** Sets the specified value to the {@code build} field. */
		public NkContext.Buffer build(int value) { NkContext.nbuild(address(), value); return this; }
		/** Sets the specified value to the {@code pool} field. */
		public NkContext.Buffer pool(long value) { NkContext.npool(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code begin} field. */
		public NkContext.Buffer begin(NkWindow value) { NkContext.nbegin(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code end} field. */
		public NkContext.Buffer end(NkWindow value) { NkContext.nend(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code active} field. */
		public NkContext.Buffer active(NkWindow value) { NkContext.nactive(address(), value); return this; }
		/** Sets the address of the specified {@link NkWindow} to the {@code current} field. */
		public NkContext.Buffer current(NkWindow value) { NkContext.ncurrent(address(), value); return this; }
		/** Sets the specified value to the {@code freelist} field. */
		public NkContext.Buffer freelist(long value) { NkContext.nfreelist(address(), value); return this; }
		/** Sets the specified value to the {@code count} field. */
		public NkContext.Buffer count(int value) { NkContext.ncount(address(), value); return this; }
		/** Sets the specified value to the {@code seq} field. */
		public NkContext.Buffer seq(int value) { NkContext.nseq(address(), value); return this; }

	}

}