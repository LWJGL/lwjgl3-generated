/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

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
    float delta_time_seconds;
    nk_button_behavior button_behavior;
    {@link NkConfigurationStacks struct nk_configuration_stacks} stacks;
    {@link NkDrawList struct nk_draw_list} draw_list;
    {@link NkHandle nk_handle} userdata;
    {@link NkTextEdit struct nk_text_edit} text_edit;
    {@link NkCommandBuffer struct nk_command_buffer} overlay;
    int build;
    int use_pool;
    {@link NkPool struct nk_pool} pool;
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
		DELTA_TIME_SECONDS,
		BUTTON_BEHAVIOR,
		STACKS,
		DRAW_LIST,
		USERDATA,
		TEXT_EDIT,
		OVERLAY,
		BUILD,
		USE_POOL,
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
			__member(4),
			__member(4),
			__member(NkConfigurationStacks.SIZEOF, NkConfigurationStacks.ALIGNOF),
			__member(NkDrawList.SIZEOF, NkDrawList.ALIGNOF),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(NkTextEdit.SIZEOF, NkTextEdit.ALIGNOF),
			__member(NkCommandBuffer.SIZEOF, NkCommandBuffer.ALIGNOF),
			__member(4),
			__member(4),
			__member(NkPool.SIZEOF, NkPool.ALIGNOF),
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
		DELTA_TIME_SECONDS = layout.offsetof(5);
		BUTTON_BEHAVIOR = layout.offsetof(6);
		STACKS = layout.offsetof(7);
		DRAW_LIST = layout.offsetof(8);
		USERDATA = layout.offsetof(9);
		TEXT_EDIT = layout.offsetof(10);
		OVERLAY = layout.offsetof(11);
		BUILD = layout.offsetof(12);
		USE_POOL = layout.offsetof(13);
		POOL = layout.offsetof(14);
		BEGIN = layout.offsetof(15);
		END = layout.offsetof(16);
		ACTIVE = layout.offsetof(17);
		CURRENT = layout.offsetof(18);
		FREELIST = layout.offsetof(19);
		COUNT = layout.offsetof(20);
		SEQ = layout.offsetof(21);
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
	/** Returns the value of the {@code delta_time_seconds} field. */
	public float delta_time_seconds() { return ndelta_time_seconds(address()); }
	/** Returns the value of the {@code button_behavior} field. */
	public int button_behavior() { return nbutton_behavior(address()); }
	/** Returns a {@link NkConfigurationStacks} view of the {@code stacks} field. */
	public NkConfigurationStacks stacks() { return nstacks(address()); }
	/** Returns a {@link NkDrawList} view of the {@code draw_list} field. */
	public NkDrawList draw_list() { return ndraw_list(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns a {@link NkTextEdit} view of the {@code text_edit} field. */
	public NkTextEdit text_edit() { return ntext_edit(address()); }
	/** Returns a {@link NkCommandBuffer} view of the {@code overlay} field. */
	public NkCommandBuffer overlay() { return noverlay(address()); }
	/** Returns the value of the {@code build} field. */
	public int build() { return nbuild(address()); }
	/** Returns the value of the {@code use_pool} field. */
	public boolean use_pool() { return nuse_pool(address()) != 0; }
	/** Returns a {@link NkPool} view of the {@code pool} field. */
	public NkPool pool() { return npool(address()); }
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
	/** Unsafe version of {@link #delta_time_seconds}. */
	public static float ndelta_time_seconds(long struct) { return memGetFloat(struct + NkContext.DELTA_TIME_SECONDS); }
	/** Unsafe version of {@link #button_behavior}. */
	public static int nbutton_behavior(long struct) { return memGetInt(struct + NkContext.BUTTON_BEHAVIOR); }
	/** Unsafe version of {@link #stacks}. */
	public static NkConfigurationStacks nstacks(long struct) { return NkConfigurationStacks.create(struct + NkContext.STACKS); }
	/** Unsafe version of {@link #draw_list}. */
	public static NkDrawList ndraw_list(long struct) { return NkDrawList.create(struct + NkContext.DRAW_LIST); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkContext.USERDATA); }
	/** Unsafe version of {@link #text_edit}. */
	public static NkTextEdit ntext_edit(long struct) { return NkTextEdit.create(struct + NkContext.TEXT_EDIT); }
	/** Unsafe version of {@link #overlay}. */
	public static NkCommandBuffer noverlay(long struct) { return NkCommandBuffer.create(struct + NkContext.OVERLAY); }
	/** Unsafe version of {@link #build}. */
	public static int nbuild(long struct) { return memGetInt(struct + NkContext.BUILD); }
	/** Unsafe version of {@link #use_pool}. */
	public static int nuse_pool(long struct) { return memGetInt(struct + NkContext.USE_POOL); }
	/** Unsafe version of {@link #pool}. */
	public static NkPool npool(long struct) { return NkPool.create(struct + NkContext.POOL); }
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

	// -----------------------------------

	/** An array of {@link NkContext} structs. */
	public static class Buffer extends StructBuffer<NkContext, Buffer> implements NativeResource {

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
			return new NkContext(address, container);
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
		/** Returns the value of the {@code delta_time_seconds} field. */
		public float delta_time_seconds() { return NkContext.ndelta_time_seconds(address()); }
		/** Returns the value of the {@code button_behavior} field. */
		public int button_behavior() { return NkContext.nbutton_behavior(address()); }
		/** Returns a {@link NkConfigurationStacks} view of the {@code stacks} field. */
		public NkConfigurationStacks stacks() { return NkContext.nstacks(address()); }
		/** Returns a {@link NkDrawList} view of the {@code draw_list} field. */
		public NkDrawList draw_list() { return NkContext.ndraw_list(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkContext.nuserdata(address()); }
		/** Returns a {@link NkTextEdit} view of the {@code text_edit} field. */
		public NkTextEdit text_edit() { return NkContext.ntext_edit(address()); }
		/** Returns a {@link NkCommandBuffer} view of the {@code overlay} field. */
		public NkCommandBuffer overlay() { return NkContext.noverlay(address()); }
		/** Returns the value of the {@code build} field. */
		public int build() { return NkContext.nbuild(address()); }
		/** Returns the value of the {@code use_pool} field. */
		public boolean use_pool() { return NkContext.nuse_pool(address()) != 0; }
		/** Returns a {@link NkPool} view of the {@code pool} field. */
		public NkPool pool() { return NkContext.npool(address()); }
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

	}

}