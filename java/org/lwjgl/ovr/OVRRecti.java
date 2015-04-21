/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A 2D rectangle with a position and size. All components are integers. */
public final class OVRRecti implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		POS,
		SIZE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		POS = offsets.get(0);
		SIZE = offsets.get(1);
	}

	private final ByteBuffer struct;

	public OVRRecti() {
		this(malloc());
	}

	public OVRRecti(ByteBuffer struct) {
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

	public void setPos(ByteBuffer Pos) { PosSet(struct, Pos); }
	public void setPosX(int x) { PosX(struct, x); }
	public void setPosY(int y) { PosY(struct, y); }
	public void setSize(ByteBuffer Size) { SizeSet(struct, Size); }
	public void setSizeW(int w) { SizeW(struct, w); }
	public void setSizeH(int h) { SizeH(struct, h); }

	public void getPos(ByteBuffer Pos) { PosGet(struct, Pos); }
	public int getPosX() { return PosX(struct); }
	public int getPosY() { return PosY(struct); }
	public void getSize(ByteBuffer Size) { SizeGet(struct, Size); }
	public int getSizeW() { return SizeW(struct); }
	public int getSizeH() { return SizeH(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Pos,
		ByteBuffer Size
	) {
		ByteBuffer ovrrecti = malloc();

		PosSet(ovrrecti, Pos);
		SizeSet(ovrrecti, Size);

		return ovrrecti;
	}

	public static void PosSet(ByteBuffer ovrrecti, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrrecti) + POS, OVRVector2i.SIZEOF); }
	public static void PosX(ByteBuffer ovrrecti, int x) { ovrrecti.putInt(ovrrecti.position() + POS + OVRVector2i.X, x); }
	public static void PosY(ByteBuffer ovrrecti, int y) { ovrrecti.putInt(ovrrecti.position() + POS + OVRVector2i.Y, y); }
	public static void SizeSet(ByteBuffer ovrrecti, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrrecti) + SIZE, OVRSizei.SIZEOF); }
	public static void SizeW(ByteBuffer ovrrecti, int w) { ovrrecti.putInt(ovrrecti.position() + SIZE + OVRSizei.W, w); }
	public static void SizeH(ByteBuffer ovrrecti, int h) { ovrrecti.putInt(ovrrecti.position() + SIZE + OVRSizei.H, h); }

	public static void PosGet(ByteBuffer ovrrecti, ByteBuffer Pos) { checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrrecti) + POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int PosX(ByteBuffer ovrrecti) { return ovrrecti.getInt(ovrrecti.position() + POS + OVRVector2i.X); }
	public static int PosY(ByteBuffer ovrrecti) { return ovrrecti.getInt(ovrrecti.position() + POS + OVRVector2i.Y); }
	public static void SizeGet(ByteBuffer ovrrecti, ByteBuffer Size) { checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrrecti) + SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int SizeW(ByteBuffer ovrrecti) { return ovrrecti.getInt(ovrrecti.position() + SIZE + OVRSizei.W); }
	public static int SizeH(ByteBuffer ovrrecti) { return ovrrecti.getInt(ovrrecti.position() + SIZE + OVRSizei.H); }

}