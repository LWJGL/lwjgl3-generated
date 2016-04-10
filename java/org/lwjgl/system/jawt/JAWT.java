/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for containing native AWT functions.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code version} &ndash; Version of this structure. This must always be set before calling JAWT_GetAWT()</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct JAWT {
    jint version;
    void * GetDrawingSurface;
    void * FreeDrawingSurface;
    void * Lock;
    void * Unlock;
    void * GetComponent;
}</code></pre>
 */
public class JAWT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		VERSION,
		GETDRAWINGSURFACE,
		FREEDRAWINGSURFACE,
		LOCK,
		UNLOCK,
		GETCOMPONENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		VERSION = layout.offsetof(0);
		GETDRAWINGSURFACE = layout.offsetof(1);
		FREEDRAWINGSURFACE = layout.offsetof(2);
		LOCK = layout.offsetof(3);
		UNLOCK = layout.offsetof(4);
		GETCOMPONENT = layout.offsetof(5);
	}

	JAWT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link JAWT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public JAWT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code version} field. */
	public int version() { return nversion(address()); }
	/** Returns the value of the {@code GetDrawingSurface} field. */
	public long GetDrawingSurface() { return nGetDrawingSurface(address()); }
	/** Returns the value of the {@code FreeDrawingSurface} field. */
	public long FreeDrawingSurface() { return nFreeDrawingSurface(address()); }
	/** Returns the value of the {@code Lock} field. */
	public long Lock() { return nLock(address()); }
	/** Returns the value of the {@code Unlock} field. */
	public long Unlock() { return nUnlock(address()); }
	/** Returns the value of the {@code GetComponent} field. */
	public long GetComponent() { return nGetComponent(address()); }

	/** Sets the specified value to the {@code version} field. */
	public JAWT version(int value) { nversion(address(), value); return this; }
	/** Sets the specified value to the {@code GetDrawingSurface} field. */
	public JAWT GetDrawingSurface(long value) { nGetDrawingSurface(address(), value); return this; }
	/** Sets the specified value to the {@code FreeDrawingSurface} field. */
	public JAWT FreeDrawingSurface(long value) { nFreeDrawingSurface(address(), value); return this; }
	/** Sets the specified value to the {@code Lock} field. */
	public JAWT Lock(long value) { nLock(address(), value); return this; }
	/** Sets the specified value to the {@code Unlock} field. */
	public JAWT Unlock(long value) { nUnlock(address(), value); return this; }
	/** Sets the specified value to the {@code GetComponent} field. */
	public JAWT GetComponent(long value) { nGetComponent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public JAWT set(
		int version,
		long GetDrawingSurface,
		long FreeDrawingSurface,
		long Lock,
		long Unlock,
		long GetComponent
	) {
		version(version);
		GetDrawingSurface(GetDrawingSurface);
		FreeDrawingSurface(FreeDrawingSurface);
		Lock(Lock);
		Unlock(Unlock);
		GetComponent(GetComponent);

		return this;
	}

	/** Unsafe version of {@link #set(JAWT) set}. */
	public JAWT nset(long struct) {
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
	public JAWT set(JAWT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link JAWT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static JAWT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link JAWT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static JAWT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link JAWT} instance allocated with {@link BufferUtils}. */
	public static JAWT create() {
		return new JAWT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link JAWT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static JAWT create(long address) {
		return address == NULL ? null : new JAWT(address, null);
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link JAWT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link JAWT} instance allocated on the thread-local {@link MemoryStack}. */
	public static JAWT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link JAWT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static JAWT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link JAWT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #version}. */
	public static int nversion(long struct) { return memGetInt(struct + JAWT.VERSION); }
	/** Unsafe version of {@link #GetDrawingSurface}. */
	public static long nGetDrawingSurface(long struct) { return memGetAddress(struct + JAWT.GETDRAWINGSURFACE); }
	/** Unsafe version of {@link #FreeDrawingSurface}. */
	public static long nFreeDrawingSurface(long struct) { return memGetAddress(struct + JAWT.FREEDRAWINGSURFACE); }
	/** Unsafe version of {@link #Lock}. */
	public static long nLock(long struct) { return memGetAddress(struct + JAWT.LOCK); }
	/** Unsafe version of {@link #Unlock}. */
	public static long nUnlock(long struct) { return memGetAddress(struct + JAWT.UNLOCK); }
	/** Unsafe version of {@link #GetComponent}. */
	public static long nGetComponent(long struct) { return memGetAddress(struct + JAWT.GETCOMPONENT); }

	/** Unsafe version of {@link #version(int) version}. */
	public static void nversion(long struct, int value) { memPutInt(struct + JAWT.VERSION, value); }
	/** Unsafe version of {@link #GetDrawingSurface(long) GetDrawingSurface}. */
	public static void nGetDrawingSurface(long struct, long value) { memPutAddress(struct + JAWT.GETDRAWINGSURFACE, value); }
	/** Unsafe version of {@link #FreeDrawingSurface(long) FreeDrawingSurface}. */
	public static void nFreeDrawingSurface(long struct, long value) { memPutAddress(struct + JAWT.FREEDRAWINGSURFACE, value); }
	/** Unsafe version of {@link #Lock(long) Lock}. */
	public static void nLock(long struct, long value) { memPutAddress(struct + JAWT.LOCK, value); }
	/** Unsafe version of {@link #Unlock(long) Unlock}. */
	public static void nUnlock(long struct, long value) { memPutAddress(struct + JAWT.UNLOCK, value); }
	/** Unsafe version of {@link #GetComponent(long) GetComponent}. */
	public static void nGetComponent(long struct, long value) { memPutAddress(struct + JAWT.GETCOMPONENT, value); }

	// -----------------------------------

	/** An array of {@link JAWT} structs. */
	public static final class Buffer extends StructBuffer<JAWT, Buffer> {

		/**
		 * Creates a new {@link JAWT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link JAWT#SIZEOF}, and its mark will be undefined.
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
		protected JAWT newInstance(long address) {
			return new JAWT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code version} field. */
		public int version() { return JAWT.nversion(address()); }
		/** Returns the value of the {@code GetDrawingSurface} field. */
		public long GetDrawingSurface() { return JAWT.nGetDrawingSurface(address()); }
		/** Returns the value of the {@code FreeDrawingSurface} field. */
		public long FreeDrawingSurface() { return JAWT.nFreeDrawingSurface(address()); }
		/** Returns the value of the {@code Lock} field. */
		public long Lock() { return JAWT.nLock(address()); }
		/** Returns the value of the {@code Unlock} field. */
		public long Unlock() { return JAWT.nUnlock(address()); }
		/** Returns the value of the {@code GetComponent} field. */
		public long GetComponent() { return JAWT.nGetComponent(address()); }

		/** Sets the specified value to the {@code version} field. */
		public JAWT.Buffer version(int value) { JAWT.nversion(address(), value); return this; }
		/** Sets the specified value to the {@code GetDrawingSurface} field. */
		public JAWT.Buffer GetDrawingSurface(long value) { JAWT.nGetDrawingSurface(address(), value); return this; }
		/** Sets the specified value to the {@code FreeDrawingSurface} field. */
		public JAWT.Buffer FreeDrawingSurface(long value) { JAWT.nFreeDrawingSurface(address(), value); return this; }
		/** Sets the specified value to the {@code Lock} field. */
		public JAWT.Buffer Lock(long value) { JAWT.nLock(address(), value); return this; }
		/** Sets the specified value to the {@code Unlock} field. */
		public JAWT.Buffer Unlock(long value) { JAWT.nUnlock(address(), value); return this; }
		/** Sets the specified value to the {@code GetComponent} field. */
		public JAWT.Buffer GetComponent(long value) { JAWT.nGetComponent(address(), value); return this; }

	}

}