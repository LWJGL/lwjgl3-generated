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

/** Union that combines ovrLayer types in a way that allows them to be used in a polymorphic way. */
public class OVRLayerUnion extends Struct {

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

	private static native int offsets(long buffer);

	OVRLayerUnion(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerUnion} instance at the specified memory address. */
	public OVRLayerUnion(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerUnion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerUnion(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRLayerHeader getHeader() { return ngetHeader(address()); }
	public int getHeaderType() { return ngetHeaderType(address()); }
	public int getHeaderFlags() { return ngetHeaderFlags(address()); }
	public OVRLayerEyeFov getEyeFov() { return ngetEyeFov(address()); }
	public OVRLayerHeader getEyeFovHeader() { return ngetEyeFovHeader(address()); }
	public int getEyeFovHeaderType() { return ngetEyeFovHeaderType(address()); }
	public int getEyeFovHeaderFlags() { return ngetEyeFovHeaderFlags(address()); }
	public void getEyeFovColorTexture(PointerBuffer ColorTexture) { ngetEyeFovColorTexture(address(), ColorTexture); }
	public OVRSwapTextureSet getEyeFovColorTexture(int index) { return ngetEyeFovColorTexture(address(), index); }
	public void getEyeFovViewport(ByteBuffer Viewport) { ngetEyeFovViewport(address(), Viewport); }
	public OVRRecti getEyeFovViewport(int index) { return ngetEyeFovViewport(address(), index); }
	public void getEyeFovFov(ByteBuffer Fov) { ngetEyeFovFov(address(), Fov); }
	public OVRFovPort getEyeFovFov(int index) { return ngetEyeFovFov(address(), index); }
	public void getEyeFovRenderPose(ByteBuffer RenderPose) { ngetEyeFovRenderPose(address(), RenderPose); }
	public OVRPosef getEyeFovRenderPose(int index) { return ngetEyeFovRenderPose(address(), index); }
	public double getEyeFovSensorSampleTime() { return ngetEyeFovSensorSampleTime(address()); }
	public OVRLayerEyeFovDepth getEyeFovDepth() { return ngetEyeFovDepth(address()); }
	public OVRLayerHeader getEyeFovDepthHeader() { return ngetEyeFovDepthHeader(address()); }
	public int getEyeFovDepthHeaderType() { return ngetEyeFovDepthHeaderType(address()); }
	public int getEyeFovDepthHeaderFlags() { return ngetEyeFovDepthHeaderFlags(address()); }
	public void getEyeFovDepthColorTexture(PointerBuffer ColorTexture) { ngetEyeFovDepthColorTexture(address(), ColorTexture); }
	public OVRSwapTextureSet getEyeFovDepthColorTexture(int index) { return ngetEyeFovDepthColorTexture(address(), index); }
	public void getEyeFovDepthViewport(ByteBuffer Viewport) { ngetEyeFovDepthViewport(address(), Viewport); }
	public OVRRecti getEyeFovDepthViewport(int index) { return ngetEyeFovDepthViewport(address(), index); }
	public void getEyeFovDepthFov(ByteBuffer Fov) { ngetEyeFovDepthFov(address(), Fov); }
	public OVRFovPort getEyeFovDepthFov(int index) { return ngetEyeFovDepthFov(address(), index); }
	public void getEyeFovDepthRenderPose(ByteBuffer RenderPose) { ngetEyeFovDepthRenderPose(address(), RenderPose); }
	public OVRPosef getEyeFovDepthRenderPose(int index) { return ngetEyeFovDepthRenderPose(address(), index); }
	public double getEyeFovDepthSensorSampleTime() { return ngetEyeFovDepthSensorSampleTime(address()); }
	public void getEyeFovDepthDepthTexture(PointerBuffer DepthTexture) { ngetEyeFovDepthDepthTexture(address(), DepthTexture); }
	public OVRSwapTextureSet getEyeFovDepthDepthTexture(int index) { return ngetEyeFovDepthDepthTexture(address(), index); }
	public OVRTimewarpProjectionDesc getEyeFovDepthProjectionDesc() { return ngetEyeFovDepthProjectionDesc(address()); }
	public float getEyeFovDepthProjectionDescProjection22() { return ngetEyeFovDepthProjectionDescProjection22(address()); }
	public float getEyeFovDepthProjectionDescProjection23() { return ngetEyeFovDepthProjectionDescProjection23(address()); }
	public float getEyeFovDepthProjectionDescProjection32() { return ngetEyeFovDepthProjectionDescProjection32(address()); }
	public OVRLayerQuad getQuad() { return ngetQuad(address()); }
	public OVRLayerHeader getQuadHeader() { return ngetQuadHeader(address()); }
	public int getQuadHeaderType() { return ngetQuadHeaderType(address()); }
	public int getQuadHeaderFlags() { return ngetQuadHeaderFlags(address()); }
	public OVRSwapTextureSet getQuadColorTexture() { return ngetQuadColorTextureStruct(address()); }
	public OVRRecti getQuadViewport() { return ngetQuadViewport(address()); }
	public OVRVector2i getQuadViewportPos() { return ngetQuadViewportPos(address()); }
	public int getQuadViewportPosX() { return ngetQuadViewportPosX(address()); }
	public int getQuadViewportPosY() { return ngetQuadViewportPosY(address()); }
	public OVRSizei getQuadViewportSize() { return ngetQuadViewportSize(address()); }
	public int getQuadViewportSizeW() { return ngetQuadViewportSizeW(address()); }
	public int getQuadViewportSizeH() { return ngetQuadViewportSizeH(address()); }
	public OVRPosef getQuadQuadPoseCenter() { return ngetQuadQuadPoseCenter(address()); }
	public OVRQuatf getQuadQuadPoseCenterOrientation() { return ngetQuadQuadPoseCenterOrientation(address()); }
	public float getQuadQuadPoseCenterOrientationX() { return ngetQuadQuadPoseCenterOrientationX(address()); }
	public float getQuadQuadPoseCenterOrientationY() { return ngetQuadQuadPoseCenterOrientationY(address()); }
	public float getQuadQuadPoseCenterOrientationZ() { return ngetQuadQuadPoseCenterOrientationZ(address()); }
	public float getQuadQuadPoseCenterOrientationW() { return ngetQuadQuadPoseCenterOrientationW(address()); }
	public OVRVector3f getQuadQuadPoseCenterPosition() { return ngetQuadQuadPoseCenterPosition(address()); }
	public float getQuadQuadPoseCenterPositionX() { return ngetQuadQuadPoseCenterPositionX(address()); }
	public float getQuadQuadPoseCenterPositionY() { return ngetQuadQuadPoseCenterPositionY(address()); }
	public float getQuadQuadPoseCenterPositionZ() { return ngetQuadQuadPoseCenterPositionZ(address()); }
	public OVRVector2f getQuadQuadSize() { return ngetQuadQuadSize(address()); }
	public float getQuadQuadSizeX() { return ngetQuadQuadSizeX(address()); }
	public float getQuadQuadSizeY() { return ngetQuadQuadSizeY(address()); }
	public OVRLayerDirect getDirect() { return ngetDirect(address()); }
	public OVRLayerHeader getDirectHeader() { return ngetDirectHeader(address()); }
	public int getDirectHeaderType() { return ngetDirectHeaderType(address()); }
	public int getDirectHeaderFlags() { return ngetDirectHeaderFlags(address()); }
	public void getDirectColorTexture(PointerBuffer ColorTexture) { ngetDirectColorTexture(address(), ColorTexture); }
	public OVRSwapTextureSet getDirectColorTexture(int index) { return ngetDirectColorTexture(address(), index); }
	public void getDirectViewport(ByteBuffer Viewport) { ngetDirectViewport(address(), Viewport); }
	public OVRRecti getDirectViewport(int index) { return ngetDirectViewport(address(), index); }

	public OVRLayerUnion setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
	public OVRLayerUnion setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
	public OVRLayerUnion setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
	public OVRLayerUnion setEyeFov(OVRLayerEyeFov EyeFov) { nsetEyeFov(address(), EyeFov); return this; }
	public OVRLayerUnion setEyeFovHeader(OVRLayerHeader Header) { nsetEyeFovHeader(address(), Header); return this; }
	public OVRLayerUnion setEyeFovHeaderType(int Type) { nsetEyeFovHeaderType(address(), Type); return this; }
	public OVRLayerUnion setEyeFovHeaderFlags(int Flags) { nsetEyeFovHeaderFlags(address(), Flags); return this; }
	public OVRLayerUnion setEyeFovColorTexture(PointerBuffer ColorTexture) { nsetEyeFovColorTexture(address(), ColorTexture); return this; }
	public OVRLayerUnion setEyeFovColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetEyeFovColorTexture(address(), index, ColorTexture); return this; }
	public OVRLayerUnion setEyeFovViewport(ByteBuffer Viewport) { nsetEyeFovViewport(address(), Viewport); return this; }
	public OVRLayerUnion setEyeFovViewport(int index, OVRRecti Viewport) { nsetEyeFovViewport(address(), index, Viewport); return this; }
	public OVRLayerUnion setEyeFovFov(ByteBuffer Fov) { nsetEyeFovFov(address(), Fov); return this; }
	public OVRLayerUnion setEyeFovFov(int index, OVRFovPort Fov) { nsetEyeFovFov(address(), index, Fov); return this; }
	public OVRLayerUnion setEyeFovRenderPose(ByteBuffer RenderPose) { nsetEyeFovRenderPose(address(), RenderPose); return this; }
	public OVRLayerUnion setEyeFovRenderPose(int index, OVRPosef RenderPose) { nsetEyeFovRenderPose(address(), index, RenderPose); return this; }
	public OVRLayerUnion setEyeFovSensorSampleTime(double SensorSampleTime) { nsetEyeFovSensorSampleTime(address(), SensorSampleTime); return this; }
	public OVRLayerUnion setEyeFovDepth(OVRLayerEyeFovDepth EyeFovDepth) { nsetEyeFovDepth(address(), EyeFovDepth); return this; }
	public OVRLayerUnion setEyeFovDepthHeader(OVRLayerHeader Header) { nsetEyeFovDepthHeader(address(), Header); return this; }
	public OVRLayerUnion setEyeFovDepthHeaderType(int Type) { nsetEyeFovDepthHeaderType(address(), Type); return this; }
	public OVRLayerUnion setEyeFovDepthHeaderFlags(int Flags) { nsetEyeFovDepthHeaderFlags(address(), Flags); return this; }
	public OVRLayerUnion setEyeFovDepthColorTexture(PointerBuffer ColorTexture) { nsetEyeFovDepthColorTexture(address(), ColorTexture); return this; }
	public OVRLayerUnion setEyeFovDepthColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetEyeFovDepthColorTexture(address(), index, ColorTexture); return this; }
	public OVRLayerUnion setEyeFovDepthViewport(ByteBuffer Viewport) { nsetEyeFovDepthViewport(address(), Viewport); return this; }
	public OVRLayerUnion setEyeFovDepthViewport(int index, OVRRecti Viewport) { nsetEyeFovDepthViewport(address(), index, Viewport); return this; }
	public OVRLayerUnion setEyeFovDepthFov(ByteBuffer Fov) { nsetEyeFovDepthFov(address(), Fov); return this; }
	public OVRLayerUnion setEyeFovDepthFov(int index, OVRFovPort Fov) { nsetEyeFovDepthFov(address(), index, Fov); return this; }
	public OVRLayerUnion setEyeFovDepthRenderPose(ByteBuffer RenderPose) { nsetEyeFovDepthRenderPose(address(), RenderPose); return this; }
	public OVRLayerUnion setEyeFovDepthRenderPose(int index, OVRPosef RenderPose) { nsetEyeFovDepthRenderPose(address(), index, RenderPose); return this; }
	public OVRLayerUnion setEyeFovDepthSensorSampleTime(double SensorSampleTime) { nsetEyeFovDepthSensorSampleTime(address(), SensorSampleTime); return this; }
	public OVRLayerUnion setEyeFovDepthDepthTexture(PointerBuffer DepthTexture) { nsetEyeFovDepthDepthTexture(address(), DepthTexture); return this; }
	public OVRLayerUnion setEyeFovDepthDepthTexture(int index, OVRSwapTextureSet DepthTexture) { nsetEyeFovDepthDepthTexture(address(), index, DepthTexture); return this; }
	public OVRLayerUnion setEyeFovDepthProjectionDesc(OVRTimewarpProjectionDesc ProjectionDesc) { nsetEyeFovDepthProjectionDesc(address(), ProjectionDesc); return this; }
	public OVRLayerUnion setEyeFovDepthProjectionDescProjection22(float Projection22) { nsetEyeFovDepthProjectionDescProjection22(address(), Projection22); return this; }
	public OVRLayerUnion setEyeFovDepthProjectionDescProjection23(float Projection23) { nsetEyeFovDepthProjectionDescProjection23(address(), Projection23); return this; }
	public OVRLayerUnion setEyeFovDepthProjectionDescProjection32(float Projection32) { nsetEyeFovDepthProjectionDescProjection32(address(), Projection32); return this; }
	public OVRLayerUnion setQuad(OVRLayerQuad Quad) { nsetQuad(address(), Quad); return this; }
	public OVRLayerUnion setQuadHeader(OVRLayerHeader Header) { nsetQuadHeader(address(), Header); return this; }
	public OVRLayerUnion setQuadHeaderType(int Type) { nsetQuadHeaderType(address(), Type); return this; }
	public OVRLayerUnion setQuadHeaderFlags(int Flags) { nsetQuadHeaderFlags(address(), Flags); return this; }
	public OVRLayerUnion setQuadColorTexture(OVRSwapTextureSet ColorTexture) { nsetQuadColorTexture(address(), ColorTexture); return this; }
	public OVRLayerUnion setQuadViewport(OVRRecti Viewport) { nsetQuadViewport(address(), Viewport); return this; }
	public OVRLayerUnion setQuadViewportPos(OVRVector2i Pos) { nsetQuadViewportPos(address(), Pos); return this; }
	public OVRLayerUnion setQuadViewportPosX(int x) { nsetQuadViewportPosX(address(), x); return this; }
	public OVRLayerUnion setQuadViewportPosY(int y) { nsetQuadViewportPosY(address(), y); return this; }
	public OVRLayerUnion setQuadViewportSize(OVRSizei Size) { nsetQuadViewportSize(address(), Size); return this; }
	public OVRLayerUnion setQuadViewportSizeW(int w) { nsetQuadViewportSizeW(address(), w); return this; }
	public OVRLayerUnion setQuadViewportSizeH(int h) { nsetQuadViewportSizeH(address(), h); return this; }
	public OVRLayerUnion setQuadQuadPoseCenter(OVRPosef QuadPoseCenter) { nsetQuadQuadPoseCenter(address(), QuadPoseCenter); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterOrientation(OVRQuatf Orientation) { nsetQuadQuadPoseCenterOrientation(address(), Orientation); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterOrientationX(float x) { nsetQuadQuadPoseCenterOrientationX(address(), x); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterOrientationY(float y) { nsetQuadQuadPoseCenterOrientationY(address(), y); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterOrientationZ(float z) { nsetQuadQuadPoseCenterOrientationZ(address(), z); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterOrientationW(float w) { nsetQuadQuadPoseCenterOrientationW(address(), w); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterPosition(OVRVector3f Position) { nsetQuadQuadPoseCenterPosition(address(), Position); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterPositionX(float x) { nsetQuadQuadPoseCenterPositionX(address(), x); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterPositionY(float y) { nsetQuadQuadPoseCenterPositionY(address(), y); return this; }
	public OVRLayerUnion setQuadQuadPoseCenterPositionZ(float z) { nsetQuadQuadPoseCenterPositionZ(address(), z); return this; }
	public OVRLayerUnion setQuadQuadSize(OVRVector2f QuadSize) { nsetQuadQuadSize(address(), QuadSize); return this; }
	public OVRLayerUnion setQuadQuadSizeX(float x) { nsetQuadQuadSizeX(address(), x); return this; }
	public OVRLayerUnion setQuadQuadSizeY(float y) { nsetQuadQuadSizeY(address(), y); return this; }
	public OVRLayerUnion setDirect(OVRLayerDirect Direct) { nsetDirect(address(), Direct); return this; }
	public OVRLayerUnion setDirectHeader(OVRLayerHeader Header) { nsetDirectHeader(address(), Header); return this; }
	public OVRLayerUnion setDirectHeaderType(int Type) { nsetDirectHeaderType(address(), Type); return this; }
	public OVRLayerUnion setDirectHeaderFlags(int Flags) { nsetDirectHeaderFlags(address(), Flags); return this; }
	public OVRLayerUnion setDirectColorTexture(PointerBuffer ColorTexture) { nsetDirectColorTexture(address(), ColorTexture); return this; }
	public OVRLayerUnion setDirectColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetDirectColorTexture(address(), index, ColorTexture); return this; }
	public OVRLayerUnion setDirectViewport(ByteBuffer Viewport) { nsetDirectViewport(address(), Viewport); return this; }
	public OVRLayerUnion setDirectViewport(int index, OVRRecti Viewport) { nsetDirectViewport(address(), index, Viewport); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerUnion set(
		OVRLayerHeader Header,
		OVRLayerEyeFov EyeFov,
		OVRLayerEyeFovDepth EyeFovDepth,
		OVRLayerQuad Quad,
		OVRLayerDirect Direct
	) {
		setHeader(Header);
		setEyeFov(EyeFov);
		setEyeFovDepth(EyeFovDepth);
		setQuad(Quad);
		setDirect(Direct);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRLayerUnion nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRLayerUnion set(OVRLayerUnion src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRLayerUnion set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerUnion} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerUnion malloc() {
		return new OVRLayerUnion(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerUnion} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerUnion calloc() {
		return new OVRLayerUnion(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerUnion} instance allocated with {@link BufferUtils}. */
	public static OVRLayerUnion create() {
		return new OVRLayerUnion(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRLayerUnion.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static OVRLayerHeader ngetHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getHeader(ByteBuffer struct) { return ngetHeader(memAddress(struct)); }
	public static int ngetHeaderType(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.TYPE); }
	public static int getHeaderType(ByteBuffer struct) { return ngetHeaderType(memAddress(struct)); }
	public static int ngetHeaderFlags(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.FLAGS); }
	public static int getHeaderFlags(ByteBuffer struct) { return ngetHeaderFlags(memAddress(struct)); }
	public static OVRLayerEyeFov ngetEyeFov(long struct) { return OVRLayerEyeFov.malloc().nset(struct + EYEFOV); }
	/** Returns a copy of the {@code EyeFov} {@link OVRLayerEyeFov} struct. */
	public static OVRLayerEyeFov getEyeFov(ByteBuffer struct) { return ngetEyeFov(memAddress(struct)); }
	public static OVRLayerHeader ngetEyeFovHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + EYEFOV + OVRLayerEyeFov.HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getEyeFovHeader(ByteBuffer struct) { return ngetEyeFovHeader(memAddress(struct)); }
	public static int ngetEyeFovHeaderType(long struct) { return memGetInt(struct + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.TYPE); }
	public static int getEyeFovHeaderType(ByteBuffer struct) { return ngetEyeFovHeaderType(memAddress(struct)); }
	public static int ngetEyeFovHeaderFlags(long struct) { return memGetInt(struct + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.FLAGS); }
	public static int getEyeFovHeaderFlags(ByteBuffer struct) { return ngetEyeFovHeaderFlags(memAddress(struct)); }
	public static void ngetEyeFovColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(struct + EYEFOV + OVRLayerEyeFov.COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void getEyeFovColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { ngetEyeFovColorTexture(memAddress(struct), ColorTexture); }
	public static OVRSwapTextureSet ngetEyeFovColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + EYEFOV + OVRLayerEyeFov.COLORTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getEyeFovColorTexture(ByteBuffer struct, int index) { return ngetEyeFovColorTexture(memAddress(struct), index); }
	public static void ngetEyeFovViewport(long struct, ByteBuffer Viewport) {
		if ( CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(struct + EYEFOV + OVRLayerEyeFov.VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void getEyeFovViewport(ByteBuffer struct, ByteBuffer Viewport) { ngetEyeFovViewport(memAddress(struct), Viewport); }
	public static OVRRecti ngetEyeFovViewport(long struct, int index) {
		return OVRRecti.malloc().nset(struct + EYEFOV + OVRLayerEyeFov.VIEWPORT + index * OVRRecti.SIZEOF);
	}
	public static OVRRecti getEyeFovViewport(ByteBuffer struct, int index) { return ngetEyeFovViewport(memAddress(struct), index); }
	public static void ngetEyeFovFov(long struct, ByteBuffer Fov) {
		if ( CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(struct + EYEFOV + OVRLayerEyeFov.FOV, memAddress(Fov), Fov.remaining());
	}
	public static void getEyeFovFov(ByteBuffer struct, ByteBuffer Fov) { ngetEyeFovFov(memAddress(struct), Fov); }
	public static OVRFovPort ngetEyeFovFov(long struct, int index) {
		return OVRFovPort.malloc().nset(struct + EYEFOV + OVRLayerEyeFov.FOV + index * OVRFovPort.SIZEOF);
	}
	public static OVRFovPort getEyeFovFov(ByteBuffer struct, int index) { return ngetEyeFovFov(memAddress(struct), index); }
	public static void ngetEyeFovRenderPose(long struct, ByteBuffer RenderPose) {
		if ( CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(struct + EYEFOV + OVRLayerEyeFov.RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void getEyeFovRenderPose(ByteBuffer struct, ByteBuffer RenderPose) { ngetEyeFovRenderPose(memAddress(struct), RenderPose); }
	public static OVRPosef ngetEyeFovRenderPose(long struct, int index) {
		return OVRPosef.malloc().nset(struct + EYEFOV + OVRLayerEyeFov.RENDERPOSE + index * OVRPosef.SIZEOF);
	}
	public static OVRPosef getEyeFovRenderPose(ByteBuffer struct, int index) { return ngetEyeFovRenderPose(memAddress(struct), index); }
	public static double ngetEyeFovSensorSampleTime(long struct) { return memGetDouble(struct + EYEFOV + OVRLayerEyeFov.SENSORSAMPLETIME); }
	public static double getEyeFovSensorSampleTime(ByteBuffer struct) { return ngetEyeFovSensorSampleTime(memAddress(struct)); }
	public static OVRLayerEyeFovDepth ngetEyeFovDepth(long struct) { return OVRLayerEyeFovDepth.malloc().nset(struct + EYEFOVDEPTH); }
	/** Returns a copy of the {@code EyeFovDepth} {@link OVRLayerEyeFovDepth} struct. */
	public static OVRLayerEyeFovDepth getEyeFovDepth(ByteBuffer struct) { return ngetEyeFovDepth(memAddress(struct)); }
	public static OVRLayerHeader ngetEyeFovDepthHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getEyeFovDepthHeader(ByteBuffer struct) { return ngetEyeFovDepthHeader(memAddress(struct)); }
	public static int ngetEyeFovDepthHeaderType(long struct) { return memGetInt(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.TYPE); }
	public static int getEyeFovDepthHeaderType(ByteBuffer struct) { return ngetEyeFovDepthHeaderType(memAddress(struct)); }
	public static int ngetEyeFovDepthHeaderFlags(long struct) { return memGetInt(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.FLAGS); }
	public static int getEyeFovDepthHeaderFlags(ByteBuffer struct) { return ngetEyeFovDepthHeaderFlags(memAddress(struct)); }
	public static void ngetEyeFovDepthColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void getEyeFovDepthColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { ngetEyeFovDepthColorTexture(memAddress(struct), ColorTexture); }
	public static OVRSwapTextureSet ngetEyeFovDepthColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getEyeFovDepthColorTexture(ByteBuffer struct, int index) { return ngetEyeFovDepthColorTexture(memAddress(struct), index); }
	public static void ngetEyeFovDepthViewport(long struct, ByteBuffer Viewport) {
		if ( CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void getEyeFovDepthViewport(ByteBuffer struct, ByteBuffer Viewport) { ngetEyeFovDepthViewport(memAddress(struct), Viewport); }
	public static OVRRecti ngetEyeFovDepthViewport(long struct, int index) {
		return OVRRecti.malloc().nset(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT + index * OVRRecti.SIZEOF);
	}
	public static OVRRecti getEyeFovDepthViewport(ByteBuffer struct, int index) { return ngetEyeFovDepthViewport(memAddress(struct), index); }
	public static void ngetEyeFovDepthFov(long struct, ByteBuffer Fov) {
		if ( CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV, memAddress(Fov), Fov.remaining());
	}
	public static void getEyeFovDepthFov(ByteBuffer struct, ByteBuffer Fov) { ngetEyeFovDepthFov(memAddress(struct), Fov); }
	public static OVRFovPort ngetEyeFovDepthFov(long struct, int index) {
		return OVRFovPort.malloc().nset(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV + index * OVRFovPort.SIZEOF);
	}
	public static OVRFovPort getEyeFovDepthFov(ByteBuffer struct, int index) { return ngetEyeFovDepthFov(memAddress(struct), index); }
	public static void ngetEyeFovDepthRenderPose(long struct, ByteBuffer RenderPose) {
		if ( CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void getEyeFovDepthRenderPose(ByteBuffer struct, ByteBuffer RenderPose) { ngetEyeFovDepthRenderPose(memAddress(struct), RenderPose); }
	public static OVRPosef ngetEyeFovDepthRenderPose(long struct, int index) {
		return OVRPosef.malloc().nset(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE + index * OVRPosef.SIZEOF);
	}
	public static OVRPosef getEyeFovDepthRenderPose(ByteBuffer struct, int index) { return ngetEyeFovDepthRenderPose(memAddress(struct), index); }
	public static double ngetEyeFovDepthSensorSampleTime(long struct) { return memGetDouble(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.SENSORSAMPLETIME); }
	public static double getEyeFovDepthSensorSampleTime(ByteBuffer struct) { return ngetEyeFovDepthSensorSampleTime(memAddress(struct)); }
	public static void ngetEyeFovDepthDepthTexture(long struct, PointerBuffer DepthTexture) {
		if ( CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE, memAddress(DepthTexture), DepthTexture.remaining() * POINTER_SIZE);
	}
	public static void getEyeFovDepthDepthTexture(ByteBuffer struct, PointerBuffer DepthTexture) { ngetEyeFovDepthDepthTexture(memAddress(struct), DepthTexture); }
	public static OVRSwapTextureSet ngetEyeFovDepthDepthTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getEyeFovDepthDepthTexture(ByteBuffer struct, int index) { return ngetEyeFovDepthDepthTexture(memAddress(struct), index); }
	public static OVRTimewarpProjectionDesc ngetEyeFovDepthProjectionDesc(long struct) { return OVRTimewarpProjectionDesc.malloc().nset(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC); }
	/** Returns a copy of the {@code ProjectionDesc} {@link OVRTimewarpProjectionDesc} struct. */
	public static OVRTimewarpProjectionDesc getEyeFovDepthProjectionDesc(ByteBuffer struct) { return ngetEyeFovDepthProjectionDesc(memAddress(struct)); }
	public static float ngetEyeFovDepthProjectionDescProjection22(long struct) { return memGetFloat(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22); }
	public static float getEyeFovDepthProjectionDescProjection22(ByteBuffer struct) { return ngetEyeFovDepthProjectionDescProjection22(memAddress(struct)); }
	public static float ngetEyeFovDepthProjectionDescProjection23(long struct) { return memGetFloat(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23); }
	public static float getEyeFovDepthProjectionDescProjection23(ByteBuffer struct) { return ngetEyeFovDepthProjectionDescProjection23(memAddress(struct)); }
	public static float ngetEyeFovDepthProjectionDescProjection32(long struct) { return memGetFloat(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32); }
	public static float getEyeFovDepthProjectionDescProjection32(ByteBuffer struct) { return ngetEyeFovDepthProjectionDescProjection32(memAddress(struct)); }
	public static OVRLayerQuad ngetQuad(long struct) { return OVRLayerQuad.malloc().nset(struct + QUAD); }
	/** Returns a copy of the {@code Quad} {@link OVRLayerQuad} struct. */
	public static OVRLayerQuad getQuad(ByteBuffer struct) { return ngetQuad(memAddress(struct)); }
	public static OVRLayerHeader ngetQuadHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + QUAD + OVRLayerQuad.HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getQuadHeader(ByteBuffer struct) { return ngetQuadHeader(memAddress(struct)); }
	public static int ngetQuadHeaderType(long struct) { return memGetInt(struct + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.TYPE); }
	public static int getQuadHeaderType(ByteBuffer struct) { return ngetQuadHeaderType(memAddress(struct)); }
	public static int ngetQuadHeaderFlags(long struct) { return memGetInt(struct + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.FLAGS); }
	public static int getQuadHeaderFlags(ByteBuffer struct) { return ngetQuadHeaderFlags(memAddress(struct)); }
	public static long ngetQuadColorTexture(long struct) { return memGetAddress(struct + QUAD + OVRLayerQuad.COLORTEXTURE); }
	public static OVRSwapTextureSet ngetQuadColorTextureStruct(long struct) { return new OVRSwapTextureSet(ngetQuadColorTexture(struct)); }
	public static OVRSwapTextureSet getQuadColorTexture(ByteBuffer struct) { return ngetQuadColorTextureStruct(memAddress(struct)); }
	public static OVRRecti ngetQuadViewport(long struct) { return OVRRecti.malloc().nset(struct + QUAD + OVRLayerQuad.VIEWPORT); }
	/** Returns a copy of the {@code Viewport} {@link OVRRecti} struct. */
	public static OVRRecti getQuadViewport(ByteBuffer struct) { return ngetQuadViewport(memAddress(struct)); }
	public static OVRVector2i ngetQuadViewportPos(long struct) { return OVRVector2i.malloc().nset(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS); }
	/** Returns a copy of the {@code Pos} {@link OVRVector2i} struct. */
	public static OVRVector2i getQuadViewportPos(ByteBuffer struct) { return ngetQuadViewportPos(memAddress(struct)); }
	public static int ngetQuadViewportPosX(long struct) { return memGetInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int getQuadViewportPosX(ByteBuffer struct) { return ngetQuadViewportPosX(memAddress(struct)); }
	public static int ngetQuadViewportPosY(long struct) { return memGetInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static int getQuadViewportPosY(ByteBuffer struct) { return ngetQuadViewportPosY(memAddress(struct)); }
	public static OVRSizei ngetQuadViewportSize(long struct) { return OVRSizei.malloc().nset(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE); }
	/** Returns a copy of the {@code Size} {@link OVRSizei} struct. */
	public static OVRSizei getQuadViewportSize(ByteBuffer struct) { return ngetQuadViewportSize(memAddress(struct)); }
	public static int ngetQuadViewportSizeW(long struct) { return memGetInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int getQuadViewportSizeW(ByteBuffer struct) { return ngetQuadViewportSizeW(memAddress(struct)); }
	public static int ngetQuadViewportSizeH(long struct) { return memGetInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static int getQuadViewportSizeH(ByteBuffer struct) { return ngetQuadViewportSizeH(memAddress(struct)); }
	public static OVRPosef ngetQuadQuadPoseCenter(long struct) { return OVRPosef.malloc().nset(struct + QUAD + OVRLayerQuad.QUADPOSECENTER); }
	/** Returns a copy of the {@code QuadPoseCenter} {@link OVRPosef} struct. */
	public static OVRPosef getQuadQuadPoseCenter(ByteBuffer struct) { return ngetQuadQuadPoseCenter(memAddress(struct)); }
	public static OVRQuatf ngetQuadQuadPoseCenterOrientation(long struct) { return OVRQuatf.malloc().nset(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getQuadQuadPoseCenterOrientation(ByteBuffer struct) { return ngetQuadQuadPoseCenterOrientation(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterOrientationX(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float getQuadQuadPoseCenterOrientationX(ByteBuffer struct) { return ngetQuadQuadPoseCenterOrientationX(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterOrientationY(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float getQuadQuadPoseCenterOrientationY(ByteBuffer struct) { return ngetQuadQuadPoseCenterOrientationY(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterOrientationZ(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float getQuadQuadPoseCenterOrientationZ(ByteBuffer struct) { return ngetQuadQuadPoseCenterOrientationZ(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterOrientationW(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static float getQuadQuadPoseCenterOrientationW(ByteBuffer struct) { return ngetQuadQuadPoseCenterOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetQuadQuadPoseCenterPosition(long struct) { return OVRVector3f.malloc().nset(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getQuadQuadPoseCenterPosition(ByteBuffer struct) { return ngetQuadQuadPoseCenterPosition(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterPositionX(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X); }
	public static float getQuadQuadPoseCenterPositionX(ByteBuffer struct) { return ngetQuadQuadPoseCenterPositionX(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterPositionY(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float getQuadQuadPoseCenterPositionY(ByteBuffer struct) { return ngetQuadQuadPoseCenterPositionY(memAddress(struct)); }
	public static float ngetQuadQuadPoseCenterPositionZ(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z); }
	public static float getQuadQuadPoseCenterPositionZ(ByteBuffer struct) { return ngetQuadQuadPoseCenterPositionZ(memAddress(struct)); }
	public static OVRVector2f ngetQuadQuadSize(long struct) { return OVRVector2f.malloc().nset(struct + QUAD + OVRLayerQuad.QUADSIZE); }
	/** Returns a copy of the {@code QuadSize} {@link OVRVector2f} struct. */
	public static OVRVector2f getQuadQuadSize(ByteBuffer struct) { return ngetQuadQuadSize(memAddress(struct)); }
	public static float ngetQuadQuadSizeX(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.X); }
	public static float getQuadQuadSizeX(ByteBuffer struct) { return ngetQuadQuadSizeX(memAddress(struct)); }
	public static float ngetQuadQuadSizeY(long struct) { return memGetFloat(struct + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.Y); }
	public static float getQuadQuadSizeY(ByteBuffer struct) { return ngetQuadQuadSizeY(memAddress(struct)); }
	public static OVRLayerDirect ngetDirect(long struct) { return OVRLayerDirect.malloc().nset(struct + DIRECT); }
	/** Returns a copy of the {@code Direct} {@link OVRLayerDirect} struct. */
	public static OVRLayerDirect getDirect(ByteBuffer struct) { return ngetDirect(memAddress(struct)); }
	public static OVRLayerHeader ngetDirectHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + DIRECT + OVRLayerDirect.HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getDirectHeader(ByteBuffer struct) { return ngetDirectHeader(memAddress(struct)); }
	public static int ngetDirectHeaderType(long struct) { return memGetInt(struct + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.TYPE); }
	public static int getDirectHeaderType(ByteBuffer struct) { return ngetDirectHeaderType(memAddress(struct)); }
	public static int ngetDirectHeaderFlags(long struct) { return memGetInt(struct + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.FLAGS); }
	public static int getDirectHeaderFlags(ByteBuffer struct) { return ngetDirectHeaderFlags(memAddress(struct)); }
	public static void ngetDirectColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(struct + DIRECT + OVRLayerDirect.COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void getDirectColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { ngetDirectColorTexture(memAddress(struct), ColorTexture); }
	public static OVRSwapTextureSet ngetDirectColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + DIRECT + OVRLayerDirect.COLORTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getDirectColorTexture(ByteBuffer struct, int index) { return ngetDirectColorTexture(memAddress(struct), index); }
	public static void ngetDirectViewport(long struct, ByteBuffer Viewport) {
		if ( CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(struct + DIRECT + OVRLayerDirect.VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void getDirectViewport(ByteBuffer struct, ByteBuffer Viewport) { ngetDirectViewport(memAddress(struct), Viewport); }
	public static OVRRecti ngetDirectViewport(long struct, int index) {
		return OVRRecti.malloc().nset(struct + DIRECT + OVRLayerDirect.VIEWPORT + index * OVRRecti.SIZEOF);
	}
	public static OVRRecti getDirectViewport(ByteBuffer struct, int index) { return ngetDirectViewport(memAddress(struct), index); }

	public static void nsetHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetHeader(memAddress(struct), Header); }
	public static void nsetHeaderType(long struct, int Type) { memPutInt(struct + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setHeaderType(ByteBuffer struct, int Type) { nsetHeaderType(memAddress(struct), Type); }
	public static void nsetHeaderFlags(long struct, int Flags) { memPutInt(struct + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setHeaderFlags(ByteBuffer struct, int Flags) { nsetHeaderFlags(memAddress(struct), Flags); }
	public static void nsetEyeFov(long struct, OVRLayerEyeFov EyeFov) { memCopy(EyeFov.address(), struct + EYEFOV, OVRLayerEyeFov.SIZEOF); }
	/** Copies the specified {@link OVRLayerEyeFov} struct to the nested {@code EyeFov} struct. */
	public static void setEyeFov(ByteBuffer struct, OVRLayerEyeFov EyeFov) { nsetEyeFov(memAddress(struct), EyeFov); }
	public static void nsetEyeFovHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + EYEFOV + OVRLayerEyeFov.HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setEyeFovHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetEyeFovHeader(memAddress(struct), Header); }
	public static void nsetEyeFovHeaderType(long struct, int Type) { memPutInt(struct + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setEyeFovHeaderType(ByteBuffer struct, int Type) { nsetEyeFovHeaderType(memAddress(struct), Type); }
	public static void nsetEyeFovHeaderFlags(long struct, int Flags) { memPutInt(struct + EYEFOV + OVRLayerEyeFov.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setEyeFovHeaderFlags(ByteBuffer struct, int Flags) { nsetEyeFovHeaderFlags(memAddress(struct), Flags); }
	public static void nsetEyeFovColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), struct + EYEFOV + OVRLayerEyeFov.COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void setEyeFovColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { nsetEyeFovColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetEyeFovColorTexture(long struct, int index, OVRSwapTextureSet ColorTexture) {
		memPutAddress(struct + EYEFOV + OVRLayerEyeFov.COLORTEXTURE + index * POINTER_SIZE, ColorTexture.address());
	}
	public static void setEyeFovColorTexture(ByteBuffer struct, int index, OVRSwapTextureSet ColorTexture) { nsetEyeFovColorTexture(memAddress(struct), index, ColorTexture); }
	public static void nsetEyeFovViewport(long struct, ByteBuffer Viewport) {
		if ( CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), struct + EYEFOV + OVRLayerEyeFov.VIEWPORT, Viewport.remaining());
	}
	public static void setEyeFovViewport(ByteBuffer struct, ByteBuffer Viewport) { nsetEyeFovViewport(memAddress(struct), Viewport); }
	public static void nsetEyeFovViewport(long struct, int index, OVRRecti Viewport) {
		memCopy(Viewport.address(), struct + EYEFOV + OVRLayerEyeFov.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
	}
	public static void setEyeFovViewport(ByteBuffer struct, int index, OVRRecti Viewport) { nsetEyeFovViewport(memAddress(struct), index, Viewport); }
	public static void nsetEyeFovFov(long struct, ByteBuffer Fov) {
		if ( CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), struct + EYEFOV + OVRLayerEyeFov.FOV, Fov.remaining());
	}
	public static void setEyeFovFov(ByteBuffer struct, ByteBuffer Fov) { nsetEyeFovFov(memAddress(struct), Fov); }
	public static void nsetEyeFovFov(long struct, int index, OVRFovPort Fov) {
		memCopy(Fov.address(), struct + EYEFOV + OVRLayerEyeFov.FOV + index * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
	}
	public static void setEyeFovFov(ByteBuffer struct, int index, OVRFovPort Fov) { nsetEyeFovFov(memAddress(struct), index, Fov); }
	public static void nsetEyeFovRenderPose(long struct, ByteBuffer RenderPose) {
		if ( CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), struct + EYEFOV + OVRLayerEyeFov.RENDERPOSE, RenderPose.remaining());
	}
	public static void setEyeFovRenderPose(ByteBuffer struct, ByteBuffer RenderPose) { nsetEyeFovRenderPose(memAddress(struct), RenderPose); }
	public static void nsetEyeFovRenderPose(long struct, int index, OVRPosef RenderPose) {
		memCopy(RenderPose.address(), struct + EYEFOV + OVRLayerEyeFov.RENDERPOSE + index * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
	}
	public static void setEyeFovRenderPose(ByteBuffer struct, int index, OVRPosef RenderPose) { nsetEyeFovRenderPose(memAddress(struct), index, RenderPose); }
	public static void nsetEyeFovSensorSampleTime(long struct, double SensorSampleTime) { memPutDouble(struct + EYEFOV + OVRLayerEyeFov.SENSORSAMPLETIME, SensorSampleTime); }
	public static void setEyeFovSensorSampleTime(ByteBuffer struct, double SensorSampleTime) { nsetEyeFovSensorSampleTime(memAddress(struct), SensorSampleTime); }
	public static void nsetEyeFovDepth(long struct, OVRLayerEyeFovDepth EyeFovDepth) { memCopy(EyeFovDepth.address(), struct + EYEFOVDEPTH, OVRLayerEyeFovDepth.SIZEOF); }
	/** Copies the specified {@link OVRLayerEyeFovDepth} struct to the nested {@code EyeFovDepth} struct. */
	public static void setEyeFovDepth(ByteBuffer struct, OVRLayerEyeFovDepth EyeFovDepth) { nsetEyeFovDepth(memAddress(struct), EyeFovDepth); }
	public static void nsetEyeFovDepthHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setEyeFovDepthHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetEyeFovDepthHeader(memAddress(struct), Header); }
	public static void nsetEyeFovDepthHeaderType(long struct, int Type) { memPutInt(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setEyeFovDepthHeaderType(ByteBuffer struct, int Type) { nsetEyeFovDepthHeaderType(memAddress(struct), Type); }
	public static void nsetEyeFovDepthHeaderFlags(long struct, int Flags) { memPutInt(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setEyeFovDepthHeaderFlags(ByteBuffer struct, int Flags) { nsetEyeFovDepthHeaderFlags(memAddress(struct), Flags); }
	public static void nsetEyeFovDepthColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void setEyeFovDepthColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { nsetEyeFovDepthColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetEyeFovDepthColorTexture(long struct, int index, OVRSwapTextureSet ColorTexture) {
		memPutAddress(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.COLORTEXTURE + index * POINTER_SIZE, ColorTexture.address());
	}
	public static void setEyeFovDepthColorTexture(ByteBuffer struct, int index, OVRSwapTextureSet ColorTexture) { nsetEyeFovDepthColorTexture(memAddress(struct), index, ColorTexture); }
	public static void nsetEyeFovDepthViewport(long struct, ByteBuffer Viewport) {
		if ( CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT, Viewport.remaining());
	}
	public static void setEyeFovDepthViewport(ByteBuffer struct, ByteBuffer Viewport) { nsetEyeFovDepthViewport(memAddress(struct), Viewport); }
	public static void nsetEyeFovDepthViewport(long struct, int index, OVRRecti Viewport) {
		memCopy(Viewport.address(), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
	}
	public static void setEyeFovDepthViewport(ByteBuffer struct, int index, OVRRecti Viewport) { nsetEyeFovDepthViewport(memAddress(struct), index, Viewport); }
	public static void nsetEyeFovDepthFov(long struct, ByteBuffer Fov) {
		if ( CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV, Fov.remaining());
	}
	public static void setEyeFovDepthFov(ByteBuffer struct, ByteBuffer Fov) { nsetEyeFovDepthFov(memAddress(struct), Fov); }
	public static void nsetEyeFovDepthFov(long struct, int index, OVRFovPort Fov) {
		memCopy(Fov.address(), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.FOV + index * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
	}
	public static void setEyeFovDepthFov(ByteBuffer struct, int index, OVRFovPort Fov) { nsetEyeFovDepthFov(memAddress(struct), index, Fov); }
	public static void nsetEyeFovDepthRenderPose(long struct, ByteBuffer RenderPose) {
		if ( CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE, RenderPose.remaining());
	}
	public static void setEyeFovDepthRenderPose(ByteBuffer struct, ByteBuffer RenderPose) { nsetEyeFovDepthRenderPose(memAddress(struct), RenderPose); }
	public static void nsetEyeFovDepthRenderPose(long struct, int index, OVRPosef RenderPose) {
		memCopy(RenderPose.address(), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.RENDERPOSE + index * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
	}
	public static void setEyeFovDepthRenderPose(ByteBuffer struct, int index, OVRPosef RenderPose) { nsetEyeFovDepthRenderPose(memAddress(struct), index, RenderPose); }
	public static void nsetEyeFovDepthSensorSampleTime(long struct, double SensorSampleTime) { memPutDouble(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.SENSORSAMPLETIME, SensorSampleTime); }
	public static void setEyeFovDepthSensorSampleTime(ByteBuffer struct, double SensorSampleTime) { nsetEyeFovDepthSensorSampleTime(memAddress(struct), SensorSampleTime); }
	public static void nsetEyeFovDepthDepthTexture(long struct, PointerBuffer DepthTexture) {
		if ( CHECKS ) checkBufferGT(DepthTexture, 2);
		memCopy(memAddress(DepthTexture), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE, DepthTexture.remaining() * POINTER_SIZE);
	}
	public static void setEyeFovDepthDepthTexture(ByteBuffer struct, PointerBuffer DepthTexture) { nsetEyeFovDepthDepthTexture(memAddress(struct), DepthTexture); }
	public static void nsetEyeFovDepthDepthTexture(long struct, int index, OVRSwapTextureSet DepthTexture) {
		memPutAddress(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.DEPTHTEXTURE + index * POINTER_SIZE, DepthTexture.address());
	}
	public static void setEyeFovDepthDepthTexture(ByteBuffer struct, int index, OVRSwapTextureSet DepthTexture) { nsetEyeFovDepthDepthTexture(memAddress(struct), index, DepthTexture); }
	public static void nsetEyeFovDepthProjectionDesc(long struct, OVRTimewarpProjectionDesc ProjectionDesc) { memCopy(ProjectionDesc.address(), struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }
	/** Copies the specified {@link OVRTimewarpProjectionDesc} struct to the nested {@code ProjectionDesc} struct. */
	public static void setEyeFovDepthProjectionDesc(ByteBuffer struct, OVRTimewarpProjectionDesc ProjectionDesc) { nsetEyeFovDepthProjectionDesc(memAddress(struct), ProjectionDesc); }
	public static void nsetEyeFovDepthProjectionDescProjection22(long struct, float Projection22) { memPutFloat(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION22, Projection22); }
	public static void setEyeFovDepthProjectionDescProjection22(ByteBuffer struct, float Projection22) { nsetEyeFovDepthProjectionDescProjection22(memAddress(struct), Projection22); }
	public static void nsetEyeFovDepthProjectionDescProjection23(long struct, float Projection23) { memPutFloat(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION23, Projection23); }
	public static void setEyeFovDepthProjectionDescProjection23(ByteBuffer struct, float Projection23) { nsetEyeFovDepthProjectionDescProjection23(memAddress(struct), Projection23); }
	public static void nsetEyeFovDepthProjectionDescProjection32(long struct, float Projection32) { memPutFloat(struct + EYEFOVDEPTH + OVRLayerEyeFovDepth.PROJECTIONDESC + OVRTimewarpProjectionDesc.PROJECTION32, Projection32); }
	public static void setEyeFovDepthProjectionDescProjection32(ByteBuffer struct, float Projection32) { nsetEyeFovDepthProjectionDescProjection32(memAddress(struct), Projection32); }
	public static void nsetQuad(long struct, OVRLayerQuad Quad) { memCopy(Quad.address(), struct + QUAD, OVRLayerQuad.SIZEOF); }
	/** Copies the specified {@link OVRLayerQuad} struct to the nested {@code Quad} struct. */
	public static void setQuad(ByteBuffer struct, OVRLayerQuad Quad) { nsetQuad(memAddress(struct), Quad); }
	public static void nsetQuadHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + QUAD + OVRLayerQuad.HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setQuadHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetQuadHeader(memAddress(struct), Header); }
	public static void nsetQuadHeaderType(long struct, int Type) { memPutInt(struct + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setQuadHeaderType(ByteBuffer struct, int Type) { nsetQuadHeaderType(memAddress(struct), Type); }
	public static void nsetQuadHeaderFlags(long struct, int Flags) { memPutInt(struct + QUAD + OVRLayerQuad.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setQuadHeaderFlags(ByteBuffer struct, int Flags) { nsetQuadHeaderFlags(memAddress(struct), Flags); }
	public static void nsetQuadColorTexture(long struct, long ColorTexture) { memPutAddress(struct + QUAD + OVRLayerQuad.COLORTEXTURE, ColorTexture); }
	public static void nsetQuadColorTexture(long struct, OVRSwapTextureSet ColorTexture) { nsetQuadColorTexture(struct, ColorTexture.address()); }
	public static void setQuadColorTexture(ByteBuffer struct, OVRSwapTextureSet ColorTexture) { nsetQuadColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetQuadViewport(long struct, OVRRecti Viewport) { memCopy(Viewport.address(), struct + QUAD + OVRLayerQuad.VIEWPORT, OVRRecti.SIZEOF); }
	/** Copies the specified {@link OVRRecti} struct to the nested {@code Viewport} struct. */
	public static void setQuadViewport(ByteBuffer struct, OVRRecti Viewport) { nsetQuadViewport(memAddress(struct), Viewport); }
	public static void nsetQuadViewportPos(long struct, OVRVector2i Pos) { memCopy(Pos.address(), struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	/** Copies the specified {@link OVRVector2i} struct to the nested {@code Pos} struct. */
	public static void setQuadViewportPos(ByteBuffer struct, OVRVector2i Pos) { nsetQuadViewportPos(memAddress(struct), Pos); }
	public static void nsetQuadViewportPosX(long struct, int x) { memPutInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void setQuadViewportPosX(ByteBuffer struct, int x) { nsetQuadViewportPosX(memAddress(struct), x); }
	public static void nsetQuadViewportPosY(long struct, int y) { memPutInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void setQuadViewportPosY(ByteBuffer struct, int y) { nsetQuadViewportPosY(memAddress(struct), y); }
	public static void nsetQuadViewportSize(long struct, OVRSizei Size) { memCopy(Size.address(), struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code Size} struct. */
	public static void setQuadViewportSize(ByteBuffer struct, OVRSizei Size) { nsetQuadViewportSize(memAddress(struct), Size); }
	public static void nsetQuadViewportSizeW(long struct, int w) { memPutInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void setQuadViewportSizeW(ByteBuffer struct, int w) { nsetQuadViewportSizeW(memAddress(struct), w); }
	public static void nsetQuadViewportSizeH(long struct, int h) { memPutInt(struct + QUAD + OVRLayerQuad.VIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void setQuadViewportSizeH(ByteBuffer struct, int h) { nsetQuadViewportSizeH(memAddress(struct), h); }
	public static void nsetQuadQuadPoseCenter(long struct, OVRPosef QuadPoseCenter) { memCopy(QuadPoseCenter.address(), struct + QUAD + OVRLayerQuad.QUADPOSECENTER, OVRPosef.SIZEOF); }
	/** Copies the specified {@link OVRPosef} struct to the nested {@code QuadPoseCenter} struct. */
	public static void setQuadQuadPoseCenter(ByteBuffer struct, OVRPosef QuadPoseCenter) { nsetQuadQuadPoseCenter(memAddress(struct), QuadPoseCenter); }
	public static void nsetQuadQuadPoseCenterOrientation(long struct, OVRQuatf Orientation) { memCopy(Orientation.address(), struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	/** Copies the specified {@link OVRQuatf} struct to the nested {@code Orientation} struct. */
	public static void setQuadQuadPoseCenterOrientation(ByteBuffer struct, OVRQuatf Orientation) { nsetQuadQuadPoseCenterOrientation(memAddress(struct), Orientation); }
	public static void nsetQuadQuadPoseCenterOrientationX(long struct, float x) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void setQuadQuadPoseCenterOrientationX(ByteBuffer struct, float x) { nsetQuadQuadPoseCenterOrientationX(memAddress(struct), x); }
	public static void nsetQuadQuadPoseCenterOrientationY(long struct, float y) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void setQuadQuadPoseCenterOrientationY(ByteBuffer struct, float y) { nsetQuadQuadPoseCenterOrientationY(memAddress(struct), y); }
	public static void nsetQuadQuadPoseCenterOrientationZ(long struct, float z) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void setQuadQuadPoseCenterOrientationZ(ByteBuffer struct, float z) { nsetQuadQuadPoseCenterOrientationZ(memAddress(struct), z); }
	public static void nsetQuadQuadPoseCenterOrientationW(long struct, float w) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void setQuadQuadPoseCenterOrientationW(ByteBuffer struct, float w) { nsetQuadQuadPoseCenterOrientationW(memAddress(struct), w); }
	public static void nsetQuadQuadPoseCenterPosition(long struct, OVRVector3f Position) { memCopy(Position.address(), struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code Position} struct. */
	public static void setQuadQuadPoseCenterPosition(ByteBuffer struct, OVRVector3f Position) { nsetQuadQuadPoseCenterPosition(memAddress(struct), Position); }
	public static void nsetQuadQuadPoseCenterPositionX(long struct, float x) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void setQuadQuadPoseCenterPositionX(ByteBuffer struct, float x) { nsetQuadQuadPoseCenterPositionX(memAddress(struct), x); }
	public static void nsetQuadQuadPoseCenterPositionY(long struct, float y) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void setQuadQuadPoseCenterPositionY(ByteBuffer struct, float y) { nsetQuadQuadPoseCenterPositionY(memAddress(struct), y); }
	public static void nsetQuadQuadPoseCenterPositionZ(long struct, float z) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void setQuadQuadPoseCenterPositionZ(ByteBuffer struct, float z) { nsetQuadQuadPoseCenterPositionZ(memAddress(struct), z); }
	public static void nsetQuadQuadSize(long struct, OVRVector2f QuadSize) { memCopy(QuadSize.address(), struct + QUAD + OVRLayerQuad.QUADSIZE, OVRVector2f.SIZEOF); }
	/** Copies the specified {@link OVRVector2f} struct to the nested {@code QuadSize} struct. */
	public static void setQuadQuadSize(ByteBuffer struct, OVRVector2f QuadSize) { nsetQuadQuadSize(memAddress(struct), QuadSize); }
	public static void nsetQuadQuadSizeX(long struct, float x) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.X, x); }
	public static void setQuadQuadSizeX(ByteBuffer struct, float x) { nsetQuadQuadSizeX(memAddress(struct), x); }
	public static void nsetQuadQuadSizeY(long struct, float y) { memPutFloat(struct + QUAD + OVRLayerQuad.QUADSIZE + OVRVector2f.Y, y); }
	public static void setQuadQuadSizeY(ByteBuffer struct, float y) { nsetQuadQuadSizeY(memAddress(struct), y); }
	public static void nsetDirect(long struct, OVRLayerDirect Direct) { memCopy(Direct.address(), struct + DIRECT, OVRLayerDirect.SIZEOF); }
	/** Copies the specified {@link OVRLayerDirect} struct to the nested {@code Direct} struct. */
	public static void setDirect(ByteBuffer struct, OVRLayerDirect Direct) { nsetDirect(memAddress(struct), Direct); }
	public static void nsetDirectHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + DIRECT + OVRLayerDirect.HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setDirectHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetDirectHeader(memAddress(struct), Header); }
	public static void nsetDirectHeaderType(long struct, int Type) { memPutInt(struct + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setDirectHeaderType(ByteBuffer struct, int Type) { nsetDirectHeaderType(memAddress(struct), Type); }
	public static void nsetDirectHeaderFlags(long struct, int Flags) { memPutInt(struct + DIRECT + OVRLayerDirect.HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setDirectHeaderFlags(ByteBuffer struct, int Flags) { nsetDirectHeaderFlags(memAddress(struct), Flags); }
	public static void nsetDirectColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), struct + DIRECT + OVRLayerDirect.COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void setDirectColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { nsetDirectColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetDirectColorTexture(long struct, int index, OVRSwapTextureSet ColorTexture) {
		memPutAddress(struct + DIRECT + OVRLayerDirect.COLORTEXTURE + index * POINTER_SIZE, ColorTexture.address());
	}
	public static void setDirectColorTexture(ByteBuffer struct, int index, OVRSwapTextureSet ColorTexture) { nsetDirectColorTexture(memAddress(struct), index, ColorTexture); }
	public static void nsetDirectViewport(long struct, ByteBuffer Viewport) {
		if ( CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), struct + DIRECT + OVRLayerDirect.VIEWPORT, Viewport.remaining());
	}
	public static void setDirectViewport(ByteBuffer struct, ByteBuffer Viewport) { nsetDirectViewport(memAddress(struct), Viewport); }
	public static void nsetDirectViewport(long struct, int index, OVRRecti Viewport) {
		memCopy(Viewport.address(), struct + DIRECT + OVRLayerDirect.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
	}
	public static void setDirectViewport(ByteBuffer struct, int index, OVRRecti Viewport) { nsetDirectViewport(memAddress(struct), index, Viewport); }

	// -----------------------------------

	/** An array of {@link OVRLayerUnion} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerUnion, Buffer> {

		/**
		 * Creates a new {@link OVRLayerUnion.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerUnion#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerUnion newInstance(long address) {
			return new OVRLayerUnion(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRLayerHeader getHeader() { return ngetHeader(address()); }
		public int getHeaderType() { return ngetHeaderType(address()); }
		public int getHeaderFlags() { return ngetHeaderFlags(address()); }
		public OVRLayerEyeFov getEyeFov() { return ngetEyeFov(address()); }
		public OVRLayerHeader getEyeFovHeader() { return ngetEyeFovHeader(address()); }
		public int getEyeFovHeaderType() { return ngetEyeFovHeaderType(address()); }
		public int getEyeFovHeaderFlags() { return ngetEyeFovHeaderFlags(address()); }
		public void getEyeFovColorTexture(PointerBuffer ColorTexture) { ngetEyeFovColorTexture(address(), ColorTexture); }
		public OVRSwapTextureSet getEyeFovColorTexture(int index) { return ngetEyeFovColorTexture(address(), index); }
		public void getEyeFovViewport(ByteBuffer Viewport) { ngetEyeFovViewport(address(), Viewport); }
		public OVRRecti getEyeFovViewport(int index) { return ngetEyeFovViewport(address(), index); }
		public void getEyeFovFov(ByteBuffer Fov) { ngetEyeFovFov(address(), Fov); }
		public OVRFovPort getEyeFovFov(int index) { return ngetEyeFovFov(address(), index); }
		public void getEyeFovRenderPose(ByteBuffer RenderPose) { ngetEyeFovRenderPose(address(), RenderPose); }
		public OVRPosef getEyeFovRenderPose(int index) { return ngetEyeFovRenderPose(address(), index); }
		public double getEyeFovSensorSampleTime() { return ngetEyeFovSensorSampleTime(address()); }
		public OVRLayerEyeFovDepth getEyeFovDepth() { return ngetEyeFovDepth(address()); }
		public OVRLayerHeader getEyeFovDepthHeader() { return ngetEyeFovDepthHeader(address()); }
		public int getEyeFovDepthHeaderType() { return ngetEyeFovDepthHeaderType(address()); }
		public int getEyeFovDepthHeaderFlags() { return ngetEyeFovDepthHeaderFlags(address()); }
		public void getEyeFovDepthColorTexture(PointerBuffer ColorTexture) { ngetEyeFovDepthColorTexture(address(), ColorTexture); }
		public OVRSwapTextureSet getEyeFovDepthColorTexture(int index) { return ngetEyeFovDepthColorTexture(address(), index); }
		public void getEyeFovDepthViewport(ByteBuffer Viewport) { ngetEyeFovDepthViewport(address(), Viewport); }
		public OVRRecti getEyeFovDepthViewport(int index) { return ngetEyeFovDepthViewport(address(), index); }
		public void getEyeFovDepthFov(ByteBuffer Fov) { ngetEyeFovDepthFov(address(), Fov); }
		public OVRFovPort getEyeFovDepthFov(int index) { return ngetEyeFovDepthFov(address(), index); }
		public void getEyeFovDepthRenderPose(ByteBuffer RenderPose) { ngetEyeFovDepthRenderPose(address(), RenderPose); }
		public OVRPosef getEyeFovDepthRenderPose(int index) { return ngetEyeFovDepthRenderPose(address(), index); }
		public double getEyeFovDepthSensorSampleTime() { return ngetEyeFovDepthSensorSampleTime(address()); }
		public void getEyeFovDepthDepthTexture(PointerBuffer DepthTexture) { ngetEyeFovDepthDepthTexture(address(), DepthTexture); }
		public OVRSwapTextureSet getEyeFovDepthDepthTexture(int index) { return ngetEyeFovDepthDepthTexture(address(), index); }
		public OVRTimewarpProjectionDesc getEyeFovDepthProjectionDesc() { return ngetEyeFovDepthProjectionDesc(address()); }
		public float getEyeFovDepthProjectionDescProjection22() { return ngetEyeFovDepthProjectionDescProjection22(address()); }
		public float getEyeFovDepthProjectionDescProjection23() { return ngetEyeFovDepthProjectionDescProjection23(address()); }
		public float getEyeFovDepthProjectionDescProjection32() { return ngetEyeFovDepthProjectionDescProjection32(address()); }
		public OVRLayerQuad getQuad() { return ngetQuad(address()); }
		public OVRLayerHeader getQuadHeader() { return ngetQuadHeader(address()); }
		public int getQuadHeaderType() { return ngetQuadHeaderType(address()); }
		public int getQuadHeaderFlags() { return ngetQuadHeaderFlags(address()); }
		public OVRSwapTextureSet getQuadColorTexture() { return ngetQuadColorTextureStruct(address()); }
		public OVRRecti getQuadViewport() { return ngetQuadViewport(address()); }
		public OVRVector2i getQuadViewportPos() { return ngetQuadViewportPos(address()); }
		public int getQuadViewportPosX() { return ngetQuadViewportPosX(address()); }
		public int getQuadViewportPosY() { return ngetQuadViewportPosY(address()); }
		public OVRSizei getQuadViewportSize() { return ngetQuadViewportSize(address()); }
		public int getQuadViewportSizeW() { return ngetQuadViewportSizeW(address()); }
		public int getQuadViewportSizeH() { return ngetQuadViewportSizeH(address()); }
		public OVRPosef getQuadQuadPoseCenter() { return ngetQuadQuadPoseCenter(address()); }
		public OVRQuatf getQuadQuadPoseCenterOrientation() { return ngetQuadQuadPoseCenterOrientation(address()); }
		public float getQuadQuadPoseCenterOrientationX() { return ngetQuadQuadPoseCenterOrientationX(address()); }
		public float getQuadQuadPoseCenterOrientationY() { return ngetQuadQuadPoseCenterOrientationY(address()); }
		public float getQuadQuadPoseCenterOrientationZ() { return ngetQuadQuadPoseCenterOrientationZ(address()); }
		public float getQuadQuadPoseCenterOrientationW() { return ngetQuadQuadPoseCenterOrientationW(address()); }
		public OVRVector3f getQuadQuadPoseCenterPosition() { return ngetQuadQuadPoseCenterPosition(address()); }
		public float getQuadQuadPoseCenterPositionX() { return ngetQuadQuadPoseCenterPositionX(address()); }
		public float getQuadQuadPoseCenterPositionY() { return ngetQuadQuadPoseCenterPositionY(address()); }
		public float getQuadQuadPoseCenterPositionZ() { return ngetQuadQuadPoseCenterPositionZ(address()); }
		public OVRVector2f getQuadQuadSize() { return ngetQuadQuadSize(address()); }
		public float getQuadQuadSizeX() { return ngetQuadQuadSizeX(address()); }
		public float getQuadQuadSizeY() { return ngetQuadQuadSizeY(address()); }
		public OVRLayerDirect getDirect() { return ngetDirect(address()); }
		public OVRLayerHeader getDirectHeader() { return ngetDirectHeader(address()); }
		public int getDirectHeaderType() { return ngetDirectHeaderType(address()); }
		public int getDirectHeaderFlags() { return ngetDirectHeaderFlags(address()); }
		public void getDirectColorTexture(PointerBuffer ColorTexture) { ngetDirectColorTexture(address(), ColorTexture); }
		public OVRSwapTextureSet getDirectColorTexture(int index) { return ngetDirectColorTexture(address(), index); }
		public void getDirectViewport(ByteBuffer Viewport) { ngetDirectViewport(address(), Viewport); }
		public OVRRecti getDirectViewport(int index) { return ngetDirectViewport(address(), index); }

		public OVRLayerUnion.Buffer setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
		public OVRLayerUnion.Buffer setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
		public OVRLayerUnion.Buffer setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
		public OVRLayerUnion.Buffer setEyeFov(OVRLayerEyeFov EyeFov) { nsetEyeFov(address(), EyeFov); return this; }
		public OVRLayerUnion.Buffer setEyeFovHeader(OVRLayerHeader Header) { nsetEyeFovHeader(address(), Header); return this; }
		public OVRLayerUnion.Buffer setEyeFovHeaderType(int Type) { nsetEyeFovHeaderType(address(), Type); return this; }
		public OVRLayerUnion.Buffer setEyeFovHeaderFlags(int Flags) { nsetEyeFovHeaderFlags(address(), Flags); return this; }
		public OVRLayerUnion.Buffer setEyeFovColorTexture(PointerBuffer ColorTexture) { nsetEyeFovColorTexture(address(), ColorTexture); return this; }
		public OVRLayerUnion.Buffer setEyeFovColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetEyeFovColorTexture(address(), index, ColorTexture); return this; }
		public OVRLayerUnion.Buffer setEyeFovViewport(ByteBuffer Viewport) { nsetEyeFovViewport(address(), Viewport); return this; }
		public OVRLayerUnion.Buffer setEyeFovViewport(int index, OVRRecti Viewport) { nsetEyeFovViewport(address(), index, Viewport); return this; }
		public OVRLayerUnion.Buffer setEyeFovFov(ByteBuffer Fov) { nsetEyeFovFov(address(), Fov); return this; }
		public OVRLayerUnion.Buffer setEyeFovFov(int index, OVRFovPort Fov) { nsetEyeFovFov(address(), index, Fov); return this; }
		public OVRLayerUnion.Buffer setEyeFovRenderPose(ByteBuffer RenderPose) { nsetEyeFovRenderPose(address(), RenderPose); return this; }
		public OVRLayerUnion.Buffer setEyeFovRenderPose(int index, OVRPosef RenderPose) { nsetEyeFovRenderPose(address(), index, RenderPose); return this; }
		public OVRLayerUnion.Buffer setEyeFovSensorSampleTime(double SensorSampleTime) { nsetEyeFovSensorSampleTime(address(), SensorSampleTime); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepth(OVRLayerEyeFovDepth EyeFovDepth) { nsetEyeFovDepth(address(), EyeFovDepth); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthHeader(OVRLayerHeader Header) { nsetEyeFovDepthHeader(address(), Header); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthHeaderType(int Type) { nsetEyeFovDepthHeaderType(address(), Type); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthHeaderFlags(int Flags) { nsetEyeFovDepthHeaderFlags(address(), Flags); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthColorTexture(PointerBuffer ColorTexture) { nsetEyeFovDepthColorTexture(address(), ColorTexture); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetEyeFovDepthColorTexture(address(), index, ColorTexture); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthViewport(ByteBuffer Viewport) { nsetEyeFovDepthViewport(address(), Viewport); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthViewport(int index, OVRRecti Viewport) { nsetEyeFovDepthViewport(address(), index, Viewport); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthFov(ByteBuffer Fov) { nsetEyeFovDepthFov(address(), Fov); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthFov(int index, OVRFovPort Fov) { nsetEyeFovDepthFov(address(), index, Fov); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthRenderPose(ByteBuffer RenderPose) { nsetEyeFovDepthRenderPose(address(), RenderPose); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthRenderPose(int index, OVRPosef RenderPose) { nsetEyeFovDepthRenderPose(address(), index, RenderPose); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthSensorSampleTime(double SensorSampleTime) { nsetEyeFovDepthSensorSampleTime(address(), SensorSampleTime); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthDepthTexture(PointerBuffer DepthTexture) { nsetEyeFovDepthDepthTexture(address(), DepthTexture); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthDepthTexture(int index, OVRSwapTextureSet DepthTexture) { nsetEyeFovDepthDepthTexture(address(), index, DepthTexture); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthProjectionDesc(OVRTimewarpProjectionDesc ProjectionDesc) { nsetEyeFovDepthProjectionDesc(address(), ProjectionDesc); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthProjectionDescProjection22(float Projection22) { nsetEyeFovDepthProjectionDescProjection22(address(), Projection22); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthProjectionDescProjection23(float Projection23) { nsetEyeFovDepthProjectionDescProjection23(address(), Projection23); return this; }
		public OVRLayerUnion.Buffer setEyeFovDepthProjectionDescProjection32(float Projection32) { nsetEyeFovDepthProjectionDescProjection32(address(), Projection32); return this; }
		public OVRLayerUnion.Buffer setQuad(OVRLayerQuad Quad) { nsetQuad(address(), Quad); return this; }
		public OVRLayerUnion.Buffer setQuadHeader(OVRLayerHeader Header) { nsetQuadHeader(address(), Header); return this; }
		public OVRLayerUnion.Buffer setQuadHeaderType(int Type) { nsetQuadHeaderType(address(), Type); return this; }
		public OVRLayerUnion.Buffer setQuadHeaderFlags(int Flags) { nsetQuadHeaderFlags(address(), Flags); return this; }
		public OVRLayerUnion.Buffer setQuadColorTexture(OVRSwapTextureSet ColorTexture) { nsetQuadColorTexture(address(), ColorTexture); return this; }
		public OVRLayerUnion.Buffer setQuadViewport(OVRRecti Viewport) { nsetQuadViewport(address(), Viewport); return this; }
		public OVRLayerUnion.Buffer setQuadViewportPos(OVRVector2i Pos) { nsetQuadViewportPos(address(), Pos); return this; }
		public OVRLayerUnion.Buffer setQuadViewportPosX(int x) { nsetQuadViewportPosX(address(), x); return this; }
		public OVRLayerUnion.Buffer setQuadViewportPosY(int y) { nsetQuadViewportPosY(address(), y); return this; }
		public OVRLayerUnion.Buffer setQuadViewportSize(OVRSizei Size) { nsetQuadViewportSize(address(), Size); return this; }
		public OVRLayerUnion.Buffer setQuadViewportSizeW(int w) { nsetQuadViewportSizeW(address(), w); return this; }
		public OVRLayerUnion.Buffer setQuadViewportSizeH(int h) { nsetQuadViewportSizeH(address(), h); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenter(OVRPosef QuadPoseCenter) { nsetQuadQuadPoseCenter(address(), QuadPoseCenter); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterOrientation(OVRQuatf Orientation) { nsetQuadQuadPoseCenterOrientation(address(), Orientation); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterOrientationX(float x) { nsetQuadQuadPoseCenterOrientationX(address(), x); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterOrientationY(float y) { nsetQuadQuadPoseCenterOrientationY(address(), y); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterOrientationZ(float z) { nsetQuadQuadPoseCenterOrientationZ(address(), z); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterOrientationW(float w) { nsetQuadQuadPoseCenterOrientationW(address(), w); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterPosition(OVRVector3f Position) { nsetQuadQuadPoseCenterPosition(address(), Position); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterPositionX(float x) { nsetQuadQuadPoseCenterPositionX(address(), x); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterPositionY(float y) { nsetQuadQuadPoseCenterPositionY(address(), y); return this; }
		public OVRLayerUnion.Buffer setQuadQuadPoseCenterPositionZ(float z) { nsetQuadQuadPoseCenterPositionZ(address(), z); return this; }
		public OVRLayerUnion.Buffer setQuadQuadSize(OVRVector2f QuadSize) { nsetQuadQuadSize(address(), QuadSize); return this; }
		public OVRLayerUnion.Buffer setQuadQuadSizeX(float x) { nsetQuadQuadSizeX(address(), x); return this; }
		public OVRLayerUnion.Buffer setQuadQuadSizeY(float y) { nsetQuadQuadSizeY(address(), y); return this; }
		public OVRLayerUnion.Buffer setDirect(OVRLayerDirect Direct) { nsetDirect(address(), Direct); return this; }
		public OVRLayerUnion.Buffer setDirectHeader(OVRLayerHeader Header) { nsetDirectHeader(address(), Header); return this; }
		public OVRLayerUnion.Buffer setDirectHeaderType(int Type) { nsetDirectHeaderType(address(), Type); return this; }
		public OVRLayerUnion.Buffer setDirectHeaderFlags(int Flags) { nsetDirectHeaderFlags(address(), Flags); return this; }
		public OVRLayerUnion.Buffer setDirectColorTexture(PointerBuffer ColorTexture) { nsetDirectColorTexture(address(), ColorTexture); return this; }
		public OVRLayerUnion.Buffer setDirectColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetDirectColorTexture(address(), index, ColorTexture); return this; }
		public OVRLayerUnion.Buffer setDirectViewport(ByteBuffer Viewport) { nsetDirectViewport(address(), Viewport); return this; }
		public OVRLayerUnion.Buffer setDirectViewport(int index, OVRRecti Viewport) { nsetDirectViewport(address(), index, Viewport); return this; }

	}

}