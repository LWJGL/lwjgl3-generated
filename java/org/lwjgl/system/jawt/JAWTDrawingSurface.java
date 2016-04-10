/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for containing the underlying drawing information of a component.
 * 
 * <p>All operations on a JAWT_DrawingSurface MUST be performed from the same thread as the call to {@code GetDrawingSurface}.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code env} &ndash; 
 * Cached reference to the Java environment of the calling thread.
 * 
 * <p>If Lock(), Unlock(), GetDrawingSurfaceInfo() or FreeDrawingSurfaceInfo() are called from a different thread, this data member should be set before
 * calling those functions.</p></li>
 * <li>{@code target} &ndash; Cached reference to the target object.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct JAWT_DrawingSurface {
    JNIEnv * env;
    jobject target;
    void * Lock;
    void * GetDrawingSurfaceInfo;
    void * FreeDrawingSurfaceInfo;
    void * Unlock;
}</code></pre>
 */
public class JAWTDrawingSurface extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ENV,
		TARGET,
		LOCK,
		GETDRAWINGSURFACEINFO,
		FREEDRAWINGSURFACEINFO,
		UNLOCK;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ENV = layout.offsetof(0);
		TARGET = layout.offsetof(1);
		LOCK = layout.offsetof(2);
		GETDRAWINGSURFACEINFO = layout.offsetof(3);
		FREEDRAWINGSURFACEINFO = layout.offsetof(4);
		UNLOCK = layout.offsetof(5);
	}

	JAWTDrawingSurface(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link JAWTDrawingSurface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public JAWTDrawingSurface(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code env} field. */
	public long env() { return nenv(address()); }
	/** Returns the value of the {@code target} field. */
	public long target() { return ntarget(address()); }
	/** Returns the value of the {@code Lock} field. */
	public long Lock() { return nLock(address()); }
	/** Returns the value of the {@code GetDrawingSurfaceInfo} field. */
	public long GetDrawingSurfaceInfo() { return nGetDrawingSurfaceInfo(address()); }
	/** Returns the value of the {@code FreeDrawingSurfaceInfo} field. */
	public long FreeDrawingSurfaceInfo() { return nFreeDrawingSurfaceInfo(address()); }
	/** Returns the value of the {@code Unlock} field. */
	public long Unlock() { return nUnlock(address()); }

	// -----------------------------------

	/** Returns a new {@link JAWTDrawingSurface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static JAWTDrawingSurface malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link JAWTDrawingSurface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static JAWTDrawingSurface calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link JAWTDrawingSurface} instance allocated with {@link BufferUtils}. */
	public static JAWTDrawingSurface create() {
		return new JAWTDrawingSurface(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link JAWTDrawingSurface} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static JAWTDrawingSurface create(long address) {
		return address == NULL ? null : new JAWTDrawingSurface(address, null);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link JAWTDrawingSurface.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link JAWTDrawingSurface} instance allocated on the thread-local {@link MemoryStack}. */
	public static JAWTDrawingSurface mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link JAWTDrawingSurface} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static JAWTDrawingSurface callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTDrawingSurface mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTDrawingSurface callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTDrawingSurface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #env}. */
	public static long nenv(long struct) { return memGetAddress(struct + JAWTDrawingSurface.ENV); }
	/** Unsafe version of {@link #target}. */
	public static long ntarget(long struct) { return memGetAddress(struct + JAWTDrawingSurface.TARGET); }
	/** Unsafe version of {@link #Lock}. */
	public static long nLock(long struct) { return memGetAddress(struct + JAWTDrawingSurface.LOCK); }
	/** Unsafe version of {@link #GetDrawingSurfaceInfo}. */
	public static long nGetDrawingSurfaceInfo(long struct) { return memGetAddress(struct + JAWTDrawingSurface.GETDRAWINGSURFACEINFO); }
	/** Unsafe version of {@link #FreeDrawingSurfaceInfo}. */
	public static long nFreeDrawingSurfaceInfo(long struct) { return memGetAddress(struct + JAWTDrawingSurface.FREEDRAWINGSURFACEINFO); }
	/** Unsafe version of {@link #Unlock}. */
	public static long nUnlock(long struct) { return memGetAddress(struct + JAWTDrawingSurface.UNLOCK); }

	// -----------------------------------

	/** An array of {@link JAWTDrawingSurface} structs. */
	public static final class Buffer extends StructBuffer<JAWTDrawingSurface, Buffer> {

		/**
		 * Creates a new {@link JAWTDrawingSurface.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link JAWTDrawingSurface#SIZEOF}, and its mark will be undefined.
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
		protected JAWTDrawingSurface newInstance(long address) {
			return new JAWTDrawingSurface(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code env} field. */
		public long env() { return JAWTDrawingSurface.nenv(address()); }
		/** Returns the value of the {@code target} field. */
		public long target() { return JAWTDrawingSurface.ntarget(address()); }
		/** Returns the value of the {@code Lock} field. */
		public long Lock() { return JAWTDrawingSurface.nLock(address()); }
		/** Returns the value of the {@code GetDrawingSurfaceInfo} field. */
		public long GetDrawingSurfaceInfo() { return JAWTDrawingSurface.nGetDrawingSurfaceInfo(address()); }
		/** Returns the value of the {@code FreeDrawingSurfaceInfo} field. */
		public long FreeDrawingSurfaceInfo() { return JAWTDrawingSurface.nFreeDrawingSurfaceInfo(address()); }
		/** Returns the value of the {@code Unlock} field. */
		public long Unlock() { return JAWTDrawingSurface.nUnlock(address()); }

	}

}