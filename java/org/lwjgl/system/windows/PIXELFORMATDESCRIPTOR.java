/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Describes the pixel format of a drawing surface. */
public final class PIXELFORMATDESCRIPTOR implements Pointer {

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
		IntBuffer offsets = BufferUtils.createIntBuffer(26);

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
	}

	private final ByteBuffer struct;

	public PIXELFORMATDESCRIPTOR() {
		this(malloc());
	}

	public PIXELFORMATDESCRIPTOR(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setSize(int size) { size(struct, size); }
	public void setVersion(int version) { version(struct, version); }
	public void setFlags(int flags) { flags(struct, flags); }
	public void setPixelType(int pixelType) { pixelType(struct, pixelType); }
	public void setColorBits(int colorBits) { colorBits(struct, colorBits); }
	public void setRedBits(int redBits) { redBits(struct, redBits); }
	public void setRedShirt(int redShirt) { redShirt(struct, redShirt); }
	public void setGreenBits(int greenBits) { greenBits(struct, greenBits); }
	public void setGreenShift(int greenShift) { greenShift(struct, greenShift); }
	public void setBlueBits(int blueBits) { blueBits(struct, blueBits); }
	public void setBlueShift(int blueShift) { blueShift(struct, blueShift); }
	public void setAlphaBits(int alphaBits) { alphaBits(struct, alphaBits); }
	public void setAlphaShift(int alphaShift) { alphaShift(struct, alphaShift); }
	public void setAccumBits(int accumBits) { accumBits(struct, accumBits); }
	public void setAccumRedBits(int accumRedBits) { accumRedBits(struct, accumRedBits); }
	public void setAccumGreenBits(int accumGreenBits) { accumGreenBits(struct, accumGreenBits); }
	public void setAccumBlueBits(int accumBlueBits) { accumBlueBits(struct, accumBlueBits); }
	public void setAccumAlphaBits(int accumAlphaBits) { accumAlphaBits(struct, accumAlphaBits); }
	public void setDepthBits(int depthBits) { depthBits(struct, depthBits); }
	public void setStencilBits(int stencilBits) { stencilBits(struct, stencilBits); }
	public void setAuxBuffers(int auxBuffers) { auxBuffers(struct, auxBuffers); }
	public void setLayerType(int layerType) { layerType(struct, layerType); }
	public void setReserved(int reserved) { reserved(struct, reserved); }
	public void setLayerMask(int layerMask) { layerMask(struct, layerMask); }
	public void setVisibleMask(int visibleMask) { visibleMask(struct, visibleMask); }
	public void setDamageMask(int damageMask) { damageMask(struct, damageMask); }

	public int getSize() { return size(struct); }
	public int getVersion() { return version(struct); }
	public int getFlags() { return flags(struct); }
	public int getPixelType() { return pixelType(struct); }
	public int getColorBits() { return colorBits(struct); }
	public int getRedBits() { return redBits(struct); }
	public int getRedShirt() { return redShirt(struct); }
	public int getGreenBits() { return greenBits(struct); }
	public int getGreenShift() { return greenShift(struct); }
	public int getBlueBits() { return blueBits(struct); }
	public int getBlueShift() { return blueShift(struct); }
	public int getAlphaBits() { return alphaBits(struct); }
	public int getAlphaShift() { return alphaShift(struct); }
	public int getAccumBits() { return accumBits(struct); }
	public int getAccumRedBits() { return accumRedBits(struct); }
	public int getAccumGreenBits() { return accumGreenBits(struct); }
	public int getAccumBlueBits() { return accumBlueBits(struct); }
	public int getAccumAlphaBits() { return accumAlphaBits(struct); }
	public int getDepthBits() { return depthBits(struct); }
	public int getStencilBits() { return stencilBits(struct); }
	public int getAuxBuffers() { return auxBuffers(struct); }
	public int getLayerType() { return layerType(struct); }
	public int getReserved() { return reserved(struct); }
	public int getLayerMask() { return layerMask(struct); }
	public int getVisibleMask() { return visibleMask(struct); }
	public int getDamageMask() { return damageMask(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
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
		ByteBuffer pixelformatdescriptor = malloc();

		size(pixelformatdescriptor, size);
		version(pixelformatdescriptor, version);
		flags(pixelformatdescriptor, flags);
		pixelType(pixelformatdescriptor, pixelType);
		colorBits(pixelformatdescriptor, colorBits);
		redBits(pixelformatdescriptor, redBits);
		redShirt(pixelformatdescriptor, redShirt);
		greenBits(pixelformatdescriptor, greenBits);
		greenShift(pixelformatdescriptor, greenShift);
		blueBits(pixelformatdescriptor, blueBits);
		blueShift(pixelformatdescriptor, blueShift);
		alphaBits(pixelformatdescriptor, alphaBits);
		alphaShift(pixelformatdescriptor, alphaShift);
		accumBits(pixelformatdescriptor, accumBits);
		accumRedBits(pixelformatdescriptor, accumRedBits);
		accumGreenBits(pixelformatdescriptor, accumGreenBits);
		accumBlueBits(pixelformatdescriptor, accumBlueBits);
		accumAlphaBits(pixelformatdescriptor, accumAlphaBits);
		depthBits(pixelformatdescriptor, depthBits);
		stencilBits(pixelformatdescriptor, stencilBits);
		auxBuffers(pixelformatdescriptor, auxBuffers);
		layerType(pixelformatdescriptor, layerType);
		reserved(pixelformatdescriptor, reserved);
		layerMask(pixelformatdescriptor, layerMask);
		visibleMask(pixelformatdescriptor, visibleMask);
		damageMask(pixelformatdescriptor, damageMask);

		return pixelformatdescriptor;
	}

	public static void size(ByteBuffer pixelformatdescriptor, int size) { pixelformatdescriptor.putShort(pixelformatdescriptor.position() + SIZE, (short)size); }
	public static void version(ByteBuffer pixelformatdescriptor, int version) { pixelformatdescriptor.putShort(pixelformatdescriptor.position() + VERSION, (short)version); }
	public static void flags(ByteBuffer pixelformatdescriptor, int flags) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + FLAGS, flags); }
	public static void pixelType(ByteBuffer pixelformatdescriptor, int pixelType) { pixelformatdescriptor.put(pixelformatdescriptor.position() + PIXELTYPE, (byte)pixelType); }
	public static void colorBits(ByteBuffer pixelformatdescriptor, int colorBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + COLORBITS, (byte)colorBits); }
	public static void redBits(ByteBuffer pixelformatdescriptor, int redBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + REDBITS, (byte)redBits); }
	public static void redShirt(ByteBuffer pixelformatdescriptor, int redShirt) { pixelformatdescriptor.put(pixelformatdescriptor.position() + REDSHIRT, (byte)redShirt); }
	public static void greenBits(ByteBuffer pixelformatdescriptor, int greenBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + GREENBITS, (byte)greenBits); }
	public static void greenShift(ByteBuffer pixelformatdescriptor, int greenShift) { pixelformatdescriptor.put(pixelformatdescriptor.position() + GREENSHIFT, (byte)greenShift); }
	public static void blueBits(ByteBuffer pixelformatdescriptor, int blueBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + BLUEBITS, (byte)blueBits); }
	public static void blueShift(ByteBuffer pixelformatdescriptor, int blueShift) { pixelformatdescriptor.put(pixelformatdescriptor.position() + BLUESHIFT, (byte)blueShift); }
	public static void alphaBits(ByteBuffer pixelformatdescriptor, int alphaBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ALPHABITS, (byte)alphaBits); }
	public static void alphaShift(ByteBuffer pixelformatdescriptor, int alphaShift) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ALPHASHIFT, (byte)alphaShift); }
	public static void accumBits(ByteBuffer pixelformatdescriptor, int accumBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMBITS, (byte)accumBits); }
	public static void accumRedBits(ByteBuffer pixelformatdescriptor, int accumRedBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMREDBITS, (byte)accumRedBits); }
	public static void accumGreenBits(ByteBuffer pixelformatdescriptor, int accumGreenBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMGREENBITS, (byte)accumGreenBits); }
	public static void accumBlueBits(ByteBuffer pixelformatdescriptor, int accumBlueBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMBLUEBITS, (byte)accumBlueBits); }
	public static void accumAlphaBits(ByteBuffer pixelformatdescriptor, int accumAlphaBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMALPHABITS, (byte)accumAlphaBits); }
	public static void depthBits(ByteBuffer pixelformatdescriptor, int depthBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + DEPTHBITS, (byte)depthBits); }
	public static void stencilBits(ByteBuffer pixelformatdescriptor, int stencilBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + STENCILBITS, (byte)stencilBits); }
	public static void auxBuffers(ByteBuffer pixelformatdescriptor, int auxBuffers) { pixelformatdescriptor.put(pixelformatdescriptor.position() + AUXBUFFERS, (byte)auxBuffers); }
	public static void layerType(ByteBuffer pixelformatdescriptor, int layerType) { pixelformatdescriptor.put(pixelformatdescriptor.position() + LAYERTYPE, (byte)layerType); }
	public static void reserved(ByteBuffer pixelformatdescriptor, int reserved) { pixelformatdescriptor.put(pixelformatdescriptor.position() + RESERVED, (byte)reserved); }
	public static void layerMask(ByteBuffer pixelformatdescriptor, int layerMask) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + LAYERMASK, layerMask); }
	public static void visibleMask(ByteBuffer pixelformatdescriptor, int visibleMask) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + VISIBLEMASK, visibleMask); }
	public static void damageMask(ByteBuffer pixelformatdescriptor, int damageMask) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + DAMAGEMASK, damageMask); }

	public static int size(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getShort(pixelformatdescriptor.position() + SIZE); }
	public static int version(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getShort(pixelformatdescriptor.position() + VERSION); }
	public static int flags(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + FLAGS); }
	public static int pixelType(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + PIXELTYPE); }
	public static int colorBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + COLORBITS); }
	public static int redBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + REDBITS); }
	public static int redShirt(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + REDSHIRT); }
	public static int greenBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + GREENBITS); }
	public static int greenShift(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + GREENSHIFT); }
	public static int blueBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + BLUEBITS); }
	public static int blueShift(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + BLUESHIFT); }
	public static int alphaBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ALPHABITS); }
	public static int alphaShift(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ALPHASHIFT); }
	public static int accumBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMBITS); }
	public static int accumRedBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMREDBITS); }
	public static int accumGreenBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMGREENBITS); }
	public static int accumBlueBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMBLUEBITS); }
	public static int accumAlphaBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMALPHABITS); }
	public static int depthBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + DEPTHBITS); }
	public static int stencilBits(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + STENCILBITS); }
	public static int auxBuffers(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + AUXBUFFERS); }
	public static int layerType(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + LAYERTYPE); }
	public static int reserved(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + RESERVED); }
	public static int layerMask(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + LAYERMASK); }
	public static int visibleMask(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + VISIBLEMASK); }
	public static int damageMask(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + DAMAGEMASK); }

}