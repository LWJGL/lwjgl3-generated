/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes a layer that specifies a monoscopic or stereoscopic view, with depth textures in addition to color textures. This is typically used to
 * support positional time warp. This struct is the same as {@link OVRLayerEyeFov}, but with the addition of {@code DepthTexture} and {@code ProjectionDesc}.
 */
public final class OVRLayerEyeFovDepth extends Struct {

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

	private static native int offsets(long buffer);

	OVRLayerEyeFovDepth(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerEyeFovDepth} instance at the specified memory address. */
	public OVRLayerEyeFovDepth(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerEyeFovDepth} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerEyeFovDepth(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRLayerHeader getHeader() { return ngetHeader(address()); }
	public int getHeaderType() { return ngetHeaderType(address()); }
	public int getHeaderFlags() { return ngetHeaderFlags(address()); }
	public void getColorTexture(PointerBuffer ColorTexture) { ngetColorTexture(address(), ColorTexture); }
	public OVRSwapTextureSet getColorTexture(int index) { return ngetColorTexture(address(), index); }
	public void getViewport(ByteBuffer Viewport) { ngetViewport(address(), Viewport); }
	public OVRRecti getViewport(int index) { return ngetViewport(address(), index); }
	public void getFov(ByteBuffer Fov) { ngetFov(address(), Fov); }
	public OVRFovPort getFov(int index) { return ngetFov(address(), index); }
	public void getRenderPose(ByteBuffer RenderPose) { ngetRenderPose(address(), RenderPose); }
	public OVRPosef getRenderPose(int index) { return ngetRenderPose(address(), index); }
	public void getDepthTexture(PointerBuffer DepthTexture) { ngetDepthTexture(address(), DepthTexture); }
	public OVRSwapTextureSet getDepthTexture(int index) { return ngetDepthTexture(address(), index); }
	public OVRTimewarpProjectionDesc getProjectionDesc() { return ngetProjectionDesc(address()); }
	public float getProjectionDescProjection22() { return ngetProjectionDescProjection22(address()); }
	public float getProjectionDescProjection23() { return ngetProjectionDescProjection23(address()); }
	public float getProjectionDescProjection32() { return ngetProjectionDescProjection32(address()); }

	public OVRLayerEyeFovDepth setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
	public OVRLayerEyeFovDepth setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
	public OVRLayerEyeFovDepth setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
	public OVRLayerEyeFovDepth setColorTexture(PointerBuffer ColorTexture) { nsetColorTexture(address(), ColorTexture); return this; }
	public OVRLayerEyeFovDepth setColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetColorTexture(address(), index, ColorTexture); return this; }
	public OVRLayerEyeFovDepth setViewport(ByteBuffer Viewport) { nsetViewport(address(), Viewport); return this; }
	public OVRLayerEyeFovDepth setViewport(int index, OVRRecti Viewport) { nsetViewport(address(), index, Viewport); return this; }
	public OVRLayerEyeFovDepth setFov(ByteBuffer Fov) { nsetFov(address(), Fov); return this; }
	public OVRLayerEyeFovDepth setFov(int index, OVRFovPort Fov) { nsetFov(address(), index, Fov); return this; }
	public OVRLayerEyeFovDepth setRenderPose(ByteBuffer RenderPose) { nsetRenderPose(address(), RenderPose); return this; }
	public OVRLayerEyeFovDepth setRenderPose(int index, OVRPosef RenderPose) { nsetRenderPose(address(), index, RenderPose); return this; }
	public OVRLayerEyeFovDepth setDepthTexture(PointerBuffer DepthTexture) { nsetDepthTexture(address(), DepthTexture); return this; }
	public OVRLayerEyeFovDepth setDepthTexture(int index, OVRSwapTextureSet DepthTexture) { nsetDepthTexture(address(), index, DepthTexture); return this; }
	public OVRLayerEyeFovDepth setProjectionDesc(OVRTimewarpProjectionDesc ProjectionDesc) { nsetProjectionDesc(address(), ProjectionDesc); return this; }
	public OVRLayerEyeFovDepth setProjectionDescProjection22(float Projection22) { nsetProjectionDescProjection22(address(), Projection22); return this; }
	public OVRLayerEyeFovDepth setProjectionDescProjection23(float Projection23) { nsetProjectionDescProjection23(address(), Projection23); return this; }
	public OVRLayerEyeFovDepth setProjectionDescProjection32(float Projection32) { nsetProjectionDescProjection32(address(), Projection32); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerEyeFovDepth set(
		OVRLayerHeader Header,
		PointerBuffer ColorTexture,
		ByteBuffer Viewport,
		ByteBuffer Fov,
		ByteBuffer RenderPose,
		PointerBuffer DepthTexture,
		OVRTimewarpProjectionDesc ProjectionDesc
	) {
		setHeader(Header);
		setColorTexture(ColorTexture);
		setViewport(Viewport);
		setFov(Fov);
		setRenderPose(RenderPose);
		setDepthTexture(DepthTexture);
		setProjectionDesc(ProjectionDesc);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRLayerEyeFovDepth nset(long struct) {
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
	public OVRLayerEyeFovDepth set(OVRLayerEyeFovDepth src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRLayerEyeFovDepth set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerEyeFovDepth} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerEyeFovDepth malloc() {
		return new OVRLayerEyeFovDepth(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeFovDepth} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerEyeFovDepth calloc() {
		return new OVRLayerEyeFovDepth(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeFovDepth} instance allocated with {@link BufferUtils}. */
	public static OVRLayerEyeFovDepth create() {
		return new OVRLayerEyeFovDepth(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRLayerHeader ngetHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getHeader(ByteBuffer struct) { return ngetHeader(memAddress(struct)); }
	public static int ngetHeaderType(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.TYPE); }
	public static int getHeaderType(ByteBuffer struct) { return ngetHeaderType(memAddress(struct)); }
	public static int ngetHeaderFlags(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.FLAGS); }
	public static int getHeaderFlags(ByteBuffer struct) { return ngetHeaderFlags(memAddress(struct)); }
	public static void ngetColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(struct + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void getColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { ngetColorTexture(memAddress(struct), ColorTexture); }
	public static OVRSwapTextureSet ngetColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + COLORTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getColorTexture(ByteBuffer struct, int index) { return ngetColorTexture(memAddress(struct), index); }
	public static void ngetViewport(long struct, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(struct + VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void getViewport(ByteBuffer struct, ByteBuffer Viewport) { ngetViewport(memAddress(struct), Viewport); }
	public static OVRRecti ngetViewport(long struct, int index) {
		return OVRRecti.malloc().nset(struct + VIEWPORT + index * OVRRecti.SIZEOF);
	}
	public static OVRRecti getViewport(ByteBuffer struct, int index) { return ngetViewport(memAddress(struct), index); }
	public static void ngetFov(long struct, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(struct + FOV, memAddress(Fov), Fov.remaining());
	}
	public static void getFov(ByteBuffer struct, ByteBuffer Fov) { ngetFov(memAddress(struct), Fov); }
	public static OVRFovPort ngetFov(long struct, int index) {
		return OVRFovPort.malloc().nset(struct + FOV + index * OVRFovPort.SIZEOF);
	}
	public static OVRFovPort getFov(ByteBuffer struct, int index) { return ngetFov(memAddress(struct), index); }
	public static void ngetRenderPose(long struct, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(struct + RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void getRenderPose(ByteBuffer struct, ByteBuffer RenderPose) { ngetRenderPose(memAddress(struct), RenderPose); }
	public static OVRPosef ngetRenderPose(long struct, int index) {
		return OVRPosef.malloc().nset(struct + RENDERPOSE + index * OVRPosef.SIZEOF);
	}
	public static OVRPosef getRenderPose(ByteBuffer struct, int index) { return ngetRenderPose(memAddress(struct), index); }
	public static void ngetDepthTexture(long struct, PointerBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(struct + DEPTHTEXTURE, memAddress(DepthTexture), DepthTexture.remaining() * POINTER_SIZE);
	}
	public static void getDepthTexture(ByteBuffer struct, PointerBuffer DepthTexture) { ngetDepthTexture(memAddress(struct), DepthTexture); }
	public static OVRSwapTextureSet ngetDepthTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + DEPTHTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getDepthTexture(ByteBuffer struct, int index) { return ngetDepthTexture(memAddress(struct), index); }
	public static OVRTimewarpProjectionDesc ngetProjectionDesc(long struct) { return OVRTimewarpProjectionDesc.malloc().nset(struct + PROJECTIONDESC); }
	/** Returns a copy of the {@code ProjectionDesc} {@link OVRTimewarpProjectionDesc} struct. */
	public static OVRTimewarpProjectionDesc getProjectionDesc(ByteBuffer struct) { return ngetProjectionDesc(memAddress(struct)); }
	public static float ngetProjectionDescProjection22(long struct) { return memGetFloat(struct + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22); }
	public static float getProjectionDescProjection22(ByteBuffer struct) { return ngetProjectionDescProjection22(memAddress(struct)); }
	public static float ngetProjectionDescProjection23(long struct) { return memGetFloat(struct + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23); }
	public static float getProjectionDescProjection23(ByteBuffer struct) { return ngetProjectionDescProjection23(memAddress(struct)); }
	public static float ngetProjectionDescProjection32(long struct) { return memGetFloat(struct + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32); }
	public static float getProjectionDescProjection32(ByteBuffer struct) { return ngetProjectionDescProjection32(memAddress(struct)); }

	public static void nsetHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetHeader(memAddress(struct), Header); }
	public static void nsetHeaderType(long struct, int Type) { memPutInt(struct + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setHeaderType(ByteBuffer struct, int Type) { nsetHeaderType(memAddress(struct), Type); }
	public static void nsetHeaderFlags(long struct, int Flags) { memPutInt(struct + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setHeaderFlags(ByteBuffer struct, int Flags) { nsetHeaderFlags(memAddress(struct), Flags); }
	public static void nsetColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), struct + COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void setColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { nsetColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetColorTexture(long struct, int index, OVRSwapTextureSet ColorTexture) {
		memPutAddress(struct + COLORTEXTURE + index * POINTER_SIZE, ColorTexture.address());
	}
	public static void setColorTexture(ByteBuffer struct, int index, OVRSwapTextureSet ColorTexture) { nsetColorTexture(memAddress(struct), index, ColorTexture); }
	public static void nsetViewport(long struct, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), struct + VIEWPORT, Viewport.remaining());
	}
	public static void setViewport(ByteBuffer struct, ByteBuffer Viewport) { nsetViewport(memAddress(struct), Viewport); }
	public static void nsetViewport(long struct, int index, OVRRecti Viewport) {
		memCopy(Viewport.address(), struct + VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
	}
	public static void setViewport(ByteBuffer struct, int index, OVRRecti Viewport) { nsetViewport(memAddress(struct), index, Viewport); }
	public static void nsetFov(long struct, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), struct + FOV, Fov.remaining());
	}
	public static void setFov(ByteBuffer struct, ByteBuffer Fov) { nsetFov(memAddress(struct), Fov); }
	public static void nsetFov(long struct, int index, OVRFovPort Fov) {
		memCopy(Fov.address(), struct + FOV + index * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
	}
	public static void setFov(ByteBuffer struct, int index, OVRFovPort Fov) { nsetFov(memAddress(struct), index, Fov); }
	public static void nsetRenderPose(long struct, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), struct + RENDERPOSE, RenderPose.remaining());
	}
	public static void setRenderPose(ByteBuffer struct, ByteBuffer RenderPose) { nsetRenderPose(memAddress(struct), RenderPose); }
	public static void nsetRenderPose(long struct, int index, OVRPosef RenderPose) {
		memCopy(RenderPose.address(), struct + RENDERPOSE + index * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
	}
	public static void setRenderPose(ByteBuffer struct, int index, OVRPosef RenderPose) { nsetRenderPose(memAddress(struct), index, RenderPose); }
	public static void nsetDepthTexture(long struct, PointerBuffer DepthTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(memAddress(DepthTexture), struct + DEPTHTEXTURE, DepthTexture.remaining() * POINTER_SIZE);
	}
	public static void setDepthTexture(ByteBuffer struct, PointerBuffer DepthTexture) { nsetDepthTexture(memAddress(struct), DepthTexture); }
	public static void nsetDepthTexture(long struct, int index, OVRSwapTextureSet DepthTexture) {
		memPutAddress(struct + DEPTHTEXTURE + index * POINTER_SIZE, DepthTexture.address());
	}
	public static void setDepthTexture(ByteBuffer struct, int index, OVRSwapTextureSet DepthTexture) { nsetDepthTexture(memAddress(struct), index, DepthTexture); }
	public static void nsetProjectionDesc(long struct, OVRTimewarpProjectionDesc ProjectionDesc) { memCopy(ProjectionDesc.address(), struct + PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }
	/** Copies the specified {@link OVRTimewarpProjectionDesc} struct to the nested {@code ProjectionDesc} struct. */
	public static void setProjectionDesc(ByteBuffer struct, OVRTimewarpProjectionDesc ProjectionDesc) { nsetProjectionDesc(memAddress(struct), ProjectionDesc); }
	public static void nsetProjectionDescProjection22(long struct, float Projection22) { memPutFloat(struct + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22, Projection22); }
	public static void setProjectionDescProjection22(ByteBuffer struct, float Projection22) { nsetProjectionDescProjection22(memAddress(struct), Projection22); }
	public static void nsetProjectionDescProjection23(long struct, float Projection23) { memPutFloat(struct + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23, Projection23); }
	public static void setProjectionDescProjection23(ByteBuffer struct, float Projection23) { nsetProjectionDescProjection23(memAddress(struct), Projection23); }
	public static void nsetProjectionDescProjection32(long struct, float Projection32) { memPutFloat(struct + PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32, Projection32); }
	public static void setProjectionDescProjection32(ByteBuffer struct, float Projection32) { nsetProjectionDescProjection32(memAddress(struct), Projection32); }

	// -----------------------------------

	/** An array of {@link OVRLayerEyeFovDepth} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerEyeFovDepth, Buffer> {

		/**
		 * Creates a new {@link OVRLayerEyeFovDepth.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerEyeFovDepth#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerEyeFovDepth newInstance(long address) {
			return new OVRLayerEyeFovDepth(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}