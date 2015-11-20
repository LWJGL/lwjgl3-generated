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
 * 
 * <h3>ovrLayerEyeFovDepth members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Header</td><td class="nw">{@link OVRLayerHeader ovrLayerHeader}</td><td>{@code Header.Type} must be {@link OVR#ovrLayerType_EyeFovDepth}.</td></tr>
 * <tr><td>ColorTexture</td><td class="nw">ovrSwapTextureSet *[2]</td><td>{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be {@code NULL}.</td></tr>
 * <tr><td>Viewport</td><td class="nw">ovrRecti[2]</td><td>specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.</td></tr>
 * <tr><td>Fov</td><td class="nw">ovrFovPort[2]</td><td>the viewport field of view</td></tr>
 * <tr><td>RenderPose</td><td class="nw">ovrPosef[2]</td><td>specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
 * {@link OVRUtil#ovr_CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.</td></tr>
 * <tr><td>SensorSampleTime</td><td class="nw">double</td><td>specifies the timestamp when the source {@code ovrPosef} (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
 * {@link OVR#ovr_GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState}. The main purpose for this is to accurately track app
 * tracking latency.</td></tr>
 * <tr><td>DepthTexture</td><td class="nw">ovrSwapTextureSet *[2]</td><td>depth texture for positional timewarp. Must map 1:1 to the {@code ColorTexture}.</td></tr>
 * <tr><td>ProjectionDesc</td><td class="nw">{@link OVRTimewarpProjectionDesc ovrTimewarpProjectionDesc}</td><td>specifies how to convert {@code DepthTexture} information into meters</td></tr>
 * </table>
 */
public class OVRLayerEyeFovDepth extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		FOV,
		RENDERPOSE,
		SENSORSAMPLETIME,
		DEPTHTEXTURE,
		PROJECTIONDESC;

	static {
		Layout layout = __struct(
			__member(OVRLayerHeader.SIZEOF, OVRLayerHeader.__ALIGNMENT),
			__array(Pointer.POINTER_SIZE, 2),
			__array(OVRRecti.SIZEOF, OVRRecti.__ALIGNMENT, 2),
			__array(OVRFovPort.SIZEOF, OVRFovPort.__ALIGNMENT, 2),
			__array(OVRPosef.SIZEOF, OVRPosef.__ALIGNMENT, 2),
			__member(8),
			__array(Pointer.POINTER_SIZE, 2),
			__member(OVRTimewarpProjectionDesc.SIZEOF, OVRTimewarpProjectionDesc.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HEADER = layout.offsetof(0);
		COLORTEXTURE = layout.offsetof(1);
		VIEWPORT = layout.offsetof(2);
		FOV = layout.offsetof(3);
		RENDERPOSE = layout.offsetof(4);
		SENSORSAMPLETIME = layout.offsetof(5);
		DEPTHTEXTURE = layout.offsetof(6);
		PROJECTIONDESC = layout.offsetof(7);
	}

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

	/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
	public OVRLayerHeader Header() { return nHeader(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
	public PointerBuffer ColorTexture() { return nColorTexture(address()); }
	/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code ColorTexture}. */
	public OVRSwapTextureSet ColorTexture(int index) { return nColorTexture(address(), index); }
	/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
	public OVRRecti.Buffer Viewport() { return nViewport(address()); }
	/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
	public OVRRecti Viewport(int index) { return nViewport(address(), index); }
	/** Returns a {@link OVRFovPort}.Buffer view of the {@code Fov} field. */
	public OVRFovPort.Buffer Fov() { return nFov(address()); }
	/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code Fov} field. */
	public OVRFovPort Fov(int index) { return nFov(address(), index); }
	/** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
	public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
	/** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
	public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
	/** Returns the value of the {@code SensorSampleTime} field. */
	public double SensorSampleTime() { return nSensorSampleTime(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code DepthTexture} field. */
	public PointerBuffer DepthTexture() { return nDepthTexture(address()); }
	/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code DepthTexture}. */
	public OVRSwapTextureSet DepthTexture(int index) { return nDepthTexture(address(), index); }
	/** Returns a {@link OVRTimewarpProjectionDesc} view of the {@code ProjectionDesc} field. */
	public OVRTimewarpProjectionDesc ProjectionDesc() { return nProjectionDesc(address()); }

	/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
	public OVRLayerEyeFovDepth Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
	public OVRLayerEyeFovDepth ColorTexture(PointerBuffer value) { nColorTexture(address(), value); return this; }
	/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code ColorTexture} field. */
	public OVRLayerEyeFovDepth ColorTexture(int index, OVRSwapTextureSet value) { nColorTexture(address(), index, value); return this; }
	/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
	public OVRLayerEyeFovDepth Viewport(OVRRecti.Buffer value) { nViewport(address(), value); return this; }
	/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
	public OVRLayerEyeFovDepth Viewport(int index, OVRRecti value) { nViewport(address(), index, value); return this; }
	/** Copies the specified {@link OVRFovPort.Buffer} to the {@code Fov} field. */
	public OVRLayerEyeFovDepth Fov(OVRFovPort.Buffer value) { nFov(address(), value); return this; }
	/** Copies the specified {@link OVRFovPort} at the specified index of the {@code Fov} field. */
	public OVRLayerEyeFovDepth Fov(int index, OVRFovPort value) { nFov(address(), index, value); return this; }
	/** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
	public OVRLayerEyeFovDepth RenderPose(OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
	/** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
	public OVRLayerEyeFovDepth RenderPose(int index, OVRPosef value) { nRenderPose(address(), index, value); return this; }
	/** Sets the specified value to the {@code SensorSampleTime} field. */
	public OVRLayerEyeFovDepth SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code DepthTexture} field. */
	public OVRLayerEyeFovDepth DepthTexture(PointerBuffer value) { nDepthTexture(address(), value); return this; }
	/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code DepthTexture} field. */
	public OVRLayerEyeFovDepth DepthTexture(int index, OVRSwapTextureSet value) { nDepthTexture(address(), index, value); return this; }
	/** Copies the specified {@link OVRTimewarpProjectionDesc} to the {@code ProjectionDesc} field. */
	public OVRLayerEyeFovDepth ProjectionDesc(OVRTimewarpProjectionDesc value) { nProjectionDesc(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerEyeFovDepth set(
		OVRLayerHeader Header,
		PointerBuffer ColorTexture,
		OVRRecti.Buffer Viewport,
		OVRFovPort.Buffer Fov,
		OVRPosef.Buffer RenderPose,
		double SensorSampleTime,
		PointerBuffer DepthTexture,
		OVRTimewarpProjectionDesc ProjectionDesc
	) {
		Header(Header);
		ColorTexture(ColorTexture);
		Viewport(Viewport);
		Fov(Fov);
		RenderPose(RenderPose);
		SensorSampleTime(SensorSampleTime);
		DepthTexture(DepthTexture);
		ProjectionDesc(ProjectionDesc);

		return this;
	}

	/** Unsafe version of {@link #set(OVRLayerEyeFovDepth) set}. */
	public OVRLayerEyeFovDepth nset(long struct) {
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
	public OVRLayerEyeFovDepth set(OVRLayerEyeFovDepth src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRLayerEyeFovDepth) set}. */
	public OVRLayerEyeFovDepth set(ByteBuffer struct) {
		if ( CHECKS )
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

	/**
	 * Create a {@link OVRLayerEyeFovDepth.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Header}. */
	public static OVRLayerHeader nHeader(long struct) { return new OVRLayerHeader(struct + OVRLayerEyeFovDepth.HEADER); }
	/** Unsafe version of {@link #ColorTexture}. */
	public static PointerBuffer nColorTexture(long struct) {
		return memPointerBuffer(struct + OVRLayerEyeFovDepth.COLORTEXTURE, 2);
	}
	/** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
	public static OVRSwapTextureSet nColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(memGetAddress(struct + OVRLayerEyeFovDepth.COLORTEXTURE + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #Viewport}. */
	public static OVRRecti.Buffer nViewport(long struct) {
		return OVRRecti.createBuffer(struct + OVRLayerEyeFovDepth.VIEWPORT, 2);
	}
	/** Unsafe version of {@link #Viewport(int) Viewport}. */
	public static OVRRecti nViewport(long struct, int index) {
		return new OVRRecti(struct + OVRLayerEyeFovDepth.VIEWPORT + index * OVRRecti.SIZEOF);
	}
	/** Unsafe version of {@link #Fov}. */
	public static OVRFovPort.Buffer nFov(long struct) {
		return OVRFovPort.createBuffer(struct + OVRLayerEyeFovDepth.FOV, 2);
	}
	/** Unsafe version of {@link #Fov(int) Fov}. */
	public static OVRFovPort nFov(long struct, int index) {
		return new OVRFovPort(struct + OVRLayerEyeFovDepth.FOV + index * OVRFovPort.SIZEOF);
	}
	/** Unsafe version of {@link #RenderPose}. */
	public static OVRPosef.Buffer nRenderPose(long struct) {
		return OVRPosef.createBuffer(struct + OVRLayerEyeFovDepth.RENDERPOSE, 2);
	}
	/** Unsafe version of {@link #RenderPose(int) RenderPose}. */
	public static OVRPosef nRenderPose(long struct, int index) {
		return new OVRPosef(struct + OVRLayerEyeFovDepth.RENDERPOSE + index * OVRPosef.SIZEOF);
	}
	/** Unsafe version of {@link #SensorSampleTime}. */
	public static double nSensorSampleTime(long struct) { return memGetDouble(struct + OVRLayerEyeFovDepth.SENSORSAMPLETIME); }
	/** Unsafe version of {@link #DepthTexture}. */
	public static PointerBuffer nDepthTexture(long struct) {
		return memPointerBuffer(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE, 2);
	}
	/** Unsafe version of {@link #DepthTexture(int) DepthTexture}. */
	public static OVRSwapTextureSet nDepthTexture(long struct, int index) {
		return new OVRSwapTextureSet(memGetAddress(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #ProjectionDesc}. */
	public static OVRTimewarpProjectionDesc nProjectionDesc(long struct) { return new OVRTimewarpProjectionDesc(struct + OVRLayerEyeFovDepth.PROJECTIONDESC); }

	/** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
	public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.HEADER, OVRLayerHeader.SIZEOF); }
	/** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
	public static void nColorTexture(long struct, PointerBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(memAddress(value), struct + OVRLayerEyeFovDepth.COLORTEXTURE, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #ColorTexture(int, OVRSwapTextureSet) ColorTexture}. */
	public static void nColorTexture(long struct, int index, OVRSwapTextureSet value) { memPutAddress(struct + OVRLayerEyeFovDepth.COLORTEXTURE + index * POINTER_SIZE, value.address()); }
	/** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
	public static void nViewport(long struct, OVRRecti.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerEyeFovDepth.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
	}
	/** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
	public static void nViewport(long struct, int index, OVRRecti value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF); }
	/** Unsafe version of {@link #Fov(OVRFovPort.Buffer) Fov}. */
	public static void nFov(long struct, OVRFovPort.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerEyeFovDepth.FOV, value.remaining() * OVRFovPort.SIZEOF);
	}
	/** Unsafe version of {@link #Fov(int, OVRFovPort) Fov}. */
	public static void nFov(long struct, int index, OVRFovPort value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.FOV + index * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF); }
	/** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
	public static void nRenderPose(long struct, OVRPosef.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerEyeFovDepth.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
	}
	/** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
	public static void nRenderPose(long struct, int index, OVRPosef value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.RENDERPOSE + index * OVRPosef.SIZEOF, OVRPosef.SIZEOF); }
	/** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
	public static void nSensorSampleTime(long struct, double value) { memPutDouble(struct + OVRLayerEyeFovDepth.SENSORSAMPLETIME, value); }
	/** Unsafe version of {@link #DepthTexture(PointerBuffer) DepthTexture}. */
	public static void nDepthTexture(long struct, PointerBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(memAddress(value), struct + OVRLayerEyeFovDepth.DEPTHTEXTURE, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #DepthTexture(int, OVRSwapTextureSet) DepthTexture}. */
	public static void nDepthTexture(long struct, int index, OVRSwapTextureSet value) { memPutAddress(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE + index * POINTER_SIZE, value.address()); }
	/** Unsafe version of {@link #ProjectionDesc(OVRTimewarpProjectionDesc) ProjectionDesc}. */
	public static void nProjectionDesc(long struct, OVRTimewarpProjectionDesc value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }

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

		/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
		public OVRLayerHeader Header() { return nHeader(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
		public PointerBuffer ColorTexture() { return nColorTexture(address()); }
		/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code ColorTexture}. */
		public OVRSwapTextureSet ColorTexture(int index) { return nColorTexture(address(), index); }
		/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
		public OVRRecti.Buffer Viewport() { return nViewport(address()); }
		/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
		public OVRRecti Viewport(int index) { return nViewport(address(), index); }
		/** Returns a {@link OVRFovPort}.Buffer view of the {@code Fov} field. */
		public OVRFovPort.Buffer Fov() { return nFov(address()); }
		/** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code Fov} field. */
		public OVRFovPort Fov(int index) { return nFov(address(), index); }
		/** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
		public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
		/** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
		public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
		/** Returns the value of the {@code SensorSampleTime} field. */
		public double SensorSampleTime() { return nSensorSampleTime(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code DepthTexture} field. */
		public PointerBuffer DepthTexture() { return nDepthTexture(address()); }
		/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code DepthTexture}. */
		public OVRSwapTextureSet DepthTexture(int index) { return nDepthTexture(address(), index); }
		/** Returns a {@link OVRTimewarpProjectionDesc} view of the {@code ProjectionDesc} field. */
		public OVRTimewarpProjectionDesc ProjectionDesc() { return nProjectionDesc(address()); }

		/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
		public OVRLayerEyeFovDepth.Buffer Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
		public OVRLayerEyeFovDepth.Buffer ColorTexture(PointerBuffer value) { nColorTexture(address(), value); return this; }
		/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code ColorTexture} field. */
		public OVRLayerEyeFovDepth.Buffer ColorTexture(int index, OVRSwapTextureSet value) { nColorTexture(address(), index, value); return this; }
		/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
		public OVRLayerEyeFovDepth.Buffer Viewport(OVRRecti.Buffer value) { nViewport(address(), value); return this; }
		/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
		public OVRLayerEyeFovDepth.Buffer Viewport(int index, OVRRecti value) { nViewport(address(), index, value); return this; }
		/** Copies the specified {@link OVRFovPort.Buffer} to the {@code Fov} field. */
		public OVRLayerEyeFovDepth.Buffer Fov(OVRFovPort.Buffer value) { nFov(address(), value); return this; }
		/** Copies the specified {@link OVRFovPort} at the specified index of the {@code Fov} field. */
		public OVRLayerEyeFovDepth.Buffer Fov(int index, OVRFovPort value) { nFov(address(), index, value); return this; }
		/** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
		public OVRLayerEyeFovDepth.Buffer RenderPose(OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
		/** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
		public OVRLayerEyeFovDepth.Buffer RenderPose(int index, OVRPosef value) { nRenderPose(address(), index, value); return this; }
		/** Sets the specified value to the {@code SensorSampleTime} field. */
		public OVRLayerEyeFovDepth.Buffer SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code DepthTexture} field. */
		public OVRLayerEyeFovDepth.Buffer DepthTexture(PointerBuffer value) { nDepthTexture(address(), value); return this; }
		/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code DepthTexture} field. */
		public OVRLayerEyeFovDepth.Buffer DepthTexture(int index, OVRSwapTextureSet value) { nDepthTexture(address(), index, value); return this; }
		/** Copies the specified {@link OVRTimewarpProjectionDesc} to the {@code ProjectionDesc} field. */
		public OVRLayerEyeFovDepth.Buffer ProjectionDesc(OVRTimewarpProjectionDesc value) { nProjectionDesc(address(), value); return this; }

	}

}