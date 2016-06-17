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
 * <pre><code>struct nk_draw_command {
    unsigned int elem_count;
    {@link NkRect struct nk_rect} clip_rect;
    {@link NkHandle nk_handle} texture;
    {@link NkHandle nk_handle} userdata;
}</code></pre>
 */
public class NkDrawCommand extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ELEM_COUNT,
		CLIP_RECT,
		TEXTURE,
		USERDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ELEM_COUNT = layout.offsetof(0);
		CLIP_RECT = layout.offsetof(1);
		TEXTURE = layout.offsetof(2);
		USERDATA = layout.offsetof(3);
	}

	NkDrawCommand(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkDrawCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkDrawCommand(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code elem_count} field. */
	public int elem_count() { return nelem_count(address()); }
	/** Returns a {@link NkRect} view of the {@code clip_rect} field. */
	public NkRect clip_rect() { return nclip_rect(address()); }
	/** Returns a {@link NkHandle} view of the {@code texture} field. */
	public NkHandle texture() { return ntexture(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }

	/** Sets the specified value to the {@code elem_count} field. */
	public NkDrawCommand elem_count(int value) { nelem_count(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code clip_rect} field. */
	public NkDrawCommand clip_rect(NkRect value) { nclip_rect(address(), value); return this; }
	/** Copies the specified {@link NkHandle} to the {@code texture} field. */
	public NkDrawCommand texture(NkHandle value) { ntexture(address(), value); return this; }
	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkDrawCommand userdata(NkHandle value) { nuserdata(address(), value); return this; }

	/** Unsafe version of {@link #set(NkDrawCommand) set}. */
	public NkDrawCommand nset(long struct) {
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
	public NkDrawCommand set(NkDrawCommand src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkDrawCommand malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkDrawCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkDrawCommand calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkDrawCommand} instance allocated with {@link BufferUtils}. */
	public static NkDrawCommand create() {
		return new NkDrawCommand(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkDrawCommand} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkDrawCommand create(long address) {
		return address == NULL ? null : new NkDrawCommand(address, null);
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkDrawCommand.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawCommand} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkDrawCommand mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkDrawCommand} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkDrawCommand callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkDrawCommand} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawCommand mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawCommand callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #elem_count}. */
	public static int nelem_count(long struct) { return memGetInt(struct + NkDrawCommand.ELEM_COUNT); }
	/** Unsafe version of {@link #clip_rect}. */
	public static NkRect nclip_rect(long struct) { return NkRect.create(struct + NkDrawCommand.CLIP_RECT); }
	/** Unsafe version of {@link #texture}. */
	public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkDrawCommand.TEXTURE); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkDrawCommand.USERDATA); }

	/** Unsafe version of {@link #elem_count(int) elem_count}. */
	public static void nelem_count(long struct, int value) { memPutInt(struct + NkDrawCommand.ELEM_COUNT, value); }
	/** Unsafe version of {@link #clip_rect(NkRect) clip_rect}. */
	public static void nclip_rect(long struct, NkRect value) { memCopy(value.address(), struct + NkDrawCommand.CLIP_RECT, NkRect.SIZEOF); }
	/** Unsafe version of {@link #texture(NkHandle) texture}. */
	public static void ntexture(long struct, NkHandle value) { memCopy(value.address(), struct + NkDrawCommand.TEXTURE, NkHandle.SIZEOF); }
	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkDrawCommand.USERDATA, NkHandle.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkDrawCommand} structs. */
	public static final class Buffer extends StructBuffer<NkDrawCommand, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkDrawCommand.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkDrawCommand#SIZEOF}, and its mark will be undefined.
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
		protected NkDrawCommand newInstance(long address) {
			return new NkDrawCommand(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code elem_count} field. */
		public int elem_count() { return NkDrawCommand.nelem_count(address()); }
		/** Returns a {@link NkRect} view of the {@code clip_rect} field. */
		public NkRect clip_rect() { return NkDrawCommand.nclip_rect(address()); }
		/** Returns a {@link NkHandle} view of the {@code texture} field. */
		public NkHandle texture() { return NkDrawCommand.ntexture(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkDrawCommand.nuserdata(address()); }

		/** Sets the specified value to the {@code elem_count} field. */
		public NkDrawCommand.Buffer elem_count(int value) { NkDrawCommand.nelem_count(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code clip_rect} field. */
		public NkDrawCommand.Buffer clip_rect(NkRect value) { NkDrawCommand.nclip_rect(address(), value); return this; }
		/** Copies the specified {@link NkHandle} to the {@code texture} field. */
		public NkDrawCommand.Buffer texture(NkHandle value) { NkDrawCommand.ntexture(address(), value); return this; }
		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkDrawCommand.Buffer userdata(NkHandle value) { NkDrawCommand.nuserdata(address(), value); return this; }

	}

}