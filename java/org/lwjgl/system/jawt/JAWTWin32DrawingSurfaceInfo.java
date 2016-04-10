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

import org.lwjgl.system.windows.User32;

/**
 * Win32-specific declarations for AWT native interface.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code hwnd} &ndash; the native window handle</li>
 * <li>{@code hbitmap} &ndash; the DDB handle</li>
 * <li>{@code pbits} &ndash; the DIB handle</li>
 * <li>{@code hdc} &ndash; the device context handle. This HDC should always be used instead of the HDC returned from {@code BeginPaint()} or any calls to {@link User32#GetDC}.</li>
 * <li>{@code hpalette} &ndash; the palette handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct JAWT_Win32DrawingSurfaceInfo {
    union {
        HWND hwnd;
        HBITMAP hbitmap;
        void * pbits;
    };
    HDC hdc;
    HPALETTE hpalette;
}</code></pre>
 */
public class JAWTWin32DrawingSurfaceInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HWND,
		HBITMAP,
		PBITS,
		HDC,
		HPALETTE;

	static {
		Layout layout = __struct(
			__union(
				__member(POINTER_SIZE),
				__member(POINTER_SIZE),
				__member(POINTER_SIZE)
			),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HWND = layout.offsetof(1);
		HBITMAP = layout.offsetof(2);
		PBITS = layout.offsetof(3);
		HDC = layout.offsetof(4);
		HPALETTE = layout.offsetof(5);
	}

	JAWTWin32DrawingSurfaceInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link JAWTWin32DrawingSurfaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public JAWTWin32DrawingSurfaceInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code hwnd} field. */
	public long hwnd() { return nhwnd(address()); }
	/** Returns the value of the {@code hbitmap} field. */
	public long hbitmap() { return nhbitmap(address()); }
	/**
	 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pbits} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public ByteBuffer pbits(int capacity) { return npbits(address(), capacity); }
	/** Returns the value of the {@code hdc} field. */
	public long hdc() { return nhdc(address()); }
	/** Returns the value of the {@code hpalette} field. */
	public long hpalette() { return nhpalette(address()); }

	// -----------------------------------

	/** Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static JAWTWin32DrawingSurfaceInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static JAWTWin32DrawingSurfaceInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated with {@link BufferUtils}. */
	public static JAWTWin32DrawingSurfaceInfo create() {
		return new JAWTWin32DrawingSurfaceInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static JAWTWin32DrawingSurfaceInfo create(long address) {
		return address == NULL ? null : new JAWTWin32DrawingSurfaceInfo(address, null);
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static JAWTWin32DrawingSurfaceInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static JAWTWin32DrawingSurfaceInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTWin32DrawingSurfaceInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTWin32DrawingSurfaceInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #hwnd}. */
	public static long nhwnd(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HWND); }
	/** Unsafe version of {@link #hbitmap}. */
	public static long nhbitmap(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HBITMAP); }
	/** Unsafe version of {@link #pbits(int) pbits}. */
	public static ByteBuffer npbits(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.PBITS), capacity); }
	/** Unsafe version of {@link #hdc}. */
	public static long nhdc(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HDC); }
	/** Unsafe version of {@link #hpalette}. */
	public static long nhpalette(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HPALETTE); }

	// -----------------------------------

	/** An array of {@link JAWTWin32DrawingSurfaceInfo} structs. */
	public static final class Buffer extends StructBuffer<JAWTWin32DrawingSurfaceInfo, Buffer> {

		/**
		 * Creates a new {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link JAWTWin32DrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.
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
		protected JAWTWin32DrawingSurfaceInfo newInstance(long address) {
			return new JAWTWin32DrawingSurfaceInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code hwnd} field. */
		public long hwnd() { return JAWTWin32DrawingSurfaceInfo.nhwnd(address()); }
		/** Returns the value of the {@code hbitmap} field. */
		public long hbitmap() { return JAWTWin32DrawingSurfaceInfo.nhbitmap(address()); }
		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pbits} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public ByteBuffer pbits(int capacity) { return JAWTWin32DrawingSurfaceInfo.npbits(address(), capacity); }
		/** Returns the value of the {@code hdc} field. */
		public long hdc() { return JAWTWin32DrawingSurfaceInfo.nhdc(address()); }
		/** Returns the value of the {@code hpalette} field. */
		public long hpalette() { return JAWTWin32DrawingSurfaceInfo.nhpalette(address()); }

	}

}