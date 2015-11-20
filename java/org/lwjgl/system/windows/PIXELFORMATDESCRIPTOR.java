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
 * Describes the pixel format of a drawing surface.
 * 
 * <h3>PIXELFORMATDESCRIPTOR members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>nSize</td><td class="nw">WORD</td><td>specifies the size of this data structure. This value should be set to {@link #SIZEOF}.</td></tr>
 * <tr><td>nVersion</td><td class="nw">WORD</td><td>specifies the version of this data structure. This value should be set to 1</td></tr>
 * <tr><td>dwFlags</td><td class="nw">DWORD</td><td>a set of bit flags that specify properties of the pixel buffer</td></tr>
 * <tr><td>iPixelType</td><td class="nw">BYTE</td><td>specifies the type of pixel data</td></tr>
 * <tr><td>cColorBits</td><td class="nw">BYTE</td><td>specifies the number of color bitplanes in each color buffer. For RGBA pixel types, it is the size of the color buffer, excluding the alpha bitplanes.
 * For color-index pixels, it is the size of the color-index buffer.</td></tr>
 * <tr><td>cRedBits</td><td class="nw">BYTE</td><td>specifies the number of red bitplanes in each RGBA color buffer</td></tr>
 * <tr><td>cRedShift</td><td class="nw">BYTE</td><td>specifies the shift count for red bitplanes in each RGBA color buffer</td></tr>
 * <tr><td>cGreenBits</td><td class="nw">BYTE</td><td>specifies the number of green bitplanes in each RGBA color buffer</td></tr>
 * <tr><td>cGreenShift</td><td class="nw">BYTE</td><td>specifies the shift count for green bitplanes in each RGBA color buffer</td></tr>
 * <tr><td>cBlueBits</td><td class="nw">BYTE</td><td>specifies the number of blue bitplanes in each RGBA color buffer</td></tr>
 * <tr><td>cBlueShift</td><td class="nw">BYTE</td><td>specifies the shift count for blue bitplanes in each RGBA color buffer</td></tr>
 * <tr><td>cAlphaBits</td><td class="nw">BYTE</td><td>specifies the number of alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported</td></tr>
 * <tr><td>cAlphaShift</td><td class="nw">BYTE</td><td>specifies the shift count for alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported</td></tr>
 * <tr><td>cAccumBits</td><td class="nw">BYTE</td><td>specifies the total number of bitplanes in the accumulation buffer</td></tr>
 * <tr><td>cAccumRedBits</td><td class="nw">BYTE</td><td>specifies the number of red bitplanes in the accumulation buffer</td></tr>
 * <tr><td>cAccumGreenBits</td><td class="nw">BYTE</td><td>specifies the number of green bitplanes in the accumulation buffer</td></tr>
 * <tr><td>cAccumBlueBits</td><td class="nw">BYTE</td><td>specifies the number of blue bitplanes in the accumulation buffer</td></tr>
 * <tr><td>cAccumAlphaBits</td><td class="nw">BYTE</td><td>specifies the number of alpha bitplanes in the accumulation buffer</td></tr>
 * <tr><td>cDepthBits</td><td class="nw">BYTE</td><td>specifies the depth of the depth (z-axis) buffer</td></tr>
 * <tr><td>cStencilBits</td><td class="nw">BYTE</td><td>specifies the depth of the stencil buffer</td></tr>
 * <tr><td>cAuxBuffers</td><td class="nw">BYTE</td><td>specifies the number of auxiliary buffers. Auxiliary buffers are not supported</td></tr>
 * <tr><td>iLayerType</td><td class="nw">BYTE</td><td>Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.</td></tr>
 * <tr><td>bReserved</td><td class="nw">BYTE</td><td>specifies the number of overlay and underlay planes. Bits 0 through 3 specify up to 15 overlay planes and bits 4 through 7 specify up to 15 underlay
 * planes</td></tr>
 * <tr><td>dwLayerMask</td><td class="nw">DWORD</td><td>Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.</td></tr>
 * <tr><td>dwVisibleMask</td><td class="nw">DWORD</td><td>specifies the transparent color or index of an underlay plane. When the pixel type is RGBA, {@code dwVisibleMask} is a transparent RGB color value.
 * When the pixel type is color index, it is a transparent index value.</td></tr>
 * <tr><td>dwDamageMask</td><td class="nw">DWORD</td><td>Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.</td></tr>
 * </table>
 */
public class PIXELFORMATDESCRIPTOR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

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
		super(address, container, SIZEOF);
	}

	/** Creates a {@link PIXELFORMATDESCRIPTOR} instance at the specified memory address. */
	public PIXELFORMATDESCRIPTOR(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link PIXELFORMATDESCRIPTOR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public PIXELFORMATDESCRIPTOR(ByteBuffer container) {
		this(memAddress(container), container);
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

	/** Unsafe version of {@link #set(PIXELFORMATDESCRIPTOR) set}. */
	public PIXELFORMATDESCRIPTOR nset(long struct) {
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
	public PIXELFORMATDESCRIPTOR set(PIXELFORMATDESCRIPTOR src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(PIXELFORMATDESCRIPTOR) set}. */
	public PIXELFORMATDESCRIPTOR set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static PIXELFORMATDESCRIPTOR malloc() {
		return new PIXELFORMATDESCRIPTOR(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static PIXELFORMATDESCRIPTOR calloc() {
		return new PIXELFORMATDESCRIPTOR(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link PIXELFORMATDESCRIPTOR} instance allocated with {@link BufferUtils}. */
	public static PIXELFORMATDESCRIPTOR create() {
		return new PIXELFORMATDESCRIPTOR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link PIXELFORMATDESCRIPTOR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

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
	public static final class Buffer extends StructBuffer<PIXELFORMATDESCRIPTOR, Buffer> {

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
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
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
		public PIXELFORMATDESCRIPTOR.Buffer nSize(short value) { nnSize(address(), value); return this; }
		/** Sets the specified value to the {@code nVersion} field. */
		public PIXELFORMATDESCRIPTOR.Buffer nVersion(short value) { nnVersion(address(), value); return this; }
		/** Sets the specified value to the {@code dwFlags} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwFlags(int value) { ndwFlags(address(), value); return this; }
		/** Sets the specified value to the {@code iPixelType} field. */
		public PIXELFORMATDESCRIPTOR.Buffer iPixelType(byte value) { niPixelType(address(), value); return this; }
		/** Sets the specified value to the {@code cColorBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cColorBits(byte value) { ncColorBits(address(), value); return this; }
		/** Sets the specified value to the {@code cRedBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cRedBits(byte value) { ncRedBits(address(), value); return this; }
		/** Sets the specified value to the {@code cRedShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cRedShift(byte value) { ncRedShift(address(), value); return this; }
		/** Sets the specified value to the {@code cGreenBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cGreenBits(byte value) { ncGreenBits(address(), value); return this; }
		/** Sets the specified value to the {@code cGreenShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cGreenShift(byte value) { ncGreenShift(address(), value); return this; }
		/** Sets the specified value to the {@code cBlueBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cBlueBits(byte value) { ncBlueBits(address(), value); return this; }
		/** Sets the specified value to the {@code cBlueShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cBlueShift(byte value) { ncBlueShift(address(), value); return this; }
		/** Sets the specified value to the {@code cAlphaBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAlphaBits(byte value) { ncAlphaBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAlphaShift} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAlphaShift(byte value) { ncAlphaShift(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumBits(byte value) { ncAccumBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumRedBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumRedBits(byte value) { ncAccumRedBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumGreenBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumGreenBits(byte value) { ncAccumGreenBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumBlueBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumBlueBits(byte value) { ncAccumBlueBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAccumAlphaBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAccumAlphaBits(byte value) { ncAccumAlphaBits(address(), value); return this; }
		/** Sets the specified value to the {@code cDepthBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cDepthBits(byte value) { ncDepthBits(address(), value); return this; }
		/** Sets the specified value to the {@code cStencilBits} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cStencilBits(byte value) { ncStencilBits(address(), value); return this; }
		/** Sets the specified value to the {@code cAuxBuffers} field. */
		public PIXELFORMATDESCRIPTOR.Buffer cAuxBuffers(byte value) { ncAuxBuffers(address(), value); return this; }
		/** Sets the specified value to the {@code iLayerType} field. */
		public PIXELFORMATDESCRIPTOR.Buffer iLayerType(byte value) { niLayerType(address(), value); return this; }
		/** Sets the specified value to the {@code bReserved} field. */
		public PIXELFORMATDESCRIPTOR.Buffer bReserved(byte value) { nbReserved(address(), value); return this; }
		/** Sets the specified value to the {@code dwLayerMask} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwLayerMask(int value) { ndwLayerMask(address(), value); return this; }
		/** Sets the specified value to the {@code dwVisibleMask} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwVisibleMask(int value) { ndwVisibleMask(address(), value); return this; }
		/** Sets the specified value to the {@code dwDamageMask} field. */
		public PIXELFORMATDESCRIPTOR.Buffer dwDamageMask(int value) { ndwDamageMask(address(), value); return this; }

	}

}