/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains message information from a thread's message queue.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code hwnd} &ndash; a handle to the window whose window procedure receives the message. This member is {@code NULL} when the message is a thread message.</li>
 * <li>{@code message} &ndash; the message identifier. Applications can only use the low word; the high word is reserved by the system.</li>
 * <li>{@code wParam} &ndash; additional information about the message. The exact meaning depends on the value of the message member.</li>
 * <li>{@code lParam} &ndash; additional information about the message. The exact meaning depends on the value of the message member.</li>
 * <li>{@code time} &ndash; the time at which the message was posted</li>
 * <li>{@code pt} &ndash; the cursor position, in screen coordinates, when the message was posted.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct MSG {
    HWND hwnd;
    UINT message;
    WPARAM wParam;
    LPARAM lParam;
    DWORD time;
    {@link POINT POINT} pt;
}</code></pre>
 */
public class MSG extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HWND,
		MESSAGE,
		WPARAM,
		LPARAM,
		TIME,
		PT;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINT.SIZEOF, POINT.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HWND = layout.offsetof(0);
		MESSAGE = layout.offsetof(1);
		WPARAM = layout.offsetof(2);
		LPARAM = layout.offsetof(3);
		TIME = layout.offsetof(4);
		PT = layout.offsetof(5);
	}

	MSG(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link MSG} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public MSG(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code hwnd} field. */
	public long hwnd() { return nhwnd(address()); }
	/** Returns the value of the {@code message} field. */
	public int message() { return nmessage(address()); }
	/** Returns the value of the {@code wParam} field. */
	public long wParam() { return nwParam(address()); }
	/** Returns the value of the {@code lParam} field. */
	public long lParam() { return nlParam(address()); }
	/** Returns the value of the {@code time} field. */
	public int time() { return ntime(address()); }
	/** Returns a {@link POINT} view of the {@code pt} field. */
	public POINT pt() { return npt(address()); }

	/** Sets the specified value to the {@code hwnd} field. */
	public MSG hwnd(long value) { nhwnd(address(), value); return this; }
	/** Sets the specified value to the {@code message} field. */
	public MSG message(int value) { nmessage(address(), value); return this; }
	/** Sets the specified value to the {@code wParam} field. */
	public MSG wParam(long value) { nwParam(address(), value); return this; }
	/** Sets the specified value to the {@code lParam} field. */
	public MSG lParam(long value) { nlParam(address(), value); return this; }
	/** Sets the specified value to the {@code time} field. */
	public MSG time(int value) { ntime(address(), value); return this; }
	/** Copies the specified {@link POINT} to the {@code pt} field. */
	public MSG pt(POINT value) { npt(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public MSG set(
		long hwnd,
		int message,
		long wParam,
		long lParam,
		int time,
		POINT pt
	) {
		hwnd(hwnd);
		message(message);
		wParam(wParam);
		lParam(lParam);
		time(time);
		pt(pt);

		return this;
	}

	/** Unsafe version of {@link #set(MSG) set}. */
	public MSG nset(long struct) {
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
	public MSG set(MSG src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link MSG} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static MSG malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link MSG} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static MSG calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link MSG} instance allocated with {@link BufferUtils}. */
	public static MSG create() {
		return new MSG(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link MSG} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static MSG create(long address) {
		return address == NULL ? null : new MSG(address, null);
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link MSG.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link MSG} instance allocated on the thread-local {@link MemoryStack}. */
	public static MSG mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link MSG} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static MSG callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link MSG} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static MSG mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link MSG} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static MSG callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MSG.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #hwnd}. */
	public static long nhwnd(long struct) { return memGetAddress(struct + MSG.HWND); }
	/** Unsafe version of {@link #message}. */
	public static int nmessage(long struct) { return memGetInt(struct + MSG.MESSAGE); }
	/** Unsafe version of {@link #wParam}. */
	public static long nwParam(long struct) { return memGetAddress(struct + MSG.WPARAM); }
	/** Unsafe version of {@link #lParam}. */
	public static long nlParam(long struct) { return memGetAddress(struct + MSG.LPARAM); }
	/** Unsafe version of {@link #time}. */
	public static int ntime(long struct) { return memGetInt(struct + MSG.TIME); }
	/** Unsafe version of {@link #pt}. */
	public static POINT npt(long struct) { return POINT.create(struct + MSG.PT); }

	/** Unsafe version of {@link #hwnd(long) hwnd}. */
	public static void nhwnd(long struct, long value) { memPutAddress(struct + MSG.HWND, value); }
	/** Unsafe version of {@link #message(int) message}. */
	public static void nmessage(long struct, int value) { memPutInt(struct + MSG.MESSAGE, value); }
	/** Unsafe version of {@link #wParam(long) wParam}. */
	public static void nwParam(long struct, long value) { memPutAddress(struct + MSG.WPARAM, value); }
	/** Unsafe version of {@link #lParam(long) lParam}. */
	public static void nlParam(long struct, long value) { memPutAddress(struct + MSG.LPARAM, value); }
	/** Unsafe version of {@link #time(int) time}. */
	public static void ntime(long struct, int value) { memPutInt(struct + MSG.TIME, value); }
	/** Unsafe version of {@link #pt(POINT) pt}. */
	public static void npt(long struct, POINT value) { memCopy(value.address(), struct + MSG.PT, POINT.SIZEOF); }

	// -----------------------------------

	/** An array of {@link MSG} structs. */
	public static final class Buffer extends StructBuffer<MSG, Buffer> {

		/**
		 * Creates a new {@link MSG.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link MSG#SIZEOF}, and its mark will be undefined.
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
		protected MSG newInstance(long address) {
			return new MSG(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code hwnd} field. */
		public long hwnd() { return MSG.nhwnd(address()); }
		/** Returns the value of the {@code message} field. */
		public int message() { return MSG.nmessage(address()); }
		/** Returns the value of the {@code wParam} field. */
		public long wParam() { return MSG.nwParam(address()); }
		/** Returns the value of the {@code lParam} field. */
		public long lParam() { return MSG.nlParam(address()); }
		/** Returns the value of the {@code time} field. */
		public int time() { return MSG.ntime(address()); }
		/** Returns a {@link POINT} view of the {@code pt} field. */
		public POINT pt() { return MSG.npt(address()); }

		/** Sets the specified value to the {@code hwnd} field. */
		public MSG.Buffer hwnd(long value) { MSG.nhwnd(address(), value); return this; }
		/** Sets the specified value to the {@code message} field. */
		public MSG.Buffer message(int value) { MSG.nmessage(address(), value); return this; }
		/** Sets the specified value to the {@code wParam} field. */
		public MSG.Buffer wParam(long value) { MSG.nwParam(address(), value); return this; }
		/** Sets the specified value to the {@code lParam} field. */
		public MSG.Buffer lParam(long value) { MSG.nlParam(address(), value); return this; }
		/** Sets the specified value to the {@code time} field. */
		public MSG.Buffer time(int value) { MSG.ntime(address(), value); return this; }
		/** Copies the specified {@link POINT} to the {@code pt} field. */
		public MSG.Buffer pt(POINT value) { MSG.npt(address(), value); return this; }

	}

}