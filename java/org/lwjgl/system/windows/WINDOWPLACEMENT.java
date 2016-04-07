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
 * Contains information about the placement of a window on the screen.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct WINDOWPLACEMENT {
    UINT length;
    UINT flags;
    UINT showCmd;
    {@link POINT POINT} ptMinPosition;
    {@link POINT POINT} ptMaxPosition;
    {@link RECT RECT} rcNormalPosition;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>length</td><td>the length of the structure, in bytes. Before calling the {@link User32#GetWindowPlacement} or {@link User32#SetWindowPlacement} functions, set this member to
 * {@link #SIZEOF}.</td></tr>
 * <tr><td>flags</td><td>the flags that control the position of the minimized window and the method by which the window is restored. This member can be one or more of thefollowing values:<br>{@link User32#WPF_SETMINPOSITION} {@link User32#WPF_RESTORETOMAXIMIZED} {@link User32#WPF_ASYNCWINDOWPLACEMENT}</td></tr>
 * <tr><td>showCmd</td><td>the current show state of the window</td></tr>
 * <tr><td>ptMinPosition</td><td>the coordinates of the window's upper-left corner when the window is minimized</td></tr>
 * <tr><td>ptMaxPosition</td><td>the coordinates of the window's upper-left corner when the window is maximized</td></tr>
 * <tr><td>rcNormalPosition</td><td>the window's coordinates when the window is in the restored position</td></tr>
 * </table>
 */
public class WINDOWPLACEMENT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		LENGTH,
		FLAGS,
		SHOWCMD,
		PTMINPOSITION,
		PTMAXPOSITION,
		RCNORMALPOSITION;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(POINT.SIZEOF, POINT.ALIGNOF),
			__member(POINT.SIZEOF, POINT.ALIGNOF),
			__member(RECT.SIZEOF, RECT.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		LENGTH = layout.offsetof(0);
		FLAGS = layout.offsetof(1);
		SHOWCMD = layout.offsetof(2);
		PTMINPOSITION = layout.offsetof(3);
		PTMAXPOSITION = layout.offsetof(4);
		RCNORMALPOSITION = layout.offsetof(5);
	}

	WINDOWPLACEMENT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link WINDOWPLACEMENT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public WINDOWPLACEMENT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code length} field. */
	public int length() { return nlength(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code showCmd} field. */
	public int showCmd() { return nshowCmd(address()); }
	/** Returns a {@link POINT} view of the {@code ptMinPosition} field. */
	public POINT ptMinPosition() { return nptMinPosition(address()); }
	/** Returns a {@link POINT} view of the {@code ptMaxPosition} field. */
	public POINT ptMaxPosition() { return nptMaxPosition(address()); }
	/** Returns a {@link RECT} view of the {@code rcNormalPosition} field. */
	public RECT rcNormalPosition() { return nrcNormalPosition(address()); }

	/** Sets the specified value to the {@code length} field. */
	public WINDOWPLACEMENT length(int value) { nlength(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public WINDOWPLACEMENT flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code showCmd} field. */
	public WINDOWPLACEMENT showCmd(int value) { nshowCmd(address(), value); return this; }
	/** Copies the specified {@link POINT} to the {@code ptMinPosition} field. */
	public WINDOWPLACEMENT ptMinPosition(POINT value) { nptMinPosition(address(), value); return this; }
	/** Copies the specified {@link POINT} to the {@code ptMaxPosition} field. */
	public WINDOWPLACEMENT ptMaxPosition(POINT value) { nptMaxPosition(address(), value); return this; }
	/** Copies the specified {@link RECT} to the {@code rcNormalPosition} field. */
	public WINDOWPLACEMENT rcNormalPosition(RECT value) { nrcNormalPosition(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public WINDOWPLACEMENT set(
		int length,
		int flags,
		int showCmd,
		POINT ptMinPosition,
		POINT ptMaxPosition,
		RECT rcNormalPosition
	) {
		length(length);
		flags(flags);
		showCmd(showCmd);
		ptMinPosition(ptMinPosition);
		ptMaxPosition(ptMaxPosition);
		rcNormalPosition(rcNormalPosition);

		return this;
	}

	/** Unsafe version of {@link #set(WINDOWPLACEMENT) set}. */
	public WINDOWPLACEMENT nset(long struct) {
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
	public WINDOWPLACEMENT set(WINDOWPLACEMENT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link WINDOWPLACEMENT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static WINDOWPLACEMENT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link WINDOWPLACEMENT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static WINDOWPLACEMENT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link WINDOWPLACEMENT} instance allocated with {@link BufferUtils}. */
	public static WINDOWPLACEMENT create() {
		return new WINDOWPLACEMENT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link WINDOWPLACEMENT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static WINDOWPLACEMENT create(long address) {
		return address == NULL ? null : new WINDOWPLACEMENT(address, null);
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link WINDOWPLACEMENT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link WINDOWPLACEMENT} instance allocated on the thread-local {@link MemoryStack}. */
	public static WINDOWPLACEMENT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link WINDOWPLACEMENT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static WINDOWPLACEMENT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static WINDOWPLACEMENT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static WINDOWPLACEMENT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #length}. */
	public static int nlength(long struct) { return memGetInt(struct + WINDOWPLACEMENT.LENGTH); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + WINDOWPLACEMENT.FLAGS); }
	/** Unsafe version of {@link #showCmd}. */
	public static int nshowCmd(long struct) { return memGetInt(struct + WINDOWPLACEMENT.SHOWCMD); }
	/** Unsafe version of {@link #ptMinPosition}. */
	public static POINT nptMinPosition(long struct) { return POINT.create(struct + WINDOWPLACEMENT.PTMINPOSITION); }
	/** Unsafe version of {@link #ptMaxPosition}. */
	public static POINT nptMaxPosition(long struct) { return POINT.create(struct + WINDOWPLACEMENT.PTMAXPOSITION); }
	/** Unsafe version of {@link #rcNormalPosition}. */
	public static RECT nrcNormalPosition(long struct) { return RECT.create(struct + WINDOWPLACEMENT.RCNORMALPOSITION); }

	/** Unsafe version of {@link #length(int) length}. */
	public static void nlength(long struct, int value) { memPutInt(struct + WINDOWPLACEMENT.LENGTH, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + WINDOWPLACEMENT.FLAGS, value); }
	/** Unsafe version of {@link #showCmd(int) showCmd}. */
	public static void nshowCmd(long struct, int value) { memPutInt(struct + WINDOWPLACEMENT.SHOWCMD, value); }
	/** Unsafe version of {@link #ptMinPosition(POINT) ptMinPosition}. */
	public static void nptMinPosition(long struct, POINT value) { memCopy(value.address(), struct + WINDOWPLACEMENT.PTMINPOSITION, POINT.SIZEOF); }
	/** Unsafe version of {@link #ptMaxPosition(POINT) ptMaxPosition}. */
	public static void nptMaxPosition(long struct, POINT value) { memCopy(value.address(), struct + WINDOWPLACEMENT.PTMAXPOSITION, POINT.SIZEOF); }
	/** Unsafe version of {@link #rcNormalPosition(RECT) rcNormalPosition}. */
	public static void nrcNormalPosition(long struct, RECT value) { memCopy(value.address(), struct + WINDOWPLACEMENT.RCNORMALPOSITION, RECT.SIZEOF); }

	// -----------------------------------

	/** An array of {@link WINDOWPLACEMENT} structs. */
	public static final class Buffer extends StructBuffer<WINDOWPLACEMENT, Buffer> {

		/**
		 * Creates a new {@link WINDOWPLACEMENT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link WINDOWPLACEMENT#SIZEOF}, and its mark will be undefined.
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
		protected WINDOWPLACEMENT newInstance(long address) {
			return new WINDOWPLACEMENT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code length} field. */
		public int length() { return WINDOWPLACEMENT.nlength(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return WINDOWPLACEMENT.nflags(address()); }
		/** Returns the value of the {@code showCmd} field. */
		public int showCmd() { return WINDOWPLACEMENT.nshowCmd(address()); }
		/** Returns a {@link POINT} view of the {@code ptMinPosition} field. */
		public POINT ptMinPosition() { return WINDOWPLACEMENT.nptMinPosition(address()); }
		/** Returns a {@link POINT} view of the {@code ptMaxPosition} field. */
		public POINT ptMaxPosition() { return WINDOWPLACEMENT.nptMaxPosition(address()); }
		/** Returns a {@link RECT} view of the {@code rcNormalPosition} field. */
		public RECT rcNormalPosition() { return WINDOWPLACEMENT.nrcNormalPosition(address()); }

		/** Sets the specified value to the {@code length} field. */
		public WINDOWPLACEMENT.Buffer length(int value) { WINDOWPLACEMENT.nlength(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public WINDOWPLACEMENT.Buffer flags(int value) { WINDOWPLACEMENT.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code showCmd} field. */
		public WINDOWPLACEMENT.Buffer showCmd(int value) { WINDOWPLACEMENT.nshowCmd(address(), value); return this; }
		/** Copies the specified {@link POINT} to the {@code ptMinPosition} field. */
		public WINDOWPLACEMENT.Buffer ptMinPosition(POINT value) { WINDOWPLACEMENT.nptMinPosition(address(), value); return this; }
		/** Copies the specified {@link POINT} to the {@code ptMaxPosition} field. */
		public WINDOWPLACEMENT.Buffer ptMaxPosition(POINT value) { WINDOWPLACEMENT.nptMaxPosition(address(), value); return this; }
		/** Copies the specified {@link RECT} to the {@code rcNormalPosition} field. */
		public WINDOWPLACEMENT.Buffer rcNormalPosition(RECT value) { WINDOWPLACEMENT.nrcNormalPosition(address(), value); return this; }

	}

}