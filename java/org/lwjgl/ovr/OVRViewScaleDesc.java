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
 * Contains the data necessary to properly calculate position info for various layer types.
 * 
 * <ul>
 * <li>{@code HmdToEyeOffset} is the same value pair provided in {@link OVREyeRenderDesc}.</li>
 * <li>{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units.</li>
 * </ul>
 * 
 * <p>In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
 * {@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
 * units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code HmdToEyeOffset} &ndash; translation of each eye</li>
 * <li>{@code HmdSpaceToWorldScaleInMeters} &ndash; ratio of viewer units to meter units</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrViewScaleDesc {
    {@link OVRVector3f ovrVector3f}[2] HmdToEyeOffset;
    float HmdSpaceToWorldScaleInMeters;
}</code></pre>
 */
public class OVRViewScaleDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HMDTOEYEOFFSET,
		HMDSPACETOWORLDSCALEINMETERS;

	static {
		Layout layout = __struct(
			__array(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF, 2),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HMDTOEYEOFFSET = layout.offsetof(0);
		HMDSPACETOWORLDSCALEINMETERS = layout.offsetof(1);
	}

	OVRViewScaleDesc(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRViewScaleDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRViewScaleDesc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRVector3f}.Buffer view of the {@code HmdToEyeOffset} field. */
	public OVRVector3f.Buffer HmdToEyeOffset() { return nHmdToEyeOffset(address()); }
	/** Returns a {@link OVRVector3f} view of the struct at the specified index of the {@code HmdToEyeOffset} field. */
	public OVRVector3f HmdToEyeOffset(int index) { return nHmdToEyeOffset(address(), index); }
	/** Returns the value of the {@code HmdSpaceToWorldScaleInMeters} field. */
	public float HmdSpaceToWorldScaleInMeters() { return nHmdSpaceToWorldScaleInMeters(address()); }

	/** Copies the specified {@link OVRVector3f.Buffer} to the {@code HmdToEyeOffset} field. */
	public OVRViewScaleDesc HmdToEyeOffset(OVRVector3f.Buffer value) { nHmdToEyeOffset(address(), value); return this; }
	/** Copies the specified {@link OVRVector3f} at the specified index of the {@code HmdToEyeOffset} field. */
	public OVRViewScaleDesc HmdToEyeOffset(int index, OVRVector3f value) { nHmdToEyeOffset(address(), index, value); return this; }
	/** Sets the specified value to the {@code HmdSpaceToWorldScaleInMeters} field. */
	public OVRViewScaleDesc HmdSpaceToWorldScaleInMeters(float value) { nHmdSpaceToWorldScaleInMeters(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRViewScaleDesc set(
		OVRVector3f.Buffer HmdToEyeOffset,
		float HmdSpaceToWorldScaleInMeters
	) {
		HmdToEyeOffset(HmdToEyeOffset);
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

	// -----------------------------------

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRViewScaleDesc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRViewScaleDesc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link BufferUtils}. */
	public static OVRViewScaleDesc create() {
		return new OVRViewScaleDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRViewScaleDesc create(long address) {
		return address == NULL ? null : new OVRViewScaleDesc(address, null);
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRViewScaleDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRViewScaleDesc} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRViewScaleDesc mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRViewScaleDesc callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRViewScaleDesc mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRViewScaleDesc callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #HmdToEyeOffset}. */
	public static OVRVector3f.Buffer nHmdToEyeOffset(long struct) {
		return OVRVector3f.create(struct + OVRViewScaleDesc.HMDTOEYEOFFSET, 2);
	}
	/** Unsafe version of {@link #HmdToEyeOffset(int) HmdToEyeOffset}. */
	public static OVRVector3f nHmdToEyeOffset(long struct, int index) {
		return OVRVector3f.create(struct + OVRViewScaleDesc.HMDTOEYEOFFSET + index * OVRVector3f.SIZEOF);
	}
	/** Unsafe version of {@link #HmdSpaceToWorldScaleInMeters}. */
	public static float nHmdSpaceToWorldScaleInMeters(long struct) { return memGetFloat(struct + OVRViewScaleDesc.HMDSPACETOWORLDSCALEINMETERS); }

	/** Unsafe version of {@link #HmdToEyeOffset(OVRVector3f.Buffer) HmdToEyeOffset}. */
	public static void nHmdToEyeOffset(long struct, OVRVector3f.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRViewScaleDesc.HMDTOEYEOFFSET, value.remaining() * OVRVector3f.SIZEOF);
	}
	/** Unsafe version of {@link #HmdToEyeOffset(int, OVRVector3f) HmdToEyeOffset}. */
	public static void nHmdToEyeOffset(long struct, int index, OVRVector3f value) { memCopy(value.address(), struct + OVRViewScaleDesc.HMDTOEYEOFFSET + index * OVRVector3f.SIZEOF, OVRVector3f.SIZEOF); }
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
		protected OVRViewScaleDesc newInstance(long address) {
			return new OVRViewScaleDesc(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRVector3f}.Buffer view of the {@code HmdToEyeOffset} field. */
		public OVRVector3f.Buffer HmdToEyeOffset() { return OVRViewScaleDesc.nHmdToEyeOffset(address()); }
		/** Returns a {@link OVRVector3f} view of the struct at the specified index of the {@code HmdToEyeOffset} field. */
		public OVRVector3f HmdToEyeOffset(int index) { return OVRViewScaleDesc.nHmdToEyeOffset(address(), index); }
		/** Returns the value of the {@code HmdSpaceToWorldScaleInMeters} field. */
		public float HmdSpaceToWorldScaleInMeters() { return OVRViewScaleDesc.nHmdSpaceToWorldScaleInMeters(address()); }

		/** Copies the specified {@link OVRVector3f.Buffer} to the {@code HmdToEyeOffset} field. */
		public OVRViewScaleDesc.Buffer HmdToEyeOffset(OVRVector3f.Buffer value) { OVRViewScaleDesc.nHmdToEyeOffset(address(), value); return this; }
		/** Copies the specified {@link OVRVector3f} at the specified index of the {@code HmdToEyeOffset} field. */
		public OVRViewScaleDesc.Buffer HmdToEyeOffset(int index, OVRVector3f value) { OVRViewScaleDesc.nHmdToEyeOffset(address(), index, value); return this; }
		/** Sets the specified value to the {@code HmdSpaceToWorldScaleInMeters} field. */
		public OVRViewScaleDesc.Buffer HmdSpaceToWorldScaleInMeters(float value) { OVRViewScaleDesc.nHmdSpaceToWorldScaleInMeters(address(), value); return this; }

	}

}