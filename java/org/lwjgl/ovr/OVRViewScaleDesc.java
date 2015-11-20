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
 * Contains the data necessary to properly calculate position info for various layer types.
 * <ul>
 * <li>{@code HmdToEyeViewOffset} is the same value pair provided in {@link OVREyeRenderDesc}.</li>
 * <li>{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units.</li>
 * </ul>
 * In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
 * {@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
 * units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.
 * 
 * <h3>ovrViewScaleDesc members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>HmdToEyeViewOffset</td><td class="nw">ovrVector3f[2]</td><td>translation of each eye</td></tr>
 * <tr><td>HmdSpaceToWorldScaleInMeters</td><td class="nw">float</td><td>ratio of viewer units to meter units</td></tr>
 * </table>
 */
public class OVRViewScaleDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HMDTOEYEVIEWOFFSET,
		HMDSPACETOWORLDSCALEINMETERS;

	static {
		Layout layout = __struct(
			__array(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT, 2),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HMDTOEYEVIEWOFFSET = layout.offsetof(0);
		HMDSPACETOWORLDSCALEINMETERS = layout.offsetof(1);
	}

	OVRViewScaleDesc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRViewScaleDesc} instance at the specified memory address. */
	public OVRViewScaleDesc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRViewScaleDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRViewScaleDesc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRVector3f}.Buffer view of the {@code HmdToEyeViewOffset} field. */
	public OVRVector3f.Buffer HmdToEyeViewOffset() { return nHmdToEyeViewOffset(address()); }
	/** Returns a {@link OVRVector3f} view of the struct at the specified index of the {@code HmdToEyeViewOffset} field. */
	public OVRVector3f HmdToEyeViewOffset(int index) { return nHmdToEyeViewOffset(address(), index); }
	/** Returns the value of the {@code HmdSpaceToWorldScaleInMeters} field. */
	public float HmdSpaceToWorldScaleInMeters() { return nHmdSpaceToWorldScaleInMeters(address()); }

	/** Copies the specified {@link OVRVector3f.Buffer} to the {@code HmdToEyeViewOffset} field. */
	public OVRViewScaleDesc HmdToEyeViewOffset(OVRVector3f.Buffer value) { nHmdToEyeViewOffset(address(), value); return this; }
	/** Copies the specified {@link OVRVector3f} at the specified index of the {@code HmdToEyeViewOffset} field. */
	public OVRViewScaleDesc HmdToEyeViewOffset(int index, OVRVector3f value) { nHmdToEyeViewOffset(address(), index, value); return this; }
	/** Sets the specified value to the {@code HmdSpaceToWorldScaleInMeters} field. */
	public OVRViewScaleDesc HmdSpaceToWorldScaleInMeters(float value) { nHmdSpaceToWorldScaleInMeters(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRViewScaleDesc set(
		OVRVector3f.Buffer HmdToEyeViewOffset,
		float HmdSpaceToWorldScaleInMeters
	) {
		HmdToEyeViewOffset(HmdToEyeViewOffset);
		HmdSpaceToWorldScaleInMeters(HmdSpaceToWorldScaleInMeters);

		return this;
	}

	/** Unsafe version of {@link #set(OVRViewScaleDesc) set}. */
	public OVRViewScaleDesc nset(long struct) {
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
	public OVRViewScaleDesc set(OVRViewScaleDesc src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRViewScaleDesc) set}. */
	public OVRViewScaleDesc set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRViewScaleDesc malloc() {
		return new OVRViewScaleDesc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRViewScaleDesc calloc() {
		return new OVRViewScaleDesc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link BufferUtils}. */
	public static OVRViewScaleDesc create() {
		return new OVRViewScaleDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRViewScaleDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #HmdToEyeViewOffset}. */
	public static OVRVector3f.Buffer nHmdToEyeViewOffset(long struct) {
		return OVRVector3f.createBuffer(struct + OVRViewScaleDesc.HMDTOEYEVIEWOFFSET, 2);
	}
	/** Unsafe version of {@link #HmdToEyeViewOffset(int) HmdToEyeViewOffset}. */
	public static OVRVector3f nHmdToEyeViewOffset(long struct, int index) {
		return new OVRVector3f(struct + OVRViewScaleDesc.HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF);
	}
	/** Unsafe version of {@link #HmdSpaceToWorldScaleInMeters}. */
	public static float nHmdSpaceToWorldScaleInMeters(long struct) { return memGetFloat(struct + OVRViewScaleDesc.HMDSPACETOWORLDSCALEINMETERS); }

	/** Unsafe version of {@link #HmdToEyeViewOffset(OVRVector3f.Buffer) HmdToEyeViewOffset}. */
	public static void nHmdToEyeViewOffset(long struct, OVRVector3f.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRViewScaleDesc.HMDTOEYEVIEWOFFSET, value.remaining() * OVRVector3f.SIZEOF);
	}
	/** Unsafe version of {@link #HmdToEyeViewOffset(int, OVRVector3f) HmdToEyeViewOffset}. */
	public static void nHmdToEyeViewOffset(long struct, int index, OVRVector3f value) { memCopy(value.address(), struct + OVRViewScaleDesc.HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF, OVRVector3f.SIZEOF); }
	/** Unsafe version of {@link #HmdSpaceToWorldScaleInMeters(float) HmdSpaceToWorldScaleInMeters}. */
	public static void nHmdSpaceToWorldScaleInMeters(long struct, float value) { memPutFloat(struct + OVRViewScaleDesc.HMDSPACETOWORLDSCALEINMETERS, value); }

	// -----------------------------------

	/** An array of {@link OVRViewScaleDesc} structs. */
	public static final class Buffer extends StructBuffer<OVRViewScaleDesc, Buffer> {

		/**
		 * Creates a new {@link OVRViewScaleDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRViewScaleDesc#SIZEOF}, and its mark will be undefined.
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
		protected OVRViewScaleDesc newInstance(long address) {
			return new OVRViewScaleDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRVector3f}.Buffer view of the {@code HmdToEyeViewOffset} field. */
		public OVRVector3f.Buffer HmdToEyeViewOffset() { return nHmdToEyeViewOffset(address()); }
		/** Returns a {@link OVRVector3f} view of the struct at the specified index of the {@code HmdToEyeViewOffset} field. */
		public OVRVector3f HmdToEyeViewOffset(int index) { return nHmdToEyeViewOffset(address(), index); }
		/** Returns the value of the {@code HmdSpaceToWorldScaleInMeters} field. */
		public float HmdSpaceToWorldScaleInMeters() { return nHmdSpaceToWorldScaleInMeters(address()); }

		/** Copies the specified {@link OVRVector3f.Buffer} to the {@code HmdToEyeViewOffset} field. */
		public OVRViewScaleDesc.Buffer HmdToEyeViewOffset(OVRVector3f.Buffer value) { nHmdToEyeViewOffset(address(), value); return this; }
		/** Copies the specified {@link OVRVector3f} at the specified index of the {@code HmdToEyeViewOffset} field. */
		public OVRViewScaleDesc.Buffer HmdToEyeViewOffset(int index, OVRVector3f value) { nHmdToEyeViewOffset(address(), index, value); return this; }
		/** Sets the specified value to the {@code HmdSpaceToWorldScaleInMeters} field. */
		public OVRViewScaleDesc.Buffer HmdSpaceToWorldScaleInMeters(float value) { nHmdSpaceToWorldScaleInMeters(address(), value); return this; }

	}

}