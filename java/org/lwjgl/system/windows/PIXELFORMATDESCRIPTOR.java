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
public final class PIXELFORMATDESCRIPTOR {

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

	private PIXELFORMATDESCRIPTOR() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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

		sizeSet(pixelformatdescriptor, size);
		versionSet(pixelformatdescriptor, version);
		flagsSet(pixelformatdescriptor, flags);
		pixelTypeSet(pixelformatdescriptor, pixelType);
		colorBitsSet(pixelformatdescriptor, colorBits);
		redBitsSet(pixelformatdescriptor, redBits);
		redShirtSet(pixelformatdescriptor, redShirt);
		greenBitsSet(pixelformatdescriptor, greenBits);
		greenShiftSet(pixelformatdescriptor, greenShift);
		blueBitsSet(pixelformatdescriptor, blueBits);
		blueShiftSet(pixelformatdescriptor, blueShift);
		alphaBitsSet(pixelformatdescriptor, alphaBits);
		alphaShiftSet(pixelformatdescriptor, alphaShift);
		accumBitsSet(pixelformatdescriptor, accumBits);
		accumRedBitsSet(pixelformatdescriptor, accumRedBits);
		accumGreenBitsSet(pixelformatdescriptor, accumGreenBits);
		accumBlueBitsSet(pixelformatdescriptor, accumBlueBits);
		accumAlphaBitsSet(pixelformatdescriptor, accumAlphaBits);
		depthBitsSet(pixelformatdescriptor, depthBits);
		stencilBitsSet(pixelformatdescriptor, stencilBits);
		auxBuffersSet(pixelformatdescriptor, auxBuffers);
		layerTypeSet(pixelformatdescriptor, layerType);
		reservedSet(pixelformatdescriptor, reserved);
		layerMaskSet(pixelformatdescriptor, layerMask);
		visibleMaskSet(pixelformatdescriptor, visibleMask);
		damageMaskSet(pixelformatdescriptor, damageMask);

