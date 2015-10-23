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

/** Describes the pixel format of a drawing surface. */
public class PIXELFORMATDESCRIPTOR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		VERSION,
		FLAGS,
		PIXELTYPE,
		COLORBITS,
		REDBITS,
		REDSHIRT,
		GREENBITS,
		GREENSHIFT,
		BLUEBITS,
		BLUESHIFT,
		ALPHABITS,
		ALPHASHIFT,
		ACCUMBITS,
		ACCUMREDBITS,
		ACCUMGREENBITS,
		ACCUMBLUEBITS,
		ACCUMALPHABITS,
		DEPTHBITS,
		STENCILBITS,
		AUXBUFFERS,
		LAYERTYPE,
		RESERVED,
		LAYERMASK,
		VISIBLEMASK,
		DAMAGEMASK;

	static {
		IntBuffer offsets = memAllocInt(26);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		VERSION = offsets.get(1);
		FLAGS = offsets.get(2);
		PIXELTYPE = offsets.get(3);
		COLORBITS = offsets.get(4);
		REDBITS = offsets.get(5);
		REDSHIRT = offsets.get(6);
		GREENBITS = offsets.get(7);
		GREENSHIFT = offsets.get(8);
		BLUEBITS = offsets.get(9);
		BLUESHIFT = offsets.get(10);
		ALPHABITS = offsets.get(11);
		ALPHASHIFT = offsets.get(12);
		ACCUMBITS = offsets.get(13);
		ACCUMREDBITS = offsets.get(14);
		ACCUMGREENBITS = offsets.get(15);
		ACCUMBLUEBITS = offsets.get(16);
		ACCUMALPHABITS = offsets.get(17);
		DEPTHBITS = offsets.get(18);
		STENCILBITS = offsets.get(19);
		AUXBUFFERS = offsets.get(20);
		LAYERTYPE = offsets.get(21);
		RESERVED = offsets.get(22);
		LAYERMASK = offsets.get(23);
		VISIBLEMASK = offsets.get(24);
		DAMAGEMASK = offsets.get(25);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

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

	public int getSize() { return ngetSize(address()); }
	public int getVersion() { return ngetVersion(address()); }
	public int getFlags() { return ngetFlags(address()); }
	public int getPixelType() { return ngetPixelType(address()); }
	public int getColorBits() { return ngetColorBits(address()); }
	public int getRedBits() { return ngetRedBits(address()); }
	public int getRedShirt() { return ngetRedShirt(address()); }
	public int getGreenBits() { return ngetGreenBits(address()); }
	public int getGreenShift() { return ngetGreenShift(address()); }
	public int getBlueBits() { return ngetBlueBits(address()); }
	public int getBlueShift() { return ngetBlueShift(address()); }
	public int getAlphaBits() { return ngetAlphaBits(address()); }
	public int getAlphaShift() { return ngetAlphaShift(address()); }
	public int getAccumBits() { return ngetAccumBits(address()); }
	public int getAccumRedBits() { return ngetAccumRedBits(address()); }
	public int getAccumGreenBits() { return ngetAccumGreenBits(address()); }
	public int getAccumBlueBits() { return ngetAccumBlueBits(address()); }
	public int getAccumAlphaBits() { return ngetAccumAlphaBits(address()); }
	public int getDepthBits() { return ngetDepthBits(address()); }
	public int getStencilBits() { return ngetStencilBits(address()); }
	public int getAuxBuffers() { return ngetAuxBuffers(address()); }
	public int getLayerType() { return ngetLayerType(address()); }
	public int getReserved() { return ngetReserved(address()); }
	public int getLayerMask() { return ngetLayerMask(address()); }
	public int getVisibleMask() { return ngetVisibleMask(address()); }
	public int getDamageMask() { return ngetDamageMask(address()); }

	public PIXELFORMATDESCRIPTOR setSize(int size) { nsetSize(address(), size); return this; }
	public PIXELFORMATDESCRIPTOR setVersion(int version) { nsetVersion(address(), version); return this; }
	public PIXELFORMATDESCRIPTOR setFlags(int flags) { nsetFlags(address(), flags); return this; }
	public PIXELFORMATDESCRIPTOR setPixelType(int pixelType) { nsetPixelType(address(), pixelType); return this; }
	public PIXELFORMATDESCRIPTOR setColorBits(int colorBits) { nsetColorBits(address(), colorBits); return this; }
	public PIXELFORMATDESCRIPTOR setRedBits(int redBits) { nsetRedBits(address(), redBits); return this; }
	public PIXELFORMATDESCRIPTOR setRedShirt(int redShirt) { nsetRedShirt(address(), redShirt); return this; }
	public PIXELFORMATDESCRIPTOR setGreenBits(int greenBits) { nsetGreenBits(address(), greenBits); return this; }
	public PIXELFORMATDESCRIPTOR setGreenShift(int greenShift) { nsetGreenShift(address(), greenShift); return this; }
	public PIXELFORMATDESCRIPTOR setBlueBits(int blueBits) { nsetBlueBits(address(), blueBits); return this; }
	public PIXELFORMATDESCRIPTOR setBlueShift(int blueShift) { nsetBlueShift(address(), blueShift); return this; }
	public PIXELFORMATDESCRIPTOR setAlphaBits(int alphaBits) { nsetAlphaBits(address(), alphaBits); return this; }
	public PIXELFORMATDESCRIPTOR setAlphaShift(int alphaShift) { nsetAlphaShift(address(), alphaShift); return this; }
	public PIXELFORMATDESCRIPTOR setAccumBits(int accumBits) { nsetAccumBits(address(), accumBits); return this; }
	public PIXELFORMATDESCRIPTOR setAccumRedBits(int accumRedBits) { nsetAccumRedBits(address(), accumRedBits); return this; }
	public PIXELFORMATDESCRIPTOR setAccumGreenBits(int accumGreenBits) { nsetAccumGreenBits(address(), accumGreenBits); return this; }
	public PIXELFORMATDESCRIPTOR setAccumBlueBits(int accumBlueBits) { nsetAccumBlueBits(address(), accumBlueBits); return this; }
	public PIXELFORMATDESCRIPTOR setAccumAlphaBits(int accumAlphaBits) { nsetAccumAlphaBits(address(), accumAlphaBits); return this; }
	public PIXELFORMATDESCRIPTOR setDepthBits(int depthBits) { nsetDepthBits(address(), depthBits); return this; }
	public PIXELFORMATDESCRIPTOR setStencilBits(int stencilBits) { nsetStencilBits(address(), stencilBits); return this; }
	public PIXELFORMATDESCRIPTOR setAuxBuffers(int auxBuffers) { nsetAuxBuffers(address(), auxBuffers); return this; }
	public PIXELFORMATDESCRIPTOR setLayerType(int layerType) { nsetLayerType(address(), layerType); return this; }
	public PIXELFORMATDESCRIPTOR setReserved(int reserved) { nsetReserved(address(), reserved); return this; }
	public PIXELFORMATDESCRIPTOR setLayerMask(int layerMask) { nsetLayerMask(address(), layerMask); return this; }
	public PIXELFORMATDESCRIPTOR setVisibleMask(int visibleMask) { nsetVisibleMask(address(), visibleMask); return this; }
	public PIXELFORMATDESCRIPTOR setDamageMask(int damageMask) { nsetDamageMask(address(), damageMask); return this; }

	/** Initializes this struct with the specified values. */
	public PIXELFORMATDESCRIPTOR set(
		int size,
		int version,
		int flags,
		int pixelType,
		int colorBits,
		int redBits,
		int redShirt,
		int greenBits,
		int greenShift,
		int blueBits,
		int blueShift,
		int alphaBits,
		int alphaShift,
		int accumBits,
		int accumRedBits,
		int accumGreenBits,
		int accumBlueBits,
		int accumAlphaBits,
		int depthBits,
		int stencilBits,
		int auxBuffers,
		int layerType,
		int reserved,
		int layerMask,
		int visibleMask,
		int damageMask
	) {
		setSize(size);
		setVersion(version);
		setFlags(flags);
		setPixelType(pixelType);
		setColorBits(colorBits);
		setRedBits(redBits);
		setRedShirt(redShirt);
		setGreenBits(greenBits);
		setGreenShift(greenShift);
		setBlueBits(blueBits);
		setBlueShift(blueShift);
		setAlphaBits(alphaBits);
		setAlphaShift(alphaShift);
		setAccumBits(accumBits);
		setAccumRedBits(accumRedBits);
		setAccumGreenBits(accumGreenBits);
		setAccumBlueBits(accumBlueBits);
		setAccumAlphaBits(accumAlphaBits);
		setDepthBits(depthBits);
		setStencilBits(stencilBits);
		setAuxBuffers(auxBuffers);
		setLayerType(layerType);
		setReserved(reserved);
		setLayerMask(layerMask);
		setVisibleMask(visibleMask);
		setDamageMask(damageMask);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public PIXELFORMATDESCRIPTOR nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public PIXELFORMATDESCRIPTOR set(PIXELFORMATDESCRIPTOR src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public PIXELFORMATDESCRIPTOR set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
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

	public static int ngetSize(long struct) { return memGetShort(struct + SIZE); }
	public static int getSize(ByteBuffer struct) { return ngetSize(memAddress(struct)); }
	public static int ngetVersion(long struct) { return memGetShort(struct + VERSION); }
	public static int getVersion(ByteBuffer struct) { return ngetVersion(memAddress(struct)); }
	public static int ngetFlags(long struct) { return memGetInt(struct + FLAGS); }
	public static int getFlags(ByteBuffer struct) { return ngetFlags(memAddress(struct)); }
	public static int ngetPixelType(long struct) { return memGetByte(struct + PIXELTYPE); }
	public static int getPixelType(ByteBuffer struct) { return ngetPixelType(memAddress(struct)); }
	public static int ngetColorBits(long struct) { return memGetByte(struct + COLORBITS); }
	public static int getColorBits(ByteBuffer struct) { return ngetColorBits(memAddress(struct)); }
	public static int ngetRedBits(long struct) { return memGetByte(struct + REDBITS); }
	public static int getRedBits(ByteBuffer struct) { return ngetRedBits(memAddress(struct)); }
	public static int ngetRedShirt(long struct) { return memGetByte(struct + REDSHIRT); }
	public static int getRedShirt(ByteBuffer struct) { return ngetRedShirt(memAddress(struct)); }
	public static int ngetGreenBits(long struct) { return memGetByte(struct + GREENBITS); }
	public static int getGreenBits(ByteBuffer struct) { return ngetGreenBits(memAddress(struct)); }
	public static int ngetGreenShift(long struct) { return memGetByte(struct + GREENSHIFT); }
	public static int getGreenShift(ByteBuffer struct) { return ngetGreenShift(memAddress(struct)); }
	public static int ngetBlueBits(long struct) { return memGetByte(struct + BLUEBITS); }
	public static int getBlueBits(ByteBuffer struct) { return ngetBlueBits(memAddress(struct)); }
	public static int ngetBlueShift(long struct) { return memGetByte(struct + BLUESHIFT); }
	public static int getBlueShift(ByteBuffer struct) { return ngetBlueShift(memAddress(struct)); }
	public static int ngetAlphaBits(long struct) { return memGetByte(struct + ALPHABITS); }
	public static int getAlphaBits(ByteBuffer struct) { return ngetAlphaBits(memAddress(struct)); }
	public static int ngetAlphaShift(long struct) { return memGetByte(struct + ALPHASHIFT); }
	public static int getAlphaShift(ByteBuffer struct) { return ngetAlphaShift(memAddress(struct)); }
	public static int ngetAccumBits(long struct) { return memGetByte(struct + ACCUMBITS); }
	public static int getAccumBits(ByteBuffer struct) { return ngetAccumBits(memAddress(struct)); }
	public static int ngetAccumRedBits(long struct) { return memGetByte(struct + ACCUMREDBITS); }
	public static int getAccumRedBits(ByteBuffer struct) { return ngetAccumRedBits(memAddress(struct)); }
	public static int ngetAccumGreenBits(long struct) { return memGetByte(struct + ACCUMGREENBITS); }
	public static int getAccumGreenBits(ByteBuffer struct) { return ngetAccumGreenBits(memAddress(struct)); }
	public static int ngetAccumBlueBits(long struct) { return memGetByte(struct + ACCUMBLUEBITS); }
	public static int getAccumBlueBits(ByteBuffer struct) { return ngetAccumBlueBits(memAddress(struct)); }
	public static int ngetAccumAlphaBits(long struct) { return memGetByte(struct + ACCUMALPHABITS); }
	public static int getAccumAlphaBits(ByteBuffer struct) { return ngetAccumAlphaBits(memAddress(struct)); }
	public static int ngetDepthBits(long struct) { return memGetByte(struct + DEPTHBITS); }
	public static int getDepthBits(ByteBuffer struct) { return ngetDepthBits(memAddress(struct)); }
	public static int ngetStencilBits(long struct) { return memGetByte(struct + STENCILBITS); }
	public static int getStencilBits(ByteBuffer struct) { return ngetStencilBits(memAddress(struct)); }
	public static int ngetAuxBuffers(long struct) { return memGetByte(struct + AUXBUFFERS); }
	public static int getAuxBuffers(ByteBuffer struct) { return ngetAuxBuffers(memAddress(struct)); }
	public static int ngetLayerType(long struct) { return memGetByte(struct + LAYERTYPE); }
	public static int getLayerType(ByteBuffer struct) { return ngetLayerType(memAddress(struct)); }
	public static int ngetReserved(long struct) { return memGetByte(struct + RESERVED); }
	public static int getReserved(ByteBuffer struct) { return ngetReserved(memAddress(struct)); }
	public static int ngetLayerMask(long struct) { return memGetInt(struct + LAYERMASK); }
	public static int getLayerMask(ByteBuffer struct) { return ngetLayerMask(memAddress(struct)); }
	public static int ngetVisibleMask(long struct) { return memGetInt(struct + VISIBLEMASK); }
	public static int getVisibleMask(ByteBuffer struct) { return ngetVisibleMask(memAddress(struct)); }
	public static int ngetDamageMask(long struct) { return memGetInt(struct + DAMAGEMASK); }
	public static int getDamageMask(ByteBuffer struct) { return ngetDamageMask(memAddress(struct)); }

	public static void nsetSize(long struct, int size) { memPutShort(struct + SIZE, (short)size); }
	public static void setSize(ByteBuffer struct, int size) { nsetSize(memAddress(struct), size); }
	public static void nsetVersion(long struct, int version) { memPutShort(struct + VERSION, (short)version); }
	public static void setVersion(ByteBuffer struct, int version) { nsetVersion(memAddress(struct), version); }
	public static void nsetFlags(long struct, int flags) { memPutInt(struct + FLAGS, flags); }
	public static void setFlags(ByteBuffer struct, int flags) { nsetFlags(memAddress(struct), flags); }
	public static void nsetPixelType(long struct, int pixelType) { memPutByte(struct + PIXELTYPE, (byte)pixelType); }
	public static void setPixelType(ByteBuffer struct, int pixelType) { nsetPixelType(memAddress(struct), pixelType); }
	public static void nsetColorBits(long struct, int colorBits) { memPutByte(struct + COLORBITS, (byte)colorBits); }
	public static void setColorBits(ByteBuffer struct, int colorBits) { nsetColorBits(memAddress(struct), colorBits); }
	public static void nsetRedBits(long struct, int redBits) { memPutByte(struct + REDBITS, (byte)redBits); }
	public static void setRedBits(ByteBuffer struct, int redBits) { nsetRedBits(memAddress(struct), redBits); }
	public static void nsetRedShirt(long struct, int redShirt) { memPutByte(struct + REDSHIRT, (byte)redShirt); }
	public static void setRedShirt(ByteBuffer struct, int redShirt) { nsetRedShirt(memAddress(struct), redShirt); }
	public static void nsetGreenBits(long struct, int greenBits) { memPutByte(struct + GREENBITS, (byte)greenBits); }
	public static void setGreenBits(ByteBuffer struct, int greenBits) { nsetGreenBits(memAddress(struct), greenBits); }
	public static void nsetGreenShift(long struct, int greenShift) { memPutByte(struct + GREENSHIFT, (byte)greenShift); }
	public static void setGreenShift(ByteBuffer struct, int greenShift) { nsetGreenShift(memAddress(struct), greenShift); }
	public static void nsetBlueBits(long struct, int blueBits) { memPutByte(struct + BLUEBITS, (byte)blueBits); }
	public static void setBlueBits(ByteBuffer struct, int blueBits) { nsetBlueBits(memAddress(struct), blueBits); }
	public static void nsetBlueShift(long struct, int blueShift) { memPutByte(struct + BLUESHIFT, (byte)blueShift); }
	public static void setBlueShift(ByteBuffer struct, int blueShift) { nsetBlueShift(memAddress(struct), blueShift); }
	public static void nsetAlphaBits(long struct, int alphaBits) { memPutByte(struct + ALPHABITS, (byte)alphaBits); }
	public static void setAlphaBits(ByteBuffer struct, int alphaBits) { nsetAlphaBits(memAddress(struct), alphaBits); }
	public static void nsetAlphaShift(long struct, int alphaShift) { memPutByte(struct + ALPHASHIFT, (byte)alphaShift); }
	public static void setAlphaShift(ByteBuffer struct, int alphaShift) { nsetAlphaShift(memAddress(struct), alphaShift); }
	public static void nsetAccumBits(long struct, int accumBits) { memPutByte(struct + ACCUMBITS, (byte)accumBits); }
	public static void setAccumBits(ByteBuffer struct, int accumBits) { nsetAccumBits(memAddress(struct), accumBits); }
	public static void nsetAccumRedBits(long struct, int accumRedBits) { memPutByte(struct + ACCUMREDBITS, (byte)accumRedBits); }
	public static void setAccumRedBits(ByteBuffer struct, int accumRedBits) { nsetAccumRedBits(memAddress(struct), accumRedBits); }
	public static void nsetAccumGreenBits(long struct, int accumGreenBits) { memPutByte(struct + ACCUMGREENBITS, (byte)accumGreenBits); }
	public static void setAccumGreenBits(ByteBuffer struct, int accumGreenBits) { nsetAccumGreenBits(memAddress(struct), accumGreenBits); }
	public static void nsetAccumBlueBits(long struct, int accumBlueBits) { memPutByte(struct + ACCUMBLUEBITS, (byte)accumBlueBits); }
	public static void setAccumBlueBits(ByteBuffer struct, int accumBlueBits) { nsetAccumBlueBits(memAddress(struct), accumBlueBits); }
	public static void nsetAccumAlphaBits(long struct, int accumAlphaBits) { memPutByte(struct + ACCUMALPHABITS, (byte)accumAlphaBits); }
	public static void setAccumAlphaBits(ByteBuffer struct, int accumAlphaBits) { nsetAccumAlphaBits(memAddress(struct), accumAlphaBits); }
	public static void nsetDepthBits(long struct, int depthBits) { memPutByte(struct + DEPTHBITS, (byte)depthBits); }
	public static void setDepthBits(ByteBuffer struct, int depthBits) { nsetDepthBits(memAddress(struct), depthBits); }
	public static void nsetStencilBits(long struct, int stencilBits) { memPutByte(struct + STENCILBITS, (byte)stencilBits); }
	public static void setStencilBits(ByteBuffer struct, int stencilBits) { nsetStencilBits(memAddress(struct), stencilBits); }
	public static void nsetAuxBuffers(long struct, int auxBuffers) { memPutByte(struct + AUXBUFFERS, (byte)auxBuffers); }
	public static void setAuxBuffers(ByteBuffer struct, int auxBuffers) { nsetAuxBuffers(memAddress(struct), auxBuffers); }
	public static void nsetLayerType(long struct, int layerType) { memPutByte(struct + LAYERTYPE, (byte)layerType); }
	public static void setLayerType(ByteBuffer struct, int layerType) { nsetLayerType(memAddress(struct), layerType); }
	public static void nsetReserved(long struct, int reserved) { memPutByte(struct + RESERVED, (byte)reserved); }
	public static void setReserved(ByteBuffer struct, int reserved) { nsetReserved(memAddress(struct), reserved); }
	public static void nsetLayerMask(long struct, int layerMask) { memPutInt(struct + LAYERMASK, layerMask); }
	public static void setLayerMask(ByteBuffer struct, int layerMask) { nsetLayerMask(memAddress(struct), layerMask); }
	public static void nsetVisibleMask(long struct, int visibleMask) { memPutInt(struct + VISIBLEMASK, visibleMask); }
	public static void setVisibleMask(ByteBuffer struct, int visibleMask) { nsetVisibleMask(memAddress(struct), visibleMask); }
	public static void nsetDamageMask(long struct, int damageMask) { memPutInt(struct + DAMAGEMASK, damageMask); }
	public static void setDamageMask(ByteBuffer struct, int damageMask) { nsetDamageMask(memAddress(struct), damageMask); }

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

		public int getSize() { return ngetSize(address()); }
		public int getVersion() { return ngetVersion(address()); }
		public int getFlags() { return ngetFlags(address()); }
		public int getPixelType() { return ngetPixelType(address()); }
		public int getColorBits() { return ngetColorBits(address()); }
		public int getRedBits() { return ngetRedBits(address()); }
		public int getRedShirt() { return ngetRedShirt(address()); }
		public int getGreenBits() { return ngetGreenBits(address()); }
		public int getGreenShift() { return ngetGreenShift(address()); }
		public int getBlueBits() { return ngetBlueBits(address()); }
		public int getBlueShift() { return ngetBlueShift(address()); }
		public int getAlphaBits() { return ngetAlphaBits(address()); }
		public int getAlphaShift() { return ngetAlphaShift(address()); }
		public int getAccumBits() { return ngetAccumBits(address()); }
		public int getAccumRedBits() { return ngetAccumRedBits(address()); }
		public int getAccumGreenBits() { return ngetAccumGreenBits(address()); }
		public int getAccumBlueBits() { return ngetAccumBlueBits(address()); }
		public int getAccumAlphaBits() { return ngetAccumAlphaBits(address()); }
		public int getDepthBits() { return ngetDepthBits(address()); }
		public int getStencilBits() { return ngetStencilBits(address()); }
		public int getAuxBuffers() { return ngetAuxBuffers(address()); }
		public int getLayerType() { return ngetLayerType(address()); }
		public int getReserved() { return ngetReserved(address()); }
		public int getLayerMask() { return ngetLayerMask(address()); }
		public int getVisibleMask() { return ngetVisibleMask(address()); }
		public int getDamageMask() { return ngetDamageMask(address()); }

		public PIXELFORMATDESCRIPTOR.Buffer setSize(int size) { nsetSize(address(), size); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setVersion(int version) { nsetVersion(address(), version); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setFlags(int flags) { nsetFlags(address(), flags); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setPixelType(int pixelType) { nsetPixelType(address(), pixelType); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setColorBits(int colorBits) { nsetColorBits(address(), colorBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setRedBits(int redBits) { nsetRedBits(address(), redBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setRedShirt(int redShirt) { nsetRedShirt(address(), redShirt); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setGreenBits(int greenBits) { nsetGreenBits(address(), greenBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setGreenShift(int greenShift) { nsetGreenShift(address(), greenShift); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setBlueBits(int blueBits) { nsetBlueBits(address(), blueBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setBlueShift(int blueShift) { nsetBlueShift(address(), blueShift); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAlphaBits(int alphaBits) { nsetAlphaBits(address(), alphaBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAlphaShift(int alphaShift) { nsetAlphaShift(address(), alphaShift); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAccumBits(int accumBits) { nsetAccumBits(address(), accumBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAccumRedBits(int accumRedBits) { nsetAccumRedBits(address(), accumRedBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAccumGreenBits(int accumGreenBits) { nsetAccumGreenBits(address(), accumGreenBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAccumBlueBits(int accumBlueBits) { nsetAccumBlueBits(address(), accumBlueBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAccumAlphaBits(int accumAlphaBits) { nsetAccumAlphaBits(address(), accumAlphaBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setDepthBits(int depthBits) { nsetDepthBits(address(), depthBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setStencilBits(int stencilBits) { nsetStencilBits(address(), stencilBits); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setAuxBuffers(int auxBuffers) { nsetAuxBuffers(address(), auxBuffers); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setLayerType(int layerType) { nsetLayerType(address(), layerType); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setReserved(int reserved) { nsetReserved(address(), reserved); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setLayerMask(int layerMask) { nsetLayerMask(address(), layerMask); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setVisibleMask(int visibleMask) { nsetVisibleMask(address(), visibleMask); return this; }
		public PIXELFORMATDESCRIPTOR.Buffer setDamageMask(int damageMask) { nsetDamageMask(address(), damageMask); return this; }

	}

}