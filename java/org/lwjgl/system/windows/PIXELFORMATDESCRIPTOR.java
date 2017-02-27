/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the pixel format of a drawing surface.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code nSize} &ndash; specifies the size of this data structure. This value should be set to {@link #SIZEOF}.</li>
 * <li>{@code nVersion} &ndash; specifies the version of this data structure. This value should be set to 1</li>
 * <li>{@code dwFlags} &ndash; a set of bit flags that specify properties of the pixel buffer</li>
 * <li>{@code iPixelType} &ndash; specifies the type of pixel data</li>
 * <li>{@code cColorBits} &ndash; 
 * specifies the number of color bitplanes in each color buffer. For RGBA pixel types, it is the size of the color buffer, excluding the alpha bitplanes.
 * For color-index pixels, it is the size of the color-index buffer.</li>
 * <li>{@code cRedBits} &ndash; specifies the number of red bitplanes in each RGBA color buffer</li>
 * <li>{@code cRedShift} &ndash; specifies the shift count for red bitplanes in each RGBA color buffer</li>
 * <li>{@code cGreenBits} &ndash; specifies the number of green bitplanes in each RGBA color buffer</li>
 * <li>{@code cGreenShift} &ndash; specifies the shift count for green bitplanes in each RGBA color buffer</li>
 * <li>{@code cBlueBits} &ndash; specifies the number of blue bitplanes in each RGBA color buffer</li>
 * <li>{@code cBlueShift} &ndash; specifies the shift count for blue bitplanes in each RGBA color buffer</li>
 * <li>{@code cAlphaBits} &ndash; specifies the number of alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported</li>
 * <li>{@code cAlphaShift} &ndash; specifies the shift count for alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported</li>
 * <li>{@code cAccumBits} &ndash; specifies the total number of bitplanes in the accumulation buffer</li>
 * <li>{@code cAccumRedBits} &ndash; specifies the number of red bitplanes in the accumulation buffer</li>
 * <li>{@code cAccumGreenBits} &ndash; specifies the number of green bitplanes in the accumulation buffer</li>
 * <li>{@code cAccumBlueBits} &ndash; specifies the number of blue bitplanes in the accumulation buffer</li>
 * <li>{@code cAccumAlphaBits} &ndash; specifies the number of alpha bitplanes in the accumulation buffer</li>
 * <li>{@code cDepthBits} &ndash; specifies the depth of the depth (z-axis) buffer</li>
 * <li>{@code cStencilBits} &ndash; specifies the depth of the stencil buffer</li>
 * <li>{@code cAuxBuffers} &ndash; specifies the number of auxiliary buffers. Auxiliary buffers are not supported</li>
 * <li>{@code iLayerType} &ndash; Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.</li>
 * <li>{@code bReserved} &ndash; 
 * specifies the number of overlay and underlay planes. Bits 0 through 3 specify up to 15 overlay planes and bits 4 through 7 specify up to 15 underlay
 * planes</li>
 * <li>{@code dwLayerMask} &ndash; Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.</li>
 * <li>{@code dwVisibleMask} &ndash; 
 * specifies the transparent color or index of an underlay plane. When the pixel type is RGBA, {@code dwVisibleMask} is a transparent RGB color value.
 * When the pixel type is color index, it is a transparent index value.</li>
 * <li>{@code dwDamageMask} &ndash; Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct PIXELFORMATDESCRIPTOR {
    WORD nSize;
    WORD nVersion;
    DWORD dwFlags;
    BYTE iPixelType;
    BYTE cColorBits;
    BYTE cRedBits;
    BYTE cRedShift;
    BYTE cGreenBits;
    BYTE cGreenShift;
    BYTE cBlueBits;
    BYTE cBlueShift;
    BYTE cAlphaBits;
    BYTE cAlphaShift;
    BYTE cAccumBits;
    BYTE cAccumRedBits;
    BYTE cAccumGreenBits;
    BYTE cAccumBlueBits;
    BYTE cAccumAlphaBits;
    BYTE cDepthBits;
    BYTE cStencilBits;
    BYTE cAuxBuffers;
    BYTE iLayerType;
    BYTE bReserved;
    DWORD dwLayerMask;
    DWORD dwVisibleMask;
    DWORD dwDamageMask;
}</code></pre>
 */
public class PIXELFORMATDESCRIPTOR extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NSIZE,
		NVERSION,
		DWFLAGS,
		IPIXELTYPE,
		CCOLORBITS,
		CREDBITS,
		CREDSHIFT,
		CGREENBITS,
		CGREENSHIFT,
		CBLUEBITS,
		CBLUESHIFT,
		CALPHABITS,
		CALPHASHIFT,
		CACCUMBITS,
		CACCUMREDBITS,
		CACCUMGREENBITS,
		CACCUMBLUEBITS,
		CACCUMALPHABITS,
		CDEPTHBITS,
		CSTENCILBITS,
		CAUXBUFFERS,
		ILAYERTYPE,
		BRESERVED,
		DWLAYERMASK,
		DWVISIBLEMASK,
		DWDAMAGEMASK;

	static {
		Layout layout = __struct(
			__member(2),
			__member(2),
			__member(4),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(1),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NSIZE = layout.offsetof(0);
		NVERSION = layout.offsetof(1);
		DWFLAGS = layout.offsetof(2);
		IPIXELTYPE = layout.offsetof(3);
		CCOLORBITS = layout.offsetof(4);
		CREDBITS = layout.offsetof(5);
		CREDSHIFT = layout.offsetof(6);
		CGREENBITS = layout.offsetof(7);
		CGREENSHIFT = layout.offsetof(8);
		CBLUEBITS = layout.offsetof(9);
		CBLUESHIFT = layout.offsetof(10);
		CALPHABITS = layout.offsetof(11);
		CALPHASHIFT = layout.offsetof(12);
		CACCUMBITS = layout.offsetof(13);
		CACCUMREDBITS = layout.offsetof(14);
		CACCUMGREENBITS = layout.offsetof(15);
		CACCUMBLUEBITS = layout.offsetof(16);
		CACCUMALPHABITS = layout.offsetof(17);
		CDEPTHBITS = layout.offsetof(18);
		CSTENCILBITS = layout.offsetof(19);
		CAUXBUFFERS = layout.offsetof(20);
		ILAYERTYPE = layout.offsetof(21);
		BRESERVED = layout.offsetof(22);
		DWLAYERMASK = layout.offsetof(23);
		DWVISIBLEMASK = layout.offsetof(24);
		DWDAMAGEMASK = layout.offsetof(25);
	}

	PIXELFORMATDESCRIPTOR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link PIXELFORMATDESCRIPTOR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public PIXELFORMATDESCRIPTOR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code nSize} field. */
	public short nSize() { return nnSize(address()); }
	/** Returns the value of the {@code nVersion} field. */
	public short nVersion() { return nnVersion(address()); }
	/** Returns the value of the {@code dwFlags} field. */
	public int dwFlags() { return ndwFlags(address()); }
	/** Returns the value of the {@code iPixelType} field. */
	public byte iPixelType() { return niPixelType(address()); }
	/** Returns the value of the {@code cColorBits} field. */
	public byte cColorBits() { return ncColorBits(address()); }
	/** Returns the value of the {@code cRedBits} field. */
	public byte cRedBits() { return ncRedBits(address()); }
	/** Returns the value of the {@code cRedShift} field. */
	public byte cRedShift() { return ncRedShift(address()); }
	/** Returns the value of the {@code cGreenBits} field. */
	public byte cGreenBits() { return ncGreenBits(address()); }
	/** Returns the value of the {@code cGreenShift} field. */
	public byte cGreenShift() { return ncGreenShift(address()); }
	/** Returns the value of the {@code cBlueBits} field. */
	public byte cBlueBits() { return ncBlueBits(address()); }
	/** Returns the value of the {@code cBlueShift} field. */
	public byte cBlueShift() { return ncBlueShift(address()); }
	/** Returns the value of the {@code cAlphaBits} field. */
	public byte cAlphaBits() { return ncAlphaBits(address()); }
	/** Returns the value of the {@code cAlphaShift} field. */
	public byte cAlphaShift() { return ncAlphaShift(address()); }
	/** Returns the value of the {@code cAccumBits} field. */
	public byte cAccumBits() { return ncAccumBits(address()); }
	/** Returns the value of the {@code cAccumRedBits} field. */
	public byte cAccumRedBits() { return ncAccumRedBits(address()); }
	/** Returns the value of the {@code cAccumGreenBits} field. */
	public byte cAccumGreenBits() { return ncAccumGreenBits(address()); }
	/** Returns the value of the {@code cAccumBlueBits} field. */
	public byte cAccumBlueBits() { return ncAccumBlueBits(address()); }
	/** Returns the value of the {@code cAccumAlphaBits} field. */
	public byte cAccumAlphaBits() { return ncAccumAlphaBits(address()); }
	/** Returns the value of the {@code cDepthBits} field. */
	public byte cDepthBits() { return ncDepthBits(address()); }
	/** Returns the value of the {@code cStencilBits} field. */
	public byte cStencilBits() { return ncStencilBits(address()); }
	/** Returns the value of the {@code cAuxBuffers} field. */
	public byte cAuxBuffers() { return ncAuxBuffers(address()); }
	/** Returns the value of the {@code iLayerType} field. */
	public byte iLayerType() { return niLayerType(address()); }
	/** Returns the value of the {@code bReserved} field. */
	public byte bReserved() { return nbReserved(address()); }
	/** Returns the value of the {@code dwLayerMask} field. */
	public int dwLayerMask() { return ndwLayerMask(address()); }
	/** Returns the value of the {@code dwVisibleMask} field. */
	public int dwVisibleMask() { return ndwVisibleMask(address()); }
	/** Returns the value of the {@code dwDamageMask} field. */
	public int dwDamageMask() { return ndwDamageMask(address()); }

	/** Sets the specified value to the {@code nSize} field. */
	public PIXELFORMATDESCRIPTOR nSize(short value) { nnSize(address(), value); return this; }
	/** Sets the specified value to the {@code nVersion} field. */
	public PIXELFORMATDESCRIPTOR nVersion(short value) { nnVersion(address(), value); return this; }
	/** Sets the specified value to the {@code dwFlags} field. */
	public PIXELFORMATDESCRIPTOR dwFlags(int value) { ndwFlags(address(), value); return this; }
	/** Sets the specified value to the {@code iPixelType} field. */
	public PIXELFORMATDESCRIPTOR iPixelType(byte value) { niPixelType(address(), value); return this; }
	/** Sets the specified value to the {@code cColorBits} field. */
	public PIXELFORMATDESCRIPTOR cColorBits(byte value) { ncColorBits(address(), value); return this; }
	/** Sets the specified value to the {@code cRedBits} field. */
	public PIXELFORMATDESCRIPTOR cRedBits(byte value) { ncRedBits(address(), value); return this; }
	/** Sets the specified value to the {@code cRedShift} field. */
	public PIXELFORMATDESCRIPTOR cRedShift(byte value) { ncRedShift(address(), value); return this; }
	/** Sets the specified value to the {@code cGreenBits} field. */
	public PIXELFORMATDESCRIPTOR cGreenBits(byte value) { ncGreenBits(address(), value); return this; }
	/** Sets the specified value to the {@code cGreenShift} field. */
	public PIXELFORMATDESCRIPTOR cGreenShift(byte value) { ncGreenShift(address(), value); return this; }
	/** Sets the specified value to the {@code cBlueBits} field. */
	public PIXELFORMATDESCRIPTOR cBlueBits(byte value) { ncBlueBits(address(), value); return this; }
	/** Sets the specified value to the {@code cBlueShift} field. */
	public PIXELFORMATDESCRIPTOR cBlueShift(byte value) { ncBlueShift(address(), value); return this; }
	/** Sets the specified value to the {@code cAlphaBits} field. */
	public PIXELFORMATDESCRIPTOR cAlphaBits(byte value) { ncAlphaBits(address(), value); return this; }
	/** Sets the specified value to the {@code cAlphaShift} field. */
	public PIXELFORMATDESCRIPTOR cAlphaShift(byte value) { ncAlphaShift(address(), value); return this; }
	/** Sets the specified value to the {@code cAccumBits} field. */
	public PIXELFORMATDESCRIPTOR cAccumBits(byte value) { ncAccumBits(address(), value); return this; }
	/** Sets the specified value to the {@code cAccumRedBits} field. */
	public PIXELFORMATDESCRIPTOR cAccumRedBits(byte value) { ncAccumRedBits(address(), value); return this; }
	/** Sets the specified value to the {@code cAccumGreenBits} field. */
	public PIXELFORMATDESCRIPTOR cAccumGreenBits(byte value) { ncAccumGreenBits(address(), value); return this; }
	/** Sets the specified value to the {@code cAccumBlueBits} field. */
	public PIXELFORMATDESCRIPTOR cAccumBlueBits(byte value) { ncAccumBlueBits(address(), value); return this; }
	/** Sets the specified value to the {@code cAccumAlphaBits} field. */
	public PIXELFORMATDESCRIPTOR cAccumAlphaBits(byte value) { ncAccumAlphaBits(address(), value); return this; }
	/** Sets the specified value to the {@code cDepthBits} field. */
	public PIXELFORMATDESCRIPTOR cDepthBits(byte value) { ncDepthBits(address(), value); return this; }
	/** Sets the specified value to the {@code cStencilBits} field. */
	public PIXELFORMATDESCRIPTOR cStencilBits(byte value) { ncStencilBits(address(), value); return this; }
	/** Sets the specified value to the {@code cAuxBuffers} field. */
	public PIXELFORMATDESCRIPTOR cAuxBuffers(byte value) { ncAuxBuffers(address(), value); return this; }
	/** Sets the specified value to the {@code iLayerType} field. */
	public PIXELFORMATDESCRIPTOR iLayerType(byte value) { niLayerType(address(), value); return this; }
	/** Sets the specified value to the {@code bReserved} field. */
	public PIXELFORMATDESCRIPTOR bReserved(byte value) { nbReserved(address(), value); return this; }
	/** Sets the specified value to the {@code dwLayerMask} field. */
	public PIXELFORMATDESCRIPTOR dwLayerMask(int value) { ndwLayerMask(address(), value); return this; }
	/** Sets the specified value to the {@code dwVisibleMask} field. */
	public PIXELFORMATDESCRIPTOR dwVisibleMask(int value) { ndwVisibleMask(address(), value); return this; }
	/** Sets the specified value to the {@code dwDamageMask} field. */
	public PIXELFORMATDESCRIPTOR dwDamageMask(int value) { ndwDamageMask(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public PIXELFORMATDESCRIPTOR set(
		short nSize,
		short nVersion,
		int dwFlags,
		byte iPixelType,
		byte cColorBits,
		byte cRedBits,
		byte cRedShift,
		byte cGreenBits,
		byte cGreenShift,
		byte cBlueBits,
		byte cBlueShift,
		byte cAlphaBits,
		byte cAlphaShift,
		byte cAccumBits,
		byte cAccumRedBits,
		byte cAccumGreenBits,
		byte cAccumBlueBits,
		byte cAccumAlphaBits,
		byte cDepthBits,
		byte cStencilBits,
		byte cAuxBuffers,
		byte iLayerType,
		byte bReserved,
		int dwLayerMask,
		int dwVisibleMask,
		int dwDamageMask
	) {
		nSize(nSize);
		nVersion(nVersion);
		dwFlags(dwFlags);
		iPixelType(iPixelType);
		cColorBits(cColorBits);
		cRedBits(cRedBits);
		cRedShift(cRedShift);
		cGreenBits(cGreenBits);
		cGreenShift(cGreenShift);
		cBlueBits(cBlueBits);
		cBlueShift(cBlueShift);
		cAlphaBits(cAlphaBits);
		cAlphaShift(cAlphaShift);
		cAccumBits(cAccumBits);
		cAccumRedBits(cAccumRedBits);
		cAccumGreenBits(cAccumGreenBits);
		cAccumBlueBits(cAccumBlueBits);
		cAccumAlphaBits(cAccumAlphaBits);
		cDepthBits(cDepthBits);
		cStencilBits(cStencilBits);
		cAuxBuffers(cAuxBuffers);
		iLayerType(iLayerType);
		bReserved(bReserved);
		dwLayerMask(dwLayerMask);
		dwVisibleMask(dwVisibleMask);
		dwDamageMask(dwDamageMask);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public PIXELFORMATDESCRIPTOR set(PIXELFORMATDESCRIPTOR src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static PIXELFORMATDESCRIPTOR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static PIXELFORMATDESCRIPTOR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated with {@link BufferUtils}. */
	public static PIXELFORMATDESCRIPTOR create() {
		return new PIXELFORMATDESCRIPTOR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static PIXELFORMATDESCRIPTOR create(long address) {
		return address == NULL ? null : new PIXELFORMATDESCRIPTOR(address, null);
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link PIXELFORMATDESCRIPTOR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated on the thread-local {@link MemoryStack}. */
	public static PIXELFORMATDESCRIPTOR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static PIXELFORMATDESCRIPTOR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static PIXELFORMATDESCRIPTOR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static PIXELFORMATDESCRIPTOR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #nSize}. */
	public static short nnSize(long struct) { return memGetShort(struct + PIXELFORMATDESCRIPTOR.NSIZE); }
	/** Unsafe version of {@link #nVersion}. */
	public static short nnVersion(long struct) { return memGetShort(struct + PIXELFORMATDESCRIPTOR.NVERSION); }
	/** Unsafe version of {@link #dwFlags}. */
	public static int ndwFlags(long struct) { return memGetInt(struct + PIXELFORMATDESCRIPTOR.DWFLAGS); }
	/** Unsafe version of {@link #iPixelType}. */
	public static byte niPixelType(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.IPIXELTYPE); }
	/** Unsafe version of {@link #cColorBits}. */
	public static byte ncColorBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CCOLORBITS); }
	/** Unsafe version of {@link #cRedBits}. */
	public static byte ncRedBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CREDBITS); }
	/** Unsafe version of {@link #cRedShift}. */
	public static byte ncRedShift(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CREDSHIFT); }
	/** Unsafe version of {@link #cGreenBits}. */
	public static byte ncGreenBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CGREENBITS); }
	/** Unsafe version of {@link #cGreenShift}. */
	public static byte ncGreenShift(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CGREENSHIFT); }
	/** Unsafe version of {@link #cBlueBits}. */
	public static byte ncBlueBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CBLUEBITS); }
	/** Unsafe version of {@link #cBlueShift}. */
	public static byte ncBlueShift(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CBLUESHIFT); }
	/** Unsafe version of {@link #cAlphaBits}. */
	public static byte ncAlphaBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CALPHABITS); }
	/** Unsafe version of {@link #cAlphaShift}. */
	public static byte ncAlphaShift(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CALPHASHIFT); }
	/** Unsafe version of {@link #cAccumBits}. */
	public static byte ncAccumBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CACCUMBITS); }
	/** Unsafe version of {@link #cAccumRedBits}. */
	public static byte ncAccumRedBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CACCUMREDBITS); }
	/** Unsafe version of {@link #cAccumGreenBits}. */
	public static byte ncAccumGreenBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CACCUMGREENBITS); }
	/** Unsafe version of {@link #cAccumBlueBits}. */
	public static byte ncAccumBlueBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS); }
	/** Unsafe version of {@link #cAccumAlphaBits}. */
	public static byte ncAccumAlphaBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CACCUMALPHABITS); }
	/** Unsafe version of {@link #cDepthBits}. */
	public static byte ncDepthBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CDEPTHBITS); }
	/** Unsafe version of {@link #cStencilBits}. */
	public static byte ncStencilBits(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CSTENCILBITS); }
	/** Unsafe version of {@link #cAuxBuffers}. */
	public static byte ncAuxBuffers(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.CAUXBUFFERS); }
	/** Unsafe version of {@link #iLayerType}. */
	public static byte niLayerType(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.ILAYERTYPE); }
	/** Unsafe version of {@link #bReserved}. */
	public static byte nbReserved(long struct) { return memGetByte(struct + PIXELFORMATDESCRIPTOR.BRESERVED); }
	/** Unsafe version of {@link #dwLayerMask}. */
	public static int ndwLayerMask(long struct) { return memGetInt(struct + PIXELFORMATDESCRIPTOR.DWLAYERMASK); }
	/** Unsafe version of {@link #dwVisibleMask}. */
	public static int ndwVisibleMask(long struct) { return memGetInt(struct + PIXELFORMATDESCRIPTOR.DWVISIBLEMASK); }
	/** Unsafe version of {@link #dwDamageMask}. */
	public static int ndwDamageMask(long struct) { return memGetInt(struct + PIXELFORMATDESCRIPTOR.DWDAMAGEMASK); }

	/** Unsafe version of {@link #nSize(short) nSize}. */
	public static void nnSize(long struct, short value) { memPutShort(struct + PIXELFORMATDESCRIPTOR.NSIZE, value); }
	/** Unsafe version of {@link #nVersion(short) nVersion}. */
	public static void nnVersion(long struct, short value) { memPutShort(struct + PIXELFORMATDESCRIPTOR.NVERSION, value); }
	/** Unsafe version of {@link #dwFlags(int) dwFlags}. */
	public static void ndwFlags(long struct, int value) { memPutInt(struct + PIXELFORMATDESCRIPTOR.DWFLAGS, value); }
	/** Unsafe version of {@link #iPixelType(byte) iPixelType}. */
	public static void niPixelType(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.IPIXELTYPE, value); }
	/** Unsafe version of {@link #cColorBits(byte) cColorBits}. */
	public static void ncColorBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CCOLORBITS, value); }
	/** Unsafe version of {@link #cRedBits(byte) cRedBits}. */
	public static void ncRedBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CREDBITS, value); }
	/** Unsafe version of {@link #cRedShift(byte) cRedShift}. */
	public static void ncRedShift(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CREDSHIFT, value); }
	/** Unsafe version of {@link #cGreenBits(byte) cGreenBits}. */
	public static void ncGreenBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CGREENBITS, value); }
	/** Unsafe version of {@link #cGreenShift(byte) cGreenShift}. */
	public static void ncGreenShift(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CGREENSHIFT, value); }
	/** Unsafe version of {@link #cBlueBits(byte) cBlueBits}. */
	public static void ncBlueBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CBLUEBITS, value); }
	/** Unsafe version of {@link #cBlueShift(byte) cBlueShift}. */
	public static void ncBlueShift(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CBLUESHIFT, value); }
	/** Unsafe version of {@link #cAlphaBits(byte) cAlphaBits}. */
	public static void ncAlphaBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CALPHABITS, value); }
	/** Unsafe version of {@link #cAlphaShift(byte) cAlphaShift}. */
	public static void ncAlphaShift(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CALPHASHIFT, value); }
	/** Unsafe version of {@link #cAccumBits(byte) cAccumBits}. */
	public static void ncAccumBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CACCUMBITS, value); }
	/** Unsafe version of {@link #cAccumRedBits(byte) cAccumRedBits}. */
	public static void ncAccumRedBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CACCUMREDBITS, value); }
	/** Unsafe version of {@link #cAccumGreenBits(byte) cAccumGreenBits}. */
	public static void ncAccumGreenBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CACCUMGREENBITS, value); }
	/** Unsafe version of {@link #cAccumBlueBits(byte) cAccumBlueBits}. */
	public static void ncAccumBlueBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS, value); }
	/** Unsafe version of {@link #cAccumAlphaBits(byte) cAccumAlphaBits}. */
	public static void ncAccumAlphaBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CACCUMALPHABITS, value); }
	/** Unsafe version of {@link #cDepthBits(byte) cDepthBits}. */
	public static void ncDepthBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CDEPTHBITS, value); }
	/** Unsafe version of {@link #cStencilBits(byte) cStencilBits}. */
	public static void ncStencilBits(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CSTENCILBITS, value); }
	/** Unsafe version of {@link #cAuxBuffers(byte) cAuxBuffers}. */
	public static void ncAuxBuffers(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.CAUXBUFFERS, value); }
	/** Unsafe version of {@link #iLayerType(byte) iLayerType}. */
	public static void niLayerType(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.ILAYERTYPE, value); }
	/** Unsafe version of {@link #bReserved(byte) bReserved}. */
	public static void nbReserved(long struct, byte value) { memPutByte(struct + PIXELFORMATDESCRIPTOR.BRESERVED, value); }
	/** Unsafe version of {@link #dwLayerMask(int) dwLayerMask}. */
	public static void ndwLayerMask(long struct, int value) { memPutInt(struct + PIXELFORMATDESCRIPTOR.DWLAYERMASK, value); }
	/** Unsafe version of {@link #dwVisibleMask(int) dwVisibleMask}. */
	public static void ndwVisibleMask(long struct, int value) { memPutInt(struct + PIXELFORMATDESCRIPTOR.DWVISIBLEMASK, value); }
	/** Unsafe version of {@link #dwDamageMask(int) dwDamageMask}. */
	public static void ndwDamageMask(long struct, int value) { memPutInt(struct + PIXELFORMATDESCRIPTOR.DWDAMAGEMASK, value); }

	// -----------------------------------

	/** An array of {@link PIXELFORMATDESCRIPTOR} structs. */
	public static class Buffer extends StructBuffer<PIXELFORMATDESCRIPTOR, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link PIXELFORMATDESCRIPTOR#SIZEOF}, and its mark will be undefined.
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
		protected PIXELFORMATDESCRIPTOR newInstance(long address) {
			return new PIXELFORMATDESCRIPTOR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code nSize} field. */
		public short nSize() { return PIXELFORMATDESCRIPTOR.nnSize(address()); }
		/** Returns the value of the {@code nVersion} field. */
		public short nVersion() { return PIXELFORMATDESCRIPTOR.nnVersion(address()); }
		/** Returns the value of the {@code dwFlags} field. */
		public int dwFlags() { return PIXELFORMATDESCRIPTOR.ndwFlags(address()); }
		/** Returns the value of the {@code iPixelType} field. */
		public byte iPixelType() { return PIXELFORMATDESCRIPTOR.niPixelType(address()); }
		/** Returns the value of the {@code cColorBits} field. */
		public byte cColorBits() { return PIXELFORMATDESCRIPTOR.ncColorBits(address()); }
		/** Returns the value of the {@code cRedBits} field. */
		public byte cRedBits() { return PIXELFORMATDESCRIPTOR.ncRedBits(address()); }
		/** Returns the value of the {@code cRedShift} field. */
		public byte cRedShift() { return PIXELFORMATDESCRIPTOR.ncRedShift(address()); }
		/** Returns the value of the {@code cGreenBits} field. */
		public byte cGreenBits() { return PIXELFORMATDESCRIPTOR.ncGreenBits(address()); }
		/** Returns the value of the {@code cGreenShift} field. */
		public byte cGreenShift() { return PIXELFORMATDESCRIPTOR.ncGreenShift(address()); }
		/** Returns the value of the {@code cBlueBits} field. */
		public byte cBlueBits() { return PIXELFORMATDESCRIPTOR.ncBlueBits(address()); }
		/** Returns the value of the {@code cBlueShift} field. */
		public byte cBlueShift() { return PIXELFORMATDESCRIPTOR.ncBlueShift(address()); }
		/** Returns the value of the {@code cAlphaBits} field. */
		public byte cAlphaBits() { return PIXELFORMATDESCRIPTOR.ncAlphaBits(address()); }
		/** Returns the value of the {@code cAlphaShift} field. */
		public byte cAlphaShift() { return PIXELFORMATDESCRIPTOR.ncAlphaShift(address()); }
		/** Returns the value of the {@code cAccumBits} field. */
		public byte cAccumBits() { return PIXELFORMATDESCRIPTOR.ncAccumBits(address()); }
		/** Returns the value of the {@code cAccumRedBits} field. */
		public byte cAccumRedBits() { return PIXELFORMATDESCRIPTOR.ncAccumRedBits(address()); }
		/** Returns the value of the {@code cAccumGreenBits} field. */
		public byte cAccumGreenBits() { return PIXELFORMATDESCRIPTOR.ncAccumGreenBits(address()); }
		/** Returns the value of the {@code cAccumBlueBits} field. */
		public byte cAccumBlueBits() { return PIXELFORMATDESCRIPTOR.ncAccumBlueBits(address()); }
		/** Returns the value of the {@code cAccumAlphaBits} field. */
		public byte cAccumAlphaBits() { return PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(address()); }
		/** Returns the value of the {@code cDepthBits} field. */
		public byte cDepthBits() { return PIXELFORMATDESCRIPTOR.ncDepthBits(address()); }
		/** Returns the value of the {@code cStencilBits} field. */
		public byte cStencilBits() { return PIXELFORMATDESCRIPTOR.ncStencilBits(address()); }
		/** Returns the value of the {@code cAuxBuffers} field. */
		public byte cAuxBuffers() { return PIXELFORMATDESCRIPTOR.ncAuxBuffers(address()); }
		/** Returns the value of the {@code iLayerType} field. */
		public byte iLayerType() { return PIXELFORMATDESCRIPTOR.niLayerType(address()); }
		/** Returns the value of the {@code bReserved} field. */
		public byte bReserved() { return PIXELFORMATDESCRIPTOR.nbReserved(address()); }
		/** Returns the value of the {@code dwLayerMask} field. */
		public int dwLayerMask() { return PIXELFORMATDESCRIPTOR.ndwLayerMask(address()); }
		/** Returns the value of the {@code dwVisibleMask} field. */
		public int dwVisibleMask() { return PIXELFORMATDESCRIPTOR.ndwVisibleMask(address()); }
		/** Returns the value of the {@code dwDamageMask} field. */
		public int dwDamageMask() { return PIXELFORMATDESCRIPTOR.ndwDamageMask(address()); }

		/** Sets the specified value to the {@code nSize} field. */
		public PIXELFORMATDESCRIPTOR.Buffer nSize(short value) { PIXELFORMATDESCRIPTOR.nnSize(address(), value); return this; }
		/** Sets the specified value to the {@code nVersion} field. */
		public PIXELFORMATDESCRIPTOR.Buffer nVersion(short value) { PIXELFORMATDESCRIPTOR.nnVersion(address(), value); return this; }
		/** Sets the specified value to the {@code dwFlags} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwFlags(int value) { PIXELFORMATDESCRIPTOR.ndwFlags(address(), value); return this; }
		/** Sets the specified value to the {@code iPixelType} field. */
		public PIXELFORMATDESCRIPTOR.Buffer iPixelType(byte value) { PIXELFORMATDESCRIPTOR.niPixelType(address(), value); return this; }
		/** Sets the specified value to the {@code cColorBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cColorBits(byte value) { PIXELFORMATDESCRIPTOR.ncColorBits(address(), value); return this; }
		/** Sets the specified value to the {@code cRedBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cRedBits(byte value) { PIXELFORMATDESCRIPTOR.ncRedBits(address(), value); return this; }
		/** Sets the specified value to the {@code cRedShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cRedShift(byte value) { PIXELFORMATDESCRIPTOR.ncRedShift(address(), value); return this; }
		/** Sets the specified value to the {@code cGreenBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cGreenBits(byte value) { PIXELFORMATDESCRIPTOR.ncGreenBits(address(), value); return this; }
		/** Sets the specified value to the {@code cGreenShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cGreenShift(byte value) { PIXELFORMATDESCRIPTOR.ncGreenShift(address(), value); return this; }
		/** Sets the specified value to the {@code cBlueBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cBlueBits(byte value) { PIXELFORMATDESCRIPTOR.ncBlueBits(address(), value); return this; }
		/** Sets the specified value to the {@code cBlueShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cBlueShift(byte value) { PIXELFORMATDESCRIPTOR.ncBlueShift(address(), value); return this; }
		/** Sets the specified value to the {@code cAlphaBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAlphaBits(byte value) { PIXELFORMATDESCRIPTOR.ncAlphaBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAlphaShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAlphaShift(byte value) { PIXELFORMATDESCRIPTOR.ncAlphaShift(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumBits(byte value) { PIXELFORMATDESCRIPTOR.ncAccumBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumRedBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumRedBits(byte value) { PIXELFORMATDESCRIPTOR.ncAccumRedBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumGreenBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumGreenBits(byte value) { PIXELFORMATDESCRIPTOR.ncAccumGreenBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumBlueBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumBlueBits(byte value) { PIXELFORMATDESCRIPTOR.ncAccumBlueBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumAlphaBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumAlphaBits(byte value) { PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(address(), value); return this; }
		/** Sets the specified value to the {@code cDepthBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cDepthBits(byte value) { PIXELFORMATDESCRIPTOR.ncDepthBits(address(), value); return this; }
		/** Sets the specified value to the {@code cStencilBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cStencilBits(byte value) { PIXELFORMATDESCRIPTOR.ncStencilBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAuxBuffers} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAuxBuffers(byte value) { PIXELFORMATDESCRIPTOR.ncAuxBuffers(address(), value); return this; }
		/** Sets the specified value to the {@code iLayerType} field. */
		public PIXELFORMATDESCRIPTOR.Buffer iLayerType(byte value) { PIXELFORMATDESCRIPTOR.niLayerType(address(), value); return this; }
		/** Sets the specified value to the {@code bReserved} field. */
		public PIXELFORMATDESCRIPTOR.Buffer bReserved(byte value) { PIXELFORMATDESCRIPTOR.nbReserved(address(), value); return this; }
		/** Sets the specified value to the {@code dwLayerMask} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwLayerMask(int value) { PIXELFORMATDESCRIPTOR.ndwLayerMask(address(), value); return this; }
		/** Sets the specified value to the {@code dwVisibleMask} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwVisibleMask(int value) { PIXELFORMATDESCRIPTOR.ndwVisibleMask(address(), value); return this; }
		/** Sets the specified value to the {@code dwDamageMask} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwDamageMask(int value) { PIXELFORMATDESCRIPTOR.ndwDamageMask(address(), value); return this; }

	}

}