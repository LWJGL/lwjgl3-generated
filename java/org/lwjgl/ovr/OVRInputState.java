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
 * Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
 * their inputs are combined.
 */
public final class OVRInputState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TIMEINSECONDS,
		CONNECTEDCONTROLLERTYPES,
		BUTTONS,
		TOUCHES,
		INDEXTRIGGER,
		HANDTRIGGER,
		THUMBSTICK;

	static {
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		TIMEINSECONDS = offsets.get(0);
		CONNECTEDCONTROLLERTYPES = offsets.get(1);
		BUTTONS = offsets.get(2);
		TOUCHES = offsets.get(3);
		INDEXTRIGGER = offsets.get(4);
		HANDTRIGGER = offsets.get(5);
		THUMBSTICK = offsets.get(6);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRInputState(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRInputState} instance at the specified memory address. */
	public OVRInputState(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRInputState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRInputState(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public double getTimeInSeconds() { return ngetTimeInSeconds(address()); }
	public int getConnectedControllerTypes() { return ngetConnectedControllerTypes(address()); }
	public int getButtons() { return ngetButtons(address()); }
	public int getTouches() { return ngetTouches(address()); }
	public void getIndexTrigger(ByteBuffer IndexTrigger) { ngetIndexTrigger(address(), IndexTrigger); }
	public void getHandTrigger(ByteBuffer HandTrigger) { ngetHandTrigger(address(), HandTrigger); }
	public void getThumbstick(ByteBuffer Thumbstick) { ngetThumbstick(address(), Thumbstick); }
	public OVRVector2f getThumbstick(int index) { return ngetThumbstick(address(), index); }

	public OVRInputState setTimeInSeconds(double TimeInSeconds) { nsetTimeInSeconds(address(), TimeInSeconds); return this; }
	public OVRInputState setConnectedControllerTypes(int ConnectedControllerTypes) { nsetConnectedControllerTypes(address(), ConnectedControllerTypes); return this; }
	public OVRInputState setButtons(int Buttons) { nsetButtons(address(), Buttons); return this; }
	public OVRInputState setTouches(int Touches) { nsetTouches(address(), Touches); return this; }
	public OVRInputState setIndexTrigger(ByteBuffer IndexTrigger) { nsetIndexTrigger(address(), IndexTrigger); return this; }
	public OVRInputState setIndexTrigger(int index, float IndexTrigger) { nsetIndexTrigger(address(), index, IndexTrigger); return this; }
	public OVRInputState setHandTrigger(ByteBuffer HandTrigger) { nsetHandTrigger(address(), HandTrigger); return this; }
	public OVRInputState setHandTrigger(int index, float HandTrigger) { nsetHandTrigger(address(), index, HandTrigger); return this; }
	public OVRInputState setThumbstick(ByteBuffer Thumbstick) { nsetThumbstick(address(), Thumbstick); return this; }
	public OVRInputState setThumbstick(int index, OVRVector2f Thumbstick) { nsetThumbstick(address(), index, Thumbstick); return this; }

	/** Initializes this struct with the specified values. */
	public OVRInputState set(
		double TimeInSeconds,
		int ConnectedControllerTypes,
		int Buttons,
		int Touches,
		ByteBuffer IndexTrigger,
		ByteBuffer HandTrigger,
		ByteBuffer Thumbstick
	) {
		setTimeInSeconds(TimeInSeconds);
		setConnectedControllerTypes(ConnectedControllerTypes);
		setButtons(Buttons);
		setTouches(Touches);
		setIndexTrigger(IndexTrigger);
		setHandTrigger(HandTrigger);
		setThumbstick(Thumbstick);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRInputState nset(long struct) {
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
	public OVRInputState set(OVRInputState src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRInputState set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRInputState} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRInputState malloc() {
		return new OVRInputState(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRInputState} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRInputState calloc() {
		return new OVRInputState(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRInputState} instance allocated with {@link BufferUtils}. */
	public static OVRInputState create() {
		return new OVRInputState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static double ngetTimeInSeconds(long struct) { return memGetDouble(struct + TIMEINSECONDS); }
	public static double getTimeInSeconds(ByteBuffer struct) { return ngetTimeInSeconds(memAddress(struct)); }
	public static int ngetConnectedControllerTypes(long struct) { return memGetInt(struct + CONNECTEDCONTROLLERTYPES); }
	public static int getConnectedControllerTypes(ByteBuffer struct) { return ngetConnectedControllerTypes(memAddress(struct)); }
	public static int ngetButtons(long struct) { return memGetInt(struct + BUTTONS); }
	public static int getButtons(ByteBuffer struct) { return ngetButtons(memAddress(struct)); }
	public static int ngetTouches(long struct) { return memGetInt(struct + TOUCHES); }
	public static int getTouches(ByteBuffer struct) { return ngetTouches(memAddress(struct)); }
	public static void ngetIndexTrigger(long struct, ByteBuffer IndexTrigger) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(IndexTrigger, 2 * 4);
		memCopy(struct + INDEXTRIGGER, memAddress(IndexTrigger), IndexTrigger.remaining());
	}
	public static void getIndexTrigger(ByteBuffer struct, ByteBuffer IndexTrigger) { ngetIndexTrigger(memAddress(struct), IndexTrigger); }
	public static float ngetIndexTrigger(long struct, int index) { return memGetFloat(struct + INDEXTRIGGER + index * 4); }
	public static float getIndexTrigger(ByteBuffer struct, int index) { return ngetIndexTrigger(memAddress(struct), index); }
	public static void ngetHandTrigger(long struct, ByteBuffer HandTrigger) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandTrigger, 2 * 4);
		memCopy(struct + HANDTRIGGER, memAddress(HandTrigger), HandTrigger.remaining());
	}
	public static void getHandTrigger(ByteBuffer struct, ByteBuffer HandTrigger) { ngetHandTrigger(memAddress(struct), HandTrigger); }
	public static float ngetHandTrigger(long struct, int index) { return memGetFloat(struct + HANDTRIGGER + index * 4); }
	public static float getHandTrigger(ByteBuffer struct, int index) { return ngetHandTrigger(memAddress(struct), index); }
	public static void ngetThumbstick(long struct, ByteBuffer Thumbstick) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Thumbstick, 2 * OVRVector2f.SIZEOF);
		memCopy(struct + THUMBSTICK, memAddress(Thumbstick), Thumbstick.remaining());
	}
	public static void getThumbstick(ByteBuffer struct, ByteBuffer Thumbstick) { ngetThumbstick(memAddress(struct), Thumbstick); }
	public static OVRVector2f ngetThumbstick(long struct, int index) {
		return OVRVector2f.malloc().nset(struct + THUMBSTICK + index * OVRVector2f.SIZEOF);
	}
	public static OVRVector2f getThumbstick(ByteBuffer struct, int index) { return ngetThumbstick(memAddress(struct), index); }

	public static void nsetTimeInSeconds(long struct, double TimeInSeconds) { memPutDouble(struct + TIMEINSECONDS, TimeInSeconds); }
	public static void setTimeInSeconds(ByteBuffer struct, double TimeInSeconds) { nsetTimeInSeconds(memAddress(struct), TimeInSeconds); }
	public static void nsetConnectedControllerTypes(long struct, int ConnectedControllerTypes) { memPutInt(struct + CONNECTEDCONTROLLERTYPES, ConnectedControllerTypes); }
	public static void setConnectedControllerTypes(ByteBuffer struct, int ConnectedControllerTypes) { nsetConnectedControllerTypes(memAddress(struct), ConnectedControllerTypes); }
	public static void nsetButtons(long struct, int Buttons) { memPutInt(struct + BUTTONS, Buttons); }
	public static void setButtons(ByteBuffer struct, int Buttons) { nsetButtons(memAddress(struct), Buttons); }
	public static void nsetTouches(long struct, int Touches) { memPutInt(struct + TOUCHES, Touches); }
	public static void setTouches(ByteBuffer struct, int Touches) { nsetTouches(memAddress(struct), Touches); }
	public static void nsetIndexTrigger(long struct, ByteBuffer IndexTrigger) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(IndexTrigger, 2 * 4);
		}
		memCopy(memAddress(IndexTrigger), struct + INDEXTRIGGER, IndexTrigger.remaining());
	}
	public static void setIndexTrigger(ByteBuffer struct, ByteBuffer IndexTrigger) { nsetIndexTrigger(memAddress(struct), IndexTrigger); }
	public static void nsetIndexTrigger(long struct, int index, float IndexTrigger) { memPutFloat(struct + INDEXTRIGGER + index * 4, IndexTrigger); }
	public static void setIndexTrigger(ByteBuffer struct, int index, float IndexTrigger) { nsetIndexTrigger(memAddress(struct), index, IndexTrigger); }
	public static void nsetHandTrigger(long struct, ByteBuffer HandTrigger) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(HandTrigger, 2 * 4);
		}
		memCopy(memAddress(HandTrigger), struct + HANDTRIGGER, HandTrigger.remaining());
	}
	public static void setHandTrigger(ByteBuffer struct, ByteBuffer HandTrigger) { nsetHandTrigger(memAddress(struct), HandTrigger); }
	public static void nsetHandTrigger(long struct, int index, float HandTrigger) { memPutFloat(struct + HANDTRIGGER + index * 4, HandTrigger); }
	public static void setHandTrigger(ByteBuffer struct, int index, float HandTrigger) { nsetHandTrigger(memAddress(struct), index, HandTrigger); }
	public static void nsetThumbstick(long struct, ByteBuffer Thumbstick) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Thumbstick, 2 * OVRVector2f.SIZEOF);
		memCopy(memAddress(Thumbstick), struct + THUMBSTICK, Thumbstick.remaining());
	}
	public static void setThumbstick(ByteBuffer struct, ByteBuffer Thumbstick) { nsetThumbstick(memAddress(struct), Thumbstick); }
	public static void nsetThumbstick(long struct, int index, OVRVector2f Thumbstick) {
		memCopy(Thumbstick.address(), struct + THUMBSTICK + index * OVRVector2f.SIZEOF, OVRVector2f.SIZEOF);
	}
	public static void setThumbstick(ByteBuffer struct, int index, OVRVector2f Thumbstick) { nsetThumbstick(memAddress(struct), index, Thumbstick); }

	// -----------------------------------

	/** An array of {@link OVRInputState} structs. */
	public static final class Buffer extends StructBuffer<OVRInputState, Buffer> {

		/**
		 * Creates a new {@link OVRInputState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRInputState#SIZEOF}, and its mark will be undefined.
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
		protected OVRInputState newInstance(long address) {
			return new OVRInputState(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}