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

/**
 * Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both {@link OVR#ovrLayerType_QuadInWorld} and
 * {@link OVR#ovrLayerType_QuadHeadLocked}. This type of layer represents a single object placed in the world and not a stereo view of the world itself.
 * 
 * <p>A typical use of {@link OVR#ovrLayerType_QuadInWorld} is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
 * as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
 * fidelity of the GUI.</p>
 * 
 * <p>A use of {@link OVR#ovrLayerType_QuadHeadLocked} might be to implement a debug HUD visible in the HMD.</p>
 * 
 * <p>Quad layers are visible from both sides; they are not back-face culled.</p>
 */
public final class OVRLayerQuad implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		QUADPOSECENTER,
		QUADSIZE;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
		QUADPOSECENTER = offsets.get(3);
		QUADSIZE = offsets.get(4);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRLayerQuad() {
		this(malloc());
	}

	public OVRLayerQuad(ByteBuffer struct) {
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

	public OVRLayerQuad setHeader(ByteBuffer Header) { HeaderSet(struct, Header); return this; }
	public OVRLayerQuad setHeaderType(int Type) { HeaderType(struct, Type); return this; }
	public OVRLayerQuad setHeaderFlags(int Flags) { HeaderFlags(struct, Flags); return this; }
	public OVRLayerQuad setColorTexture(long ColorTexture) { ColorTexture(struct, ColorTexture); return this; }
	public OVRLayerQuad setColorTexture(ByteBuffer ColorTexture) { ColorTexture(struct, ColorTexture); return this; }
	public OVRLayerQuad setViewport(ByteBuffer Viewport) { ViewportSet(struct, Viewport); return this; }
	public OVRLayerQuad setViewportPos(ByteBuffer Pos) { ViewportPosSet(struct, Pos); return this; }
	public OVRLayerQuad setViewportPosX(int x) { ViewportPosX(struct, x); return this; }
	public OVRLayerQuad setViewportPosY(int y) { ViewportPosY(struct, y); return this; }
	public OVRLayerQuad setViewportSize(ByteBuffer Size) { ViewportSizeSet(struct, Size); return this; }
	public OVRLayerQuad setViewportSizeW(int w) { ViewportSizeW(struct, w); return this; }
	public OVRLayerQuad setViewportSizeH(int h) { ViewportSizeH(struct, h); return this; }
	public OVRLayerQuad setQuadPoseCenter(ByteBuffer QuadPoseCenter) { QuadPoseCenterSet(struct, QuadPoseCenter); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientation(ByteBuffer Orientation) { QuadPoseCenterOrientationSet(struct, Orientation); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationX(float x) { QuadPoseCenterOrientationX(struct, x); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationY(float y) { QuadPoseCenterOrientationY(struct, y); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationZ(float z) { QuadPoseCenterOrientationZ(struct, z); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationW(float w) { QuadPoseCenterOrientationW(struct, w); return this; }
	public OVRLayerQuad setQuadPoseCenterPosition(ByteBuffer Position) { QuadPoseCenterPositionSet(struct, Position); return this; }
	public OVRLayerQuad setQuadPoseCenterPositionX(float x) { QuadPoseCenterPositionX(struct, x); return this; }
	public OVRLayerQuad setQuadPoseCenterPositionY(float y) { QuadPoseCenterPositionY(struct, y); return this; }
	public OVRLayerQuad setQuadPoseCenterPositionZ(float z) { QuadPoseCenterPositionZ(struct, z); return this; }
	public OVRLayerQuad setQuadSize(ByteBuffer QuadSize) { QuadSizeSet(struct, QuadSize); return this; }
	public OVRLayerQuad setQuadSizeX(float x) { QuadSizeX(struct, x); return this; }
	public OVRLayerQuad setQuadSizeY(float y) { QuadSizeY(struct, y); return this; }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public long getColorTexture() { return ColorTexture(struct); }
	public ByteBuffer getColorTextureBuffer() { return ColorTextureBuffer(struct); }
	public void getViewport(ByteBuffer Viewport) { ViewportGet(struct, Viewport); }
	public void getViewportPos(ByteBuffer Pos) { ViewportPosGet(struct, Pos); }
	public int getViewportPosX() { return ViewportPosX(struct); }
	public int getViewportPosY() { return ViewportPosY(struct); }
	public void getViewportSize(ByteBuffer Size) { ViewportSizeGet(struct, Size); }
	public int getViewportSizeW() { return ViewportSizeW(struct); }
	public int getViewportSizeH() { return ViewportSizeH(struct); }
	public void getQuadPoseCenter(ByteBuffer QuadPoseCenter) { QuadPoseCenterGet(struct, QuadPoseCenter); }
	public void getQuadPoseCenterOrientation(ByteBuffer Orientation) { QuadPoseCenterOrientationGet(struct, Orientation); }
	public float getQuadPoseCenterOrientationX() { return QuadPoseCenterOrientationX(struct); }
	public float getQuadPoseCenterOrientationY() { return QuadPoseCenterOrientationY(struct); }
	public float getQuadPoseCenterOrientationZ() { return QuadPoseCenterOrientationZ(struct); }
	public float getQuadPoseCenterOrientationW() { return QuadPoseCenterOrientationW(struct); }
	public void getQuadPoseCenterPosition(ByteBuffer Position) { QuadPoseCenterPositionGet(struct, Position); }
	public float getQuadPoseCenterPositionX() { return QuadPoseCenterPositionX(struct); }
	public float getQuadPoseCenterPositionY() { return QuadPoseCenterPositionY(struct); }
	public float getQuadPoseCenterPositionZ() { return QuadPoseCenterPositionZ(struct); }
	public void getQuadSize(ByteBuffer QuadSize) { QuadSizeGet(struct, QuadSize); }
	public float getQuadSizeX() { return QuadSizeX(struct); }
	public float getQuadSizeY() { return QuadSizeY(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		ByteBuffer ColorTexture,
		ByteBuffer Viewport,
		ByteBuffer QuadPoseCenter,
		ByteBuffer QuadSize
	) {
		ByteBuffer ovrlayerquad = malloc();

		HeaderSet(ovrlayerquad, Header);
		ColorTexture(ovrlayerquad, ColorTexture);
		ViewportSet(ovrlayerquad, Viewport);
		QuadPoseCenterSet(ovrlayerquad, QuadPoseCenter);
		QuadSizeSet(ovrlayerquad, QuadSize);

		return ovrlayerquad;
	}

	public static void HeaderSet(ByteBuffer ovrlayerquad, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayerquad) + HEADER, OVRLayerHeader.SIZEOF); }
	public static void HeaderType(ByteBuffer ovrlayerquad, int Type) { ovrlayerquad.putInt(ovrlayerquad.position() + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void HeaderFlags(ByteBuffer ovrlayerquad, int Flags) { ovrlayerquad.putInt(ovrlayerquad.position() + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void ColorTexture(ByteBuffer ovrlayerquad, long ColorTexture) { PointerBuffer.put(ovrlayerquad, ovrlayerquad.position() + COLORTEXTURE, ColorTexture); }
	public static void ColorTexture(ByteBuffer ovrlayerquad, ByteBuffer ColorTexture) { ColorTexture(ovrlayerquad, memAddressSafe(ColorTexture)); }
	public static void ViewportSet(ByteBuffer ovrlayerquad, ByteBuffer Viewport) { if ( Viewport != null ) memCopy(memAddress(Viewport), memAddress(ovrlayerquad) + VIEWPORT, OVRRecti.SIZEOF); }
	public static void ViewportPosSet(ByteBuffer ovrlayerquad, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrlayerquad) + VIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void ViewportPosX(ByteBuffer ovrlayerquad, int x) { ovrlayerquad.putInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void ViewportPosY(ByteBuffer ovrlayerquad, int y) { ovrlayerquad.putInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void ViewportSizeSet(ByteBuffer ovrlayerquad, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrlayerquad) + VIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void ViewportSizeW(ByteBuffer ovrlayerquad, int w) { ovrlayerquad.putInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void ViewportSizeH(ByteBuffer ovrlayerquad, int h) { ovrlayerquad.putInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void QuadPoseCenterSet(ByteBuffer ovrlayerquad, ByteBuffer QuadPoseCenter) { if ( QuadPoseCenter != null ) memCopy(memAddress(QuadPoseCenter), memAddress(ovrlayerquad) + QUADPOSECENTER, OVRPosef.SIZEOF); }
	public static void QuadPoseCenterOrientationSet(ByteBuffer ovrlayerquad, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrlayerquad) + QUADPOSECENTER + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	public static void QuadPoseCenterOrientationX(ByteBuffer ovrlayerquad, float x) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void QuadPoseCenterOrientationY(ByteBuffer ovrlayerquad, float y) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void QuadPoseCenterOrientationZ(ByteBuffer ovrlayerquad, float z) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void QuadPoseCenterOrientationW(ByteBuffer ovrlayerquad, float w) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void QuadPoseCenterPositionSet(ByteBuffer ovrlayerquad, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrlayerquad) + QUADPOSECENTER + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	public static void QuadPoseCenterPositionX(ByteBuffer ovrlayerquad, float x) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void QuadPoseCenterPositionY(ByteBuffer ovrlayerquad, float y) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void QuadPoseCenterPositionZ(ByteBuffer ovrlayerquad, float z) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void QuadSizeSet(ByteBuffer ovrlayerquad, ByteBuffer QuadSize) { if ( QuadSize != null ) memCopy(memAddress(QuadSize), memAddress(ovrlayerquad) + QUADSIZE, OVRVector2f.SIZEOF); }
	public static void QuadSizeX(ByteBuffer ovrlayerquad, float x) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADSIZE + OVRVector2f.X, x); }
	public static void QuadSizeY(ByteBuffer ovrlayerquad, float y) { ovrlayerquad.putFloat(ovrlayerquad.position() + QUADSIZE + OVRVector2f.Y, y); }

	public static void HeaderGet(ByteBuffer ovrlayerquad, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayerquad) + HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int HeaderType(ByteBuffer ovrlayerquad) { return ovrlayerquad.getInt(ovrlayerquad.position() + HEADER + OVRLayerHeader.TYPE); }
	public static int HeaderFlags(ByteBuffer ovrlayerquad) { return ovrlayerquad.getInt(ovrlayerquad.position() + HEADER + OVRLayerHeader.FLAGS); }
	public static long ColorTexture(ByteBuffer ovrlayerquad) { return PointerBuffer.get(ovrlayerquad, ovrlayerquad.position() + COLORTEXTURE); }
	public static ByteBuffer ColorTextureBuffer(ByteBuffer ovrlayerquad) { return memByteBuffer(ColorTexture(ovrlayerquad), OVRSwapTextureSet.SIZEOF); }
	public static void ViewportGet(ByteBuffer ovrlayerquad, ByteBuffer Viewport) { if ( LWJGLUtil.CHECKS ) checkBuffer(Viewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrlayerquad) + VIEWPORT, memAddress(Viewport), OVRRecti.SIZEOF); }
	public static void ViewportPosGet(ByteBuffer ovrlayerquad, ByteBuffer Pos) { if ( LWJGLUtil.CHECKS ) checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrlayerquad) + VIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int ViewportPosX(ByteBuffer ovrlayerquad) { return ovrlayerquad.getInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int ViewportPosY(ByteBuffer ovrlayerquad) { return ovrlayerquad.getInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void ViewportSizeGet(ByteBuffer ovrlayerquad, ByteBuffer Size) { if ( LWJGLUtil.CHECKS ) checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrlayerquad) + VIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int ViewportSizeW(ByteBuffer ovrlayerquad) { return ovrlayerquad.getInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int ViewportSizeH(ByteBuffer ovrlayerquad) { return ovrlayerquad.getInt(ovrlayerquad.position() + VIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static void QuadPoseCenterGet(ByteBuffer ovrlayerquad, ByteBuffer QuadPoseCenter) { if ( LWJGLUtil.CHECKS ) checkBuffer(QuadPoseCenter, OVRPosef.SIZEOF); memCopy(memAddress(ovrlayerquad) + QUADPOSECENTER, memAddress(QuadPoseCenter), OVRPosef.SIZEOF); }
	public static void QuadPoseCenterOrientationGet(ByteBuffer ovrlayerquad, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrlayerquad) + QUADPOSECENTER + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float QuadPoseCenterOrientationX(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float QuadPoseCenterOrientationY(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float QuadPoseCenterOrientationZ(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float QuadPoseCenterOrientationW(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void QuadPoseCenterPositionGet(ByteBuffer ovrlayerquad, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrlayerquad) + QUADPOSECENTER + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float QuadPoseCenterPositionX(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X); }
	public static float QuadPoseCenterPositionY(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float QuadPoseCenterPositionZ(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void QuadSizeGet(ByteBuffer ovrlayerquad, ByteBuffer QuadSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(QuadSize, OVRVector2f.SIZEOF); memCopy(memAddress(ovrlayerquad) + QUADSIZE, memAddress(QuadSize), OVRVector2f.SIZEOF); }
	public static float QuadSizeX(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADSIZE + OVRVector2f.X); }
	public static float QuadSizeY(ByteBuffer ovrlayerquad) { return ovrlayerquad.getFloat(ovrlayerquad.position() + QUADSIZE + OVRVector2f.Y); }

}