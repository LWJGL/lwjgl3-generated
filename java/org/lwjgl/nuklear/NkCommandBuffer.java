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
 * <pre><code>struct nk_command_buffer {
    struct nk_buffer * base;
    {@link NkRect struct nk_rect} clip;
    int use_clipping;
    {@link NkHandle nk_handle} userdata;
    nk_size begin;
    nk_size end;
    nk_size last;
}</code></pre>
 */
public class NkCommandBuffer extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BASE,
		CLIP,
		USE_CLIPPING,
		USERDATA,
		BEGIN,
		END,
		LAST;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(4),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BASE = layout.offsetof(0);
		CLIP = layout.offsetof(1);
		USE_CLIPPING = layout.offsetof(2);
		USERDATA = layout.offsetof(3);
		BEGIN = layout.offsetof(4);
		END = layout.offsetof(5);
		LAST = layout.offsetof(6);
	}

	NkCommandBuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkCommandBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkCommandBuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code base} field. */
	public NkBuffer base() { return nbase(address()); }
	/** Returns a {@link NkRect} view of the {@code clip} field. */
	public NkRect clip() { return nclip(address()); }
	/** Returns the value of the {@code use_clipping} field. */
	public int use_clipping() { return nuse_clipping(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns the value of the {@code begin} field. */
	public long begin() { return nbegin(address()); }
	/** Returns the value of the {@code end} field. */
	public long end() { return nend(address()); }
	/** Returns the value of the {@code last} field. */
	public long last() { return nlast(address()); }

	/** Sets the address of the specified {@link NkBuffer} to the {@code base} field. */
	public NkCommandBuffer base(NkBuffer value) { nbase(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code clip} field. */
	public NkCommandBuffer clip(NkRect value) { nclip(address(), value); return this; }
	/** Sets the specified value to the {@code use_clipping} field. */
	public NkCommandBuffer use_clipping(int value) { nuse_clipping(address(), value); return this; }
	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkCommandBuffer userdata(NkHandle value) { nuserdata(address(), value); return this; }
	/** Sets the specified value to the {@code begin} field. */
	public NkCommandBuffer begin(long value) { nbegin(address(), value); return this; }
	/** Sets the specified value to the {@code end} field. */
	public NkCommandBuffer end(long value) { nend(address(), value); return this; }
	/** Sets the specified value to the {@code last} field. */
	public NkCommandBuffer last(long value) { nlast(address(), value); return this; }

	/** Unsafe version of {@link #set(NkCommandBuffer) set}. */
	public NkCommandBuffer nset(long struct) {
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
	public NkCommandBuffer set(NkCommandBuffer src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkCommandBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkCommandBuffer malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkCommandBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkCommandBuffer calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkCommandBuffer} instance allocated with {@link BufferUtils}. */
	public static NkCommandBuffer create() {
		return new NkCommandBuffer(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkCommandBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkCommandBuffer create(long address) {
		return address == NULL ? null : new NkCommandBuffer(address, null);
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkCommandBuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkCommandBuffer} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkCommandBuffer mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkCommandBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkCommandBuffer callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkCommandBuffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkCommandBuffer mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkCommandBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkCommandBuffer callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkCommandBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #base}. */
	public static NkBuffer nbase(long struct) { return NkBuffer.create(memGetAddress(struct + NkCommandBuffer.BASE)); }
	/** Unsafe version of {@link #clip}. */
	public static NkRect nclip(long struct) { return NkRect.create(struct + NkCommandBuffer.CLIP); }
	/** Unsafe version of {@link #use_clipping}. */
	public static int nuse_clipping(long struct) { return memGetInt(struct + NkCommandBuffer.USE_CLIPPING); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkCommandBuffer.USERDATA); }
	/** Unsafe version of {@link #begin}. */
	public static long nbegin(long struct) { return memGetAddress(struct + NkCommandBuffer.BEGIN); }
	/** Unsafe version of {@link #end}. */
	public static long nend(long struct) { return memGetAddress(struct + NkCommandBuffer.END); }
	/** Unsafe version of {@link #last}. */
	public static long nlast(long struct) { return memGetAddress(struct + NkCommandBuffer.LAST); }

	/** Unsafe version of {@link #base(NkBuffer) base}. */
	public static void nbase(long struct, NkBuffer value) { memPutAddress(struct + NkCommandBuffer.BASE, value.address()); }
	/** Unsafe version of {@link #clip(NkRect) clip}. */
	public static void nclip(long struct, NkRect value) { memCopy(value.address(), struct + NkCommandBuffer.CLIP, NkRect.SIZEOF); }
	/** Unsafe version of {@link #use_clipping(int) use_clipping}. */
	public static void nuse_clipping(long struct, int value) { memPutInt(struct + NkCommandBuffer.USE_CLIPPING, value); }
	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkCommandBuffer.USERDATA, NkHandle.SIZEOF); }
	/** Unsafe version of {@link #begin(long) begin}. */
	public static void nbegin(long struct, long value) { memPutAddress(struct + NkCommandBuffer.BEGIN, value); }
	/** Unsafe version of {@link #end(long) end}. */
	public static void nend(long struct, long value) { memPutAddress(struct + NkCommandBuffer.END, value); }
	/** Unsafe version of {@link #last(long) last}. */
	public static void nlast(long struct, long value) { memPutAddress(struct + NkCommandBuffer.LAST, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NkCommandBuffer.BASE));
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

	/** An array of {@link NkCommandBuffer} structs. */
	public static final class Buffer extends StructBuffer<NkCommandBuffer, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkCommandBuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkCommandBuffer#SIZEOF}, and its mark will be undefined.
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
		protected NkCommandBuffer newInstance(long address) {
			return new NkCommandBuffer(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code base} field. */
		public NkBuffer base() { return NkCommandBuffer.nbase(address()); }
		/** Returns a {@link NkRect} view of the {@code clip} field. */
		public NkRect clip() { return NkCommandBuffer.nclip(address()); }
		/** Returns the value of the {@code use_clipping} field. */
		public int use_clipping() { return NkCommandBuffer.nuse_clipping(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkCommandBuffer.nuserdata(address()); }
		/** Returns the value of the {@code begin} field. */
		public long begin() { return NkCommandBuffer.nbegin(address()); }
		/** Returns the value of the {@code end} field. */
		public long end() { return NkCommandBuffer.nend(address()); }
		/** Returns the value of the {@code last} field. */
		public long last() { return NkCommandBuffer.nlast(address()); }

		/** Sets the address of the specified {@link NkBuffer} to the {@code base} field. */
		public NkCommandBuffer.Buffer base(NkBuffer value) { NkCommandBuffer.nbase(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code clip} field. */
		public NkCommandBuffer.Buffer clip(NkRect value) { NkCommandBuffer.nclip(address(), value); return this; }
		/** Sets the specified value to the {@code use_clipping} field. */
		public NkCommandBuffer.Buffer use_clipping(int value) { NkCommandBuffer.nuse_clipping(address(), value); return this; }
		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkCommandBuffer.Buffer userdata(NkHandle value) { NkCommandBuffer.nuserdata(address(), value); return this; }
		/** Sets the specified value to the {@code begin} field. */
		public NkCommandBuffer.Buffer begin(long value) { NkCommandBuffer.nbegin(address(), value); return this; }
		/** Sets the specified value to the {@code end} field. */
		public NkCommandBuffer.Buffer end(long value) { NkCommandBuffer.nend(address(), value); return this; }
		/** Sets the specified value to the {@code last} field. */
		public NkCommandBuffer.Buffer last(long value) { NkCommandBuffer.nlast(address(), value); return this; }

	}

}