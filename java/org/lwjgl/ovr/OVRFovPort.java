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
 * Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
 * <pre><code style="font-family: monospace">
 * { UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }</code></pre>.
 * 
 * <h3>ovrFovPort members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>UpTan</td><td class="nw">float</td><td>the tangent of the angle between the viewing vector and the top edge of the field of view</td></tr>
 * <tr><td>DownTan</td><td class="nw">float</td><td>the tangent of the angle between the viewing vector and the bottom edge of the field of view</td></tr>
 * <tr><td>LeftTan</td><td class="nw">float</td><td>the tangent of the angle between the viewing vector and the left edge of the field of view</td></tr>
 * <tr><td>RightTan</td><td class="nw">float</td><td>the tangent of the angle between the viewing vector and the right edge of the field of view</td></tr>
 * </table>
 */
public class OVRFovPort extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		UPTAN,
		DOWNTAN,
		LEFTTAN,
		RIGHTTAN;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		UPTAN = layout.offsetof(0);
		DOWNTAN = layout.offsetof(1);
		LEFTTAN = layout.offsetof(2);
		RIGHTTAN = layout.offsetof(3);
	}

	OVRFovPort(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRFovPort} instance at the specified memory address. */
	public OVRFovPort(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRFovPort} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRFovPort(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code UpTan} field. */
	public float UpTan() { return nUpTan(address()); }
	/** Returns the value of the {@code DownTan} field. */
	public float DownTan() { return nDownTan(address()); }
	/** Returns the value of the {@code LeftTan} field. */
	public float LeftTan() { return nLeftTan(address()); }
	/** Returns the value of the {@code RightTan} field. */
	public float RightTan() { return nRightTan(address()); }

	/** Sets the specified value to the {@code UpTan} field. */
	public OVRFovPort UpTan(float value) { nUpTan(address(), value); return this; }
	/** Sets the specified value to the {@code DownTan} field. */
	public OVRFovPort DownTan(float value) { nDownTan(address(), value); return this; }
	/** Sets the specified value to the {@code LeftTan} field. */
	public OVRFovPort LeftTan(float value) { nLeftTan(address(), value); return this; }
	/** Sets the specified value to the {@code RightTan} field. */
	public OVRFovPort RightTan(float value) { nRightTan(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRFovPort set(
		float UpTan,
		float DownTan,
		float LeftTan,
		float RightTan
	) {
		UpTan(UpTan);
		DownTan(DownTan);
		LeftTan(LeftTan);
		RightTan(RightTan);

		return this;
	}

	/** Unsafe version of {@link #set(OVRFovPort) set}. */
	public OVRFovPort nset(long struct) {
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
	public OVRFovPort set(OVRFovPort src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRFovPort) set}. */
	public OVRFovPort set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRFovPort} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRFovPort malloc() {
		return new OVRFovPort(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRFovPort calloc() {
		return new OVRFovPort(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance allocated with {@link BufferUtils}. */
	public static OVRFovPort create() {
		return new OVRFovPort(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRFovPort.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #UpTan}. */
	public static float nUpTan(long struct) { return memGetFloat(struct + OVRFovPort.UPTAN); }
	/** Unsafe version of {@link #DownTan}. */
	public static float nDownTan(long struct) { return memGetFloat(struct + OVRFovPort.DOWNTAN); }
	/** Unsafe version of {@link #LeftTan}. */
	public static float nLeftTan(long struct) { return memGetFloat(struct + OVRFovPort.LEFTTAN); }
	/** Unsafe version of {@link #RightTan}. */
	public static float nRightTan(long struct) { return memGetFloat(struct + OVRFovPort.RIGHTTAN); }

	/** Unsafe version of {@link #UpTan(float) UpTan}. */
	public static void nUpTan(long struct, float value) { memPutFloat(struct + OVRFovPort.UPTAN, value); }
	/** Unsafe version of {@link #DownTan(float) DownTan}. */
	public static void nDownTan(long struct, float value) { memPutFloat(struct + OVRFovPort.DOWNTAN, value); }
	/** Unsafe version of {@link #LeftTan(float) LeftTan}. */
	public static void nLeftTan(long struct, float value) { memPutFloat(struct + OVRFovPort.LEFTTAN, value); }
	/** Unsafe version of {@link #RightTan(float) RightTan}. */
	public static void nRightTan(long struct, float value) { memPutFloat(struct + OVRFovPort.RIGHTTAN, value); }

	// -----------------------------------

	/** An array of {@link OVRFovPort} structs. */
	public static final class Buffer extends StructBuffer<OVRFovPort, Buffer> {

		/**
		 * Creates a new {@link OVRFovPort.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRFovPort#SIZEOF}, and its mark will be undefined.
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
		protected OVRFovPort newInstance(long address) {
			return new OVRFovPort(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code UpTan} field. */
		public float UpTan() { return nUpTan(address()); }
		/** Returns the value of the {@code DownTan} field. */
		public float DownTan() { return nDownTan(address()); }
		/** Returns the value of the {@code LeftTan} field. */
		public float LeftTan() { return nLeftTan(address()); }
		/** Returns the value of the {@code RightTan} field. */
		public float RightTan() { return nRightTan(address()); }

		/** Sets the specified value to the {@code UpTan} field. */
		public OVRFovPort.Buffer UpTan(float value) { nUpTan(address(), value); return this; }
		/** Sets the specified value to the {@code DownTan} field. */
		public OVRFovPort.Buffer DownTan(float value) { nDownTan(address(), value); return this; }
		/** Sets the specified value to the {@code LeftTan} field. */
		public OVRFovPort.Buffer LeftTan(float value) { nLeftTan(address(), value); return this; }
		/** Sets the specified value to the {@code RightTan} field. */
		public OVRFovPort.Buffer RightTan(float value) { nRightTan(address(), value); return this; }

	}

}