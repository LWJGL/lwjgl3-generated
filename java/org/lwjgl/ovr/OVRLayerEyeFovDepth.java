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
 * Describes a layer that specifies a monoscopic or stereoscopic view, with depth textures in addition to color textures. This is typically used to
 * support positional time warp. This struct is the same as {@link OVRLayerEyeFov}, but with the addition of {@code DepthTexture} and {@code ProjectionDesc}.
 */
public final class OVRLayerEyeFovDepth implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		FOV,
		RENDERPOSE,
		DEPTHTEXTURE,
		PROJECTIONDESC;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(7);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
		FOV = offsets.get(3);
		RENDERPOSE = offsets.get(4);
		DEPTHTEXTURE = offsets.get(5);
		PROJECTIONDESC = offsets.get(6);
	}

	private final ByteBuffer struct;

	public OVRLayerEyeFovDepth() {
		this(malloc());
	}

	public OVRLayerEyeFovDepth(ByteBuffer struct) {
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

	public void setHeader(ByteBuffer Header) { HeaderSet(struct, Header); }
	public void setHeaderType(int Type) { HeaderType(struct, Type); }
	public void setHeaderFlags(int Flags) { HeaderFlags(struct, Flags); }
	public void setColorTexture(ByteBuffer ColorTexture) { ColorTextureSet(struct, ColorTexture); }
	public void setColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureSet(struct, ColorTexture, index); }
	public void setViewport(ByteBuffer Viewport) { ViewportSet(struct, Viewport); }
	public void setViewport(ByteBuffer Viewport, int index) { ViewportSet(struct, Viewport, index); }
	public void setFov(ByteBuffer Fov) { FovSet(struct, Fov); }
	public void setFov(ByteBuffer Fov, int index) { FovSet(struct, Fov, index); }
	public void setRenderPose(ByteBuffer RenderPose) { RenderPoseSet(struct, RenderPose); }
	public void setRenderPose(ByteBuffer RenderPose, int index) { RenderPoseSet(struct, RenderPose, index); }
	public void setDepthTexture(ByteBuffer DepthTexture) { DepthTextureSet(struct, DepthTexture); }
	public void setDepthTexture(ByteBuffer DepthTexture, int index) { DepthTextureSet(struct, DepthTexture, index); }
	public void setProjectionDesc(ByteBuffer ProjectionDesc) { ProjectionDescSet(struct, ProjectionDesc); }
	public void setProjectionDescProjection22(float Projection22) { ProjectionDescProjection22(struct, Projection22); }
	public void setProjectionDescProjection23(float Projection23) { ProjectionDescProjection23(struct, Projection23); }
	public void setProjectionDescProjection32(float Projection32) { ProjectionDescProjection32(struct, Projection32); }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public void getColorTexture(ByteBuffer ColorTexture) { ColorTextureGet(struct, ColorTexture); }
	public void getColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureGet(struct, ColorTexture, index); }
	public void getViewport(ByteBuffer Viewport) { ViewportGet(struct, Viewport); }
	public void getViewport(ByteBuffer Viewport, int index) { ViewportGet(struct, Viewport, index); }
	public void getFov(ByteBuffer Fov) { FovGet(struct, Fov); }
	public void getFov(ByteBuffer Fov, int index) { FovGet(struct, Fov, index); }
	public void getRenderPose(ByteBuffer RenderPose) { RenderPoseGet(struct, RenderPose); }
	public void getRenderPose(ByteBuffer RenderPose, int index) { RenderPoseGet(struct, RenderPose, index); }
	public void getDepthTexture(ByteBuffer DepthTexture) { DepthTextureGet(struct, DepthTexture); }
	public void getDepthTexture(ByteBuffer DepthTexture, int index) { DepthTextureGet(struct, DepthTexture, index); }
	public void getProjectionDesc(ByteBuffer ProjectionDesc) { ProjectionDescGet(struct, ProjectionDesc); }
	public float getProjectionDescProjection22() { return ProjectionDescProjection22(struct); }
	public float getProjectionDescProjection23() { return ProjectionDescProjection23(struct); }
	public float getProjectionDescProjection32() { return ProjectionDescProjection32(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		ByteBuffer ColorTexture,
		ByteBuffer Viewport,
		ByteBuffer Fov,
		ByteBuffer RenderPose,
		ByteBuffer DepthTexture,
		ByteBuffer ProjectionDesc
	) {
		ByteBuffer ovrlayereyefovdepth = malloc();

		HeaderSet(ovrlayereyefovdepth, Header);
		ColorTextureSet(ovrlayereyefovdepth, ColorTexture);
		ViewportSet(ovrlayereyefovdepth, Viewport);
		FovSet(ovrlayereyefovdepth, Fov);
		RenderPoseSet(ovrlayereyefovdepth, RenderPose);
		DepthTextureSet(ovrlayereyefovdepth, DepthTexture);
		ProjectionDescSet(ovrlayereyefovdepth, ProjectionDesc);

		return ovrlayereyefovdepth;
	}

	public static void HeaderSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayereyefovdepth) + HEADER, OVRLayerHeader.SIZEOF); }
	public static void HeaderType(ByteBuffer ovrlayereyefovdepth, int Type) { ovrlayereyefovdepth.putInt(ovrlayereyefovdepth.position() + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void HeaderFlags(ByteBuffer ovrlayereyefovdepth, int Flags) { ovrlayereyefovdepth.putInt(ovrlayereyefovdepth.position() + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void ColorTextureSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayereyefovdepth) + COLORTEXTURE, ColorTexture.remaining());
	}
	public static void ColorTextureSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ColorTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayereyefovdepth) + COLORTEXTURE + index * OVRSwapTextureSet.SIZEOF, ColorTexture.remaining());
	}
	public static void ViewportSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayereyefovdepth) + VIEWPORT, Viewport.remaining());
	}
	public static void ViewportSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayereyefovdepth) + VIEWPORT + index * OVRRecti.SIZEOF, Viewport.remaining());
	}
	public static void FovSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayereyefovdepth) + FOV, Fov.remaining());
	}
	public static void FovSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayereyefovdepth) + FOV + index * OVRFovPort.SIZEOF, Fov.remaining());
	}
	public static void RenderPoseSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayereyefovdepth) + RENDERPOSE, RenderPose.remaining());
	}
	public static void RenderPoseSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayereyefovdepth) + RENDERPOSE + index * OVRPosef.SIZEOF, RenderPose.remaining());
	}
	public static void DepthTextureSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(DepthTexture), memAddress(ovrlayereyefovdepth) + DEPTHTEXTURE, DepthTexture.remaining());
	}
	public static void DepthTextureSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer DepthTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(DepthTexture), memAddress(ovrlayereyefovdepth) + DEPTHTEXTURE + index * OVRSwapTextureSet.SIZEOF, DepthTexture.remaining());
	}
	public static void ProjectionDescSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ProjectionDesc) { if ( ProjectionDesc != null ) memCopy(memAddress(ProjectionDesc), memAddress(ovrlayereyefovdepth) + PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }
	public static void ProjectionDescProjection22(ByteBuffer ovrlayereyefovdepth, float Projection22) { ovrlayereyefovdepth.putFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22, Projection22); }
	public static void ProjectionDescProjection23(ByteBuffer ovrlayereyefovdepth, float Projection23) { ovrlayereyefovdepth.putFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23, Projection23); }
	public static void ProjectionDescProjection32(ByteBuffer ovrlayereyefovdepth, float Projection32) { ovrlayereyefovdepth.putFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32, Projection32); }

	public static void HeaderGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayereyefovdepth) + HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int HeaderType(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getInt(ovrlayereyefovdepth.position() + HEADER + OVRLayerHeader.TYPE); }
	public static int HeaderFlags(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getInt(ovrlayereyefovdepth.position() + HEADER + OVRLayerHeader.FLAGS); }
	public static void ColorTextureGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining());
	}
	public static void ColorTextureGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ColorTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + COLORTEXTURE + index * OVRSwapTextureSet.SIZEOF, memAddress(ColorTexture), ColorTexture.remaining());
	}
	public static void ViewportGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void ViewportGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + VIEWPORT + index * OVRRecti.SIZEOF, memAddress(Viewport), Viewport.remaining());
	}
	public static void FovGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + FOV, memAddress(Fov), Fov.remaining());
	}
	public static void FovGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + FOV + index * OVRFovPort.SIZEOF, memAddress(Fov), Fov.remaining());
	}
	public static void RenderPoseGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void RenderPoseGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + RENDERPOSE + index * OVRPosef.SIZEOF, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void DepthTextureGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + DEPTHTEXTURE, memAddress(DepthTexture), DepthTexture.remaining());
	}
	public static void DepthTextureGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer DepthTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayereyefovdepth) + DEPTHTEXTURE + index * OVRSwapTextureSet.SIZEOF, memAddress(DepthTexture), DepthTexture.remaining());
	}
	public static void ProjectionDescGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ProjectionDesc) { if ( LWJGLUtil.CHECKS ) checkBuffer(ProjectionDesc, OVRTimewarpProjectionDesc.SIZEOF); memCopy(memAddress(ovrlayereyefovdepth) + PROJECTIONDESC, memAddress(ProjectionDesc), OVRTimewarpProjectionDesc.SIZEOF); }
	public static float ProjectionDescProjection22(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22); }
	public static float ProjectionDescProjection23(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23); }
	public static float ProjectionDescProjection32(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32); }

}