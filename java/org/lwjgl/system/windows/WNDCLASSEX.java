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

/**
 * Contains the window class attributes that are registered by the {@link User32#RegisterClassEx} function.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct WNDCLASSEX {
 *     UINT cbSize;
 *     UINT style;
 *     WNDPROC lpfnWndProc;
 *     int cbClsExtra;
 *     int cbWndExtra;
 *     HINSTANCE hInstance;
 *     HICON hIcon;
 *     HCURSOR hCursor;
 *     HBRUSH hbrBackground;
 *     LPCTSTR lpszMenuName;
 *     LPCTSTR lpszClassName;
 *     HICON hIconSm;
 * }</code></pre>
 */
public class WNDCLASSEX extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		CBSIZE,
		STYLE,
		LPFNWNDPROC,
		CBCLSEXTRA,
		CBWNDEXTRA,
		HINSTANCE,
		HICON,
		HCURSOR,
		HBRBACKGROUND,
		LPSZMENUNAME,
		LPSZCLASSNAME,
		HICONSM;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		CBSIZE = layout.offsetof(0);
		STYLE = layout.offsetof(1);
		LPFNWNDPROC = layout.offsetof(2);
		CBCLSEXTRA = layout.offsetof(3);
		CBWNDEXTRA = layout.offsetof(4);
		HINSTANCE = layout.offsetof(5);
		HICON = layout.offsetof(6);
		HCURSOR = layout.offsetof(7);
		HBRBACKGROUND = layout.offsetof(8);
		LPSZMENUNAME = layout.offsetof(9);
		LPSZCLASSNAME = layout.offsetof(10);
		HICONSM = layout.offsetof(11);
	}

	WNDCLASSEX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link WNDCLASSEX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public WNDCLASSEX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code cbSize} field. */
	public int cbSize() { return ncbSize(address()); }
	/** Returns the value of the {@code style} field. */
	public int style() { return nstyle(address()); }
	/** Returns the function address at the {@code lpfnWndProc} field. */
	public long lpfnWndProc() { return nlpfnWndProc(address()); }
	/** Returns the {@code WindowProc} instance at the {@code lpfnWndProc} field. */
	public WindowProc lpfnWndProcClosure() { return nlpfnWndProcClosure(address()); }
	/** Returns the value of the {@code cbClsExtra} field. */
	public int cbClsExtra() { return ncbClsExtra(address()); }
	/** Returns the value of the {@code cbWndExtra} field. */
	public int cbWndExtra() { return ncbWndExtra(address()); }
	/** Returns the value of the {@code hInstance} field. */
	public long hInstance() { return nhInstance(address()); }
	/** Returns the value of the {@code hIcon} field. */
	public long hIcon() { return nhIcon(address()); }
	/** Returns the value of the {@code hCursor} field. */
	public long hCursor() { return nhCursor(address()); }
	/** Returns the value of the {@code hbrBackground} field. */
	public long hbrBackground() { return nhbrBackground(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code lpszMenuName} field. */
	public ByteBuffer lpszMenuName() { return nlpszMenuName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code lpszMenuName} field. */
	public String lpszMenuNameString() { return nlpszMenuNameString(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code lpszClassName} field. */
	public ByteBuffer lpszClassName() { return nlpszClassName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code lpszClassName} field. */
	public String lpszClassNameString() { return nlpszClassNameString(address()); }
	/** Returns the value of the {@code hIconSm} field. */
	public long hIconSm() { return nhIconSm(address()); }

	/** Sets the specified value to the {@code cbSize} field. */
	public WNDCLASSEX cbSize(int value) { ncbSize(address(), value); return this; }
	/** Sets the specified value to the {@code style} field. */
	public WNDCLASSEX style(int value) { nstyle(address(), value); return this; }
	/** Sets the specified function address to the {@code lpfnWndProc} field. */
	public WNDCLASSEX lpfnWndProc(long value) { nlpfnWndProc(address(), value); return this; }
	/** Sets the address of the specified {@link WindowProc} to the {@code lpfnWndProc} field. */
	public WNDCLASSEX lpfnWndProc(WindowProc value) { return lpfnWndProc(addressSafe(value)); }
	/** Sets the specified value to the {@code cbClsExtra} field. */
	public WNDCLASSEX cbClsExtra(int value) { ncbClsExtra(address(), value); return this; }
	/** Sets the specified value to the {@code cbWndExtra} field. */
	public WNDCLASSEX cbWndExtra(int value) { ncbWndExtra(address(), value); return this; }
	/** Sets the specified value to the {@code hInstance} field. */
	public WNDCLASSEX hInstance(long value) { nhInstance(address(), value); return this; }
	/** Sets the specified value to the {@code hIcon} field. */
	public WNDCLASSEX hIcon(long value) { nhIcon(address(), value); return this; }
	/** Sets the specified value to the {@code hCursor} field. */
	public WNDCLASSEX hCursor(long value) { nhCursor(address(), value); return this; }
	/** Sets the specified value to the {@code hbrBackground} field. */
	public WNDCLASSEX hbrBackground(long value) { nhbrBackground(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code lpszMenuName} field. */
	public WNDCLASSEX lpszMenuName(ByteBuffer value) { nlpszMenuName(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code lpszMenuName} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #lpszMenuNameFree}.</p>
	 */
	public WNDCLASSEX lpszMenuName(CharSequence value) { nlpszMenuName(address(), value); return this; }
	/** Frees the string encoded by {@link #lpszMenuName(CharSequence)} and stored in the {@code lpszMenuName} field. */
	public WNDCLASSEX lpszMenuNameFree() { nlpszMenuNameFree(address()); return this; }
	/** Sets the address of the specified encoded string to the {@code lpszClassName} field. */
	public WNDCLASSEX lpszClassName(ByteBuffer value) { nlpszClassName(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code lpszClassName} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #lpszClassNameFree}.</p>
	 */
	public WNDCLASSEX lpszClassName(CharSequence value) { nlpszClassName(address(), value); return this; }
	/** Frees the string encoded by {@link #lpszClassName(CharSequence)} and stored in the {@code lpszClassName} field. */
	public WNDCLASSEX lpszClassNameFree() { nlpszClassNameFree(address()); return this; }
	/** Sets the specified value to the {@code hIconSm} field. */
	public WNDCLASSEX hIconSm(long value) { nhIconSm(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public WNDCLASSEX set(
		int cbSize,
		int style,
		WindowProc lpfnWndProc,
		int cbClsExtra,
		int cbWndExtra,
		long hInstance,
		long hIcon,
		long hCursor,
		long hbrBackground,
		ByteBuffer lpszMenuName,
		ByteBuffer lpszClassName,
		long hIconSm
	) {
		cbSize(cbSize);
		style(style);
		lpfnWndProc(lpfnWndProc);
		cbClsExtra(cbClsExtra);
		cbWndExtra(cbWndExtra);
		hInstance(hInstance);
		hIcon(hIcon);
		hCursor(hCursor);
		hbrBackground(hbrBackground);
		lpszMenuName(lpszMenuName);
		lpszClassName(lpszClassName);
		hIconSm(hIconSm);

		return this;
	}

	/** Unsafe version of {@link #set(WNDCLASSEX) set}. */
	public WNDCLASSEX nset(long struct) {
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
	public WNDCLASSEX set(WNDCLASSEX src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(WNDCLASSEX) set}. */
	public WNDCLASSEX set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link WNDCLASSEX} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static WNDCLASSEX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link WNDCLASSEX} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static WNDCLASSEX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link WNDCLASSEX} instance allocated with {@link BufferUtils}. */
	public static WNDCLASSEX create() {
		return new WNDCLASSEX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link WNDCLASSEX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static WNDCLASSEX create(long address) {
		return address == NULL ? null : new WNDCLASSEX(address, null);
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link WNDCLASSEX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #cbSize}. */
	public static int ncbSize(long struct) { return memGetInt(struct + WNDCLASSEX.CBSIZE); }
	/** Unsafe version of {@link #style}. */
	public static int nstyle(long struct) { return memGetInt(struct + WNDCLASSEX.STYLE); }
	/** Unsafe version of {@link #lpfnWndProc}. */
	public static long nlpfnWndProc(long struct) { return memGetAddress(struct + WNDCLASSEX.LPFNWNDPROC); }
	/** Unsafe version of {@link #lpfnWndProcClosure}. */
	public static WindowProc nlpfnWndProcClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(nlpfnWndProc(struct)); }
	/** Unsafe version of {@link #cbClsExtra}. */
	public static int ncbClsExtra(long struct) { return memGetInt(struct + WNDCLASSEX.CBCLSEXTRA); }
	/** Unsafe version of {@link #cbWndExtra}. */
	public static int ncbWndExtra(long struct) { return memGetInt(struct + WNDCLASSEX.CBWNDEXTRA); }
	/** Unsafe version of {@link #hInstance}. */
	public static long nhInstance(long struct) { return memGetAddress(struct + WNDCLASSEX.HINSTANCE); }
	/** Unsafe version of {@link #hIcon}. */
	public static long nhIcon(long struct) { return memGetAddress(struct + WNDCLASSEX.HICON); }
	/** Unsafe version of {@link #hCursor}. */
	public static long nhCursor(long struct) { return memGetAddress(struct + WNDCLASSEX.HCURSOR); }
	/** Unsafe version of {@link #hbrBackground}. */
	public static long nhbrBackground(long struct) { return memGetAddress(struct + WNDCLASSEX.HBRBACKGROUND); }
	/** Unsafe version of {@link #lpszMenuName}. */
	public static ByteBuffer nlpszMenuName(long struct) { return memByteBufferNT2(memGetAddress(struct + WNDCLASSEX.LPSZMENUNAME)); }
	/** Unsafe version of {@link #lpszMenuNameString}. */
	public static String nlpszMenuNameString(long struct) { return memDecodeUTF16(memGetAddress(struct + WNDCLASSEX.LPSZMENUNAME)); }
	/** Unsafe version of {@link #lpszClassName}. */
	public static ByteBuffer nlpszClassName(long struct) { return memByteBufferNT2(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
	/** Unsafe version of {@link #lpszClassNameString}. */
	public static String nlpszClassNameString(long struct) { return memDecodeUTF16(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
	/** Unsafe version of {@link #hIconSm}. */
	public static long nhIconSm(long struct) { return memGetAddress(struct + WNDCLASSEX.HICONSM); }

	/** Unsafe version of {@link #cbSize(int) cbSize}. */
	public static void ncbSize(long struct, int value) { memPutInt(struct + WNDCLASSEX.CBSIZE, value); }
	/** Unsafe version of {@link #style(int) style}. */
	public static void nstyle(long struct, int value) { memPutInt(struct + WNDCLASSEX.STYLE, value); }
	/** Unsafe version of {@link #lpfnWndProc(long) lpfnWndProc}. */
	public static void nlpfnWndProc(long struct, long value) { memPutAddress(struct + WNDCLASSEX.LPFNWNDPROC, value); }
	/** Unsafe version of {@link #cbClsExtra(int) cbClsExtra}. */
	public static void ncbClsExtra(long struct, int value) { memPutInt(struct + WNDCLASSEX.CBCLSEXTRA, value); }
	/** Unsafe version of {@link #cbWndExtra(int) cbWndExtra}. */
	public static void ncbWndExtra(long struct, int value) { memPutInt(struct + WNDCLASSEX.CBWNDEXTRA, value); }
	/** Unsafe version of {@link #hInstance(long) hInstance}. */
	public static void nhInstance(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HINSTANCE, value); }
	/** Unsafe version of {@link #hIcon(long) hIcon}. */
	public static void nhIcon(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HICON, value); }
	/** Unsafe version of {@link #hCursor(long) hCursor}. */
	public static void nhCursor(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HCURSOR, value); }
	/** Unsafe version of {@link #hbrBackground(long) hbrBackground}. */
	public static void nhbrBackground(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HBRBACKGROUND, value); }
	/** Unsafe version of {@link #lpszMenuName(ByteBuffer) lpszMenuName}. */
	public static void nlpszMenuName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT2(value); 
		memPutAddress(struct + WNDCLASSEX.LPSZMENUNAME, memAddressSafe(value));
	}
	/** Unsafe version of {@link #lpszMenuName(CharSequence) lpszMenuName}. */
	public static void nlpszMenuName(long struct, CharSequence value) { nlpszMenuName(struct, memEncodeUTF16(value, BufferAllocator.MALLOC)); }
	/** Unsafe version of {@link #lpszMenuNameFree}. */
	public static void nlpszMenuNameFree(long struct) { nmemFree(memGetAddress(struct + WNDCLASSEX.LPSZMENUNAME)); }
	/** Unsafe version of {@link #lpszClassName(ByteBuffer) lpszClassName}. */
	public static void nlpszClassName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT2(value); 
		memPutAddress(struct + WNDCLASSEX.LPSZCLASSNAME, memAddressSafe(value));
	}
	/** Unsafe version of {@link #lpszClassName(CharSequence) lpszClassName}. */
	public static void nlpszClassName(long struct, CharSequence value) { nlpszClassName(struct, memEncodeUTF16(value, BufferAllocator.MALLOC)); }
	/** Unsafe version of {@link #lpszClassNameFree}. */
	public static void nlpszClassNameFree(long struct) { nmemFree(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
	/** Unsafe version of {@link #hIconSm(long) hIconSm}. */
	public static void nhIconSm(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HICONSM, value); }

	// -----------------------------------

	/** An array of {@link WNDCLASSEX} structs. */
	public static final class Buffer extends StructBuffer<WNDCLASSEX, Buffer> {

		/**
		 * Creates a new {@link WNDCLASSEX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link WNDCLASSEX#SIZEOF}, and its mark will be undefined.
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
		protected WNDCLASSEX newInstance(long address) {
			return new WNDCLASSEX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code cbSize} field. */
		public int cbSize() { return WNDCLASSEX.ncbSize(address()); }
		/** Returns the value of the {@code style} field. */
		public int style() { return WNDCLASSEX.nstyle(address()); }
		/** Returns the function address at the {@code lpfnWndProc} field. */
		public long lpfnWndProc() { return WNDCLASSEX.nlpfnWndProc(address()); }
		/** Returns the {@code WindowProc} instance at the {@code lpfnWndProc} field. */
		public WindowProc lpfnWndProcClosure() { return WNDCLASSEX.nlpfnWndProcClosure(address()); }
		/** Returns the value of the {@code cbClsExtra} field. */
		public int cbClsExtra() { return WNDCLASSEX.ncbClsExtra(address()); }
		/** Returns the value of the {@code cbWndExtra} field. */
		public int cbWndExtra() { return WNDCLASSEX.ncbWndExtra(address()); }
		/** Returns the value of the {@code hInstance} field. */
		public long hInstance() { return WNDCLASSEX.nhInstance(address()); }
		/** Returns the value of the {@code hIcon} field. */
		public long hIcon() { return WNDCLASSEX.nhIcon(address()); }
		/** Returns the value of the {@code hCursor} field. */
		public long hCursor() { return WNDCLASSEX.nhCursor(address()); }
		/** Returns the value of the {@code hbrBackground} field. */
		public long hbrBackground() { return WNDCLASSEX.nhbrBackground(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code lpszMenuName} field. */
		public ByteBuffer lpszMenuName() { return WNDCLASSEX.nlpszMenuName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code lpszMenuName} field. */
		public String lpszMenuNameString() { return WNDCLASSEX.nlpszMenuNameString(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code lpszClassName} field. */
		public ByteBuffer lpszClassName() { return WNDCLASSEX.nlpszClassName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code lpszClassName} field. */
		public String lpszClassNameString() { return WNDCLASSEX.nlpszClassNameString(address()); }
		/** Returns the value of the {@code hIconSm} field. */
		public long hIconSm() { return WNDCLASSEX.nhIconSm(address()); }

		/** Sets the specified value to the {@code cbSize} field. */
		public WNDCLASSEX.Buffer cbSize(int value) { WNDCLASSEX.ncbSize(address(), value); return this; }
		/** Sets the specified value to the {@code style} field. */
		public WNDCLASSEX.Buffer style(int value) { WNDCLASSEX.nstyle(address(), value); return this; }
		/** Sets the specified function address to the {@code lpfnWndProc} field. */
		public WNDCLASSEX.Buffer lpfnWndProc(long value) { WNDCLASSEX.nlpfnWndProc(address(), value); return this; }
		/** Sets the address of the specified {@link WindowProc} to the {@code lpfnWndProc} field. */
		public WNDCLASSEX.Buffer lpfnWndProc(WindowProc value) { return lpfnWndProc(addressSafe(value)); }
		/** Sets the specified value to the {@code cbClsExtra} field. */
		public WNDCLASSEX.Buffer cbClsExtra(int value) { WNDCLASSEX.ncbClsExtra(address(), value); return this; }
		/** Sets the specified value to the {@code cbWndExtra} field. */
		public WNDCLASSEX.Buffer cbWndExtra(int value) { WNDCLASSEX.ncbWndExtra(address(), value); return this; }
		/** Sets the specified value to the {@code hInstance} field. */
		public WNDCLASSEX.Buffer hInstance(long value) { WNDCLASSEX.nhInstance(address(), value); return this; }
		/** Sets the specified value to the {@code hIcon} field. */
		public WNDCLASSEX.Buffer hIcon(long value) { WNDCLASSEX.nhIcon(address(), value); return this; }
		/** Sets the specified value to the {@code hCursor} field. */
		public WNDCLASSEX.Buffer hCursor(long value) { WNDCLASSEX.nhCursor(address(), value); return this; }
		/** Sets the specified value to the {@code hbrBackground} field. */
		public WNDCLASSEX.Buffer hbrBackground(long value) { WNDCLASSEX.nhbrBackground(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code lpszMenuName} field. */
		public WNDCLASSEX.Buffer lpszMenuName(ByteBuffer value) { WNDCLASSEX.nlpszMenuName(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code lpszMenuName} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #lpszMenuNameFree}.</p>
		 */
		public WNDCLASSEX.Buffer lpszMenuName(CharSequence value) { WNDCLASSEX.nlpszMenuName(address(), value); return this; }
		/** Frees the string encoded by {@link #lpszMenuName(CharSequence)} and stored in the {@code lpszMenuName} field. */
		public WNDCLASSEX.Buffer lpszMenuNameFree() { WNDCLASSEX.nlpszMenuNameFree(address()); return this; }
		/** Sets the address of the specified encoded string to the {@code lpszClassName} field. */
		public WNDCLASSEX.Buffer lpszClassName(ByteBuffer value) { WNDCLASSEX.nlpszClassName(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code lpszClassName} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #lpszClassNameFree}.</p>
		 */
		public WNDCLASSEX.Buffer lpszClassName(CharSequence value) { WNDCLASSEX.nlpszClassName(address(), value); return this; }
		/** Frees the string encoded by {@link #lpszClassName(CharSequence)} and stored in the {@code lpszClassName} field. */
		public WNDCLASSEX.Buffer lpszClassNameFree() { WNDCLASSEX.nlpszClassNameFree(address()); return this; }
		/** Sets the specified value to the {@code hIconSm} field. */
		public WNDCLASSEX.Buffer hIconSm(long value) { WNDCLASSEX.nhIconSm(address(), value); return this; }

	}

}