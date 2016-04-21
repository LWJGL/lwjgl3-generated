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
 * Contains the window class attributes that are registered by the {@link User32#RegisterClassEx} function.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cbSize} &ndash; the size, in bytes, of this structure</li>
 * <li>{@code style} &ndash; the class style(s)</li>
 * <li>{@code lpfnWndProc} &ndash; a pointer to the window procedure</li>
 * <li>{@code cbClsExtra} &ndash; the number of extra bytes to allocate following the window-class structure. The system initializes the bytes to zero.</li>
 * <li>{@code cbWndExtra} &ndash; the number of extra bytes to allocate following the window instance. The system initializes the bytes to zero.</li>
 * <li>{@code hInstance} &ndash; a handle to the instance that contains the window procedure for the class</li>
 * <li>{@code hIcon} &ndash; a handle to the class icon. This member must be a handle to an icon resource. If this member is {@code NULL}, the system provides a default icon.</li>
 * <li>{@code hCursor} &ndash; 
 * a handle to the class cursor. This member must be a handle to a cursor resource. If this member is {@code NULL}, an application must explicitly set the cursor
 * shape whenever the mouse moves into the application's window.</li>
 * <li>{@code hbrBackground} &ndash; 
 * a handle to the class background brush. This member can be a handle to the brush to be used for painting the background, or it can be a color value.
 * When this member is {@code NULL}, an application must paint its own background whenever it is requested to paint in its client area.</li>
 * <li>{@code lpszMenuName} &ndash; 
 * pointer to a null-terminated character string that specifies the resource name of the class menu, as the name appears in the resource file.  If this
 * member is {@code NULL}, windows belonging to this class have no default menu.</li>
 * <li>{@code lpszClassName} &ndash; a pointer to a null-terminated string or is an atom</li>
 * <li>{@code hIconSm} &ndash; 
 * a handle to a small icon that is associated with the window class. If this member is {@code NULL}, the system searches the icon resource specified by the
 * {@code hIcon} member for an icon of the appropriate size to use as the small icon.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct WNDCLASSEX {
    UINT cbSize;
    UINT style;
    WNDPROC lpfnWndProc;
    int cbClsExtra;
    int cbWndExtra;
    HINSTANCE hInstance;
    HICON hIcon;
    HCURSOR hCursor;
    HBRUSH hbrBackground;
    LPCTSTR lpszMenuName;
    LPCTSTR lpszClassName;
    HICON hIconSm;
}</code></pre>
 */
public class WNDCLASSEX extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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
	/** Returns the {@code WindowProc} instance at the {@code lpfnWndProc} field. */
	public WindowProc lpfnWndProc() { return WindowProc.create(nlpfnWndProc(address())); }
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
	/** Sets the address of the specified {@link WindowProcI} to the {@code lpfnWndProc} field. */
	public WNDCLASSEX lpfnWndProc(WindowProcI value) { nlpfnWndProc(address(), addressSafe(value)); return this; }
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
	/** Sets the address of the specified encoded string to the {@code lpszClassName} field. */
	public WNDCLASSEX lpszClassName(ByteBuffer value) { nlpszClassName(address(), value); return this; }
	/** Sets the specified value to the {@code hIconSm} field. */
	public WNDCLASSEX hIconSm(long value) { nhIconSm(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public WNDCLASSEX set(
		int cbSize,
		int style,
		WindowProcI lpfnWndProc,
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

	// -----------------------------------

	/** Returns a new {@link WNDCLASSEX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static WNDCLASSEX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link WNDCLASSEX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link WNDCLASSEX} instance allocated on the thread-local {@link MemoryStack}. */
	public static WNDCLASSEX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link WNDCLASSEX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static WNDCLASSEX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link WNDCLASSEX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static WNDCLASSEX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link WNDCLASSEX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static WNDCLASSEX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link WNDCLASSEX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #cbSize}. */
	public static int ncbSize(long struct) { return memGetInt(struct + WNDCLASSEX.CBSIZE); }
	/** Unsafe version of {@link #style}. */
	public static int nstyle(long struct) { return memGetInt(struct + WNDCLASSEX.STYLE); }
	/** Unsafe version of {@link #lpfnWndProc}. */
	public static long nlpfnWndProc(long struct) { return memGetAddress(struct + WNDCLASSEX.LPFNWNDPROC); }
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
	public static String nlpszMenuNameString(long struct) { return memUTF16(memGetAddress(struct + WNDCLASSEX.LPSZMENUNAME)); }
	/** Unsafe version of {@link #lpszClassName}. */
	public static ByteBuffer nlpszClassName(long struct) { return memByteBufferNT2(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
	/** Unsafe version of {@link #lpszClassNameString}. */
	public static String nlpszClassNameString(long struct) { return memUTF16(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
	/** Unsafe version of {@link #hIconSm}. */
	public static long nhIconSm(long struct) { return memGetAddress(struct + WNDCLASSEX.HICONSM); }

	/** Unsafe version of {@link #cbSize(int) cbSize}. */
	public static void ncbSize(long struct, int value) { memPutInt(struct + WNDCLASSEX.CBSIZE, value); }
	/** Unsafe version of {@link #style(int) style}. */
	public static void nstyle(long struct, int value) { memPutInt(struct + WNDCLASSEX.STYLE, value); }
	/** Unsafe version of {@link #lpfnWndProc(WindowProcI) lpfnWndProc}. */
	public static void nlpfnWndProc(long struct, long value) { memPutAddress(struct + WNDCLASSEX.LPFNWNDPROC, checkPointer(value)); }
	/** Unsafe version of {@link #cbClsExtra(int) cbClsExtra}. */
	public static void ncbClsExtra(long struct, int value) { memPutInt(struct + WNDCLASSEX.CBCLSEXTRA, value); }
	/** Unsafe version of {@link #cbWndExtra(int) cbWndExtra}. */
	public static void ncbWndExtra(long struct, int value) { memPutInt(struct + WNDCLASSEX.CBWNDEXTRA, value); }
	/** Unsafe version of {@link #hInstance(long) hInstance}. */
	public static void nhInstance(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HINSTANCE, checkPointer(value)); }
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
	/** Unsafe version of {@link #lpszClassName(ByteBuffer) lpszClassName}. */
	public static void nlpszClassName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT2(value); 
		memPutAddress(struct + WNDCLASSEX.LPSZCLASSNAME, memAddress(value));
	}
	/** Unsafe version of {@link #hIconSm(long) hIconSm}. */
	public static void nhIconSm(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HICONSM, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + WNDCLASSEX.LPFNWNDPROC));
		checkPointer(memGetAddress(struct + WNDCLASSEX.HINSTANCE));
		checkPointer(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME));
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
			return new WNDCLASSEX(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code cbSize} field. */
		public int cbSize() { return WNDCLASSEX.ncbSize(address()); }
		/** Returns the value of the {@code style} field. */
		public int style() { return WNDCLASSEX.nstyle(address()); }
		/** Returns the {@code WindowProc} instance at the {@code lpfnWndProc} field. */
		public WindowProc lpfnWndProc() { return WindowProc.create(WNDCLASSEX.nlpfnWndProc(address())); }
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
		/** Sets the address of the specified {@link WindowProcI} to the {@code lpfnWndProc} field. */
		public WNDCLASSEX.Buffer lpfnWndProc(WindowProcI value) { WNDCLASSEX.nlpfnWndProc(address(), addressSafe(value)); return this; }
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
		/** Sets the address of the specified encoded string to the {@code lpszClassName} field. */
		public WNDCLASSEX.Buffer lpszClassName(ByteBuffer value) { WNDCLASSEX.nlpszClassName(address(), value); return this; }
		/** Sets the specified value to the {@code hIconSm} field. */
		public WNDCLASSEX.Buffer hIconSm(long value) { WNDCLASSEX.nhIconSm(address(), value); return this; }

	}

}