		return pixelformatdescriptor;
	}

	public static void sizeSet(ByteBuffer pixelformatdescriptor, int size) { pixelformatdescriptor.putShort(pixelformatdescriptor.position() + SIZE, (short)size); }
	public static void versionSet(ByteBuffer pixelformatdescriptor, int version) { pixelformatdescriptor.putShort(pixelformatdescriptor.position() + VERSION, (short)version); }
	public static void flagsSet(ByteBuffer pixelformatdescriptor, int flags) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + FLAGS, flags); }
	public static void pixelTypeSet(ByteBuffer pixelformatdescriptor, int pixelType) { pixelformatdescriptor.put(pixelformatdescriptor.position() + PIXELTYPE, (byte)pixelType); }
	public static void colorBitsSet(ByteBuffer pixelformatdescriptor, int colorBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + COLORBITS, (byte)colorBits); }
	public static void redBitsSet(ByteBuffer pixelformatdescriptor, int redBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + REDBITS, (byte)redBits); }
	public static void redShirtSet(ByteBuffer pixelformatdescriptor, int redShirt) { pixelformatdescriptor.put(pixelformatdescriptor.position() + REDSHIRT, (byte)redShirt); }
	public static void greenBitsSet(ByteBuffer pixelformatdescriptor, int greenBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + GREENBITS, (byte)greenBits); }
	public static void greenShiftSet(ByteBuffer pixelformatdescriptor, int greenShift) { pixelformatdescriptor.put(pixelformatdescriptor.position() + GREENSHIFT, (byte)greenShift); }
	public static void blueBitsSet(ByteBuffer pixelformatdescriptor, int blueBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + BLUEBITS, (byte)blueBits); }
	public static void blueShiftSet(ByteBuffer pixelformatdescriptor, int blueShift) { pixelformatdescriptor.put(pixelformatdescriptor.position() + BLUESHIFT, (byte)blueShift); }
	public static void alphaBitsSet(ByteBuffer pixelformatdescriptor, int alphaBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ALPHABITS, (byte)alphaBits); }
	public static void alphaShiftSet(ByteBuffer pixelformatdescriptor, int alphaShift) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ALPHASHIFT, (byte)alphaShift); }
	public static void accumBitsSet(ByteBuffer pixelformatdescriptor, int accumBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMBITS, (byte)accumBits); }
	public static void accumRedBitsSet(ByteBuffer pixelformatdescriptor, int accumRedBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMREDBITS, (byte)accumRedBits); }
	public static void accumGreenBitsSet(ByteBuffer pixelformatdescriptor, int accumGreenBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMGREENBITS, (byte)accumGreenBits); }
	public static void accumBlueBitsSet(ByteBuffer pixelformatdescriptor, int accumBlueBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMBLUEBITS, (byte)accumBlueBits); }
	public static void accumAlphaBitsSet(ByteBuffer pixelformatdescriptor, int accumAlphaBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + ACCUMALPHABITS, (byte)accumAlphaBits); }
	public static void depthBitsSet(ByteBuffer pixelformatdescriptor, int depthBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + DEPTHBITS, (byte)depthBits); }
	public static void stencilBitsSet(ByteBuffer pixelformatdescriptor, int stencilBits) { pixelformatdescriptor.put(pixelformatdescriptor.position() + STENCILBITS, (byte)stencilBits); }
	public static void auxBuffersSet(ByteBuffer pixelformatdescriptor, int auxBuffers) { pixelformatdescriptor.put(pixelformatdescriptor.position() + AUXBUFFERS, (byte)auxBuffers); }
	public static void layerTypeSet(ByteBuffer pixelformatdescriptor, int layerType) { pixelformatdescriptor.put(pixelformatdescriptor.position() + LAYERTYPE, (byte)layerType); }
	public static void reservedSet(ByteBuffer pixelformatdescriptor, int reserved) { pixelformatdescriptor.put(pixelformatdescriptor.position() + RESERVED, (byte)reserved); }
	public static void layerMaskSet(ByteBuffer pixelformatdescriptor, int layerMask) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + LAYERMASK, layerMask); }
	public static void visibleMaskSet(ByteBuffer pixelformatdescriptor, int visibleMask) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + VISIBLEMASK, visibleMask); }
	public static void damageMaskSet(ByteBuffer pixelformatdescriptor, int damageMask) { pixelformatdescriptor.putInt(pixelformatdescriptor.position() + DAMAGEMASK, damageMask); }

	public static int sizeGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getShort(pixelformatdescriptor.position() + SIZE); }
	public static int versionGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getShort(pixelformatdescriptor.position() + VERSION); }
	public static int flagsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + FLAGS); }
	public static int pixelTypeGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + PIXELTYPE); }
	public static int colorBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + COLORBITS); }
	public static int redBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + REDBITS); }
	public static int redShirtGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + REDSHIRT); }
	public static int greenBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + GREENBITS); }
	public static int greenShiftGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + GREENSHIFT); }
	public static int blueBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + BLUEBITS); }
	public static int blueShiftGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + BLUESHIFT); }
	public static int alphaBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ALPHABITS); }
	public static int alphaShiftGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ALPHASHIFT); }
	public static int accumBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMBITS); }
	public static int accumRedBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMREDBITS); }
	public static int accumGreenBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMGREENBITS); }
	public static int accumBlueBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMBLUEBITS); }
	public static int accumAlphaBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + ACCUMALPHABITS); }
	public static int depthBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + DEPTHBITS); }
	public static int stencilBitsGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + STENCILBITS); }
	public static int auxBuffersGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + AUXBUFFERS); }
	public static int layerTypeGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + LAYERTYPE); }
	public static int reservedGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.get(pixelformatdescriptor.position() + RESERVED); }
	public static int layerMaskGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + LAYERMASK); }
	public static int visibleMaskGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + VISIBLEMASK); }
	public static int damageMaskGet(ByteBuffer pixelformatdescriptor) { return pixelformatdescriptor.getInt(pixelformatdescriptor.position() + DAMAGEMASK); }

}