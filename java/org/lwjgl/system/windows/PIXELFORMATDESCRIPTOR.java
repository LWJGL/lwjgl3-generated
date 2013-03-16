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

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	public static void sizeSet(ByteBuffer struct, int size) { struct.putShort(struct.position() + SIZE, (short)size); }
	public static void versionSet(ByteBuffer struct, int version) { struct.putShort(struct.position() + VERSION, (short)version); }
	public static void flagsSet(ByteBuffer struct, int flags) { struct.putInt(struct.position() + FLAGS, flags); }
	public static void pixelTypeSet(ByteBuffer struct, int pixelType) { struct.put(struct.position() + PIXELTYPE, (byte)pixelType); }
	public static void colorBitsSet(ByteBuffer struct, int colorBits) { struct.put(struct.position() + COLORBITS, (byte)colorBits); }
	public static void redBitsSet(ByteBuffer struct, int redBits) { struct.put(struct.position() + REDBITS, (byte)redBits); }
	public static void redShirtSet(ByteBuffer struct, int redShirt) { struct.put(struct.position() + REDSHIRT, (byte)redShirt); }
	public static void greenBitsSet(ByteBuffer struct, int greenBits) { struct.put(struct.position() + GREENBITS, (byte)greenBits); }
	public static void greenShiftSet(ByteBuffer struct, int greenShift) { struct.put(struct.position() + GREENSHIFT, (byte)greenShift); }
	public static void blueBitsSet(ByteBuffer struct, int blueBits) { struct.put(struct.position() + BLUEBITS, (byte)blueBits); }
	public static void blueShiftSet(ByteBuffer struct, int blueShift) { struct.put(struct.position() + BLUESHIFT, (byte)blueShift); }
	public static void alphaBitsSet(ByteBuffer struct, int alphaBits) { struct.put(struct.position() + ALPHABITS, (byte)alphaBits); }
	public static void alphaShiftSet(ByteBuffer struct, int alphaShift) { struct.put(struct.position() + ALPHASHIFT, (byte)alphaShift); }
	public static void accumBitsSet(ByteBuffer struct, int accumBits) { struct.put(struct.position() + ACCUMBITS, (byte)accumBits); }
	public static void accumRedBitsSet(ByteBuffer struct, int accumRedBits) { struct.put(struct.position() + ACCUMREDBITS, (byte)accumRedBits); }
	public static void accumGreenBitsSet(ByteBuffer struct, int accumGreenBits) { struct.put(struct.position() + ACCUMGREENBITS, (byte)accumGreenBits); }
	public static void accumBlueBitsSet(ByteBuffer struct, int accumBlueBits) { struct.put(struct.position() + ACCUMBLUEBITS, (byte)accumBlueBits); }
	public static void accumAlphaBitsSet(ByteBuffer struct, int accumAlphaBits) { struct.put(struct.position() + ACCUMALPHABITS, (byte)accumAlphaBits); }
	public static void depthBitsSet(ByteBuffer struct, int depthBits) { struct.put(struct.position() + DEPTHBITS, (byte)depthBits); }
	public static void stencilBitsSet(ByteBuffer struct, int stencilBits) { struct.put(struct.position() + STENCILBITS, (byte)stencilBits); }
	public static void auxBuffersSet(ByteBuffer struct, int auxBuffers) { struct.put(struct.position() + AUXBUFFERS, (byte)auxBuffers); }
	public static void layerTypeSet(ByteBuffer struct, int layerType) { struct.put(struct.position() + LAYERTYPE, (byte)layerType); }
	public static void reservedSet(ByteBuffer struct, int reserved) { struct.put(struct.position() + RESERVED, (byte)reserved); }
	public static void layerMaskSet(ByteBuffer struct, int layerMask) { struct.putInt(struct.position() + LAYERMASK, layerMask); }
	public static void visibleMaskSet(ByteBuffer struct, int visibleMask) { struct.putInt(struct.position() + VISIBLEMASK, visibleMask); }
	public static void damageMaskSet(ByteBuffer struct, int damageMask) { struct.putInt(struct.position() + DAMAGEMASK, damageMask); }

	public static int sizeGet(ByteBuffer struct) { return struct.getShort(struct.position() + SIZE); }
	public static int versionGet(ByteBuffer struct) { return struct.getShort(struct.position() + VERSION); }
	public static int flagsGet(ByteBuffer struct) { return struct.getInt(struct.position() + FLAGS); }
	public static int pixelTypeGet(ByteBuffer struct) { return struct.get(struct.position() + PIXELTYPE); }
	public static int colorBitsGet(ByteBuffer struct) { return struct.get(struct.position() + COLORBITS); }
	public static int redBitsGet(ByteBuffer struct) { return struct.get(struct.position() + REDBITS); }
	public static int redShirtGet(ByteBuffer struct) { return struct.get(struct.position() + REDSHIRT); }
	public static int greenBitsGet(ByteBuffer struct) { return struct.get(struct.position() + GREENBITS); }
	public static int greenShiftGet(ByteBuffer struct) { return struct.get(struct.position() + GREENSHIFT); }
	public static int blueBitsGet(ByteBuffer struct) { return struct.get(struct.position() + BLUEBITS); }
	public static int blueShiftGet(ByteBuffer struct) { return struct.get(struct.position() + BLUESHIFT); }
	public static int alphaBitsGet(ByteBuffer struct) { return struct.get(struct.position() + ALPHABITS); }
	public static int alphaShiftGet(ByteBuffer struct) { return struct.get(struct.position() + ALPHASHIFT); }
	public static int accumBitsGet(ByteBuffer struct) { return struct.get(struct.position() + ACCUMBITS); }
	public static int accumRedBitsGet(ByteBuffer struct) { return struct.get(struct.position() + ACCUMREDBITS); }
	public static int accumGreenBitsGet(ByteBuffer struct) { return struct.get(struct.position() + ACCUMGREENBITS); }
	public static int accumBlueBitsGet(ByteBuffer struct) { return struct.get(struct.position() + ACCUMBLUEBITS); }
	public static int accumAlphaBitsGet(ByteBuffer struct) { return struct.get(struct.position() + ACCUMALPHABITS); }
	public static int depthBitsGet(ByteBuffer struct) { return struct.get(struct.position() + DEPTHBITS); }
	public static int stencilBitsGet(ByteBuffer struct) { return struct.get(struct.position() + STENCILBITS); }
	public static int auxBuffersGet(ByteBuffer struct) { return struct.get(struct.position() + AUXBUFFERS); }
	public static int layerTypeGet(ByteBuffer struct) { return struct.get(struct.position() + LAYERTYPE); }
	public static int reservedGet(ByteBuffer struct) { return struct.get(struct.position() + RESERVED); }
	public static int layerMaskGet(ByteBuffer struct) { return struct.getInt(struct.position() + LAYERMASK); }
	public static int visibleMaskGet(ByteBuffer struct) { return struct.getInt(struct.position() + VISIBLEMASK); }
	public static int damageMaskGet(ByteBuffer struct) { return struct.getInt(struct.position() + DAMAGEMASK); }

}