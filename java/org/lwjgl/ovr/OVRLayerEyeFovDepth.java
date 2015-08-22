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
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
		FOV = offsets.get(3);
		RENDERPOSE = offsets.get(4);
		DEPTHTEXTURE = offsets.get(5);
		PROJECTIONDESC = offsets.get(6);

		memFree(offsets);
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

	public OVRLayerEyeFovDepth setHeader(ByteBuffer Header) { HeaderSet(struct, Header); return this; }
	public OVRLayerEyeFovDepth setHeaderType(int Type) { HeaderType(struct, Type); return this; }
	public OVRLayerEyeFovDepth setHeaderFlags(int Flags) { HeaderFlags(struct, Flags); return this; }
	public OVRLayerEyeFovDepth setColorTexture(PointerBuffer ColorTexture) { ColorTextureSet(struct, ColorTexture); return this; }
	public OVRLayerEyeFovDepth setColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureSet(struct, ColorTexture, index); return this; }
	public OVRLayerEyeFovDepth setViewport(ByteBuffer Viewport) { ViewportSet(struct, Viewport); return this; }
	public OVRLayerEyeFovDepth setViewport(ByteBuffer Viewport, int index) { ViewportSet(struct, Viewport, index); return this; }
	public OVRLayerEyeFovDepth setFov(ByteBuffer Fov) { FovSet(struct, Fov); return this; }
	public OVRLayerEyeFovDepth setFov(ByteBuffer Fov, int index) { FovSet(struct, Fov, index); return this; }
	public OVRLayerEyeFovDepth setRenderPose(ByteBuffer RenderPose) { RenderPoseSet(struct, RenderPose); return this; }
	public OVRLayerEyeFovDepth setRenderPose(ByteBuffer RenderPose, int index) { RenderPoseSet(struct, RenderPose, index); return this; }
	public OVRLayerEyeFovDepth setDepthTexture(PointerBuffer DepthTexture) { DepthTextureSet(struct, DepthTexture); return this; }
	public OVRLayerEyeFovDepth setDepthTexture(ByteBuffer DepthTexture, int index) { DepthTextureSet(struct, DepthTexture, index); return this; }
	public OVRLayerEyeFovDepth setProjectionDesc(ByteBuffer ProjectionDesc) { ProjectionDescSet(struct, ProjectionDesc); return this; }
	public OVRLayerEyeFovDepth setProjectionDescProjection22(float Projection22) { ProjectionDescProjection22(struct, Projection22); return this; }
	public OVRLayerEyeFovDepth setProjectionDescProjection23(float Projection23) { ProjectionDescProjection23(struct, Projection23); return this; }
	public OVRLayerEyeFovDepth setProjectionDescProjection32(float Projection32) { ProjectionDescProjection32(struct, Projection32); return this; }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public void getColorTexture(PointerBuffer ColorTexture) { ColorTextureGet(struct, ColorTexture); }
	public long getColorTexture(int index) { return ColorTextureGet(struct, index); }
	public void getViewport(ByteBuffer Viewport) { ViewportGet(struct, Viewport); }
	public void getViewport(ByteBuffer Viewport, int index) { ViewportGet(struct, Viewport, index); }
	public void getFov(ByteBuffer Fov) { FovGet(struct, Fov); }
	public void getFov(ByteBuffer Fov, int index) { FovGet(struct, Fov, index); }
	public void getRenderPose(ByteBuffer RenderPose) { RenderPoseGet(struct, RenderPose); }
	public void getRenderPose(ByteBuffer RenderPose, int index) { RenderPoseGet(struct, RenderPose, index); }
	public void getDepthTexture(PointerBuffer DepthTexture) { DepthTextureGet(struct, DepthTexture); }
	public long getDepthTexture(int index) { return DepthTextureGet(struct, index); }
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
		PointerBuffer ColorTexture,
		ByteBuffer Viewport,
		ByteBuffer Fov,
		ByteBuffer RenderPose,
		PointerBuffer DepthTexture,
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
	public static void ColorTextureSet(ByteBuffer ovrlayereyefovdepth, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayereyefovdepth) + COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void ColorTextureSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ColorTexture, int index) {
		PointerBuffer.put(ovrlayereyefovdepth, COLORTEXTURE + index * POINTER_SIZE, memAddress(ColorTexture));
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
	public static void DepthTextureSet(ByteBuffer ovrlayereyefovdepth, PointerBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(memAddress(DepthTexture), memAddress(ovrlayereyefovdepth) + DEPTHTEXTURE, DepthTexture.remaining() * POINTER_SIZE);
	}
	public static void DepthTextureSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer DepthTexture, int index) {
		PointerBuffer.put(ovrlayereyefovdepth, DEPTHTEXTURE + index * POINTER_SIZE, memAddress(DepthTexture));
	}
	public static void ProjectionDescSet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ProjectionDesc) { if ( ProjectionDesc != null ) memCopy(memAddress(ProjectionDesc), memAddress(ovrlayereyefovdepth) + PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }
	public static void ProjectionDescProjection22(ByteBuffer ovrlayereyefovdepth, float Projection22) { ovrlayereyefovdepth.putFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22, Projection22); }
	public static void ProjectionDescProjection23(ByteBuffer ovrlayereyefovdepth, float Projection23) { ovrlayereyefovdepth.putFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23, Projection23); }
	public static void ProjectionDescProjection32(ByteBuffer ovrlayereyefovdepth, float Projection32) { ovrlayereyefovdepth.putFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32, Projection32); }

	public static void HeaderGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayereyefovdepth) + HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int HeaderType(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getInt(ovrlayereyefovdepth.position() + HEADER + OVRLayerHeader.TYPE); }
	public static int HeaderFlags(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getInt(ovrlayereyefovdepth.position() + HEADER + OVRLayerHeader.FLAGS); }
	public static void ColorTextureGet(ByteBuffer ovrlayereyefovdepth, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ovrlayereyefovdepth) + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static long ColorTextureGet(ByteBuffer ovrlayereyefovdepth, int index) {
		return PointerBuffer.get(ovrlayereyefovdepth, COLORTEXTURE + index * POINTER_SIZE);
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
	public static void DepthTextureGet(ByteBuffer ovrlayereyefovdepth, PointerBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(memAddress(ovrlayereyefovdepth) + DEPTHTEXTURE, memAddress(DepthTexture), DepthTexture.remaining() * POINTER_SIZE);
	}
	public static long DepthTextureGet(ByteBuffer ovrlayereyefovdepth, int index) {
		return PointerBuffer.get(ovrlayereyefovdepth, DEPTHTEXTURE + index * POINTER_SIZE);
	}
	public static void ProjectionDescGet(ByteBuffer ovrlayereyefovdepth, ByteBuffer ProjectionDesc) { if ( LWJGLUtil.CHECKS ) checkBuffer(ProjectionDesc, OVRTimewarpProjectionDesc.SIZEOF); memCopy(memAddress(ovrlayereyefovdepth) + PROJECTIONDESC, memAddress(ProjectionDesc), OVRTimewarpProjectionDesc.SIZEOF); }
	public static float ProjectionDescProjection22(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22); }
	public static float ProjectionDescProjection23(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23); }
	public static float ProjectionDescProjection32(ByteBuffer ovrlayereyefovdepth) { return ovrlayereyefovdepth.getFloat(ovrlayereyefovdepth.position() + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32); }

}