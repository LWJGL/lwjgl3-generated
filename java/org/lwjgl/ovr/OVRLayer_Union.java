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

/** Union that combines ovrLayer types in a way that allows them to be used in a polymorphic way. */
public final class OVRLayer_Union implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		EYEFOV,
		EYEFOVDEPTH,
		QUAD,
		DIRECT;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		EYEFOV = offsets.get(1);
		EYEFOVDEPTH = offsets.get(2);
		QUAD = offsets.get(3);
		DIRECT = offsets.get(4);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRLayer_Union() {
		this(malloc());
	}

	public OVRLayer_Union(ByteBuffer struct) {
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

	public OVRLayer_Union setHeader(ByteBuffer Header) { HeaderSet(struct, Header); return this; }
	public OVRLayer_Union setHeaderType(int Type) { HeaderType(struct, Type); return this; }
	public OVRLayer_Union setHeaderFlags(int Flags) { HeaderFlags(struct, Flags); return this; }
	public OVRLayer_Union setEyeFov(ByteBuffer EyeFov) { EyeFovSet(struct, EyeFov); return this; }
	public OVRLayer_Union setEyeFovHeader(ByteBuffer Header) { EyeFovHeaderSet(struct, Header); return this; }
	public OVRLayer_Union setEyeFovHeaderType(int Type) { EyeFovHeaderType(struct, Type); return this; }
	public OVRLayer_Union setEyeFovHeaderFlags(int Flags) { EyeFovHeaderFlags(struct, Flags); return this; }
	public OVRLayer_Union setEyeFovColorTexture(PointerBuffer ColorTexture) { EyeFovColorTextureSet(struct, ColorTexture); return this; }
	public OVRLayer_Union setEyeFovColorTexture(ByteBuffer ColorTexture, int index) { EyeFovColorTextureSet(struct, ColorTexture, index); return this; }
	public OVRLayer_Union setEyeFovViewport(ByteBuffer Viewport) { EyeFovViewportSet(struct, Viewport); return this; }
	public OVRLayer_Union setEyeFovViewport(ByteBuffer Viewport, int index) { EyeFovViewportSet(struct, Viewport, index); return this; }
	public OVRLayer_Union setEyeFovFov(ByteBuffer Fov) { EyeFovFovSet(struct, Fov); return this; }
	public OVRLayer_Union setEyeFovFov(ByteBuffer Fov, int index) { EyeFovFovSet(struct, Fov, index); return this; }
	public OVRLayer_Union setEyeFovRenderPose(ByteBuffer RenderPose) { EyeFovRenderPoseSet(struct, RenderPose); return this; }
	public OVRLayer_Union setEyeFovRenderPose(ByteBuffer RenderPose, int index) { EyeFovRenderPoseSet(struct, RenderPose, index); return this; }
	public OVRLayer_Union setEyeFovDepth(ByteBuffer EyeFovDepth) { EyeFovDepthSet(struct, EyeFovDepth); return this; }
	public OVRLayer_Union setEyeFovDepthHeader(ByteBuffer Header) { EyeFovDepthHeaderSet(struct, Header); return this; }
	public OVRLayer_Union setEyeFovDepthHeaderType(int Type) { EyeFovDepthHeaderType(struct, Type); return this; }
	public OVRLayer_Union setEyeFovDepthHeaderFlags(int Flags) { EyeFovDepthHeaderFlags(struct, Flags); return this; }
	public OVRLayer_Union setEyeFovDepthColorTexture(PointerBuffer ColorTexture) { EyeFovDepthColorTextureSet(struct, ColorTexture); return this; }
	public OVRLayer_Union setEyeFovDepthColorTexture(ByteBuffer ColorTexture, int index) { EyeFovDepthColorTextureSet(struct, ColorTexture, index); return this; }
	public OVRLayer_Union setEyeFovDepthViewport(ByteBuffer Viewport) { EyeFovDepthViewportSet(struct, Viewport); return this; }
	public OVRLayer_Union setEyeFovDepthViewport(ByteBuffer Viewport, int index) { EyeFovDepthViewportSet(struct, Viewport, index); return this; }
	public OVRLayer_Union setEyeFovDepthFov(ByteBuffer Fov) { EyeFovDepthFovSet(struct, Fov); return this; }
	public OVRLayer_Union setEyeFovDepthFov(ByteBuffer Fov, int index) { EyeFovDepthFovSet(struct, Fov, index); return this; }
	public OVRLayer_Union setEyeFovDepthRenderPose(ByteBuffer RenderPose) { EyeFovDepthRenderPoseSet(struct, RenderPose); return this; }
	public OVRLayer_Union setEyeFovDepthRenderPose(ByteBuffer RenderPose, int index) { EyeFovDepthRenderPoseSet(struct, RenderPose, index); return this; }
	public OVRLayer_Union setEyeFovDepthDepthTexture(PointerBuffer DepthTexture) { EyeFovDepthDepthTextureSet(struct, DepthTexture); return this; }
	public OVRLayer_Union setEyeFovDepthDepthTexture(ByteBuffer DepthTexture, int index) { EyeFovDepthDepthTextureSet(struct, DepthTexture, index); return this; }
	public OVRLayer_Union setEyeFovDepthProjectionDesc(ByteBuffer ProjectionDesc) { EyeFovDepthProjectionDescSet(struct, ProjectionDesc); return this; }
	public OVRLayer_Union setEyeFovDepthProjectionDescProjection22(float Projection22) { EyeFovDepthProjectionDescProjection22(struct, Projection22); return this; }
	public OVRLayer_Union setEyeFovDepthProjectionDescProjection23(float Projection23) { EyeFovDepthProjectionDescProjection23(struct, Projection23); return this; }
	public OVRLayer_Union setEyeFovDepthProjectionDescProjection32(float Projection32) { EyeFovDepthProjectionDescProjection32(struct, Projection32); return this; }
	public OVRLayer_Union setQuad(ByteBuffer Quad) { QuadSet(struct, Quad); return this; }
	public OVRLayer_Union setQuadHeader(ByteBuffer Header) { QuadHeaderSet(struct, Header); return this; }
	public OVRLayer_Union setQuadHeaderType(int Type) { QuadHeaderType(struct, Type); return this; }
	public OVRLayer_Union setQuadHeaderFlags(int Flags) { QuadHeaderFlags(struct, Flags); return this; }
	public OVRLayer_Union setQuadColorTexture(long ColorTexture) { QuadColorTexture(struct, ColorTexture); return this; }
	public OVRLayer_Union setQuadColorTexture(ByteBuffer ColorTexture) { QuadColorTexture(struct, ColorTexture); return this; }
	public OVRLayer_Union setQuadViewport(ByteBuffer Viewport) { QuadViewportSet(struct, Viewport); return this; }
	public OVRLayer_Union setQuadViewportPos(ByteBuffer Pos) { QuadViewportPosSet(struct, Pos); return this; }
	public OVRLayer_Union setQuadViewportPosX(int x) { QuadViewportPosX(struct, x); return this; }
	public OVRLayer_Union setQuadViewportPosY(int y) { QuadViewportPosY(struct, y); return this; }
	public OVRLayer_Union setQuadViewportSize(ByteBuffer Size) { QuadViewportSizeSet(struct, Size); return this; }
	public OVRLayer_Union setQuadViewportSizeW(int w) { QuadViewportSizeW(struct, w); return this; }
	public OVRLayer_Union setQuadViewportSizeH(int h) { QuadViewportSizeH(struct, h); return this; }
	public OVRLayer_Union setQuadQuadPoseCenter(ByteBuffer QuadPoseCenter) { QuadQuadPoseCenterSet(struct, QuadPoseCenter); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterOrientation(ByteBuffer Orientation) { QuadQuadPoseCenterOrientationSet(struct, Orientation); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterOrientationX(float x) { QuadQuadPoseCenterOrientationX(struct, x); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterOrientationY(float y) { QuadQuadPoseCenterOrientationY(struct, y); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterOrientationZ(float z) { QuadQuadPoseCenterOrientationZ(struct, z); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterOrientationW(float w) { QuadQuadPoseCenterOrientationW(struct, w); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterPosition(ByteBuffer Position) { QuadQuadPoseCenterPositionSet(struct, Position); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterPositionX(float x) { QuadQuadPoseCenterPositionX(struct, x); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterPositionY(float y) { QuadQuadPoseCenterPositionY(struct, y); return this; }
	public OVRLayer_Union setQuadQuadPoseCenterPositionZ(float z) { QuadQuadPoseCenterPositionZ(struct, z); return this; }
	public OVRLayer_Union setQuadQuadSize(ByteBuffer QuadSize) { QuadQuadSizeSet(struct, QuadSize); return this; }
	public OVRLayer_Union setQuadQuadSizeX(float x) { QuadQuadSizeX(struct, x); return this; }
	public OVRLayer_Union setQuadQuadSizeY(float y) { QuadQuadSizeY(struct, y); return this; }
	public OVRLayer_Union setDirect(ByteBuffer Direct) { DirectSet(struct, Direct); return this; }
	public OVRLayer_Union setDirectHeader(ByteBuffer Header) { DirectHeaderSet(struct, Header); return this; }
	public OVRLayer_Union setDirectHeaderType(int Type) { DirectHeaderType(struct, Type); return this; }
	public OVRLayer_Union setDirectHeaderFlags(int Flags) { DirectHeaderFlags(struct, Flags); return this; }
	public OVRLayer_Union setDirectColorTexture(PointerBuffer ColorTexture) { DirectColorTextureSet(struct, ColorTexture); return this; }
	public OVRLayer_Union setDirectColorTexture(ByteBuffer ColorTexture, int index) { DirectColorTextureSet(struct, ColorTexture, index); return this; }
	public OVRLayer_Union setDirectViewport(ByteBuffer Viewport) { DirectViewportSet(struct, Viewport); return this; }
	public OVRLayer_Union setDirectViewport(ByteBuffer Viewport, int index) { DirectViewportSet(struct, Viewport, index); return this; }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public void getEyeFov(ByteBuffer EyeFov) { EyeFovGet(struct, EyeFov); }
	public void getEyeFovHeader(ByteBuffer Header) { EyeFovHeaderGet(struct, Header); }
	public int getEyeFovHeaderType() { return EyeFovHeaderType(struct); }
	public int getEyeFovHeaderFlags() { return EyeFovHeaderFlags(struct); }
	public void getEyeFovColorTexture(PointerBuffer ColorTexture) { EyeFovColorTextureGet(struct, ColorTexture); }
	public long getEyeFovColorTexture(int index) { return EyeFovColorTextureGet(struct, index); }
	public void getEyeFovViewport(ByteBuffer Viewport) { EyeFovViewportGet(struct, Viewport); }
	public void getEyeFovViewport(ByteBuffer Viewport, int index) { EyeFovViewportGet(struct, Viewport, index); }
	public void getEyeFovFov(ByteBuffer Fov) { EyeFovFovGet(struct, Fov); }
	public void getEyeFovFov(ByteBuffer Fov, int index) { EyeFovFovGet(struct, Fov, index); }
	public void getEyeFovRenderPose(ByteBuffer RenderPose) { EyeFovRenderPoseGet(struct, RenderPose); }
	public void getEyeFovRenderPose(ByteBuffer RenderPose, int index) { EyeFovRenderPoseGet(struct, RenderPose, index); }
	public void getEyeFovDepth(ByteBuffer EyeFovDepth) { EyeFovDepthGet(struct, EyeFovDepth); }
	public void getEyeFovDepthHeader(ByteBuffer Header) { EyeFovDepthHeaderGet(struct, Header); }
	public int getEyeFovDepthHeaderType() { return EyeFovDepthHeaderType(struct); }
	public int getEyeFovDepthHeaderFlags() { return EyeFovDepthHeaderFlags(struct); }
	public void getEyeFovDepthColorTexture(PointerBuffer ColorTexture) { EyeFovDepthColorTextureGet(struct, ColorTexture); }
	public long getEyeFovDepthColorTexture(int index) { return EyeFovDepthColorTextureGet(struct, index); }
	public void getEyeFovDepthViewport(ByteBuffer Viewport) { EyeFovDepthViewportGet(struct, Viewport); }
	public void getEyeFovDepthViewport(ByteBuffer Viewport, int index) { EyeFovDepthViewportGet(struct, Viewport, index); }
	public void getEyeFovDepthFov(ByteBuffer Fov) { EyeFovDepthFovGet(struct, Fov); }
	public void getEyeFovDepthFov(ByteBuffer Fov, int index) { EyeFovDepthFovGet(struct, Fov, index); }
	public void getEyeFovDepthRenderPose(ByteBuffer RenderPose) { EyeFovDepthRenderPoseGet(struct, RenderPose); }
	public void getEyeFovDepthRenderPose(ByteBuffer RenderPose, int index) { EyeFovDepthRenderPoseGet(struct, RenderPose, index); }
	public void getEyeFovDepthDepthTexture(PointerBuffer DepthTexture) { EyeFovDepthDepthTextureGet(struct, DepthTexture); }
	public long getEyeFovDepthDepthTexture(int index) { return EyeFovDepthDepthTextureGet(struct, index); }
	public void getEyeFovDepthProjectionDesc(ByteBuffer ProjectionDesc) { EyeFovDepthProjectionDescGet(struct, ProjectionDesc); }
	public float getEyeFovDepthProjectionDescProjection22() { return EyeFovDepthProjectionDescProjection22(struct); }
	public float getEyeFovDepthProjectionDescProjection23() { return EyeFovDepthProjectionDescProjection23(struct); }
	public float getEyeFovDepthProjectionDescProjection32() { return EyeFovDepthProjectionDescProjection32(struct); }
	public void getQuad(ByteBuffer Quad) { QuadGet(struct, Quad); }
	public void getQuadHeader(ByteBuffer Header) { QuadHeaderGet(struct, Header); }
	public int getQuadHeaderType() { return QuadHeaderType(struct); }
	public int getQuadHeaderFlags() { return QuadHeaderFlags(struct); }
	public long getQuadColorTexture() { return QuadColorTexture(struct); }
	public ByteBuffer getQuadColorTextureBuffer() { return QuadColorTextureBuffer(struct); }
	public void getQuadViewport(ByteBuffer Viewport) { QuadViewportGet(struct, Viewport); }
	public void getQuadViewportPos(ByteBuffer Pos) { QuadViewportPosGet(struct, Pos); }
	public int getQuadViewportPosX() { return QuadViewportPosX(struct); }
	public int getQuadViewportPosY() { return QuadViewportPosY(struct); }
	public void getQuadViewportSize(ByteBuffer Size) { QuadViewportSizeGet(struct, Size); }
	public int getQuadViewportSizeW() { return QuadViewportSizeW(struct); }
	public int getQuadViewportSizeH() { return QuadViewportSizeH(struct); }
	public void getQuadQuadPoseCenter(ByteBuffer QuadPoseCenter) { QuadQuadPoseCenterGet(struct, QuadPoseCenter); }
	public void getQuadQuadPoseCenterOrientation(ByteBuffer Orientation) { QuadQuadPoseCenterOrientationGet(struct, Orientation); }
	public float getQuadQuadPoseCenterOrientationX() { return QuadQuadPoseCenterOrientationX(struct); }
	public float getQuadQuadPoseCenterOrientationY() { return QuadQuadPoseCenterOrientationY(struct); }
	public float getQuadQuadPoseCenterOrientationZ() { return QuadQuadPoseCenterOrientationZ(struct); }
	public float getQuadQuadPoseCenterOrientationW() { return QuadQuadPoseCenterOrientationW(struct); }
	public void getQuadQuadPoseCenterPosition(ByteBuffer Position) { QuadQuadPoseCenterPositionGet(struct, Position); }
	public float getQuadQuadPoseCenterPositionX() { return QuadQuadPoseCenterPositionX(struct); }
	public float getQuadQuadPoseCenterPositionY() { return QuadQuadPoseCenterPositionY(struct); }
	public float getQuadQuadPoseCenterPositionZ() { return QuadQuadPoseCenterPositionZ(struct); }
	public void getQuadQuadSize(ByteBuffer QuadSize) { QuadQuadSizeGet(struct, QuadSize); }
	public float getQuadQuadSizeX() { return QuadQuadSizeX(struct); }
	public float getQuadQuadSizeY() { return QuadQuadSizeY(struct); }
	public void getDirect(ByteBuffer Direct) { DirectGet(struct, Direct); }
	public void getDirectHeader(ByteBuffer Header) { DirectHeaderGet(struct, Header); }
	public int getDirectHeaderType() { return DirectHeaderType(struct); }
	public int getDirectHeaderFlags() { return DirectHeaderFlags(struct); }
	public void getDirectColorTexture(PointerBuffer ColorTexture) { DirectColorTextureGet(struct, ColorTexture); }
	public long getDirectColorTexture(int index) { return DirectColorTextureGet(struct, index); }
	public void getDirectViewport(ByteBuffer Viewport) { DirectViewportGet(struct, Viewport); }
	public void getDirectViewport(ByteBuffer Viewport, int index) { DirectViewportGet(struct, Viewport, index); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		ByteBuffer EyeFov,
		ByteBuffer EyeFovDepth,
		ByteBuffer Quad,
		ByteBuffer Direct
	) {
		ByteBuffer ovrlayer_union = malloc();

		HeaderSet(ovrlayer_union, Header);
		EyeFovSet(ovrlayer_union, EyeFov);
		EyeFovDepthSet(ovrlayer_union, EyeFovDepth);
		QuadSet(ovrlayer_union, Quad);
		DirectSet(ovrlayer_union, Direct);

		return ovrlayer_union;
	}

	public static void HeaderSet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayer_union) + HEADER, OVRLayerHeader.SIZEOF); }
	public static void HeaderType(ByteBuffer ovrlayer_union, int Type) { ovrlayer_union.putInt(ovrlayer_union.position() + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void HeaderFlags(ByteBuffer ovrlayer_union, int Flags) { ovrlayer_union.putInt(ovrlayer_union.position() + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void EyeFovSet(ByteBuffer ovrlayer_union, ByteBuffer EyeFov) { if ( EyeFov != null ) memCopy(memAddress(EyeFov), memAddress(ovrlayer_union) + EYEFOV, OVRLayerEyeFov.SIZEOF); }
	public static void EyeFovHeaderSet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.HEADER, OVRLayerHeader.SIZEOF); }
	public static void EyeFovHeaderType(ByteBuffer ovrlayer_union, int Type) { ovrlayer_union.putInt(ovrlayer_union.position() + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void EyeFovHeaderFlags(ByteBuffer ovrlayer_union, int Flags) { ovrlayer_union.putInt(ovrlayer_union.position() + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void EyeFovColorTextureSet(ByteBuffer ovrlayer_union, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void EyeFovColorTextureSet(ByteBuffer ovrlayer_union, ByteBuffer ColorTexture, int index) {
		PointerBuffer.put(ovrlayer_union, EYEFOV + OVRLayerEyeFov.COLORTEXTURE + index * POINTER_SIZE, memAddress(ColorTexture));
	}
	public static void EyeFovViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.VIEWPORT, Viewport.remaining());
	}
	public static void EyeFovViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.VIEWPORT + index * OVRRecti.SIZEOF, Viewport.remaining());
	}
	public static void EyeFovFovSet(ByteBuffer ovrlayer_union, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.FOV, Fov.remaining());
	}
	public static void EyeFovFovSet(ByteBuffer ovrlayer_union, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.FOV + index * OVRFovPort.SIZEOF, Fov.remaining());
	}
	public static void EyeFovRenderPoseSet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.RENDERPOSE, RenderPose.remaining());
	}
	public static void EyeFovRenderPoseSet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.RENDERPOSE + index * OVRPosef.SIZEOF, RenderPose.remaining());
	}
	public static void EyeFovDepthSet(ByteBuffer ovrlayer_union, ByteBuffer EyeFovDepth) { if ( EyeFovDepth != null ) memCopy(memAddress(EyeFovDepth), memAddress(ovrlayer_union) + EYEFOVDEPTH, OVRLayerEyeFovDepth.SIZEOF); }
	public static void EyeFovDepthHeaderSet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER, OVRLayerHeader.SIZEOF); }
	public static void EyeFovDepthHeaderType(ByteBuffer ovrlayer_union, int Type) { ovrlayer_union.putInt(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void EyeFovDepthHeaderFlags(ByteBuffer ovrlayer_union, int Flags) { ovrlayer_union.putInt(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void EyeFovDepthColorTextureSet(ByteBuffer ovrlayer_union, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void EyeFovDepthColorTextureSet(ByteBuffer ovrlayer_union, ByteBuffer ColorTexture, int index) {
		PointerBuffer.put(ovrlayer_union, EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE + index * POINTER_SIZE, memAddress(ColorTexture));
	}
	public static void EyeFovDepthViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT, Viewport.remaining());
	}
	public static void EyeFovDepthViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT + index * OVRRecti.SIZEOF, Viewport.remaining());
	}
	public static void EyeFovDepthFovSet(ByteBuffer ovrlayer_union, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV, Fov.remaining());
	}
	public static void EyeFovDepthFovSet(ByteBuffer ovrlayer_union, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV + index * OVRFovPort.SIZEOF, Fov.remaining());
	}
	public static void EyeFovDepthRenderPoseSet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE, RenderPose.remaining());
	}
	public static void EyeFovDepthRenderPoseSet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE + index * OVRPosef.SIZEOF, RenderPose.remaining());
	}
	public static void EyeFovDepthDepthTextureSet(ByteBuffer ovrlayer_union, PointerBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(memAddress(DepthTexture), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE, DepthTexture.remaining() * POINTER_SIZE);
	}
	public static void EyeFovDepthDepthTextureSet(ByteBuffer ovrlayer_union, ByteBuffer DepthTexture, int index) {
		PointerBuffer.put(ovrlayer_union, EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE + index * POINTER_SIZE, memAddress(DepthTexture));
	}
	public static void EyeFovDepthProjectionDescSet(ByteBuffer ovrlayer_union, ByteBuffer ProjectionDesc) { if ( ProjectionDesc != null ) memCopy(memAddress(ProjectionDesc), memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }
	public static void EyeFovDepthProjectionDescProjection22(ByteBuffer ovrlayer_union, float Projection22) { ovrlayer_union.putFloat(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22, Projection22); }
	public static void EyeFovDepthProjectionDescProjection23(ByteBuffer ovrlayer_union, float Projection23) { ovrlayer_union.putFloat(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23, Projection23); }
	public static void EyeFovDepthProjectionDescProjection32(ByteBuffer ovrlayer_union, float Projection32) { ovrlayer_union.putFloat(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32, Projection32); }
	public static void QuadSet(ByteBuffer ovrlayer_union, ByteBuffer Quad) { if ( Quad != null ) memCopy(memAddress(Quad), memAddress(ovrlayer_union) + QUAD, OVRLayerQuad.SIZEOF); }
	public static void QuadHeaderSet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.HEADER, OVRLayerHeader.SIZEOF); }
	public static void QuadHeaderType(ByteBuffer ovrlayer_union, int Type) { ovrlayer_union.putInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void QuadHeaderFlags(ByteBuffer ovrlayer_union, int Flags) { ovrlayer_union.putInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void QuadColorTexture(ByteBuffer ovrlayer_union, long ColorTexture) { PointerBuffer.put(ovrlayer_union, ovrlayer_union.position() + QUAD + OVRLayerQuad.COLORTEXTURE, ColorTexture); }
	public static void QuadColorTexture(ByteBuffer ovrlayer_union, ByteBuffer ColorTexture) { QuadColorTexture(ovrlayer_union, memAddressSafe(ColorTexture)); }
	public static void QuadViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) { if ( Viewport != null ) memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.VIEWPORT, OVRRecti.SIZEOF); }
	public static void QuadViewportPosSet(ByteBuffer ovrlayer_union, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void QuadViewportPosX(ByteBuffer ovrlayer_union, int x) { ovrlayer_union.putInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void QuadViewportPosY(ByteBuffer ovrlayer_union, int y) { ovrlayer_union.putInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void QuadViewportSizeSet(ByteBuffer ovrlayer_union, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void QuadViewportSizeW(ByteBuffer ovrlayer_union, int w) { ovrlayer_union.putInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void QuadViewportSizeH(ByteBuffer ovrlayer_union, int h) { ovrlayer_union.putInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void QuadQuadPoseCenterSet(ByteBuffer ovrlayer_union, ByteBuffer QuadPoseCenter) { if ( QuadPoseCenter != null ) memCopy(memAddress(QuadPoseCenter), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADPOSECENTER, OVRPosef.SIZEOF); }
	public static void QuadQuadPoseCenterOrientationSet(ByteBuffer ovrlayer_union, ByteBuffer Orientation) { if ( Orientation != null ) memCopy(memAddress(Orientation), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	public static void QuadQuadPoseCenterOrientationX(ByteBuffer ovrlayer_union, float x) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void QuadQuadPoseCenterOrientationY(ByteBuffer ovrlayer_union, float y) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void QuadQuadPoseCenterOrientationZ(ByteBuffer ovrlayer_union, float z) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void QuadQuadPoseCenterOrientationW(ByteBuffer ovrlayer_union, float w) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void QuadQuadPoseCenterPositionSet(ByteBuffer ovrlayer_union, ByteBuffer Position) { if ( Position != null ) memCopy(memAddress(Position), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	public static void QuadQuadPoseCenterPositionX(ByteBuffer ovrlayer_union, float x) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void QuadQuadPoseCenterPositionY(ByteBuffer ovrlayer_union, float y) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void QuadQuadPoseCenterPositionZ(ByteBuffer ovrlayer_union, float z) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void QuadQuadSizeSet(ByteBuffer ovrlayer_union, ByteBuffer QuadSize) { if ( QuadSize != null ) memCopy(memAddress(QuadSize), memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADSIZE, OVRVector2f.SIZEOF); }
	public static void QuadQuadSizeX(ByteBuffer ovrlayer_union, float x) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.X, x); }
	public static void QuadQuadSizeY(ByteBuffer ovrlayer_union, float y) { ovrlayer_union.putFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.Y, y); }
	public static void DirectSet(ByteBuffer ovrlayer_union, ByteBuffer Direct) { if ( Direct != null ) memCopy(memAddress(Direct), memAddress(ovrlayer_union) + DIRECT, OVRLayerDirect.SIZEOF); }
	public static void DirectHeaderSet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.HEADER, OVRLayerHeader.SIZEOF); }
	public static void DirectHeaderType(ByteBuffer ovrlayer_union, int Type) { ovrlayer_union.putInt(ovrlayer_union.position() + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void DirectHeaderFlags(ByteBuffer ovrlayer_union, int Flags) { ovrlayer_union.putInt(ovrlayer_union.position() + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void DirectColorTextureSet(ByteBuffer ovrlayer_union, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void DirectColorTextureSet(ByteBuffer ovrlayer_union, ByteBuffer ColorTexture, int index) {
		PointerBuffer.put(ovrlayer_union, DIRECT + OVRLayerDirect.COLORTEXTURE + index * POINTER_SIZE, memAddress(ColorTexture));
	}
	public static void DirectViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.VIEWPORT, Viewport.remaining());
	}
	public static void DirectViewportSet(ByteBuffer ovrlayer_union, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.VIEWPORT + index * OVRRecti.SIZEOF, Viewport.remaining());
	}

	public static void HeaderGet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayer_union) + HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int HeaderType(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + HEADER + OVRLayerHeader.TYPE); }
	public static int HeaderFlags(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + HEADER + OVRLayerHeader.FLAGS); }
	public static void EyeFovGet(ByteBuffer ovrlayer_union, ByteBuffer EyeFov) { if ( LWJGLUtil.CHECKS ) checkBuffer(EyeFov, OVRLayerEyeFov.SIZEOF); memCopy(memAddress(ovrlayer_union) + EYEFOV, memAddress(EyeFov), OVRLayerEyeFov.SIZEOF); }
	public static void EyeFovHeaderGet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int EyeFovHeaderType(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.TYPE); }
	public static int EyeFovHeaderFlags(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.FLAGS); }
	public static void EyeFovColorTextureGet(ByteBuffer ovrlayer_union, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static long EyeFovColorTextureGet(ByteBuffer ovrlayer_union, int index) {
		return PointerBuffer.get(ovrlayer_union, EYEFOV + OVRLayerEyeFov.COLORTEXTURE + index * POINTER_SIZE);
	}
	public static void EyeFovViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void EyeFovViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.VIEWPORT + index * OVRRecti.SIZEOF, memAddress(Viewport), Viewport.remaining());
	}
	public static void EyeFovFovGet(ByteBuffer ovrlayer_union, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.FOV, memAddress(Fov), Fov.remaining());
	}
	public static void EyeFovFovGet(ByteBuffer ovrlayer_union, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.FOV + index * OVRFovPort.SIZEOF, memAddress(Fov), Fov.remaining());
	}
	public static void EyeFovRenderPoseGet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void EyeFovRenderPoseGet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOV + OVRLayerEyeFov.RENDERPOSE + index * OVRPosef.SIZEOF, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void EyeFovDepthGet(ByteBuffer ovrlayer_union, ByteBuffer EyeFovDepth) { if ( LWJGLUtil.CHECKS ) checkBuffer(EyeFovDepth, OVRLayerEyeFovDepth.SIZEOF); memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH, memAddress(EyeFovDepth), OVRLayerEyeFovDepth.SIZEOF); }
	public static void EyeFovDepthHeaderGet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int EyeFovDepthHeaderType(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.TYPE); }
	public static int EyeFovDepthHeaderFlags(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.FLAGS); }
	public static void EyeFovDepthColorTextureGet(ByteBuffer ovrlayer_union, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static long EyeFovDepthColorTextureGet(ByteBuffer ovrlayer_union, int index) {
		return PointerBuffer.get(ovrlayer_union, EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE + index * POINTER_SIZE);
	}
	public static void EyeFovDepthViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void EyeFovDepthViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT + index * OVRRecti.SIZEOF, memAddress(Viewport), Viewport.remaining());
	}
	public static void EyeFovDepthFovGet(ByteBuffer ovrlayer_union, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV, memAddress(Fov), Fov.remaining());
	}
	public static void EyeFovDepthFovGet(ByteBuffer ovrlayer_union, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV + index * OVRFovPort.SIZEOF, memAddress(Fov), Fov.remaining());
	}
	public static void EyeFovDepthRenderPoseGet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void EyeFovDepthRenderPoseGet(ByteBuffer ovrlayer_union, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE + index * OVRPosef.SIZEOF, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void EyeFovDepthDepthTextureGet(ByteBuffer ovrlayer_union, PointerBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE, memAddress(DepthTexture), DepthTexture.remaining() * POINTER_SIZE);
	}
	public static long EyeFovDepthDepthTextureGet(ByteBuffer ovrlayer_union, int index) {
		return PointerBuffer.get(ovrlayer_union, EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE + index * POINTER_SIZE);
	}
	public static void EyeFovDepthProjectionDescGet(ByteBuffer ovrlayer_union, ByteBuffer ProjectionDesc) { if ( LWJGLUtil.CHECKS ) checkBuffer(ProjectionDesc, OVRTimewarpProjectionDesc.SIZEOF); memCopy(memAddress(ovrlayer_union) + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC, memAddress(ProjectionDesc), OVRTimewarpProjectionDesc.SIZEOF); }
	public static float EyeFovDepthProjectionDescProjection22(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22); }
	public static float EyeFovDepthProjectionDescProjection23(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23); }
	public static float EyeFovDepthProjectionDescProjection32(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32); }
	public static void QuadGet(ByteBuffer ovrlayer_union, ByteBuffer Quad) { if ( LWJGLUtil.CHECKS ) checkBuffer(Quad, OVRLayerQuad.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD, memAddress(Quad), OVRLayerQuad.SIZEOF); }
	public static void QuadHeaderGet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int QuadHeaderType(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.TYPE); }
	public static int QuadHeaderFlags(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.FLAGS); }
	public static long QuadColorTexture(ByteBuffer ovrlayer_union) { return PointerBuffer.get(ovrlayer_union, ovrlayer_union.position() + QUAD + OVRLayerQuad.COLORTEXTURE); }
	public static ByteBuffer QuadColorTextureBuffer(ByteBuffer ovrlayer_union) { return memByteBuffer(QuadColorTexture(ovrlayer_union), OVRSwapTextureSet.SIZEOF); }
	public static void QuadViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) { if ( LWJGLUtil.CHECKS ) checkBuffer(Viewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.VIEWPORT, memAddress(Viewport), OVRRecti.SIZEOF); }
	public static void QuadViewportPosGet(ByteBuffer ovrlayer_union, ByteBuffer Pos) { if ( LWJGLUtil.CHECKS ) checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int QuadViewportPosX(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int QuadViewportPosY(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void QuadViewportSizeGet(ByteBuffer ovrlayer_union, ByteBuffer Size) { if ( LWJGLUtil.CHECKS ) checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int QuadViewportSizeW(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int QuadViewportSizeH(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static void QuadQuadPoseCenterGet(ByteBuffer ovrlayer_union, ByteBuffer QuadPoseCenter) { if ( LWJGLUtil.CHECKS ) checkBuffer(QuadPoseCenter, OVRPosef.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADPOSECENTER, memAddress(QuadPoseCenter), OVRPosef.SIZEOF); }
	public static void QuadQuadPoseCenterOrientationGet(ByteBuffer ovrlayer_union, ByteBuffer Orientation) { if ( LWJGLUtil.CHECKS ) checkBuffer(Orientation, OVRQuatf.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION, memAddress(Orientation), OVRQuatf.SIZEOF); }
	public static float QuadQuadPoseCenterOrientationX(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float QuadQuadPoseCenterOrientationY(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float QuadQuadPoseCenterOrientationZ(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float QuadQuadPoseCenterOrientationW(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static void QuadQuadPoseCenterPositionGet(ByteBuffer ovrlayer_union, ByteBuffer Position) { if ( LWJGLUtil.CHECKS ) checkBuffer(Position, OVRVector3f.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION, memAddress(Position), OVRVector3f.SIZEOF); }
	public static float QuadQuadPoseCenterPositionX(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X); }
	public static float QuadQuadPoseCenterPositionY(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float QuadQuadPoseCenterPositionZ(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z); }
	public static void QuadQuadSizeGet(ByteBuffer ovrlayer_union, ByteBuffer QuadSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(QuadSize, OVRVector2f.SIZEOF); memCopy(memAddress(ovrlayer_union) + QUAD + OVRLayerQuad.QUADSIZE, memAddress(QuadSize), OVRVector2f.SIZEOF); }
	public static float QuadQuadSizeX(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.X); }
	public static float QuadQuadSizeY(ByteBuffer ovrlayer_union) { return ovrlayer_union.getFloat(ovrlayer_union.position() + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.Y); }
	public static void DirectGet(ByteBuffer ovrlayer_union, ByteBuffer Direct) { if ( LWJGLUtil.CHECKS ) checkBuffer(Direct, OVRLayerDirect.SIZEOF); memCopy(memAddress(ovrlayer_union) + DIRECT, memAddress(Direct), OVRLayerDirect.SIZEOF); }
	public static void DirectHeaderGet(ByteBuffer ovrlayer_union, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int DirectHeaderType(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.TYPE); }
	public static int DirectHeaderFlags(ByteBuffer ovrlayer_union) { return ovrlayer_union.getInt(ovrlayer_union.position() + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.FLAGS); }
	public static void DirectColorTextureGet(ByteBuffer ovrlayer_union, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static long DirectColorTextureGet(ByteBuffer ovrlayer_union, int index) {
		return PointerBuffer.get(ovrlayer_union, DIRECT + OVRLayerDirect.COLORTEXTURE + index * POINTER_SIZE);
	}
	public static void DirectViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void DirectViewportGet(ByteBuffer ovrlayer_union, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayer_union) + DIRECT + OVRLayerDirect.VIEWPORT + index * OVRRecti.SIZEOF, memAddress(Viewport), Viewport.remaining());
	}

}