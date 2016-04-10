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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both {@link OVR#ovrLayerType_Quad}. This type of layer
 * represents a single object placed in the world and not a stereo view of the world itself.
 * 
 * <p>A typical use of {@link OVR#ovrLayerType_Quad} is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
 * as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
 * fidelity of the GUI.</p>
 * 
 * <p>Quad layers are visible from both sides; they are not back-face culled.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Header} &ndash; {@code Header.Type} must be {@link OVR#ovrLayerType_Quad}</li>
 * <li>{@code ColorTexture} &ndash; contains a single image, never with any stereo view</li>
 * <li>{@code Viewport} &ndash; specifies the ColorTexture sub-rect UV coordinates</li>
 * <li>{@code QuadPoseCenter} &ndash; 
 * specifies the orientation and position of the center point of a Quad layer type.
 * 
 * <p>The supplied direction is the vector perpendicular to the quad. The position is in real-world meters (not the application's virtual world, the physical
 * world the user is in) and is relative to the "zero" position set by {@link OVR#ovr_RecenterTrackingOrigin} unless the {@link OVR#ovrLayerFlag_HeadLocked} flag is
 * used.</p></li>
 * <li>{@code QuadSize} &ndash; width and height (respectively) of the quad in meters</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrLayerQuad {
    {@link OVRLayerHeader ovrLayerHeader} Header;
    ovrTextureSwapChain ColorTexture;
    {@link OVRRecti ovrRecti} Viewport;
    {@link OVRPosef ovrPosef} QuadPoseCenter;
    {@link OVRVector2f ovrVector2f} QuadSize;
}</code></pre>
 */
public class OVRLayerQuad extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		QUADPOSECENTER,
		QUADSIZE;

	static {
		Layout layout = __struct(
			__member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
			__member(POINTER_SIZE),
			__member(OVRRecti.SIZEOF, OVRRecti.ALIGNOF),
			__member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
			__member(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEADER = layout.offsetof(0);
		COLORTEXTURE = layout.offsetof(1);
		VIEWPORT = layout.offsetof(2);
		QUADPOSECENTER = layout.offsetof(3);
		QUADSIZE = layout.offsetof(4);
	}

	OVRLayerQuad(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRLayerQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerQuad(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
	public OVRLayerHeader Header() { return nHeader(address()); }
	/** Returns the value of the {@code ColorTexture} field. */
	public long ColorTexture() { return nColorTexture(address()); }
	/** Returns a {@link OVRRecti} view of the {@code Viewport} field. */
	public OVRRecti Viewport() { return nViewport(address()); }
	/** Returns a {@link OVRPosef} view of the {@code QuadPoseCenter} field. */
	public OVRPosef QuadPoseCenter() { return nQuadPoseCenter(address()); }
	/** Returns a {@link OVRVector2f} view of the {@code QuadSize} field. */
	public OVRVector2f QuadSize() { return nQuadSize(address()); }

	/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
	public OVRLayerQuad Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
	/** Sets the specified value to the {@code ColorTexture} field. */
	public OVRLayerQuad ColorTexture(long value) { nColorTexture(address(), value); return this; }
	/** Copies the specified {@link OVRRecti} to the {@code Viewport} field. */
	public OVRLayerQuad Viewport(OVRRecti value) { nViewport(address(), value); return this; }
	/** Copies the specified {@link OVRPosef} to the {@code QuadPoseCenter} field. */
	public OVRLayerQuad QuadPoseCenter(OVRPosef value) { nQuadPoseCenter(address(), value); return this; }
	/** Copies the specified {@link OVRVector2f} to the {@code QuadSize} field. */
	public OVRLayerQuad QuadSize(OVRVector2f value) { nQuadSize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerQuad set(
		OVRLayerHeader Header,
		long ColorTexture,
		OVRRecti Viewport,
		OVRPosef QuadPoseCenter,
		OVRVector2f QuadSize
	) {
		Header(Header);
		ColorTexture(ColorTexture);
		Viewport(Viewport);
		QuadPoseCenter(QuadPoseCenter);
		QuadSize(QuadSize);

		return this;
	}

	/** Unsafe version of {@link #set(OVRLayerQuad) set}. */
	public OVRLayerQuad nset(long struct) {
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
	public OVRLayerQuad set(OVRLayerQuad src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerQuad} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerQuad malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerQuad} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerQuad calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerQuad} instance allocated with {@link BufferUtils}. */
	public static OVRLayerQuad create() {
		return new OVRLayerQuad(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRLayerQuad} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRLayerQuad create(long address) {
		return address == NULL ? null : new OVRLayerQuad(address, null);
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRLayerQuad.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerQuad} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRLayerQuad mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRLayerQuad} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRLayerQuad callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerQuad} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerQuad mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerQuad} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerQuad callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Header}. */
	public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerQuad.HEADER); }
	/** Unsafe version of {@link #ColorTexture}. */
	public static long nColorTexture(long struct) { return memGetAddress(struct + OVRLayerQuad.COLORTEXTURE); }
	/** Unsafe version of {@link #Viewport}. */
	public static OVRRecti nViewport(long struct) { return OVRRecti.create(struct + OVRLayerQuad.VIEWPORT); }
	/** Unsafe version of {@link #QuadPoseCenter}. */
	public static OVRPosef nQuadPoseCenter(long struct) { return OVRPosef.create(struct + OVRLayerQuad.QUADPOSECENTER); }
	/** Unsafe version of {@link #QuadSize}. */
	public static OVRVector2f nQuadSize(long struct) { return OVRVector2f.create(struct + OVRLayerQuad.QUADSIZE); }

	/** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
	public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerQuad.HEADER, OVRLayerHeader.SIZEOF); }
	/** Unsafe version of {@link #ColorTexture(long) ColorTexture}. */
	public static void nColorTexture(long struct, long value) { memPutAddress(struct + OVRLayerQuad.COLORTEXTURE, checkPointer(value)); }
	/** Unsafe version of {@link #Viewport(OVRRecti) Viewport}. */
	public static void nViewport(long struct, OVRRecti value) { memCopy(value.address(), struct + OVRLayerQuad.VIEWPORT, OVRRecti.SIZEOF); }
	/** Unsafe version of {@link #QuadPoseCenter(OVRPosef) QuadPoseCenter}. */
	public static void nQuadPoseCenter(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRLayerQuad.QUADPOSECENTER, OVRPosef.SIZEOF); }
	/** Unsafe version of {@link #QuadSize(OVRVector2f) QuadSize}. */
	public static void nQuadSize(long struct, OVRVector2f value) { memCopy(value.address(), struct + OVRLayerQuad.QUADSIZE, OVRVector2f.SIZEOF); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + OVRLayerQuad.COLORTEXTURE));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link OVRLayerQuad} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerQuad, Buffer> {

		/**
		 * Creates a new {@link OVRLayerQuad.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerQuad#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected OVRLayerQuad newInstance(long address) {
			return new OVRLayerQuad(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
		public OVRLayerHeader Header() { return OVRLayerQuad.nHeader(address()); }
		/** Returns the value of the {@code ColorTexture} field. */
		public long ColorTexture() { return OVRLayerQuad.nColorTexture(address()); }
		/** Returns a {@link OVRRecti} view of the {@code Viewport} field. */
		public OVRRecti Viewport() { return OVRLayerQuad.nViewport(address()); }
		/** Returns a {@link OVRPosef} view of the {@code QuadPoseCenter} field. */
		public OVRPosef QuadPoseCenter() { return OVRLayerQuad.nQuadPoseCenter(address()); }
		/** Returns a {@link OVRVector2f} view of the {@code QuadSize} field. */
		public OVRVector2f QuadSize() { return OVRLayerQuad.nQuadSize(address()); }

		/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
		public OVRLayerQuad.Buffer Header(OVRLayerHeader value) { OVRLayerQuad.nHeader(address(), value); return this; }
		/** Sets the specified value to the {@code ColorTexture} field. */
		public OVRLayerQuad.Buffer ColorTexture(long value) { OVRLayerQuad.nColorTexture(address(), value); return this; }
		/** Copies the specified {@link OVRRecti} to the {@code Viewport} field. */
		public OVRLayerQuad.Buffer Viewport(OVRRecti value) { OVRLayerQuad.nViewport(address(), value); return this; }
		/** Copies the specified {@link OVRPosef} to the {@code QuadPoseCenter} field. */
		public OVRLayerQuad.Buffer QuadPoseCenter(OVRPosef value) { OVRLayerQuad.nQuadPoseCenter(address(), value); return this; }
		/** Copies the specified {@link OVRVector2f} to the {@code QuadSize} field. */
		public OVRLayerQuad.Buffer QuadSize(OVRVector2f value) { OVRLayerQuad.nQuadSize(address(), value); return this; }

	}

}